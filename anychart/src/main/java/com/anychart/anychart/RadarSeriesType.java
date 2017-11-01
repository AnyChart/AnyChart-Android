package com.anychart.anychart;

import java.util.Locale;

/**
 * Radar series types.
 */
public enum RadarSeriesType implements JsObject.JsObjectInterface {
    AREA("area"),
    LINE("line"),
    MARKER("marker");

    private final String value;

    RadarSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}