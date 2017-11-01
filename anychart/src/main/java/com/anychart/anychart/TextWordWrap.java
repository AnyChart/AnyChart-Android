package com.anychart.anychart;

import java.util.Locale;

/**
 * Text word-wrap mode.
 */
public enum TextWordWrap implements JsObject.JsObjectInterface {
    BREAK_WORD("break-word"),
    NORMAL("normal");

    private final String value;

    TextWordWrap(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}