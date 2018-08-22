package com.anychart.graphics.vector.hatchfill;

import java.util.Locale;

/**
 * Hatch Fill types.
<b>Note!</b> VML does not support hatch due to performance issues.
 */
public enum HatchFillType {

    BACKWARD_DIAGONAL("backward-diagonal"),
    CHECKER_BOARD("checker-board"),
    CONFETTI("confetti"),
    DASHED_BACKWARD_DIAGONAL("dashed-backward-diagonal"),
    DASHED_FORWARD_DIAGONAL("dashed-forward-diagonal"),
    DASHED_HORIZONTAL("dashed-horizontal"),
    DASHED_VERTICAL("dashed-vertical"),
    DIAGONAL_BRICK("diagonal-brick"),
    DIAGONAL_CROSS("diagonal-cross"),
    DIVOT("divot"),
    FORWARD_DIAGONAL("forward-diagonal"),
    GRID("grid"),
    HORIZONTAL("horizontal"),
    HORIZONTAL_BRICK("horizontal-brick"),
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
    SOLID_DIAMOND("solid-diamond"),
    VERTICAL("vertical"),
    VERTICAL_BRICK("vertical-brick"),
    WEAVE("weave"),
    ZIG_ZAG("zig-zag");

    private final String value;

    HatchFillType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}