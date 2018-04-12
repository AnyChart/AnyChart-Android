package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesArea;
import com.anychart.anychart.Crosshair;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.Set;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class AreaChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian areaChart = AnyChart.area();

        areaChart.setAnimation(true);

        Crosshair crosshair = areaChart.getCrosshair();
        crosshair.setEnabled(true);
        crosshair.setYStroke((Stroke) null, null, null, null, null)
                .setXStroke("#fff", 1d, null, null, null)
                .setZIndex(39d);
        crosshair.getYLabel(0).setEnabled(true);

        areaChart.getYScale().setStackMode(ScaleStackMode.VALUE);

        areaChart.setTitle("Unaudited Apple Inc. Revenue by Operating Segments");

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new CustomDataEntry("Q2 2014", 17.982, 10.941, 9.835, 4.047, 2.841));
        seriesData.add(new CustomDataEntry("Q3 2014", 17.574, 8.659, 6.230, 2.627, 2.242));
        seriesData.add(new CustomDataEntry("Q4 2014", 19.75, 10.35, 6.292, 3.595, 2.136));
        seriesData.add(new CustomDataEntry("Q1 2015", 30.6, 17.2, 16.1, 5.4, 5.2));
        seriesData.add(new CustomDataEntry("Q2 2015", 21.316, 12.204, 16.823, 3.457, 4.210));
        seriesData.add(new CustomDataEntry("Q3 2015", 20.209, 10.342, 13.23, 2.872, 2.959));
        seriesData.add(new CustomDataEntry("Q4 2015", 21.773, 10.577, 12.518, 3.929, 2.704));
        seriesData.add(new CustomDataEntry("Q1 2016", 29.3, 17.9, 18.4, 4.8, 5.4));

        Set set = new Set(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping series4Data = set.mapAs("{ x: 'x', value: 'value4' }");
        Mapping series5Data = set.mapAs("{ x: 'x', value: 'value5' }");

        CartesianSeriesArea series1 = areaChart.area(series1Data);
        series1.setName("Americas");
        series1.setStroke("#fff", 3d, null, null, null);
        series1.getHovered().setStroke("#fff", 3d, null, null, null);
        series1.getHovered().getMarkers().setEnabled(true);
        series1.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series1.getMarkers().setZIndex(100d);

        CartesianSeriesArea series2 = areaChart.area(series2Data);
        series2.setName("Europe");
        series2.setStroke("#fff", 3d, null, null, null);
        series2.getHovered().setStroke("#fff", 3d, null, null, null);
        series2.getHovered().getMarkers().setEnabled(true);
        series2.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series2.getMarkers().setZIndex(100d);

        CartesianSeriesArea series3 = areaChart.area(series3Data);
        series3.setName("Greater China");
        series3.setStroke("#fff", 3d, null, null, null);
        series3.getHovered().setStroke("#fff", 3d, null, null, null);
        series3.getHovered().getMarkers().setEnabled(true);
        series3.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series3.getMarkers().setZIndex(100d);

        CartesianSeriesArea series4 = areaChart.area(series4Data);
        series4.setName("Japan");
        series4.setStroke("#fff", 3d, null, null, null);
        series4.getHovered().setStroke("#fff", 3d, null, null, null);
        series4.getHovered().getMarkers().setEnabled(true);
        series4.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series4.getMarkers().setZIndex(100d);

        CartesianSeriesArea series5 = areaChart.area(series5Data);
        series5.setName("Rest of Asia Pacific");
        series5.setStroke("#fff", 3d, null, null, null);
        series5.getHovered().setStroke("#fff", 3d, null, null, null);
        series5.getHovered().getMarkers().setEnabled(true);
        series5.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series5.getMarkers().setZIndex(100d);

        areaChart.getLegend().setEnabled(true);
        areaChart.getLegend().setFontSize(13d);
        areaChart.getLegend().setPadding(0d, 0d, 20d, 0d);

        areaChart.getXAxis().setTitle(false);
        areaChart.getYAxis().setTitle("Revenue (in Billons USD)");

        areaChart.getInteractivity().setHoverMode(HoverMode.BY_X);
        areaChart.getTooltip()
                .setValuePrefix("$")
                .setValuePostfix(" bln.")
                .setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(areaChart);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2, Number value3, Number value4, Number value5) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
            setValue("value4", value4);
            setValue("value5", value5);
        }
    }
}
