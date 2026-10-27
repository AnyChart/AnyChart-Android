package com.anychart.samplecore

import android.app.Activity
import android.os.Bundle
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import com.anychart.core.AnyChartEvent
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartView

/**
 * Three charts in one Activity, plain View system, each with its own listener. In 1.x the second
 * view stole the singleton and the first stayed blank (issues #24, #31, #41, #167, #216, #262).
 */
class MultiChartActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val column = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; fitsSystemWindows = true }
        val status = TextView(this).apply { text = "three views, three WebViews, no shared state"; setPadding(dp(12), dp(40), dp(12), dp(4)) }
        column.addView(status)
        val configs = listOf("pie.json", "column.json", "line-multi.json")
        for (name in configs) {
            val view = AnyChartView(this)
            view.listener = object : AnyChartView.Listener {
                override fun onRendered(chartId: String, millis: Long) { status.text = "$name rendered in $millis ms" }
                override fun onEvent(event: AnyChartEvent) { status.text = "$name: ${event.name} ${event.x} = ${event.value}" }
                override fun onError(error: AnyChartError) { val message = error.message; status.text = "$name error: $message" }
            }
            column.addView(view, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(300)))
            view.load(Demo.config(this, name))
        }
        setContentView(ScrollView(this).apply { addView(column) })
    }

    private fun dp(v: Int) = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt()
}
