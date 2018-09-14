package com.anychart.data.tablecomputer;

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
 * Row proxy for computational functions.
 */
public class RowProxy extends JsObject {

    protected RowProxy() {

    }

    public static RowProxy instantiate() {
        return new RowProxy("new anychart.data.TableComputer.rowProxy()");
    }

    

    public RowProxy(String jsChart) {
        jsBase = "rowProxy" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns current field values.
     */
    public void get(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
    }
    /**
     * Returns current column value.
     */
    public void getColumn(Number column) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getColumn(%s);", column));
    }
    /**
     * Returns index of the item in the selection that has created this item.
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
     * Sets field value by field name.
     */
    public void set(String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(name), wrapQuotes(value)));
    }
    /**
     * Sets value by column.
     */
    public void setColumn(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setColumn(%s, %s);", index, wrapQuotes(value)));
    }

}