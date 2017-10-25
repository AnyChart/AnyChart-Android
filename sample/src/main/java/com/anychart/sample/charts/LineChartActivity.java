package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.SingleValueDataEntry;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TooltipPositionMode;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

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

        Cartesian cartesian = AnyChart.line();

        cartesian.setAnimation(true);

        cartesian.setPadding(10d, 20d, 5d, 20d);

        cartesian.getCrosshair().setEnabled(true);
        cartesian.getCrosshair()
                .setYLabel(true)
                .setYStroke((Stroke) null, null, null, null, null);

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);

        cartesian.setTitle("Trend of Sales of the Most Popular Products of ACME Corp.");

        cartesian.getYAxis().setTitle("Number of Bottles Sold (thousands)");
        cartesian.getXAxis().getLabels().setPadding(5d, 5d, 5d, 5d);

        List<DataEntry> series1Data = new ArrayList<>();

        series1Data.add(new SingleValueDataEntry("1986", 3.6));
        series1Data.add(new SingleValueDataEntry("1987", 7.1));
        series1Data.add(new SingleValueDataEntry("1988", 8.5));
        series1Data.add(new SingleValueDataEntry("1989", 9.2));
        series1Data.add(new SingleValueDataEntry("1990", 10.1));
        series1Data.add(new SingleValueDataEntry("1991", 11.6));
        series1Data.add(new SingleValueDataEntry("1992", 16.4));
        series1Data.add(new SingleValueDataEntry("1993", 18.0));
        series1Data.add(new SingleValueDataEntry("1994", 13.2));
        series1Data.add(new SingleValueDataEntry("1995", 12.0));
        series1Data.add(new SingleValueDataEntry("1996", 3.2));
        series1Data.add(new SingleValueDataEntry("1997", 4.1));
        series1Data.add(new SingleValueDataEntry("1998", 6.3));
        series1Data.add(new SingleValueDataEntry("1999", 9.4));
        series1Data.add(new SingleValueDataEntry("2000", 11.5));
        series1Data.add(new SingleValueDataEntry("2001", 13.5));
        series1Data.add(new SingleValueDataEntry("2002", 14.8));
        series1Data.add(new SingleValueDataEntry("2003", 16.6));
        series1Data.add(new SingleValueDataEntry("2004", 18.1));
        series1Data.add(new SingleValueDataEntry("2005", 17.0));
        series1Data.add(new SingleValueDataEntry("2006", 16.6));
        series1Data.add(new SingleValueDataEntry("2007", 14.1));
        series1Data.add(new SingleValueDataEntry("2008", 15.7));
        series1Data.add(new SingleValueDataEntry("2009", 12.0));

        CartesianSeriesLine series1 = cartesian.line(series1Data);
        series1.setName("Brandy");
        series1.getHovered().getMarkers().setEnabled(true);
        series1.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series1.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        List<DataEntry> series2Data = new ArrayList<>();

        series2Data.add(new SingleValueDataEntry("1986", 2.3));
        series2Data.add(new SingleValueDataEntry("1987", 4.0));
        series2Data.add(new SingleValueDataEntry("1988", 6.2));
        series2Data.add(new SingleValueDataEntry("1989", 11.8));
        series2Data.add(new SingleValueDataEntry("1990", 13.0));
        series2Data.add(new SingleValueDataEntry("1991", 13.9));
        series2Data.add(new SingleValueDataEntry("1992", 18.0));
        series2Data.add(new SingleValueDataEntry("1993", 23.3));
        series2Data.add(new SingleValueDataEntry("1994", 24.7));
        series2Data.add(new SingleValueDataEntry("1995", 18.0));
        series2Data.add(new SingleValueDataEntry("1996", 15.1));
        series2Data.add(new SingleValueDataEntry("1997", 11.3));
        series2Data.add(new SingleValueDataEntry("1998", 14.2));
        series2Data.add(new SingleValueDataEntry("1999", 13.7));
        series2Data.add(new SingleValueDataEntry("2000", 9.9));
        series2Data.add(new SingleValueDataEntry("2001", 12.1));
        series2Data.add(new SingleValueDataEntry("2002", 13.5));
        series2Data.add(new SingleValueDataEntry("2003", 15.1));
        series2Data.add(new SingleValueDataEntry("2004", 17.9));
        series2Data.add(new SingleValueDataEntry("2005", 18.9));
        series2Data.add(new SingleValueDataEntry("2006", 20.3));
        series2Data.add(new SingleValueDataEntry("2007", 20.7));
        series2Data.add(new SingleValueDataEntry("2008", 21.6));
        series2Data.add(new SingleValueDataEntry("2009", 22.5));

        CartesianSeriesLine series2 = cartesian.line(series2Data);
        series2.setName("Whiskey");
        series2.getHovered().getMarkers().setEnabled(true);
        series2.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series2.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        List<DataEntry> series3Data = new ArrayList<>();

        series3Data.add(new SingleValueDataEntry("1986", 2.8));
        series3Data.add(new SingleValueDataEntry("1987", 4.1));
        series3Data.add(new SingleValueDataEntry("1988", 5.1));
        series3Data.add(new SingleValueDataEntry("1989", 6.5));
        series3Data.add(new SingleValueDataEntry("1990", 12.5));
        series3Data.add(new SingleValueDataEntry("1991", 18.0));
        series3Data.add(new SingleValueDataEntry("1992", 21.0));
        series3Data.add(new SingleValueDataEntry("1993", 20.3));
        series3Data.add(new SingleValueDataEntry("1994", 19.2));
        series3Data.add(new SingleValueDataEntry("1995", 14.4));
        series3Data.add(new SingleValueDataEntry("1996", 9.2));
        series3Data.add(new SingleValueDataEntry("1997", 5.9));
        series3Data.add(new SingleValueDataEntry("1998", 5.2));
        series3Data.add(new SingleValueDataEntry("1999", 4.7));
        series3Data.add(new SingleValueDataEntry("2000", 4.2));
        series3Data.add(new SingleValueDataEntry("2001", 1.2));
        series3Data.add(new SingleValueDataEntry("2002", 5.4));
        series3Data.add(new SingleValueDataEntry("2003", 6.3));
        series3Data.add(new SingleValueDataEntry("2004", 8.9));
        series3Data.add(new SingleValueDataEntry("2005", 10.1));
        series3Data.add(new SingleValueDataEntry("2006", 11.5));
        series3Data.add(new SingleValueDataEntry("2007", 12.2));
        series3Data.add(new SingleValueDataEntry("2008", 10));
        series3Data.add(new SingleValueDataEntry("2009", 8.9));

        CartesianSeriesLine series3 = cartesian.line(series3Data);
        series3.setName("Tequila");
        series3.getHovered().getMarkers().setEnabled(true);
        series3.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series3.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        cartesian.getLegend().setEnabled(true);
        cartesian.getLegend().setFontSize(13d);
        cartesian.getLegend().setPadding(0d, 0d, 10d, 0d);

        anyChartView.setChart(cartesian);
    }

