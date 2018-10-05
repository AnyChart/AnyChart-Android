package com.anychart.core;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class that wraps point of series/chart.
 */
public class Point extends JsObject {

    protected Point() {

    }

    public static Point instantiate() {
        return new Point("new anychart.core.point()");
    }

    

    public Point(String jsChart) {
        jsBase = "point" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Checks the existence of the current point (by index) in dataset.
     */
    public void exists() {
        APIlib.getInstance().addJSLine(jsBase + ".exists();");
    }
    /**
     * Fetches a field value from point data row by its name.
     */
    public void get(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
    }
    /**
     * Getter for the chart which current point belongs to.
     */
    public com.anychart.core.SeparateChart getChart() {
        return new com.anychart.core.SeparateChart(jsBase + ".getChart()");
    }
    /**
     * Getter for the point index in chart or series.
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Getter for the statistics value by key.
     */
    public void getStat(com.anychart.enums.Statistics key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", (key != null) ? key.getJsBase() : null));
    }
    /**
     * Getter for the statistics value by key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for the hover point state.
     */
    public void hovered() {
        APIlib.getInstance().addJSLine(jsBase + ".hovered();");
    }
    /**
     * Setter for hover point state.
     */
    public com.anychart.core.Point hovered(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", enabled));

        return this;
    }
    /**
     * Getter for the select point state.
     */
    public void selected() {
        APIlib.getInstance().addJSLine(jsBase + ".selected();");
    }
    /**
     * Setter for select point state.
     */
    public com.anychart.core.Point selected(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", enabled));

        return this;
    }
    /**
     * Sets the field of the point data row to the specified value.
     */
    public com.anychart.core.Point set(String field, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(field), wrapQuotes(value)));

        return this;
    }

}