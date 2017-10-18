package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.Orientation;
import com.anychart.sample.R;

public class MekkoChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        ChartsMekko mekko = AnyChart.mekko();

        mekko.setData(new String[] {
                "['Acer', 2254, 1274, 635, 253]",
                "['Dell', 1010, 950, 675, 250]",
                "['HP', 417, 631, 405, 251]",
                "['Lenovo', 210, 307, 450, 257]"
        });

        mekko.getGetSeriesAt(0d).setName("'Phone'");
        mekko.getGetSeriesAt(1d).setName("'Tablet'");
        mekko.getGetSeriesAt(2d).setName("'Desktop'");
        mekko.getGetSeriesAt(3d).setName("'Laptop'");

        mekko.getXAxis().setOrientation(Orientation.TOP);

        mekko.getLabels().setFormat("'${%Value}k'");

        mekko.getTooltip().setFormat("'{%seriesName}: ${%Value}k'");

        anyChartView.setChart(mekko);
    }
}
