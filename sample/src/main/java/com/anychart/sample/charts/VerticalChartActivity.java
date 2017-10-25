package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesJumpLine;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class VerticalChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Cartesian vertical = AnyChart.vertical();

        vertical.setAnimation(true)
                .setTitle("Vertical Combination of Bar and Jump Line Chart");

        List<DataEntry> data = new ArrayList<>();

        data.add(new SingleValueDataEntry("Jan", 11.5));
        data.add(new SingleValueDataEntry("Feb", 12));
        data.add(new SingleValueDataEntry("Mar", 11.7));
        data.add(new SingleValueDataEntry("Apr", 12.4));
        data.add(new SingleValueDataEntry("May", 13.5));
        data.add(new SingleValueDataEntry("Jun", 11.9));
        data.add(new SingleValueDataEntry("Jul", 14.6));
        data.add(new SingleValueDataEntry("Aug", 17.2));
        data.add(new SingleValueDataEntry("Sep", 16.9));
        data.add(new SingleValueDataEntry("Oct", 15.4));
        data.add(new SingleValueDataEntry("Nov", 16.9));
        data.add(new SingleValueDataEntry("Dec", 17.2));

        SeriesBar bar = vertical.bar(data);
        bar.getLabels().setFormat("${%Value} mln");

        List<DataEntry> jumpLineData = new ArrayList<>();

        jumpLineData.add(new SingleValueDataEntry("Jan", 9.3));
        jumpLineData.add(new SingleValueDataEntry("Feb", 10.5));
        jumpLineData.add(new SingleValueDataEntry("Mar", 11.2));
        jumpLineData.add(new SingleValueDataEntry("Apr", 11.2));
        jumpLineData.add(new SingleValueDataEntry("May", 12.7));
        jumpLineData.add(new SingleValueDataEntry("Jun", 13.1));
        jumpLineData.add(new SingleValueDataEntry("Jul", 12.2));
        jumpLineData.add(new SingleValueDataEntry("Aug", 12.2));
        jumpLineData.add(new SingleValueDataEntry("Sep", 10.1));
        jumpLineData.add(new SingleValueDataEntry("Oct", 14.5));
        jumpLineData.add(new SingleValueDataEntry("Nov", 14.5));
        jumpLineData.add(new SingleValueDataEntry("Dec", 15.5));

        CartesianSeriesJumpLine jumpLine = vertical.jumpLine(jumpLineData);
        jumpLine.setStroke("#60727B", 2d, null, null, null);
        jumpLine.getLabels().setEnabled(false);

        vertical.getYScale().setMinimum(0d);

        vertical.setLabels(true);

        vertical.getTooltip()
                .setDisplayMode(TooltipDisplayMode.UNION)
                .setPositionMode(TooltipPositionMode.POINT)
                .setUnionFormat(
                        "function() {\n" +
                        "      return 'Plain: $' + this.points[1].value + ' mln' +\n" +
                        "        '\\n' + 'Fact: $' + this.points[0].value + ' mln';\n" +
                        "    }");

        vertical.getInteractivity().setHoverMode(HoverMode.BY_X);

        vertical.setXAxis(true);
        vertical.setYAxis(true);
        vertical.getYAxis().getLabels().setFormat("${%Value} mln");

        anyChartView.setChart(vertical);
    }
}
