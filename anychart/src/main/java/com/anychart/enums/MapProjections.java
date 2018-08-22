package com.anychart.enums;

import java.util.Locale;

/**
 * Supported projections enum.
 */
public enum MapProjections {

    AITOFF("aitoff"),
    AUGUST("august"),
    BONNE("bonne"),
    ECKERT1("eckert1"),
    ECKERT3("eckert3"),
    EQUIRECTANGULAR("equirectangular"),
    FAHEY("fahey"),
    HAMMER("hammer"),
    MERCATOR("mercator"),
    ORTHOGRAPHIC("orthographic"),
    ROBINSON("robinson"),
    WAGNER6("wagner6"),
    WSG84("wsg84");

    private final String value;

    MapProjections(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}