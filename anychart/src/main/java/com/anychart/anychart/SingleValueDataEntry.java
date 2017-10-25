package com.anychart.anychart;

public class SingleValueDataEntry extends DataEntry {

    public SingleValueDataEntry(String x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public SingleValueDataEntry(String x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

    public SingleValueDataEntry(Double x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public SingleValueDataEntry(Double x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

    public SingleValueDataEntry(Integer x, Integer value) {
        setValue("x", x);
        setValue("value", value);
    }

    public SingleValueDataEntry(Integer x, Double value) {
        setValue("x", x);
        setValue("value", value);
    }

}
