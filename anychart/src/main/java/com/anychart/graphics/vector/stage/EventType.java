package com.anychart.graphics.vector.stage;

import java.util.Locale;

/**
 * Stage events.
 */
public enum EventType {

    RENDER_FINISH("renderfinish"),
    RENDER_START("renderstart"),
    STAGE_RENDERED("stagerendered"),
    STAGE_RESIZE("stageresize");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}