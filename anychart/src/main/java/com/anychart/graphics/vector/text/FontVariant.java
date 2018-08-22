package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Defines lowercase.
 */
public enum FontVariant {

    NORMAL("normal"),
    SMALL_CAP("small-caps");

    private final String value;

    FontVariant(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}