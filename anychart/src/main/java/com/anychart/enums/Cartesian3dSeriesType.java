package com.anychart.enums;

import java.util.Locale;

/**
 * Cartesian 3d series types.
 */
public enum Cartesian3dSeriesType {

    AREA("area"),
    BAR("bar"),
    COLUMN("column"),
    LINE("line"),
    LINE_2D("line-2d");

    private final String value;

    Cartesian3dSeriesType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}