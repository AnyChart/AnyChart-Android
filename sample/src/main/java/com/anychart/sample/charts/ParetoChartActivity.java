package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pareto;
import com.anychart.core.cartesian.series.Base;
import com.anychart.enums.Anchor;
import com.anychart.graphics.vector.StrokeLineCap;
import com.anychart.graphics.vector.StrokeLineJoin;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ParetoChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

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

        pareto.data(data);

        pareto.title("Pareto Chart of Restaurant Complaints");

        pareto.yAxis(0d).title("Defect frequency");

        pareto.yAxis(1d).title("Cumulative Percentage");

        pareto.animation(true);

        pareto.lineMarker(0)
                .value(80d)
                .axis(pareto.yAxis(1d))
                .stroke("#A5B3B3", 1d, "5 2", StrokeLineJoin.ROUND, StrokeLineCap.ROUND);

        pareto.getSeries(0d).tooltip().format("Value: {%Value}");

        Base line = pareto.getSeries(1d);
        line.seriesType("spline")
                .markers(true);
        line.labels().enabled(true);
        line.labels()
                .anchor(Anchor.RIGHT_BOTTOM)
                .format("{%CF}%");
        line.tooltip().format("Cumulative Frequency: {%CF}% \\n Relative Frequency: {%RF}%");

        pareto.crosshair().enabled(true);
        pareto.crosshair().xLabel(true);

        anyChartView.setChart(pareto);
    }
}
