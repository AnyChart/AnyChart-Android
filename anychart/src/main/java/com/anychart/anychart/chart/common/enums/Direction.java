package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum Direction {
    LTR("ltr"),
    RTL("rtl");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String get() { return direction; }
}
