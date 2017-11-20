package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Area3d;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HatchFillType;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.Position;
import com.anychart.anychart.Set;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class Area3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Cartesian3d area3d = AnyChart.area3d();

        area3d.getXAxis().getLabels().setFormat("${%Value}");

        area3d.setAnimation(true);

        area3d.getYAxis().setTitle("The Share Price");
        area3d.getXAxis().setTitle("Year/Month/Day");
        area3d.getXAxis().getLabels().setPadding(5d, 5d, 0d, 5d);

        area3d.setTitle("The cost of ACME\\'s shares<br/>' +\n" +
                "    '<span style=\"color:#212121; font-size: 13px;\">Statistics was collected from site N during September</span>");

        area3d.getTitle().setUseHtml(true);
        area3d.getTitle().setPadding(0d, 0d, 20d, 0d);

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

        Set set = new Set(seriesData);
        Mapping series1Data = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Data = set.mapAs("{ x: 'x', value: 'value2' }");

        Area3d series1 = area3d.area(series1Data);
        series1.setName("ACME Share Price");
        series1.getHovered().setMarkers(false);
        series1.setHatchFill("diagonal", "#000", 0.6d, 10d);

        Area3d series2 = area3d.area(series2Data);
        series2.setName("The Competitor\\'s Share Price");
        series2.getHovered().setMarkers(false);
        series2.setHatchFill(HatchFillType.DIAGONAL_BRICK, "#000", 0.6d, 10d);

        area3d.getTooltip()
                .setPosition(Position.CENTER_TOP)
                .setPositionMode(TooltipPositionMode.POINT)
                .setAnchor(EnumsAnchor.LEFT_BOTTOM)
                .setOffsetX(5d)
                .setOffsetY(5d);

        area3d.getInteractivity().setHoverMode(HoverMode.BY_X);
        area3d.setZAspect("100%");

        anyChartView.setChart(area3d);
    }

    private class CustomDataEntry extends ValueDataEntry {
        CustomDataEntry(String x, Number value, Number value2) {
            super(x, value);
            setValue("value2", value2);
        }
    }

}
