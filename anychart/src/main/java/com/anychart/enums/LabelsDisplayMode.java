package com.anychart.enums;

import java.util.Locale;

/**
 * Display mode for labels.
 */
public enum LabelsDisplayMode {

    ALWAYS_SHOW("always-show"),
    CLIP("clip"),
    DROP("drop");

    private final String value;

    LabelsDisplayMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}