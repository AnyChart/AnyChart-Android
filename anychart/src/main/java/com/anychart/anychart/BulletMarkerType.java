package com.anychart.anychart;

import java.util.Locale;

/**
 * Predefined bullet marker type.
 */
public enum BulletMarkerType implements JsObject.JsObjectInterface {
    BAR("bar"),
    ELLIPSE("ellipse"),
    LINE("line"),
    X("x");

    private final String value;

    BulletMarkerType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}