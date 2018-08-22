package com.anychart.enums;

import java.util.Locale;

/**
 * Data export mode enum.
 */
public enum ChartDataExportMode {

    DEFAULT("default"),
    GROUPED("grouped"),
    RAW("raw"),
    SELECTED("selected");

    private final String value;

    ChartDataExportMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}