package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.charts.Sunburst;
import com.anychart.enums.SunburstCalculationMode;
import com.anychart.enums.TreeFillingMethod;
import com.anychart.graphics.vector.text.HAlign;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class SunburstChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Sunburst sunburst = AnyChart.sunburst();

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("USA", "usa"));
        data.add(new CustomDataEntry("sales", "usa-sales", "usa"));
        data.add(new CustomDataEntry("Executive", "usa-executive", "usa-sales", 10));
        data.add(new CustomDataEntry("Analyst", "usa-analyst", "usa-sales", 15));
        data.add(new CustomDataEntry("Technical", "usa-technical", "usa"));
        data.add(new CustomDataEntry("Testers", "usa-testers", "usa-technical", 15));
        data.add(new CustomDataEntry("Developers", "usa-developers", "usa-technical"));
        data.add(new CustomDataEntry("Frontend", "usa-frontend", "usa-developers"));
        data.add(new CustomDataEntry("iOS", "usa-ios", "usa-developers", 12));
        data.add(new CustomDataEntry("Vue", "vue", "usa-frontend", 7));
        data.add(new CustomDataEntry("Angular", "angular", "usa-frontend", 12));
        data.add(new CustomDataEntry("React", "react", "usa-frontend", 23));
        data.add(new CustomDataEntry("Ember", "ember", "usa-frontend", 5));
        data.add(new CustomDataEntry("Management", "usa-management", "usa", 37));
        data.add(new CustomDataEntry("Germany", "germany"));
        data.add(new CustomDataEntry("Technical", "germany-technical", "germany"));
        data.add(new CustomDataEntry("Testers", "germany-testers", "germany-technical", 15));
        data.add(new CustomDataEntry("Developers", "germany-developers", "germany-technical"));
        data.add(new CustomDataEntry("Android", "germany-android", "germany-developers", 8));
        data.add(new CustomDataEntry("Backend", "germany-backend", "germany-developers", 8));
        data.add(new CustomDataEntry("Go", "go", "germany-backend", 8));
        data.add(new CustomDataEntry("PHP", "php", "germany-backend", 12));
        data.add(new CustomDataEntry("Python", "python", "germany-backend", 18));
        data.add(new CustomDataEntry("HR", "germany-hr", "germany", 37));
        data.add(new CustomDataEntry("Russia", "russia"));
        data.add(new CustomDataEntry("Sales", "russia-sales", "russia"));
        data.add(new CustomDataEntry("Technical", "russia-technical", "russia"));
        data.add(new CustomDataEntry("Testers", "russia-testers", "russia-technical", 15));
        data.add(new CustomDataEntry("Developers", "russia-developers", "russia-technical"));
        data.add(new CustomDataEntry("Android", "russia-android", "russia-developers", 12));
        data.add(new CustomDataEntry("Backend", "russia-backend", "russia-developers"));
        data.add(new CustomDataEntry("Go", "go", "russia-backend", 4));
        data.add(new CustomDataEntry("PHP", "php", "russia-backend", 7));
        data.add(new CustomDataEntry("Python", "python", "russia-backend", 12));
        data.add(new CustomDataEntry("Executive", "russia-executive", "russia-sales", 8));
        data.add(new CustomDataEntry("Analyst", "russia-analyst", "russia-sales", 12));
        data.add(new CustomDataEntry("China", "china"));
        data.add(new CustomDataEntry("Sales", "china-sales", "china"));
        data.add(new CustomDataEntry("Technical", "china-technical", "china"));
        data.add(new CustomDataEntry("Testers", "china-testers", "china-technical", 39));
        data.add(new CustomDataEntry("Developers", "china-developers", "china-technical"));
        data.add(new CustomDataEntry("iOS", "china-ios", "china-developers", 17));
        data.add(new CustomDataEntry("Android", "china-android", "china-developers", 25));
        data.add(new CustomDataEntry("Backend", "china-backend", "china-developers"));
        data.add(new CustomDataEntry("Go", "go", "china-backend", 14));
        data.add(new CustomDataEntry("PHP", "php", "china-backend", 6));
        data.add(new CustomDataEntry("Python", "python", "china-backend", 17));
        data.add(new CustomDataEntry("Executive", "china-executive", "china-sales", 35));
        data.add(new CustomDataEntry("Analyst", "china-analyst", "china-sales", 15));
        data.add(new CustomDataEntry("Frontend", "china-frontend", "china-developers"));
        data.add(new CustomDataEntry("Vue", "vue", "china-frontend", 27));
        data.add(new CustomDataEntry("Angular", "angular", "china-frontend", 21));
        data.add(new CustomDataEntry("React", "react", "china-frontend", 29));
        data.add(new CustomDataEntry("Ember", "ember", "china-frontend", 15));
        data.add(new CustomDataEntry("Meteor", "meteor", "china-frontend", 12));

        // TODO data
        sunburst.data(data, TreeFillingMethod.AS_TABLE);

        sunburst.calculationMode(SunburstCalculationMode.ORDINAL_FROM_LEAVES);

        sunburst.labels().hAlign(HAlign.CENTER);

        sunburst.palette(new String[] { "#0288d1", "#d4e157", "#ff6e40", "#f8bbd0" });

        sunburst.fill("function () {" +
            "return this.parent ? anychart.color.darken(this.parentColor, 0.15) : this.mainColor" +
        "}");

        sunburst.tooltip().format("Employee: {%leavesSum}");

        anyChartView.setChart(sunburst);
    }

    class CustomDataEntry extends DataEntry {
        CustomDataEntry(String name, String id) {
            setValue("name", name);
            setValue("id", id);
        }

        CustomDataEntry(String name, String id, String parent) {
            setValue("name", name);
            setValue("id", id);
            setValue("parent", parent);
        }

        CustomDataEntry(String name, String id, String parent, int value) {
            setValue("name", name);
            setValue("id", id);
            setValue("parent", parent);
            setValue("value", value);
        }
    }
}
