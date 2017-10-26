package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.SingleValueDataEntry;
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

//        mosaic.getGetSeriesAt(0d).setName("Business");
//        mosaic.getGetSeriesAt(1d).setName("ML/Big Data");
//        mosaic.getGetSeriesAt(2d).setName("Math/OR");
//        mosaic.getGetSeriesAt(3d).setName("Programming");
//        mosaic.getGetSeriesAt(4d).setName("Statistics");

        List<DataEntry> data = new ArrayList<>();

        data.add(new SingleValueDataEntry("Data Businessperson", 50));
        data.add(new SingleValueDataEntry("Data Creative", 17));
        data.add(new SingleValueDataEntry("Data Developer", 17));
        data.add(new SingleValueDataEntry("Data Researcher", 12));

        mosaic.mekko(data)
                .setName("Business");

        data.clear();
        data.add(new SingleValueDataEntry("Data Businessperson", 15));
        data.add(new SingleValueDataEntry("Data Creative", 23));
        data.add(new SingleValueDataEntry("Data Developer", 25));
        data.add(new SingleValueDataEntry("Data Researcher", 12));

        mosaic.mekko(data)
                .setName("ML/Big Data");

        data.clear();
        data.add(new SingleValueDataEntry("Data Businessperson", 10));
        data.add(new SingleValueDataEntry("Data Creative", 10));
        data.add(new SingleValueDataEntry("Data Developer", 16));
        data.add(new SingleValueDataEntry("Data Researcher", 17));

        mosaic.mekko(data)
                .setName("Math/OR");

        data.clear();
        data.add(new SingleValueDataEntry("Data Businessperson", 5));
        data.add(new SingleValueDataEntry("Data Creative", 20));
        data.add(new SingleValueDataEntry("Data Developer", 27));
        data.add(new SingleValueDataEntry("Data Researcher", 5));

        mosaic.mekko(data)
                .setName("Programming");

        data.clear();
        data.add(new SingleValueDataEntry("Data Businessperson", 25));
        data.add(new SingleValueDataEntry("Data Creative", 30));
        data.add(new SingleValueDataEntry("Data Developer", 15));
        data.add(new SingleValueDataEntry("Data Researcher", 51));

        mosaic.mekko(data)
                .setName("Statistics");

//        mosaic.setData(data);
//        mosaic.setData(new String[] {
//                "['Data Businessperson', 50, 15, 10, 5, 25]",
//                "['Data Creative', 17, 23, 10, 20, 30]",
//                "['Data Developer', 17, 25, 16, 27, 15]",
//                "['Data Researcher', 12, 15, 17, 5, 51]"
//        });

        mosaic.getXAxis().setOrientation(Orientation.TOP);
        mosaic.getTooltip().setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(mosaic);
    }
}
