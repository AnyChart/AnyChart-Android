package com.anychart.sample;

import android.content.res.Resources;

import com.anychart.sample.charts.ColumnChartActivity;
import com.anychart.sample.charts.LineChartActivity;
import com.anychart.sample.charts.PieChartActivity;
import com.anychart.sample.charts.RiskMatrixActivity;
import com.anychart.sample.charts.TagCloudActivity;
import com.anychart.sample.charts.VennDiagramActivity;

import java.util.ArrayList;

/**
 * Created by arseny on 9/12/17.
 */

public class Chart {

    private String name;
    private Class activityClass;

    public Chart(String name, Class activityClass) {
        this.name = name;
        this.activityClass = activityClass;
    }

    public String getName() {
        return name;
    }

    public Class getActivityClass() {
        return activityClass;
    }

    public static ArrayList<Chart> createChartList(Resources resources) {
        ArrayList<Chart> chartList = new ArrayList<>();

        chartList.add(new Chart(resources.getString(R.string.pie_chart), PieChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.column_chart), ColumnChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.line_chart), LineChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.venn_diagram), VennDiagramActivity.class));
        chartList.add(new Chart(resources.getString(R.string.risk_matrix), RiskMatrixActivity.class));
        chartList.add(new Chart(resources.getString(R.string.tag_cloud), TagCloudActivity.class));

        return chartList;
    }

}
