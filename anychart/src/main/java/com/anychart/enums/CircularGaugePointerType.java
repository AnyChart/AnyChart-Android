package com.anychart.enums;

import java.util.Locale;

/**
 * List of all circular gauge pointers type.
 */
public enum CircularGaugePointerType {

    BAR("bar"),
    KNOB("knob"),
    MARKER("marker"),
    NEEDLE("needle");

    private final String value;

    CircularGaugePointerType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}