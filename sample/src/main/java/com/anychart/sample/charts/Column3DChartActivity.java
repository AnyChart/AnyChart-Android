package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.Column3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TooltipDisplayMode;
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

        List<DataEntry> series1Data = new ArrayList<>();

        series1Data.add(new SingleValueDataEntry("Espresso", 1));
        series1Data.add(new SingleValueDataEntry("Doppio", 2));
        series1Data.add(new SingleValueDataEntry("Trippio", 3));
        series1Data.add(new SingleValueDataEntry("Americano", 1));
        series1Data.add(new SingleValueDataEntry("Cappuchino", 1));
        series1Data.add(new SingleValueDataEntry("Macchiato", 2.5));
        series1Data.add(new SingleValueDataEntry("Latte", 1));
        series1Data.add(new SingleValueDataEntry("Latte Macchiato", 1));
        series1Data.add(new SingleValueDataEntry("Vienna Coffee", 1));
        series1Data.add(new SingleValueDataEntry("Mocco", 1));

        Column3d series1 = column3d.column(series1Data);
        series1.setName("Espresso");
        series1.setFill(new SolidFill("#3e2723", 1d));
        series1.setStroke("#f7f3f3", 1d, null, null, null);
        series1.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        List<DataEntry> series2Data = new ArrayList<>();

        series2Data.add(new SingleValueDataEntry("Espresso", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Doppio", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Trippio", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Americano", 3));
        series2Data.add(new SingleValueDataEntry("Cappuchino", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Macchiato", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Latte", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Latte Macchiato", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Vienna Coffee", (Integer) null));
        series2Data.add(new SingleValueDataEntry("Mocco", (Integer) null));

        Column3d series2 = column3d.column(series2Data);
        series2.setName("Water");
        series2.setFill(new SolidFill("#64b5f6", 1d));
        series2.setStroke("#f7f3f3", 1d, null, null, null);
        series2.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        List<DataEntry> series3Data = new ArrayList<>();

        series3Data.add(new SingleValueDataEntry("Espresso", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Doppio", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Trippio", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Americano", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Cappuchino", 1));
        series3Data.add(new SingleValueDataEntry("Macchiato", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Latte", 2));
        series3Data.add(new SingleValueDataEntry("Latte Macchiato", 2));
        series3Data.add(new SingleValueDataEntry("Vienna Coffee", (Integer) null));
        series3Data.add(new SingleValueDataEntry("Mocco", 1));

        Column3d series3 = column3d.column(series3Data);
        series3.setName("Milk");
        series3.setFill(new SolidFill("#fff3e0", 1d));
        series3.setStroke("#f7f3f3", 1d, null, null, null);
        series3.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        List<DataEntry> series4Data = new ArrayList<>();

        series4Data.add(new SingleValueDataEntry("Espresso", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Doppio", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Trippio", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Americano", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Cappuchino", 2));
        series4Data.add(new SingleValueDataEntry("Macchiato", 1));
        series4Data.add(new SingleValueDataEntry("Latte", 1));
        series4Data.add(new SingleValueDataEntry("Latte Macchiato", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Vienna Coffee", (Integer) null));
        series4Data.add(new SingleValueDataEntry("Mocco", (Integer) null));

        Column3d series4 = column3d.column(series4Data);
        series4.setName("Steamed milk");
        series4.setFill(new SolidFill("#bcaaa4", 1d));
        series4.setStroke("#f7f3f3", 1d, null, null, null);
        series4.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        List<DataEntry> series5Data = new ArrayList<>();

        series5Data.add(new SingleValueDataEntry("Espresso", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Doppio", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Trippio", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Americano", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Cappuchino", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Macchiato", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Latte", (Integer) null));
        series5Data.add(new SingleValueDataEntry("Latte Macchiato", 1));
        series5Data.add(new SingleValueDataEntry("Vienna Coffee", 2));
        series5Data.add(new SingleValueDataEntry("Mocco", 1));

        Column3d series5 = column3d.column(series5Data);
        series5.setName("Cream");
        series5.setFill(new SolidFill("#e6c1b5", 1d));
        series5.setStroke("#f7f3f3", 1d, null, null, null);
        series5.getHovered().setStroke("#f7f3f3", 3d, null, null, null);

        List<DataEntry> series6Data = new ArrayList<>();

        series6Data.add(new SingleValueDataEntry("Espresso", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Doppio", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Trippio", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Americano", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Cappuchino", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Macchiato", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Latte", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Latte Macchiato", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Vienna Coffee", (Integer) null));
        series6Data.add(new SingleValueDataEntry("Mocco", 1));

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
}
