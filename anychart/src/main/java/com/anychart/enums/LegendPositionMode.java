package com.anychart.enums;

import java.util.Locale;

/**
 * Legend position mode enumeration.
 */
public enum LegendPositionMode {

    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    LegendPositionMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}