package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesColumn;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Position;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class ColumnChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new SingleValueDataEntry("Rouge", 80540));
        data.add(new SingleValueDataEntry("Foundation", 94190));
        data.add(new SingleValueDataEntry("Mascara", 102610));
        data.add(new SingleValueDataEntry("Lip gloss", 110430));
        data.add(new SingleValueDataEntry("Lipstick", 128000));
        data.add(new SingleValueDataEntry("Nail polish", 143760));
        data.add(new SingleValueDataEntry("Eyebrow pencil", 170670));
        data.add(new SingleValueDataEntry("Eyeliner", 213210));
        data.add(new SingleValueDataEntry("Eyeshadows", 249980));

        CartesianSeriesColumn column = cartesian.column(data);

        column.getTooltip()
                .setTitleFormat("{%X}")
                .setPosition(Position.CENTER_BOTTOM)
                .setAnchor(EnumsAnchor.CENTER_BOTTOM)
                .setOffsetX(0d)
                .setOffsetY(5d)
                .setFormat("${%Value}{groupsSeparator: }");

        cartesian.setAnimation(true);
        cartesian.setTitle("Top 10 Cosmetic Products by Revenue");

        cartesian.getYScale().setMinimum(0d);

        cartesian.getYAxis().getLabels().setFormat("${%Value}{groupsSeparator: }");

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);
        cartesian.getInteractivity().setHoverMode(HoverMode.BY_X);

        cartesian.getXAxis().setTitle("Product");
        cartesian.getYAxis().setTitle("Revenue");

        anyChartView.setChart(cartesian);
    }
}
