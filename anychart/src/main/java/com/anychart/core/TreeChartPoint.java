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
 * Class that wraps point of series or chart.
 */
public class TreeChartPoint extends Point {

    protected TreeChartPoint() {

    }

    public static TreeChartPoint instantiate() {
        return new TreeChartPoint("new anychart.core.treeChartPoint()");
    }

    

    public TreeChartPoint(String jsChart) {
        jsBase = "treeChartPoint" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Checks if the point exists.
     */
    public void exists() {
        APIlib.getInstance().addJSLine(jsBase + ".exists();");
    }
    /**
     * Getter for the current value from data by path specified.
     */
    public void get(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
    }
    /**
     * Getter for the chart point belongs to.
     */
    public com.anychart.core.SeparateChart getChart() {
        return new com.anychart.core.SeparateChart(jsBase + ".getChart()");
    }
    /**
     * Getter for the point linear index.
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Returns a node.
     */
    public com.anychart.data.tree.DataItem getNode() {
        return new com.anychart.data.tree.DataItem(jsBase + ".getNode()");
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
    public com.anychart.core.TreeChartPoint hovered(Boolean enabled) {
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
     * Setter for the select point state.
     */
    public com.anychart.core.TreeChartPoint selected(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", value));

        return this;
    }
    /**
     * Setter for the value to the data by path.
     */
    public com.anychart.core.TreeChartPoint set(String field, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(field), wrapQuotes(value)));

        return this;
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

}