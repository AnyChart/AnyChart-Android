package com.anychart.enums;

import java.util.Locale;

/**
 * Step direction.
 */
public enum StepDirection {

    BACKWARD("backward"),
    CENTER("center"),
    FORWARD("forward");

    private final String value;

    StepDirection(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}