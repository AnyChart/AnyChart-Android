package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Venn;
import com.anychart.sample.R;

public class VennDiagramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Venn venn = new Venn();
        venn.setStroke("'#FFFFFF'", 2d, null, null, null);
        venn.setData(new String[] {
                "{x: 'A', name: 'Data Science', value: 100}",
                "{x: 'B', name: 'Computer Science', value: 25}",
                "{x: 'C', name: 'Math and Statistics', value: 25}",
                "{x: 'D', name: 'Subject Matter Expertise', value: 25}",
                "{x: ['A', 'B'], name: 'Computer Science', value: 50}",
                "{x: ['A', 'C'], name: 'Math and Statistics', value: 50}",
                "{x: ['A', 'D'], name: 'Subject Matter Expertise', value: 50}",
                "{x: ['B', 'C'], name: 'Machine\\nLearning', value: 5}",
                "{x: ['C', 'D'], name: 'Traditional\\nResearch', value: 5}",
                "{x: ['D', 'B'], name: 'Traditional\\nSoftware', value: 5}",
                "{x: ['B', 'C', 'D'], name: 'Unicorn', value: 5}"
        }, null);

        anyChartView.setChart(venn);
    }
}
