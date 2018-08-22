package com.anychart.enums;

import java.util.Locale;

/**
 * Map series types.
 */
public enum MapSeriesType {

    BUBBLE("bubble"),
    CHOROPLETH("choropleth"),
    CONNECTOR("connector"),
    MARKER("marker");

    private final String value;

    MapSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}