package com.anychart.anychart;

import java.util.Locale;

/**
 * Defines lowercase.
 */
public enum TextFontVariant implements JsObject.JsObjectInterface {
    NORMAL("normal"),
    SMALL_CAP("small-caps");

    private final String value;

    TextFontVariant(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}