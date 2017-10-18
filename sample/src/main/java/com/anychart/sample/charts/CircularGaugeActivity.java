package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Circular;
import com.anychart.anychart.CircularGauge;
import com.anychart.anychart.Fill;
import com.anychart.anychart.GaugePointersBar;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TextHAlign;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class CircularGaugeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        CircularGauge circularGauge = AnyChart.circular();
        circularGauge.setData(new String[] { "23", "34", "67", "93", "56", "100" }, TextParsingMode.CSV);
        circularGauge.setFill("'#fff'")
                .setStroke((Stroke) null, null, null, null, null)
                .setPadding(0d, 0d, 0d, 0d)
                .setMargin(100d, 100d, 100d, 100d);
        circularGauge.setStartAngle(0d);
        circularGauge.setSweepAngle(270d);

        Circular xAxis = circularGauge.getAxis()
                .setRadius(100d)
                .setWidth(1d)
                .setFill((Fill) null);
        xAxis.getScale()
                .setMinimum(0d)
                .setMaximum(100d);
        xAxis.setTicks("{ interval: 1 }")
                .setMinorTicks("{ interval: 1 }");
        xAxis.getLabels().setEnabled(false);
        xAxis.getTicks().setEnabled(false);
        xAxis.getMinorTicks().setEnabled(false);

        // TODO no getLabel(i)
//        circularGauge.getLabel(1)
        GaugePointersBar bar0 = circularGauge.getBar(0d);
        bar0.setDataIndex(0d);
        bar0.setRadius(100d);
        bar0.setWidth(17d);
        bar0.setFill(new SolidFill("'#64b5f6'", 1d));
        bar0.setStroke((Stroke) null, null, null, null, null);
        bar0.setZIndex(5d);
        GaugePointersBar bar100 = circularGauge.getBar(100d);
        bar100.setDataIndex(5d);
        bar100.setRadius(100d);
        bar100.setWidth(17d);
        bar100.setFill(new SolidFill("'#F5F4F4'", 1d));
        bar100.setStroke("'#e5e4e4'", 1d, null, null, null);
        bar100.setZIndex(4d);

        GaugePointersBar bar1 = circularGauge.getBar(1d);
        bar1.setDataIndex(1d);
        bar1.setRadius(80d);
        bar1.setWidth(17d);
        bar1.setFill(new SolidFill("'#1976d2'", 1d));
        bar1.setStroke((Stroke) null, null, null, null, null);
        bar1.setZIndex(5d);
        GaugePointersBar bar101 = circularGauge.getBar(101d);
        bar101.setDataIndex(5d);
        bar101.setRadius(80d);
        bar101.setWidth(17d);
        bar101.setFill(new SolidFill("'#F5F4F4'", 1d));
        bar101.setStroke("'#e5e4e4'", 1d, null, null, null);
        bar101.setZIndex(4d);

        GaugePointersBar bar2 = circularGauge.getBar(2d);
        bar2.setDataIndex(2d);
        bar2.setRadius(60d);
        bar2.setWidth(17d);
        bar2.setFill(new SolidFill("'#ef6c00'", 1d));
        bar2.setStroke((Stroke) null, null, null, null, null);
        bar2.setZIndex(5d);
        GaugePointersBar bar102 = circularGauge.getBar(102d);
        bar102.setDataIndex(5d);
        bar102.setRadius(60d);
        bar102.setWidth(17d);
        bar102.setFill(new SolidFill("'#F5F4F4'", 1d));
        bar102.setStroke("'#e5e4e4'", 1d, null, null, null);
        bar102.setZIndex(4d);

        GaugePointersBar bar3 = circularGauge.getBar(3d);
        bar3.setDataIndex(3d);
        bar3.setRadius(40d);
        bar3.setWidth(17d);
        bar3.setFill(new SolidFill("'#ffd54f'", 1d));
        bar3.setStroke((Stroke) null, null, null, null, null);
        bar3.setZIndex(5d);
        GaugePointersBar bar103 = circularGauge.getBar(103d);
        bar103.setDataIndex(5d);
        bar103.setRadius(40d);
        bar103.setWidth(17d);
        bar103.setFill(new SolidFill("'#F5F4F4'", 1d));
        bar103.setStroke("'#e5e4e4'", 1d, null, null, null);
        bar103.setZIndex(4d);

        GaugePointersBar bar4 = circularGauge.getBar(4d);
        bar4.setDataIndex(4d);
        bar4.setRadius(20d);
        bar4.setWidth(17d);
        bar4.setFill(new SolidFill("'#455a64'", 1d));
        bar4.setStroke((Stroke) null, null, null, null, null);
        bar4.setZIndex(5d);
        GaugePointersBar bar104 = circularGauge.getBar(104d);
        bar104.setDataIndex(5d);
        bar104.setRadius(20d);
        bar104.setWidth(17d);
        bar104.setFill(new SolidFill("'#F5F4F4'", 1d));
        bar104.setStroke("'#e5e4e4'", 1d, null, null, null);
        bar104.setZIndex(4d);

        circularGauge.setMargin(50d, 50d, 50d, 50d);
        circularGauge.getTitle()
                .setText("'Medicine manufacturing progress' +\n" +
                        "    '<br/><span style=\"color:#929292; font-size: 12px;\">(ACME CORPORATION)</span>'")
                .setUseHtml(true);
        circularGauge.getTitle().setEnabled(true);
        circularGauge.getTitle().setHAlign(TextHAlign.CENTER);
        circularGauge.getTitle()
                .setPadding(0d, 0d, 0d, 0d)
                .setMargin(0d, 0d, 20d, 0d);

        anyChartView.setChart(circularGauge);
    }
}
