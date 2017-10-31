package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class MosaicChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsMekko mosaic = AnyChart.mosaic();

        mosaic.setTitle("Skills and Self-ID Top Factors");

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Data Businessperson", 50));
        data.add(new ValueDataEntry("Data Creative", 17));
        data.add(new ValueDataEntry("Data Developer", 17));
        data.add(new ValueDataEntry("Data Researcher", 12));

        mosaic.mekko(data)
                .setName("Business");

        data.clear();
        data.add(new ValueDataEntry("Data Businessperson", 15));
        data.add(new ValueDataEntry("Data Creative", 23));
        data.add(new ValueDataEntry("Data Developer", 25));
        data.add(new ValueDataEntry("Data Researcher", 12));

        mosaic.mekko(data)
                .setName("ML/Big Data");

        data.clear();
        data.add(new ValueDataEntry("Data Businessperson", 10));
        data.add(new ValueDataEntry("Data Creative", 10));
        data.add(new ValueDataEntry("Data Developer", 16));
        data.add(new ValueDataEntry("Data Researcher", 17));

        mosaic.mekko(data)
                .setName("Math/OR");

        data.clear();
        data.add(new ValueDataEntry("Data Businessperson", 5));
        data.add(new ValueDataEntry("Data Creative", 20));
        data.add(new ValueDataEntry("Data Developer", 27));
        data.add(new ValueDataEntry("Data Researcher", 5));

        mosaic.mekko(data)
                .setName("Programming");

        data.clear();
        data.add(new ValueDataEntry("Data Businessperson", 25));
        data.add(new ValueDataEntry("Data Creative", 30));
        data.add(new ValueDataEntry("Data Developer", 15));
        data.add(new ValueDataEntry("Data Researcher", 51));

        mosaic.mekko(data)
                .setName("Statistics");

        mosaic.getXAxis().setOrientation(Orientation.TOP);
        mosaic.getTooltip().setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(mosaic);
    }
}
