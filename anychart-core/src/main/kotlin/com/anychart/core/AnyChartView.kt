package com.anychart.core

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.webkit.WebView
import android.widget.FrameLayout
import org.json.JSONObject

/** A chart event forwarded from the page: which chart, which event, and the point data it carried. */
public class AnyChartEvent internal constructor(
    public val chartId: String,
    public val name: String,
    public val data: JSONObject,
) {
    public val pointIndex: Int? get() = if (data.has("pointIndex")) data.optInt("pointIndex") else null
    public val x: Any? get() = data.opt("x")
    public val value: Any? get() = data.opt("value")
    public val series: String? get() = data.optString("series").takeIf { it.isNotEmpty() }
    override fun toString(): String = "AnyChartEvent($chartId, $name, $data)"
}

/**
 * One chart surface. Each instance owns its WebView and its bridge; nothing is shared between
 * instances, so several views on one screen, in Fragments or in a RecyclerView are independent.
 *
 * Configs are the JSON documents `anychart.fromJson` accepts. Set [licenseKey] before the first
 * [load]; it is injected before the page runs.
 */
public class AnyChartView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    public interface Listener {
        public fun onReady(jsVersion: String) {}
        public fun onRendered(chartId: String, millis: Long) {}
        public fun onEvent(event: AnyChartEvent) {}
        public fun onError(chartId: String?, message: String) {}
    }

    private val webView = WebView(context).apply {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        setBackgroundColor(Color.TRANSPARENT)
    }
    private val bridge = HostBridge(webView, ::dispatch)
    private val pendingQueries = HashMap<String, (Any?) -> Unit>()
    private var querySeq = 0
    private var started = false

    public var licenseKey: String? = null
    public var listener: Listener? = null
    public var jsVersion: String? = null
        private set

    /** Page-side boot timings reported with `ready`: ms since navigation start and per-resource fetch durations. */
    public var pageTiming: JSONObject = JSONObject()
        private set

    init {
        addView(webView)
    }

    private fun start() {
        if (started) return
        started = true
        bridge.start(License.documentStartScript(licenseKey))?.let { listener?.onError(null, it) }
    }

    /** Starts the page without loading a chart, so the first [load] finds it warm. */
    public fun warmUp(): Unit = start()

    public fun load(
        configJson: String,
        chartId: String = DEFAULT_CHART_ID,
        events: List<String> = listOf("pointClick"),
        rect: ChartRect? = null,
    ) {
        start()
        bridge.post(Messages.load(chartId, configJson, events, rect))
    }

    public fun update(dataJson: String, chartId: String = DEFAULT_CHART_ID, series: Int? = null) {
        bridge.post(Messages.update(chartId, dataJson, series))
    }

    public fun resize(rect: ChartRect, chartId: String = DEFAULT_CHART_ID) {
        bridge.post(Messages.resize(chartId, rect))
    }

    public fun dispose(chartId: String = DEFAULT_CHART_ID) {
        bridge.post(Messages.dispose(chartId))
    }

    /** Asks the page for state. `what` is `selectedPoints` or `json`; the result is org.json data. */
    public fun query(what: String, chartId: String = DEFAULT_CHART_ID, callback: (Any?) -> Unit) {
        val requestId = "q${++querySeq}"
        pendingQueries[requestId] = callback
        bridge.post(Messages.query(chartId, requestId, what))
    }

    /** Tears the WebView down. The view cannot be used afterwards. */
    public fun destroy() {
        bridge.destroy()
        pendingQueries.clear()
        removeView(webView)
        webView.destroy()
    }

    private fun dispatch(raw: String) {
        when (val m = Messages.parse(raw)) {
            is Messages.Incoming.Ready -> { jsVersion = m.jsVersion; pageTiming = m.timing; listener?.onReady(m.jsVersion) }
            is Messages.Incoming.Rendered -> listener?.onRendered(m.chartId, m.millis)
            is Messages.Incoming.Event -> listener?.onEvent(AnyChartEvent(m.chartId, m.name, m.data))
            is Messages.Incoming.Answer -> pendingQueries.remove(m.requestId)?.invoke(m.result)
            is Messages.Incoming.Error -> listener?.onError(m.chartId, m.message)
        }
    }

    public companion object {
        public const val DEFAULT_CHART_ID: String = "chart"
    }
}
