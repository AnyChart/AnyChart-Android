package com.anychart.enums;

import java.util.Locale;

/**
 * Ticks <a href="anychart.core.axes.Ticks#position">position</a> (inside ot outside).
 */
public enum SidePosition {

    CENTER("center"),
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    SidePosition(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}