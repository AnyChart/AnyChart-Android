package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesColumn;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Position;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class ColumnChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian cartesian = new Cartesian();
        CartesianSeriesColumn column = cartesian.column(new String[] {
                "['Rouge', '80540']",
                "['Foundation', '94190']",
                "['Mascara', '102610']",
                "['Lip gloss', '110430']",
                "['Lipstick', '128000']",
                "['Nail polish', '143760']",
                "['Eyebrow pencil', '170670']",
                "['Eyeliner', '213210']",
                "['Eyeshadows', '249980']"
        }, TextParsingMode.CSV);

        column.getTooltip()
                .setTitleFormat("'{%X}'")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("'${%Value}{groupsSeparator: }'");

        cartesian.setAnimation(true);
        cartesian.setTitle("'Top 10 Cosmetic Products by Revenue'");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("'${%Value}{groupsSeparator: }'");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("'Product'");
        cartesian.getYAxis().setTitle("'Revenue'");

        anyChartView.setChart(cartesian);
    }
}
