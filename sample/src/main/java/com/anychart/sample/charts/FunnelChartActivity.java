package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Funnel;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class FunnelChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Funnel funnel = new Funnel();
        funnel.setData(new String[] {
                "['Website Visits', 528756]",
                "['Downloads', 164052]",
                "['Valid Contacts', 112167]",
                "['Interested to Buy', 79128]",
                "['Purchased', 79128]"
        }, TextParsingMode.CSV);

        funnel.setMargin(10d, "'20%'", 10d, "'20%'");
        funnel.setBaseWidth("'70%'")
                .setNeckWidth("'17%'");

        funnel.getLabels()
                .setPosition("'outsideleft'")
                .setFormat("'{%X} - {%Value}'");

        funnel.setAnimation(true);

        anyChartView.setChart(funnel);
    }
}
