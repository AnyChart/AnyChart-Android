package com.anychart.enums;

import java.util.Locale;

/**
 * Cursor enum. Defines 19 items.
 */
public enum Cursor {

    CROSSHAIR("crosshair"),
    DEFAULT("default"),
    EW_RESIZE("ew-resize"),
    E_RESIZE("e-resize"),
    HELP("help"),
    MOVE("move"),
    NESW_RESIZE("nesw-resize"),
    NE_RESIZE("ne-resize"),
    NS_RESIZE("ns-resize"),
    NWSE_RESIZE("nwse-resize"),
    NW_RESIZE("nw-resize"),
    N_RESIZE("n-resize"),
    POINTER("pointer"),
    SE_RESIZE("se-resize"),
    SW_RESIZE("sw-resize"),
    S_RESIZE("s-resize"),
    TEXT("text"),
    WAIT("wait"),
    W_RESIZE("w-resize");

    private final String value;

    Cursor(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}