package com.anychart.anychart;

import java.util.Locale;

public enum TextTextWrap implements JsObject.JsObjectInterface {
    BY_LETTER("byLetter"),
    BY_WORD("byWord"),
    NO_WRAP("noWrap");

    private final String value;

    TextTextWrap(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}