package com.anychart.anychart;

import java.util.Locale;

/**
 * Align enumeration.
 */
public enum EnumsAlign implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    CENTER("center"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top");

    private final String value;

    EnumsAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}