package com.anychart.anychart.chart.common;

/**
 * Created by arseny on 8/9/17.
 */

public abstract class JsObject {

    protected StringBuilder js = new StringBuilder();

    public String generateJs() {
        return js.toString();
    }

    public StringBuilder getJs() {
        return js;
    }
}
