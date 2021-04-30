package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian3d;
import com.anychart.core.cartesian.series.Column3d;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.HoverMode;
import com.anychart.enums.ScaleStackMode;
import com.anychart.enums.TooltipDisplayMode;
import com.anychart.graphics.vector.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Column3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian3d column3d = AnyChart.column3d();

        column3d.yScale().stackMode(ScaleStackMode.VALUE);

        column3d.animation(true);

        column3d.title("Types of Coffee");
        column3d.title().padding(0d, 0d, 15d, 0d);

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new CustomDataEntry("Espresso", 1, null, null, null, null, null));
        seriesData.add(new CustomDataEntry("Doppio", 2, null, null, null, null, null));
        seriesData.add(new CustomDataEntry("Trippio", 3, null, null, null, null, null));
        seriesData.add(new CustomDataEntry("Americano", 1, 3, null, null, null, null));
        seriesData.add(new CustomDataEntry("Cappuchino", 1, null, 1, 2, null, null));
        seriesData.add(new CustomDataEntry("Macchiato", 2.5, null, null, 1, null, null));
        seriesData.add(new CustomDataEntry("Latte", 1, null, 2, 1, null, null));
        seriesData.add(new CustomDataEntry("Latte Macchiato", 1, null, 2, null, 1, null));
        seriesData.add(new CustomDataEntry("Vienna Coffee", 1, null, null, null, 2, null));
        seriesData.add(new CustomDataEntry("Mocco", 1, null, 1, null, 1, 1));

        Set set = Set.instantiate();
        set.data(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping series4Data = set.mapAs("{ x: 'x', value: 'value4' }");
        Mapping series5Data = set.mapAs("{ x: 'x', value: 'value5' }");
        Mapping series6Data = set.mapAs("{ x: 'x', value: 'value6' }");

        Column3d series1 = column3d.column(series1Data);
        series1.name("Espresso");
        series1.fill(new SolidFill("#3e2723", 1d));
        series1.stroke("1 #f7f3f3");
        series1.hovered().stroke("3 #f7f3f3");

        Column3d series2 = column3d.column(series2Data);
        series2.name("Water");
        series2.fill(new SolidFill("#64b5f6", 1d));
        series2.stroke("1 #f7f3f3");
        series2.hovered().stroke("3 #f7f3f3");

        Column3d series3 = column3d.column(series3Data);
        series3.name("Milk");
        series3.fill(new SolidFill("#fff3e0", 1d));
        series3.stroke("1 #f7f3f3");
        series3.hovered().stroke("3 #f7f3f3");

        Column3d series4 = column3d.column(series4Data);
        series4.name("Steamed milk");
        series4.fill(new SolidFill("#bcaaa4", 1d));
        series4.stroke("1 #f7f3f3");
        series4.hovered().stroke("3 #f7f3f3");

        Column3d series5 = column3d.column(series5Data);
        series5.name("Cream");
        series5.fill(new SolidFill("#e6c1b5", 1d));
        series5.stroke("1 #f7f3f3");
        series5.hovered().stroke("3 #f7f3f3");

        Column3d series6 = column3d.column(series6Data);
        series6.name("Chocolate");
        series6.fill(new SolidFill("#bf360c", 1d));
        series6.stroke("1 #f7f3f3");
        series6.hovered().stroke("3 #f7f3f3");

        column3d.legend().enabled(true);
        column3d.legend().fontSize(13d);
        column3d.legend().padding(0d, 0d, 20d, 0d);

        column3d.yScale().ticks("[0, 1, 2, 3, 4, 5]");
        column3d.xAxis(0).stroke("1 #a18b7e");
        column3d.xAxis(0).labels().fontSize("#a18b7e");
        column3d.yAxis(0).stroke("1 #a18b7e");
        column3d.yAxis(0).labels().fontColor("#a18b7e");
        column3d.yAxis(0).labels().format("{%Value}{groupsSeparator: }");

        column3d.yAxis(0).title().enabled(true);
        column3d.yAxis(0).title().text("Portions of Ingredients");
        column3d.yAxis(0).title().fontColor("#a18b7e");

        column3d.interactivity().hoverMode(HoverMode.BY_X);

        column3d.tooltip()
                .displayMode(TooltipDisplayMode.UNION)
                .format("{%Value} {%SeriesName}");

        column3d.yGrid(0).stroke("#a18b7e", 1d, null, null, null);
        column3d.xGrid(0).stroke("#a18b7e", 1d, null, null, null);

        anyChartView.setChart(column3d);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2, Number value3, Number value4, Number value5, Number value6) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
            setValue("value4", value4);
            setValue("value5", value5);
            setValue("value6", value6);
        }
    }
}
