package com.anychart.anychart;

import java.util.Locale;

public enum ScatterTicksMode implements JsObject.JsObjectInterface {
    LINEAR("linear"),
    LOGARITHMIC("logarithmic");

    private final String value;

    ScatterTicksMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}