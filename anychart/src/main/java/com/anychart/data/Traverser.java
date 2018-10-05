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
 * Tree data traverser.
 */
public class Traverser extends JsObject {

    protected Traverser() {

    }

    public static Traverser instantiate() {
        return new Traverser("new anychart.data.traverser()");
    }

    

    public Traverser(String jsChart) {
        jsBase = "traverser" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Advances traverser to the next item.
     */
    public void advance() {
        APIlib.getInstance().addJSLine(jsBase + ".advance();");
    }
    /**
     * Gets current tree data item.
     */
    public com.anychart.data.tree.DataItem current() {
        return new com.anychart.data.tree.DataItem(jsBase + ".current()");
    }
    /**
     * Gets current data item's data value by field specified.
     */
    public void get(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(key)));
    }
    /**
     * Gets depth of current data item.
     */
    public void getDepth() {
        APIlib.getInstance().addJSLine(jsBase + ".getDepth();");
    }
    /**
     * Getter for a meta value.
     */
    public void meta(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));
    }
    /**
     * Setter for a meta value.
     */
    public void meta(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(key), wrapQuotes(value)));
    }
    /**
     * Getter for decider function.
     */
    public void nodeYieldCondition() {
        APIlib.getInstance().addJSLine(jsBase + ".nodeYieldCondition();");
    }
    /**
     * Resets traverser to its zero state (before the first child).<br/>
<img src='/si/8.4.0/anychart.data.Traverser.reset.png' height='296' width='372'/>
     */
    public com.anychart.data.Traverser reset() {
        APIlib.getInstance().addJSLine(jsBase + ".reset();");

        return this;
    }
    /**
     * Sets current item's value by key specified.
     */
    public com.anychart.data.Traverser set(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s);", wrapQuotes(key), wrapQuotes(value)));

        return this;
    }
    /**
     * Turns current traverser to an array of tree data items.
     */
    public void toArray() {
        APIlib.getInstance().addJSLine(jsBase + ".toArray();");
    }
    /**
     * Getter for decider function.
     */
    public void traverseChildrenCondition() {
        APIlib.getInstance().addJSLine(jsBase + ".traverseChildrenCondition();");
    }

}