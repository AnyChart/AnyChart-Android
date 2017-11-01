package com.anychart.anychart;

import java.util.Locale;

/**
 * <a href="anychart.core.SeriesBase#selectionMode">Selection mode</a> enumeration.
 */
public enum SelectionMode implements JsObject.JsObjectInterface {
    DRILL_DOWN("drill-down"),
    MULTI_SELECT("multi-select"),
    NONE("none"),
    SINGLE_SELECT("single-select");

    private final String value;

    SelectionMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}