//    public String[] getData() {
//        return new String[] {
//            "['1986', 3.6, 2.3, 2.8, 11.5]",
//            "['1987', 7.1, 4.0, 4.1, 14.1]",
//            "['1988', 8.5, 6.2, 5.1, 17.5]",
//            "['1989', 9.2, 11.8, 6.5, 18.9]",
//            "['1990', 10.1, 13.0, 12.5, 20.8]",
//            "['1991', 11.6, 13.9, 18.0, 22.9]",
//            "['1992', 16.4, 18.0, 21.0, 25.2]",
//            "['1993', 18.0, 23.3, 20.3, 27.0]",
//            "['1994', 13.2, 24.7, 19.2, 26.5]",
//            "['1995', 12.0, 18.0, 14.4, 25.3]",
//            "['1996', 3.2, 15.1, 9.2, 23.4]",
//            "['1997', 4.1, 11.3, 5.9, 19.5]",
//            "['1998', 6.3, 14.2, 5.2, 17.8]",
//            "['1999', 9.4, 13.7, 4.7, 16.2]",
//            "['2000', 11.5, 9.9, 4.2, 15.4]",
//            "['2001', 13.5, 12.1, 1.2, 14.0]",
//            "['2002', 14.8, 13.5, 5.4, 12.5]",
//            "['2003', 16.6, 15.1, 6.3, 10.8]",
//            "['2004', 18.1, 17.9, 8.9, 8.9]",
//            "['2005', 17.0, 18.9, 10.1, 8.0]",
//            "['2006', 16.6, 20.3, 11.5, 6.2]",
//            "['2007', 14.1, 20.7, 12.2, 5.1]",
//            "['2008', 15.7, 21.6, 10, 3.7]",
//            "['2009', 12.0, 22.5, 8.9, 1.5]"
//        };
//    }
}
