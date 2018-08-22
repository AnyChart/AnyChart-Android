package com.anychart.enums;

import java.util.Locale;

/**
 * Text word-wrap mode.
 */
public enum WordWrap {

    BREAK_WORD("break-word"),
    NORMAL("normal");

    private final String value;

    WordWrap(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}