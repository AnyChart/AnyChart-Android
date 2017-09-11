package com.anychart.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DistinctColors;
import com.anychart.anychart.Pie;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TextParsingMode;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Pie pie = new Pie();
        pie.setData(new String[] {"['John' , 10000]", "['Jake' , 12000]", "['Peter' , 18000]",
                "['James' , 11000]", "['Mary' , 9000]"}, TextParsingMode.CSV);

        pie.setInnerradius(90d);
        pie.setExplodeslices(true);
        pie.setTitle("Pie Sample");
        pie.setAnimation(true, 2000d);
        pie.setStartangle(30d);

        SolidFill[] a = {
                new SolidFill("#F44336", 1d),
                new SolidFill("#FFEB3B", 1d),
                new SolidFill("#795548", 1d),
                new SolidFill("#4CAF50", 1d),
                new SolidFill("#504CAF", 0.4d)};
        DistinctColors distinctColors = new DistinctColors();
        distinctColors.setItems(a, null);
        pie.setPalette(distinctColors);

        anyChartView.setChart(pie);
    }
}
