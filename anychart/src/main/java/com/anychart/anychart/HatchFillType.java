package com.anychart.anychart;

import java.util.Locale;

public enum HatchFillType implements JsObject.JsObjectInterface {
    BACKWARD_DIAGONAL("backwardDiagonal"),
    CHECKER_BOARD("checkerBoard"),
    CONFETTI("confetti"),
    DASHED_BACKWARD_DIAGONAL("dashedBackwardDiagonal"),
    DASHED_FORWARD_DIAGONAL("dashedForwardDiagonal"),
    DASHED_HORIZONTAL("dashedHorizontal"),
    DASHED_VERTICAL("dashedVertical"),
    DIAGONAL_BRICK("diagonalBrick"),
    DIAGONAL_CROSS("diagonalCross"),
    DIVOT("divot"),
    FORWARD_DIAGONAL("forwardDiagonal"),
    GRID("grid"),
    HORIZONTAL("horizontal"),
    HORIZONTAL_BRICK("horizontalBrick"),
    PERCENT_05("percent05"),
    PERCENT_10("percent10"),
    PERCENT_20("percent20"),
    PERCENT_25("percent25"),
    PERCENT_30("percent30"),
    PERCENT_40("percent40"),
    PERCENT_50("percent50"),
    PERCENT_60("percent60"),
    PERCENT_70("percent70"),
    PERCENT_75("percent75"),
    PERCENT_80("percent80"),
    PERCENT_90("percent90"),
    PLAID("plaid"),
    SOLID_DIAMOND("solidDiamond"),
    VERTICAL("vertical"),
    VERTICAL_BRICK("verticalBrick"),
    WEAVE("weave"),
    ZIG_ZAG("zigZag");

    private final String value;

    HatchFillType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}