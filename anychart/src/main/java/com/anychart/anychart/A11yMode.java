package com.anychart.anychart;

import java.util.Locale;

/**
 * Accessibility mode.
 */
public enum A11yMode implements JsObject.JsObjectInterface {
    CHART_ELEMENTS("chart-elements"),
    DATA_TABLE("data-table");

    private final String value;

    A11yMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}