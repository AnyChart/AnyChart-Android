package com.anychart.graphics.vector.image;

import java.util.Locale;

/**
 * Align enumeration.
 */
public enum Align {

    NONE("none"),
    X_MAX_Y_MAX("x-max-y-max"),
    X_MAX_Y_MID("x-max-y-mid"),
    X_MAX_Y_MIN("x-max-y-min"),
    X_MID_Y_MAX("x-mid-y-max"),
    X_MID_Y_MID("x-mid-y-mid"),
    X_MID_Y_MIN("x-mid-y-min"),
    X_MIN_Y_MAX("x-min-y-max"),
    X_MIN_Y_MID("x-min-y-mid"),
    X_MIN_Y_MIN("x-min-y-min");

    private final String value;

    Align(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}