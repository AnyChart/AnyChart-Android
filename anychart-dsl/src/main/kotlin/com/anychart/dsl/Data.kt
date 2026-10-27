@file:JvmName("Data")

package com.anychart.dsl

/**
 * Row builders for the engine's data shapes. Each returns the plain map the chart's `data` takes,
 * so a row is `point("Apples", 3)` in Kotlin and `Data.point("Apples", 3)` in Java.
 */

/** A cartesian or pie point: `{x, value}`. */
public fun point(x: Any, value: Number): Map<String, Any> = mapOf("x" to x, "value" to value)

/** A point with more fields: `point("Q1", 3, "fill" to "red")`, or a range point `point("A", 40, "high" to 60)`. */
public fun point(x: Any, value: Number, vararg extra: Pair<String, Any?>): Map<String, Any?> =
    LinkedHashMap<String, Any?>().apply { put("x", x); put("value", value); extra.forEach { (k, v) -> put(k, v) } }

/** A range point (dumbbell, range bar, candlestick lows and highs): `{x, low, high}`. */
public fun range(x: Any, low: Number, high: Number): Map<String, Any> = mapOf("x" to x, "low" to low, "high" to high)

/** A sankey, arc diagram or dependency wheel flow: `{from, to, weight}`. A null `to` is a sankey dropoff. */
public fun flow(from: String, to: String?, weight: Number): Map<String, Any?> = mapOf("from" to from, "to" to to, "weight" to weight)

/** A heat map cell: `{x, y, heat}`. */
public fun cell(x: Any, y: Any, heat: Number): Map<String, Any> = mapOf("x" to x, "y" to y, "heat" to heat)

/** A named value (waffle, pie by name, tag cloud): `{name, value}`. */
public fun named(name: String, value: Number): Map<String, Any> = mapOf("name" to name, "value" to value)

/**
 * A tree node for tree-backed charts (tree map, sunburst, circle packing, org chart): `{name, value?, ...extra, children?}`.
 * Pass the roots to [tree] for the chart's `data`.
 */
public fun node(name: String, value: Number? = null, vararg extra: Pair<String, Any?>, children: List<Map<String, Any?>> = emptyList()): Map<String, Any?> =
    LinkedHashMap<String, Any?>().apply {
        put("name", name)
        if (value != null) put("value", value)
        extra.forEach { (k, v) -> put(k, v) }
        if (children.isNotEmpty()) put("children", children)
    }

/**
 * Tree data as the engine serialises it: `{children: [{treeDataItemData: {...}, children: [...]}]}`.
 * `treeMap { data(tree(node("World", children = listOf(node("Europe", 447))))) }`.
 */
public fun tree(vararg roots: Map<String, Any?>): Map<String, Any?> = mapOf("children" to roots.map(::treeItem))

private fun treeItem(n: Map<String, Any?>): Map<String, Any?> {
    @Suppress("UNCHECKED_CAST")
    val children = n["children"] as? List<Map<String, Any?>>
    val item = LinkedHashMap<String, Any?>().apply { put("treeDataItemData", n.filterKeys { it != "children" }) }
    if (!children.isNullOrEmpty()) item["children"] = children.map(::treeItem)
    return item
}

/** Any row as named fields: `row("id" to "ceo", "name" to "Sarah", "title" to "CEO")`. */
public fun row(vararg fields: Pair<String, Any?>): Map<String, Any?> = linkedMapOf(*fields)
