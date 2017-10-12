package com.anychart.anychart;

import java.util.Locale;

public enum HoverMode implements JsObject.JsObjectInterface {
    BY_SPOT("by-spot"),
    BY_X("by-x"),
    SINGLE("single");

    private final String value;

    HoverMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}