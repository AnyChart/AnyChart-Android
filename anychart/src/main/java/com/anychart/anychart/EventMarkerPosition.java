package com.anychart.anychart;

import java.util.Locale;

/**
 * Event marker position list.
 */
public enum EventMarkerPosition implements JsObject.JsObjectInterface {
    AXIS("axis"),
    SERIES("series"),
    SERIES_NEGATIVE("series-negative"),
    SERIES_POSITIVE("series-positive"),
    SERIES_ZERO("series-zero");

    private final String value;

    EventMarkerPosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}