package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsRadar;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.RadarSeriesLine;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        ChartsRadar radar = AnyChart.radar();

        radar.setTitle("WoW base stats comparison radar chart: Shaman vs Warrior vs Priest");

        radar.getYScale().setMinimum(0d);
        radar.getYScale().setMinimumGap(0d);
        radar.getYScale().getTicks().setInterval(50d);

        radar.getXAxis().getLabels().setPadding(5d, 5d, 5d, 5d);

        radar.getLegend()
                .setAlign(EnumsAlign.CENTER)
                .setEnabled(true);

        List<DataEntry> shamanData = new ArrayList<>();

        shamanData.add(new SingleValueDataEntry("Strength", 136));
        shamanData.add(new SingleValueDataEntry("Agility", 79));
        shamanData.add(new SingleValueDataEntry("Stamina", 149));
        shamanData.add(new SingleValueDataEntry("Intellect", 135));
        shamanData.add(new SingleValueDataEntry("Spirit", 158));

        RadarSeriesLine shamanLine = radar.line(shamanData);
        shamanLine.setName("Shaman");
        shamanLine.getMarkers().setEnabled(true);
        shamanLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        List<DataEntry> warriorData = new ArrayList<>();

        warriorData.add(new SingleValueDataEntry("Strength", 199));
        warriorData.add(new SingleValueDataEntry("Agility", 125));
        warriorData.add(new SingleValueDataEntry("Stamina", 173));
        warriorData.add(new SingleValueDataEntry("Intellect", 33));
        warriorData.add(new SingleValueDataEntry("Spirit", 64));

        RadarSeriesLine warriorLine = radar.line(warriorData);
        warriorLine.setName("Warrior");
        warriorLine.getMarkers().setEnabled(true);
        warriorLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        List<DataEntry> priestData = new ArrayList<>();

        priestData.add(new SingleValueDataEntry("Strength", 43));
        priestData.add(new SingleValueDataEntry("Agility", 56));
        priestData.add(new SingleValueDataEntry("Stamina", 101));
        priestData.add(new SingleValueDataEntry("Intellect", 202));
        priestData.add(new SingleValueDataEntry("Spirit", 196));

        RadarSeriesLine priestLine = radar.line(priestData);
        priestLine.setName("Priest");
        priestLine.getMarkers().setEnabled(true);
        priestLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        radar.getTooltip().setFormat("Value: {%Value}");

        anyChartView.setChart(radar);
    }
}
