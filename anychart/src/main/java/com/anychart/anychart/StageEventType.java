package com.anychart.anychart;

import java.util.Locale;

/**
 * Stage events.
 */
public enum StageEventType implements JsObject.JsObjectInterface {
    RENDER_FINISH("renderfinish"),
    RENDER_START("renderstart"),
    STAGE_RENDERED("stagerendered"),
    STAGE_RESIZE("stageresize");

    private final String value;

    StageEventType(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}