package com.anychart.enums;

import java.util.Locale;

/**
 * Tooltip <a href="anychart.core.ui.Tooltip#positionMode">position mode</a>.
 */
public enum TooltipPositionMode {

    CHART("chart"),
    FLOAT("float"),
    POINT("point");

    private final String value;

    TooltipPositionMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}