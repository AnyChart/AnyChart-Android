package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum FontVariant {
    NORMAL("normal"),
    SMALL_CAP("small-caps");

    private final String fontStyle;

    FontVariant(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String get() { return fontStyle; }
}
