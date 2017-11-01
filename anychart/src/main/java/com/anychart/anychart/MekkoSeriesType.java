package com.anychart.anychart;

import java.util.Locale;

/**
 * Mekko series types.
 */
public enum MekkoSeriesType implements JsObject.JsObjectInterface {
    MEKKO("mekko");

    private final String value;

    MekkoSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}