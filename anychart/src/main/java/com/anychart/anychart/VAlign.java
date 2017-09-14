package com.anychart.anychart;

import java.util.Locale;

public enum VAlign implements JsObject.JsObjectInterface {
    BOTTOM("bottom"),
    MIDDLE("middle"),
    TOP("top");

    private final String value;

    VAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}