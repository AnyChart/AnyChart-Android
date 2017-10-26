package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.LegendLayout;
import com.anychart.anychart.Pie;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Pie pie = AnyChart.pie();

        List<DataEntry> data = new ArrayList<>();

        data.add(new SingleValueDataEntry("Apples", 6371664));
        data.add(new SingleValueDataEntry("Pears", 789622));
        data.add(new SingleValueDataEntry("Bananas", 7216301));
        data.add(new SingleValueDataEntry("Grapes", 1486621));
        data.add(new SingleValueDataEntry("Oranges", 1200000));

        pie.setData(data);

        pie.setTitle("Fruits imported in 2015 (in kg)");

        pie.getLabels().setPosition("outside");

        pie.getLegend().getTitle().setEnabled(true);
        pie.getLegend().getTitle()
                .setText("Retail channels")
                .setPadding(0d, 0d, 10d, 0d);

        pie.getLegend()
                .setPosition("center-bottom")
                .setItemsLayout(LegendLayout.HORIZONTAL)
                .setAlign(EnumsAlign.CENTER);

        anyChartView.setChart(pie);
    }
}
