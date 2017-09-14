package com.anychart.anychart;

import java.util.Locale;

public enum StockLabelsOverlapMode implements JsObject.JsObjectInterface {
    ALLOW_MAJOR_OVERLAP("allowMajorOverlap"),
    ALLOW_MINOR_OVERLAP("allowMinorOverlap"),
    ALLOW_OVERLAP("allowOverlap"),
    NO_OVERLAP("noOverlap");

    private final String value;

    StockLabelsOverlapMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}