package com.anychart.anychart;

import java.util.Locale;

/**
 * Stock period range type.
 */
public enum StockRangeType implements JsObject.JsObjectInterface {
    MAX("max"),
    MTD("mtd"),
    QTD("qtd"),
    UNIT("unit"),
    YTD("ytd");

    private final String value;

    StockRangeType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}