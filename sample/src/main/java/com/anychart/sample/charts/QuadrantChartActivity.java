package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.Position;
import com.anychart.anychart.Scatter;
import com.anychart.anychart.ScatterSeriesMarker;
import com.anychart.anychart.UiLabel;
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

        quadrant.setPadding(35d, 35d, 35d, 35d);

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

        ScatterSeriesMarker marker = quadrant.marker(data);
        marker.getLabels().setEnabled(true);
        marker.getLabels().setFontFamily("Arial")
                .setFontColor("#546e7a");
        marker.getLabels().setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(0d)
                .setFormat("{%Name}");
        marker.setTooltip(false);

        quadrant.setQuarters(
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

        UiLabel label = quadrant.getQuarters().getLeftBottom().getLabel(0d);
        label.setEnabled(true);
        label.setUseHtml(true);
        label.setPosition(Position.LEFT_BOTTOM);
        label.setAnchor(EnumsAnchor.LEFT_CENTER);

        label.setOffsetX(-20d);
        label.setText("Power to Perform &#8594;");
        label.setRotation(-90d);

        label = quadrant.getQuarters().getLeftBottom().getLabel(1d);
        label.setEnabled(true);
        label.setUseHtml(true);
        label.setPosition(Position.LEFT_BOTTOM);
        label.setAnchor(EnumsAnchor.LEFT_CENTER);
        label.setOffsetY(20d);
        label.setText("Entirety of Representation &#8594;");

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
