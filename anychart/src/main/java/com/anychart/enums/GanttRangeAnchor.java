package com.anychart.enums;

import java.util.Locale;

/**
 * Gantt range anchor.
 */
public enum GanttRangeAnchor {

    FIRST_DATE("first-date"),
    FIRST_VISIBLE_DATE("first-visible-date"),
    LAST_DATE("last-date"),
    LAST_VISIBLE_DATE("last-visible-date");

    private final String value;

    GanttRangeAnchor(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}