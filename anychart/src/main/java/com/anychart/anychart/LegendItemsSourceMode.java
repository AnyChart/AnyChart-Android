package com.anychart.anychart;

import java.util.Locale;

public enum LegendItemsSourceMode implements JsObject.JsObjectInterface {
    CATEGORIES("categories"),
    DEFAULT("default");

    private final String value;

    LegendItemsSourceMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}