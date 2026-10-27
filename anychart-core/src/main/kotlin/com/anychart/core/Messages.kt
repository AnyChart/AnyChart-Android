package com.anychart.core

import org.json.JSONArray
import org.json.JSONObject

/** A rectangle in CSS pixels inside the runtime page. Omit it to fill the whole view. */
public data class ChartRect(val x: Int, val y: Int, val width: Int, val height: Int)

/**
 * The host side of the protocol in anychart-core/PROTOCOL.md: builds the messages the host sends
 * and reads the ones the page posts back. Pure functions over org.json so they run in JVM tests.
 *
 * ponytail: org.json, not a serialisation framework. Ten message shapes do not justify a compiler
 * plugin; a typed config layer (route C) is where kotlinx.serialization earns its place.
 */
internal object Messages {

    fun load(chartId: String, configJson: String, events: List<String>, rect: ChartRect?): JSONObject =
        JSONObject()
            .put("type", "load")
            .put("id", chartId)
            .put("config", JSONObject(configJson))
            .put("events", JSONArray(events))
            .also { if (rect != null) it.put("rect", rect.toJson()) }

    fun update(chartId: String, dataJson: String, series: Int?): JSONObject =
        JSONObject()
            .put("type", "update")
            .put("id", chartId)
            .put("data", JSONArray(dataJson))
            .also { if (series != null) it.put("series", series) }

    fun resize(chartId: String, rect: ChartRect): JSONObject =
        JSONObject().put("type", "resize").put("id", chartId).put("rect", rect.toJson())

    fun dispose(chartId: String): JSONObject =
        JSONObject().put("type", "dispose").put("id", chartId)

    fun query(chartId: String, requestId: String, what: String): JSONObject =
        JSONObject().put("type", "query").put("id", chartId).put("requestId", requestId).put("what", what)

    private fun ChartRect.toJson(): JSONObject =
        JSONObject().put("x", x).put("y", y).put("width", width).put("height", height)

    /** What the page posts back, decoded. Unknown shapes become [Incoming.Error] rather than exceptions. */
    sealed class Incoming {
        data class Ready(val jsVersion: String, val runtimeVersion: String, val timing: JSONObject = JSONObject()) : Incoming()
        data class Rendered(val chartId: String, val millis: Long, val callbackCalls: Int = 0, val callbackMillis: Double = 0.0) : Incoming()
        data class Event(val chartId: String, val name: String, val data: JSONObject) : Incoming()
        data class Answer(val chartId: String, val requestId: String, val result: Any?) : Incoming()
        data class Error(val chartId: String?, val message: String) : Incoming()
    }

    fun parse(raw: String): Incoming {
        val m = try { JSONObject(raw) } catch (e: Exception) {
            return Incoming.Error(null, "malformed message from page: ${e.message}")
        }
        val id = m.optString("id", "")
        return when (m.optString("type")) {
            "ready" -> Incoming.Ready(m.optString("jsVersion", "unknown"), m.optString("runtimeVersion", "unknown"), m.optJSONObject("timing") ?: JSONObject())
            "rendered" -> m.optJSONObject("callbacks").let { cb -> Incoming.Rendered(id, m.optLong("ms", -1), cb?.optInt("calls") ?: 0, cb?.optDouble("ms", 0.0) ?: 0.0) }
            "event" -> Incoming.Event(id, m.optString("event"), m.optJSONObject("data") ?: JSONObject())
            "answer" -> Incoming.Answer(id, m.optString("requestId"), m.opt("result"))
            "error" -> Incoming.Error(if (m.isNull("id")) null else id, m.optString("message", "unknown error"))
            else -> Incoming.Error(null, "unknown message type from page: ${m.optString("type")}")
        }
    }
}
