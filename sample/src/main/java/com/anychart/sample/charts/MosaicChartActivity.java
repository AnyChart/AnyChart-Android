package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsMekko;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.sample.R;

public class MosaicChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        ChartsMekko mosaic = AnyChart.mosaic();

        mosaic.setTitle("'Skills and Self-ID Top Factors'");

        mosaic.getGetSeriesAt(0d).setName("'Business'");
        mosaic.getGetSeriesAt(1d).setName("'ML/Big Data'");
        mosaic.getGetSeriesAt(2d).setName("'Math/OR'");
        mosaic.getGetSeriesAt(3d).setName("'Programming'");
        mosaic.getGetSeriesAt(4d).setName("'Statistics'");

        mosaic.setData(new String[] {
                "['Data Businessperson', 50, 15, 10, 5, 25]",
                "['Data Creative', 17, 23, 10, 20, 30]",
                "['Data Developer', 17, 25, 16, 27, 15]",
                "['Data Researcher', 12, 15, 17, 5, 51]"
        });

        mosaic.getXAxis().setOrientation(Orientation.TOP);
        mosaic.getTooltip().setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(mosaic);
    }
}
