package com.anychart.anychart;

import java.util.Locale;

public enum StockRangeAnchor implements JsObject.JsObjectInterface {
    FIRST_DATE("firstDate"),
    FIRST_VISIBLE_DATE("firstVisibleDate"),
    LAST_DATE("lastDate"),
    LAST_VISIBLE_DATE("lastVisibleDate");

    private final String value;

    StockRangeAnchor(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}