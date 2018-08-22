package com.anychart.graphics.vector.image;

import java.util.Locale;

/**
 * Fitting mode.
 */
public enum Fitting {

    MEET("meet"),
    SLICE("slice");

    private final String value;

    Fitting(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}