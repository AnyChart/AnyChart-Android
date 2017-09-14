package com.anychart.anychart;

import java.util.Locale;

public enum TreeFillingMethod implements JsObject.JsObjectInterface {
    AS_TABLE("asTable"),
    AS_TREE("asTree");

    private final String value;

    TreeFillingMethod(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}