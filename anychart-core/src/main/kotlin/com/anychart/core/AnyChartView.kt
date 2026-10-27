package com.anychart.core

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.Looper
import android.os.Parcelable
import android.util.AttributeSet
import android.webkit.WebView
import android.widget.FrameLayout
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.ConcurrentHashMap

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

/** What the page reported with `rendered`: first-draw time and the host callbacks it took. */
public class RenderReport internal constructor(
    public val chartId: String,
    public val millis: Long,
    public val callbackCalls: Int,
    public val callbackMillis: Double,
) {
    override fun toString(): String = "RenderReport($chartId, ${millis}ms, $callbackCalls callbacks in ${callbackMillis}ms)"
}

/** A point the page reports as selected. */
public class SelectedPoint internal constructor(public val pointIndex: Int, public val x: Any?, public val value: Any?, public val series: String?) {
    override fun toString(): String = "SelectedPoint($pointIndex, $x, $value${series?.let { ", $it" } ?: ""})"
}

/**
 * One chart surface. Each instance owns its WebView and its bridge; nothing is shared between
 * instances, so several views on one screen, in Fragments or in a RecyclerView are independent.
 *
 * Threading: every method runs on the main thread and throws [IllegalStateException] otherwise;
 * the listener is called on the main thread. Host callbacks (`{"$fn": ...}` in a config) are the
 * one exception: they run on the WebView's bridge thread while the page waits, see [CallbackChannel].
 *
 * Lifecycle: the view pauses its WebView while detached or not visible and resumes it when shown
 * again. With [savesState] on (default) the loaded charts (config, events, rect) travel through the
 * view's saved instance state across recreation and process death and are reloaded on restore; a
 * host whose configs use callbacks supplies them again through [Listener.onRestoreCallbacks].
 * Set [licenseKey] before the first [load]; it is injected before the page runs.
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
        public fun onError(error: AnyChartError) {}
        /** Host callbacks for a chart being reloaded from saved state; lambdas cannot be saved. */
        public fun onRestoreCallbacks(chartId: String): Map<String, (JSONObject) -> Any?> = emptyMap()
    }

    private class Loaded(val configJson: String, val events: List<String>, val rect: ChartRect?)

    private val webView = WebView(context).apply {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        setBackgroundColor(Color.TRANSPARENT)
    }
    private val bridge = HostBridge(webView, ::dispatch) { chartId, fn -> callbacks[chartId]?.get(fn) }
    private val pendingQueries = HashMap<String, (Any?) -> Unit>()
    // Read from the WebView's bridge thread while the main thread writes on load/dispose.
    private val callbacks = ConcurrentHashMap<String, Map<String, (JSONObject) -> Any?>>()
    private val reports = HashMap<String, RenderReport>()
    private val loaded = LinkedHashMap<String, Loaded>()
    private var querySeq = 0
    private var started = false

    public var licenseKey: String? = null
    public var listener: Listener? = null

    /** Engine version the configs were written for (`Generated.ENGINE_VERSION`); a mismatch with the page's arrives as [AnyChartError.EngineMismatch]. */
    public var expectedJsVersion: String? = null

    /** Whether loaded charts are kept in the view's saved instance state and reloaded on restore. Off for charts whose data is too large for a Bundle. */
    public var savesState: Boolean = true

    public var jsVersion: String? = null
        private set

    /** The runtime page's version from `ready` (protocol major.minor.patch). */
    public var runtimeVersion: String? = null
        private set

    /** True after [destroy]; the view is inert from then on. */
    public var destroyed: Boolean = false
        private set

    /** Page-side boot timings reported with `ready`: ms since navigation start and per-resource fetch durations. */
    public var pageTiming: JSONObject = JSONObject()
        private set

    init {
        addView(webView)
    }

    private fun mainThread(what: String) {
        check(Looper.getMainLooper().isCurrentThread) { "AnyChartView.$what must be called on the main thread" }
    }

    private fun start() {
        if (started) return
        started = true
        bridge.start(License.documentStartScript(licenseKey))?.let { listener?.onError(it) }
    }

    /** Starts the page without loading a chart, so the first [load] finds it warm. */
    public fun warmUp() {
        mainThread("warmUp")
        start()
    }

    /**
     * Loads a chart from its JSON document. [callbacks] answers the config's `{"$fn": name}`
     * placeholders: each lambda gets the engine's context as JSON and returns the value the engine
     * expects, on the WebView's bridge thread, with the page waiting. Keep them quick and pure.
     */
    @JvmOverloads
    public fun load(
        configJson: String,
        chartId: String = DEFAULT_CHART_ID,
        events: List<String> = listOf("pointClick"),
        rect: ChartRect? = null,
        callbacks: Map<String, (JSONObject) -> Any?> = emptyMap(),
    ) {
        mainThread("load")
        start()
        if (callbacks.isEmpty()) this.callbacks.remove(chartId) else this.callbacks[chartId] = callbacks
        reports.remove(chartId)
        loaded[chartId] = Loaded(configJson, events, rect)
        bridge.post(Messages.load(chartId, configJson, events, rect))
    }

    /** Loads a [ChartDocument] (a DSL chart): its callbacks are registered and its engine version checked. */
    @JvmOverloads
    public fun load(
        document: ChartDocument,
        chartId: String = DEFAULT_CHART_ID,
        events: List<String> = listOf("pointClick"),
        rect: ChartRect? = null,
    ) {
        document.engineVersion?.let { expectedJsVersion = it }
        load(document.toDocumentString(), chartId, events, rect, document.callbacks())
    }

    /** Replaces the host callbacks of a loaded chart (after a restore, or to swap behaviour). */
    @JvmOverloads
    public fun callbacks(callbacks: Map<String, (JSONObject) -> Any?>, chartId: String = DEFAULT_CHART_ID) {
        mainThread("callbacks")
        if (callbacks.isEmpty()) this.callbacks.remove(chartId) else this.callbacks[chartId] = callbacks
    }

    /** Replaces the data in place from a JSON array text. With [series] only that series. */
    @JvmOverloads
    public fun update(dataJson: String, chartId: String = DEFAULT_CHART_ID, series: Int? = null) {
        mainThread("update")
        bridge.post(Messages.update(chartId, JSONArray(dataJson), series))
    }

    /** Replaces the data in place from rows built with the data helpers (`point`, `flow`, `cell`...). */
    @JvmOverloads
    public fun update(rows: List<Map<String, Any?>>, chartId: String = DEFAULT_CHART_ID, series: Int? = null) {
        mainThread("update")
        bridge.post(Messages.update(chartId, Messages.rows(rows), series))
    }

    @JvmOverloads
    public fun resize(rect: ChartRect, chartId: String = DEFAULT_CHART_ID) {
        mainThread("resize")
        bridge.post(Messages.resize(chartId, rect))
    }

    @JvmOverloads
    public fun dispose(chartId: String = DEFAULT_CHART_ID) {
        mainThread("dispose")
        callbacks.remove(chartId)
        reports.remove(chartId)
        loaded.remove(chartId)
        bridge.post(Messages.dispose(chartId))
    }

    /** The page's report for the last `rendered` of [chartId], or null before the first draw. */
    @JvmOverloads
    public fun renderReport(chartId: String = DEFAULT_CHART_ID): RenderReport? = reports[chartId]

    /** Asks the page for state. `what` is `selectedPoints`, `json`, `callbackStats` or `tooltipText`; the result is org.json data. */
    @JvmOverloads
    public fun query(what: String, chartId: String = DEFAULT_CHART_ID, callback: (Any?) -> Unit) {
        mainThread("query")
        val requestId = "q${++querySeq}"
        pendingQueries[requestId] = callback
        bridge.post(Messages.query(chartId, requestId, what))
    }

    /** The points currently selected in the chart. */
    @JvmOverloads
    public fun selectedPoints(chartId: String = DEFAULT_CHART_ID, callback: (List<SelectedPoint>) -> Unit) {
        query("selectedPoints", chartId) { result ->
            val arr = result as? JSONArray ?: JSONArray()
            callback(List(arr.length()) { i ->
                val p = arr.getJSONObject(i)
                SelectedPoint(p.optInt("pointIndex", -1), p.opt("x"), p.opt("value"), p.optString("series").takeIf { it.isNotEmpty() })
            })
        }
    }

    /** The chart's current configuration as the engine serialises it (`chart.toJson()`). */
    @JvmOverloads
    public fun chartJson(chartId: String = DEFAULT_CHART_ID, callback: (JSONObject) -> Unit) {
        query("json", chartId) { result -> callback(result as? JSONObject ?: JSONObject()) }
    }

    /** Tears the WebView down. The view cannot be used afterwards. */
    public fun destroy() {
        mainThread("destroy")
        if (destroyed) return
        destroyed = true
        bridge.destroy()
        pendingQueries.clear()
        callbacks.clear()
        reports.clear()
        loaded.clear()
        removeView(webView)
        webView.destroy()
    }

    // ---- lifecycle ---------------------------------------------------------------------------

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        webView.onResume()
    }

    override fun onDetachedFromWindow() {
        webView.onPause()
        super.onDetachedFromWindow()
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
        if (visibility == VISIBLE) webView.onResume() else webView.onPause()
    }

    override fun onSaveInstanceState(): Parcelable? {
        val superState = super.onSaveInstanceState()
        if (!savesState || loaded.isEmpty()) return superState
        return Bundle().apply {
            putParcelable(KEY_SUPER, superState)
            putString(KEY_EXPECTED, expectedJsVersion)
            putStringArrayList(KEY_IDS, ArrayList(loaded.keys))
            for ((id, l) in loaded) {
                putString("$KEY_CONFIG$id", l.configJson)
                putStringArrayList("$KEY_EVENTS$id", ArrayList(l.events))
                l.rect?.let { putIntArray("$KEY_RECT$id", intArrayOf(it.x, it.y, it.width, it.height)) }
            }
        }
    }

    @Suppress("DEPRECATION")
    override fun onRestoreInstanceState(state: Parcelable?) {
        if (state !is Bundle) return super.onRestoreInstanceState(state)
        super.onRestoreInstanceState(state.getParcelable(KEY_SUPER))
        expectedJsVersion = state.getString(KEY_EXPECTED)
        for (id in state.getStringArrayList(KEY_IDS) ?: return) {
            val config = state.getString("$KEY_CONFIG$id") ?: continue
            val events = state.getStringArrayList("$KEY_EVENTS$id") ?: emptyList<String>()
            val rect = state.getIntArray("$KEY_RECT$id")?.let { ChartRect(it[0], it[1], it[2], it[3]) }
            load(config, id, events, rect, listener?.onRestoreCallbacks(id) ?: emptyMap())
        }
    }

    private fun dispatch(raw: String) {
        when (val m = Messages.parse(raw)) {
            is Messages.Incoming.Ready -> {
                jsVersion = m.jsVersion; runtimeVersion = m.runtimeVersion; pageTiming = m.timing
                listener?.onReady(m.jsVersion)
                Protocol.mismatch(m.runtimeVersion)?.let { listener?.onError(AnyChartError.UnsupportedRuntime(m.runtimeVersion, it)) }
                EngineVersion.mismatch(expectedJsVersion, m.jsVersion)?.let { listener?.onError(AnyChartError.EngineMismatch(expectedJsVersion!!, m.jsVersion, it)) }
            }
            is Messages.Incoming.Rendered -> {
                reports[m.chartId] = RenderReport(m.chartId, m.millis, m.callbackCalls, m.callbackMillis)
                listener?.onRendered(m.chartId, m.millis)
            }
            is Messages.Incoming.Event -> listener?.onEvent(AnyChartEvent(m.chartId, m.name, m.data))
            is Messages.Incoming.Answer -> pendingQueries.remove(m.requestId)?.invoke(m.result)
            is Messages.Incoming.Error -> listener?.onError(AnyChartError.fromPage(m.chartId, m.code, m.message))
        }
    }

    public companion object {
        public const val DEFAULT_CHART_ID: String = "chart"
        private const val KEY_SUPER = "anychart.super"
        private const val KEY_EXPECTED = "anychart.expectedJsVersion"
        private const val KEY_IDS = "anychart.ids"
        private const val KEY_CONFIG = "anychart.config:"
        private const val KEY_EVENTS = "anychart.events:"
        private const val KEY_RECT = "anychart.rect:"
    }
}
