package com.anychart.anychart;

import java.util.Locale;

/**
 * Modes enum for <a href="anychart.data#mapAsTable">mapAsTable</a> function.
 */
public enum MapAsTableMode implements JsObject.JsObjectInterface {
    OHLC("ohlc"),
    RANGE("range"),
    VALUE("value");

    private final String value;

    MapAsTableMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}