package com.anychart.anychart;

import java.util.Locale;

public enum ConnectorType implements JsObject.JsObjectInterface {
    FINISH_FINISH("finishFinish"),
    FINISH_START("finishStart"),
    START_FINISH("startFinish"),
    START_START("startStart");

    private final String value;

    ConnectorType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}