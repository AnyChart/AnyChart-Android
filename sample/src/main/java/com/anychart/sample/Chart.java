package com.anychart.sample;

import android.content.res.Resources;

import com.anychart.sample.charts.AreaChartActivity;
import com.anychart.sample.charts.Bar3DChartActivity;
import com.anychart.sample.charts.BarChartActivity;
import com.anychart.sample.charts.BoxChartActivity;
import com.anychart.sample.charts.BubbleChartActivity;
import com.anychart.sample.charts.CircularGaugeActivity;
import com.anychart.sample.charts.ColumnChartActivity;
import com.anychart.sample.charts.FunnelChartActivity;
import com.anychart.sample.charts.HeatMapChartActivity;
import com.anychart.sample.charts.LineChartActivity;
import com.anychart.sample.charts.MekkoChartActivity;
import com.anychart.sample.charts.MosaicChartActivity;
import com.anychart.sample.charts.ParetoChartActivity;
import com.anychart.sample.charts.PertChartActivity;
import com.anychart.sample.charts.PieChartActivity;
import com.anychart.sample.charts.PolarChartActivity;
import com.anychart.sample.charts.PyramidActivity;
import com.anychart.sample.charts.RadarChartActivity;
import com.anychart.sample.charts.RangeChartActivity;
import com.anychart.sample.charts.ResourceChartActivity;
import com.anychart.sample.charts.ScatterChartActivity;
import com.anychart.sample.charts.TagCloudActivity;
import com.anychart.sample.charts.TreeMapChartActivity;
import com.anychart.sample.charts.VennDiagramActivity;
import com.anychart.sample.charts.VerticalChartActivity;
import com.anychart.sample.charts.WaterfallChartActivity;

import java.util.ArrayList;

/**
 * Created by arseny on 9/12/17.
 */

public class Chart {

    private String name;
    private Class activityClass;

    public Chart(String name, Class activityClass) {
        this.name = name;
        this.activityClass = activityClass;
    }

    public String getName() {
        return name;
    }

    public Class getActivityClass() {
        return activityClass;
    }

    public static ArrayList<Chart> createChartList(Resources resources) {
        ArrayList<Chart> chartList = new ArrayList<>();

        chartList.add(new Chart(resources.getString(R.string.pie_chart), PieChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.column_chart), ColumnChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.line_chart), LineChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.area_chart), AreaChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bar_chart), BarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.venn_diagram), VennDiagramActivity.class));
        chartList.add(new Chart(resources.getString(R.string.heat_map_chart), HeatMapChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.tag_cloud), TagCloudActivity.class));
        chartList.add(new Chart(resources.getString(R.string.waterfall_chart), WaterfallChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.tree_map_chart), TreeMapChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.circular_gauge), CircularGaugeActivity.class));
        chartList.add(new Chart(resources.getString(R.string.scatter_chart), ScatterChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.resource_chart), ResourceChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.radar_chart), RadarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.polar_chart), PolarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.range_chart), RangeChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.vertical_chart), VerticalChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.funnel_chart), FunnelChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pert_chart), PertChartActivity.class));
//        chartList.add(new Chart(resources.getString(R.string.combined_chart), CombinedChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bubble_chart), BubbleChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pareto_chart), ParetoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pyramid_chart), PyramidActivity.class));
        chartList.add(new Chart(resources.getString(R.string.box_chart), BoxChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mosaic_chart), MosaicChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mekko_chart), MekkoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bar3d_chart), Bar3DChartActivity.class));
//        chartList.add(new Chart(resources.getString(R.string.gantt_chart), GanttChartActivity.class));

        return chartList;
    }

}
