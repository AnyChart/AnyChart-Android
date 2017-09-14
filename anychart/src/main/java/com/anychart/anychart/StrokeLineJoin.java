package com.anychart.anychart;

import java.util.Locale;

public enum StrokeLineJoin implements JsObject.JsObjectInterface {
    BEVEL("bevel"),
    MITER("miter"),
    ROUND("round");

    private final String value;

    StrokeLineJoin(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}