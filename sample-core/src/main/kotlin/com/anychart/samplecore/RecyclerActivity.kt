package com.anychart.samplecore

import android.app.Activity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anychart.core.AnyChartView

/**
 * Forty rows, each with its own chart, in a RecyclerView. The holders are recycled, so only the
 * visible rows plus the cache hold a WebView; a recycled holder loads the next row's config into
 * the WebView it already has. 1.x: issues #179, #210, #240 ("white space in recyclerview").
 */
class RecyclerActivity : Activity() {
    private var created = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val status = TextView(this).apply { setPadding(dp(12), dp(40), dp(12), dp(4)) }
        fun refresh() { status.text = "40 rows, $created WebViews created so far (recycled holders reuse theirs)" }
        refresh()

        class Holder(val chart: AnyChartView, val label: TextView, root: LinearLayout) : RecyclerView.ViewHolder(root)

        val list = RecyclerView(this).apply {
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            adapter = object : RecyclerView.Adapter<Holder>() {
                override fun getItemCount() = 40
                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
                    created++; refresh()
                    val label = TextView(parent.context).apply { setPadding(dp(12), dp(8), dp(12), 0) }
                    val chart = AnyChartView(parent.context)
                    val root = LinearLayout(parent.context).apply {
                        orientation = LinearLayout.VERTICAL
                        layoutParams = RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, dp(180))
                        addView(label)
                        addView(chart, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
                    }
                    return Holder(chart, label, root)
                }
                override fun onBindViewHolder(holder: Holder, position: Int) {
                    holder.label.text = "Row ${position + 1}"
                    val type = if (position % 2 == 0) "line" else "column"
                    holder.chart.load(Demo.cartesian(type, type, "", "row ${position + 1}", Demo.sparkRows(position)), events = emptyList())
                }
            }
        }
        setContentView(LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL; fitsSystemWindows = true
            addView(status)
            addView(list, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        })
    }
}
