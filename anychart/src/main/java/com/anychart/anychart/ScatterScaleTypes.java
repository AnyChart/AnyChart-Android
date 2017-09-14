package com.anychart.anychart;

import java.util.Locale;

public enum ScatterScaleTypes implements JsObject.JsObjectInterface {
    DATE_TIME("dateTime"),
    LINEAR("linear"),
    LOG("log");

    private final String value;

    ScatterScaleTypes(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}