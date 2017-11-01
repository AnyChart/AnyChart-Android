package com.anychart.anychart;

import java.util.Locale;

/**
 * Connection types.
 */
public enum ConnectorType implements JsObject.JsObjectInterface {
    FINISH_FINISH("finish-finish"),
    FINISH_START("finish-start"),
    START_FINISH("start-finish"),
    START_START("start-start");

    private final String value;

    ConnectorType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}