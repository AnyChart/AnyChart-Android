package com.anychart.core

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.json.JSONObject
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

/**
 * INTEG-7: the view through the Android lifecycle, one scenario per test, plus the threading rule
 * and the typed error surface, on a real device.
 */
@RunWith(AndroidJUnit4::class)
class LifecycleTest {

    private val testAssets get() = InstrumentationRegistry.getInstrumentation().context.assets
    private fun config(name: String) = testAssets.open(name).bufferedReader().use { it.readText() }
    private fun onMain(block: () -> Unit) = InstrumentationRegistry.getInstrumentation().runOnMainSync(block)
    private fun <T> onMainGet(block: () -> T): T = AtomicReference<T>().also { r -> onMain { r.set(block()) } }.get()

    private class Recorder : AnyChartView.Listener {
        val rendered = HashMap<String, CountDownLatch>()
        val errors = ArrayList<AnyChartError>()
        fun expectRendered(id: String) = CountDownLatch(1).also { rendered[id] = it }
        override fun onRendered(chartId: String, millis: Long) { rendered[chartId]?.countDown() }
        override fun onError(error: AnyChartError) { errors.add(error) }
    }

    @After fun clearListener() { ChartActivity.listener = null }

    private fun await(latch: CountDownLatch, what: String, rec: Recorder) =
        assertTrue("$what did not happen in 20s; errors: ${rec.errors}", latch.await(20, TimeUnit.SECONDS))

    private fun <T> answer(block: ((T) -> Unit) -> Unit): T {
        val latch = CountDownLatch(1)
        val out = AtomicReference<T>()
        onMain { block { out.set(it); latch.countDown() } }
        assertTrue("no answer in 20s", latch.await(20, TimeUnit.SECONDS))
        return out.get()
    }

    @Test
    fun recreationRestoresTheLoadedChart() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("pie.json")) }
            await(first, "first render", rec)
            // rotation and process death both go through saved instance state and a new Activity
            val again = rec.expectRendered("chart")
            scenario.recreate()
            await(again, "render after recreate", rec)
            val json = answer<JSONObject> { cb -> scenario.onActivity { it.chart.chartJson(callback = cb) } }
            assertEquals("pie", json.getJSONObject("chart").getString("type"))
            assertEquals(emptyList<AnyChartError>(), rec.errors)
        }
    }

    @Test
    fun savedStateCanBeTurnedOff() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.savesState = false; it.chart.load(config("pie.json")) }
            await(first, "first render", rec)
            val again = rec.expectRendered("chart")
            scenario.recreate()
            assertTrue("a chart was reloaded although savesState is off", !again.await(3, TimeUnit.SECONDS))
        }
    }

    @Test
    fun detachAndReattachKeepsTheChartAlive() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("pie.json")) }
            await(first, "first render", rec)
            scenario.onActivity { a -> (a.chart.parent as android.view.ViewGroup).removeView(a.chart) }
            scenario.onActivity { a -> a.setContentView(a.chart) }
            scenario.onActivity { it.chart.update(listOf(mapOf("x" to "After reattach", "value" to 1))) }
            val json = answer<JSONObject> { cb -> scenario.onActivity { it.chart.chartJson(callback = cb) } }
            assertTrue(json.toString().contains("After reattach"))
            assertEquals(emptyList<AnyChartError>(), rec.errors)
        }
    }

    @Test
    fun backgroundAndForegroundKeepTheChartResponsive() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("column.json")) }
            await(first, "first render", rec)
            scenario.moveToState(Lifecycle.State.CREATED)   // backgrounded
            scenario.moveToState(Lifecycle.State.RESUMED)   // back
            scenario.onActivity { it.chart.update(listOf(mapOf("x" to "Back", "value" to 7)), series = 0) }
            val json = answer<JSONObject> { cb -> scenario.onActivity { it.chart.chartJson(callback = cb) } }
            assertTrue(json.toString().contains("Back"))
            assertEquals(emptyList<AnyChartError>(), rec.errors)
        }
    }

    @Test
    fun recyclingRebindsTheSameView() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("pie.json")) }
            await(first, "first bind", rec)
            val second = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("column.json")) }  // same id: the page disposes the old chart
            await(second, "rebind", rec)
            val json = answer<JSONObject> { cb -> scenario.onActivity { it.chart.chartJson(callback = cb) } }
            assertEquals("column", json.getJSONObject("chart").getString("type"))
            assertEquals(emptyList<AnyChartError>(), rec.errors)
        }
    }

    @Test
    fun callsOffTheMainThreadThrow() {
        ChartActivity.listener = Recorder()
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val view = onMainGet { AtomicReference<AnyChartView>().also { r -> scenario.onActivity { a -> r.set(a.chart) } }.get() }
            try {
                view.load(config("pie.json"))   // the instrumentation thread, not main
                fail("load off the main thread did not throw")
            } catch (e: IllegalStateException) {
                assertTrue(e.message!!, e.message!!.contains("main thread"))
            }
        }
    }

    @Test
    fun everyRuntimeFailureArrivesTyped() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val ok = rec.expectRendered("ok")
            scenario.onActivity {
                it.chart.load("""{"chart":{"type":"no-such-chart"}}""", chartId = "bad")
                it.chart.update("[]", chartId = "ghost")
                it.chart.load("""{"chart":{"type":"pie","data":[{"x":"a","value":1}],"labels":{"format":{"${'$'}fn":"missing"}}}}""", chartId = "ok")
            }
            await(ok, "chart with a missing callback still renders", rec)
            Thread.sleep(500)
            val types = rec.errors.map { it::class.java.simpleName to it.chartId }
            assertTrue(types.toString(), types.contains("BadConfig" to "bad"))
            assertTrue(types.toString(), types.contains("UnknownChart" to "ghost"))
            assertTrue(types.toString(), types.contains("Callback" to "ok"))
        }
    }

    @Test
    fun typedQueriesAnswer() {
        val rec = Recorder()
        ChartActivity.listener = rec
        ActivityScenario.launch(ChartActivity::class.java).use { scenario ->
            val first = rec.expectRendered("chart")
            scenario.onActivity { it.chart.load(config("column.json")) }
            await(first, "render", rec)
            val selected = answer<List<SelectedPoint>> { cb -> scenario.onActivity { it.chart.selectedPoints(callback = cb) } }
            assertEquals(emptyList<SelectedPoint>(), selected)
            val json = answer<JSONObject> { cb -> scenario.onActivity { it.chart.chartJson(callback = cb) } }
            assertNotNull(json.optJSONObject("chart"))
            val report = onMainGet { AtomicReference<RenderReport?>().also { r -> scenario.onActivity { a -> r.set(a.chart.renderReport()) } }.get() }
            assertNotNull(report)
        }
    }
}
