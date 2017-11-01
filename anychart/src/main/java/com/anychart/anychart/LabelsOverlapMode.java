package com.anychart.anychart;

import java.util.Locale;

/**
 * Overlap modes.
 */
public enum LabelsOverlapMode implements JsObject.JsObjectInterface {
    ALLOW_OVERLAP("allow-overlap"),
    NO_OVERLAP("no-overlap");

    private final String value;

    LabelsOverlapMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}