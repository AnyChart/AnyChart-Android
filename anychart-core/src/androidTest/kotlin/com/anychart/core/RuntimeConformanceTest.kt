package com.anychart.core

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
        override fun onError(chartId: String?, message: String) { errors.add("$chartId: $message") }
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

    @Test
    fun pageAnnouncesTheBundledJsVersion() = withView { view, rec ->
        onMain { view.warmUp() }
        assertTrue("ready never arrived; errors: ${rec.errors}", rec.ready.await(20, TimeUnit.SECONDS))
        assertTrue("jsVersion ${rec.jsVersion.get()}", rec.jsVersion.get().startsWith("9.0.0"))
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
