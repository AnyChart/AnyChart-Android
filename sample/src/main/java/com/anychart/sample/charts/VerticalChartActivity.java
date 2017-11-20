package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesJumpLine;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.Set;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class VerticalChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian vertical = AnyChart.vertical();

        vertical.setAnimation(true)
                .setTitle("Vertical Combination of Bar and Jump Line Chart");

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("Jan", 11.5, 9.3));
        data.add(new CustomDataEntry("Feb", 12, 10.5));
        data.add(new CustomDataEntry("Mar", 11.7, 11.2));
        data.add(new CustomDataEntry("Apr", 12.4, 11.2));
        data.add(new CustomDataEntry("May", 13.5, 12.7));
        data.add(new CustomDataEntry("Jun", 11.9, 13.1));
        data.add(new CustomDataEntry("Jul", 14.6, 12.2));
        data.add(new CustomDataEntry("Aug", 17.2, 12.2));
        data.add(new CustomDataEntry("Sep", 16.9, 10.1));
        data.add(new CustomDataEntry("Oct", 15.4, 14.5));
        data.add(new CustomDataEntry("Nov", 16.9, 14.5));
        data.add(new CustomDataEntry("Dec", 17.2, 15.5));

        Set set = new Set(data);
        Mapping barData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping jumpLineData = set.mapAs("{ x: 'x', value: 'jumpLine' }");

        SeriesBar bar = vertical.bar(barData);
        bar.getLabels().setFormat("${%Value} mln");

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

    private class CustomDataEntry extends ValueDataEntry {
        public CustomDataEntry(String x, Number value, Number jumpLine) {
            super(x, value);
            setValue("jumpLine", jumpLine);
        }
    }
}
