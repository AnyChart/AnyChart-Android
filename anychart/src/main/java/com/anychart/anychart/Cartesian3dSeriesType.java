package com.anychart.anychart;

import java.util.Locale;

public enum Cartesian3dSeriesType implements JsObject.JsObjectInterface {
    AREA("area"),
    BAR("bar"),
    COLUMN("column");

    private final String value;

    Cartesian3dSeriesType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}