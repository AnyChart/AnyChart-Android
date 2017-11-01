package com.anychart.anychart;

import java.util.Locale;

/**
 * Overlap modes.
 */
public enum StockLabelsOverlapMode implements JsObject.JsObjectInterface {
    ALLOW_MAJOR_OVERLAP("allow-major-overlap"),
    ALLOW_MINOR_OVERLAP("allow-minor-overlap"),
    ALLOW_OVERLAP("allow-overlap"),
    NO_OVERLAP("no-overlap");

    private final String value;

    StockLabelsOverlapMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}