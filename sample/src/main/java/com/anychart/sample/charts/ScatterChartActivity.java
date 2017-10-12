package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.GradientKey;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.LinearGradientStroke;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.Scatter;
import com.anychart.anychart.ScatterSeriesLine;
import com.anychart.anychart.ScatterSeriesMarker;
import com.anychart.anychart.TextHAlign;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipDisplayMode;
import com.anychart.sample.R;

public class ScatterChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Scatter scatter = new Scatter();
        scatter.setAnimation(true)
                .setTitle("'System interruptions'");
        ScatterSeriesMarker marker = scatter.marker(getMarkerData(), TextParsingMode.CSV);
        marker.setType(MarkerType.TRIANGLE_UP);
//        marker.setFill("'#000'", 1d);
        marker.getTooltip().setHAlign(TextHAlign.LEFT);

        ScatterSeriesLine scatterSeriesLine = scatter.line(getLineData(), TextParsingMode.CSV);

        scatter.getXScale().setMinimum(1.5d);
        scatter.getXScale().setMaximum(5.5d);
//        scatter.getXScale().settick
        scatter.getYScale().setMinimum(40d);
        scatter.getYScale().setMaximum(100d);

        scatter.getYAxis().setTitle("'Waiting time between interruptions (Min)'");
        scatter.getXAxis().setTitle("'Interruption duration (Min)'");
        scatter.getXAxis().setDrawFirstLabel(false);
        scatter.getXAxis().setDrawLastLabel(false);

        scatter.getInteractivity().setHoverMode(HoverMode.BY_SPOT);
        scatter.getInteractivity().setSpotRadius(30d);
