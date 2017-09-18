package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        funnel.setMargin(10d, "'20%'", 10d, "'20%'", 0d, "'0%'", 0d);
        funnel.setBasewidth("'70%'");
        funnel.setNeckwidth("'17%'");
        funnel.setAnimation(true);

        anyChartView.setChart(funnel);
    }
}
