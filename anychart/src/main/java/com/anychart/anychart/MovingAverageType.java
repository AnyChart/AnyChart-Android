package com.anychart.anychart;

import java.util.Locale;

/**
 * Smoothing Types Enum.
 */
public enum MovingAverageType implements JsObject.JsObjectInterface {
    EMA("ema"),
    SMA("sma");

    private final String value;

    MovingAverageType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}