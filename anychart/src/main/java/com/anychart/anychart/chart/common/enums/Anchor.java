package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum  Anchor {
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

    private final String anchor;

    Anchor(String anchor) {
        this.anchor = anchor;
    }

    public String get() { return anchor; }

}
