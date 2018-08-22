package com.anychart.enums;

import java.util.Locale;

/**
 * Pert reserved names of field in data.
 */
public enum DataField {

    DEPENDS_ON("dependsOn"),
    DURATION("duration"),
    EXPECTED("expected"),
    FROM("from"),
    ID("id"),
    MOST_LIKELY("mostLikely"),
    NAME("name"),
    OPTIMISTIC("optimistic"),
    PESSIMISTIC("pessimistic"),
    TO("to");

    private final String value;

    DataField(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}