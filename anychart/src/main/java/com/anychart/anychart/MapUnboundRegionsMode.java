package com.anychart.anychart;

import java.util.Locale;

/**
 * Map unbound regions mode.
 */
public enum MapUnboundRegionsMode implements JsObject.JsObjectInterface {
    AS_IS("as-is"),
    HIDE("hide");

    private final String value;

    MapUnboundRegionsMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}