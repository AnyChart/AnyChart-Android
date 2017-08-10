package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum HAlign {
    CENTER("center"),
    END("end"),
    LEFT("left"),
    RIGHT("right"),
    START("start");

    private final String hAlign;

    HAlign(String hAlign) {
        this.hAlign = hAlign;
    }

    public String get() { return hAlign; }
}
