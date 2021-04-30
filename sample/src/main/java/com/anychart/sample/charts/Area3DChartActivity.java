package com.anychart.sample.charts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian3d;
import com.anychart.core.cartesian.series.Area3d;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;
import com.anychart.graphics.vector.hatchfill.HatchFillType;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Area3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian3d area3d = AnyChart.area3d();

        area3d.xAxis(0).labels().format("${%Value}");

        area3d.animation(true);

        area3d.yAxis(0).title("The Share Price");
        area3d.xAxis(0).title("Year/Month/Day");
        area3d.xAxis(0).labels().padding(5d, 5d, 0d, 5d);

        area3d.title("The cost of ACME\\'s shares<br/>' +\n" +
                "    '<span style=\"color:#212121; font-size: 13px;\">Statistics was collected from site N during September</span>");

        area3d.title().useHtml(true);
        area3d.title().padding(0d, 0d, 20d, 0d);

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new CustomDataEntry("1986", 162, 42));
        seriesData.add(new CustomDataEntry("1987", 134, 54));
        seriesData.add(new CustomDataEntry("1988", 116, 26));
        seriesData.add(new CustomDataEntry("1989", 122, 32));
        seriesData.add(new CustomDataEntry("1990", 178, 68));
        seriesData.add(new CustomDataEntry("1991", 144, 54));
        seriesData.add(new CustomDataEntry("1992", 125, 35));
        seriesData.add(new CustomDataEntry("1993", 176, 66));
        seriesData.add(new CustomDataEntry("1994", 156, 80));
        seriesData.add(new CustomDataEntry("1995", 195, 120));
        seriesData.add(new CustomDataEntry("1996", 215, 115));
        seriesData.add(new CustomDataEntry("1997", 176, 36));
        seriesData.add(new CustomDataEntry("1998", 167, 47));
        seriesData.add(new CustomDataEntry("1999", 142, 72));
        seriesData.add(new CustomDataEntry("2000", 117, 37));
        seriesData.add(new CustomDataEntry("2001", 113, 23));
        seriesData.add(new CustomDataEntry("2002", 132, 30));
        seriesData.add(new CustomDataEntry("2003", 146, 46));
        seriesData.add(new CustomDataEntry("2004", 169, 59));
        seriesData.add(new CustomDataEntry("2005", 184, 44));

        Set set = Set.instantiate();
        set.data(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");

        Area3d series1 = area3d.area(series1Data);
        series1.name("ACME Share Price");
        series1.hovered().markers(false);
        series1.hatchFill("diagonal", "#000", 0.6d, 10d);

        Area3d series2 = area3d.area(series2Data);
        series2.name("The Competitor\\'s Share Price");
        series2.hovered().markers(false);
        series2.hatchFill(HatchFillType.DIAGONAL_BRICK, "#000", 0.6d, 10d);

        area3d.tooltip()
                .position(Position.CENTER_TOP)
                .positionMode(TooltipPositionMode.POINT)
                .anchor(Anchor.LEFT_BOTTOM)
                .offsetX(5d)
                .offsetY(5d);

        area3d.interactivity().hoverMode(HoverMode.BY_X);
        area3d.zAspect("100%");

        anyChartView.setChart(area3d);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2) {
            super(x, value);
            setValue("value2", value2);
        }
    }

}
