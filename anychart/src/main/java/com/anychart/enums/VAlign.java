package com.anychart.enums;

import java.util.Locale;

/**
 * Vertical align enum.
 */
public enum VAlign {

    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String value;

    VAlign(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}