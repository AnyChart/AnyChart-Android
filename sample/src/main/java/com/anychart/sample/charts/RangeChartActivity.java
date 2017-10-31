package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesRangeColumn;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HighLowDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class RangeChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian cartesian = AnyChart.cartesian();

        cartesian.setTitle("Coastal Water Temperature \\nin London vs Edinburgh in 2015 (°C)");

        CartesianSeriesRangeColumn columnLondon = cartesian.rangeColumn(getLondonData());
        columnLondon.setName("London");

        CartesianSeriesRangeColumn columnEdinburg = cartesian.rangeColumn(getEdinburghData());
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

    private List<DataEntry> getEdinburghData() {
        List<DataEntry> edinburgData = new ArrayList<>();
        edinburgData.add(new HighLowDataEntry("Jan", 5.8, 7.9));
        edinburgData.add(new HighLowDataEntry("Feb", 4.6, 6.1));
        edinburgData.add(new HighLowDataEntry("Mar", 5.9, 8.1));
        edinburgData.add(new HighLowDataEntry("Apr", 7.8, 10.7));
        edinburgData.add(new HighLowDataEntry("May", 10.5, 13.7));
        edinburgData.add(new HighLowDataEntry("June", 13.8, 17));
        edinburgData.add(new HighLowDataEntry("July", 16.5, 18.5));
        edinburgData.add(new HighLowDataEntry("Aug", 17.8, 19));
        edinburgData.add(new HighLowDataEntry("Sep", 15.4, 17.8));
        edinburgData.add(new HighLowDataEntry("Oct", 12.7, 15.3));
        edinburgData.add(new HighLowDataEntry("Nov", 9.8, 13));
        edinburgData.add(new HighLowDataEntry("Dec", 9, 10.1));

        return edinburgData;
    }

    private List<DataEntry> getLondonData() {
        List<DataEntry> londonData = new ArrayList<>();
        londonData.add(new HighLowDataEntry("Jan", 6.1, 8.9));
        londonData.add(new HighLowDataEntry("Feb", 5.5, 8.2));
        londonData.add(new HighLowDataEntry("Mar", 5.9, 8.1));
        londonData.add(new HighLowDataEntry("Apr", 7.1, 9.8));
        londonData.add(new HighLowDataEntry("May", 8.3, 10.7));
        londonData.add(new HighLowDataEntry("June", 10.7, 14.5));
        londonData.add(new HighLowDataEntry("July", 12.3, 16.7));
        londonData.add(new HighLowDataEntry("Aug", 14, 16.3));
        londonData.add(new HighLowDataEntry("Sep", 13.7, 15.3));
        londonData.add(new HighLowDataEntry("Oct", 12.3, 14.4));
        londonData.add(new HighLowDataEntry("Nov", 12.9, 10.7));
        londonData.add(new HighLowDataEntry("Dec", 8.2, 11.1));

        return londonData;
    }
}
