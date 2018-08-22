package com.anychart.enums;

import java.util.Locale;

/**
 * Mekko series types.
 */
public enum MekkoSeriesType {

    MEKKO("mekko");

    private final String value;

    MekkoSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}