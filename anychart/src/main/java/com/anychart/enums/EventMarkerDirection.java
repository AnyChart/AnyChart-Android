package com.anychart.enums;

import java.util.Locale;

/**
 * Event marker direction list.
 */
public enum EventMarkerDirection {

    AUTO("auto"),
    DOWN("down"),
    UP("up");

    private final String value;

    EventMarkerDirection(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}