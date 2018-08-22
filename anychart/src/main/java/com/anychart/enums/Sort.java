package com.anychart.enums;

import java.util.Locale;

/**
 * <a href="anychart.charts.Pie#sort">Sort</a> enumeration.
 */
public enum Sort {

    ASC("asc"),
    DESC("desc"),
    NONE("none");

    private final String value;

    Sort(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}