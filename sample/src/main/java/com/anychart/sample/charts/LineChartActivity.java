package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TextParsingMode;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(com.anychart.sample.R.id.any_chart_view);

//        Set dataSet = new Set();
//        dataSet.setData(getData(), TextParsingMode.CSV);
//
//        Mapping seriesData1 = dataSet.mapAs("{ 'x': 0, 'value': 1 }");
//        Mapping seriesData2 = dataSet.mapAs("{ 'x': 0, 'value': 2 }");
//        Mapping seriesData3 = dataSet.mapAs("{ 'x': 0, 'value': 3 }");

        Cartesian cartesian = new Cartesian();

        cartesian.setAnimation(true);

        cartesian.setPadding(10d, 20d, 5d, 20d);

        cartesian.getCrosshair().setEnabled(true);
        cartesian.getCrosshair()
                .setYLabel(true)
                .setYStroke((Stroke) null, null, null, null, null);

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);

        cartesian.setTitle("'Trend of Sales of the Most Popular Products of ACME Corp.'");

        cartesian.getYAxis().setTitle("'Number of Bottles Sold (thousands)'");
        cartesian.getXAxis().getLabels().setPadding(5d, 5d, 5d, 5d);

        CartesianSeriesLine series1 = cartesian.line(new String[] {
                "['1986', 3.6]",
                "['1987', 7.1]",
                "['1988', 8.5]",
                "['1989', 9.2]",
                "['1990', 10.1]",
                "['1991', 11.6]",
                "['1992', 16.4]",
                "['1993', 18.0]",
                "['1994', 13.2]",
                "['1995', 12.0]",
                "['1996', 3.2]",
                "['1997', 4.1]",
                "['1998', 6.3]",
                "['1999', 9.4]",
                "['2000', 11.5]",
                "['2001', 13.5]",
                "['2002', 14.8]",
                "['2003', 16.6]",
                "['2004', 18.1]",
                "['2005', 17.0]",
                "['2006', 16.6]",
                "['2007', 14.1]",
                "['2008', 15.7]",
                "['2009', 12.0]"
        }, TextParsingMode.CSV);
        series1.setName("'Brandy'");
        series1.getHovered().getMarkers().setEnabled(true);
        series1.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series1.getTooltip()
                .setPosition("'right'")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        CartesianSeriesLine series2 = cartesian.line(new String[] {
                "['1986', 2.3]",
                "['1987', 4.0]",
                "['1988', 6.2]",
                "['1989', 11.8]",
                "['1990', 13.0]",
                "['1991', 13.9]",
                "['1992', 18.0]",
                "['1993', 23.3]",
                "['1994', 24.7]",
                "['1995', 18.0]",
                "['1996', 15.1]",
                "['1997', 11.3]",
                "['1998', 14.2]",
                "['1999', 13.7]",
                "['2000', 9.9]",
                "['2001', 12.1]",
                "['2002', 13.5]",
                "['2003', 15.1]",
                "['2004', 17.9]",
                "['2005', 18.9]",
                "['2006', 20.3]",
                "['2007', 20.7]",
                "['2008', 21.6]",
                "['2009', 22.5]"
        }, TextParsingMode.CSV);
        series2.setName("'Whiskey'");
        series2.getHovered().getMarkers().setEnabled(true);
        series2.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series2.getTooltip()
                .setPosition("'right'")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        CartesianSeriesLine series3 = cartesian.line(new String[] {
                "['1986', 2.8]",
                "['1987', 4.1]",
                "['1988', 5.1]",
                "['1989', 6.5]",
                "['1990', 12.5]",
                "['1991', 18.0]",
                "['1992', 21.0]",
                "['1993', 20.3]",
                "['1994', 19.2]",
                "['1995', 14.4]",
                "['1996', 9.2]",
                "['1997', 5.9]",
                "['1998', 5.2]",
                "['1999', 4.7]",
                "['2000', 4.2]",
                "['2001', 1.2]",
                "['2002', 5.4]",
                "['2003', 6.3]",
                "['2004', 8.9]",
                "['2005', 10.1]",
                "['2006', 11.5]",
                "['2007', 12.2]",
                "['2008', 10]",
                "['2009', 8.9]"
        }, TextParsingMode.CSV);
        series3.setName("'Tequila'");
        series3.getHovered().getMarkers().setEnabled(true);
        series3.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series3.getTooltip()
                .setPosition("'right'")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        cartesian.getLegend().setEnabled(true);
        cartesian.getLegend().setFontSize(13d);
        cartesian.getLegend().setPadding(0d, 0d, 10d, 0d);

        anyChartView.setChart(cartesian);
    }

    public String[] getData() {
        return new String[] {
            "['1986', 3.6, 2.3, 2.8, 11.5]",
            "['1987', 7.1, 4.0, 4.1, 14.1]",
            "['1988', 8.5, 6.2, 5.1, 17.5]",
            "['1989', 9.2, 11.8, 6.5, 18.9]",
            "['1990', 10.1, 13.0, 12.5, 20.8]",
            "['1991', 11.6, 13.9, 18.0, 22.9]",
            "['1992', 16.4, 18.0, 21.0, 25.2]",
            "['1993', 18.0, 23.3, 20.3, 27.0]",
            "['1994', 13.2, 24.7, 19.2, 26.5]",
            "['1995', 12.0, 18.0, 14.4, 25.3]",
            "['1996', 3.2, 15.1, 9.2, 23.4]",
            "['1997', 4.1, 11.3, 5.9, 19.5]",
            "['1998', 6.3, 14.2, 5.2, 17.8]",
            "['1999', 9.4, 13.7, 4.7, 16.2]",
            "['2000', 11.5, 9.9, 4.2, 15.4]",
            "['2001', 13.5, 12.1, 1.2, 14.0]",
            "['2002', 14.8, 13.5, 5.4, 12.5]",
            "['2003', 16.6, 15.1, 6.3, 10.8]",
            "['2004', 18.1, 17.9, 8.9, 8.9]",
            "['2005', 17.0, 18.9, 10.1, 8.0]",
            "['2006', 16.6, 20.3, 11.5, 6.2]",
            "['2007', 14.1, 20.7, 12.2, 5.1]",
            "['2008', 15.7, 21.6, 10, 3.7]",
            "['2009', 12.0, 22.5, 8.9, 1.5]"
        };
    }
}
