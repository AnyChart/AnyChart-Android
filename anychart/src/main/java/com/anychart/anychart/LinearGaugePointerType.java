package com.anychart.anychart;

import java.util.Locale;

/**
 * List of all linear gauge pointers type.
 */
public enum LinearGaugePointerType implements JsObject.JsObjectInterface {
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

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}