package com.anychart.samplecore

import android.app.Activity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry

/**
 * The same pie through the 1.x library (module :anychart, untouched), timed the same way as
 * BenchmarkActivity, so the two libraries are compared in one app on one device. 1.x reports
 * "rendered" from the evaluateJavascript callback after its whole script ran; that is the
 * nearest equivalent of the 2.0 chartDraw signal.
 */
class LegacyBenchmarkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tCreate = SystemClock.uptimeMillis()
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val status = TextView(this).apply { text = "legacy benchmark…"; setPadding(dp(12), dp(40), dp(12), dp(4)) }

        val view = com.anychart.AnyChartView(this)
        val tView = SystemClock.uptimeMillis()
        view.setOnRenderedListener {
            val now = SystemClock.uptimeMillis()
            val app = PocApplication.appStartedAt
            val line = "mode=LEGACY appToCreate=${tCreate - app} viewCtor=${tView - tCreate} createToReady=-1 createToRendered=${now - tCreate} appToRendered=${now - app} pageDraw=-1"
            Log.i(PocApplication.TAG, line)
            status.text = line
        }

        val pie = AnyChart.pie()
        val data = ArrayList<DataEntry>()
        data.add(ValueDataEntry("Apples", 6371664))
        data.add(ValueDataEntry("Pears", 789622))
        data.add(ValueDataEntry("Bananas", 7216301))
        data.add(ValueDataEntry("Grapes", 1486621))
        data.add(ValueDataEntry("Oranges", 1200000))
        pie.data(data)
        pie.title("Fruits imported in 2015 (in kg)")
        pie.labels().position("outside")
        pie.legend().title().enabled(true)
        pie.legend().title().text("Retail channels").padding(0.0, 0.0, 10.0, 0.0)
        pie.legend().position("center-bottom").itemsLayout(com.anychart.enums.LegendLayout.HORIZONTAL).align(com.anychart.enums.Align.CENTER)

        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; fitsSystemWindows = true
            addView(status)
            addView(view, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        })
        view.setChart(pie)
    }
}
