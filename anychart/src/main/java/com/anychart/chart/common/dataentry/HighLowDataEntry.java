package com.anychart.chart.common.dataentry;

public class HighLowDataEntry extends DataEntry {

    public HighLowDataEntry(String x, Number high, Number low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

    public HighLowDataEntry(Number x, Number high, Number low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

}
