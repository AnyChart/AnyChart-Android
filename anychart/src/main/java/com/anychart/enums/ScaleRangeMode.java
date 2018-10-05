package com.anychart.enums;

import java.util.Locale;

/**
 * Scale range mode for the axis markers (line, range, text).
 */
public enum ScaleRangeMode {

    CONSIDER("consider"),
    NONE("none");

    private final String value;

    ScaleRangeMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}