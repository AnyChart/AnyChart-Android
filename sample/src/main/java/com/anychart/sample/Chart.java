package com.anychart.sample;

import android.content.res.Resources;

import com.anychart.sample.charts.Area3DChartActivity;
import com.anychart.sample.charts.AreaChartActivity;
import com.anychart.sample.charts.Bar3DChartActivity;
import com.anychart.sample.charts.BarChartActivity;
import com.anychart.sample.charts.BoxChartActivity;
import com.anychart.sample.charts.BubbleChartActivity;
import com.anychart.sample.charts.BubbleMapActivity;
import com.anychart.sample.charts.ChoroplethMapActivity;
import com.anychart.sample.charts.CircularGaugeActivity;
import com.anychart.sample.charts.Column3DChartActivity;
import com.anychart.sample.charts.ColumnChartActivity;
import com.anychart.sample.charts.CombinedChartActivity;
import com.anychart.sample.charts.ConnectorMapActivity;
import com.anychart.sample.charts.FunnelChartActivity;
import com.anychart.sample.charts.HeatMapChartActivity;
import com.anychart.sample.charts.HiloChartActivity;
import com.anychart.sample.charts.LineChartActivity;
import com.anychart.sample.charts.LinearColorScaleActivity;
import com.anychart.sample.charts.MekkoChartActivity;
import com.anychart.sample.charts.MosaicChartActivity;
import com.anychart.sample.charts.OHLCChartActivity;
import com.anychart.sample.charts.ParetoChartActivity;
import com.anychart.sample.charts.PertChartActivity;
import com.anychart.sample.charts.PieChartActivity;
import com.anychart.sample.charts.PointMapActivity;
import com.anychart.sample.charts.PolarChartActivity;
import com.anychart.sample.charts.PyramidActivity;
import com.anychart.sample.charts.QuadrantChartActivity;
import com.anychart.sample.charts.RadarChartActivity;
import com.anychart.sample.charts.RangeChartActivity;
import com.anychart.sample.charts.ResourceChartActivity;
import com.anychart.sample.charts.ScatterChartActivity;
import com.anychart.sample.charts.SunburstChartActivity;
import com.anychart.sample.charts.TagCloudActivity;
import com.anychart.sample.charts.ThermometerActivity;
import com.anychart.sample.charts.TreeMapChartActivity;
import com.anychart.sample.charts.TwoPiesOneColumnActivity;
import com.anychart.sample.charts.VennDiagramActivity;
import com.anychart.sample.charts.VerticalChartActivity;
import com.anychart.sample.charts.WaterfallChartActivity;
import com.anychart.sample.charts.WindDirectionActivity;
import com.anychart.sample.charts.WindSpeedActivity;

import java.util.ArrayList;

public class Chart {

    private String name;
    private Class activityClass;

    private Chart(String name, Class activityClass) {
        this.name = name;
        this.activityClass = activityClass;
    }

    public String getName() {
        return name;
    }

    Class getActivityClass() {
        return activityClass;
    }

    static ArrayList<Chart> createChartList(Resources resources) {
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
        chartList.add(new Chart(resources.getString(R.string.thermometer), ThermometerActivity.class));
        chartList.add(new Chart(resources.getString(R.string.linear_color_scale), LinearColorScaleActivity.class));
        chartList.add(new Chart(resources.getString(R.string.wind_speed), WindSpeedActivity.class));
        chartList.add(new Chart(resources.getString(R.string.wind_direction), WindDirectionActivity.class));
        chartList.add(new Chart(resources.getString(R.string.scatter_chart), ScatterChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.resource_chart), ResourceChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.radar_chart), RadarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.polar_chart), PolarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.range_chart), RangeChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.vertical_chart), VerticalChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.funnel_chart), FunnelChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pert_chart), PertChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.combined_chart), CombinedChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bubble_chart), BubbleChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pareto_chart), ParetoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pyramid_chart), PyramidActivity.class));
        chartList.add(new Chart(resources.getString(R.string.box_chart), BoxChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mosaic_chart), MosaicChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mekko_chart), MekkoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bar3d_chart), Bar3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.column3d_chart), Column3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.area3d_chart), Area3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.hilo_chart), HiloChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.ohlc_chart), OHLCChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.quadrant_chart), QuadrantChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.sunburst_chart), SunburstChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bubble_map), BubbleMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.choropleth_map), ChoroplethMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.point_map), PointMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.connector_map), ConnectorMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.two_pies_one_column), TwoPiesOneColumnActivity.class));
//        chartList.add(new Chart(resources.getString(R.string.gantt_chart), GanttChartActivity.class));

        return chartList;
    }

}
