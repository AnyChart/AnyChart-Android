package com.anychart.enums;

import java.util.Locale;

/**
 * Orientation enumeration.
 */
public enum Orientation {

    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top");

    private final String value;

    Orientation(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}