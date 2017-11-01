package com.anychart.anychart;

import java.util.Locale;

/**
 * Font style enumeration.
 */
public enum EnumsFontStyle implements JsObject.JsObjectInterface {
    ITALIC("italic"),
    NORMAL("normal"),
    OBLIQUE("oblique");

    private final String value;

    EnumsFontStyle(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}