package com.anychart.anychart;

import java.util.Locale;

public enum ChartDataExportMode implements JsObject.JsObjectInterface {
    GROUPED("grouped"),
    RAW("raw"),
    SPECIFIC("specific");

    private final String value;

    ChartDataExportMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}