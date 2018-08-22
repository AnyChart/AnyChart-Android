package com.anychart.enums;

import java.util.Locale;

/**
 * Smoothing Types Enum.
 */
public enum MovingAverageType {

    EMA("ema"),
    SMA("sma");

    private final String value;

    MovingAverageType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}