package com.anychart.anychart;

import java.util.Locale;

/**
 * Legend position mode enumeration.
 */
public enum LegendPositionMode implements JsObject.JsObjectInterface {
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    LegendPositionMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}