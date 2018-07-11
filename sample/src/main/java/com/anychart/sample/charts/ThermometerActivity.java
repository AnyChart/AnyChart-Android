package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsLinearGauge;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.Position;
import com.anychart.anychart.ScalesBase;
import com.anychart.anychart.ScalesLinear;
import com.anychart.anychart.SingleValueDataSet;
import com.anychart.sample.R;

public class ThermometerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        ChartsLinearGauge linearGauge = AnyChart.linear();

        linearGauge.setData(new SingleValueDataSet(new Integer[] { 2 }));

        linearGauge.getTooltip()
                .setUseHtml(true)
                .setFormat(
                        "function () {\n" +
                        "          return this.value + '&deg;' + 'C' +\n" +
                        "            ' (' + (this.value * 1.8 + 32).toFixed(1) +\n" +
                        "            '&deg;' + 'F' + ')'\n" +
                        "    }");

        linearGauge.getLabel(0).setUseHtml(true);
        linearGauge.getLabel(0)
                .setText("C&deg;")
                .setPosition(Position.LEFT_BOTTOM)
                .setAnchor(EnumsAnchor.LEFT_BOTTOM)
                .setOffsetY("20px")
                .setOffsetX("38%")
                .setFontColor("black")
                .setFontSize(17);

        linearGauge.getLabel(1).setUseHtml(true);
        linearGauge.getLabel(1)
                .setText("F&deg;")
                .setPosition(Position.RIGHT_BOTTOM)
                .setAnchor(EnumsAnchor.RIGHT_BOTTOM)
                .setOffsetY("20px")
                .setOffsetX("47.5%")
                .setFontColor("black")
                .setFontSize(17);

        ScalesBase scale = linearGauge.getScale()
                .setMinimum(-30)
                .setMaximum(40);
//                .setTicks

        linearGauge.getAxis().setScale(scale);
        linearGauge.getAxis()
                .setOffset("-1%")
                .setWidth("0.5%");

        linearGauge.getAxis().getLabels()
                .setFormat("{%Value}&deg;")
                .setUseHtml(true);

        linearGauge.thermometer(0)
                .setName("Thermometer")
                .setId(1);

        linearGauge.getAxis(0).setMinorTicks(true);
        linearGauge.getAxis(0).getLabels()
                .setFormat(
                        "function () {\n" +
                        "    return '<span style=\"color:black;\">' + this.value + '&deg;</span>'\n" +
                        "  }")
                .setUseHtml(true);

        linearGauge.getAxis(1).setMinorTicks(true);
        linearGauge.getAxis(1).getLabels()
                .setFormat(
                        "function () {\n" +
                        "    return '<span style=\"color:black;\">' + this.value + '&deg;</span>'\n" +
                        "  }")
                .setUseHtml(true);
        linearGauge.getAxis(1)
                .setOffset("3.5%")
                .setOrientation(Orientation.RIGHT);

        ScalesLinear linear = new ScalesLinear();
        linear.setMinimum(-20)
                .setMaximum(100);
//                .setTicks
        linearGauge.getAxis(1).setScale(linear);

        anyChartView.setChart(linearGauge);
    }
}
