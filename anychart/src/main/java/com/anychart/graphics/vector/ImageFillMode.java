package com.anychart.graphics.vector;

import java.util.Locale;

/**
 * Image fill modes.
 */
public enum ImageFillMode {

    FIT("fit"),
    FIT_MAX("fit-max"),
    STRETCH("stretch"),
    TILE("tile");

    private final String value;

    ImageFillMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}