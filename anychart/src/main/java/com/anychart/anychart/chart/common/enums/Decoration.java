package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum Decoration {
    BLINK("blink"),
    LINE_THROUGH("line-through"),
    NONE("one"),
    OVERLINE("overline"),
    UNDERLINE("underline");

    private final String decoration;

    Decoration(String decoration) {
        this.decoration = decoration;
    }

    public String get() { return decoration; }
}
