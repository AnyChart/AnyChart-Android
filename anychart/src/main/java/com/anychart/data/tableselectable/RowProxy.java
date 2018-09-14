package com.anychart.data.tableselectable;

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
 * Represents table row with associated mapping. Allows fetching rows values.
 */
public class RowProxy extends JsObject {

    protected RowProxy() {

    }

    public static RowProxy instantiate() {
        return new RowProxy("new anychart.data.TableSelectable.rowProxy()");
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

}