package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.DistinctColors;
import com.anychart.anychart.LinearGradientFill;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class ColumnChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian cartesian = new Cartesian();
        cartesian.setColumn(new String[] {"['2014', 100]", "['2015', 120]", "['2016', 180]"}, TextParsingMode.CSV);
        cartesian.setLabels(true);
        cartesian.setXaxis(true);
        cartesian.setYaxis(true);

        LinearGradientFill linearGradientFill = new LinearGradientFill(new String[]{"\"#456789\"", "\"#987654\""}, false, 90d, .8d);
        DistinctColors distinctColors = new DistinctColors();
        distinctColors.setItems(linearGradientFill, null);
        cartesian.setPalette(distinctColors);

        anyChartView.setChart(cartesian);
    }
}
