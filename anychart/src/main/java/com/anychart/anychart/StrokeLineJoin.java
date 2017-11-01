package com.anychart.anychart;

import java.util.Locale;

/**
 * Line joins.
More at: <a href='https://www.w3.org/TR/SVG/painting.html#StrokeLinejoinProperty'>StrokeLinejoinProperty</a>
 */
public enum StrokeLineJoin implements JsObject.JsObjectInterface {
    BEVEL("bevel"),
    MITER("miter"),
    ROUND("round");

    private final String value;

    StrokeLineJoin(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}