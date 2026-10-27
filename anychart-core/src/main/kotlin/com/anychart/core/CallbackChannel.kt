package com.anychart.core

import android.webkit.JavascriptInterface
import org.json.JSONObject

/**
 * The synchronous half of the bridge: `window.AnyChartCallbacks.invoke(json)` in the page. The
 * engine calls a `{"$fn": name}` placeholder while laying out a label or picking a fill and waits
 * for the answer, so this runs on the WebView's own bridge thread, not the main thread, with the
 * page's JavaScript blocked until it returns. A host lambda must therefore be quick and pure:
 * no view access, no waiting on the main thread. See anychart-core/PROTOCOL.md, "Callbacks".
 */
internal class CallbackChannel(private val lookup: (chartId: String, fn: String) -> ((JSONObject) -> Any?)?) {

    @JavascriptInterface
    fun invoke(message: String): String {
        val m = try { JSONObject(message) } catch (e: Exception) {
            return JSONObject().put("error", "malformed callback message: ${e.message}").toString()
        }
        val chartId = m.optString("id")
        val fn = m.optString("fn")
        val impl = lookup(chartId, fn) ?: return JSONObject().put("error", "no callback $fn registered for chart $chartId").toString()
        return try {
            JSONObject().put("v", JSONObject.wrap(impl(m.optJSONObject("context") ?: JSONObject())) ?: JSONObject.NULL).toString()
        } catch (e: Exception) {
            JSONObject().put("error", e.toString()).toString()
        }
    }

    companion object {
        const val JS_OBJECT = "AnyChartCallbacks"
    }
}
