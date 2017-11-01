package com.anychart.anychart;

import java.util.Locale;

/**
 * Enum for scale comparison mode.
 */
public enum ScaleComparisonMode implements JsObject.JsObjectInterface {
    NONE("none"),
    PERCENT("percent"),
    VALUE("value");

    private final String value;

    ScaleComparisonMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}