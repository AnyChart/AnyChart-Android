package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.CircularGauge;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class CircularGaugeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        CircularGauge circularGauge = new CircularGauge();
        circularGauge.setStartangle(0d);
        circularGauge.setSweepangle(270d);
        circularGauge.setData(new String[] { "23", "34", "67", "93", "56", "100" }, TextParsingMode.CSV);
        circularGauge.getBar().setDataindex(5d);

        anyChartView.setChart(circularGauge);
    }
}
