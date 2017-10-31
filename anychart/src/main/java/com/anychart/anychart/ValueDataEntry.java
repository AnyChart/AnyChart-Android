package com.anychart.anychart;

public class ValueDataEntry extends DataEntry {

    public ValueDataEntry(String x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(String x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(Double x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(Double x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(Integer x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public ValueDataEntry(Integer x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

}
