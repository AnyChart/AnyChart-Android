package com.anychart.anychart;

import java.util.Locale;

public enum Align implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    CENTER("center"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top");

    private final String value;

    Align(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}