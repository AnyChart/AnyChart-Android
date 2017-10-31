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
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

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

        List<DataEntry> series1Data = new ArrayList<>();
        series1Data.add(new ValueDataEntry("Nail polish", 5376));
        series1Data.add(new ValueDataEntry("Eyebrow pencil", 10987));
        series1Data.add(new ValueDataEntry("Rouge", 7624));
        series1Data.add(new ValueDataEntry("Lipstick", 8814));
        series1Data.add(new ValueDataEntry("Eyeshadows", 8998));
        series1Data.add(new ValueDataEntry("Eyeliner", 9321));
        series1Data.add(new ValueDataEntry("Foundation", 8342));
        series1Data.add(new ValueDataEntry("Lip gloss", 6998));
        series1Data.add(new ValueDataEntry("Mascara", 9261));
        series1Data.add(new ValueDataEntry("Shampoo", 5376));
        series1Data.add(new ValueDataEntry("Hair conditioner", 10987));
        series1Data.add(new ValueDataEntry("Body lotion", 7624));
        series1Data.add(new ValueDataEntry("Shower gel", 8814));
        series1Data.add(new ValueDataEntry("Soap", 8998));
        series1Data.add(new ValueDataEntry("Eye fresher", 9321));
        series1Data.add(new ValueDataEntry("Deodorant", 8342));
        series1Data.add(new ValueDataEntry("Hand cream", 7598));
        series1Data.add(new ValueDataEntry("Foot cream", 6098));
        series1Data.add(new ValueDataEntry("Night cream", 6998));
        series1Data.add(new ValueDataEntry("Day cream", 5304));
        series1Data.add(new ValueDataEntry("Vanila cream", 9261));

        SeriesBar series1 = barChart.bar(series1Data);
        series1.setName("Females")
                .setColor("HotPink");
        series1.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER);

        List<DataEntry> series2Data = new ArrayList<>();
        series2Data.add(new ValueDataEntry("Nail polish", -229));
        series2Data.add(new ValueDataEntry("Eyebrow pencil", -932));
        series2Data.add(new ValueDataEntry("Rouge", -5221));
        series2Data.add(new ValueDataEntry("Lipstick", -256));
        series2Data.add(new ValueDataEntry("Eyeshadows", -308));
        series2Data.add(new ValueDataEntry("Eyeliner", -432));
        series2Data.add(new ValueDataEntry("Foundation", -701));
        series2Data.add(new ValueDataEntry("Lip gloss", -908));
        series2Data.add(new ValueDataEntry("Mascara", -712));
        series2Data.add(new ValueDataEntry("Shampoo", -9229));
        series2Data.add(new ValueDataEntry("Hair conditioner", -13932));
        series2Data.add(new ValueDataEntry("Body lotion", -10221));
        series2Data.add(new ValueDataEntry("Shower gel", -12256));
        series2Data.add(new ValueDataEntry("Soap", -5308));
        series2Data.add(new ValueDataEntry("Eye fresher", -432));
        series2Data.add(new ValueDataEntry("Deodorant", -11701));
        series2Data.add(new ValueDataEntry("Hand cream", -5808));
        series2Data.add(new ValueDataEntry("Foot cream", -3987));
        series2Data.add(new ValueDataEntry("Night cream", -847));
        series2Data.add(new ValueDataEntry("Day cream", -4008));
        series2Data.add(new ValueDataEntry("Vanila cream", -712));

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
}
