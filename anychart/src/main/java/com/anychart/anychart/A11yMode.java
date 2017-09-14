package com.anychart.anychart;

import java.util.Locale;

public enum A11yMode implements JsObject.JsObjectInterface {
    CHART_ELEMENTS("chartElements"),
    DATA_TABLE("dataTable");

    private final String value;

    A11yMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}