package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.Set;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class VerticalChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Cartesian cartesian = new Cartesian();
        cartesian.setAnimation(true);
        cartesian.setTitle("'Vertical Combination of Bar'");// and Jump Line Chart'");
        cartesian.setLabels(true);
        cartesian.setXaxis(true);
        cartesian.getYAxis().getLabels().setFormat("'${%Value} mln'");
        cartesian.setBar(new String[] {
                "['Jan', 11.5]",
                "['Feb', 12]",
                "['Mar', 11.7]",
                "['Apr', 12.4]",
                "['May', 13.5]",
                "['Jun', 11.9]",
                "['Jul', 14.6]",
                "['Aug', 17.2]",
                "['Sep', 16.9]",
                "['Oct', 15.4]",
                "['Nov', 16.9]",
                "['Dec', 17.2]"
        }, TextParsingMode.CSV);
        Set dataSet = new Set();
        dataSet.setData(new String[] {
                "['Jan', 11.5]",
                "['Feb', 12]",
                "['Mar', 11.7]",
                "['Apr', 12.4]",
                "['May', 13.5]",
                "['Jun', 11.9]",
                "['Jul', 14.6]",
                "['Aug', 17.2]",
                "['Sep', 16.9]",
                "['Oct', 15.4]",
                "['Nov', 16.9]",
                "['Dec', 17.2]"
        }, TextParsingMode.CSV);
//        series = dataSet.setMapas(null, "{x: [0], value: [1]}", null, null);
//        cartesian.setJumpline(new String[] {
//                "['Jan', 9.3]",
//                "['Feb', 10.5]",
//                "['Mar', 11.2]",
//                "['Apr', 11.2]",
//                "['May', 12.7]",
//                "['Jun', 13.1]",
//                "['Jul', 12.2]",
//                "['Aug', 12.2]",
//                "['Sep', 10.1]",
//                "['Oct', 14.5]",
//                "['Nov', 14.5]",
//                "['Dec', 15.5]"
//        }, TextParsingMode.CSV);

        anyChartView.setChart(cartesian);
    }
}
