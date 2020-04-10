package com.example.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Line;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Anchor;
import com.anychart.enums.MarkerType;
import com.anychart.enums.TooltipPositionMode;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<DataEntry> data = new ArrayList<>();
    Button buttonPlot;
    private static String TAG = "hda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Cartesian graph = AnyChart.line();
        graph.padding(10d, 20d, 5d, 20d);

        graph.animation(true);
        graph.title("Network parameters and GPS data");

        graph.yAxis(0).title("dBM");
        graph.xAxis(0).labels().padding(5d,5d,5d,5d);

        graph.tooltip().positionMode(TooltipPositionMode.POINT);

        buttonPlot = findViewById(R.id.buttonPlot);


        data.add(new CustomDataEntry(1, -112, -20, -77));
        data.add(new CustomDataEntry(2, -75, -5, -20));
        data.add(new CustomDataEntry(3, -76, -6, -51));


        Set set = Set.instantiate();
        set.data(data);

        buttonPlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: button clicked");
                data.add(new CustomDataEntry(2, -75, -5, -20));
                data.add(new CustomDataEntry(3, -76, -6, -51));
                data.add(new CustomDataEntry(2, -75, -5, -20));
                data.add(new CustomDataEntry(3, -76, -6, -51));
            }
        });

        Mapping series1Mapping = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Mapping = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Mapping = set.mapAs("{ x: 'x', value: 'value3' }");


        Line series1 = graph.line(series1Mapping);
        series1.name("RSRP");
        series1.hovered().markers().enabled(true);
        series1.hovered().markers()
                .type(MarkerType.CIRCLE)
                .size(2d);
        series1.tooltip()
                .position("right")
                .anchor(Anchor.LEFT_CENTER)
                .offsetX(2d)
                .offsetY(2d);


        Line series2 = graph.line(series2Mapping);
        series2.name("RSRQ");
        series2.hovered().markers().enabled(true);
        series2.hovered().markers()
                .type(MarkerType.CIRCLE)
                .size(2d);
        series2.tooltip()
                .position("right")
                .anchor(Anchor.LEFT_CENTER)
                .offsetX(2d)
                .offsetY(2d);

        Line series3 = graph.line(series3Mapping);
        series3.name("RSSI");
        series3.hovered().markers().enabled(true);
        series3.hovered().markers()
                .type(MarkerType.CIRCLE)
                .size(2d);
        series3.tooltip()
                .position("right")
                .anchor(Anchor.LEFT_CENTER)
                .offsetX(2d)
                .offsetY(2d);


        graph.legend().enabled(true);
        graph.legend().fontSize(13d);
        graph.legend().padding(0d, 0d, 4d, 0d);


        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setChart(graph);

    }

}

  class CustomDataEntry extends ValueDataEntry {

    CustomDataEntry(Number x, Number value, Number value2, Number value3) {
        super(x, value);
        setValue("value2", value2);
        setValue("value3", value3);

    }

}
