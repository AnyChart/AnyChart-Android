package com.anychart.enums;

import java.util.Locale;

/**
 * Tag cloud mode.
 */
public enum TagCloudMode {

    RECT("rect"),
    SPIRAL("spiral");

    private final String value;

    TagCloudMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}