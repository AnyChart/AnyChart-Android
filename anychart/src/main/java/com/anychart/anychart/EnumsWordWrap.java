package com.anychart.anychart;

import java.util.Locale;

public enum EnumsWordWrap implements JsObject.JsObjectInterface {
    BREAK_WORD("break-word"),
    NORMAL("normal");

    private final String value;

    EnumsWordWrap(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}