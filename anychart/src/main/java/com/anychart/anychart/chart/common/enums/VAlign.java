package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum VAlign {
    BOTTOM("center"),
    MIDDLE("end"),
    TOP("left");

    private final String vAlign;

    VAlign(String vAlign) {
        this.vAlign = vAlign;
    }

    public String get() { return vAlign; }
}
