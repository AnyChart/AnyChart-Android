package com.anychart.enums;

import java.util.Locale;

/**
 * Enum for scale comparison mode.
 */
public enum ScaleComparisonMode {

    NONE("none"),
    PERCENT("percent"),
    VALUE("value");

    private final String value;

    ScaleComparisonMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}