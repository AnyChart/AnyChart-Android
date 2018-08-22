package com.anychart.enums;

import java.util.Locale;

/**
 * Interval enumeration.
 */
public enum Interval {

    DAY("day"),
    HOUR("hour"),
    MILLISECOND("millisecond"),
    MINUTE("minute"),
    MONTH("month"),
    QUARTER("quarter"),
    SECOND("second"),
    SEMESTER("semester"),
    THIRD_OF_MONTH("third-of-month"),
    WEEK("week"),
    YEAR("year");

    private final String value;

    Interval(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}