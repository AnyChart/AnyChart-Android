package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CoreAxesLinear;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.LabelsOverlapMode;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian barChart = AnyChart.bar();

        barChart.setAnimation(true);

        barChart.setPadding(10d, 20d, 5d, 20d);

        barChart.getYScale().setStackMode(ScaleStackMode.VALUE);

        barChart.getYAxis().getLabels().setFormat(
                "function() {\n" +
                "    return Math.abs(this.value).toLocaleString();\n" +
                "  }");

        barChart.getYAxis(0d).setTitle("'Revenue in Dollars'");

        barChart.getXAxis(0d).setOverlapMode(LabelsOverlapMode.ALLOW_OVERLAP);

        CoreAxesLinear xAxis1 = barChart.getXAxis(1d);
        xAxis1.setEnabled(true);
        xAxis1.setOrientation(Orientation.RIGHT);
        xAxis1.setOverlapMode(LabelsOverlapMode.ALLOW_OVERLAP);

        barChart.setTitle("'Cosmetic Sales by Gender'");

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

        SeriesBar series1 = barChart.bar(new String[] {
                "['Nail polish', 5376]",
                "['Eyebrow pencil', 10987]",
                "['Rouge', 7624]",
                "['Lipstick', 8814]",
                "['Eyeshadows', 8998]",
                "['Eyeliner', 9321]",
                "['Foundation', 8342]",
                "['Lip gloss', 6998]",
                "['Mascara', 9261]",
                "['Shampoo', 5376]",
                "['Hair conditioner', 10987]",
                "['Body lotion', 7624]",
                "['Shower gel', 8814]",
                "['Soap', 8998]",
                "['Eye fresher', 9321]",
                "['Deodorant', 8342]",
                "['Hand cream', 7598]",
                "['Foot cream', 6098]",
                "['Night cream', 6998]",
                "['Day cream', 5304]",
                "['Vanila cream', 9261]"
        }, TextParsingMode.CSV);
        series1.setName("'Females'")
                .setColor("'HotPink'");
        series1.getTooltip()
                .setPosition("'right'")
                .setAnchor(EnumsAnchor.LEFT_CENTER);

        SeriesBar series2 = barChart.bar(new String[] {
                "['Nail polish', -229]",
                "['Eyebrow pencil', -932]",
                "['Rouge', -5221]",
                "['Lipstick', -256]",
                "['Eyeshadows', -308]",
                "['Eyeliner', -432]",
                "['Foundation', -701]",
                "['Lip gloss', -908]",
                "['Mascara', -712]",
                "['Shampoo', -9229]",
                "['Hair conditioner', -13932]",
                "['Body lotion', -10221]",
                "['Shower gel', -12256]",
                "['Soap', -5308]",
                "['Eye fresher', -432]",
                "['Deodorant', -11701]",
                "['Hand cream', -5808]",
                "['Foot cream', -3987]",
                "['Night cream', -847]",
                "['Day cream', -4008]",
                "['Vanila cream', -712]"
        }, TextParsingMode.CSV);
        series2.setName("'Males'");
        series2.getTooltip()
                .setPosition("'left'")
                .setAnchor(EnumsAnchor.RIGHT_CENTER);

        barChart.getLegend().setEnabled(true);
        barChart.getLegend().setInverted(true);
        barChart.getLegend().setFontSize(13d);
        barChart.getLegend().setPadding(0d, 0d, 20d, 0d);

        anyChartView.setChart(barChart);
    }
}
