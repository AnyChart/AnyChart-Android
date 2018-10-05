package com.anychart.graphics.vector;

import java.util.Locale;

/**
 * The list of positions for an anchor. <br/>
<img src='https://api.anychart.com/si/8.4.0/anychart.enums.Anchor|string.png' width='327' height='179'/>
 */
public enum Anchor {

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

    Anchor(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}