package com.anychart.dsl

import com.anychart.dsl.generated.Align
import com.anychart.dsl.generated.LegendLayout
import com.anychart.dsl.generated.TooltipPositionMode
import com.anychart.dsl.generated.area
import com.anychart.dsl.generated.bar
import com.anychart.dsl.generated.circularGauge
import com.anychart.dsl.generated.column
import com.anychart.dsl.generated.line
import com.anychart.dsl.generated.pie
import com.anychart.dsl.generated.scatter
import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * The DSL twins: each conformance config rewritten in Kotlin must produce the same JSON after
 * canonicalisation (keys sorted, numbers normalised). The configs come from ../conformance/configs,
 * mounted as test resources. INTEG-4.
 */
class TwinsTest {

    private fun canonical(v: Any?): Any? = when (v) {
        is JSONObject -> JSONObject().also { o -> v.keys().asSequence().sorted().forEach { k -> o.put(k, canonical(v.get(k))) } }
        is JSONArray -> JSONArray().also { a -> for (i in 0 until v.length()) a.put(canonical(v.get(i))) }
        is Number -> if (v.toDouble() == Math.floor(v.toDouble()) && !v.toDouble().isInfinite()) v.toLong() else v.toDouble()
        else -> v
    }

    private fun assertTwin(resource: String, root: ChartRoot) {
        val expected = JSONObject(javaClass.classLoader!!.getResourceAsStream(resource)!!.readBytes().decodeToString())
        assertEquals(resource, canonical(expected).toString(), canonical(root.toDocument()).toString())
    }

    @Test fun pie() = assertTwin("pie.json", pie {
        title("Fruits imported in 2015 (in kg)")
        data(listOf(point("Apples", 6371664), point("Pears", 789622), point("Bananas", 7216301), point("Grapes", 1486621), point("Oranges", 1200000)))
        labels { position = "outside" }
        legend {
            // The reference types Legend.position as Orientation (left/right/top/bottom); the engine also takes
            // anchor values such as center-bottom. Override candidate for INTEG-6; the String overload covers it.
            position("center-bottom")
            itemsLayout(LegendLayout.HORIZONTAL)
            align(Align.CENTER)
            title { enabled = true; text = "Retail channels"; padding(0, 0, 10, 0) }
        }
    })

    @Test fun column() = assertTwin("column.json", column {
        title("Top 8 Cosmetic Products by Revenue")
        column {
            name = "Revenue"
            data(listOf(point("Rouge", 80540), point("Foundation", 94190), point("Mascara", 102610), point("Lip gloss", 110430),
                point("Lipstick", 128000), point("Nail polish", 143760), point("Eyebrow pencil", 170670), point("Eyeliner", 213210)))
        }
        xAxis(0) { title("Product") }
        yAxis(0) { title("Revenue") }
        yScale { minimum = 0 }
        tooltip { positionMode(TooltipPositionMode.POINT); format = "{%Value}{groupsSeparator: }" }
    })

    @Test fun lineMulti() = assertTwin("line-multi.json", line {
        title("Trend of Sales of the Most Popular Products of ACME Corp.")
        line {
            name = "Brandy"
            data(listOf(point("1986", 3.6), point("1987", 7.1), point("1988", 8.5), point("1989", 9.2), point("1990", 10.1), point("1991", 11.6), point("1992", 16.4), point("1993", 18)))
        }
        line {
            name = "Whiskey"
            data(listOf(point("1986", 2.3), point("1987", 4), point("1988", 6.2), point("1989", 11.8), point("1990", 13), point("1991", 13.9), point("1992", 17.1), point("1993", 22.3)))
        }
        legend { enabled = true; fontSize(13); padding(0, 0, 10, 0) }
        crosshair { enabled = true; yLabel { enabled = false }; yStroke(null) }
        yAxis(0) { title("Number of Bottles Sold (fictional data)") }
    })

    @Test fun area() = assertTwin("area.json", area {
        title("Area chart: site visits per day")
        area {
            name = "Visits"
            data(listOf(point("Mon", 120), point("Tue", 180), point("Wed", 90), point("Thu", 240), point("Fri", 210), point("Sat", 60), point("Sun", 45)))
        }
        yScale { minimum = 0 }
    })

    @Test fun bar() = assertTwin("bar.json", bar {
        title("Bar chart: top countries by population (millions)")
        bar {
            name = "Population"
            data(listOf(point("India", 1428), point("China", 1425), point("USA", 340), point("Indonesia", 277), point("Pakistan", 240)))
        }
        yScale { minimum = 0 }
    })

    @Test fun scatterMarker() = assertTwin("scatter-marker.json", scatter {
        title("Scatter: height vs weight")
        marker {
            name = "People"
            data(listOf(point(160, 55), point(165, 61), point(170, 66), point(175, 72), point(180, 80), point(185, 84), point(190, 95)))
        }
        xAxis(0) { title("Height, cm") }
        yAxis(0) { title("Weight, kg") }
    })

    @Test fun gaugeCircular() = assertTwin("gauge-circular.json", circularGauge {
        title("Circular gauge: speed")
        data(listOf(65))
        startAngle(270)
        sweepAngle(180)
        axis(0) {
            scale { minimum = 0; maximum = 100; ticks { interval = 10 } }
            labels { position = "outside" }
        }
        needle(0) { enabled = true }
    })
}
