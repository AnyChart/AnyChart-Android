package com.anychart.graphics;

import java.util.Locale;

/**
 * Stage types supported by AnyChart Data Visualization Toolkit.
 */
public enum StageType {

    SVG("svg"),
    VML("vml");

    private final String value;

    StageType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}