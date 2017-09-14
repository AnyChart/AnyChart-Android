package com.anychart.anychart;

import java.util.Locale;

public enum StockRangeType implements JsObject.JsObjectInterface {
    MAX("Max"),
    MTD("MTD"),
    QTD("QTD"),
    UNIT("Unit"),
    YTD("YTD");

    private final String value;

    StockRangeType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}