//        Bounds bounds = new Bounds();bounds.setSet()

        scatter.getTooltip().setDisplayMode(TooltipDisplayMode.UNION);

        GradientKey gradientKey[] = new GradientKey[] {
                new GradientKey("'#abcabc'", 0d, 1d),
                new GradientKey("'#cbacba'", 40d, 1d)
        };
        LinearGradientStroke linearGradientStroke = new LinearGradientStroke(gradientKey, true, 0d, null, null, null, 1d, 2d);
        scatterSeriesLine.setStroke(linearGradientStroke, 3d, null, null, null);

        anyChartView.setChart(scatter);
    }

    private String[] getLineData() {
        return new String[] {
                "[1.7, 54.310454158527]",
                "[1.8, 55.2005091829704]",
                "[1.9, 56.0905642074139]",
                "[2, 56.9806192318574]",
                "[2.1, 57.8706742563008]",
                "[2.2, 58.7607292807443]",
                "[2.3, 59.6507843051877]",
                "[2.5, 61.4308943540747]",
                "[2.6, 62.3209493785181]",
                "[2.7, 63.2110044029616]",
                "[2.9, 64.9911144518485]",
                "[3, 65.881169476292]",
                "[3.1, 66.7712245007354]",
                "[3.2, 67.6612795251789]",
                "[3.3, 68.5513345496223]",
                "[3.4, 69.4413895740658]",
                "[3.5, 70.3314445985093]",
                "[3.6, 71.2214996229527]",
                "[3.7, 72.1115546473962]",
                "[3.8, 73.0016096718396]",
                "[3.9, 73.8916646962831]",
                "[4, 74.7817197207266]",
                "[4.1, 75.67177474517]",
                "[4.2, 76.5618297696135]",
                "[4.3, 77.4518847940569]",
                "[4.4, 78.3419398185004]",
                "[4.5, 79.2319948429438]",
                "[4.6, 80.1220498673873]",
                "[4.7, 81.0121048918308]",
                "[4.8, 81.9021599162742]",
                "[4.9, 82.7922149407177]",
                "[5, 83.6822699651611]",
                "[5.1, 84.5723249896046]",
                "[5.2, 85.4623800140481]\n"
        };
    }

    private String[] getMarkerData() {
        return new String[] {
                "[4.4, 78]",
                "[3.9, 74]",
                "[4, 68]",
                "[4, 76]",
                "[3.5, 80]",
                "[4.1, 84]",
                "[2.3, 50]",
                "[4.7, 93]",
                "[1.7, 55]",
                "[4.9, 76]",
                "[1.7, 58]",
                "[4.6, 74]",
                "[3.4, 75]",
                "[4.3, 80]",
                "[1.7, 56]",
                "[3.9, 80]",
                "[3.7, 69]",
                "[3.1, 57]",
                "[4, 90]",
                "[1.8, 42]",
                "[4.1, 91]",
                "[1.8, 51]",
                "[3.2, 79]",
                "[1.9, 53]",
                "[4.6, 82]",
                "[2, 51]",
                "[4.5, 76]",
                "[3.9, 82]",
                "[4.3, 84]",
                "[2.3, 53]",
                "[3.8, 86]",
                "[1.9, 51]",
                "[4.6, 85]",
                "[1.8, 45]",
                "[4.7, 88]",
                "[1.8, 51]",
                "[4.6, 80]",
                "[1.9, 49]",
                "[3.5, 82]",
                "[4, 75]",
                "[3.7, 73]",
                "[3.7, 67]",
                "[4.3, 68]",
                "[3.6, 86]",
                "[3.8, 72]",
                "[3.8, 75]",
                "[3.8, 75]",
                "[2.5, 66]",
                "[4.5, 84]",
                "[4.1, 70]",
                "[3.7, 79]",
                "[3.8, 60]",
                "[3.4, 86]",
                "[4, 71]",
                "[2.3, 67]",
                "[4.4, 81]",
                "[4.1, 76]",
                "[4.3, 83]",
                "[3.3, 76]",
                "[2, 55]",
                "[4.3, 73]",
                "[2.9, 56]",
                "[4.6, 83]",
                "[1.9, 57]",
                "[3.6, 71]",
                "[3.7, 72]",
                "[3.7, 77]",
                "[1.8, 55]",
                "[4.6, 75]",
                "[3.5, 73]",
                "[4, 70]",
                "[3.7, 83]",
                "[1.7, 50]",
                "[4.6, 95]",
                "[1.7, 51]",
                "[4, 82]",
                "[1.8, 54]",
                "[4.4, 83]",
                "[1.9, 51]",
                "[4.6, 80]",
                "[2.9, 78]",
                "[3.5, 81]",
                "[2, 53]",
                "[4.3, 89]",
                "[1.8, 44]",
                "[4.1, 78]",
                "[1.8, 61]",
                "[4.7, 73]",
                "[4.2, 75]",
                "[3.9, 73]",
                "[4.3, 76]",
                "[1.8, 55]",
                "[4.5, 86]",
                "[2, 48]",
                "[4.2, 77]",
                "[4.4, 73]",
                "[4.1, 70]",
                "[4.1, 88]",
                "[4, 75]",
                "[4.1, 83]",
                "[2.7, 61]",
                "[4.6, 78]",
                "[1.9, 61]",
                "[4.5, 81]",
                "[2, 51]",
                "[4.8, 80]",
                "[4.1, 79]",
                "[4.1, 82]",
                "[4.2, 80]",
                "[4.5, 76]",
                "[1.9, 56]",
                "[4.7, 82]",
                "[2, 47]",
                "[4.7, 76]",
                "[2.5, 61]",
                "[4.3, 75]",
                "[4.4, 72]",
                "[4.4, 74]",
                "[4.3, 69]",
                "[4.6, 78]",
                "[2.1, 52]",
                "[4.8, 91]",
                "[4.1, 66]",
                "[4, 71]",
                "[4, 75]",
                "[4.4, 81]",
                "[4.1, 77]",
                "[4.3, 74]",
                "[4, 70]",
                "[3.9, 83]",
                "[3.2, 53]",
                "[4.5, 82]",
                "[2.2, 62]",
                "[4.7, 73]",
                "[4.6, 84]",
                "[2.2, 58]",
                "[4.8, 82]",
                "[4.3, 77]",
                "[3.8, 75]",
                "[4, 77]",
                "[4.1, 77]",
                "[1.8, 53]",
                "[4.4, 75]",
                "[4, 78]",
                "[2.2, 51]",
                "[5.1, 81]",
                "[1.9, 52]",
                "[5, 76]",
                "[4.4, 73]",
                "[4.5, 84]",
                "[3.8, 72]",
                "[4.3, 89]",
                "[4.4, 75]",
                "[2.2, 57]",
                "[4.8, 81]",
                "[1.9, 49]",
                "[4.7, 87]",
                "[1.8, 43]",
                "[4.8, 94]",
                "[2, 45]",
                "[4.4, 81]",
                "[2.5, 59]",
                "[4.3, 82]",
                "[4.4, 80]",
                "[1.9, 54]",
                "[4.7, 75]",
                "[4.3, 73]",
                "[2.2, 57]",
                "[4.7, 80]",
                "[2.3, 51]",
                "[4.6, 77]",
                "[3.3, 66]",
                "[4.2, 77]",
                "[2.9, 60]",
                "[4.6, 86]",
                "[3.3, 62]",
                "[4.2, 75]",
                "[2.6, 67]",
                "[4.6, 69]",
                "[3.7, 84]",
                "[1.8, 58]",
                "[4.7, 90]",
                "[4.5, 82]",
                "[4.5, 71]",
                "[4.8, 80]",
                "[2, 51]",
                "[4.8, 80]",
                "[1.9, 62]",
                "[4.7, 84]",
                "[2, 51]",
                "[5.1, 81]",
                "[4.3, 83]",
                "[4.8, 84]",
                "[3, 72]",
                "[2.1, 54]",
                "[4.6, 75]",
                "[4, 74]",
                "[2.2, 51]",
                "[5.1, 91]",
                "[2.9, 60]",
                "[4.3, 80]",
                "[2.1, 54]",
                "[4.7, 80]",
                "[4.5, 70]",
                "[1.7, 60]",
                "[4.2, 86]",
                "[4.3, 78]",
                "[1.7, 51]",
                "[4.4, 83]",
                "[4.2, 76]",
                "[2.2, 51]",
                "[4.7, 90]",
                "[4, 71]",
                "[1.8, 49]",
                "[4.7, 88]",
                "[1.8, 52]",
                "[4.5, 79]",
                "[2.1, 61]",
                "[4.2, 81]",
                "[2.1, 48]",
                "[5.2, 84]",
                "[2, 63]\n"
        };
    }
}
