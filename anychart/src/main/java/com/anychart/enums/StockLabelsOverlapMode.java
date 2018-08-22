package com.anychart.enums;

import java.util.Locale;

/**
 * Overlap modes.
 */
public enum StockLabelsOverlapMode {

    ALLOW_MAJOR_OVERLAP("allow-major-overlap"),
    ALLOW_MINOR_OVERLAP("allow-minor-overlap"),
    ALLOW_OVERLAP("allow-overlap"),
    NO_OVERLAP("no-overlap");

    private final String value;

    StockLabelsOverlapMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}