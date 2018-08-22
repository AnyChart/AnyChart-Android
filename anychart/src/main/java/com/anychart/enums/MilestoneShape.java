package com.anychart.enums;

import java.util.Locale;

/**
 * Milestones shapes.
 */
public enum MilestoneShape {

    CIRCLE("circle"),
    RECTANGLE("rectangle"),
    RHOMBUS("rhombus");

    private final String value;

    MilestoneShape(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}