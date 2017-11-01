package com.anychart.anychart;

import java.util.Locale;

/**
 * Gantt Date Time scale markers.
 */
public enum GanttDateTimeMarkers implements JsObject.JsObjectInterface {
    CURRENT("current"),
    END("end"),
    START("start");

    private final String value;

    GanttDateTimeMarkers(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}