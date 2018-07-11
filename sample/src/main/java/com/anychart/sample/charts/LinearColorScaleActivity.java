package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsLinearGauge;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.Layout;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.OrdinalColor;
import com.anychart.anychart.Orientation;
import com.anychart.anychart.Position;
import com.anychart.anychart.SingleValueDataSet;
import com.anychart.sample.R;

public class LinearColorScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        ChartsLinearGauge linearGauge = AnyChart.linear();

        linearGauge.setData(new SingleValueDataSet(new Double[] { 5.3D }));

        linearGauge.setLayout(Layout.HORIZONTAL);

        linearGauge.getLabel(0)
                .setPosition(Position.LEFT_CENTER)
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetY("-50px")
                .setOffsetX("50px")
                .setFontColor("black")
                .setFontSize(17);
        linearGauge.getLabel(0).setText("Total Rainfall");

        linearGauge.getLabel(1)
                .setPosition(Position.LEFT_CENTER)
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetY("40px")
                .setOffsetX("50px")
                .setFontColor("#777777")
                .setFontSize(17);
        linearGauge.getLabel(1).setText("Drought Hazard");

        linearGauge.getLabel(2)
                .setPosition(Position.RIGHT_CENTER)
                .setAnchor(EnumsAnchor.RIGHT_CENTER)
                .setOffsetY("40px")
                .setOffsetX("50px")
                .setFontColor("#777777")
                .setFontSize(17);
        linearGauge.getLabel(2).setText("Flood Hazard");

        OrdinalColor scaleBarColorScale = new OrdinalColor();
        scaleBarColorScale.setRanges(
                "[\n" +
                "      {\n" +
                "        from: 0,\n" +
                "        to: 2,\n" +
                "        color: ['red 0.5']\n" +
                "      },\n" +
                "      {\n" +
                "        from: 2,\n" +
                "        to: 3,\n" +
                "        color: ['yellow 0.5']\n" +
                "      },\n" +
                "      {\n" +
                "        from: 3,\n" +
                "        to: 7,\n" +
                "        color: ['green 0.5']\n" +
                "      },\n" +
                "      {\n" +
                "        from: 7,\n" +
                "        to: 8,\n" +
                "        color: ['yellow 0.5']\n" +
                "      },\n" +
                "      {\n" +
                "        from: 8,\n" +
                "        to: 10,\n" +
                "        color: ['red 0.5']\n" +
                "      }\n" +
                "    ]");

        linearGauge.getScaleBar(0)
                .setWidth("5%")
                .setColorScale(scaleBarColorScale);

        linearGauge.marker(0)
                .setType(MarkerType.TRIANGLE_DOWN)
                .setColor("red")
                .setOffset("-3.5%")
                .setZIndex(10);

        linearGauge.getScale()
                .setMinimum(0)
                .setMaximum(10);
//        linearGauge.getScale().setTicks

        linearGauge.getAxis()
                .setMinorTicks(false)
                .setWidth("1%");
        linearGauge.getAxis()
                .setOffset("-1.5%")
                .setOrientation(Orientation.TOP)
                .setLabels("top");

        linearGauge.setPadding(0, 30, 0, 30);

        anyChartView.setChart(linearGauge);
    }
}
