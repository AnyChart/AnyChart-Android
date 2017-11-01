package com.anychart.anychart;

import java.util.Locale;

/**
 * Scatter ticks <a href="anychart.scales.ScatterTicks#mode">mode</a> enum.
 */
public enum ScatterTicksMode implements JsObject.JsObjectInterface {
    LINEAR("linear"),
    LOGARITHMIC("logarithmic");

    private final String value;

    ScatterTicksMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}