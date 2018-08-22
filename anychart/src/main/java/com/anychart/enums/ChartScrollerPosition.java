package com.anychart.enums;

import java.util.Locale;

/**
 * ChartScroller possible positions.
 */
public enum ChartScrollerPosition {

    AFTER_AXES("after-axes"),
    BEFORE_AXES("before-axes");

    private final String value;

    ChartScrollerPosition(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}