package com.anychart.samplecore

import android.os.Bundle
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import com.anychart.compose.AnyChart
import com.anychart.core.AnyChartView

/** The same DSL chart twice: top through the Compose entry point, bottom through the View one. */
class SideBySideActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val chart = Gallery.chart("column")
        val composeLabel = TextView(this).apply { text = "Compose: AnyChart(chart = ...)"; setPadding(dp(12), dp(40), dp(12), dp(4)) }
        val composeSide = ComposeView(this).apply { setContent { AnyChart(chart = chart, modifier = Modifier.fillMaxSize()) } }
        val viewLabel = TextView(this).apply { text = "View: AnyChartView().load(chart)"; setPadding(dp(12), dp(8), dp(12), dp(4)) }
        val viewSide = AnyChartView(this).also { it.load(chart) }
        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; fitsSystemWindows = true
            addView(composeLabel)
            addView(composeSide, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
            addView(viewLabel)
            addView(viewSide, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        })
    }
}
