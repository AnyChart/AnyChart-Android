package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.NameValueDataEntry;
import com.anychart.anychart.Venn;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class VennDiagramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Venn venn = AnyChart.venn();

        List<DataEntry> data = new ArrayList<>();
        data.add(new NameValueDataEntry("A", "Data Science", 100));
        data.add(new NameValueDataEntry("B", "Computer Science", 25));
        data.add(new NameValueDataEntry("C", "Math and Statistics", 25));
        data.add(new NameValueDataEntry("D", "Subject Matter Expertise", 25));
        data.add(new NameValueDataEntry("A&B", "Computer Science", 50));
        data.add(new NameValueDataEntry("A&C", "Math and Statistics", 50));
        data.add(new NameValueDataEntry("A&D", "Subject Matter Expertise", 50));
        data.add(new NameValueDataEntry("B&C", "Machine\\nLearning", 5));
        data.add(new NameValueDataEntry("C&D", "Traditional\\nResearch", 5));
        data.add(new NameValueDataEntry("D&B", "Traditional\\nSoftware", 5));
        data.add(new NameValueDataEntry("B&C&D", "Unicorn", 5));

        venn.setData(data);

        venn.setStroke("#FFFFFF", 2d, null, null, null);

        venn.getLabels().setFormat("{%Name}");

        venn.getIntersections().getHovered().setFill("black", 0.25d);

        venn.getIntersections().getLabels().setFontWeight("bold");
        venn.getIntersections().getLabels().setFormat("{%Name}");

        venn.getTooltip().setTitleFormat("{%Name}");

        anyChartView.setChart(venn);
    }
}
