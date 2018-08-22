package com.anychart.enums;

import java.util.Locale;

/**
 * Radar series types.
 */
public enum RadarSeriesType {

    AREA("area"),
    LINE("line"),
    MARKER("marker");

    private final String value;

    RadarSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}