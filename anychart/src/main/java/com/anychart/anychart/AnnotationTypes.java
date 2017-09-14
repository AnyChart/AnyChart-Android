package com.anychart.anychart;

import java.util.Locale;

public enum AnnotationTypes implements JsObject.JsObjectInterface {
    ANDREWS_PITCHFORK("andrewsPitchfork"),
    ELLIPSE("ellipse"),
    FIBONACCI_ARC("fibonacciArc"),
    FIBONACCI_FAN("fibonacciFan"),
    FIBONACCI_RETRACEMENT("fibonacciRetracement"),
    FIBONACCI_TIMEZONES("fibonacciTimezones"),
    HORIZONTAL_LINE("horizontalLine"),
    INFINITE_LINE("infiniteLine"),
    LINE("line"),
    MARKER("marker"),
    RAY("ray"),
    RECTANGLE("rectangle"),
    TREND_CHANNEL("trendChannel"),
    TRIANGLE("triangle"),
    VERTICAL_LINE("verticalLine");

    private final String value;

    AnnotationTypes(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}