package com.anychart.anychart;

import java.util.Locale;

public enum MapUnboundRegionsMode implements JsObject.JsObjectInterface {
    AS_IS("asis"),
    HIDE("hide");

    private final String value;

    MapUnboundRegionsMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}