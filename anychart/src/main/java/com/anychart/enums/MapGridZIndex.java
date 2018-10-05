package com.anychart.enums;

import java.util.Locale;

/**
 * Grid z-index.
List of grid position relative to other map components.
 */
public enum MapGridZIndex {

    OVER_MAP("45"),
    UNDER_MAP("5");

    private final String value;

    MapGridZIndex(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}