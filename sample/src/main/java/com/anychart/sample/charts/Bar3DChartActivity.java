package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class Bar3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian3d bar3d = AnyChart.bar3d();

        bar3d.setAnimation(true);

        bar3d.setPadding(10d, 40d, 5d, 20d);

        bar3d.setTitle("'Top 3 Products with Region Sales Data'");

        bar3d.getYScale().setMinimum(0d);

        bar3d.getXAxis().getLabels()
                .setRotation(-90d)
                .setPadding(0d, 0d, 20d, 0d);

        bar3d.getYAxis().getLabels().setFormat("'${%Value}{groupsSeparator: }'");

        bar3d.getYAxis().setTitle("'Revenue in Dollars'");

        bar3d.bar(new String[] {
                "{ 'x': 'Nail polish', 'value': 6229 }",
                "{ 'x': 'Eyebrow pencil', 'value': 9332 }",
                "{ 'x': 'Lipstick', 'value': 9256 }"
        }, TextParsingMode.CSV)
                .setName("'Florida'");

        bar3d.bar(new String[] {
                "{ x: 'Nail polish', value: 4376 }",
                "{ x: 'Eyebrow pencil', value: 8987 }",
                "{ x: 'Lipstick', value: 7376 }"
        }, TextParsingMode.CSV)
                .setName("'Texas'");

        bar3d.bar(new String[] {
                "{ x: 'Nail polish', value: 4054 }",
                "{ x: 'Eyebrow pencil', value: 5067 }",
                "{ x: 'Lipstick', value: 5054 }"
        }, TextParsingMode.CSV)
                .setName("'Arizona'");

        bar3d.bar(new String[] {
                "{ x: 'Nail polish', value: 2381 }",
                "{ x: 'Eyebrow pencil', value: 1401 }",
                "{ x: 'Lipstick', value: 981 }"
        }, TextParsingMode.CSV)
                .setName("'Nevada'");

        bar3d.getLegend().setEnabled(true);
        bar3d.getLegend().setFontSize(13d);
        bar3d.getLegend().setPadding(0d, 0d, 20d, 0d);

        bar3d.getInteractivity().setHoverMode(HoverMode.SINGLE);

        bar3d.getTooltip()
                .setPositionMode(TooltipPositionMode.POINT)
                .setPosition("'right'")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(0d)
                .setFormat("'${%Value}'");

        bar3d.setZAspect("'10%'")
                .setZPadding(20d)
                .setZAngle(45d)
                .setZDistribution(true);

        anyChartView.setChart(bar3d);
    }
}
