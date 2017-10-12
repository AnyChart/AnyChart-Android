package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.LegendLayout;
import com.anychart.anychart.Pie;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Pie pie = new Pie();
        pie.setData(new String[] {
                "['Apples', 6371664]",
                "['Pears', 789622]",
                "['Bananas' , 7216301]",
                "['Grapes' , 1486621]",
                "['Oranges' , 1200000]"
        }, TextParsingMode.CSV);

        pie.setTitle("'Fruits imported in 2015 (in kg)'");

        pie.getLabels().setPosition("'outside'");

        pie.getLegend().getTitle().setEnabled(true);
        pie.getLegend().getTitle()
                .setText("'Retail channels'")
                .setPadding(0d, 0d, 10d, 0d);

        pie.getLegend()
                .setPosition("'center-bottom'")
                .setItemsLayout(LegendLayout.HORIZONTAL)
                .setAlign(EnumsAlign.CENTER);

        anyChartView.setChart(pie);
    }
}
