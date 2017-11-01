package com.anychart.anychart;

import java.util.Locale;

/**
 * List of all series types. See method at: {@link anychart.charts.Sparkline#type}
 */
public enum SparklineSeriesType implements JsObject.JsObjectInterface {
    AREA("area"),
    COLUMN("column"),
    LINE("line"),
    WIN_LOSS("win-loss");

    private final String value;

    SparklineSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}