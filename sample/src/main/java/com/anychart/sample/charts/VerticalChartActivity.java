package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesJumpLine;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.SeriesBar;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class VerticalChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Cartesian vertical = AnyChart.vertical();

        vertical.setAnimation(true)
                .setTitle("'Vertical Combination of Bar and Jump Line Chart'");

        SeriesBar bar = vertical.bar(new String[] {
                "['Jan', 11.5]",
                "['Feb', 12]",
                "['Mar', 11.7]",
                "['Apr', 12.4]",
                "['May', 13.5]",
                "['Jun', 11.9]",
                "['Jul', 14.6]",
                "['Aug', 17.2]",
                "['Sep', 16.9]",
                "['Oct', 15.4]",
                "['Nov', 16.9]",
                "['Dec', 17.2]"
        }, TextParsingMode.CSV);
        bar.getLabels().setFormat("'${%Value} mln'");

        CartesianSeriesJumpLine jumpLine = vertical.jumpLine(new String[] {
                "['Jan', 9.3]",
                "['Feb', 10.5]",
                "['Mar', 11.2]",
                "['Apr', 11.2]",
                "['May', 12.7]",
                "['Jun', 13.1]",
                "['Jul', 12.2]",
                "['Aug', 12.2]",
                "['Sep', 10.1]",
                "['Oct', 14.5]",
                "['Nov', 14.5]",
                "['Dec', 15.5]"
        }, TextParsingMode.CSV);
        jumpLine.setStroke("'#60727B'", 2d, null, null, null);
//        jumpLine.setIsVertical(true);
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
        vertical.getYAxis().getLabels().setFormat("'${%Value} mln'");
//        cartesian.setIsVertical(true);

        anyChartView.setChart(vertical);
    }
}
