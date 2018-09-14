package com.anychart.data.tree;

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
 * Tree data item.
 */
public class DataItem extends JsObject {

    protected DataItem() {

    }

    public static DataItem instantiate() {
        return new DataItem("new anychart.data.Tree.dataItem()");
    }

    

    public DataItem(String jsChart) {
        jsBase = "dataItem" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds a child.
     */
    public com.anychart.data.tree.DataItem addChild(String child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));

        return this;
    }
    /**
     * Adds a child.
     */
    public com.anychart.data.tree.DataItem addChild(com.anychart.data.tree.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChild(%s);", (child != null) ? child.getJsBase() : null));

        return this;
    }
    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public com.anychart.data.tree.DataItem addChildAt(String child, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", wrapQuotes(child), index));

        return this;
    }
    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public com.anychart.data.tree.DataItem addChildAt(com.anychart.data.tree.DataItem child, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", (child != null) ? child.getJsBase() : null, index));

        return this;
    }
    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public com.anychart.data.tree.DataItem addChildAt(com.anychart.data.treeview.DataItem child, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", (child != null) ? child.getJsBase() : null, index));

        return this;
    }
    /**
     * Removes from data by specified path.
     */
    public com.anychart.data.tree.DataItem del(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".del(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * Gets a value from data by key.
     */
    public void get(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(key)));
    }
    /**
     * Gets the child by index.
     */
    public com.anychart.data.tree.DataItem getChildAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getChildAt(%s);", index));

        return this;
    }
    /**
     * Returns a copy of children array of the current data item.
     */
    public void getChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".getChildren();");
    }
    /**
     * Gets a data item's parent.
     */
    public com.anychart.data.tree.DataItem getParent() {
        APIlib.getInstance().addJSLine(jsBase + ".getParent();");

        return this;
    }
    /**
     * Gets the index of child in a children array.
     */
    public void indexOfChild(com.anychart.data.tree.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Gets the index of child in a children array.
     */
    public void indexOfChild(com.anychart.data.treeview.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Getter for a meta data.
     */
    public void meta(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));
    }
    /**
     * Setter for a meta data.
     */
    public void meta(String key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(key), wrapQuotes(value)));
    }
    /**
     * Returns a length of children array.
     */
    public void numChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".numChildren();");
    }
    /**
     * Removes data item.
     */
    public com.anychart.data.tree.DataItem remove() {
        APIlib.getInstance().addJSLine(jsBase + ".remove();");

        return this;
    }
    /**
     * Removes data item's child.
     */
    public com.anychart.data.tree.DataItem removeChild(com.anychart.data.tree.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeChild(%s);", (child != null) ? child.getJsBase() : null));

        return this;
    }
    /**
     * Removes child at specified position.
     */
    public com.anychart.data.tree.DataItem removeChildAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeChildAt(%s);", index));

        return this;
    }
    /**
     * Removes children.
     */
    public com.anychart.data.tree.DataItem removeChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".removeChildren();");

        return this;
    }
    /**
     * Sets a value to the data by path.
     */
    public com.anychart.data.tree.DataItem set(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s);", wrapQuotes(var_args)));

        return this;
    }

}