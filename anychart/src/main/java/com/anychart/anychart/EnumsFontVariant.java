package com.anychart.anychart;

import java.util.Locale;

/**
 * Font variant enumeration.
 */
public enum EnumsFontVariant implements JsObject.JsObjectInterface {
    NORMAL("normal"),
    SMALL_CAP("small-caps");

    private final String value;

    EnumsFontVariant(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}