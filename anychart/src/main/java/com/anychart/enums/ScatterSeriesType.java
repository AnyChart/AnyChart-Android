package com.anychart.enums;

import java.util.Locale;

/**
 * Scatter series types.
 */
public enum ScatterSeriesType {

    BUBBLE("bubble"),
    LINE("line"),
    MARKER("marker");

    private final String value;

    ScatterSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}