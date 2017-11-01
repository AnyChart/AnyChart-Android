package com.anychart.anychart;

import java.util.Locale;

/**
 * Map series types.
 */
public enum MapSeriesType implements JsObject.JsObjectInterface {
    BUBBLE("bubble"),
    CHOROPLETH("choropleth"),
    CONNECTOR("connector"),
    MARKER("marker");

    private final String value;

    MapSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}