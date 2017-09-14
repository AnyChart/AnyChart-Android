package com.anychart.anychart;

import java.util.Locale;

public enum Sort implements JsObject.JsObjectInterface {
    ASC("asc"),
    DESC("desc"),
    NONE("none");

    private final String value;

    Sort(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}