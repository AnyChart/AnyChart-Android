package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Polar;
import com.anychart.anychart.PolarSeriesType;
import com.anychart.anychart.ScaleTypes;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class PolarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Polar polar = new Polar();
        polar.setColumn(new String[] {
                "['Nail polish', 12814]",
                "['Eyebrow pencil', 13012]",
                "['Rouge', 11624]",
                "['Pomade', 8814]",
                "['Eyeshadows', 12998]",
                "['Eyeliner', 12321]",
                "['Foundation', 10342]",
                "['Lip gloss', 22998]",
                "['Mascara', 11261]",
                "['Powder', 10261]"
        }, TextParsingMode.CSV);
        polar.setColumn(new String[] {
                "['Nail polish', 3054]",
                "['Eyebrow pencil', 5067]",
                "['Rouge', 7004]",
                "['Pomade', 9054]",
                "['Eyeshadows', 12043]",
                "['Eyeliner', 15067]",
                "['Foundation', 10119]",
                "['Lip gloss', 12043]",
                "['Mascara', 10419]",
                "['Powder', 14419]"
        }, TextParsingMode.CSV);
        polar.setColumn(new String[] {
                "['Nail polish', 4376]",
                "['Eyebrow pencil', 3987]",
                "['Rouge', 3574]",
                "['Pomade', 4376]",
                "['Eyeshadows', 4572]",
                "['Eyeliner', 3417]",
                "['Foundation', 5231]",
                "['Lip gloss', 4572]",
                "['Mascara', 6134]",
                "['Powder', 5134]"
        }, TextParsingMode.CSV);
        polar.setColumn(new String[] {
                "['Nail polish', 4229]",
                "['Eyebrow pencil', 3932]",
                "['Rouge', 5221]",
                "['Pomade', 9256]",
                "['Eyeshadows', 3308]",
                "['Eyeliner', 5432]",
                "['Foundation', 13701]",
                "['Lip gloss', 4008]",
                "['Mascara', 18712]",
                "['Powder', 25712]"
        }, TextParsingMode.CSV);

        polar.setSortpointsbyx(true);
        polar.setDefaultseriestype(PolarSeriesType.COLUMN);
        polar.setYaxis(false);
        polar.setXscale(ScaleTypes.ORDINAL);
//        chart.yScale().stackMode('value');

        anyChartView.setChart(polar);
    }
}
