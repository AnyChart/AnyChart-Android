package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.HeatMap;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class RiskMatrixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_matrix);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        HeatMap riskMap = new HeatMap();
        riskMap.setTitle("Risk Matrix in Project Server");
        riskMap.setStroke("#fff", 1d, null, null, null);
        riskMap.setHoverstroke("#fff", 6d, null, null, null);
        riskMap.setHoverfill(new SolidFill("#545f69", 1d));
        riskMap.setData(new String[] {
                "{x: 'Rare', y: 'Insignificant', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Rare', y: 'Minor', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Rare', y: 'Moderate', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Rare', y: 'Major', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Rare', y: 'Extreme', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Unlikely', y: 'Insignificant', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Unlikely', y: 'Minor', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Unlikely', y: 'Moderate', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Unlikely', y: 'Major', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Unlikely', y: 'Extreme', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Possible', y: 'Insignificant', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Possible', y: 'Minor', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Possible', y: 'Moderate', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Possible', y: 'Major', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Possible', y: 'Extreme', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Likely', y: 'Insignificant', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Likely', y: 'Minor', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Likely', y: 'Moderate', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Likely', y: 'Major', heat: 'High', fill: '#ef6c00'}",
                "{x: 'Likely', y: 'Extreme', heat: 'High', fill: '#ef6c00'}",
                "{x: 'Almost\\nCertain', y: 'Insignificant', heat: 'Low', fill: '#90caf9'}",
                "{x: 'Almost\\nCertain', y: 'Minor', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Almost\\nCertain', y: 'Moderate', heat: 'Medium', fill: '#ffb74d'}",
                "{x: 'Almost\\nCertain', y: 'Major', heat: 'High', fill: '#ef6c00'}",
                "{x: 'Almost\\nCertain', y: 'Extreme', heat: 'Extreme', fill: '#d84315'}"
        }, TextParsingMode.CSV);

        anyChartView.setChart(riskMap);
    }
}
