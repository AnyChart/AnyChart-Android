package com.anychart.core

import android.os.SystemClock
import android.util.Log
import android.view.MotionEvent
import android.widget.FrameLayout
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference

/**
 * The Android half of the conformance set: the same configs the Playwright gate renders in
 * Chromium, rendered here inside a real WebView through AnyChartView. The configs come from
 * conformance/configs via the androidTest assets source set.
 */
@RunWith(AndroidJUnit4::class)
class RuntimeConformanceTest {

    private val testAssets get() = InstrumentationRegistry.getInstrumentation().context.assets
    private fun config(name: String) = testAssets.open(name).bufferedReader().use { it.readText() }
    private fun configNames() = testAssets.list("")!!.filter { it.endsWith(".json") }.sorted()

    private class Recorder : AnyChartView.Listener {
        val ready = CountDownLatch(1)
        val rendered = HashMap<String, CountDownLatch>()
        val errors = ArrayList<String>()
        val jsVersion = AtomicReference<String>()
        fun expectRendered(id: String) = CountDownLatch(1).also { rendered[id] = it }
        override fun onReady(jsVersion: String) { this.jsVersion.set(jsVersion); ready.countDown() }
        override fun onRendered(chartId: String, millis: Long) { rendered[chartId]?.countDown() }
        override fun onError(error: AnyChartError) { errors.add(error.toString()) }
    }

    private fun withView(block: (AnyChartView, Recorder) -> Unit) {
        ActivityScenario.launch(HostActivity::class.java).use { scenario ->
            val view = AtomicReference<AnyChartView>()
            val recorder = Recorder()
            scenario.onActivity { activity ->
                view.set(AnyChartView(activity).also {
                    it.listener = recorder
                    activity.root.addView(it, FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT))
                })
            }
            block(view.get(), recorder)
        }
    }

    private fun onMain(block: () -> Unit) = InstrumentationRegistry.getInstrumentation().runOnMainSync(block)
    private fun <T> onMainGet(block: () -> T): T = AtomicReference<T>().also { r -> onMain { r.set(block()) } }.get()

    private fun tap(view: AnyChartView, x: Float, y: Float) {
        val t = SystemClock.uptimeMillis()
        view.dispatchTouchEvent(MotionEvent.obtain(t, t, MotionEvent.ACTION_DOWN, x, y, 0).also { it.source = android.view.InputDevice.SOURCE_TOUCHSCREEN })
        view.dispatchTouchEvent(MotionEvent.obtain(t, t + 50, MotionEvent.ACTION_UP, x, y, 0).also { it.source = android.view.InputDevice.SOURCE_TOUCHSCREEN })
    }

    @Test
    fun pageAnnouncesTheBundledJsVersion() = withView { view, rec ->
        onMain { view.warmUp() }
        assertTrue("ready never arrived; errors: ${rec.errors}", rec.ready.await(20, TimeUnit.SECONDS))
        assertTrue("jsVersion ${rec.jsVersion.get()}", rec.jsVersion.get().startsWith("9.0.0"))
        assertEquals("1.0.0", onMainGet { view.runtimeVersion })
        assertEquals(emptyList<String>(), rec.errors)
    }

    @Test
    fun everyConformanceConfigRendersWithoutError() = withView { view, rec ->
        val names = configNames()
        assertTrue("no configs found in test assets", names.isNotEmpty())
        for (name in names) {
            val id = name.removeSuffix(".json")
            val done = rec.expectRendered(id)
            onMain { view.load(config(name), chartId = id) }
            assertTrue("$id did not render in 20s; errors: ${rec.errors}", done.await(20, TimeUnit.SECONDS))
            onMain { view.dispose(id) }
        }
        assertEquals(emptyList<String>(), rec.errors)
    }

    @Test
    fun twoChartsInOneViewRenderIndependently() = withView { view, rec ->
        val top = rec.expectRendered("top")
        val bottom = rec.expectRendered("bottom")
        onMain {
            view.load(config("pie.json"), chartId = "top", rect = ChartRect(0, 0, 360, 300))
            view.load(config("column.json"), chartId = "bottom", rect = ChartRect(0, 300, 360, 300))
        }
        assertTrue("top: ${rec.errors}", top.await(20, TimeUnit.SECONDS))
        assertTrue("bottom: ${rec.errors}", bottom.await(20, TimeUnit.SECONDS))
        assertEquals(emptyList<String>(), rec.errors)
    }

    /**
     * INTEG-5: a Kotlin lambda answers the engine's format functions over the synchronous channel.
     * Two-node sankey so the left node spans the view's height and a tap in the left column hits it.
     */
    @Test
    fun aKotlinLambdaFormatsSankeyLabelsAndTooltip() = withView { view, rec ->
        val labelCalls = AtomicInteger()
        val config = """{"chart":{"type":"sankey","data":[["Coal","Power",10]],"padding":[20,40,20,40],"nodeWidth":60,
            "node":{"normal":{"labels":{"format":{"${'$'}fn":"label"}}},"tooltip":{"format":{"${'$'}fn":"tip"}}}}}"""
        val done = rec.expectRendered("cb")
        onMain {
            view.load(config, chartId = "cb", callbacks = mapOf(
                "label" to { ctx -> labelCalls.incrementAndGet(); ctx.optString("name").uppercase() },
                "tip" to { ctx -> "Tooltip for ${ctx.optString("name")} (${ctx.optInt("value")})" },
            ))
        }
        assertTrue("sankey did not render; errors: ${rec.errors}", done.await(20, TimeUnit.SECONDS))
        assertEquals(emptyList<String>(), rec.errors)
        assertEquals("one label per node", 2, labelCalls.get())
        val report = onMainGet { view.renderReport("cb") }!!
        assertTrue(report.toString(), report.callbackCalls >= 2)
        Log.i("INTEG-5", "bridge round trip on device: $report")

        // tap the left node: padding 40 + nodeWidth / 2 CSS px, mid height
        val density = view.resources.displayMetrics.density
        onMain { tap(view, 70 * density, view.height / 2f) }
        Thread.sleep(600)
        val answer = CountDownLatch(1)
        val text = AtomicReference<Any?>()
        onMain { view.query("tooltipText", chartId = "cb") { text.set(it); answer.countDown() } }
        assertTrue("no answer: ${rec.errors}", answer.await(20, TimeUnit.SECONDS))
        // the SVG tooltip's text runs title and body together: "Coal (10)Tooltip for Coal (10)"
        assertTrue("tooltip text: ${text.get()}", text.get().toString().contains("Tooltip for Coal (10)"))
    }

    @Test
    fun updateThenQueryReturnsTheNewData() = withView { view, rec ->
        val done = rec.expectRendered("u")
        onMain { view.load(config("pie.json"), chartId = "u") }
        assertTrue(done.await(20, TimeUnit.SECONDS))
        val answer = CountDownLatch(1)
        val result = AtomicReference<String>()
        onMain {
            view.update("""[{"x":"Only one","value":1}]""", chartId = "u")
            view.query("json", chartId = "u") { result.set(it.toString()); answer.countDown() }
        }
        assertTrue("no answer: ${rec.errors}", answer.await(20, TimeUnit.SECONDS))
        assertNotNull(result.get())
        assertTrue(result.get().contains("Only one"))
        assertTrue(!result.get().contains("Apples"))
    }
}
