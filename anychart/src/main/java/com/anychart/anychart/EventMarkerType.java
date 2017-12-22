package com.anychart.anychart;

import java.util.Locale;

/**
 * Markers type list.
 */
public enum EventMarkerType implements JsObject.JsObjectInterface {
    CIRCLE("circle"),
    FLAG("flag"),
    PIN("pin"),
    RECT("rect");

    private final String value;

    EventMarkerType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}