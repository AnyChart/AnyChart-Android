package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Scatter;
import com.anychart.core.scatter.series.Marker;
import com.anychart.enums.Anchor;
import com.anychart.enums.Position;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class QuadrantChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Scatter quadrant = AnyChart.quadrant();

        quadrant.padding(35d, 35d, 35d, 35d);

        List<DataEntry> data = new ArrayList<>();
        data.add(new QuadrantDataEntry(65, 60, "Tableau"));
        data.add(new QuadrantDataEntry(68, 57, "Qlik"));
        data.add(new QuadrantDataEntry(78, 55, "Microsoft"));
        data.add(new QuadrantDataEntry(65.6, 48, "Alteryx"));
        data.add(new QuadrantDataEntry(63, 47, "SAS", new Label[]{ new Label("right") }));
        data.add(new QuadrantDataEntry(64, 43, "SAP"));
        data.add(new QuadrantDataEntry(28, "IBM", new Label[]{ new Label("bottom", 0) }));
        data.add(new QuadrantDataEntry(51, 21, "TIBCO Software"));
        data.add(new QuadrantDataEntry(53.2, 25.8, "Pentaho", new Label[]{ new Label("right") }));
        data.add(new QuadrantDataEntry(47, 48, "Birst", new Label[]{ new Label("right") }));
        data.add(new QuadrantDataEntry(37, 43, "Domo", new Label[]{ new Label("right") }));
        data.add(new QuadrantDataEntry(27.5, "Board International", new Label[]{ new Label("leftTop", -10, 3)}));
        data.add(new QuadrantDataEntry(35, 26.5, "Sisense", new Label[]{ new Label("rightBottom") }));
        data.add(new QuadrantDataEntry(30, 16, "Yellowfin", new Label[]{ new Label("right") }));

        Marker marker = quadrant.marker(data);
        marker.labels()
                .enabled(true)
                .fontFamily("Arial")
                .fontColor("#546e7a");
        marker.labels()
                .position("right")
                .anchor(Anchor.LEFT_CENTER)
                .offsetX(5d)
                .offsetY(0d)
                .format("{%Name}");
        marker.tooltip(false);

        quadrant.quarters(
                "{\n" +
                "      rightTop: {\n" +
                "        title: {\n" +
                "          text: 'LEADERS',\n" +
                "          fontColor: '#ff8f00',\n" +
                "          padding: 10\n" +
                "        }\n" +
                "      },\n" +
                "      rightBottom: {\n" +
                "        title: {\n" +
                "          text: 'VISIONARIES',\n" +
                "          fontColor: '#ff8f00',\n" +
                "          padding: 10\n" +
                "        }\n" +
                "      },\n" +
                "      leftTop: {\n" +
                "        title: {\n" +
                "          text: 'CHALLENGERS',\n" +
                "          fontColor: '#ff8f00',\n" +
                "          padding: 10\n" +
                "        }\n" +
                "      },\n" +
                "      leftBottom: {\n" +
                "        title: {\n" +
                "          text: 'NICHE PLAYERS',\n" +
                "          fontColor: '#ff8f00',\n" +
                "          padding: 10\n" +
                "        }\n" +
                "      }\n" +
                "    }");

        com.anychart.core.ui.Label label = quadrant.quarters().leftBottom().label(0d);
        label.enabled(true);
        label.useHtml(true);
        label.position(Position.LEFT_BOTTOM);
        label.anchor(Anchor.LEFT_CENTER);

        label.offsetX(-20d);
        label.text("Power to Perform &#8594;");
        label.rotation(-90d);

        label = quadrant.quarters().leftBottom().label(1d);
        label.enabled(true);
        label.useHtml(true);
        label.position(Position.LEFT_BOTTOM);
        label.anchor(Anchor.LEFT_CENTER);
        label.offsetY(20d);
        label.text("Entirety of Representation &#8594;");

        anyChartView.setChart(quadrant);
    }

    private class QuadrantDataEntry extends DataEntry {
        QuadrantDataEntry(Number x, Number y, String name) {
            setValue("x", x);
            setValue("y", y);
            setValue("name", name);
        }

        QuadrantDataEntry(Number x, Number y, String name, Label[] labels) {
            setValue("x", x);
            setValue("y", y);
            setValue("name", name);
            setValue("label", labels);
        }

        QuadrantDataEntry(Number y, String name, Label[] labels) {
            setValue("y", y);
            setValue("name", name);
            setValue("label", labels);
        }

    }

    private class Label extends DataEntry {
        Label(String anchor) {
            setValue("anchor", anchor);
        }

        Label(String anchor, Integer offsetX) {
            setValue("anchor", anchor);
            setValue("offsetX", offsetX);
        }

        Label(String anchor, Integer offsetX, Integer offsetY) {
            setValue("anchor", anchor);
            setValue("offsetX", offsetX);
            setValue("offsetY", offsetY);
        }
    }
}
