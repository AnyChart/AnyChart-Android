package com.anychart.samplecore

import android.app.Activity
import android.os.Bundle
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import com.anychart.core.AnyChartEvent
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartView

/**
 * One tap drives three charts. The pie shows categories; tapping a slice sends an `update` to the
 * column chart (products of that category) and to the line chart (that category by month), without
 * reloading either. In 1.x this needed a single global listener and a reload per chart.
 */
class CoordinationActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val status = TextView(this).apply { text = "Tap a category slice. All categories shown."; setPadding(dp(12), dp(40), dp(12), dp(4)) }

        val pie = AnyChartView(this)
        val products = AnyChartView(this)
        val monthly = AnyChartView(this)

        var selected: String? = null
        fun apply() {
            products.update(Demo.rowsJson(Demo.productsIn(selected)).toString(), series = 0)
            monthly.update(Demo.rowsJson(Demo.monthlyFor(selected)).toString(), series = 0)
            status.text = if (selected == null) "Tap a category slice. All categories shown." else "$selected: products and months updated in place. Tap again to clear."
        }
        pie.listener = object : AnyChartView.Listener {
            override fun onEvent(event: AnyChartEvent) {
                if (event.name != "pointClick") return
                selected = if (selected == event.x?.toString()) null else event.x?.toString()
                apply()
            }
            override fun onError(error: AnyChartError) { val message = error.message; status.text = "error: $message" }
        }

        pie.load(Demo.pie("Sales by category", Demo.byCategory()))
        products.load(Demo.cartesian("column", "column", "Products", "Sales", Demo.productsIn(null)), events = emptyList())
        monthly.load(Demo.cartesian("line", "line", "By month", "Sales", Demo.monthlyFor(null)), events = emptyList())

        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; fitsSystemWindows = true
            addView(status)
            addView(pie, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1.2f))
            addView(products, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
            addView(monthly, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        })
    }
}
