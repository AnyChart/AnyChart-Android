package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.HeatDataEntry;
import com.anychart.charts.HeatMap;
import com.anychart.enums.SelectionMode;
import com.anychart.graphics.vector.SolidFill;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class HeatMapChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        HeatMap riskMap = AnyChart.heatMap();

        riskMap.stroke("1 #fff");
        riskMap.hovered()
                .stroke("6 #fff")
                .fill(new SolidFill("#545f69", 1d))
                .labels("{ fontColor: '#fff' }");

        riskMap.interactivity().selectionMode(SelectionMode.NONE);

        riskMap.title().enabled(true);
        riskMap.title()
                .text("Risk Matrix in Project Server")
                .padding(0d, 0d, 20d, 0d);

        riskMap.labels().enabled(true);
        riskMap.labels()
                .minFontSize(14d)
                .format("function() {\n" +
                        "      var namesList = [\"Low\", \"Medium\", \"High\", \"Extreme\"];\n" +
                        "      return namesList[this.heat];\n" +
                        "    }");

        riskMap.yAxis(0).stroke(null);
        riskMap.yAxis(0).labels().padding(0d, 15d, 0d, 0d);
        riskMap.yAxis(0).ticks(false);
        riskMap.xAxis(0).stroke(null);
        riskMap.xAxis(0).ticks(false);

        riskMap.tooltip().title().useHtml(true);
        riskMap.tooltip()
                .useHtml(true)
                .titleFormat("function() {\n" +
                        "      var namesList = [\"Low\", \"Medium\", \"High\", \"Extreme\"];\n" +
                        "      return '<b>' + namesList[this.heat] + '</b> Residual Risk';\n" +
                        "    }")
                .format("function () {\n" +
                        "       return '<span style=\"color: #CECECE\">Likelihood: </span>' + this.x + '<br/>' +\n" +
                        "           '<span style=\"color: #CECECE\">Consequence: </span>' + this.y;\n" +
                        "   }");

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomHeatDataEntry("Rare", "Insignificant", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Rare", "Minor", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Rare", "Moderate", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Rare", "Major", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Rare", "Extreme", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Unlikely", "Insignificant", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Unlikely", "Minor", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Unlikely", "Moderate", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Unlikely", "Major", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Unlikely", "Extreme", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Possible", "Insignificant", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Possible", "Minor", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Possible", "Moderate", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Possible", "Major", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Possible", "Extreme", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Likely", "Insignificant", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Likely", "Minor", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Likely", "Moderate", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Likely", "Major", 2, "#ef6c00"));
        data.add(new CustomHeatDataEntry("Likely", "Extreme", 2, "#ef6c00"));
        data.add(new CustomHeatDataEntry("Almost\\nCertain", "Insignificant", 0, "#90caf9"));
        data.add(new CustomHeatDataEntry("Almost\\nCertain", "Minor", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Almost\\nCertain", "Moderate", 1, "#ffb74d"));
        data.add(new CustomHeatDataEntry("Almost\\nCertain", "Major", 2, "#ef6c00"));
        data.add(new CustomHeatDataEntry("Almost\\nCertain", "Extreme", 3, "#d84315"));

        riskMap.data(data);


        anyChartView.setChart(riskMap);
    }

    private class CustomHeatDataEntry extends HeatDataEntry {
        CustomHeatDataEntry(String x, String y, Integer heat, String fill) {
            super(x, y, heat);
            setValue("fill", fill);
        }
    }

}
