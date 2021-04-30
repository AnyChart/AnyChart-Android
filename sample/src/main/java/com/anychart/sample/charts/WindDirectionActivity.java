package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.SingleValueDataSet;
import com.anychart.charts.CircularGauge;
import com.anychart.enums.Anchor;
import com.anychart.graphics.vector.SolidFill;
import com.anychart.graphics.vector.text.HAlign;
import com.anychart.sample.R;

public class WindDirectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        CircularGauge circularGauge = AnyChart.circular();
        circularGauge.fill("#fff")
                .stroke("null")
                .padding(0, 0, 0, 0)
                .margin(30, 30, 30, 30)
                .startAngle(0)
                .sweepAngle(360);

        circularGauge.data(new SingleValueDataSet(new Double[] { 18.1 }));

        circularGauge.axis(0)
                .startAngle(0)
                .radius(80)
                .sweepAngle(360)
                .width(3)
                .drawFirstLabel(false)
                .ticks("{ type: 'line', length: 4, position: 'outside' }");

        circularGauge.axis(0).labels()
                .position("outside")
                .useHtml(true);
        circularGauge.axis(0).labels().format(
                "function () {\n" +
                "    return this.value + '&deg;'\n" +
                "  }");

        circularGauge.axis(0).scale()
                .minimum(0)
                .maximum(360);
        circularGauge.axis(0).scale()
                .ticks("{interval: 45}")
                .minorTicks("{interval: 10}");

        circularGauge.marker(0)
                .fill(new SolidFill("#64b5f6", 1))
                .stroke("null");
        circularGauge.marker(0)
                .size(7)
                .radius(80);

        circularGauge.label(0)
                .text("<span style=\"font-size: 25\">Wind Direction</span>")
                .useHtml(true)
                .hAlign(HAlign.CENTER);
        circularGauge.label(0)
                .anchor(Anchor.CENTER_TOP)
                .offsetY(50)
                .padding(15, 20, 0, 0);

        circularGauge.label(1)
                .text("<span style=\"font-size: 20\">18.1</span>")
                .useHtml(true)
                .hAlign(HAlign.CENTER);
        circularGauge.label(1)
                .anchor(Anchor.CENTER_TOP)
                .offsetY(-20)
                .padding(5, 10, 0, 0)
                .background("{fill: 'none', stroke: '#c1c1c1', corners: 3, cornerType: 'ROUND'}");

        anyChartView.setChart(circularGauge);
    }
}
