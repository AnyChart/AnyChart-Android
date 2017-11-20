package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.Column3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.Set;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Column3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian3d column3d = AnyChart.column3d();

        column3d.getYScale().setStackMode(ScaleStackMode.VALUE);

        column3d.setAnimation(true);

        column3d.setTitle("Types of Coffee");
        column3d.getTitle().setPadding(0d, 0d, 15d, 0d);

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

        Set set = new Set(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Data = set.mapAs("{ x: 'x', value: 'value3' }");
        Mapping series4Data = set.mapAs("{ x: 'x', value: 'value4' }");
        Mapping series5Data = set.mapAs("{ x: 'x', value: 'value5' }");
        Mapping series6Data = set.mapAs("{ x: 'x', value: 'value6' }");

        Column3d series1 = column3d.column(series1Data);
        series1.setName("Espresso");
        series1.setFill(new SolidFill("#3e2723", 1d));
        series1.setStroke("#f7f3f3", 1d, null, null, null);
        series1.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        Column3d series2 = column3d.column(series2Data);
        series2.setName("Water");
        series2.setFill(new SolidFill("#64b5f6", 1d));
        series2.setStroke("#f7f3f3", 1d, null, null, null);
        series2.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        Column3d series3 = column3d.column(series3Data);
        series3.setName("Milk");
        series3.setFill(new SolidFill("#fff3e0", 1d));
        series3.setStroke("#f7f3f3", 1d, null, null, null);
        series3.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        Column3d series4 = column3d.column(series4Data);
        series4.setName("Steamed milk");
        series4.setFill(new SolidFill("#bcaaa4", 1d));
        series4.setStroke("#f7f3f3", 1d, null, null, null);
        series4.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        Column3d series5 = column3d.column(series5Data);
        series5.setName("Cream");
        series5.setFill(new SolidFill("#e6c1b5", 1d));
        series5.setStroke("#f7f3f3", 1d, null, null, null);
        series5.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        Column3d series6 = column3d.column(series6Data);
        series6.setName("Chocolate");
        series6.setFill(new SolidFill("#bf360c", 1d));
        series6.setStroke("#f7f3f3", 1d, null, null, null);
        series6.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        column3d.getLegend().setEnabled(true);
        column3d.getLegend().setFontSize(13d);
        column3d.getLegend().setPadding(0d, 0d, 20d, 0d);

        column3d.getYScale().setTicks("[0, 1, 2, 3, 4, 5]");
        column3d.getXAxis().setStroke("#a18b7e", 1d, null, null, null);
        column3d.getXAxis().getLabels().setFontSize("#a18b7e");
        column3d.getYAxis().setStroke("#a18b7e", 1d, null, null, null);
        column3d.getYAxis().getLabels().setFontColor("#a18b7e");
        column3d.getYAxis().getLabels().setFormat("{%Value}{groupsSeparator: }");

        column3d.getYAxis().getTitle().setEnabled(true);
        column3d.getYAxis().getTitle().setText("Portions of Ingredients");
        column3d.getYAxis().getTitle().setFontColor("#a18b7e");

        column3d.getInteractivity().setHoverMode(HoverMode.BY_X);

        column3d.getTooltip()
                .setDisplayMode(TooltipDisplayMode.UNION)
                .setFormat("{%Value} {%SeriesName}");

        column3d.getYGrid().setStroke("#a18b7e", 1d, null, null, null);
        column3d.getXGrid().setStroke("#a18b7e", 1d, null, null, null);

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
