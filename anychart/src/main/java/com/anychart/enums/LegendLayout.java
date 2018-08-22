package com.anychart.enums;

import java.util.Locale;

/**
 * Legend layout enumeration.
 */
public enum LegendLayout {

    HORIZONTAL("horizontal"),
    HORIZONTAL_EXPANDABLE("horizontal-expandable"),
    VERTICAL("vertical"),
    VERTICAL_EXPANDABLE("vertical-expandable");

    private final String value;

    LegendLayout(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}