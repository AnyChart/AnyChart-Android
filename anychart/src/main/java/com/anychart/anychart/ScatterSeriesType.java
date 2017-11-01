package com.anychart.anychart;

import java.util.Locale;

/**
 * Scatter series types.
 */
public enum ScatterSeriesType implements JsObject.JsObjectInterface {
    BUBBLE("bubble"),
    LINE("line"),
    MARKER("marker");

    private final String value;

    ScatterSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}