package com.anychart.anychart;

import java.util.Locale;

/**
 * Shape type.
 */
public enum ShapeType implements JsObject.JsObjectInterface {
    CIRCLE("circle"),
    ELLIPSE("ellipse"),
    PATH("path"),
    RECT("rect");

    private final String value;

    ShapeType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}