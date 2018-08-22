package com.anychart.enums;

import java.util.Locale;

/**
 * Horizontal align enum.
 */
public enum HAlign {

    CENTER("center"),
    END("end"),
    LEFT("left"),
    RIGHT("right"),
    START("start");

    private final String value;

    HAlign(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}