package com.anychart.anychart;

import java.util.Locale;

public enum ChartScrollerPosition implements JsObject.JsObjectInterface {
    AFTER_AXES("afterAxes"),
    BEFORE_AXES("beforeAxes");

    private final String value;

    ChartScrollerPosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}