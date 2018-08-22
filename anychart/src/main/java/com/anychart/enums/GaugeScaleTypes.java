package com.anychart.enums;

import java.util.Locale;

/**
 * List of all scale types.
 */
public enum GaugeScaleTypes {

    LINEAR("linear"),
    LOG("log");

    private final String value;

    GaugeScaleTypes(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}