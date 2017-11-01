package com.anychart.anychart;

import java.util.Locale;

/**
 * Milestones shape.
 */
public enum MilestoneShape implements JsObject.JsObjectInterface {
    CIRCLE("circle"),
    RECTANGLE("rectangle"),
    RHOMBUS("rhombus");

    private final String value;

    MilestoneShape(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}