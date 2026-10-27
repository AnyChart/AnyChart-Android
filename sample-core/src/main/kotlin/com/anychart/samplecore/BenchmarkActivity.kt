package com.anychart.samplecore

import android.app.Activity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartView

/**
 * One chart on a cold process, timed. Logs one ACBENCH line per run:
 *   mode, ms from Application start to Activity create, to the view's ready, to rendered,
 *   plus the page's own draw time, then a second load into the warm page.
 * Exported so adb can launch it directly; a benchmark hook in a demo app, not a product surface.
 */
class BenchmarkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tCreate = SystemClock.uptimeMillis()
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val status = TextView(this).apply { text = "benchmark ${PocApplication.mode}…"; setPadding(dp(12), dp(40), dp(12), dp(4)) }
        val view = PocApplication.prewarmed?.also { PocApplication.prewarmed = null } ?: AnyChartView(this)
        val tView = SystemClock.uptimeMillis()
        var tReady = 0L
        var firstDone = false
        view.listener = object : AnyChartView.Listener {
            override fun onReady(jsVersion: String) { tReady = SystemClock.uptimeMillis() }
            override fun onRendered(chartId: String, millis: Long) {
                val now = SystemClock.uptimeMillis()
                val app = PocApplication.appStartedAt
                if (!firstDone) {
                    firstDone = true
                    val line = "mode=${PocApplication.mode} appToCreate=${tCreate - app} viewCtor=${tView - tCreate} createToReady=${if (tReady > 0) tReady - tCreate else -1} createToRendered=${now - tCreate} appToRendered=${now - app} pageDraw=$millis"
                    Log.i(PocApplication.TAG, line); status.text = line
                    Log.i(PocApplication.TAG, "mode=${PocApplication.mode} pageTiming=${view.pageTiming}")
                    view.load(Gallery.chart("column"), chartId = "second", events = emptyList())
                } else {
                    val line = "mode=${PocApplication.mode} secondLoadPageDraw=$millis"
                    Log.i(PocApplication.TAG, line); status.append("\n$line")
                }
            }
            override fun onError(error: AnyChartError) { val message = error.message; Log.e(PocApplication.TAG, "error $message"); status.text = "error: $message" }
        }
        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; fitsSystemWindows = true
            addView(status)
            addView(view, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        })
        view.load(Gallery.chart("pie"))
    }
}
