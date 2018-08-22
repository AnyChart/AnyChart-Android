package com.anychart.enums;

import java.util.Locale;

/**
 * Scatter ticks <a href="anychart.scales.ScatterTicks#mode">mode</a> enum.
 */
public enum ScatterTicksMode {

    LINEAR("linear"),
    LOGARITHMIC("logarithmic");

    private final String value;

    ScatterTicksMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}