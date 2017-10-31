package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.LegendLayout;
import com.anychart.anychart.Pyramid;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.UiLegend;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class PyramidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Pyramid pyramid = AnyChart.pyramid();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("TV promotion", 6371664));
        data.add(new ValueDataEntry("Radio promotion", 7216301));
        data.add(new ValueDataEntry("Advertising leaflets", 1486621));
        data.add(new ValueDataEntry("Before advertising started", 1386622));

        pyramid.setData(data);

        UiLegend legend = pyramid.getLegend();
        legend.setEnabled(true);
        legend.setPosition("outside-right");
        legend.setItemsLayout(LegendLayout.VERTICAL);
        legend.setAlign(EnumsAlign.TOP);

        pyramid.setLabels(false);

        anyChartView.setChart(pyramid);
    }
}
