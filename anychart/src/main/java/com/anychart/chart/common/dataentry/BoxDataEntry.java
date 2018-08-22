package com.anychart.chart.common.dataentry;

public class BoxDataEntry extends DataEntry {

    public BoxDataEntry(String x, Integer low, Integer q1, Integer median, Integer q3, Integer high) {
        setValue("x", x);
        setValue("low", low);
        setValue("q1", q1);
        setValue("median", median);
        setValue("q3", q3);
        setValue("high", high);
    }
}
