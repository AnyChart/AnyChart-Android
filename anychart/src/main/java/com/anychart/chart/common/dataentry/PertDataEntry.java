package com.anychart.chart.common.dataentry;

public class PertDataEntry extends DataEntry {

    public PertDataEntry(String id, String name, String fullName) {
        setValue("id", id);
        setValue("name", name);
        setValue("fullName", fullName);
    }

    public PertDataEntry(String id, String name, String fullName, String[] dependsOn) {
        setValue("id", id);
        setValue("name", name);
        setValue("fullName", fullName);
        setValue("dependsOn", dependsOn);
    }
}
