package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum TextWrap {
    BY_LETTER("byLetter"),
    BY_WORD("byWord"),
    NO_WRAP("noWrap");

    private final String textWrap;

    TextWrap(String textWrap) {
        this.textWrap = textWrap;
    }

    public String get() { return textWrap; }
}
