package com.anychart.samplecore

import com.anychart.dsl.ChartRoot
import com.anychart.dsl.cell
import com.anychart.dsl.flow
import com.anychart.dsl.generated.Align
import com.anychart.dsl.generated.LegendLayout
import com.anychart.dsl.generated.TooltipPositionMode
import com.anychart.dsl.generated.arcDiagram
import com.anychart.dsl.generated.area
import com.anychart.dsl.generated.bar
import com.anychart.dsl.generated.circularGauge
import com.anychart.dsl.generated.column
import com.anychart.dsl.generated.dataSheet
import com.anychart.dsl.generated.dependencyWheel
import com.anychart.dsl.generated.dumbbell
import com.anychart.dsl.generated.heatMap
import com.anychart.dsl.generated.line
import com.anychart.dsl.generated.lollipop
import com.anychart.dsl.generated.orgChart
import com.anychart.dsl.generated.pie
import com.anychart.dsl.generated.sankey
import com.anychart.dsl.generated.scatter
import com.anychart.dsl.generated.streamGraph
import com.anychart.dsl.generated.treeMap
import com.anychart.dsl.generated.waffle
import com.anychart.dsl.named
import com.anychart.dsl.node
import com.anychart.dsl.point
import com.anychart.dsl.range
import com.anychart.dsl.row
import com.anychart.dsl.tree

/**
 * The conformance set written in the Kotlin DSL: the same nineteen charts the Playwright gate and the
 * device tests render from JSON, here as code with completion. Each entry is a fresh document.
 */
object Gallery {
    val names: List<String> get() = builders.keys.toList()

    fun chart(name: String): ChartRoot = requireNotNull(builders[name]) { "no gallery chart $name" }()

