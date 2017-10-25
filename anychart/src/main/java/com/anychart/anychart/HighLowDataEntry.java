package com.anychart.anychart;

public class HighLowDataEntry extends DataEntry {

    public HighLowDataEntry(String x, Integer high, Integer low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

    public HighLowDataEntry(String x, Double high, Integer low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

    public HighLowDataEntry(String x, Integer high, Double low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

    public HighLowDataEntry(String x, Double high, Double low) {
        setValue("x", x);
        setValue("high", high);
        setValue("low", low);
    }

}
