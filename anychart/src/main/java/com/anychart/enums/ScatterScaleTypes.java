package com.anychart.enums;

import java.util.Locale;

/**
 * List of all scale types for scatter chart.
 */
public enum ScatterScaleTypes {

    DATE_TIME("date-time"),
    LINEAR("linear"),
    LOG("log");

    private final String value;

    ScatterScaleTypes(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}