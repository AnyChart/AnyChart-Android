package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesRangeColumn;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class RangeChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Cartesian cartesian = new Cartesian();

        cartesian.setTitle("'Coastal Water Temperature \\nin London vs Edinburgh in 2015 (°C)'");

        CartesianSeriesRangeColumn columnLondon = cartesian.rangeColumn(getLondonData(), TextParsingMode.CSV);
        columnLondon.setName("'London'");

        CartesianSeriesRangeColumn columnEdinburg = cartesian.rangeColumn(getEdinburghData(), TextParsingMode.CSV);
        columnEdinburg.setName("'Edinburgh'");

        cartesian.setXAxis(true);
        cartesian.setYAxis(true);

        cartesian.getYScale()
                .setMinimum(4d)
                .setMaximum(20d);

        cartesian.setLegend(true);

        cartesian.setYGrid(true)
                .setYMinorGrid(true);

        cartesian.getTooltip().setTitleFormat("'{%SeriesName} ({%x})'");

        anyChartView.setChart(cartesian);
    }

    private String[] getEdinburghData() {
        return new String[] {
                "['Jan', 1, 6.1, 8.9, 'Jan (Edinburgh)']",
                "['Feb', 1, 5.5, 8.2, 'Feb (Edinburgh)']",
                "['Mar', 1, 5.9, 8.1, 'Mar (Edinburgh)']",
                "['Apr', 1, 7.1, 9.8, 'Apr (Edinburgh)']",
                "['May', 1, 8.3, 10.7, 'May (Edinburgh)']",
                "['June', 1, 10.7, 14.5, 'June (Edinburgh)']",
                "['July', 1, 12.3, 16.7, 'July (Edinburgh)']",
                "['Aug', 1, 14, 16.3, 'Aug (Edinburgh)']",
                "['Sep', 1, 13.7, 15.3, 'Sep (Edinburgh)']",
                "['Oct', 1, 12.3, 14.4, 'Oct (Edinburgh)']",
                "['Nov', 1, 12.9, 10.7, 'Nov (Edinburgh)']",
                "['Dec', 1, 8.2, 11.1, 'Dec (Edinburgh)']"
        };
    }

    private String[] getLondonData() {
        return new String[] {
                "['Jan', 1, 5.8, 7.9, 'Jan (London)']",
                "['Feb', 1, 4.6, 6.1, 'Feb (London)']",
                "['Mar', 1, 5.9, 8.1, 'Mar (London)']",
                "['Apr', 1, 7.8, 10.7, 'Apr (London)']",
                "['May', 1, 10.5, 13.7, 'May (London)']",
                "['June', 1, 13.8, 17, 'June (London)']",
                "['July', 1, 16.5, 18.5, 'July (London)']",
                "['Aug', 1, 17.8, 19, 'Aug (London)']",
                "['Sep', 1, 15.4, 17.8, 'Sep (London)']",
                "['Oct', 1, 12.7, 15.3, 'Oct (London)']",
                "['Nov', 1, 9.8, 13, 'Nov (London)']",
                "['Dec', 1, 9, 10.1, 'Dec (London)']"
        };
    }
}
