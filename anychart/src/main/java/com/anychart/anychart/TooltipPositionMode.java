package com.anychart.anychart;

import java.util.Locale;

public enum TooltipPositionMode implements JsObject.JsObjectInterface {
    CHART("chart"),
    FLOAT("float"),
    POINT("point");

    private final String value;

    TooltipPositionMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}