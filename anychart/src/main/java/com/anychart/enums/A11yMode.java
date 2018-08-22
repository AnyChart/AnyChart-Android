package com.anychart.enums;

import java.util.Locale;

/**
 * Accessibility modes.
 */
public enum A11yMode {

    CHART_ELEMENTS("chart-elements"),
    DATA_TABLE("data-table");

    private final String value;

    A11yMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}