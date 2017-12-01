package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Point representing bubble points that belongs to cartesian or scatter chart.
 */
public class BubblePoint extends SeriesPoint {

    public BubblePoint() {
        js.setLength(0);
        js.append("var bubblePoint").append(++variableIndex).append(" = anychart.core.bubblePoint();");
        jsBase = "bubblePoint" + variableIndex;
    }

    protected BubblePoint(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected BubblePoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}