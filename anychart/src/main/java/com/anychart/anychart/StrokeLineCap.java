package com.anychart.anychart;

import java.util.Locale;

/**
 * Line caps.
<a href='https://www.w3.org/TR/SVG/painting.html#StrokeLinecapProperty'>StrokeLinecapProperty</a>
 */
public enum StrokeLineCap implements JsObject.JsObjectInterface {
    BUTT("butt"),
    ROUND("round"),
    SQUARE("square");

    private final String value;

    StrokeLineCap(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}