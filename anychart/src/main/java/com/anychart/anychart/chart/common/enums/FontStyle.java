package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum FontStyle {
    ITALIC("italic"),
    NORMAL("normal"),
    OBLIQUE("oblique");

    private final String fontStyle;

    FontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String get() { return fontStyle; }
}
