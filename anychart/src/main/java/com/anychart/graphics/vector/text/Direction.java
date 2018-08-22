package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Text direction.
 */
public enum Direction {

    LTR("ltr"),
    RTL("rtl");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}