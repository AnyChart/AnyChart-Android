package com.anychart.core

import android.app.Activity
import android.os.Bundle

/**
 * An Activity that owns its AnyChartView the way an app does: created in onCreate with a stable id,
 * so the view's saved instance state is restored on recreation (rotation, process death).
 */
class ChartActivity : Activity() {
    lateinit var chart: AnyChartView
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        chart = AnyChartView(this).also { it.id = CHART_ID; it.listener = listener }
        setContentView(chart)
    }

    companion object {
        const val CHART_ID = 0x0ACC0001
        /** Installed on the view in onCreate, before any restore, like an app's own listener. */
        @Volatile var listener: AnyChartView.Listener? = null
    }
}
