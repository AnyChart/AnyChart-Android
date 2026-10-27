@file:JvmName("Data")

package com.anychart.dsl

/**
 * Hand-written data helpers. The generated classes take `data(...)` as plain values; these build the
 * row shapes the engine expects for the common cases. Per-family typed data (tree data, flows, heat
 * map cells, data sheet rows) arrives with the full surface (INTEG-6).
 */

/** One category point: `{x, value}`. The row shape of pie slices and single-value series. */
public fun point(x: Any, value: Number): Map<String, Any> = linkedMapOf("x" to x, "value" to value)

/** A point with extra fields: `point("A", 1, "fill" to "red")`. */
public fun point(x: Any, value: Number, vararg extra: Pair<String, Any?>): Map<String, Any?> =
    LinkedHashMap<String, Any?>().apply { put("x", x); put("value", value); extra.forEach { put(it.first, it.second) } }
