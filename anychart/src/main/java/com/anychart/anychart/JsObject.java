package com.anychart.anychart;

/**
 * Created by arseny on 8/9/17.
 */

public abstract class JsObject {

    protected StringBuilder js = new StringBuilder();

    protected String generateJs() {
        return js.toString();
    }

    protected StringBuilder getJs() {
        return js;
    }
}
