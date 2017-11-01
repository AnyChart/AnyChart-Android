package com.anychart.anychart;

import java.util.Locale;

/**
 * Text word-break mode.
 */
public enum EnumsWordBreak implements JsObject.JsObjectInterface {
    BREAK_ALL("break-all"),
    KEEP_ALL("keep-all"),
    NORMAL("normal");

    private final String value;

    EnumsWordBreak(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}