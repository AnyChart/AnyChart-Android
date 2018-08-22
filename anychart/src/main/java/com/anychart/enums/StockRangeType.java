package com.anychart.enums;

import java.util.Locale;

/**
 * Stock period range type.
 */
public enum StockRangeType {

    MAX("max"),
    MTD("mtd"),
    POINTS("points"),
    QTD("qtd"),
    RANGE("range"),
    UNIT("unit"),
    YTD("ytd");

    private final String value;

    StockRangeType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}