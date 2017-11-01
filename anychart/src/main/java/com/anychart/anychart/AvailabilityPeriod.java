package com.anychart.anychart;

import java.util.Locale;

/**
 * Availability period for calendar.
 */
public enum AvailabilityPeriod implements JsObject.JsObjectInterface {
    DAY("day"),
    NONE("none"),
    WEEK("week"),
    YEAR("year");

    private final String value;

    AvailabilityPeriod(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}