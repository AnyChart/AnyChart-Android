package com.anychart.anychart;

import java.util.Locale;

public enum Anchor implements JsObject.JsObjectInterface {
    AUTO("auto"),
    CENTER("center"),
    CENTER_BOTTOM("centerBottom"),
    CENTER_TOP("centerTop"),
    LEFT_BOTTOM("leftBottom"),
    LEFT_CENTER("leftCenter"),
    LEFT_TOP("leftTop"),
    RIGHT_BOTTOM("rightBottom"),
    RIGHT_CENTER("rightCenter"),
    RIGHT_TOP("rightTop");

    private final String value;

    Anchor(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}