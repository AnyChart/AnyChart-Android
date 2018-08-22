package com.anychart.enums;

import java.util.Locale;

/**
 * Gauges elements <a href="anychart.core.axisMarkers.CircularRange#position">position</a> relative axis.
 */
public enum GaugeSidePosition {

    CENTER("center"),
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    GaugeSidePosition(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}