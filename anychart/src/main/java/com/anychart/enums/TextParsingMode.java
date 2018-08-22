package com.anychart.enums;

import java.util.Locale;

/**
 * Text parsing mode.
 */
public enum TextParsingMode {

    BY_CHAR("by-char"),
    BY_WORD("by-word"),
    CSV("csv");

    private final String value;

    TextParsingMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}