package com.anychart.enums;

import java.util.Locale;

/**
 * Font variant enumeration.
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