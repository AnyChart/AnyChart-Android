package com.anychart.anychart;

import java.util.Locale;

public enum StockSeriesType implements JsObject.JsObjectInterface {
    AREA("area"),
    CANDLESTICK("candlestick"),
    COLUMN("column"),
    JUMP_LINE("jumpLine"),
    LINE("line"),
    MARKER("marker"),
    OHLC("ohlc"),
    RANGE_AREA("rangeArea"),
    RANGE_COLUMN("rangeColumn"),
    RANGE_SPLINE_AREA("rangeSplineArea"),
    RANGE_STEP_AREA("rangeStepArea"),
    SPLINE("spline"),
    SPLINE_AREA("splineArea"),
    STEP_AREA("stepArea"),
    STEP_LINE("stepLine"),
    STICK("stick");

    private final String value;

    StockSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}