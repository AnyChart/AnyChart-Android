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
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TooltipDisplayMode;
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
        crosshair.getYLabel().setEnabled(true);

        areaChart.getYScale().setStackMode(ScaleStackMode.VALUE);

        areaChart.setTitle("Unaudited Apple Inc. Revenue by Operating Segments");

        List<DataEntry> series1Data = new ArrayList<>();

        series1Data.add(new ValueDataEntry("Q2 2014", 17.982));
        series1Data.add(new ValueDataEntry("Q3 2014", 17.574));
        series1Data.add(new ValueDataEntry("Q4 2014", 19.75));
        series1Data.add(new ValueDataEntry("Q1 2015", 30.6));
        series1Data.add(new ValueDataEntry("Q2 2015", 21.316));
        series1Data.add(new ValueDataEntry("Q3 2015", 20.209));
        series1Data.add(new ValueDataEntry("Q4 2015", 21.773));
        series1Data.add(new ValueDataEntry("Q1 2016", 29.3));

        CartesianSeriesArea series1 = areaChart.area(series1Data);
        series1.setName("Americas");
        series1.setStroke("#fff", 3d, null, null, null);
        // TODO function in Fill
//        return this.sourceColor + ' 0.8'
//        series1.setFill(new SolidFill())
        series1.getHovered().setStroke("#fff", 3d, null, null, null);
        series1.getHovered().getMarkers().setEnabled(true);
        series1.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d)
                .setStroke("#fff", 1.5d, null, null, null);
        series1.getMarkers().setZIndex(100d);

        List<DataEntry> series2Data = new ArrayList<>();

        series2Data.add(new ValueDataEntry("Q2 2014", 10.941));
        series2Data.add(new ValueDataEntry("Q3 2014", 8.659));
        series2Data.add(new ValueDataEntry("Q4 2014", 10.35));
        series2Data.add(new ValueDataEntry("Q1 2015", 17.2));
        series2Data.add(new ValueDataEntry("Q2 2015", 12.204));
        series2Data.add(new ValueDataEntry("Q3 2015", 10.342));
        series2Data.add(new ValueDataEntry("Q4 2015", 10.577));
        series2Data.add(new ValueDataEntry("Q1 2016", 17.9));

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

        List<DataEntry> series3Data = new ArrayList<>();

        series3Data.add(new ValueDataEntry("Q2 2014", 9.835));
        series3Data.add(new ValueDataEntry("Q3 2014", 6.230));
        series3Data.add(new ValueDataEntry("Q4 2014", 6.292));
        series3Data.add(new ValueDataEntry("Q1 2015", 16.1));
        series3Data.add(new ValueDataEntry("Q2 2015", 16.823));
        series3Data.add(new ValueDataEntry("Q3 2015", 13.23));
        series3Data.add(new ValueDataEntry("Q4 2015", 12.518));
        series3Data.add(new ValueDataEntry("Q1 2016", 18.4));

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

        List<DataEntry> series4Data = new ArrayList<>();

        series4Data.add(new ValueDataEntry("Q2 2014", 4.047));
        series4Data.add(new ValueDataEntry("Q3 2014", 2.627));
        series4Data.add(new ValueDataEntry("Q4 2014", 3.595));
        series4Data.add(new ValueDataEntry("Q1 2015", 5.4));
        series4Data.add(new ValueDataEntry("Q2 2015", 3.457));
        series4Data.add(new ValueDataEntry("Q3 2015", 2.872));
        series4Data.add(new ValueDataEntry("Q4 2015", 3.929));
        series4Data.add(new ValueDataEntry("Q1 2016", 4.8));

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

        List<DataEntry> series5Data = new ArrayList<>();

        series5Data.add(new ValueDataEntry("Q2 2014", 2.841));
        series5Data.add(new ValueDataEntry("Q3 2014", 2.242));
        series5Data.add(new ValueDataEntry("Q4 2014", 2.136));
        series5Data.add(new ValueDataEntry("Q1 2015", 5.2));
        series5Data.add(new ValueDataEntry("Q2 2015", 4.210));
        series5Data.add(new ValueDataEntry("Q3 2015", 2.959));
        series5Data.add(new ValueDataEntry("Q4 2015", 2.704));
        series5Data.add(new ValueDataEntry("Q1 2016", 5.4));

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
}
