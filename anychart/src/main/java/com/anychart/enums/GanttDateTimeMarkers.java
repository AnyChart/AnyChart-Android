package com.anychart.enums;

import java.util.Locale;

/**
 * Gantt Date Time scale markers.
 */
public enum GanttDateTimeMarkers {

    CURRENT("current"),
    END("end"),
    START("start");

    private final String value;

    GanttDateTimeMarkers(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}