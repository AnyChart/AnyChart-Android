package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Gantt;
import com.anychart.sample.R;

public class GanttChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Gantt gantt = new Gantt();
//        gantt.setSplitterposition(320d);
//        gantt.setData(getString(R.string.long_string), TreeFillingMethod.AS_TABLE);

        anyChartView.setChart(gantt);
    }

}
