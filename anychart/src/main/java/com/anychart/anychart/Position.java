package com.anychart.anychart;

import java.util.Locale;

/**
 * Position enum. Defines 9 items. Similar to Anchor. Distinct by meaning.<br/>
<img src="/si/8.1.0/anychart.enums.Anchor.png" width="327" height="179"/>
 */
public enum Position implements JsObject.JsObjectInterface {
    AUTO("auto"),
    CENTER("center"),
    CENTER_BOTTOM("center-bottom"),
    CENTER_TOP("center-top"),
    LEFT_BOTTOM("left-bottom"),
    LEFT_CENTER("left-center"),
    LEFT_TOP("left-top"),
    RIGHT_BOTTOM("right-bottom"),
    RIGHT_CENTER("right-center"),
    RIGHT_TOP("right-top");

    private final String value;

    Position(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}