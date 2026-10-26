package com.anychart.samplecore

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject

/** Shared helpers for the demo screens: conformance configs from assets and small generated charts. */
object Demo {
    fun config(context: Context, name: String): String =
        context.assets.open(name).bufferedReader().use { it.readText() }

    /** A minimal cartesian chart config as the engine accepts it. */
    fun cartesian(type: String, seriesType: String, title: String, name: String, rows: List<Pair<Any, Number>>): String =
        JSONObject().put("chart", JSONObject()
            .put("type", type)
            .put("title", title)
            .put("series", JSONArray().put(JSONObject()
                .put("seriesType", seriesType)
                .put("name", name)
                .put("data", rowsJson(rows))))
            .put("yScale", JSONObject().put("minimum", 0))
        ).toString()

    fun pie(title: String, rows: List<Pair<Any, Number>>): String =
        JSONObject().put("chart", JSONObject()
            .put("type", "pie")
            .put("title", title)
            .put("data", rowsJson(rows))
            .put("labels", JSONObject().put("format", "{%x}"))
        ).toString()

    fun rowsJson(rows: List<Pair<Any, Number>>): JSONArray =
        JSONArray().also { arr -> rows.forEach { (x, v) -> arr.put(JSONObject().put("x", x).put("value", v)) } }

    /** Deterministic pseudo-random series for list rows. */
    fun sparkRows(seed: Int, n: Int = 12): List<Pair<Any, Number>> {
        var s = seed * 7919 + 17
        return (1..n).map { i -> s = (s * 1103515245 + 12345) and 0x7fffffff; i to (20 + s % 80) }
    }

    // ---- Coordination data: one tap on a category drives the other two charts. ----
    data class Sale(val category: String, val product: String, val month: String, val value: Int)

    val months = listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun")
    val sales: List<Sale> = buildList {
        val products = mapOf(
            "Fruit" to listOf("Apples", "Bananas", "Grapes"),
            "Vegetables" to listOf("Carrots", "Tomatoes", "Onions", "Peppers"),
            "Dairy" to listOf("Milk", "Cheese"),
        )
        for ((cat, prods) in products) for ((pi, p) in prods.withIndex()) for ((mi, m) in months.withIndex()) {
            // varied but deterministic: each product has its own level and its own monthly shape
            val level = 20 + (p.length * 7 + pi * 13) % 40
            val season = ((mi + pi + cat.length) * 5) % 23
            add(Sale(cat, p, m, level + season))
        }
    }

    fun byCategory(): List<Pair<Any, Number>> =
        sales.groupBy { it.category }.map { (c, rows) -> c to rows.sumOf { it.value } }

    fun productsIn(category: String?): List<Pair<Any, Number>> =
        sales.filter { category == null || it.category == category }.groupBy { it.product }.map { (p, rows) -> p to rows.sumOf { it.value } }

    fun monthlyFor(category: String?): List<Pair<Any, Number>> =
        months.map { m -> m to sales.filter { (category == null || it.category == category) && it.month == m }.sumOf { it.value } }
}
