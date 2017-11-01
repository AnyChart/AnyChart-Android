package com.anychart.anychart;

import java.util.Locale;

/**
 * Data export mode enum.
 */
public enum ChartDataExportMode implements JsObject.JsObjectInterface {
    DEFAULT("default"),
    GROUPED("grouped"),
    RAW("raw"),
    SELECTED("selected");

    private final String value;

    ChartDataExportMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}