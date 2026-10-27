package com.anychart.core

/**
 * Every failure the host can report, one type each. Page-side failures carry the `code` the
 * runtime page sends with its `error` message (anychart-core/PROTOCOL.md); the rest are raised by
 * the host itself before or after the page runs.
 */
public sealed class AnyChartError(public val chartId: String?, public val message: String) {
    /** `load` rejected: `anychart.fromJson` threw or produced no chart. */
    public class BadConfig(chartId: String?, message: String) : AnyChartError(chartId, message)
    /** `update` rejected: the data or the series index. */
    public class BadData(chartId: String?, message: String) : AnyChartError(chartId, message)
    /** A message named a chart id the page does not have. */
    public class UnknownChart(chartId: String?, message: String) : AnyChartError(chartId, message)
    /** A `$fn` callback failed, is not registered, or the page has no callback channel. */
    public class Callback(chartId: String?, message: String) : AnyChartError(chartId, message)
    /** A malformed or unknown message, an unknown query, or a resize failure. */
    public class BadMessage(chartId: String?, message: String) : AnyChartError(chartId, message)
    /** An uncaught error in the page, or the licence key rejected by the engine. */
    public class Page(message: String) : AnyChartError(null, message)
    /** The licence key could not be injected (no document-start script support). */
    public class License(message: String) : AnyChartError(null, message)
    /** This device's System WebView lacks the WebMessageListener feature (Chromium 83 floor). */
    public class UnsupportedWebView(message: String) : AnyChartError(null, message)
    /** The page bundles another engine than the configs were generated for. */
    public class EngineMismatch(public val expected: String, public val announced: String, message: String) : AnyChartError(null, message)
    /** The page speaks another protocol major than this host (runtime version in `ready`). */
    public class UnsupportedRuntime(public val announced: String, message: String) : AnyChartError(null, message)

    override fun toString(): String = "${javaClass.simpleName}(${chartId ?: "-"}: $message)"

    public companion object {
        /** The page's `error` message, typed by its `code`. */
        @JvmStatic
        public fun fromPage(chartId: String?, code: String, message: String): AnyChartError = when (code) {
            "bad-config" -> BadConfig(chartId, message)
            "bad-data" -> BadData(chartId, message)
            "unknown-chart" -> UnknownChart(chartId, message)
            "callback" -> Callback(chartId, message)
            "bad-message" -> BadMessage(chartId, message)
            else -> Page(message)
        }
    }
}
