package com.anychart.anychart;

import java.util.Locale;

public enum ScaleTypes implements JsObject.JsObjectInterface {
    DATE_TIME("dateTime"),
    LINEAR("linear"),
    LINEAR_COLOR("linearColor"),
    LOG("log"),
    ORDINAL("ordinal"),
    ORDINAL_COLOR("ordinalColor");

    private final String value;

    ScaleTypes(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}