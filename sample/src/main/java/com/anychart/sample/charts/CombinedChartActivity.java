package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.CoreAxesLinear;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.ScalesLinear;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class CombinedChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.cartesian();

        cartesian.setAnimation(true);

        cartesian.setTitle("'Combination of Stacked Column and Line Chart (Dual Y-Axis)'");

        cartesian.getYScale().setStackMode(ScaleStackMode.VALUE);

        ScalesLinear scalesLinear = new ScalesLinear();
        scalesLinear.setMinimum(0d);
        scalesLinear.setMaximum(100d);
        scalesLinear.setTicks("{ interval: 20 }");

        CoreAxesLinear extraYAxis = cartesian.getYAxis(1d);
        extraYAxis.setOrientation(Orientation.RIGHT)
                .setScale(scalesLinear);
        extraYAxis.getLabels()
                .setPadding(0d, 0d, 0d, 5d)
                .setFormat("'{%Value}%'");

        cartesian.column(new String[] {
                "['P1', 96.5, 2040, 1200, 1600]",
                "['P2', 1794]",
                "['P3', 2026]",
                "['P4', 2341]",
                "['P5', 1800]",
                "['P6', 1507]",
                "['P7', 2701]",
                "['P8', 1671]",
                "['P9', 1980]",
                "['P10', 1041]",
                "['P11', 813]",
                "['P12', 691]"
        }, TextParsingMode.CSV);

        cartesian.setCrosshair(true);

        CartesianSeriesLine line = cartesian.line(new String[] {
                "['P1', 96.5]",
                "['P2', 77.1]",
                "['P3', 73.2]",
                "['P4', 61.1]",
                "['P5', 70.0]",
                "['P6', 60.7]",
                "['P7', 62.1]",
                "['P8', 75.1]",
                "['P9', 80.0]",
                "['P10', 54.1]",
                "['P11', 51.3]",
                "['P12', 59.1]"
        }, TextParsingMode.CSV);
        line.setYScale(scalesLinear);

        cartesian.column(new String[] {
                "['P1', 1200]",
                "['P2', 1124]",
                "['P3', 1006]",
                "['P4', 921]",
                "['P5', 1500]",
                "['P6', 1007]",
                "['P7', 921]",
                "['P8', 971]",
                "['P9', 1080]",
                "['P10', 1041]",
                "['P11', 1113]",
                "['P12', 1091]"
        }, TextParsingMode.CSV);

        cartesian.column(new String[] {
                "['P1', 1600]",
                "['P2', 1724]",
                "['P3', 1806]",
                "['P4', 1621]",
                "['P5', 1700]",
                "['P6', 1907]",
                "['P7', 1821]",
                "['P8', 1671]",
                "['P9', 1880]",
                "['P10', 1641]",
                "['P11', 1913]",
                "['P12', 1691]"
        }, TextParsingMode.CSV);

        anyChartView.setChart(cartesian);
    }
}
