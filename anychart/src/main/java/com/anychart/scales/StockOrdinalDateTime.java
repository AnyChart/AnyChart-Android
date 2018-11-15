package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.scales.StockScatterDateTime;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The StockOrdinalDateTime class contains methods for configuring ordinal date time scale on the Stock.
 */
public class StockOrdinalDateTime extends StockScatterDateTime {

    protected StockOrdinalDateTime() {

    }

    public static StockOrdinalDateTime instantiate() {
        return new StockOrdinalDateTime("new anychart.scales.stockOrdinalDateTime()");
    }

    

    public StockOrdinalDateTime(String jsChart) {
        jsBase = "stockOrdinalDateTime" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the full scale maximum.
     */
    public void getFullMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".getFullMaximum();");
    }
    /**
     * Getter for the full scale minimum.
     */
    public void getFullMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".getFullMinimum();");
    }
    /**
     * 
     */
    public void getGroupingUnit() {
        APIlib.getInstance().addJSLine(jsBase + ".getGroupingUnit();");
    }
    /**
     * 
     */
    public void getGroupingUnitCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getGroupingUnitCount();");
    }
    /**
     * Getter for the scale maximum.
     */
    public void getMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".getMaximum();");
    }
    /**
     * Getter for the scale minimum.
     */
    public void getMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".getMinimum();");
    }
    /**
     * Processes reverse transformation of the ratio backward to value.
     */
    public void inverseTransform(Number ratio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Transforms values to ratio.
     */
    public void transform(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s);", value));
    }
    /**
     * Transforms values to ratio.
     */
    public void transform(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s);", wrapQuotes(value)));
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
     * Getter for scale ticks.
     */
    public void ticks() {
        APIlib.getInstance().addJSLine(jsBase + ".ticks();");
    }
    /**
     * Getter for the minor ticks count.
     */
    public void ticksCount() {
        APIlib.getInstance().addJSLine(jsBase + ".ticksCount();");
    }
    /**
     * Setter for the minor ticks count.
     */
    public com.anychart.scales.StockOrdinalDateTime ticksCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticksCount(%s);", count));

        return this;
    }

}