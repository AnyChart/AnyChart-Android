package com.anychart.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.click
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTouchInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartEvent
import com.anychart.dsl.generated.pie
import com.anychart.dsl.point
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference

/** INTEG-8: the Compose entry point under the Compose test rule, on a device. */
@RunWith(AndroidJUnit4::class)
class ComposeEntryTest {
    @get:Rule val rule = createComposeRule()

    private fun config(name: String) = InstrumentationRegistry.getInstrumentation().context.assets.open(name).bufferedReader().use { it.readText() }
    private val errors = java.util.Collections.synchronizedList(ArrayList<AnyChartError>())
    private fun awaitRenders(renders: AtomicInteger, n: Int) =
        rule.waitUntil(timeoutMillis = 20_000) { renders.get() >= n }

    @Test
    fun sameConfigRecomposedLoadsOnce() {
        val renders = AtomicInteger()
        var tick by mutableStateOf(0)
        rule.setContent {
            Column(Modifier.fillMaxSize()) {
                BasicText("tick $tick")
                AnyChart(config = config("pie.json"), modifier = Modifier.weight(1f).fillMaxWidth(), onRendered = { renders.incrementAndGet() }, onError = { errors.add(it) })
            }
        }
        awaitRenders(renders, 1)
        repeat(3) { tick++; rule.waitForIdle() }
        Thread.sleep(1500)
        assertEquals("recomposition with the same config must not reload", 1, renders.get())
        assertEquals(emptyList<AnyChartError>(), errors)
    }

    @Test
    fun newConfigLoadsAgainIntoTheSameView() {
        val renders = AtomicInteger()
        var name by mutableStateOf("pie.json")
        rule.setContent {
            AnyChart(config = config(name), modifier = Modifier.fillMaxSize(), onRendered = { renders.incrementAndGet() }, onError = { errors.add(it) })
        }
        awaitRenders(renders, 1)
        name = "column.json"
        awaitRenders(renders, 2)
        assertEquals(2, renders.get())
        assertEquals(emptyList<AnyChartError>(), errors)
    }

    @Test
    fun aDslDocumentRebuiltOnEveryRecompositionLoadsOnce() {
        val renders = AtomicInteger()
        var tick by mutableStateOf(0)
        rule.setContent {
            Column(Modifier.fillMaxSize()) {
                BasicText("tick $tick")
                // built anew each recomposition: equal content, so no reload
                AnyChart(chart = pie { title("Fruits"); data(listOf(point("Apples", 3), point("Pears", 2))) }, modifier = Modifier.weight(1f).fillMaxWidth(), onRendered = { renders.incrementAndGet() }, onError = { errors.add(it) })
            }
        }
        awaitRenders(renders, 1)
        repeat(3) { tick++; rule.waitForIdle() }
        Thread.sleep(1500)
        assertEquals(1, renders.get())
    }

    @Test
    fun aPointClickReachesTheCallback() {
        val renders = AtomicInteger()
        val event = AtomicReference<AnyChartEvent>()
        rule.setContent {
            AnyChart(config = config("column.json"), modifier = Modifier.fillMaxSize().testTag("chart"), onRendered = { renders.incrementAndGet() }, onEvent = { event.set(it) }, onError = { errors.add(it) })
        }
        awaitRenders(renders, 1)
        Thread.sleep(500)
        // the tallest column: last point, right of the plot, mid height (as in the Playwright gate)
        rule.onNodeWithTag("chart").performTouchInput { click(Offset(width * 0.9f, height * 0.55f)) }
        rule.waitUntil(timeoutMillis = 10_000) { event.get() != null }
        assertEquals("pointClick", event.get().name)
        assertEquals("Eyeliner", event.get().x)
    }

    @Test
    fun theControllerUpdatesWithoutAReload() {
        val renders = AtomicInteger()
        val controller = AnyChartController()
        rule.setContent {
            AnyChart(config = config("pie.json"), modifier = Modifier.fillMaxSize(), controller = controller, onRendered = { renders.incrementAndGet() }, onError = { errors.add(it) })
        }
        awaitRenders(renders, 1)
        val json = AtomicReference<String>()
        rule.runOnUiThread {
            controller.update(listOf(point("Only one", 1)))
            controller.chartJson { json.set(it.toString()) }
        }
        rule.waitUntil(timeoutMillis = 10_000) { json.get() != null }
        assertTrue(json.get().contains("Only one"))
        assertEquals(1, renders.get())
    }

    @Test
    fun leavingCompositionDestroysTheView() {
        val renders = AtomicInteger()
        val controller = AnyChartController()
        var show by mutableStateOf(true)
        rule.setContent {
            if (show) AnyChart(config = config("pie.json"), modifier = Modifier.fillMaxSize(), controller = controller, onRendered = { renders.incrementAndGet() }, onError = { errors.add(it) })
        }
        awaitRenders(renders, 1)
        val view = controller.view
        assertNotNull(view)
        show = false
        rule.waitForIdle()
        assertTrue("the view's destroy path did not run", view!!.destroyed)
        assertNull(controller.view)
        assertTrue(!controller.isAttached)
    }
}
