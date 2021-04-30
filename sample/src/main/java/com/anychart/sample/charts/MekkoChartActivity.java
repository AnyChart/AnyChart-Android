package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Mekko;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Orientation;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class MekkoChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Mekko mekkoChart = AnyChart.mekko();

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("Acer", 2254, 1274, 635, 253));
        data.add(new CustomDataEntry("Dell", 1010, 950, 675, 250));
        data.add(new CustomDataEntry("HP", 417, 631, 405, 251));
        data.add(new CustomDataEntry("Lenovo", 210, 307, 450, 257));

        Set set = Set.instantiate();
        set.data(data);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping series4Data = set.mapAs("{ x: 'x', value: 'value4' }");

        mekkoChart.mekko(series1Data)
                .name("Phone");

        mekkoChart.mekko(series2Data)
                .name("Tablet");

        mekkoChart.mekko(series3Data)
                .name("Desktop");

        mekkoChart.mekko(series4Data)
                .name("Laptop");

        mekkoChart.xAxis(0).orientation(Orientation.TOP);

        mekkoChart.labels().format("${%Value}k");

        mekkoChart.tooltip().format("{%seriesName}: ${%Value}k");

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
