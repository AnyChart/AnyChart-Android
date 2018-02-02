package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.BackgroundCornersType;
import com.anychart.anychart.ChartsMap;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.LegendLayout;
import com.anychart.anychart.MapSeriesBubble;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.SelectionMode;
import com.anychart.anychart.Set;
import com.anychart.anychart.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BubbleMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsMap bubbleMap = AnyChart.bubbleMap();

        List<DataEntry> data = new ArrayList<>();

        data.add(new CustomDataEntry("AU.NS", 25, 7));
        data.add(new CustomDataEntry("AU.NT", 15, 4));
        data.add(new CustomDataEntry("AU.WA", 23, 9));
        data.add(new CustomDataEntry("AU.SA", 21, 15));
        data.add(new CustomDataEntry("AU.VI", 5, 3));
        data.add(new CustomDataEntry("AU.QL", 2, null));
        data.add(new CustomDataEntry("AU.TS", 9, 1));

        bubbleMap.setGeoData("anychart.maps.australia");

        bubbleMap.getTitle().setEnabled(true);
        bubbleMap.getTitle().setText("ACME corp. Offices by Australian Regions");
        bubbleMap.getTitle().setPadding(0, 0, 10, 0);

        Set dataSet1 = new Set(data);
        Mapping mapping1 = dataSet1.mapAs("{ 'id': 'id', 'size': 'offices' }");

        MapSeriesBubble series1 = bubbleMap.bubble(mapping1);
        series1.setName("Amount of Offices in Region");
        series1.setLegendItem("{ iconType: 'circle' }");
        series1.setGeoIdField("code_hasc");
        series1.getLabels()
                .setAnchor(EnumsAnchor.LEFT_TOP)
                .setPosition("right")
                .setFontSize(14)
                .setFontColor("#212121");

        Set dataSet2 = new Set(data);
        Mapping mapping2 = dataSet2.mapAs("{ 'id': 'id', 'size': 'last_year' }");

        MapSeriesBubble series2 = bubbleMap.bubble(mapping2);
        series2.setName("Were Opened in Last Year");
        series2.setLabels(false);
        series2.setLegendItem("{ iconType: 'circle' }");
        series2.setGeoIdField("code_hasc");

        bubbleMap.getTooltip()
                .setUseHtml(true)
                .setTitle("{ fontColor: '#7c868e' }")
                .setPadding(8, 13, 10, 13)
                .setFormat("function() {\n" +
                        "          var span_for_value = '<span style=\"color: #545f69; font-size: 12px; font-weight: bold\">';\n" +
                        "          var span_for_description = '<br/><span style=\"color: #7c868e; font-size: 12px; font-style: italic\">';\n" +
                        "          if (this.getData('last_year') > 0) {\n" +
                        "            return span_for_value + this.getData('offices') + ' offices</span></strong>' +\n" +
                        "              span_for_description + this.getData('last_year') + ' opened in last year</span>';\n" +
                        "          } else {\n" +
                        "            return span_for_value + this.getData('offices') + ' offices</span></strong>';\n" +
                        "          }\n" +
                        "        }");
        bubbleMap.getTooltip().getBackground().setEnabled(true);
        bubbleMap.getTooltip().getBackground()
                .setFill(new SolidFill("#fff", 1))
                .setStroke("#c1c1c1")
                .setCorners("3")
                .setCornerType(BackgroundCornersType.ROUND);

        bubbleMap.getLegend().setEnabled(true);
        bubbleMap.getLegend()
                .setPosition("center-top")
                .setAlign(EnumsAlign.CENTER)
                .setItemsLayout(LegendLayout.HORIZONTAL)
                .setPadding(0, 0, 30, 0)
                .setPaginator(false);
        bubbleMap.getInteractivity().setSelectionMode(SelectionMode.NONE);

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
