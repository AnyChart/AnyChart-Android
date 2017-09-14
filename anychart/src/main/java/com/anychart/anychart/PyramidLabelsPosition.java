package com.anychart.anychart;

import java.util.Locale;

public enum PyramidLabelsPosition implements JsObject.JsObjectInterface {
    INSIDE("inside"),
    OUTSIDE_LEFT("outsideLeft"),
    OUTSIDE_LEFT_IN_COLUMN("outsideLeftInColumn"),
    OUTSIDE_RIGHT("outsideRight"),
    OUTSIDE_RIGHT_IN_COLUMN("outsideRightInColumn");

    private final String value;

    PyramidLabelsPosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}