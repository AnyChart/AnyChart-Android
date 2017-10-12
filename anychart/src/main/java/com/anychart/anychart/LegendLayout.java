package com.anychart.anychart;

import java.util.Locale;

public enum LegendLayout implements JsObject.JsObjectInterface {
    HORIZONTAL("horizontal"),
    HORIZONTAL_EXPANDABLE("horizontal-expandable"),
    VERTICAL("vertical"),
    VERTICAL_EXPANDABLE("vertical-expandable");

    private final String value;

    LegendLayout(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}