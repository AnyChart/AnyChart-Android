package com.anychart.anychart;

import java.util.Locale;

/**
 * Tag cloud mode.
 */
public enum TagCloudMode implements JsObject.JsObjectInterface {
    RECT("rect"),
    SPIRAL("spiral");

    private final String value;

    TagCloudMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}