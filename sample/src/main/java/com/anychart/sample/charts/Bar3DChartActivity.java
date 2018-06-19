package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Set;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Bar3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

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
        data.add(new CustomDataEntry("Nail polish", 6229, 4376, 4054, 2381));
        data.add(new CustomDataEntry("Eyebrow pencil", 9332, 8987, 5067, 1401));
        data.add(new CustomDataEntry("Lipstick", 9256, 7376, 5054, 981));

        Set set = new Set(data);
        Mapping bar1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping bar2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping bar3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping bar4Data = set.mapAs("{ x: 'x', value: 'value4' }");

        bar3d.bar(bar1Data)
                .setName("Florida");

        bar3d.bar(bar2Data)
                .setName("Texas");

        bar3d.bar(bar3Data)
                .setName("Arizona");

        bar3d.bar(bar4Data)
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

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2, Number value3, Number value4) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
            setValue("value4", value4);
        }
    }
}
