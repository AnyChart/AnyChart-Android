package com.anychart.enums;

import java.util.Locale;

/**
 * Event marker position list.
 */
public enum EventMarkerPosition {

    AXIS("axis"),
    SERIES("series"),
    SERIES_NEGATIVE("series-negative"),
    SERIES_POSITIVE("series-positive"),
    ZERO("zero");

    private final String value;

    EventMarkerPosition(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}