package com.anychart.samplecore

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.anychart.core.AnyChartEvent
import com.anychart.core.AnyChartError
import com.anychart.core.AnyChartView

/**
 * Charts inside Fragments in a ViewPager2. 1.x officially did not support Fragments (issues #77,
 * #78, #165, #174, #181, #228, #257): detach and reattach left the chart blank. Swipe back and
 * forth; every page keeps its chart.
 */
class FragmentsActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pager = ViewPager2(this).apply {
            fitsSystemWindows = true
            adapter = object : FragmentStateAdapter(this@FragmentsActivity) {
                override fun getItemCount() = PAGES.size
                override fun createFragment(position: Int) = ChartFragment.create(PAGES[position])
            }
        }
        setContentView(pager)
    }

    companion object {
        val PAGES = listOf("pie.json", "column.json", "heatmap.json", "treemap.json", "gauge-circular.json", "org-chart.json")
    }
}

class ChartFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val name = requireArguments().getString(ARG)!!
        val ctx = requireContext()
        val dp = { v: Int -> TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, v.toFloat(), resources.displayMetrics).toInt() }
        val status = TextView(ctx).apply { text = "page $name: swipe"; setPadding(dp(12), dp(40), dp(12), dp(4)) }
        val chart = AnyChartView(ctx)
        chart.listener = object : AnyChartView.Listener {
            override fun onRendered(chartId: String, millis: Long) { status.text = "$name rendered in $millis ms (fragment ${this@ChartFragment.hashCode() % 1000})" }
            override fun onEvent(event: AnyChartEvent) { status.text = "$name: ${event.name} ${event.x ?: ""} ${event.value ?: ""}" }
            override fun onError(error: AnyChartError) { val message = error.message; status.text = "$name error: $message" }
        }
        chart.load(Demo.config(ctx, name))
        return LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            addView(status)
            addView(chart, LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f))
        }
    }

    companion object {
        private const val ARG = "config"
        fun create(config: String) = ChartFragment().apply { arguments = Bundle().apply { putString(ARG, config) } }
    }
}
