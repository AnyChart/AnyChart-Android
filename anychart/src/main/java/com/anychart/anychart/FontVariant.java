package com.anychart.anychart;

import java.util.Locale;

public enum FontVariant implements JsObject.JsObjectInterface {
    NORMAL("normal"),
    SMALL_CAP("small-caps");

    private final String value;

    FontVariant(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}