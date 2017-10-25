package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class SeriesPoint extends Point {

    public SeriesPoint() {

    }

    protected SeriesPoint(String jsBase) {
        this.jsBase = jsBase;
    }

    protected SeriesPoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private AnychartSeriesBase getGetSeries;

    public AnychartSeriesBase getGetSeries() {
        if (getGetSeries == null)
            getGetSeries = new AnychartSeriesBase(jsBase + ".getSeries()");

        return getGetSeries;
    }


//
//    private String generateJSAnychartSeriesBase getGetSeries() {
//        if (AnychartSeriesBase getGetSeries != null) {
//            return AnychartSeriesBase getGetSeries.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetGetSeries() {
        if (getGetSeries != null) {
            return getGetSeries.generateJs();
            //return String.format(Locale.US, "getGetSeries: %s,", ((getGetSeries != null) ? getGetSeries.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}