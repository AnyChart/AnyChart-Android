package com.anychart.anychart;

import java.util.Locale;

public enum MarkerType implements JsObject.JsObjectInterface {
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

    private final String value;

    MarkerType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}