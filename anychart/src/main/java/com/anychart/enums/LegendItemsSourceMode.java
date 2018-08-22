package com.anychart.enums;

import java.util.Locale;

/**
 * Data collection <a href="anychart.core.ui.Legend#itemsSourceMode">mode</a> for the legend.
 */
public enum LegendItemsSourceMode {

    CATEGORIES("categories"),
    DEFAULT("default");

    private final String value;

    LegendItemsSourceMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}