package com.anychart.enums;

import java.util.Locale;

/**
 * Enum for predefined part of LinearScale.compareWith() acceptable values.
 */
public enum ScaleCompareWithMode {

    FIRST_VISIBLE("first-visible"),
    SERIES_START("series-start");

    private final String value;

    ScaleCompareWithMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}