package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Bar;
import com.anychart.core.cartesian.series.JumpLine;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.HoverMode;
import com.anychart.enums.TooltipDisplayMode;
import com.anychart.enums.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class VerticalChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian vertical = AnyChart.vertical();

        vertical.animation(true)
                .title("Vertical Combination of Bar and Jump Line Chart");

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

        Set set = Set.instantiate();
        set.data(data);
        Mapping barData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping jumpLineData = set.mapAs("{ x: 'x', value: 'jumpLine' }");

        Bar bar = vertical.bar(barData);
        bar.labels().format("${%Value} mln");

        JumpLine jumpLine = vertical.jumpLine(jumpLineData);
        jumpLine.stroke("2 #60727B");
        jumpLine.labels().enabled(false);

        vertical.yScale().minimum(0d);

        vertical.labels(true);

        vertical.tooltip()
                .displayMode(TooltipDisplayMode.UNION)
                .positionMode(TooltipPositionMode.POINT)
                .unionFormat(
                        "function() {\n" +
                        "      return 'Plain: $' + this.points[1].value + ' mln' +\n" +
                        "        '\\n' + 'Fact: $' + this.points[0].value + ' mln';\n" +
                        "    }");

        vertical.interactivity().hoverMode(HoverMode.BY_X);

        vertical.xAxis(true);
        vertical.yAxis(true);
        vertical.yAxis(0).labels().format("${%Value} mln");

        anyChartView.setChart(vertical);
    }

    private class CustomDataEntry extends ValueDataEntry {
        public CustomDataEntry(String x, Number value, Number jumpLine) {
            super(x, value);
            setValue("jumpLine", jumpLine);
        }
    }
}
