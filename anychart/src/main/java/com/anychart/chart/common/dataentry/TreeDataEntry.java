package com.anychart.chart.common.dataentry;

public class TreeDataEntry extends DataEntry {

    public TreeDataEntry(String id, String parent) {
        setValue("id", id);
        setValue("parent", parent);
    }

    public TreeDataEntry(Integer id, String parent) {
        setValue("id", id);
        setValue("parent", parent);
    }

    public TreeDataEntry(String id, Integer parent) {
        setValue("id", id);
        setValue("parent", parent);
    }

    public TreeDataEntry(Integer id, Integer parent) {
        setValue("id", id);
        setValue("parent", parent);
    }

    public TreeDataEntry(String id, String parent, Integer value) {
        setValue("id", id);
        setValue("parent", parent);
        setValue("value", value);
    }

}
