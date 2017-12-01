package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Point representing all points that belongs to series-based chart.
 */
public class SeriesPoint extends Point {

    public SeriesPoint() {
        js.setLength(0);
        js.append("var seriesPoint").append(++variableIndex).append(" = anychart.core.seriesPoint();");
        jsBase = "seriesPoint" + variableIndex;
    }

    protected SeriesPoint(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SeriesPoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AnychartSeriesBase getGetSeries;

    /**
     * Getter for series which current point belongs to.
     */
    public AnychartSeriesBase getGetSeries() {
        if (getGetSeries == null)
            getGetSeries = new AnychartSeriesBase(jsBase + ".getSeries()");

        return getGetSeries;
    }

    private String generateJSgetGetSeries() {
        if (getGetSeries != null) {
            return getGetSeries.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetSeries());

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