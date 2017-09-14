package com.anychart.anychart;

import java.util.Locale;

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
    RANGE_AREA("rangeArea"),
    RANGE_BAR("rangeBar"),
    RANGE_COLUMN("rangeColumn"),
    RANGE_SPLINE_AREA("rangeSplineArea"),
    RANGE_STEP_AREA("rangeStepArea"),
    SPLINE("spline"),
    SPLINE_AREA("splineArea"),
    SQUARE("square"),
    STEP_AREA("stepArea"),
    STEP_LINE("stepLine");

    private final String value;

    LegendItemIconType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}