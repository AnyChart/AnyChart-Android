package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.CoreAxesLinear;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.ScalesLinear;
import com.anychart.anychart.Set;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class CombinedChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian cartesian = AnyChart.cartesian();

        cartesian.setAnimation(true);

        cartesian.setTitle("Combination of Stacked Column and Line Chart (Dual Y-Axis)");

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
                .setFormat("{%Value}%");

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("P1", 96.5, 2040, 1200, 1600));
        data.add(new CustomDataEntry("P2", 77.1, 1794, 1124, 1724));
        data.add(new CustomDataEntry("P3", 73.2, 2026, 1006, 1806));
        data.add(new CustomDataEntry("P4", 61.1, 2341, 921, 1621));
        data.add(new CustomDataEntry("P5", 70.0, 1800, 1500, 1700));
        data.add(new CustomDataEntry("P6", 60.7, 1507, 1007, 1907));
        data.add(new CustomDataEntry("P7", 62.1, 2701, 921, 1821));
        data.add(new CustomDataEntry("P8", 75.1, 1671, 971, 1671));
        data.add(new CustomDataEntry("P9", 80.0, 1980, 1080, 1880));
        data.add(new CustomDataEntry("P10", 54.1, 1041, 1041, 1641));
        data.add(new CustomDataEntry("P11", 51.3, 813, 1113, 1913));
        data.add(new CustomDataEntry("P12", 59.1, 691, 1091, 1691));

        Set set = new Set(data);
        Mapping lineData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping column1Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping column2Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping column3Data = set.mapAs("{ x: 'x', value: 'value4' }");

        cartesian.column(column1Data);
        cartesian.setCrosshair(true);

        CartesianSeriesLine line = cartesian.line(lineData);
        line.setYScale(scalesLinear);

        cartesian.column(column2Data);

        cartesian.column(column3Data);

        anyChartView.setChart(cartesian);
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
