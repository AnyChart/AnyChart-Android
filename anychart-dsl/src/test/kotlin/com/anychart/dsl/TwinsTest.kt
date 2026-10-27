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
import com.anychart.dsl.generated.sankey
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

    // The playground's energy flows sample (INTEG-5): rows are [from, to, weight], a null `to` is a dropoff.
    private val energyFlows: List<List<Any?>> = listOf(
        listOf("Hydro", "Electricity grid", 5), listOf("Coal reserves", "Coal", 64), listOf("Coal imports", "Coal", 31),
        listOf("Gas reserves", "Natural Gas", 82), listOf("Gas imports", "Natural Gas", 2034), listOf("Oil reserves", "Oil", 108),
        listOf("Oil imports", "Oil", 772), listOf("Land based bioenergy", "Bio-conversion", 18), listOf("Agricultural \"waste\"", "Bio-conversion", 37),
        listOf("Other waste", "Bio-conversion", 40), listOf("Coal", "Solid", 95), listOf("Other waste", "Solid", 14),
        listOf("Bio-conversion", "Solid", 30), listOf("Natural Gas", "Gas", 2117), listOf("Bio-conversion", "Gas", 40),
        listOf("Oil", "Liquid", 880), listOf("Bio-conversion", "Liquid", 8), listOf("Bio-conversion", null, 18),
        listOf("Solid", "Thermal generation", 33), listOf("Solid", "Industry", 106), listOf("Gas", "Thermal generation", 1153),
        listOf("Gas", "Heating and cooling (homes)", 518), listOf("Gas", "Heating and cooling (commercial)", 141),
        listOf("Gas", "Lighting & appliances (homes)", 8), listOf("Gas", "Lighting & appliances (commercial)", 9),
        listOf("Gas", "Industry", 301), listOf("Gas", "Agriculture", 2), listOf("Gas", null, 24), listOf("Liquid", "Industry", 199),
        listOf("Liquid", "Road transport", 322), listOf("Liquid", "Rail transport", 7), listOf("Liquid", "Domestic aviation", 15),
        listOf("Liquid", "International aviation", 189), listOf("Liquid", "National navigation", 22),
        listOf("Liquid", "International shipping", 130), listOf("Liquid", "Agriculture", 4),
        listOf("Thermal generation", "Electricity grid", 576), listOf("Thermal generation", "District heating", 16),
        listOf("Thermal generation", null, 593), listOf("Electricity grid", "Heating and cooling (homes)", 61),
        listOf("Electricity grid", "Heating and cooling (commercial)", 31), listOf("Electricity grid", "Lighting & appliances (homes)", 103),
        listOf("Electricity grid", "Lighting & appliances (commercial)", 92), listOf("Electricity grid", "Industry", 228),
        listOf("Electricity grid", "Road transport", 14), listOf("Electricity grid", "Rail transport", 7),
        listOf("Electricity grid", "Agriculture", 4), listOf("Electricity grid", null, 41), listOf("District heating", "Industry", 16),
    )

    @Test fun sankey() = assertTwin("sankey.json", sankey {
        title("Energy Flows (TWh/y)")
        data(energyFlows)
        padding(20, 80, 20, 40)
        curveFactor = 0.2
        nodeWidth(50)
        nodePadding(30)
        node {
            normal { labels { anchor("center-bottom"); position("center-top"); useHtml = true } }
            tooltip { anchor("center-bottom"); useHtml = true }
        }
        flow { tooltip { enabled = false } }
        dropoff { tooltip { enabled = false } }
    })

    /** The three carriers of a function-valued setting serialise as the runtime expects, and the lambdas are collectable. */
    @Test fun callbacksSerialiseAsPlaceholdersAndCollect() {
        val chart = sankey {
            node {
                tooltip { format(callback { "Node ${it.name}: ${it.list("income").size} in" }) }
                normal {
                    labels { format(callback { it.name?.uppercase() }) }
                    fill(callback { mapOf("color" to it.sourceColor, "opacity" to 0.5) })
                }
            }
            flow {
                normal { fill(js("return anychart.color.lighten(this.sourceColor, 0.5) + ' 0.3'")) }
                tooltip { format("{%from} to {%to}") }
            }
        }
        val root = chart.toDocument().getJSONObject("chart")
        val node = root.getJSONObject("node")
        val tipFn = node.getJSONObject("tooltip").getJSONObject("format").getString("\$fn")
        val labelFn = node.getJSONObject("normal").getJSONObject("labels").getJSONObject("format").getString("\$fn")
        val fillFn = node.getJSONObject("normal").getJSONObject("fill").getString("\$fn")
        assertEquals("return anychart.color.lighten(this.sourceColor, 0.5) + ' 0.3'", root.getJSONObject("flow").getJSONObject("normal").getJSONObject("fill").getString("\$js"))
        assertEquals("{%from} to {%to}", root.getJSONObject("flow").getJSONObject("tooltip").getString("format"))

        val callbacks = chart.callbacks()
        assertEquals(setOf(tipFn, labelFn, fillFn), callbacks.keys)
        val ctx = JSONObject().put("name", "Coal").put("sourceColor", "#f00")
            .put("income", JSONArray().put(JSONObject().put("name", "Coal reserves").put("value", 64)))
        assertEquals("Node Coal: 1 in", callbacks.getValue(tipFn)(ctx))
        assertEquals("COAL", callbacks.getValue(labelFn)(ctx))
        assertEquals(canonical(JSONObject("""{"color":"#f00","opacity":0.5}""")).toString(), canonical(callbacks.getValue(fillFn)(ctx)).toString())
        assertEquals(JSONObject.NULL, callbacks.getValue(labelFn)(JSONObject()))
    }
}
