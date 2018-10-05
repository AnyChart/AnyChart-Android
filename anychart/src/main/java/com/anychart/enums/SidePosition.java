package com.anychart.enums;

import java.util.Locale;

/**
 * {api:anychart.core.axes.Ticks#position}Ticks{api} and {api:anychart.core.ui.LabelsFactory#position}labels{api} position.
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