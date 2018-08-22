package com.anychart.enums;

import java.util.Locale;

/**
 * List of all series types. See method at: {@link anychart.charts.Sparkline#type}
 */
public enum SparklineSeriesType {

    AREA("area"),
    COLUMN("column"),
    LINE("line"),
    WIN_LOSS("win-loss");

    private final String value;

    SparklineSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}