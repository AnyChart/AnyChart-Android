package com.anychart.enums;

import java.util.Locale;

/**
 * Tooltip <a href="anychart.core.ui.Tooltip#displayMode">display mode</a> settings.
 */
public enum TooltipDisplayMode {

    SEPARATED("separated"),
    SINGLE("single"),
    UNION("union");

    private final String value;

    TooltipDisplayMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}