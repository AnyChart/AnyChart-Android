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
import com.anychart.anychart.Position;
import com.anychart.anychart.ValueDataEntry;
import com.anychart.anychart.TooltipPositionMode;
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

        List<DataEntry> series1Data = new ArrayList<>();

        series1Data.add(new ValueDataEntry("1986", 162));
        series1Data.add(new ValueDataEntry("1987", 134));
        series1Data.add(new ValueDataEntry("1988", 116));
        series1Data.add(new ValueDataEntry("1989", 122));
        series1Data.add(new ValueDataEntry("1990", 178));
        series1Data.add(new ValueDataEntry("1991", 144));
        series1Data.add(new ValueDataEntry("1992", 125));
        series1Data.add(new ValueDataEntry("1993", 176));
        series1Data.add(new ValueDataEntry("1994", 156));
        series1Data.add(new ValueDataEntry("1995", 195));
        series1Data.add(new ValueDataEntry("1996", 215));
        series1Data.add(new ValueDataEntry("1997", 176));
        series1Data.add(new ValueDataEntry("1998", 167));
        series1Data.add(new ValueDataEntry("1999", 142));
        series1Data.add(new ValueDataEntry("2000", 117));
        series1Data.add(new ValueDataEntry("2001", 113));
        series1Data.add(new ValueDataEntry("2002", 132));
        series1Data.add(new ValueDataEntry("2003", 146));
        series1Data.add(new ValueDataEntry("2004", 169));
        series1Data.add(new ValueDataEntry("2005", 184));

        Area3d series1 = area3d.area(series1Data);
        series1.setName("ACME Share Price");
        series1.getHovered().setMarkers(false);
        series1.setHatchFill("diagonal", "#000", 0.6d, 10d);

        List<DataEntry> series2Data = new ArrayList<>();

        series2Data.add(new ValueDataEntry("1986", 42));
        series2Data.add(new ValueDataEntry("1987", 54));
        series2Data.add(new ValueDataEntry("1988", 26));
        series2Data.add(new ValueDataEntry("1989", 32));
        series2Data.add(new ValueDataEntry("1990", 68));
        series2Data.add(new ValueDataEntry("1991", 54));
        series2Data.add(new ValueDataEntry("1992", 35));
        series2Data.add(new ValueDataEntry("1993", 66));
        series2Data.add(new ValueDataEntry("1994", 80));
        series2Data.add(new ValueDataEntry("1995", 120));
        series2Data.add(new ValueDataEntry("1996", 115));
        series2Data.add(new ValueDataEntry("1997", 36));
        series2Data.add(new ValueDataEntry("1998", 47));
        series2Data.add(new ValueDataEntry("1999", 72));
        series2Data.add(new ValueDataEntry("2000", 37));
        series2Data.add(new ValueDataEntry("2001", 23));
        series2Data.add(new ValueDataEntry("2002", 30));
        series2Data.add(new ValueDataEntry("2003", 46));
        series2Data.add(new ValueDataEntry("2004", 59));
        series2Data.add(new ValueDataEntry("2005", 44));

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
}
