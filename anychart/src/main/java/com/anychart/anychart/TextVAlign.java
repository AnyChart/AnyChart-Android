package com.anychart.anychart;

import java.util.Locale;

/**
 * Text vertical align.
 */
public enum TextVAlign implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String value;

    TextVAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}