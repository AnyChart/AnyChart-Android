package com.anychart.anychart;

import java.util.Locale;

public enum DataField implements JsObject.JsObjectInterface {
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

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}