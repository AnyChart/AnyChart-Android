package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Text decoration.
 */
public enum Decoration {

    BLINK("blink"),
    LINE_THROUGH("line-through"),
    NONE("none"),
    OVERLINE("overline"),
    UNDERLINE("underline");

    private final String value;

    Decoration(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}