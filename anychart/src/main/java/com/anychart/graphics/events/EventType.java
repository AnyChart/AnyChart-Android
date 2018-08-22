package com.anychart.graphics.events;

import java.util.Locale;

/**
 * Constants for event names.
 */
public enum EventType {

    CLICK("click"),
    CONTEXTMENU("contextmenu"),
    DBLCLICK("dblclick"),
    DRAG("drag"),
    DRAG_BEFORE("beforedrag"),
    DRAG_EARLY_CANCEL("earlycancel"),
    DRAG_END("end"),
    DRAG_START("start"),
    MOUSEDOWN("mousedown"),
    MOUSEMOVE("mousemove"),
    MOUSEOUT("mouseout"),
    MOUSEOVER("mouseover"),
    MOUSEUP("mouseup"),
    TAP("tap"),
    TOUCHCANCEL("touchcancel"),
    TOUCHEND("touchend"),
    TOUCHMOVE("touchmove"),
    TOUCHSTART("touchstart");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}