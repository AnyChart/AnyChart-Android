package com.anychart.anychart;

import java.util.Locale;

public enum Fitting implements JsObject.JsObjectInterface {
    MEET("meet"),
    SLICE("slice");

    private final String value;

    Fitting(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}