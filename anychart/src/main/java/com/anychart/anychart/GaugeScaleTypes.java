package com.anychart.anychart;

import java.util.Locale;

/**
 * List of all scale types.
 */
public enum GaugeScaleTypes implements JsObject.JsObjectInterface {
    LINEAR("linear"),
    LOG("log");

    private final String value;

    GaugeScaleTypes(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}