package com.anychart.data;

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
 * Table iterator class. Assumes iterator (if any) to return not fewer keys than the table has.
 */
public class TableIterator extends JsObject {

    protected TableIterator() {

    }

    public static TableIterator instantiate() {
        return new TableIterator("new anychart.data.tableIterator()");
    }

    

    public TableIterator(String jsChart) {
        jsBase = "tableIterator" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Advances the iterator to the next position.
     */
    public void advance() {
        APIlib.getInstance().addJSLine(jsBase + ".advance();");
    }
    /**
     * Returns current field values.
     */
    public void get(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
    }
    /**
     * Returns item index.
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Returns item key.
     */
    public void getKey() {
        APIlib.getInstance().addJSLine(jsBase + ".getKey();");
    }
    /**
     * Resets the iterator to a pre-first position.
     */
    public void reset() {
        APIlib.getInstance().addJSLine(jsBase + ".reset();");
    }

}