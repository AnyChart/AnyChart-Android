package com.anychart.anychart.chart.common.stroke;

import com.anychart.anychart.JsObject;

/**
 * Created by arseny on 8/8/17.
 */

public abstract class Stroke extends JsObject {

    public enum LineCap {
        BUTT("butt"),
        ROUND("round"),
        SQUARE("square");

        private final String cap;

        LineCap(String cap) {
            this.cap = cap;
        }

        public String get() { return cap; }
    }

    public enum LineJoin {
        BEVEL("bevel"),
        MITER("miter"),
        ROUND("round");

        private final String join;

        LineJoin(String join) {
            this.join = join;
        }

        public String get() { return join; }
    }

}
