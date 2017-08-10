package com.anychart.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.chart.common.dataentry.DataEntry;
import com.anychart.anychart.chart.common.JavaScriptInterface;
import com.anychart.anychart.chart.common.enums.OverlapMode;
import com.anychart.anychart.chart.piechart.PieChart;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<DataEntry> data = new ArrayList<>();
        DataEntry dataEntry = new DataEntry("A", 637166d);
//        dataEntry.getMarkers().setEnable(true);
//        dataEntry.getMarkers().setType(MarkerType.ARROW_DOWN);
//        dataEntry.setFill(new SolidFill("#123456"));
//        dataEntry.setFill(new LinearGradientFill(45,
//                Arrays.asList(new GradientKey("#90caf9", 0.2, 0.3), new GradientKey("#000000")), Mode.instantiateMode(false), 0.4d));
//        dataEntry.setFill(new RadialGradientFill(0.5, 0.5, 0.9, 0.3,
//                Arrays.asList(new GradientKey("#90caf9", 0.2, 0.3), new GradientKey("#000000")),
//                Mode.instantiateMode(new Rect(0, 0, 20, 20)),
//                0.81));
//        dataEntry.setStroke(new SolidStroke("#000000", "10 2", Stroke.LineCap.ROUND, Stroke.LineJoin.ROUND, 0.8, 1));
//        dataEntry.setStroke(new LinearGradientStroke(45, "10 2",
//                Arrays.asList(new GradientKey("#90caf9"), new GradientKey("#000000", 0.7, 0.6)), Stroke.LineCap.ROUND, Stroke.LineJoin.ROUND,
//                null, 1, 3));
//        dataEntry.setStroke(new RadialGradientStroke(.5, 0.5, 0.9, 0.3,
//                "5 5 2",
//                Arrays.asList(new GradientKey("#90caf9", 0.2, 0.3), new GradientKey("#000000")),
//                Stroke.LineCap.BUTT, Stroke.LineJoin.BEVEL,
//                Mode.instantiateMode(new Rect(0, 0, 20, 20)),
//                0.81, 1));
//        dataEntry.getLabels().setRotation(45);
        data.add(dataEntry);
        data.add(new DataEntry("B", 721630d));
        data.add(new DataEntry("C", 148662d));
        data.add(new DataEntry("D", 78662d));
        data.add(new DataEntry("E", 90000d));

        final PieChart pieChart = new PieChart();
        pieChart.setData(data);
//        pieChart.setEnabledLabels(false);
//        pieChart.setEnabledHoverLabels(false);
        pieChart.setTitle("Pie Chart");
//        pieChart.setEnabledLegend(false);
//        pieChart.setBounds(0, 200, 200, 500);
        pieChart.setEnabledCredits(false);
        pieChart.setEnabledTooltip(false);
        pieChart.setBackgroundColor("#9E9E9E", 0.3d);
//        pieChart.setMargin(50, 20, 30, 80);
        pieChart.setInnerRadius(30);
        pieChart.setRadius(20);
        pieChart.setStartAngle(20);
        pieChart.setEnabledAnimation(true);
        pieChart.setOverlapMode(OverlapMode.ALLOW_OVERLAP);
//        pieChart.setPadding(50, 20, 180, 60);
        pieChart.setExplode(100);
//        pieChart.setExplodeSlice(0);
//        pieChart.setExplodeSlices(true);

//        List<String> colors = new ArrayList<>(Arrays.asList("#90caf9", "#80cbc4", "#aed581", "#e6ee9c", "#000000"));
//        pieChart.setPalette(colors);

        pieChart.setOnClickListener(new JavaScriptInterface.OnClick() {
            @Override
            public void onClick(String x, String value) {
                Log.e("DEBUG", x);
//                Toast.makeText(MainActivity.this, String.format(Locale.US, "x: %s, value: %s", x, value), Toast.LENGTH_SHORT).show();
            }
        });

        final AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        anyChartView.setChart(pieChart);
    }
}
