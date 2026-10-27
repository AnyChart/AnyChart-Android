package com.anychart.dsl

import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.atomic.AtomicInteger

/**
 * A function-valued setting (`format`, `fill`, `stroke` functions) as the runtime page accepts it.
 * Three carriers exist:
 *
 *  - an engine token string such as `"{%name}: {%value}"`: the plain `String` overload, no [Callback];
 *  - [callback]: a Kotlin lambda, called by the page synchronously with the function's `this`
 *    context serialised to a [CallbackContext] (see anychart-core/PROTOCOL.md, "Callbacks");
 *  - [js]: a JavaScript function body evaluated verbatim in the page, for what only the engine's
 *    own helpers can do (`anychart.color.lighten`, `this.getData(...)`).
 *
 * Serialised as `{"$fn": id}` or `{"$js": body}`; the host resolves `$fn` through
 * [ChartRoot.callbacks].
 */
public sealed class Callback : ConfigNode.JsonValue {
    /** Verbatim JavaScript: the body of `function () { ... }`, with `this` the engine's context. */
    public class Js(public val body: String) : Callback() {
        override val json: Any = mapOf("\$js" to body)
    }

    /** A host lambda. Runs on the WebView's bridge thread while the page waits: keep it pure and quick. */
    public class Fn(public val fn: (CallbackContext) -> Any?) : Callback() {
        public val id: String = "fn${seq.incrementAndGet()}"
        override val json: Any = mapOf("\$fn" to id)
    }

    private companion object {
        val seq = AtomicInteger()
    }
}

public fun callback(fn: (CallbackContext) -> Any?): Callback = Callback.Fn(fn)
public fun js(body: String): Callback = Callback.Js(body)

/**
 * The engine's `this` inside a format or fill function, as the page serialised it: the public
 * fields of the context (`name`, `value`, `x`, `index`, `sourceColor`, and type-specific ones such
 * as a sankey node's `income`, `outcome`, `dropoff`, `isConflict`). [raw] has everything.
 */
public class CallbackContext(public val raw: JSONObject) {
    public val name: String? get() = string("name")
    public val value: Number? get() = number("value")
    public val x: Any? get() = if (raw.isNull("x")) null else raw.opt("x")
    public val index: Int? get() = number("index")?.toInt()
    public val sourceColor: String? get() = string("sourceColor")

    public fun string(key: String): String? = if (raw.isNull(key)) null else raw.optString(key)
    public fun number(key: String): Number? = if (raw.isNull(key)) null else raw.optDouble(key).takeIf { !it.isNaN() }
    public fun boolean(key: String): Boolean? = if (raw.isNull(key)) null else raw.optBoolean(key)
    public fun list(key: String): List<Any?> {
        val a: JSONArray = raw.optJSONArray(key) ?: return emptyList()
        return List(a.length()) { a.opt(it) }
    }
    override fun toString(): String = "CallbackContext($raw)"
}
