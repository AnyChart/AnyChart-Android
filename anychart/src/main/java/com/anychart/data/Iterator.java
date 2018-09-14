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
 * <b>anychart.data.Iterator</b> class is used to work with data in a View.<br/>
The iterator allows getting data from a {@link anychart.data.View} by crawling through rows. Iterator
can be obtained using {@link anychart.data.View#getIterator} method and has methods to control current
index and get values from data/metadata fields in a current row.
 */
public class Iterator extends JsObject {

    protected Iterator() {

    }

    public static Iterator instantiate() {
        return new Iterator("new anychart.data.iterator()");
    }

    

    public Iterator(String jsChart) {
        jsBase = "iterator" + ++variableIndex;
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
    public com.anychart.data.Iterator meta(String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(name), wrapQuotes(value)));

        return this;
    }
    /**
     * Resets the data iterator to its zero state (before the first item of the view).
     */
    public com.anychart.data.Iterator reset() {
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