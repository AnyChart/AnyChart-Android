package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.BoxDataEntry;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Box;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BoxChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian boxChart = AnyChart.box();

        boxChart.title("Top 10 Jobs Salaries Grades Per Year Calisota, USA");

        boxChart.xAxis(0).staggerMode(true);

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomBoxDataEntry("Registered Nurse", 20000, 26000, 27000, 32000, 38000, new Integer[]{50000, 52000}));
        data.add(new CustomBoxDataEntry("Dental Hygienist", 24000, 28000, 32000, 38000, 42000, new Integer[]{48000}));
        data.add(new CustomBoxDataEntry("Computer Systems Analyst", 40000, 49000, 62000, 73000, 88000, new Integer[]{32000, 29000, 106000}));
        data.add(new CustomBoxDataEntry("Physical Therapist", 52000, 59000, 65000, 74000, 83000, new Integer[]{91000}));
        data.add(new CustomBoxDataEntry("Software Developer", 45000, 54000, 66000, 81000, 97000, new Integer[]{120000}));
        data.add(new CustomBoxDataEntry("Information Security Analyst", 47000, 56000, 69000, 85000, 100000, new Integer[]{110000, 115000, 32000}));
        data.add(new CustomBoxDataEntry("Physician Assistant", 67000, 72000, 84000, 95000, 110000, new Integer[]{57000, 54000}));
        data.add(new CustomBoxDataEntry("Dentist", 75000, 99000, 123000, 160000, 210000, new Integer[]{220000, 70000}));
        data.add(new CustomBoxDataEntry("Physician", 58000, 96000, 130000, 170000, 200000, new Integer[]{42000, 210000, 215000}));

        Box box = boxChart.box(data);

        box.whiskerWidth("20%");

        anyChartView.setChart(boxChart);
    }

    private class CustomBoxDataEntry extends BoxDataEntry {
        CustomBoxDataEntry(String x, Integer low, Integer q1, Integer median, Integer q3, Integer high, Integer[] outliers) {
            super(x, low, q1, median, q3, high);
            setValue("outliers", outliers);
        }
    }
}
