package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * A base for all series except marker series.
 */
public class CartesianSeriesBaseWithMarkers extends CartesianSeriesBase {

    public CartesianSeriesBaseWithMarkers() {
        js.setLength(0);
        js.append("var cartesianSeriesBaseWithMarkers").append(++variableIndex).append(" = anychart.core.cartesian.series.baseWithMarkers();");
        jsBase = "cartesianSeriesBaseWithMarkers" + variableIndex;
    }

    protected CartesianSeriesBaseWithMarkers(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesBaseWithMarkers(StringBuilder js, String jsBase, boolean isChain) {
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