package com.anychart.enums;

import java.util.Locale;

/**
 * Availability period for calendar.
 */
public enum AvailabilityPeriod {

    DAY("day"),
    NONE("none"),
    WEEK("week"),
    YEAR("year");

    private final String value;

    AvailabilityPeriod(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}