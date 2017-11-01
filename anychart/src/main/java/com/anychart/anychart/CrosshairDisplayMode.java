package com.anychart.anychart;

import java.util.Locale;

/**
 * Display mode for <a href="anychart.core.ui.Crosshair">crosshair</a>.
 */
public enum CrosshairDisplayMode implements JsObject.JsObjectInterface {
    FLOAT("float"),
    STICKY("sticky");

    private final String value;

    CrosshairDisplayMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}