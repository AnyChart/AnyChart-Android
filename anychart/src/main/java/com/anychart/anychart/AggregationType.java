package com.anychart.anychart;

import java.util.Locale;

/**
 * Aggregation type for table columns.
 */
public enum AggregationType implements JsObject.JsObjectInterface {
    AVERAGE("average"),
    FIRST("first"),
    FIRST_VALUE("first-value"),
    LAST("last"),
    LAST_VALUE("last-value"),
    LIST("list"),
    MAX("max"),
    MIN("min"),
    SUM("sum"),
    WEIGHTED_AVERAGE("weighted-average");

    private final String value;

    AggregationType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}