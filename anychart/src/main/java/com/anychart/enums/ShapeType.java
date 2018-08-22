package com.anychart.enums;

import java.util.Locale;

/**
 * Shape type.
 */
public enum ShapeType {

    CIRCLE("circle"),
    ELLIPSE("ellipse"),
    PATH("path"),
    RECT("rect");

    private final String value;

    ShapeType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}