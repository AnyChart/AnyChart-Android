package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsRadar;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAlign;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.RadarSeriesLine;
import com.anychart.anychart.Set;
import com.anychart.anychart.ValueDataEntry;
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

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("Strength", 136, 199, 43));
        data.add(new CustomDataEntry("Agility", 79, 125, 56));
        data.add(new CustomDataEntry("Stamina", 149, 173, 101));
        data.add(new CustomDataEntry("Intellect", 135, 33, 202));
        data.add(new CustomDataEntry("Spirit", 158, 64, 196));

        Set set = new Set(data);
        Mapping shamanData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping warriorData = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping priestData = set.mapAs("{ x: 'x', value: 'value3' }");

        RadarSeriesLine shamanLine = radar.line(shamanData);
        shamanLine.setName("Shaman");
        shamanLine.getMarkers().setEnabled(true);
        shamanLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        RadarSeriesLine warriorLine = radar.line(warriorData);
        warriorLine.setName("Warrior");
        warriorLine.getMarkers().setEnabled(true);
        warriorLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        RadarSeriesLine priestLine = radar.line(priestData);
        priestLine.setName("Priest");
        priestLine.getMarkers().setEnabled(true);
        priestLine.getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(3d);

        radar.getTooltip().setFormat("Value: {%Value}");

        anyChartView.setChart(radar);
    }

    private class CustomDataEntry extends ValueDataEntry {
        public CustomDataEntry(String x, Number value, Number value2, Number value3) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
        }
    }
}
