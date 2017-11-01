package com.anychart.anychart;

import java.util.Locale;

/**
 * Step direction.
 */
public enum StepDirection implements JsObject.JsObjectInterface {
    BACKWARD("backward"),
    CENTER("center"),
    FORWARD("forward");

    private final String value;

    StepDirection(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}