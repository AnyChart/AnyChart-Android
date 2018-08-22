package com.anychart.enums;

import java.util.Locale;

/**
 * Display mode for <a href="anychart.core.ui.Crosshair">crosshair</a>.
 */
public enum CrosshairDisplayMode {

    FLOAT("float"),
    STICKY("sticky");

    private final String value;

    CrosshairDisplayMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}