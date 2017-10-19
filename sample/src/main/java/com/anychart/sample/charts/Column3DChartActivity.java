package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.CartesianSeriesColumn;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.ScaleStackMode;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.sample.R;

public class Column3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian3d column3d = AnyChart.column3d();

        column3d.getYScale().setStackMode(ScaleStackMode.VALUE);

        column3d.setAnimation(true);

        column3d.setTitle("'Types of Coffee'");
        column3d.getTitle().setPadding(0d, 0d, 15d, 0d);

        CartesianSeriesColumn series1 = column3d.column(new String[] {
                "['Espresso', 1]",
                "['Doppio', 2]",
                "['Trippio', 3]",
                "['Americano', 1]",
                "['Cappuchino', 1]",
                "['Macchiato', 2.5]",
                "['Latte', 1]",
                "['Latte Macchiato', 1]",
                "['Vienna Coffee', 1]",
                "['Mocco', 1]"
        }, TextParsingMode.CSV);
        series1.setName("'Espresso'");
        series1.setFill(new SolidFill("'#3e2723'", 1d));
        series1.setStroke("'#f7f3f3'", 1d, null, null, null);
        series1.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        CartesianSeriesColumn series2 = column3d.column(new String[] {
                "['Espresso', null]",
                "['Doppio', null]",
                "['Trippio', null]",
                "['Americano', 3]",
                "['Cappuchino', null]",
                "['Macchiato', null]",
                "['Latte', null]",
                "['Latte Macchiato', null]",
                "['Vienna Coffee', null]",
                "['Mocco', null]"
        }, TextParsingMode.CSV);
        series2.setName("'Water'");
        series2.setFill(new SolidFill("'#64b5f6'", 1d));
        series2.setStroke("'#f7f3f3'", 1d, null, null, null);
        series2.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        CartesianSeriesColumn series3 = column3d.column(new String[] {
                "['Espresso', null]",
                "['Doppio', null]",
                "['Trippio', null]",
                "['Americano', null]",
                "['Cappuchino', 1]",
                "['Macchiato', null]",
                "['Latte', 2]",
                "['Latte Macchiato', 2]",
                "['Vienna Coffee', null]",
                "['Mocco', 1]"
        }, TextParsingMode.CSV);
        series3.setName("'Milk'");
        series3.setFill(new SolidFill("'#fff3e0'", 1d));
        series3.setStroke("'#f7f3f3'", 1d, null, null, null);
        series3.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        CartesianSeriesColumn series4 = column3d.column(new String[] {
                "['Espresso', null]",
                "['Doppio', null]",
                "['Trippio', null]",
                "['Americano', null]",
                "['Cappuchino', 2]",
                "['Macchiato', 1]",
                "['Latte', 1]",
                "['Latte Macchiato', null]",
                "['Vienna Coffee', null]",
                "['Mocco', null]"
        }, TextParsingMode.CSV);
        series4.setName("'Steamed milk'");
        series4.setFill(new SolidFill("'#bcaaa4'", 1d));
        series4.setStroke("'#f7f3f3'", 1d, null, null, null);
        series4.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        CartesianSeriesColumn series5 = column3d.column(new String[] {
                "['Espresso', null]",
                "['Doppio', null]",
                "['Trippio', null]",
                "['Americano', null]",
                "['Cappuchino', null]",
                "['Macchiato', null]",
                "['Latte', null]",
                "['Latte Macchiato', 1]",
                "['Vienna Coffee', 2]",
                "['Mocco', 1]"
        }, TextParsingMode.CSV);
        series5.setName("'Cream'");
        series5.setFill(new SolidFill("'#e6c1b5'", 1d));
        series5.setStroke("'#f7f3f3'", 1d, null, null, null);
        series5.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        CartesianSeriesColumn series6 = column3d.column(new String[] {
                "['Espresso', null]",
                "['Doppio', null]",
                "['Trippio', null]",
                "['Americano', null]",
                "['Cappuchino', null]",
                "['Macchiato', null]",
                "['Latte', null]",
                "['Latte Macchiato', null]",
                "['Vienna Coffee', null]",
                "['Mocco', 1]"
        }, TextParsingMode.CSV);
        series6.setName("'Chocolate'");
        series6.setFill(new SolidFill("'#bf360c'", 1d));
        series6.setStroke("'#f7f3f3'", 1d, null, null, null);
        series6.getHovered().setStroke("'#f7f3f3'", 3d, null, null, null);

        column3d.getLegend().setEnabled(true);
        column3d.getLegend().setFontSize(13d);
        column3d.getLegend().setPadding(0d, 0d, 20d, 0d);

        column3d.getYScale().setTicks("[0, 1, 2, 3, 4, 5]");
        column3d.getXAxis().setStroke("'#a18b7e'", 1d, null, null, null);
        column3d.getXAxis().getLabels().setFontSize("'#a18b7e'");
        column3d.getYAxis().setStroke("'#a18b7e'", 1d, null, null, null);
        column3d.getYAxis().getLabels().setFontColor("'#a18b7e'");
        column3d.getYAxis().getLabels().setFormat("'{%Value}{groupsSeparator: }'");

        column3d.getYAxis().getTitle().setEnabled(true);
        column3d.getYAxis().getTitle().setText("'Portions of Ingredients'");
        column3d.getYAxis().getTitle().setFontColor("'#a18b7e'");

        column3d.getInteractivity().setHoverMode(HoverMode.BY_X);

        column3d.getTooltip()
                .setDisplayMode(TooltipDisplayMode.UNION)
                .setFormat("'{%Value} {%SeriesName}'");

        column3d.getYGrid().setStroke("'#a18b7e'", 1d, null, null, null);
        column3d.getXGrid().setStroke("'#a18b7e'", 1d, null, null, null);

        anyChartView.setChart(column3d);
    }
}
