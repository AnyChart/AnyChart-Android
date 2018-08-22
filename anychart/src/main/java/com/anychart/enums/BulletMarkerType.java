package com.anychart.enums;

import java.util.Locale;

/**
 * Bullet marker type.
 */
public enum BulletMarkerType {

    BAR("bar"),
    ELLIPSE("ellipse"),
    LINE("line"),
    X("x");

    private final String value;

    BulletMarkerType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}