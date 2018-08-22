package com.anychart.graphics.vector.text;

import java.util.Locale;

/**
 * Defines visibility in block, of text can't be shown in the area.
 */
public enum TextOverflow {

    CLIP(""),
    ELLIPSIS("...");

    private final String value;

    TextOverflow(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}