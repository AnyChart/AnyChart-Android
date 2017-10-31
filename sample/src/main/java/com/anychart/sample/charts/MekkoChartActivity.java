package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class MekkoChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsMekko mekkoChart = AnyChart.mekko();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Acer", 2254));
        data.add(new ValueDataEntry("Data Creative", 1010));
        data.add(new ValueDataEntry("Data Developer", 417));
        data.add(new ValueDataEntry("Data Researcher", 210));

        mekkoChart.mekko(data)
                .setName("Phone");

        data.clear();
        data.add(new ValueDataEntry("Acer", 1274));
        data.add(new ValueDataEntry("Data Creative", 950));
        data.add(new ValueDataEntry("Data Developer", 631));
        data.add(new ValueDataEntry("Data Researcher", 307));

        mekkoChart.mekko(data)
                .setName("Tablet");

        data.clear();
        data.add(new ValueDataEntry("Acer", 635));
        data.add(new ValueDataEntry("Data Creative", 675));
        data.add(new ValueDataEntry("Data Developer", 405));
        data.add(new ValueDataEntry("Data Researcher", 450));

        mekkoChart.mekko(data)
                .setName("Desktop");

        data.clear();
        data.add(new ValueDataEntry("Acer", 253));
        data.add(new ValueDataEntry("Data Creative", 250));
        data.add(new ValueDataEntry("Data Developer", 251));
        data.add(new ValueDataEntry("Data Researcher", 257));

        mekkoChart.mekko(data)
                .setName("Laptop");

        mekkoChart.getXAxis().setOrientation(Orientation.TOP);

        mekkoChart.getLabels().setFormat("${%Value}k");

        mekkoChart.getTooltip().setFormat("{%seriesName}: ${%Value}k");

        anyChartView.setChart(mekkoChart);
    }
}
