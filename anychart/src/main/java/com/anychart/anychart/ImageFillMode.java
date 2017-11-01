package com.anychart.anychart;

import java.util.Locale;

/**
 * Image fill modes.
 */
public enum ImageFillMode implements JsObject.JsObjectInterface {
    FIT("fit"),
    FIT_MAX("fit-max"),
    STRETCH("stretch"),
    TILE("tile");

    private final String value;

    ImageFillMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}