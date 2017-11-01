package com.anychart.anychart;

import java.util.Locale;

/**
 * Scale <a href="anychart.scales.Linear#stackMode">stack mode</a> enumeration.
 */
public enum ScaleStackMode implements JsObject.JsObjectInterface {
    NONE("none"),
    PERCENT("percent"),
    VALUE("value");

    private final String value;

    ScaleStackMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}