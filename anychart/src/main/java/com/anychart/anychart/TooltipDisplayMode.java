package com.anychart.anychart;

import java.util.Locale;

/**
 * Tooltip <a href="anychart.core.ui.Tooltip#displayMode">display mode</a> settings.
 */
public enum TooltipDisplayMode implements JsObject.JsObjectInterface {
    SEPARATED("separated"),
    SINGLE("single"),
    UNION("union");

    private final String value;

    TooltipDisplayMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}