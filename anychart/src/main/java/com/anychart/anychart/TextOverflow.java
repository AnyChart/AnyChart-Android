package com.anychart.anychart;

import java.util.Locale;

public enum TextOverflow implements JsObject.JsObjectInterface {
    CLIP(""),
    ELLIPSIS("...");

    private final String value;

    TextOverflow(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}