package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.CircularGauge;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.SingleValueDataSet;
import com.anychart.anychart.TextHAlign;
import com.anychart.sample.R;

public class WindDirectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        CircularGauge circularGauge = AnyChart.circular();
        circularGauge.setFill("#fff")
                .setStroke("null")
                .setPadding(0, 0, 0, 0)
                .setMargin(30, 30, 30, 30);
        circularGauge.setStartAngle(0)
                .setSweepAngle(360);

        circularGauge.setData(new SingleValueDataSet(new Double[] { 18.1 }));

        circularGauge.getAxis()
                .setStartAngle(0)
                .setRadius(80)
                .setSweepAngle(360)
                .setWidth(3)
                .setDrawFirstLabel(false)
                .setTicks("{ type: 'line', length: 4, position: 'outside' }");

        circularGauge.getAxis().getLabels()
                .setPosition("outside")
                .setUseHtml(true);
        circularGauge.getAxis().getLabels().setFormat(
                "function () {\n" +
                "    return this.value + '&deg;'\n" +
                "  }");

        circularGauge.getAxis().getScale()
                .setMinimum(0)
                .setMaximum(360);
        circularGauge.getAxis().getScale()
                .setTicks("{interval: 45}")
                .setMinorTicks("{interval: 10}");

        circularGauge.getMarker()
                .setFill("#64b5f6")
                .setStroke("null");
        circularGauge.getMarker()
                .setSize(7)
                .setRadius(80);

        circularGauge.getLabel(0)
                .setText("<span style=\"font-size: 25\">Wind Direction</span>")
                .setUseHtml(true)
                .setHAlign(TextHAlign.CENTER);
        circularGauge.getLabel(0)
                .setAnchor(EnumsAnchor.CENTER_TOP)
                .setOffsetY(50)
                .setPadding(15, 20, 0, 0);

        circularGauge.getLabel(1)
                .setText("<span style=\"font-size: 20\">18.1</span>")
                .setUseHtml(true)
                .setHAlign(TextHAlign.CENTER);
        circularGauge.getLabel(1)
                .setAnchor(EnumsAnchor.CENTER_TOP)
                .setOffsetY(-20)
                .setPadding(5, 10, 0, 0)
                .setBackground("{fill: 'none', stroke: '#c1c1c1', corners: 3, cornerType: 'ROUND'}");

        anyChartView.setChart(circularGauge);
    }
}
