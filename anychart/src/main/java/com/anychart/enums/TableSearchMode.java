package com.anychart.enums;

import java.util.Locale;

/**
 * Enum for data table search modes.
 */
public enum TableSearchMode {

    EXACT("exact"),
    EXACT_OR_NEXT("exact-or-next"),
    EXACT_OR_PREV("exact-or-prev"),
    NEAREST("nearest");

    private final String value;

    TableSearchMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}