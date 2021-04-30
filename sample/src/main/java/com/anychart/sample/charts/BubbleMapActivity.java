package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Map;
import com.anychart.core.map.series.Bubble;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Align;
import com.anychart.enums.Anchor;
import com.anychart.enums.BackgroundCornersType;
import com.anychart.enums.LegendLayout;
import com.anychart.enums.SelectionMode;
import com.anychart.graphics.vector.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BubbleMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Map bubbleMap = AnyChart.bubbleMap();

        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry("AU.NS", 25, 7));
        data.add(new CustomDataEntry("AU.NT", 15, 4));
        data.add(new CustomDataEntry("AU.WA", 23, 9));
        data.add(new CustomDataEntry("AU.SA", 21, 15));
        data.add(new CustomDataEntry("AU.VI", 5, 3));
        data.add(new CustomDataEntry("AU.QL", 2, null));
        data.add(new CustomDataEntry("AU.TS", 9, 1));

        bubbleMap.geoData("anychart.maps.australia");

        bubbleMap.title().enabled(true);
        bubbleMap.title().text("ACME corp. Offices by Australian Regions");
        bubbleMap.title().padding(0, 0, 10, 0);

        Set dataSet1 = Set.instantiate();
        dataSet1.data(data);
        Mapping mapping1 = dataSet1.mapAs("{ 'id': 'id', 'size': 'offices' }");

        Bubble series1 = bubbleMap.bubble(mapping1);
        series1.name("Amount of Offices in Region");
        series1.legendItem("{ iconType: 'circle' }");
        series1.geoIdField("code_hasc");
        series1.labels()
                .anchor(Anchor.LEFT_TOP)
                .position("right")
                .fontSize(14)
                .fontColor("#212121");

        Set dataSet2 = Set.instantiate();
        dataSet2.data(data);
        Mapping mapping2 = dataSet2.mapAs("{ 'id': 'id', 'size': 'last_year' }");

        Bubble series2 = bubbleMap.bubble(mapping2);
        series2.name("Were Opened in Last Year");
        series2.labels(false);
        series2.legendItem("{ iconType: 'circle' }");
        series2.geoIdField("code_hasc");

        bubbleMap.tooltip()
                .useHtml(true)
                .title("{ fontColor: '#7c868e' }")
                .padding(8, 13, 10, 13)
                .format("function() {\n" +
                        "          var span_for_value = '<span style=\"color: #545f69; font-size: 12px; font-weight: bold\">';\n" +
                        "          var span_for_description = '<br/><span style=\"color: #7c868e; font-size: 12px; font-style: italic\">';\n" +
                        "          if (this.getData('last_year') > 0) {\n" +
                        "            return span_for_value + this.getData('offices') + ' offices</span></strong>' +\n" +
                        "              span_for_description + this.getData('last_year') + ' opened in last year</span>';\n" +
                        "          } else {\n" +
                        "            return span_for_value + this.getData('offices') + ' offices</span></strong>';\n" +
                        "          }\n" +
                        "        }");
        bubbleMap.tooltip().background()
                .enabled(true)
                .fill(new SolidFill("#fff", 1))
                .stroke("#c1c1c1")
                .corners("3")
                .cornerType(BackgroundCornersType.ROUND);

        bubbleMap.legend()
                .enabled(true)
                .position("center-top")
                .align(Align.CENTER)
                .itemsLayout(LegendLayout.HORIZONTAL)
                .padding(0, 0, 30, 0)
                .paginator(false);
        bubbleMap.interactivity().selectionMode(SelectionMode.NONE);

        anyChartView.addScript("file:///android_asset/australia.js");
        anyChartView.addScript("file:///android_asset/proj4.js");
        anyChartView.setChart(bubbleMap);
    }

    private class CustomDataEntry extends DataEntry {
        public CustomDataEntry(String id, Integer offices, Integer lastYear) {
            setValue("id", id);
            setValue("offices", offices);
            setValue("last_year", lastYear);
        }
    }
}
