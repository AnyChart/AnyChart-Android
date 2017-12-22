package com.anychart.anychart;

import java.util.Locale;

/**
 * Event marker direction list.
 */
public enum EventMarkerDirection implements JsObject.JsObjectInterface {
    AUTO("auto"),
    DOWN("down"),
    UP("up");

    private final String value;

    EventMarkerDirection(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}