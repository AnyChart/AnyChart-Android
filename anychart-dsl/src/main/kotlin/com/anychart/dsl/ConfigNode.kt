package com.anychart.dsl

import org.json.JSONArray
import org.json.JSONObject

/**
 * A node of a chart configuration: an ordered map of settings that serialises to the JSON
 * `anychart.fromJson` accepts. Generated classes extend it and add one typed member per setting;
 * this class knows nothing about chart types.
 *
 * Values are kept as plain Kotlin values until [toJson]: primitives, [Enum]s implementing
 * [JsonValue], lists, and nested [ConfigNode]s.
 */
public open class ConfigNode {
    private val settings = LinkedHashMap<String, Any?>()

    /** A setting that carries a fixed JSON value, such as a generated enum. */
    public interface JsonValue {
        public val json: Any
    }

    protected fun put(key: String, value: Any?) {
        settings[key] = value
    }

    protected fun get(key: String): Any? = settings[key]

    /** A fixed setting a factory stamps on its product (`seriesType`). Module-internal: generated code only. */
    internal fun preset(key: String, value: Any?) {
        settings[key] = value
    }

    /** Nested settings object: created on first use, so `legend { }` twice merges rather than replaces. */
    protected fun <T : ConfigNode> nested(key: String, create: () -> T, init: T.() -> Unit): T {
        @Suppress("UNCHECKED_CAST")
        val node = (settings[key] as? T) ?: create().also { settings[key] = it }
        node.init()
        return node
    }

    /** Settings addressed by index (`xAxis(1)`): kept as a list under the engine's plural key. */
    protected fun <T : ConfigNode> indexed(key: String, index: Int, create: () -> T, init: T.() -> Unit): T {
        @Suppress("UNCHECKED_CAST")
        val list = (settings[key] as? MutableList<T?>) ?: ArrayList<T?>().also { settings[key] = it }
        while (list.size <= index) list.add(null)
        val node = list[index] ?: create().also { list[index] = it }
        node.init()
        return node
    }

    /** A primitive at an index (`xAxis(1, false)`): the list slot holds the value instead of a node. */
    protected fun indexedValue(key: String, index: Int, value: Any?) {
        @Suppress("UNCHECKED_CAST")
        val list = (settings[key] as? MutableList<Any?>) ?: ArrayList<Any?>().also { settings[key] = it }
        while (list.size <= index) list.add(null)
        list[index] = value
    }

    /** A product appended to a list (`column(data)` appends to `series`). */
    protected fun <T : ConfigNode> appended(key: String, create: () -> T, init: T.() -> Unit): T {
        @Suppress("UNCHECKED_CAST")
        val list = (settings[key] as? MutableList<T>) ?: ArrayList<T>().also { settings[key] = it }
        val node = create()
        list.add(node)
        node.init()
        return node
    }

    public fun toJson(): JSONObject {
        val out = JSONObject()
        for ((k, v) in settings) out.put(k, encode(v))
        return out
    }

    private fun encode(v: Any?): Any? = when (v) {
        null -> JSONObject.NULL
        is ConfigNode -> v.toJson()
        is JsonValue -> v.json
        is Map<*, *> -> JSONObject().also { o -> v.forEach { (mk, mv) -> o.put(mk.toString(), encode(mv)) } }
        is Iterable<*> -> JSONArray().also { a -> v.forEach { a.put(encode(it)) } }
        is Array<*> -> JSONArray().also { a -> v.forEach { a.put(encode(it)) } }
        is Pair<*, *> -> JSONArray().put(encode(v.first)).put(encode(v.second))
        else -> v
    }
}

/** The document root: `{"chart": {...}}` or `{"gauge": {...}}` with the engine's `type` set. */
public abstract class ChartRoot(private val rootKey: String, typeName: String) : ConfigNode() {
    init { put("type", typeName) }

    /** The full document, as the runtime's `load` takes it. */
    public fun toDocument(): JSONObject = JSONObject().put(rootKey, toJson())
    public fun toDocumentString(): String = toDocument().toString()
}
