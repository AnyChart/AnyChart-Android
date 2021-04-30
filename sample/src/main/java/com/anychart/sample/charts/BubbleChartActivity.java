package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.BubbleDataEntry;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Scatter;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class BubbleChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Scatter bubble = AnyChart.bubble();

        bubble.animation(true);

        bubble.title().enabled(true);
        bubble.title().useHtml(true);
        bubble.title()
                .padding(0d, 0d, 10d, 0d)
                .text("Best sportsmen training data ' +\n" +
                        "        '<br/><span  style=\"color:#929292; font-size: 12px;\">' +\n" +
                        "        '(bubble size means duration, each bubble represents one training)</span>");

        bubble.padding(20d, 20d, 10d, 20d);

        bubble.yGrid(true)
                .xGrid(true)
                .xMinorGrid(true)
                .yMinorGrid(true);

        bubble.minBubbleSize(5d)
                .maxBubbleSize(40d);

        bubble.xAxis(0)
                .title("Average pulse during training")
                .minorTicks(true);
        bubble.yAxis(0)
                .title("Average power")
                .minorTicks(true);

        bubble.legend().enabled(true);
        bubble.labels().padding(0d, 0d, 10d, 0d);

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomBubbleDataEntry(1, 184, 113, "10/13/2014", 120));
        data.add(new CustomBubbleDataEntry(1, 180, 94, "03/25/2015", 45));
        data.add(new CustomBubbleDataEntry(1, 145, 137, "11/23/2014", 123));
        data.add(new CustomBubbleDataEntry(1, 136, 89, "02/02/2015", 89));
        data.add(new CustomBubbleDataEntry(1, 180, 96, "12/24/2014", 118));
        data.add(new CustomBubbleDataEntry(1, 149, 113, "11/20/2014", 60));
        data.add(new CustomBubbleDataEntry(1, 161, 94, "04/10/2015", 87));
        data.add(new CustomBubbleDataEntry(1, 168, 141, "02/03/2015", 45));
        data.add(new CustomBubbleDataEntry(1, 173, 127, "01/14/2015", 89));

        bubble.bubble(data)
                .name("Christopher Sanchez");

        data.clear();
        data.add(new CustomBubbleDataEntry(2, 165, 145, "10/22/2014", 95));
        data.add(new CustomBubbleDataEntry(2, 147, 71, "07/25/2014", 53));
        data.add(new CustomBubbleDataEntry(2, 157, 138, "08/18/2014", 115));
        data.add(new CustomBubbleDataEntry(2, 179, 107, "07/05/2014", 91));
        data.add(new CustomBubbleDataEntry(2, 187, 65, "06/21/2014", 90));
        data.add(new CustomBubbleDataEntry(2, 142, 139, "11/05/2014", 94));
        data.add(new CustomBubbleDataEntry(2, 136, 90, "06/22/2014", 90));
        data.add(new CustomBubbleDataEntry(2, 166, 70, "09/18/2014", 54));
        data.add(new CustomBubbleDataEntry(2, 161, 131, "01/07/2015", 121));

        bubble.bubble(data)
                .name("Judy Evans");

        data.clear();
        data.add(new CustomBubbleDataEntry(3, 145, 141, "09/15/2014", 95));
        data.add(new CustomBubbleDataEntry(3, 174, 144, "10/28/2014", 53));
        data.add(new CustomBubbleDataEntry(3, 180, 94, "03/03/2015", 115));
        data.add(new CustomBubbleDataEntry(3, 170, 142, "10/29/2014", 91));
        data.add(new CustomBubbleDataEntry(3, 146, 120, "02/28/2015", 90));
        data.add(new CustomBubbleDataEntry(3, 164, 66, "06/24/2014", 94));
        data.add(new CustomBubbleDataEntry(3, 166, 137, "03/24/2015", 90));
        data.add(new CustomBubbleDataEntry(3, 181, 121, "06/02/2014", 54));

        bubble.bubble(data)
                .name("Walter Burke");

        data.clear();
        data.add(new CustomBubbleDataEntry(4, 169, 84, "05/16/2014", 46));
        data.add(new CustomBubbleDataEntry(4, 176, 123, "01/10/2015", 43));
        data.add(new CustomBubbleDataEntry(4, 163, 106, "08/06/2014", 105));
        data.add(new CustomBubbleDataEntry(4, 167, 96, "09/01/2014", 90));
        data.add(new CustomBubbleDataEntry(4, 162, 131, "05/24/2014", 91));
        data.add(new CustomBubbleDataEntry(4, 142, 124, "12/24/2014", 112));
        data.add(new CustomBubbleDataEntry(4, 142, 70, "01/16/2015", 56));
        data.add(new CustomBubbleDataEntry(4, 174, 89, "02/09/2015", 90));

        bubble.bubble(data)
                .name("Daniel Williamson");

        bubble.tooltip()
                .useHtml(true)
                .fontColor("#fff")
                .format("function() {\n" +
                        "        return this.getData('data') + '<br/>' +\n" +
                        "          'Power: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('value') + '</span></strong><br/>' +\n" +
                        "          'Pulse: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('x') + '</span></strong><br/>' +\n" +
                        "          'Duration: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('size') + ' min.</span></strong>';\n" +
                        "      }");

        anyChartView.setChart(bubble);
    }

    private class CustomBubbleDataEntry extends BubbleDataEntry {

        CustomBubbleDataEntry(Integer training, Integer x, Integer value, String data, Integer size) {
            super(x, value, size);
            setValue("training", training);
            setValue("data", data);
        }
    }

}
