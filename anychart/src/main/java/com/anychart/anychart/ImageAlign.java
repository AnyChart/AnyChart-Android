package com.anychart.anychart;

import java.util.Locale;

public enum ImageAlign implements JsObject.JsObjectInterface {
    NONE("none"),
    X_MAX_Y_MAX("xMaxYMax"),
    X_MAX_Y_MID("xMaxYMid"),
    X_MAX_Y_MIN("xMaxYMin"),
    X_MID_Y_MAX("xMidYMax"),
    X_MID_Y_MID("xMidYMid"),
    X_MID_Y_MIN("xMidYMin"),
    X_MIN_Y_MAX("xMinYMax"),
    X_MIN_Y_MID("xMinYMid"),
    X_MIN_Y_MIN("xMinYMin");

    private final String value;

    ImageAlign(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}