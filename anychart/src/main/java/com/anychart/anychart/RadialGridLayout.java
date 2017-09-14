package com.anychart.anychart;

import java.util.Locale;

public enum RadialGridLayout implements JsObject.JsObjectInterface {
    CIRCUIT("circuit"),
    RADIAL("radial");

    private final String value;

    RadialGridLayout(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}