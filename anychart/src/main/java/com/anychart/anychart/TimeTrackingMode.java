package com.anychart.anychart;

import java.util.Locale;

/**
 * Time tracking mode.
Row height depends on resource chart time.
 */
public enum TimeTrackingMode implements JsObject.JsObjectInterface {
    ACTIVITY_PER_CHART("activity-per-chart"),
    ACTIVITY_PER_RESOURCE("activity-per-resource"),
    AVAILABILITY_PER_CHART("availability-per-chart"),
    AVAILABILITY_PER_RESOURCE("availability-per-resource");

    private final String value;

    TimeTrackingMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}