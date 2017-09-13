package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Bar;
import com.anychart.anychart.Circular;
import com.anychart.anychart.CircularGauge;
import com.anychart.anychart.Set;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class CircularGaugeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        CircularGauge circularGauge = new CircularGauge();
        Set set = new Set();
        set.setData(new String[] { "23", "34", "67", "93", "56", "100" }, TextParsingMode.CSV);
        circularGauge.setData(set, TextParsingMode.CSV);
        circularGauge.setStartangle(0d);
        circularGauge.setSweepangle(270d);
        circularGauge.setBar(100d);
        circularGauge.setBar(80d);
        circularGauge.setBar(60d);
//        Bar bar = new Bar();
//        circularGauge.setBa

        anyChartView.setChart(circularGauge);
    }
}
