package com.anychart.anychart;

import java.util.Locale;

/**
 * Layout enumeration.
 */
public enum Layout implements JsObject.JsObjectInterface {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical");

    private final String value;

    Layout(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}