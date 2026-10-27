package com.anychart.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartEvent
import com.anychart.core.AnyChartView
import com.anychart.core.ChartDocument
import com.anychart.core.RenderReport
import com.anychart.core.SelectedPoint
import org.json.JSONObject

/**
 * Drives a composed chart after it is on screen: data updates and queries without a reload.
 * Create it with [rememberAnyChartController] and pass it to [AnyChart]; it is attached while the
 * chart is in composition and detached when the chart leaves.
 */
public class AnyChartController internal constructor() {
    internal var view: AnyChartView? = null
    private val attached: AnyChartView
        get() = checkNotNull(view) { "AnyChartController is not attached: pass it to AnyChart() and call it once the chart is composed" }

    /** True while a chart uses this controller. */
    public val isAttached: Boolean get() = view != null

    /** Replaces the data in place from rows built with the data helpers. With [series] only that series. */
    public fun update(rows: List<Map<String, Any?>>, series: Int? = null): Unit = attached.update(rows, series = series)
    /** Replaces the data in place from a JSON array text. */
    public fun update(dataJson: String, series: Int? = null): Unit = attached.update(dataJson, series = series)
    public fun selectedPoints(callback: (List<SelectedPoint>) -> Unit): Unit = attached.selectedPoints(callback = callback)
    public fun chartJson(callback: (JSONObject) -> Unit): Unit = attached.chartJson(callback = callback)
    public fun query(what: String, callback: (Any?) -> Unit): Unit = attached.query(what, callback = callback)
    public fun renderReport(): RenderReport? = view?.renderReport()
}

@Composable
public fun rememberAnyChartController(): AnyChartController = remember { AnyChartController() }

/**
 * A chart in Compose from a DSL document (or any [ChartDocument]). The document is compared by
 * content: recomposition with an equal document does not touch the WebView, a different one loads
 * into the same WebView. The WebView is destroyed when the composable leaves composition.
 */
@Composable
public fun AnyChart(
    chart: ChartDocument,
    modifier: Modifier = Modifier,
    licenseKey: String? = null,
    events: List<String> = listOf("pointClick"),
    controller: AnyChartController? = null,
    onEvent: (AnyChartEvent) -> Unit = {},
    onRendered: (millis: Long) -> Unit = {},
    onError: (AnyChartError) -> Unit = {},
) {
    // ponytail: content equality by serialising; a chart document is small next to a WebView load.
    val key = remember(chart) { chart.toDocumentString() }
    ChartSurface(key, { view -> view.load(chart, events = events) }, modifier, licenseKey, controller, onEvent, onRendered, onError)
}

/** A chart in Compose from the JSON document `anychart.fromJson` accepts; the same contract as the document overload. */
@Composable
public fun AnyChart(
    config: String,
    modifier: Modifier = Modifier,
    licenseKey: String? = null,
    events: List<String> = listOf("pointClick"),
    controller: AnyChartController? = null,
    onEvent: (AnyChartEvent) -> Unit = {},
    onRendered: (millis: Long) -> Unit = {},
    onError: (AnyChartError) -> Unit = {},
) {
    ChartSurface(config, { view -> view.load(config, events = events) }, modifier, licenseKey, controller, onEvent, onRendered, onError)
}

@Composable
private fun ChartSurface(
    key: String,
    load: (AnyChartView) -> Unit,
    modifier: Modifier,
    licenseKey: String?,
    controller: AnyChartController?,
    onEvent: (AnyChartEvent) -> Unit,
    onRendered: (millis: Long) -> Unit,
    onError: (AnyChartError) -> Unit,
) {
    val currentOnEvent by rememberUpdatedState(onEvent)
    val currentOnRendered by rememberUpdatedState(onRendered)
    val currentOnError by rememberUpdatedState(onError)
    val currentLoad by rememberUpdatedState(load)

    AndroidView(
        modifier = modifier,
        factory = { context ->
            AnyChartView(context).apply {
                this.licenseKey = licenseKey
                listener = object : AnyChartView.Listener {
                    override fun onEvent(event: AnyChartEvent) = currentOnEvent(event)
                    override fun onRendered(chartId: String, millis: Long) = currentOnRendered(millis)
                    override fun onError(error: AnyChartError) = currentOnError(error)
                }
                tag = key
                load(this)
            }
        },
        update = { view ->
            controller?.view = view
            if (view.tag != key) {
                view.tag = key
                currentLoad(view)
            }
        },
        onRelease = { view ->
            if (controller?.view === view) controller.view = null
            view.destroy()
        },
    )
}
