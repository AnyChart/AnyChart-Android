package com.anychart.enums;

import java.util.Locale;

/**
 * Types of the <a href="anychart.core.ui.Background#cornerType">corner</a>.
 */
public enum BackgroundCornersType {

    CUT("cut"),
    NONE("none"),
    ROUND("round"),
    ROUND_INNER("round-inner");

    private final String value;

    BackgroundCornersType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}