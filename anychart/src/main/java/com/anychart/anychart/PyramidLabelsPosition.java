package com.anychart.anychart;

import java.util.Locale;

/**
 * Labels position for the funnel chart and pyramid.
 */
public enum PyramidLabelsPosition implements JsObject.JsObjectInterface {
    INSIDE("inside"),
    OUTSIDE_LEFT("outside-left"),
    OUTSIDE_LEFT_IN_COLUMN("outside-left-in-column"),
    OUTSIDE_RIGHT("outside-right"),
    OUTSIDE_RIGHT_IN_COLUMN("outside-right-in-column");

    private final String value;

    PyramidLabelsPosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}