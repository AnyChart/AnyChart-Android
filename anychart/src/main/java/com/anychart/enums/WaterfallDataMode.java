package com.anychart.enums;

import java.util.Locale;

/**
 * List of waterfall chart data modes.
 */
public enum WaterfallDataMode {

    ABSOLUTE("absolute"),
    DIFF("diff");

    private final String value;

    WaterfallDataMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}