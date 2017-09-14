package com.anychart.anychart;

import java.util.Locale;

public enum Direction implements JsObject.JsObjectInterface {
    LTR("ltr"),
    RTL("rtl");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}