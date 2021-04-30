package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Waterfall;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class WaterfallChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Waterfall waterfall = AnyChart.waterfall();

        waterfall.title("ACME corp. Revenue Flow 2017");

        waterfall.yScale().minimum(0d);

        waterfall.yAxis(0).labels().format("${%Value}{scale:(1000000)(1)|(mln)}");
        waterfall.labels().enabled(true);
        waterfall.labels().format(
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
        data.add(new ValueDataEntry("Start", 23000000));
        data.add(new ValueDataEntry("Jan", 2200000));
        data.add(new ValueDataEntry("Feb", -4600000));
        data.add(new ValueDataEntry("Mar", -9100000));
        data.add(new ValueDataEntry("Apr", 3700000));
        data.add(new ValueDataEntry("May", -2100000));
        data.add(new ValueDataEntry("Jun", 5300000));
        data.add(new ValueDataEntry("Jul", 3100000));
        data.add(new ValueDataEntry("Aug", -1500000));
        data.add(new ValueDataEntry("Sep", 4200000));
        data.add(new ValueDataEntry("Oct", 5300000));
        data.add(new ValueDataEntry("Nov", -1500000));
        data.add(new ValueDataEntry("Dec", 5100000));
        DataEntry end = new DataEntry();
        end.setValue("x", "End");
        end.setValue("isTotal", true);
        data.add(end);

        waterfall.data(data);

        anyChartView.setChart(waterfall);
    }
}
