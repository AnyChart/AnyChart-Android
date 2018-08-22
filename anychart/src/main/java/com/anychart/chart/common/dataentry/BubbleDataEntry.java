package com.anychart.chart.common.dataentry;

public class BubbleDataEntry extends DataEntry {

    public BubbleDataEntry(String x, Integer value, Integer size) {
        setValue("x", x);
        setValue("value", value);
        setValue("size", size);
    }

    public BubbleDataEntry(String x, Double value, Double size) {
        setValue("x", x);
        setValue("value", value);
        setValue("size", size);
    }

    public BubbleDataEntry(Integer x, Integer value, Integer size) {
        setValue("x", x);
        setValue("value", value);
        setValue("size", size);
    }

    public BubbleDataEntry(Double x, Double value, Double size) {
        setValue("x", x);
        setValue("value", value);
        setValue("size", size);
    }
}
