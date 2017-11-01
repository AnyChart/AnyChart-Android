package com.anychart.anychart;

import java.util.Locale;

/**
 * The list of point states.
 */
public enum PointState implements JsObject.JsObjectInterface {
    HOVER("1"),
    NORMAL("0"),
    SELECT("2");

    private final String value;

    PointState(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}