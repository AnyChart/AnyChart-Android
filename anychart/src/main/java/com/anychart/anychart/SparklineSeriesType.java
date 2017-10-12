package com.anychart.anychart;

import java.util.Locale;

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