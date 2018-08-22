package com.anychart.enums;

import java.util.Locale;

/**
 * Direct stacking direction for the stacked scale mode.
 */
public enum ScaleStackDirection {

    DIRECT("direct"),
    REVERSE("reverse");

    private final String value;

    ScaleStackDirection(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}