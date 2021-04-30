package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Polar;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.PolarSeriesType;
import com.anychart.enums.ScaleStackMode;
import com.anychart.enums.ScaleTypes;
import com.anychart.enums.TooltipDisplayMode;
import com.anychart.sample.R;
import com.anychart.scales.Linear;

import java.util.ArrayList;
import java.util.List;

public class PolarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Polar polar = AnyChart.polar();

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

        Set set = Set.instantiate();
        set.data(data);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");

        polar.column(series1Data);

        polar.column(series2Data);

        polar.column(series3Data);

        polar.title("Company Profit Dynamic in Regions by Year");

        polar.sortPointsByX(true)
                .defaultSeriesType(PolarSeriesType.COLUMN)
                .yAxis(false)
                .xScale(ScaleTypes.ORDINAL);

        polar.title().margin().bottom(20d);

        ((Linear) polar.yScale(Linear.class)).stackMode(ScaleStackMode.VALUE);

        polar.tooltip()
                .valuePrefix("$")
                .displayMode(TooltipDisplayMode.UNION);

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
