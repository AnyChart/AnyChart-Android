package com.anychart.anychart;

import java.util.Locale;

/**
 * Vertical align enum.
 */
public enum EnumsVAlign implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String value;

    EnumsVAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}