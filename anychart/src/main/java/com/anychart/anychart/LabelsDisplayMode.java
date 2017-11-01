package com.anychart.anychart;

import java.util.Locale;

/**
 * Display mode for labels.
 */
public enum LabelsDisplayMode implements JsObject.JsObjectInterface {
    ALWAYS_SHOW("always-show"),
    CLIP("clip"),
    DROP("drop");

    private final String value;

    LabelsDisplayMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}