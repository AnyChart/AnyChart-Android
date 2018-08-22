package com.anychart.enums;

import java.util.Locale;

/**
 * Text word-break mode.
 */
public enum WordBreak {

    BREAK_ALL("break-all"),
    KEEP_ALL("keep-all"),
    NORMAL("normal");

    private final String value;

    WordBreak(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}