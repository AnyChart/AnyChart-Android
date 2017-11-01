package com.anychart.anychart;

import java.util.Locale;

/**
 * Text decoration.
 */
public enum Decoration implements JsObject.JsObjectInterface {
    BLINK("blink"),
    LINE_THROUGH("line-through"),
    NONE("none"),
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