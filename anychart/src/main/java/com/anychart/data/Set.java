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
 * Linear data storage.<br/>
Data is stored as an array or rows where each row contains several columns (see Listing 1 below).
To start working with this storage you need to map columns using
{@link anychart.data.Set#mapAs} method (you can create as many mappings as you like).<br/>
Each field can be a number, a string, a function, an array or an object.
Data fields can of any type and its way you read them depends on mapping only:
{@link anychart.data.Set#mapAs}. Sample mappings are shown in code samples 3, 4 and 5.<br/>
<b>Note:</b> To create an instance of this class use {@link anychart.data#set} method.
 */
public class Set extends Base {

    protected Set() {

    }

    public static Set instantiate() {
        return new Set("new anychart.data.set()");
    }

    

    public Set(String jsChart) {
        jsBase = "set" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Appends new rows to the set. Each argument is a row that is appended to the Set.
     */
    public com.anychart.data.Set append(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".append(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * 
     */
    public void data(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", arrayToString(data)));
    }
    /**
     * Returns the number of the rows in the current data set.
     */
    public void getRowsCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getRowsCount();");
    }
    /**
     * Inserts the row to the set at the specified position.
     */
    public com.anychart.data.Set insert(String row, Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".insert(%s, %s);", wrapQuotes(row), index));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.Mapping mapAs(String mapping) {
        return new com.anychart.data.Mapping(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
    }
    /**
     * Removes the row by index.
     */
    public com.anychart.data.Set remove(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".remove(%s);", index));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Gets the full row of the set by the index.
     */
    public void row(Number rowIndex) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".row(%s);", rowIndex));
    }
    /**
     * Sets the row in the set by the index.
     */
    public void row(Number rowIndex, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".row(%s, %s);", rowIndex, wrapQuotes(value)));
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
    /**
     * 
     */
    public com.anychart.data.Set data(com.anychart.data.View data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", (data != null) ? data.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.Set data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.Set data(List<DataEntry> data, String fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), wrapQuotes(fillMethod)));

        return this;
    }

}