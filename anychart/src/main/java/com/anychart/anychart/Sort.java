package com.anychart.anychart;

import java.util.Locale;

/**
 * <a href="anychart.charts.Pie#sort">Sort</a> enumeration.
 */
public enum Sort implements JsObject.JsObjectInterface {
    ASC("asc"),
    DESC("desc"),
    NONE("none");

    private final String value;

    Sort(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}