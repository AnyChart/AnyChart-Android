package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Text vertical align.
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