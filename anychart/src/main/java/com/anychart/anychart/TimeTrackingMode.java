package com.anychart.anychart;

import java.util.Locale;

public enum TimeTrackingMode implements JsObject.JsObjectInterface {
    ACTIVITY_PER_CHART("activityPerChart"),
    ACTIVITY_PER_RESOURCE("activityPerResource"),
    AVAILABILITY_PER_CHART("availabilityPerChart"),
    AVAILABILITY_PER_RESOURCE("availabilityPerResource");

    private final String value;

    TimeTrackingMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}