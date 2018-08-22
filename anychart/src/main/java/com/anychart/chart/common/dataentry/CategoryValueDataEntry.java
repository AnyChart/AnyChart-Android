package com.anychart.chart.common.dataentry;

public class CategoryValueDataEntry extends DataEntry {

    public CategoryValueDataEntry(String x, String category, Integer value) {
        setValue("x", x);
        setValue("value", value);
        setValue("category", category);
    }

    public CategoryValueDataEntry(String x, String category, Double value) {
        setValue("x", x);
        setValue("value", value);
        setValue("category", category);
    }

}
