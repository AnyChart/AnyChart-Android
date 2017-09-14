package com.anychart.anychart;

import java.util.Locale;

public enum FontStyle implements JsObject.JsObjectInterface {
    ITALIC("italic"),
    NORMAL("normal"),
    OBLIQUE("oblique");

    private final String value;

    FontStyle(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}