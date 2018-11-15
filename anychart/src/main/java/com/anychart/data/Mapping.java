package com.anychart.data;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.data.View;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The special view which allows mapping anychart.data.Set storages.
 */
public class Mapping extends View {

    protected Mapping() {

    }

    public static Mapping instantiate() {
        return new Mapping("new anychart.data.mapping()");
    }

    

    public Mapping(String jsChart) {
        jsBase = "mapping" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Concatenates two views to make a derived view that contains rows from both views.
     */
    public com.anychart.data.Mapping concat(com.anychart.data.View otherView) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".concat(%s);", (otherView != null) ? otherView.getJsBase() : null));

        return this;
    }
    /**
     * Concatenates two views to make a derived view that contains rows from both views.
     */
    public com.anychart.data.Mapping concat(String[] otherView) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".concat(%s);", arrayToStringWrapQuotes(otherView)));

        return this;
    }
    /**
     * Creates a derived view, containing just the same data set and order as this view does.
     */
    public com.anychart.data.Mapping derive() {
        APIlib.getInstance().addJSLine(jsBase + ".derive();");

        return this;
    }
    /**
     * Searches fieldName by fieldValue and returns its index (or the first match).
     */
    public void find(String fieldName, String fieldValue) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".find(%s, %s);", wrapQuotes(fieldName), wrapQuotes(fieldValue)));
    }
    /**
     * Gets the value from the row by row index and field name.
     */
    public void get(Number rowIndex, String fieldName) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s, %s);", rowIndex, wrapQuotes(fieldName)));
    }
    /**
     * Returns parent data sets.
     */
    public void getDataSets() {
        APIlib.getInstance().addJSLine(jsBase + ".getDataSets();");
    }
    /**
     * Returns a new iterator for the current view.
     */
    public com.anychart.data.Iterator getIterator() {
        return new com.anychart.data.Iterator(jsBase + ".getIterator()");
    }
    /**
     * Gets the mapping.<br/>
Returns the set mapping (from the {@link anychart.data.Set#mapAs method}) or the default mapping.
     */
    public void getMapping() {
        APIlib.getInstance().addJSLine(jsBase + ".getMapping();");
    }
    /**
     * Returns the number of the rows in the current view.
     */
    public void getRowsCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getRowsCount();");
    }
    /**
     * Getter for a metadata value.
Learn how it works at {@link anychart.data.Iterator#meta}.
     */
    public void meta(Number index, String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", index, wrapQuotes(name)));
    }
    /**
     * Setter for a metadata value. Learn how it works at {@link anychart.data.Iterator#meta}.
     */
    public com.anychart.data.Mapping meta(Number index, String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s, %s);", index, wrapQuotes(name), wrapQuotes(value)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Gets a full row of the set by an index.
     */
    public void row(Number rowIndex) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".row(%s);", rowIndex));
    }
    /**
     * Sets a row of the set by an index.
     */
    public void row(Number rowIndex, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".row(%s, %s);", rowIndex, wrapQuotes(value)));
    }
    /**
     * Sets the value to the row field by row index and field name.
     */
    public com.anychart.data.Mapping set(Number rowIndex, String fieldName, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s);", rowIndex, wrapQuotes(fieldName), wrapQuotes(value)));

        return this;
    }
    /**
     * Creates a derived view that ensures sorting by a passed field.
     */
    public com.anychart.data.Mapping sort(String fieldName, com.anychart.enums.Sort order) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".sort(%s, %s);", wrapQuotes(fieldName), (order != null) ? order.getJsBase() : null));

        return this;
    }
    /**
     * Creates a derived view that ensures sorting by a passed field.
     */
    public com.anychart.data.Mapping sort(String fieldName, String order) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".sort(%s, %s);", wrapQuotes(fieldName), wrapQuotes(order)));

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