    private val builders: Map<String, () -> ChartRoot> = linkedMapOf(
        "pie" to {
            pie {
                title("Fruits imported in 2015 (in kg)")
                data(listOf(point("Apples", 6371664), point("Pears", 789622), point("Bananas", 7216301), point("Grapes", 1486621), point("Oranges", 1200000)))
                labels { position = "outside" }
                legend {
                    position("center-bottom")
                    itemsLayout(LegendLayout.HORIZONTAL)
                    align(Align.CENTER)
                    title { enabled = true; text = "Retail channels"; padding(0, 0, 10, 0) }
                }
            }
        },
        "column" to {
            column {
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
            }
        },
        "line-multi" to {
            line {
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
            }
        },
        "area" to {
            area {
                title("Area chart: site visits per day")
                area { name = "Visits"; data(listOf(point("Mon", 120), point("Tue", 180), point("Wed", 90), point("Thu", 240), point("Fri", 210), point("Sat", 60), point("Sun", 45))) }
                yScale { minimum = 0 }
            }
        },
        "bar" to {
            bar {
                title("Bar chart: top countries by population (millions)")
                bar { name = "Population"; data(listOf(point("India", 1428), point("China", 1425), point("USA", 340), point("Indonesia", 277), point("Pakistan", 240))) }
                yScale { minimum = 0 }
            }
        },
        "scatter-marker" to {
            scatter {
                title("Scatter: height vs weight")
                marker { name = "People"; data(listOf(point(160, 55), point(165, 61), point(170, 66), point(175, 72), point(180, 80), point(185, 84), point(190, 95))) }
                xAxis(0) { title("Height, cm") }
                yAxis(0) { title("Weight, kg") }
            }
        },
        "gauge-circular" to {
            circularGauge {
                title("Circular gauge: speed")
                data(listOf(65))
                startAngle(270)
                sweepAngle(180)
                axis(0) {
                    scale { minimum = 0; maximum = 100; ticks { interval = 10 } }
                    labels { position = "outside" }
                }
                needle(0) { enabled = true }
            }
        },
        "apostrophe-labels" to {
            pie {
                title("Labels that broke 1.x: quotes, backslash, unicode")
                data(listOf(point("Cote d'Ivoire", 30), point("O'Reilly \"Media\"", 25), point("Back\\slash", 20), point("Ñandú 日本 😀", 15), point("<script>alert(1)</script>", 10)))
                labels { position = "outside"; format = "{%x}" }
            }
        },
        "heatmap" to {
            heatMap {
                title("Heat map: visits by weekday and time")
                data(listOf(cell("Mon", "Morning", 12), cell("Mon", "Day", 30), cell("Mon", "Evening", 22), cell("Tue", "Morning", 15), cell("Tue", "Day", 28),
                    cell("Tue", "Evening", 25), cell("Wed", "Morning", 9), cell("Wed", "Day", 35), cell("Wed", "Evening", 19)))
                labels { enabled = true; format = "{%heat}" }
            }
        },
        "treemap" to {
            treeMap {
                title("Tree map: population by region (millions)")
                maxDepth(2)
                hintDepth(1)
                data(tree(node("World", children = listOf(
                    node("Europe", children = listOf(node("Germany", 83), node("France", 65), node("Italy", 59))),
                    node("Asia", children = listOf(node("Japan", 125), node("Vietnam", 98), node("Thailand", 72))),
                    node("Americas", children = listOf(node("Brazil", 216), node("Mexico", 128))),
                ))))
            }
        },
        "data-sheet" to {
            dataSheet {
                rowHeight(32); rowEvenFill("#ffffff"); rowOddFill("#f8f8f8"); rowHoverFill("#e8f0fe"); cellBorder("1px #e0e0e0"); cellPadding(8)
                headerFill("#f5f5f5"); rowSelectedFill("#d2e3fc"); groupHeaderFill("#e8eef7"); indentSize(20)
                column(0) { field("name"); title("Product"); width(160); minWidth(50); dataType("string") }
                column(1) { field("units"); title("Units"); width(100); minWidth(50); dataType("number") }
                column(2) { field("value"); title("Value"); width(120); minWidth(50); dataType("number") }
                sorting { enabled = true }
                header { enabled = true; height(40) }
                virtualScroll { enabled = true; bufferSize(10) }
                selection { enabled = true; mode("single") }
                filter { enabled = true }
                cellEditor { enabled = true }
                clipboard { enabled = true; includeHeaders(false) }
                search { enabled = true }
                data(listOf(
                    row("name" to "Tech", "units" to 408, "value" to 94120, "children" to listOf(
                        row("name" to "Laptop", "units" to 34, "value" to 40800), row("name" to "Monitor", "units" to 58, "value" to 17400),
                        row("name" to "Keyboard", "units" to 240, "value" to 19200), row("name" to "Headset", "units" to 76, "value" to 16720))),
                    row("name" to "Office", "units" to 140, "value" to 28520, "children" to listOf(
                        row("name" to "Chair", "units" to 120, "value" to 18000), row("name" to "Desk", "units" to 12, "value" to 5400),
                        row("name" to "Lamp", "units" to 0, "value" to 0), row("name" to "Cabinet", "units" to 8, "value" to 5120))),
                ))
            }
        },
        "arc-diagram" to {
            arcDiagram {
                title("Arc diagram: department traffic")
                data(listOf(flow("Sales", "Marketing", 9), flow("Sales", "Finance", 16), flow("Finance", "HR", 5), flow("Support", "Sales", 14), flow("Support", "Marketing", 6), flow("Marketing", "HR", 3)))
            }
        },
        "dependency-wheel" to {
            dependencyWheel {
                title("Dependency wheel: flights")
                data(listOf(flow("Paris", "Tokyo", 18), flow("Paris", "NYC", 14), flow("Paris", "Dubai", 8), flow("Tokyo", "NYC", 10), flow("Tokyo", "Dubai", 5), flow("NYC", "Cairo", 6), flow("Dubai", "Cairo", 4)))
            }
        },
        "dumbbell" to {
            dumbbell {
                title("Dumbbell: salary ranges")
                dumbbell { name = "Salary range"; data(listOf(range("Job A", 40000, 60000), range("Job B", 50000, 80000), range("Job C", 35000, 55000), range("Job D", 42000, 71000))) }
            }
        },
        "lollipop" to {
            lollipop {
                title("Lollipop: monthly sales")
                lollipop { name = "Sales"; data(listOf(point("January", 10000), point("February", 12000), point("March", 18000), point("April", 11000), point("May", 9000))) }
            }
        },
        "stream-graph" to {
            streamGraph {
                title("Stream graph: genres")
                val years = listOf("2019", "2020", "2021", "2022", "2023", "2024")
                area { name = "Rock"; data(years.zip(listOf(12, 15, 11, 18, 16, 21)).map { (x, v) -> point(x, v) }) }
                area { name = "Jazz"; data(years.zip(listOf(7, 9, 14, 12, 15, 13)).map { (x, v) -> point(x, v) }) }
                area { name = "Pop"; data(years.zip(listOf(4, 6, 8, 10, 13, 12)).map { (x, v) -> point(x, v) }) }
            }
        },
        "org-chart" to {
            orgChart {
                title("Org chart")
                data(tree(node("Sarah Johnson", null, "id" to "ceo", "title" to "CEO", children = listOf(
                    node("Michael Chen", null, "id" to "cto", "title" to "CTO", children = listOf(
                        node("David Kim", null, "id" to "eng", "title" to "Head of Engineering"),
                        node("Lisa Zhang", null, "id" to "prod", "title" to "Head of Product"))),
                    node("Emily Davis", null, "id" to "cfo", "title" to "CFO", children = listOf(node("Diana Ross", null, "id" to "acct", "title" to "Head of Accounting"))),
                    node("Robert Wilson", null, "id" to "coo", "title" to "COO", children = listOf(node("Peter Jackson", null, "id" to "ops", "title" to "Head of Operations"))),
                ))))
            }
        },
        "waffle" to {
            waffle {
                title("Waffle: sales channels")
                data(listOf(named("In-store", 43), named("Online", 31), named("Wholesale", 17), named("Other", 9)))
            }
        },
        "sankey" to {
            sankey {
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
            }
        },
    )

    // [from, to, weight]; a null `to` is a dropoff. The playground's energy flows sample.
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
}
