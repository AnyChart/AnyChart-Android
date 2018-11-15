package com.anychart.data;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Tree data model.
 */
public class Tree extends Base {

    protected Tree() {

    }

    public static Tree instantiate() {
        return new Tree("new anychart.data.tree()");
    }

    

    public Tree(String jsChart) {
        jsBase = "tree" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds a new root element and returns it.
     */
    public com.anychart.data.tree.DataItem addChild(String child) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".addChild(%s)", wrapQuotes(child)));
    }
    /**
     * Inserts a new root element into a specified position by index and returns it.
     */
    public com.anychart.data.tree.DataItem addChildAt(String child, Number index) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", wrapQuotes(child), index));
    }
    /**
     * Inserts a new root element into a specified position by index and returns it.
     */
    public com.anychart.data.tree.DataItem addChildAt(com.anychart.data.tree.DataItem child, Number index) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", (child != null) ? child.getJsBase() : null, index));
    }
    /**
     * Inserts a new root element into a specified position by index and returns it.
     */
    public com.anychart.data.tree.DataItem addChildAt(com.anychart.data.treeview.DataItem child, Number index) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", (child != null) ? child.getJsBase() : null, index));
    }
    /**
     * 
     */
    public com.anychart.data.Tree addData(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addData(%s);", arrayToString(data)));

        return this;
    }
    /**
     * Gets tree CRUD events dispatching.
     */
    public void dispatchEvents() {
        APIlib.getInstance().addJSLine(jsBase + ".dispatchEvents();");
    }
    /**
     * Starts or stops tree CRUD events dispatching.
     */
    public com.anychart.data.Tree dispatchEvents(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dispatchEvents(%s);", enabled));

        return this;
    }
    /**
     * Gets the child by index.
     */
    public com.anychart.data.tree.DataItem getChildAt(Number index) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".getChildAt(%s)", index));
    }
    /**
     * Returns a copy of roots array.
     */
    public void getChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".getChildren();");
    }
    /**
     * Creates tree data traverser.
     */
    public com.anychart.data.Traverser getTraverser() {
        return new com.anychart.data.Traverser(jsBase + ".getTraverser()");
    }
    /**
     * Gets the index of child in a roots array.
     */
    public void indexOfChild(com.anychart.data.tree.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Gets the index of child in a roots array.
     */
    public void indexOfChild(com.anychart.data.treeview.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.TreeView mapAs(String mapping) {
        return new com.anychart.data.TreeView(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
    }
    /**
     * Returns a length of roots array.
     */
    public void numChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".numChildren();");
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes tree's root data item.
     */
    public com.anychart.data.tree.DataItem removeChild(com.anychart.data.tree.DataItem child) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".removeChild(%s)", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Removes the child at specified position.
     */
    public com.anychart.data.tree.DataItem removeChildAt(Number index) {
        return new com.anychart.data.tree.DataItem(String.format(Locale.US, jsBase + ".removeChildAt(%s)", index));
    }
    /**
     * Removes children of the tree.
     */
    public com.anychart.data.Tree removeChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".removeChildren();");

        return this;
    }
    /**
     * Removes index on a specified field.
     */
    public com.anychart.data.Tree removeIndexOn(String field) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeIndexOn(%s);", wrapQuotes(field)));

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}