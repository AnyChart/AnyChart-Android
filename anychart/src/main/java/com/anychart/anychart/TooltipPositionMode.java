package com.anychart.anychart;

import java.util.Locale;

/**
 * Tooltip <a href="anychart.core.ui.Tooltip#positionMode">position mode</a>.
 */
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