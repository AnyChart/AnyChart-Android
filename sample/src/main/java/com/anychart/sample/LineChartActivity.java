package com.anychart.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.TextParsingMode;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian cartesian = new Cartesian();
        cartesian.setLine(new String[] {"['2014', 100]", "['2015', 120]", "['2016', 180]"}, TextParsingMode.CSV);

        anyChartView.setChart(cartesian);
    }
}
