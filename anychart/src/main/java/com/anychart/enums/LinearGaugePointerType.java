package com.anychart.enums;

import java.util.Locale;

/**
 * List of all linear gauge pointers types.
 */
public enum LinearGaugePointerType {

    BAR("bar"),
    LED("led"),
    MARKER("marker"),
    RANGE_BAR("range-bar"),
    TANK("tank"),
    THERMOMETER("thermometer");

    private final String value;

    LinearGaugePointerType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}