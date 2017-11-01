package com.anychart.anychart;

import java.util.Locale;

/**
 * List of all scale types.
 */
public enum ScaleTypes implements JsObject.JsObjectInterface {
    DATE_TIME("date-time"),
    DATE_TIME_WITH_CALENDAR("date-time-with-calendar"),
    GANTT("gantt"),
    LINEAR("linear"),
    LINEAR_COLOR("linear-color"),
    LOG("log"),
    ORDINAL("ordinal"),
    ORDINAL_COLOR("ordinal-color");

    private final String value;

    ScaleTypes(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}