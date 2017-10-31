package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Funnel;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class FunnelChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Funnel funnel = AnyChart.funnel();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Website Visits", 528756));
        data.add(new ValueDataEntry("Downloads", 164052));
        data.add(new ValueDataEntry("Valid Contacts", 112167));
        data.add(new ValueDataEntry("Interested to Buy", 79128));
        data.add(new ValueDataEntry("Purchased", 79128));

        funnel.setData(data);

        funnel.setMargin(new String[] { "10", "20%", "10", "20%" });
        funnel.setBaseWidth("70%")
                .setNeckWidth("17%");

        funnel.getLabels()
                .setPosition("outsideleft")
                .setFormat("{%X} - {%Value}");

        funnel.setAnimation(true);

        anyChartView.setChart(funnel);
    }
}
