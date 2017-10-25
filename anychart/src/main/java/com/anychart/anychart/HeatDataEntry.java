package com.anychart.anychart;

public class HeatDataEntry extends DataEntry {

    public HeatDataEntry(String x, String y, Integer heat) {
        setValue("x", x);
        setValue("y", y);
        setValue("heat", heat);
    }
}
