package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.CartesianSeriesBase;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.Pareto;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.StrokeLineCap;
import com.anychart.anychart.StrokeLineJoin;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ParetoChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Pareto pareto = AnyChart.pareto();

        List<DataEntry> data = new ArrayList<>();

        data.add(new ValueDataEntry("Food is tasteless", 65));
        data.add(new ValueDataEntry("Wait time", 109));
        data.add(new ValueDataEntry("Unfriendly staff", 12.5));
        data.add(new ValueDataEntry("Not clean", 45));
        data.add(new ValueDataEntry("Overpriced", 250));
        data.add(new ValueDataEntry("To noisy", 27));
        data.add(new ValueDataEntry("Food not fresh", 35));
        data.add(new ValueDataEntry("Small portions", 170));
        data.add(new ValueDataEntry("Not atmosphere", 35));
        data.add(new ValueDataEntry("Food is to salty", 35));

        pareto.setData(data);

        pareto.setTitle("Pareto Chart of Restaurant Complaints");

        pareto.getYAxis(0d).setTitle("Defect frequency");

        pareto.getYAxis(1d).setTitle("Cumulative Percentage");

        pareto.setAnimation(true);

        pareto.getLineMarker()
                .setValue(80d)
                .setAxis(pareto.getXAxis(1d))
                .setStroke("#A5B3B3", 1d, "5 2", StrokeLineJoin.ROUND, StrokeLineCap.ROUND);

        pareto.getGetSeries(0d).getTooltip().setFormat("Value: {%Value}");

        CartesianSeriesBase line = pareto.getGetSeries(1d);
        line.setSeriesType("spline")
                .setMarkers(true);
        line.getLabels().setEnabled(true);
        line.getLabels()
                .setAnchor(EnumsAnchor.RIGHT_BOTTOM)
                .setFormat("{%CF}%");
        line.getTooltip().setFormat("Cumulative Frequency: {%CF}% \\n Relative Frequency: {%RF}%");

        pareto.getCrosshair().setEnabled(true);
        pareto.getCrosshair().setXLabel(true);

        anyChartView.setChart(pareto);
    }
}
