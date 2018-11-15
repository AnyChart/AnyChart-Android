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
 * Stock data table constructor.
 */
public class Table extends Base {

    protected Table() {

    }

    public static Table instantiate() {
        return new Table("new anychart.data.table()");
    }

    
    public static Table instantiate(String keyIndex) {
        return new Table(String.format(Locale.US, "new anychart.data.table(%s)", wrapQuotes(keyIndex)));
    }

    public Table(String jsChart) {
        jsBase = "table" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * 
     */
    public com.anychart.data.Table addData(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addData(%s);", arrayToString(data)));

        return this;
    }
    /**
     * Creates new computer with given input fields.
     */
    public com.anychart.data.TableComputer createComputer(com.anychart.data.TableMapping mappingSettingsOrMapping) {
        return new com.anychart.data.TableComputer(String.format(Locale.US, jsBase + ".createComputer(%s)", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping mapAs(String mapping) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
    }
    /**
     * Removes all items between a start and end keys.
     */
    public com.anychart.data.Table remove(Number startKey, Number endKey) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".remove(%s, %s);", startKey, endKey));

        return this;
    }
    /**
     * Removes all items between a start and end keys.
     */
    public com.anychart.data.Table remove(Number startKey, String endKey) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".remove(%s, %s);", startKey, wrapQuotes(endKey)));

        return this;
    }
    /**
     * Removes all items between a start and end keys.
     */
    public com.anychart.data.Table remove(String startKey, Number endKey) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".remove(%s, %s);", wrapQuotes(startKey), endKey));

        return this;
    }
    /**
     * Removes all items between a start and end keys.
     */
    public com.anychart.data.Table remove(String startKey, String endKey) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".remove(%s, %s);", wrapQuotes(startKey), wrapQuotes(endKey)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes first opt_count rows from the storage also considering appended but not yet committed rows.
     */
    public com.anychart.data.Table removeFirst(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeFirst(%s);", count));

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