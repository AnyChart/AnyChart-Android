package com.anychart.anychart;

import java.util.Locale;

public enum SelectionMode implements JsObject.JsObjectInterface {
    DRILL_DOWN("drillDown"),
    MULTI_SELECT("multiSelect"),
    NONE("none"),
    SINGLE_SELECT("singleSelect");

    private final String value;

    SelectionMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}