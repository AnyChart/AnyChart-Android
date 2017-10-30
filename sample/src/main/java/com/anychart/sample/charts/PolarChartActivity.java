package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsPolar;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.PolarSeriesType;
import com.anychart.anychart.ScaleTypes;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class PolarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsPolar polar = AnyChart.polar();

        List<DataEntry> data = new ArrayList<>();

        data.add(new ValueDataEntry("Nail polish", 12814));
        data.add(new ValueDataEntry("Eyebrow pencil", 13012));
        data.add(new ValueDataEntry("Rouge", 11624));
        data.add(new ValueDataEntry("Pomade", 8814));
        data.add(new ValueDataEntry("Eyeshadows", 12998));
        data.add(new ValueDataEntry("Eyeliner", 12321));
        data.add(new ValueDataEntry("Foundation", 10342));
        data.add(new ValueDataEntry("Lip gloss", 22998));
        data.add(new ValueDataEntry("Mascara", 11261));
        data.add(new ValueDataEntry("Powder", 10261));

        polar.column(data);

        data.clear();
        data.add(new ValueDataEntry("Nail polish", 4376));
        data.add(new ValueDataEntry("Eyebrow pencil", 3987));
        data.add(new ValueDataEntry("Rouge", 3574));
        data.add(new ValueDataEntry("Pomade", 4376));
        data.add(new ValueDataEntry("Eyeshadows", 4572));
        data.add(new ValueDataEntry("Eyeliner", 3417));
        data.add(new ValueDataEntry("Foundation", 5231));
        data.add(new ValueDataEntry("Lip gloss", 4572));
        data.add(new ValueDataEntry("Mascara", 6134));
        data.add(new ValueDataEntry("Powder", 5134));

        polar.column(data);

        data.clear();
        data.add(new ValueDataEntry("Nail polish", 4229));
        data.add(new ValueDataEntry("Eyebrow pencil", 3932));
        data.add(new ValueDataEntry("Rouge", 5221));
        data.add(new ValueDataEntry("Pomade", 9256));
        data.add(new ValueDataEntry("Eyeshadows", 3308));
        data.add(new ValueDataEntry("Eyeliner", 5432));
        data.add(new ValueDataEntry("Foundation", 13701));
        data.add(new ValueDataEntry("Lip gloss", 4008));
        data.add(new ValueDataEntry("Mascara", 18712));
        data.add(new ValueDataEntry("Powder", 25712));

        polar.column(data);

        polar.setTitle("Company Profit Dynamic in Regions by Year");

        polar.setSortPointsByX(true)
                .setDefaultSeriesType(PolarSeriesType.COLUMN)
                .setYAxis(false)
                .setXScale(ScaleTypes.ORDINAL);

        polar.getTitle().getMargin().setBottom(20d);

        // TODO stackMode
//        polar.getYScale().setStackMode(ScaleStackMode.VALUE);

        polar.getTooltip()
                .setValuePrefix("$")
                .setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(polar);
    }
}
