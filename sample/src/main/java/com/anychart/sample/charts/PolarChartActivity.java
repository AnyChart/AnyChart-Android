package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsPolar;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.PolarSeriesType;
import com.anychart.anychart.ScaleTypes;
import com.anychart.anychart.Set;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.ValueDataEntry;
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
        data.add(new CustomDataEntry("Nail polish", 12814, 4376, 4229));
        data.add(new CustomDataEntry("Eyebrow pencil", 13012, 3987, 3932));
        data.add(new CustomDataEntry("Rouge", 11624, 3574, 5221));
        data.add(new CustomDataEntry("Pomade", 8814, 4376, 9256));
        data.add(new CustomDataEntry("Eyeshadows", 12998, 4572, 3308));
        data.add(new CustomDataEntry("Eyeliner", 12321, 3417, 5432));
        data.add(new CustomDataEntry("Foundation", 10342, 5231, 13701));
        data.add(new CustomDataEntry("Lip gloss", 22998, 4572, 4008));
        data.add(new CustomDataEntry("Mascara", 11261, 6134, 18712));
        data.add(new CustomDataEntry("Powder", 10261, 5134, 25712));

        Set set = new Set(data);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");

        polar.column(series1Data);

        polar.column(series2Data);

        polar.column(series3Data);

        polar.setTitle("Company Profit Dynamic in Regions by Year");

        polar.setSortPointsByX(true)
                .setDefaultSeriesType(PolarSeriesType.COLUMN)
                .setYAxis(false)
                .setXScale(ScaleTypes.ORDINAL);

        polar.getTitle().getMargin().setBottom(20d);

        polar.getTooltip()
                .setValuePrefix("$")
                .setDisplayMode(TooltipDisplayMode.UNION);

        anyChartView.setChart(polar);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2, Number value3) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
        }
    }
}
