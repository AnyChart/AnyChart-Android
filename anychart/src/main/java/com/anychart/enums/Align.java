package com.anychart.enums;

import java.util.Locale;

/**
 * Align enumeration.
 */
public enum Align {

    BOTTOM("bottom"),
    CENTER("center"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top");

    private final String value;

    Align(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}