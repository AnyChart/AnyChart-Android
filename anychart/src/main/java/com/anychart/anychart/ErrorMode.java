package com.anychart.anychart;

import java.util.Locale;

public enum ErrorMode implements JsObject.JsObjectInterface {
    BOTH("both"),
    NONE("none"),
    VALUE("value"),
    X("x");

    private final String value;

    ErrorMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}