package com.anychart.anychart.chart.common;

/**
 * Created by arseny on 8/9/17.
 */

public class Mode extends JsObject {

    private Rect rect;
    private boolean mode;

    public static Mode instantiateMode(Rect mode) {
        return new Mode(mode);
    }

    public static Mode instantiateMode(boolean mode) {
        return new Mode(mode);
    }

    private Mode(Rect rect) {
        this.rect = rect;
    }

    private Mode(boolean mode) {
        this.mode = mode;
    }

    @Override
    public String generateJs() {
        if (rect == null) {
            js.append(mode);
        } else {
            js.append(rect.generateJs());
        }

        return js.toString();
    }
}
