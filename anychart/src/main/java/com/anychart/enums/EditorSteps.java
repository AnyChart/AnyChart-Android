package com.anychart.enums;

import java.util.Locale;

/**
 * Names of all the chart editor {api:anychart.editor.Editor#step}steps{api}.
 */
public enum EditorSteps {

    APPEARANCE("appearance"),
    CHART("chart"),
    DATA("data"),
    EXPORT("export");

    private final String value;

    EditorSteps(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}