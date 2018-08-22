package com.anychart.enums;

import java.util.Locale;

/**
 * List of all scale types.
 */
public enum ScaleTypes {

    DATE_TIME("date-time"),
    DATE_TIME_WITH_CALENDAR("date-time-with-calendar"),
    GANTT("gantt"),
    LINEAR("linear"),
    LINEAR_COLOR("linear-color"),
    LOG("log"),
    ORDINAL("ordinal"),
    ORDINAL_COLOR("ordinal-color"),
    STOCK_ORDINAL_DATE_TIME("stock-ordinal-date-time"),
    STOCK_SCATTER_DATE_TIME("stock-scatter-date-time");

    private final String value;

    ScaleTypes(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}