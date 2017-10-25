package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.ChartsWaterfall;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class WaterfallChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        ChartsWaterfall waterfall = AnyChart.waterfall();

        waterfall.setTitle("ACME corp. Revenue Flow 2017");

        waterfall.getYScale().setMinimum(0d);

        waterfall.getYAxis().getLabels().setFormat("${%Value}{scale:(1000000)(1)|(mln)}");
        waterfall.getLabels().setEnabled(true);
        waterfall.getLabels().setFormat(
                "function() {\n" +
                "      if (this['isTotal']) {\n" +
                "        return anychart.format.number(this.absolute, {\n" +
                "          scale: true\n" +
                "        })\n" +
                "      }\n" +
                "\n" +
                "      return anychart.format.number(this.value, {\n" +
                "        scale: true\n" +
                "      })\n" +
                "    }");

        List<DataEntry> data = new ArrayList<>();

        data.add(new SingleValueDataEntry("Start", 23000000));
        data.add(new SingleValueDataEntry("Jan", 2200000));
        data.add(new SingleValueDataEntry("Feb", -4600000));
        data.add(new SingleValueDataEntry("Mar", -9100000));
        data.add(new SingleValueDataEntry("Apr", 3700000));
        data.add(new SingleValueDataEntry("May", -2100000));
        data.add(new SingleValueDataEntry("Jun", 5300000));
        data.add(new SingleValueDataEntry("Jul", 3100000));
        data.add(new SingleValueDataEntry("Aug", -1500000));
        data.add(new SingleValueDataEntry("Sep", 4200000));
        data.add(new SingleValueDataEntry("Oct", 5300000));
        data.add(new SingleValueDataEntry("Nov", -1500000));
        data.add(new SingleValueDataEntry("Dec", 5100000));
        DataEntry end = new DataEntry();
        end.setValue("x", "End");
        end.setValue("isTotal", true);
        data.add(end);

        waterfall.setData(data);

        anyChartView.setChart(waterfall);
    }
}
