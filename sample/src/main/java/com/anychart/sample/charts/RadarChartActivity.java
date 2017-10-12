package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsRadar;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.RadarSeriesLine;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        ChartsRadar radar = new ChartsRadar();
        radar.setTitle("'WoW base stats comparison radar chart: Shaman vs Warrior vs Priest'");
        RadarSeriesLine shamanLine = radar.line(new String[] {
                "['Strength', 136]",
                "['Agility', 79]",
                "['Stamina', 149]",
                "['Intellect', 135]",
                "['Spirit', 158]"
        }, TextParsingMode.CSV);
        shamanLine.setName("'Shaman'");
        // TODO setEnabled return VisualBase
        shamanLine.getMarkers().setEnabled(true);
        shamanLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);
        RadarSeriesLine warriorLine = radar.line(new String[]{
                "['Strength', 199]",
                "['Agility', 125]",
                "['Stamina', 173]",
                "['Intellect', 33]",
                "['Spirit', 64]"
        }, TextParsingMode.CSV);
        warriorLine.setName("'Warrior'");
        warriorLine.getMarkers().setEnabled(true);
        warriorLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);
        RadarSeriesLine priestLine = radar.line(new String[]{
                "['Strength', 43]",
                "['Agility', 56]",
                "['Stamina', 101]",
                "['Intellect', 202]",
                "['Spirit', 196]"
        }, TextParsingMode.CSV);
        priestLine.setName("'Priest'");
        priestLine.getMarkers().setEnabled(true);
        priestLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        radar.getYScale().setMinimum(0d);
        radar.getYScale().setMinimumGap(0d);
        radar.getYScale().getTicks().setInterval(50d);

        radar.getXAxis().getLabels().setPadding(5d);

        radar.getLegend().setAlign(EnumsAlign.CENTER);
        radar.getLegend().setEnabled(true);

        radar.getTooltip().setFormat("'Value: {%Value}'");

        anyChartView.setChart(radar);
    }
}
