package com.anychart.enums;

import java.util.Locale;

/**
 * Markers type list.
 */
public enum EventMarkerType {

    CIRCLE("circle"),
    FLAG("flag"),
    PIN("pin"),
    RECT("rect");

    private final String value;

    EventMarkerType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}