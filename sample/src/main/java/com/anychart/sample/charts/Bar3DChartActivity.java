package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Bar3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian3d bar3d = AnyChart.bar3d();

        bar3d.setAnimation(true);

        bar3d.setPadding(10d, 40d, 5d, 20d);

        bar3d.setTitle("Top 3 Products with Region Sales Data");

        bar3d.getYScale().setMinimum(0d);

        bar3d.getXAxis().getLabels()
                .setRotation(-90d)
                .setPadding(0d, 0d, 20d, 0d);

        bar3d.getYAxis().getLabels().setFormat("${%Value}{groupsSeparator: }");

        bar3d.getYAxis().setTitle("Revenue in Dollars");

        List<DataEntry> data = new ArrayList<>();
        data.add(new SingleValueDataEntry("Nail polish", 6229));
        data.add(new SingleValueDataEntry("Eyebrow pencil", 9332));
        data.add(new SingleValueDataEntry("Lipstick", 9256));

        bar3d.bar(data)
                .setName("Florida");

        data.clear();
        data.add(new SingleValueDataEntry("Nail polish", 4376));
        data.add(new SingleValueDataEntry("Eyebrow pencil", 8987));
        data.add(new SingleValueDataEntry("Lipstick", 7376));

        bar3d.bar(data)
                .setName("Texas");

        data.clear();
        data.add(new SingleValueDataEntry("Nail polish", 4054));
        data.add(new SingleValueDataEntry("Eyebrow pencil", 5067));
        data.add(new SingleValueDataEntry("Lipstick", 5054));

        bar3d.bar(data)
                .setName("Arizona");

        data.clear();
        data.add(new SingleValueDataEntry("Nail polish", 2381));
        data.add(new SingleValueDataEntry("Eyebrow pencil", 1401));
        data.add(new SingleValueDataEntry("Lipstick", 981));

        bar3d.bar(data)
                .setName("Nevada");

        bar3d.getLegend().setEnabled(true);
        bar3d.getLegend().setFontSize(13d);
        bar3d.getLegend().setPadding(0d, 0d, 20d, 0d);

        bar3d.getInteractivity().setHoverMode(HoverMode.SINGLE);

        bar3d.getTooltip()
                .setPositionMode(TooltipPositionMode.POINT)
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(0d)
                .setFormat("${%Value}");

        bar3d.setZAspect("10%")
                .setZPadding(20d)
                .setZAngle(45d)
                .setZDistribution(true);

        anyChartView.setChart(bar3d);
    }
}
