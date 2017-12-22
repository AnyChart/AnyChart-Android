package com.anychart.anychart;

import java.util.Locale;

/**
 * The list of positions for an anchor. <br/>
<img src='https://api.anychart.com/si/8.1.0/anychart.enums.Anchor|string.png' width='327' height='179'/>
 */
public enum VectorAnchor implements JsObject.JsObjectInterface {
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

    VectorAnchor(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}