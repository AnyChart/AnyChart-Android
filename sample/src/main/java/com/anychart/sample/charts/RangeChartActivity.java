package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesRangeColumn;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Set;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class RangeChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian cartesian = AnyChart.cartesian();

        cartesian.setTitle("Coastal Water Temperature \\nin London vs Edinburgh in 2015 (°C)");

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("Jan", 5.8, 7.9, 6.1, 8.9));
        data.add(new CustomDataEntry("Feb", 4.6, 6.1, 5.5, 8.2));
        data.add(new CustomDataEntry("Mar", 5.9, 8.1, 5.9, 8.1));
        data.add(new CustomDataEntry("Apr", 7.8, 10.7, 7.1, 9.8));
        data.add(new CustomDataEntry("May", 10.5, 13.7, 8.3, 10.7));
        data.add(new CustomDataEntry("June", 13.8, 17, 10.7, 14.5));
        data.add(new CustomDataEntry("July", 16.5, 18.5, 12.3, 16.7));
        data.add(new CustomDataEntry("Aug", 17.8, 19, 14, 16.3));
        data.add(new CustomDataEntry("Sep", 15.4, 17.8, 13.7, 15.3));
        data.add(new CustomDataEntry("Oct", 12.7, 15.3, 12.3, 14.4));
        data.add(new CustomDataEntry("Nov", 9.8, 13, 12.9, 10.7));
        data.add(new CustomDataEntry("Dec", 9, 10.1, 8.2, 11.1));

        Set set = new Set(data);
        Mapping londonData = set.mapAs("{ x: 'x', high: 'londonHigh', low: 'londonLow' }");
        Mapping edinburgData = set.mapAs("{ x: 'x', high: 'edinburgHigh', low: 'edinburgLow' }");

        CartesianSeriesRangeColumn columnLondon = cartesian.rangeColumn(londonData);
        columnLondon.setName("London");

        CartesianSeriesRangeColumn columnEdinburg = cartesian.rangeColumn(edinburgData);
        columnEdinburg.setName("Edinburgh");

        cartesian.setXAxis(true);
        cartesian.setYAxis(true);

        cartesian.getYScale()
                .setMinimum(4d)
                .setMaximum(20d);

        cartesian.setLegend(true);

        cartesian.setYGrid(true)
                .setYMinorGrid(true);

        cartesian.getTooltip().setTitleFormat("{%SeriesName} ({%x})");

        anyChartView.setChart(cartesian);
    }

    private class CustomDataEntry extends DataEntry {
        public CustomDataEntry(String x, Number edinburgHigh, Number edinburgLow, Number londonHigh, Number londonLow) {
            setValue("x", x);
            setValue("edinburgHigh", edinburgHigh);
            setValue("edinburgLow", edinburgLow);
            setValue("londonHigh", londonHigh);
            setValue("londonLow", londonLow);
        }
    }

}
