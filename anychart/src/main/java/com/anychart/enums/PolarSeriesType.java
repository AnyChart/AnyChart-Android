package com.anychart.enums;

import java.util.Locale;

/**
 * Polar series types.
 */
public enum PolarSeriesType {

    AREA("area"),
    COLUMN("column"),
    LINE("line"),
    MARKER("marker"),
    POLYGON("polygon"),
    POLYLINE("polyline"),
    RANGE_COLUMN("range-column");

    private final String value;

    PolarSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}