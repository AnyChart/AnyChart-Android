package com.anychart.anychart;

import java.util.Locale;

/**
 * Font style.
 */
public enum TextFontStyle implements JsObject.JsObjectInterface {
    ITALIC("italic"),
    NORMAL("normal"),
    OBLIQUE("oblique");

    private final String value;

    TextFontStyle(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}