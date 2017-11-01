package com.anychart.anychart;

import java.util.Locale;

/**
 * Orientation enumeration.
 */
public enum Orientation implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top");

    private final String value;

    Orientation(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}