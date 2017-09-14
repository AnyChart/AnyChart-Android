package com.anychart.anychart;

import java.util.Locale;

public enum GaugeSidePosition implements JsObject.JsObjectInterface {
    CENTER("center"),
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    GaugeSidePosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}