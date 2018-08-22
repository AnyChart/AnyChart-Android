package com.anychart.chart.common.dataentry;

public class ValueDataEntry extends DataEntry {

    public ValueDataEntry(String x, Number value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(Number x, Number value) {
        setValue("x", x);
        setValue("value", value);
    }

}
