package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian3d;
import com.anychart.anychart.CartesianSeriesArea;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.HatchFillType;
import com.anychart.anychart.HoverMode;
import com.anychart.anychart.Position;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class Area3DChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

        Cartesian3d area3d = AnyChart.area3d();

        area3d.getXAxis().getLabels().setFormat("'${%Value}'");

        area3d.setAnimation(true);

        area3d.getYAxis().setTitle("'The Share Price'");
        area3d.getXAxis().setTitle("'Year/Month/Day'");
        area3d.getXAxis().getLabels().setPadding(5d, 5d, 0d, 5d);

        area3d.setTitle("'The cost of ACME\\'s shares<br/>' +\n" +
                "    '<span style=\"color:#212121; font-size: 13px;\">Statistics was collected from site N during September</span>'");

        area3d.getTitle().setUseHtml(true);
        area3d.getTitle().setPadding(0d, 0d, 20d, 0d);

        CartesianSeriesArea series1 = area3d.area(new String[] {
                "['1986', 162]",
                "['1987', 134]",
                "['1988', 116]",
                "['1989', 122]",
                "['1990', 178]",
                "['1991', 144]",
                "['1992', 125]",
                "['1993', 176]",
                "['1994', 156]",
                "['1995', 195]",
                "['1996', 215]",
                "['1997', 176]",
                "['1998', 167]",
                "['1999', 142]",
                "['2000', 117]",
                "['2001', 113]",
                "['2002', 132]",
                "['2003', 146]",
                "['2004', 169]",
                "['2005', 184]"
        }, TextParsingMode.CSV);
        series1.setName("'ACME Share Price'");
        series1.getHovered().setMarkers(false);
        series1.setHatchFill("'diagonal'", "'#000'", 0.6d, 10d);

        CartesianSeriesArea series2 = area3d.area(new String[] {
                "['1986', 42]",
                "['1987', 54]",
                "['1988', 26]",
                "['1989', 32]",
                "['1990', 68]",
                "['1991', 54]",
                "['1992', 35]",
                "['1993', 66]",
                "['1994', 80]",
                "['1995', 120]",
                "['1996', 115]",
                "['1997', 36]",
                "['1998', 47]",
                "['1999', 72]",
                "['2000', 37]",
                "['2001', 23]",
                "['2002', 30]",
                "['2003', 46]",
                "['2004', 59]",
                "['2005', 44]"
        }, TextParsingMode.CSV);
        series2.setName("'The Competitor\\'s Share Price'");
        series2.getHovered().setMarkers(false);
        series2.setHatchFill(HatchFillType.DIAGONAL_BRICK, "'#000'", 0.6d, 10d);

        area3d.getTooltip()
                .setPosition(Position.CENTER_TOP)
                .setPositionMode(TooltipPositionMode.POINT)
                .setAnchor(EnumsAnchor.LEFT_BOTTOM)
                .setOffsetX(5d)
                .setOffsetY(5d);

        area3d.getInteractivity().setHoverMode(HoverMode.BY_X);
        area3d.setZAspect("'100%'");

        anyChartView.setChart(area3d);
    }
}
