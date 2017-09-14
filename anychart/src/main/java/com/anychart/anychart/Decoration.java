package com.anychart.anychart;

import java.util.Locale;

public enum Decoration implements JsObject.JsObjectInterface {
    BLINK("blink"),
    LINE_THROUGH("line-through"),
    NONE("one"),
    OVERLINE("overline"),
    UNDERLINE("underline");

    private final String value;

    Decoration(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}