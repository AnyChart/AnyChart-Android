package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/8/17.
 */

public enum MarkerType {
    ARROWHEAD("arrowhead"),
    ARROW_DOWN("arrowDown"),
    ARROW_LEFT("arrowLeft"),
    ARROW_RIGHT("arrowRight"),
    ARROW_UP("arrowUp"),
    CIRCLE("circle"),
    CROSS("cross"),
    DIAGONAL_CROSS("diagonalCross"),
    DIAMOND("diamond"),
    LINE("line"),
    PENTAGON("pentagon"),
    SQUARE("square"),
    STAR10("star10"),
    STAR4("star4"),
    STAR5("star5"),
    STAR6("star6"),
    STAR7("star7"),
    TRAPEZIUM("trapezium"),
    TRIANGLE_DOWN("triangleDown"),
    TRIANGLE_LEFT("triangleLeft"),
    TRIANGLE_RIGHT("triangleRight"),
    TRIANGLE_UP("triangleUp");

    private final String markerType;

    MarkerType(String markerType) {
        this.markerType = markerType;
    }

    public String get() { return markerType; }

}
