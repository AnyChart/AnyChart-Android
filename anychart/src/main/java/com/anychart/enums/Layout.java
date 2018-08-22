package com.anychart.enums;

import java.util.Locale;

/**
 * Layout enumeration.
 */
public enum Layout {

    HORIZONTAL("horizontal"),
    VERTICAL("vertical");

    private final String value;

    Layout(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}