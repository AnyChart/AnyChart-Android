package com.anychart.enums;

import java.util.Locale;

/**
 * 
 */
public enum TokenType {

    DATE_TIME("date-time"),
    NUMBER("number"),
    PERCENT("percent"),
    STRING("string"),
    UNKNOWN("");

    private final String value;

    TokenType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}