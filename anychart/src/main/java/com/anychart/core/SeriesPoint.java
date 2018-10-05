package com.anychart.core;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Point;

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

    protected SeriesPoint() {

    }

    public static SeriesPoint instantiate() {
        return new SeriesPoint("new anychart.core.seriesPoint()");
    }

    

    public SeriesPoint(String jsChart) {
        jsBase = "seriesPoint" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Checks if the point with the given index exists in a dataset.
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
     * Getter for series which current point belongs to.
     */
    public com.anychart.core.SeriesBase getSeries() {
        return new com.anychart.core.SeriesBase(jsBase + ".getSeries()");
    }
    /**
     * Returns stack value of the point.
<b>Note</b>: Works only after chart.draw() is called.
     */
    public void getStackValue() {
        APIlib.getInstance().addJSLine(jsBase + ".getStackValue();");
    }
    /**
     * Returns stack zero of the point.
<b>Note</b>: Works only after chart.draw() is called.
     */
    public void getStackZero() {
        APIlib.getInstance().addJSLine(jsBase + ".getStackZero();");
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
     * Setter for the hover point state.
     */
    public com.anychart.core.SeriesPoint hovered(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", enabled));

        return this;
    }
    /**
     * Getter for the select series point state.
     */
    public void selected() {
        APIlib.getInstance().addJSLine(jsBase + ".selected();");
    }
    /**
     * Setter for the select series point state.
     */
    public com.anychart.core.SeriesPoint selected(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", enabled));

        return this;
    }
    /**
     * Sets the field of the point data row to the specified value.
     */
    public com.anychart.core.SeriesPoint set(String field, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(field), wrapQuotes(value)));

        return this;
    }

}