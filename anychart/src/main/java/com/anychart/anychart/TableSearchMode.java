package com.anychart.anychart;

import java.util.Locale;

public enum TableSearchMode implements JsObject.JsObjectInterface {
    EXACT("exact"),
    EXACT_OR_NEXT("exactOrNext"),
    EXACT_OR_PREV("exactOrPrev"),
    NEAREST("nearest");

    private final String value;

    TableSearchMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}