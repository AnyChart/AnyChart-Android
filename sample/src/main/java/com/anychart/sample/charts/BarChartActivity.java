package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CoreAxesLinear;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.LabelsOverlapMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.Set;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian barChart = AnyChart.bar();

        barChart.setAnimation(true);

        barChart.setPadding(10d, 20d, 5d, 20d);

        barChart.getYScale().setStackMode(ScaleStackMode.VALUE);

        barChart.getYAxis().getLabels().setFormat(
                "function() {\n" +
                "    return Math.abs(this.value).toLocaleString();\n" +
                "  }");

        barChart.getYAxis(0d).setTitle("Revenue in Dollars");

        barChart.getXAxis(0d).setOverlapMode(LabelsOverlapMode.ALLOW_OVERLAP);

        CoreAxesLinear xAxis1 = barChart.getXAxis(1d);
        xAxis1.setEnabled(true);
        xAxis1.setOrientation(Orientation.RIGHT);
        xAxis1.setOverlapMode(LabelsOverlapMode.ALLOW_OVERLAP);

        barChart.setTitle("Cosmetic Sales by Gender");

        barChart.getInteractivity().setHoverMode(HoverMode.BY_X);

        barChart.getTooltip()
                .setTitle(false)
                .setSeparator(false)
                .setDisplayMode(TooltipDisplayMode.SEPARATED)
                .setPositionMode(TooltipPositionMode.POINT)
                .setUseHtml(true)
                .setFontSize(12d)
                .setOffsetX(5d)
                .setOffsetY(0d)
                .setFormat(
                        "function() {\n" +
                        "      return '<span style=\"color: #D9D9D9\">$</span>' + Math.abs(this.value).toLocaleString();\n" +
                        "    }");

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new CustomDataEntry("Nail polish", 5376, -229));
        seriesData.add(new CustomDataEntry("Eyebrow pencil", 10987, -932));
        seriesData.add(new CustomDataEntry("Rouge", 7624, -5221));
        seriesData.add(new CustomDataEntry("Lipstick", 8814, -256));
        seriesData.add(new CustomDataEntry("Eyeshadows", 8998, -308));
        seriesData.add(new CustomDataEntry("Eyeliner", 9321, -432));
        seriesData.add(new CustomDataEntry("Foundation", 8342, -701));
        seriesData.add(new CustomDataEntry("Lip gloss", 6998, -908));
        seriesData.add(new CustomDataEntry("Mascara", 9261, -712));
        seriesData.add(new CustomDataEntry("Shampoo", 5376, -9229));
        seriesData.add(new CustomDataEntry("Hair conditioner", 10987, -13932));
        seriesData.add(new CustomDataEntry("Body lotion", 7624, -10221));
        seriesData.add(new CustomDataEntry("Shower gel", 8814, -12256));
        seriesData.add(new CustomDataEntry("Soap", 8998, -5308));
        seriesData.add(new CustomDataEntry("Eye fresher", 9321, -432));
        seriesData.add(new CustomDataEntry("Deodorant", 8342, -11701));
        seriesData.add(new CustomDataEntry("Hand cream", 7598, -5808));
        seriesData.add(new CustomDataEntry("Foot cream", 6098, -3987));
        seriesData.add(new CustomDataEntry("Night cream", 6998, -847));
        seriesData.add(new CustomDataEntry("Day cream", 5304, -4008));
        seriesData.add(new CustomDataEntry("Vanila cream", 9261, -712));

        Set set = new Set(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");

        SeriesBar series1 = barChart.bar(series1Data);
        series1.setName("Females")
                .setColor("HotPink");
        series1.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER);

        SeriesBar series2 = barChart.bar(series2Data);
        series2.setName("Males");
        series2.getTooltip()
                .setPosition("left")
                .setAnchor(EnumsAnchor.RIGHT_CENTER);

        barChart.getLegend().setEnabled(true);
        barChart.getLegend().setInverted(true);
        barChart.getLegend().setFontSize(13d);
        barChart.getLegend().setPadding(0d, 0d, 20d, 0d);

        anyChartView.setChart(barChart);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2) {
            super(x, value);
            setValue("value2", value2);
        }
    }
}
