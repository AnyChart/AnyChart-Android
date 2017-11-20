package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.Set;
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
        data.add(new CustomDataEntry("Acer", 2254, 1274, 635, 253));
        data.add(new CustomDataEntry("Dell", 1010, 950, 675, 250));
        data.add(new CustomDataEntry("HP", 417, 631, 405, 251));
        data.add(new CustomDataEntry("Lenovo", 210, 307, 450, 257));

        Set set = new Set(data);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping series4Data = set.mapAs("{ x: 'x', value: 'value4' }");

        mekkoChart.mekko(series1Data)
                .setName("Phone");

        mekkoChart.mekko(series2Data)
                .setName("Tablet");

        mekkoChart.mekko(series3Data)
                .setName("Desktop");

        mekkoChart.mekko(series4Data)
                .setName("Laptop");

        mekkoChart.getXAxis().setOrientation(Orientation.TOP);

        mekkoChart.getLabels().setFormat("${%Value}k");

        mekkoChart.getTooltip().setFormat("{%seriesName}: ${%Value}k");

        anyChartView.setChart(mekkoChart);
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
