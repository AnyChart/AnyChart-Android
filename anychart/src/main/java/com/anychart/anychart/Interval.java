package com.anychart.anychart;

import java.util.Locale;

/**
 * Interval enumeration.
 */
public enum Interval implements JsObject.JsObjectInterface {
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

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}