package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.CoreAxesLinear;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.ScalesLinear;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class CombinedChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

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

        List<DataEntry> column1Data = new ArrayList<>();

        column1Data.add(new SingleValueDataEntry("P1", 2040));
        column1Data.add(new SingleValueDataEntry("P2", 1794));
        column1Data.add(new SingleValueDataEntry("P3", 2026));
        column1Data.add(new SingleValueDataEntry("P4", 2341));
        column1Data.add(new SingleValueDataEntry("P5", 1800));
        column1Data.add(new SingleValueDataEntry("P6", 1507));
        column1Data.add(new SingleValueDataEntry("P7", 2701));
        column1Data.add(new SingleValueDataEntry("P8", 1671));
        column1Data.add(new SingleValueDataEntry("P9", 1980));
        column1Data.add(new SingleValueDataEntry("P10", 1041));
        column1Data.add(new SingleValueDataEntry("P11", 813));
        column1Data.add(new SingleValueDataEntry("P12", 691));

        cartesian.column(column1Data);
        cartesian.setCrosshair(true);

        List<DataEntry> lineData = new ArrayList<>();

        lineData.add(new SingleValueDataEntry("P1", 96.5));
        lineData.add(new SingleValueDataEntry("P2", 77.1));
        lineData.add(new SingleValueDataEntry("P3", 73.2));
        lineData.add(new SingleValueDataEntry("P4", 61.1));
        lineData.add(new SingleValueDataEntry("P5", 70.0));
        lineData.add(new SingleValueDataEntry("P6", 60.7));
        lineData.add(new SingleValueDataEntry("P7", 62.1));
        lineData.add(new SingleValueDataEntry("P8", 75.1));
        lineData.add(new SingleValueDataEntry("P9", 80.0));
        lineData.add(new SingleValueDataEntry("P10", 54.1));
        lineData.add(new SingleValueDataEntry("P11", 51.3));
        lineData.add(new SingleValueDataEntry("P12", 59.1));

        CartesianSeriesLine line = cartesian.line(lineData);
        line.setYScale(scalesLinear);

        List<DataEntry> column2Data = new ArrayList<>();

        column2Data.add(new SingleValueDataEntry("P1", 1200));
        column2Data.add(new SingleValueDataEntry("P2", 1124));
        column2Data.add(new SingleValueDataEntry("P3", 1006));
        column2Data.add(new SingleValueDataEntry("P4", 921));
        column2Data.add(new SingleValueDataEntry("P5", 1500));
        column2Data.add(new SingleValueDataEntry("P6", 1007));
        column2Data.add(new SingleValueDataEntry("P7", 921));
        column2Data.add(new SingleValueDataEntry("P8", 971));
        column2Data.add(new SingleValueDataEntry("P9", 1080));
        column2Data.add(new SingleValueDataEntry("P10", 1041));
        column2Data.add(new SingleValueDataEntry("P11", 1113));
        column2Data.add(new SingleValueDataEntry("P12", 1091));

        cartesian.column(column2Data);

        List<DataEntry> column3Data = new ArrayList<>();

        column3Data.add(new SingleValueDataEntry("P1", 1600));
        column3Data.add(new SingleValueDataEntry("P2", 1724));
        column3Data.add(new SingleValueDataEntry("P3", 1806));
        column3Data.add(new SingleValueDataEntry("P4", 1621));
        column3Data.add(new SingleValueDataEntry("P5", 1700));
        column3Data.add(new SingleValueDataEntry("P6", 1907));
        column3Data.add(new SingleValueDataEntry("P7", 1821));
        column3Data.add(new SingleValueDataEntry("P8", 1671));
        column3Data.add(new SingleValueDataEntry("P9", 1880));
        column3Data.add(new SingleValueDataEntry("P10", 1641));
        column3Data.add(new SingleValueDataEntry("P11", 1913));
        column3Data.add(new SingleValueDataEntry("P12", 1691));

        cartesian.column(column3Data);

        anyChartView.setChart(cartesian);
    }
}
