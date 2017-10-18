package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Box;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class BoxChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian boxChart = AnyChart.box();

        boxChart.setTitle("'Top 10 Jobs Salaries Grades Per Year Calisota, USA'");

        boxChart.getXAxis().setStaggerMode(true);

        Box box = boxChart.box(new String[] {
                "{ x: 'Registered Nurse', low: 20000, q1: 26000, median: 27000, q3: 32000, high: 38000, outliers: [50000, 52000] }",
                "{ x: 'Dental Hygienist', low: 24000, q1: 28000, median: 32000, q3: 38000, high: 42000, outliers: [48000] }",
                "{ x: 'Computer Systems Analyst', low: 40000, q1: 49000, median: 62000, q3: 73000, high: 88000, outliers: [32000, 29000, 106000] }",
                "{ x: 'Physical Therapist', low: 52000, q1: 59000, median: 65000, q3: 74000, high: 83000, outliers: [91000] }",
                "{ x: 'Software Developer', low: 45000, q1: 54000, median: 66000, q3: 81000, high: 97000, outliers: [120000] }",
                "{ x: 'Information Security Analyst', low: 47000, q1: 56000, median: 69000, q3: 85000, high: 100000, outliers: [110000, 115000, 32000] }",
                "{ x: 'Physician Assistant', low: 67000, q1: 72000, median: 84000, q3: 95000, high: 110000, outliers: [57000, 54000] }",
                "{ x: 'Dentist', low: 75000, q1: 99000, median: 123000, q3: 160000, high: 210000, outliers: [220000, 70000] }",
                "{ x: 'Physician', low: 58000, q1: 96000, median: 130000, q3: 170000, high: 200000, outliers: [42000, 210000, 215000] }"
        }, TextParsingMode.CSV);

        box.setWhiskerWidth("'20%'");

        anyChartView.setChart(boxChart);
    }
}
