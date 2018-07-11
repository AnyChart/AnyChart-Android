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

public class WindSpeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        CircularGauge circularGauge = AnyChart.circular();
        circularGauge.setFill("#fff")
                .setStroke(null)
                .setPadding(0, 0, 0, 0)
                .setMargin(30, 30, 30, 30);
        circularGauge.setStartAngle(0)
                .setSweepAngle(360);

        double currentValue = 13.8D;
        circularGauge.setData(new SingleValueDataSet(new Double[] { currentValue }));

        circularGauge.getAxis()
                .setStartAngle(-150)
                .setRadius(80)
                .setSweepAngle(300)
                .setWidth(3)
                .setTicks("{ type: 'line', length: 4, position: 'outside' }");

        circularGauge.getAxis().getLabels().setPosition("outside");

        circularGauge.getAxis().getScale()
                .setMinimum(0)
                .setMaximum(140);

        circularGauge.getAxis().getScale()
                .setTicks("{interval: 10}")
                .setMinorTicks("{interval: 10}");

        circularGauge.getNeedle().setStroke(null);
        circularGauge.getNeedle()
                .setStartRadius("6%")
                .setEndRadius("38%")
                .setStartWidth("2%")
                .setEndWidth(0);

        circularGauge.getCap()
                .setRadius("4%")
                .setEnabled(true);
        circularGauge.getCap().setStroke(null);

        circularGauge.getLabel(0)
                .setText("<span style=\"font-size: 25\">Wind Speed</span>")
                .setUseHtml(true)
                .setHAlign(TextHAlign.CENTER);
        circularGauge.getLabel(0)
                .setAnchor(EnumsAnchor.CENTER_TOP)
                .setOffsetY(100)
                .setPadding(15, 20, 0, 0);

        circularGauge.getLabel(1)
                .setText("<span style=\"font-size: 20\">" + currentValue + "</span>")
                .setUseHtml(true)
                .setHAlign(TextHAlign.CENTER);
        circularGauge.getLabel(1)
                .setAnchor(EnumsAnchor.CENTER_TOP)
                .setOffsetY(-100)
                .setPadding(5, 10, 0, 0)
                .setBackground("{fill: 'none', stroke: '#c1c1c1', corners: 3, cornerType: 'ROUND'}");

        circularGauge.setRange(0,
                "{\n" +
                "    from: 0,\n" +
                "    to: 25,\n" +
                "    position: 'inside',\n" +
                "    fill: 'green 0.5',\n" +
                "    stroke: '1 #000',\n" +
                "    startSize: 6,\n" +
                "    endSize: 6,\n" +
                "    radius: 80,\n" +
                "    zIndex: 1\n" +
                "  }");

        circularGauge.setRange(1,
                "{\n" +
                "    from: 80,\n" +
                "    to: 140,\n" +
                "    position: 'inside',\n" +
                "    fill: 'red 0.5',\n" +
                "    stroke: '1 #000',\n" +
                "    startSize: 6,\n" +
                "    endSize: 6,\n" +
                "    radius: 80,\n" +
                "    zIndex: 1\n" +
                "  }");

        anyChartView.setChart(circularGauge);
    }
}
