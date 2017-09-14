package com.anychart.anychart;

import java.util.Locale;

public enum LabelsOverlapMode implements JsObject.JsObjectInterface {
    ALLOW_OVERLAP("allowOverlap"),
    NO_OVERLAP("noOverlap");

    private final String value;

    LabelsOverlapMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}