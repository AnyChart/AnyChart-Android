package com.anychart.enums;

import java.util.Locale;

/**
 * Stock series types.
 */
public enum StockSeriesType {

    AREA("area"),
    CANDLESTICK("candlestick"),
    COLUMN("column"),
    JUMP_LINE("jump-line"),
    LINE("line"),
    MARKER("marker"),
    OHLC("ohlc"),
    RANGE_AREA("range-area"),
    RANGE_COLUMN("range-column"),
    RANGE_SPLINE_AREA("range-spline-area"),
    RANGE_STEP_AREA("range-step-area"),
    SPLINE("spline"),
    SPLINE_AREA("spline-area"),
    STEP_AREA("step-area"),
    STEP_LINE("step-line"),
    STICK("stick");

    private final String value;

    StockSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}