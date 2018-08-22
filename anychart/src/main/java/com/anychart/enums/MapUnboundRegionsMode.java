package com.anychart.enums;

import java.util.Locale;

/**
 * Map unbound regions mode.
 */
public enum MapUnboundRegionsMode {

    AS_IS("as-is"),
    HIDE("hide");

    private final String value;

    MapUnboundRegionsMode(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}