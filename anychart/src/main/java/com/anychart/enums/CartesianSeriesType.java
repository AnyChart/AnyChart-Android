package com.anychart.enums;

import java.util.Locale;

/**
 * Cartesian series types.
 */
public enum CartesianSeriesType {

    AREA("area"),
    BAR("bar"),
    BOX("box"),
    BUBBLE("bubble"),
    CANDLESTICK("candlestick"),
    COLUMN("column"),
    HILO("hilo"),
    JUMP_LINE("jump-line"),
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
    STEP_AREA("step-area"),
    STEP_LINE("step-line"),
    STICK("stick");

    private final String value;

    CartesianSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}