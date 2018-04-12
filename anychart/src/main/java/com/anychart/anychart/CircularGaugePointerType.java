package com.anychart.anychart;

import java.util.Locale;

/**
 * List of all circular gauge pointers type.
 */
public enum CircularGaugePointerType implements JsObject.JsObjectInterface {
    BAR("bar"),
    KNOB("knob"),
    MARKER("marker"),
    NEEDLE("needle");

    private final String value;

    CircularGaugePointerType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}