package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.data.Iterator;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * 
 */
public class DrawingPlanIterator extends Iterator {

    protected DrawingPlanIterator() {

    }

    public static DrawingPlanIterator instantiate() {
        return new DrawingPlanIterator("new anychart.core.utils.drawingPlanIterator()");
    }

    

    public DrawingPlanIterator(String jsChart) {
        jsBase = "drawingPlanIterator" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Advances the iterator to the next item.
     */
    public void advance() {
        APIlib.getInstance().addJSLine(jsBase + ".advance();");
    }
    /**
     * Gets the value from the current row by the field name.
     */
    public void get(String fieldName) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(fieldName)));
    }
    /**
     * Returns the index of the item to which iterator points to.
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Returns the number of rows in the view.
     */
    public void getRowsCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getRowsCount();");
    }
    /**
     * Gets the metadata value by the field name.
     */
    public void meta(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(name)));
    }
    /**
     * Sets metadata value by the field name.
     */
    public com.anychart.core.utils.DrawingPlanIterator meta(String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(name), wrapQuotes(value)));

        return this;
    }
    /**
     * Resets the data iterator to its zero state (before the first item of the view).
     */
    public com.anychart.core.utils.DrawingPlanIterator reset() {
        APIlib.getInstance().addJSLine(jsBase + ".reset();");

        return this;
    }
    /**
     * Sets a passed index as the current index and returns it in case of success.
     */
    public void select(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s);", index));
    }

}