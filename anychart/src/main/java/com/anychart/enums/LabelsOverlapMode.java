package com.anychart.enums;

import java.util.Locale;

/**
 * Overlap modes.
 */
public enum LabelsOverlapMode {

    ALLOW_OVERLAP("allow-overlap"),
    NO_OVERLAP("no-overlap");

    private final String value;

    LabelsOverlapMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}