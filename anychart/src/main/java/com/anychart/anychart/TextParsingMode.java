package com.anychart.anychart;

import java.util.Locale;

public enum TextParsingMode implements JsObject.JsObjectInterface {
    BY_CHAR("byChar"),
    BY_WORD("byWord"),
    CSV("csv");

    private final String value;

    TextParsingMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}