package com.anychart.enums;

import java.util.Locale;

/**
 * <a href="anychart.core.SeriesBase#selectionMode">Selection mode</a> enumeration.
 */
public enum SelectionMode {

    DRILL_DOWN("drill-down"),
    MULTI_SELECT("multi-select"),
    NONE("none"),
    SINGLE_SELECT("single-select");

    private final String value;

    SelectionMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}