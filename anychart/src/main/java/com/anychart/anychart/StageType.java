package com.anychart.anychart;

import java.util.Locale;

public enum StageType implements JsObject.JsObjectInterface {
    SVG("svg"),
    VML("vml");

    private final String value;

    StageType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}