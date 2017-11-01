package com.anychart.anychart;

import java.util.Locale;

/**
 * Horizontal align enum.
 */
public enum EnumsHAlign implements JsObject.JsObjectInterface {
    CENTER("center"),
    END("end"),
    LEFT("left"),
    RIGHT("right"),
    START("start");

    private final String value;

    EnumsHAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}