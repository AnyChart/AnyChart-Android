package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.HeatDataEntry;
import com.anychart.anychart.HeatMap;
import com.anychart.anychart.SelectionMode;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.Stroke;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class HeatMapChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        HeatMap riskMap = AnyChart.heatMap();

        riskMap.setStroke("#fff", 1d, null, null, null);
        riskMap.getHovered()
                .setStroke("#fff", 6d, null, null, null)
                .setFill(new SolidFill("#545f69", 1d))
                .setLabels("{ fontColor: '#fff' }");

        riskMap.getInteractivity().setSelectionMode(SelectionMode.NONE);

        riskMap.getTitle().setEnabled(true);
        riskMap.getTitle()
                .setText("Risk Matrix in Project Server")
                .setPadding(0d, 0d, 20d, 0d);

        riskMap.getLabels().setEnabled(true);
        riskMap.getLabels()
                .setMinFontSize(14d)
                .setFormat("function() {\n" +
                        "      var namesList = [\"Low\", \"Medium\", \"High\", \"Extreme\"];\n" +
                        "      return namesList[this.heat];\n" +
                        "    }");

        riskMap.getYAxis().setStroke((Stroke) null, null, null, null, null);
        riskMap.getYAxis().getLabels().setPadding(0d, 15d, 0d, 0d);
        riskMap.getYAxis().setTicks(false);
        riskMap.getXAxis().setStroke((Stroke) null, null, null, null, null);
        riskMap.getXAxis().setTicks(false);

//        riskMap.getTooltip().getTitle().setUseHtml(true);
//        riskMap.getTooltip()
//                .setUseHtml(true)
//                .setTitleFormat("function() {\n" +
//                        "      var namesList = [\"Low\", \"Medium\", \"High\", \"Extreme\"];\n" +
//                        "      return '<b>' + namesList[this.heat] + '</b> Residual Risk';\n" +
//                        "    }")
//                .setFormat("function () {\n" +
//                        "       return '<span style=\"color: #CECECE\">Likelihood: </span>' + this.x + '<br/>' +\n" +
//                        "           '<span style=\"color: #CECECE\">Consequence: </span>' + this.y;\n" +
//                        "   }");

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

        riskMap.setData(data);


        anyChartView.setChart(riskMap);
    }

    private class CustomHeatDataEntry extends HeatDataEntry {
        CustomHeatDataEntry(String x, String y, Integer heat, String fill) {
            super(x, y, heat);
            setValue("fill", fill);
        }
    }

}
