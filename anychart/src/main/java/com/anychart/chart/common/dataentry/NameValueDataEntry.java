package com.anychart.chart.common.dataentry;

public class NameValueDataEntry extends DataEntry {

    public NameValueDataEntry(String x, String name, Integer value) {
        setValue("x", x);
        setValue("name", name);
        setValue("value", value);
    }

    public NameValueDataEntry(String x, String name, Double value) {
        setValue("x", x);
        setValue("name", name);
        setValue("value", value);
    }

}
