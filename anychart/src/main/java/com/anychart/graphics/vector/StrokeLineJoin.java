package com.anychart.graphics.vector;

import java.util.Locale;

/**
 * Line joins.
More at: <a href='https://www.w3.org/TR/SVG/painting.html#StrokeLinejoinProperty'>StrokeLinejoinProperty</a>
 */
public enum StrokeLineJoin {

    BEVEL("bevel"),
    MITER("miter"),
    ROUND("round");

    private final String value;

    StrokeLineJoin(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}