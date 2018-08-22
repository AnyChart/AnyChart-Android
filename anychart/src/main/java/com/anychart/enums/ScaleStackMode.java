package com.anychart.enums;

import java.util.Locale;

/**
 * Scale <a href="anychart.scales.Linear#stackMode">stack mode</a> enumeration.
 */
public enum ScaleStackMode {

    NONE("none"),
    PERCENT("percent"),
    VALUE("value");

    private final String value;

    ScaleStackMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}