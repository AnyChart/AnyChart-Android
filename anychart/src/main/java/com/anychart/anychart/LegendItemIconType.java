package com.anychart.anychart;

import java.util.Locale;

/**
 * Predefined icons type.
 */
public enum LegendItemIconType implements JsObject.JsObjectInterface {
    AREA("area"),
    BAR("bar"),
    BUBBLE("bubble"),
    CANDLESTICK("candlestick"),
    CIRCLE("circle"),
    COLUMN("column"),
    LINE("line"),
    MARKER("marker"),
    OHLC("ohlc"),
    RANGE_AREA("range-area"),
    RANGE_BAR("range-bar"),
    RANGE_COLUMN("range-column"),
    RANGE_SPLINE_AREA("range-spline-area"),
    RANGE_STEP_AREA("range-step-area"),
    SPLINE("spline"),
    SPLINE_AREA("spline-area"),
    SQUARE("square"),
    STEP_AREA("step-area"),
    STEP_LINE("step-line");

    private final String value;

    LegendItemIconType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}