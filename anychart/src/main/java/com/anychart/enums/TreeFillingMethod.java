package com.anychart.enums;

import java.util.Locale;

/**
 * Data fill method.
 */
public enum TreeFillingMethod {

    AS_TABLE("as-table"),
    AS_TREE("as-tree");

    private final String value;

    TreeFillingMethod(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}