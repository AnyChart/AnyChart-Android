package com.anychart.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.anychart.core.AnyChartEvent
import com.anychart.core.AnyChartView

/**
 * A chart in Compose. [config] is the JSON document `anychart.fromJson` accepts; a new config
 * value loads a new chart into the same WebView. The view is destroyed when the composable leaves.
 */
@Composable
public fun AnyChart(
    config: String,
    modifier: Modifier = Modifier,
    chartId: String = AnyChartView.DEFAULT_CHART_ID,
    licenseKey: String? = null,
    events: List<String> = listOf("pointClick"),
    onEvent: (AnyChartEvent) -> Unit = {},
    onRendered: (millis: Long) -> Unit = {},
    onError: (chartId: String?, message: String) -> Unit = { _, _ -> },
) {
    val currentOnEvent by rememberUpdatedState(onEvent)
    val currentOnRendered by rememberUpdatedState(onRendered)
    val currentOnError by rememberUpdatedState(onError)

    AndroidView(
        modifier = modifier,
        factory = { context ->
            AnyChartView(context).apply {
                this.licenseKey = licenseKey
                listener = object : AnyChartView.Listener {
                    override fun onEvent(event: AnyChartEvent) = currentOnEvent(event)
                    override fun onRendered(chartId: String, millis: Long) = currentOnRendered(millis)
                    override fun onError(chartId: String?, message: String) = currentOnError(chartId, message)
                }
                tag = config
                load(config, chartId, events)
            }
        },
        update = { view ->
            if (view.tag != config) {
                view.tag = config
                view.load(config, chartId, events)
            }
        },
        onRelease = { it.destroy() },
    )
}
