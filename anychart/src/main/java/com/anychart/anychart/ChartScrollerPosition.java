package com.anychart.anychart;

import java.util.Locale;

/**
 * ChartScroller possible positions.
 */
public enum ChartScrollerPosition implements JsObject.JsObjectInterface {
    AFTER_AXES("after-axes"),
    BEFORE_AXES("before-axes");

    private final String value;

    ChartScrollerPosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}