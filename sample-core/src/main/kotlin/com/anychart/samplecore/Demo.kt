package com.anychart.samplecore

import com.anychart.dsl.ChartRoot
import com.anychart.dsl.generated.column
import com.anychart.dsl.generated.line
import com.anychart.dsl.generated.pie
import com.anychart.dsl.point

/** Shared helpers for the demo screens: small generated charts in the DSL and the coordination data. */
object Demo {
    fun rows(pairs: List<Pair<Any, Number>>): List<Map<String, Any?>> = pairs.map { (x, v) -> point(x, v) }

    fun column(title: String, name: String, pairs: List<Pair<Any, Number>>): ChartRoot = column {
        title(title)
        column { this.name = name; data(rows(pairs)) }
        yScale { minimum = 0 }
    }

    fun line(title: String, name: String, pairs: List<Pair<Any, Number>>): ChartRoot = line {
        title(title)
        line { this.name = name; data(rows(pairs)) }
        yScale { minimum = 0 }
    }

    fun pie(title: String, pairs: List<Pair<Any, Number>>): ChartRoot = pie {
        title(title)
        data(rows(pairs))
        labels { format = "{%x}" }
    }

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
