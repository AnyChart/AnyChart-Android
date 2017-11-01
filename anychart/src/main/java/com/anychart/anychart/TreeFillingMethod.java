package com.anychart.anychart;

import java.util.Locale;

/**
 * Data fill method.
 */
public enum TreeFillingMethod implements JsObject.JsObjectInterface {
    AS_TABLE("as-table"),
    AS_TREE("as-tree");

    private final String value;

    TreeFillingMethod(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}