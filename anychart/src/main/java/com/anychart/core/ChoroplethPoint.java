package com.anychart.core;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.SeriesPoint;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Point representing choropleth points that belongs to map.
 */
public class ChoroplethPoint extends SeriesPoint {

    protected ChoroplethPoint() {

    }

    public static ChoroplethPoint instantiate() {
        return new ChoroplethPoint("new anychart.core.choroplethPoint()");
    }

    

    public ChoroplethPoint(String jsChart) {
        jsBase = "choroplethPoint" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns the point crs (coordinate system).
     */
    public void crs() {
        APIlib.getInstance().addJSLine(jsBase + ".crs();");
    }
    /**
     * Changes crs (coordinate system) of the point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint crs(String crs) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crs(%s);", wrapQuotes(crs)));

        return this;
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
     * Getter for the point bounds.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.math.Rect getFeatureBounds() {
        return new com.anychart.math.Rect(jsBase + ".getFeatureBounds()");
    }
    /**
     * Getter for the point properties.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public void getFeatureProp() {
        APIlib.getInstance().addJSLine(jsBase + ".getFeatureProp();");
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
    public com.anychart.core.ChoroplethPoint hovered(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", enabled));

        return this;
    }
    /**
     * Getter for the X center of the point label.
     */
    public void middleX() {
        APIlib.getInstance().addJSLine(jsBase + ".middleX();");
    }
    /**
     * Setter for the X center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint middleX(Number xCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleX(%s);", xCoord));

        return this;
    }
    /**
     * Getter for the Y center of the point label.
     */
    public void middleY() {
        APIlib.getInstance().addJSLine(jsBase + ".middleY();");
    }
    /**
     * Setter for the Y center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint middleY(Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleY(%s);", yCoord));

        return this;
    }
    /**
     * Getter for the scale of the point.
     */
    public void scaleFactor() {
        APIlib.getInstance().addJSLine(jsBase + ".scaleFactor();");
    }
    /**
     * Scales point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint scaleFactor(Number scaleFactor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scaleFactor(%s);", scaleFactor));

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
    public com.anychart.core.ChoroplethPoint selected(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", enabled));

        return this;
    }
    /**
     * Sets the field of the point data row to the specified value.
     */
    public com.anychart.core.ChoroplethPoint set(String field, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(field), wrapQuotes(value)));

        return this;
    }
    /**
     * Moves point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint translate(Number dx, Number dy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".translate(%s, %s);", dx, dy));

        return this;
    }
    /**
     * Getter for the point translation.
     */
    public void translation() {
        APIlib.getInstance().addJSLine(jsBase + ".translation();");
    }
    /**
     * Setter for the point translation.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public com.anychart.core.ChoroplethPoint translation(Number dx, Number dy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".translation(%s, %s);", dx, dy));

        return this;
    }

}