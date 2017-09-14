package com.anychart.anychart;

import java.util.Locale;

public enum MapGridZIndex implements JsObject.JsObjectInterface {
    OVER_MAP("45"),
    UNDER_MAP("5");

    private final String value;

    MapGridZIndex(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}