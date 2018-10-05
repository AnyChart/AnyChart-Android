package com.anychart.enums;

import java.util.Locale;

/**
 * Names of all the chart editor {api:anychart.editor.Step#tab}tabs{api}.
 */
public enum EditorTabs {

    CARTESIAN_AXES("cartesianAxes"),
    CIRCULAR_RANGES("circularRanges"),
    COLOR_RANGE("colorRange"),
    COLOR_SCALE("colorScale"),
    CONTEXT_MENU("contextMenu"),
    CREDITS("credits"),
    DATA_LABELS("dataLabels"),
    EMBED("embed"),
    GAUGE_AXES("gaugeAxes"),
    GRIDS("grids"),
    JSON("json"),
    LEGEND("legend"),
    POINTERS("pointers"),
    RADAR_POLAR_AXES("radarPolarAxes"),
    SCALES("scales"),
    SCALE_BARS("scaleBars"),
    SERIES("series"),
    SOURCE_CODE("sourceCode"),
    SPECIFIC("specific"),
    THEMING("theming"),
    TITLE("title"),
    TOOLTIP("tooltip");

    private final String value;

    EditorTabs(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}