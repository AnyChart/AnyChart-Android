package com.anychart.anychart;

import java.util.Locale;

/**
 * List of waterfall chart data modes.
 */
public enum WaterfallDataMode implements JsObject.JsObjectInterface {
    ABSOLUTE("absolute"),
    DIFF("diff");

    private final String value;

    WaterfallDataMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}