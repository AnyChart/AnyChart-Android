package com.anychart.anychart;

import java.util.Locale;

public enum PolarSeriesType implements JsObject.JsObjectInterface {
    AREA("area"),
    COLUMN("column"),
    LINE("line"),
    MARKER("marker"),
    POLYGON("polygon"),
    POLYLINE("polyline"),
    RANGE_COLUMN("rangeColumn");

    private final String value;

    PolarSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}