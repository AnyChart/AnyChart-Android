package com.anychart.scales;

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
 * The Geo class contains methods for configuring Geo scale in the Map.
 */
public class Geo extends Base {

    protected Geo() {

    }

    public static Geo instantiate() {
        return new Geo("new anychart.scales.geo()");
    }

    

    public Geo(String jsChart) {
        jsBase = "geo" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).
     */
    public com.anychart.scales.Geo extendDataRange(Number x, Number y, String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".extendDataRange(%s, %s, %s);", x, y, wrapQuotes(var_args)));

        return this;
    }
    /**
     * Getter for the gap settings.
     */
    public void gap() {
        APIlib.getInstance().addJSLine(jsBase + ".gap();");
    }
    /**
     * Setter for the gap settings.
     */
    public com.anychart.scales.Geo gap(Number gap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".gap(%s);", gap));

        return this;
    }
    /**
     * Returns scale type.
     */
    public void getType() {
        APIlib.getInstance().addJSLine(jsBase + ".getType();");
    }
    /**
     * Getter for maximum ticks count.
     */
    public void maxTicksCount() {
        APIlib.getInstance().addJSLine(jsBase + ".maxTicksCount();");
    }
    /**
     * Setter for maximum ticks count.<br/>
Use the maxTicksCount() method for interval-mode ticks calculation.<br/>
If the number of ticks is greater than set in maxTicksCount(), the scale calculates from 4 to 6 ticks.
     */
    public com.anychart.scales.Geo maxTicksCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxTicksCount(%s);", count));

        return this;
    }
    /**
     * Getter for the maximum X.
     */
    public void maximumX() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumX();");
    }
    /**
     * Setter for the maximum X.
     */
    public com.anychart.scales.Geo maximumX(Number maximumX) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximumX(%s);", maximumX));

        return this;
    }
    /**
     * Getter for the maximum Y.
     */
    public void maximumY() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumY();");
    }
    /**
     * Setter for the maximum Y.
     */
    public com.anychart.scales.Geo maximumY(Number maximumY) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximumY(%s);", maximumY));

        return this;
    }
    /**
     * Getter for the minimum X.
     */
    public void minimumX() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumX();");
    }
    /**
     * Setter for the minimum X.
     */
    public com.anychart.scales.Geo minimumX(Number minimumX) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimumX(%s);", minimumX));

        return this;
    }
    /**
     * Getter for the minimum Y.
     */
    public void minimumY() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumY();");
    }
    /**
     * Setter for the minimum Y.
     */
    public com.anychart.scales.Geo minimumY(Number minimumY) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimumY(%s);", minimumY));

        return this;
    }
    /**
     * Getter for the precision.
     */
    public void precision() {
        APIlib.getInstance().addJSLine(jsBase + ".precision();");
    }
    /**
     * Setter for the precision using one value.
     */
    public com.anychart.scales.Geo precision(Number[] precision) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".precision(%s);", Arrays.toString(precision)));

        return this;
    }
    /**
     * Setter for the precision using several values.
     */
    public com.anychart.scales.Geo precision(Number xPrecision, Number yPrecision) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".precision(%s, %s);", xPrecision, yPrecision));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
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
     * Getter for the set of scale x minor ticks.
     */
    public com.anychart.scales.GeoTicks xMinorTicks() {
        return new com.anychart.scales.GeoTicks(jsBase + ".xMinorTicks()");
    }
    /**
     * Setter for the set of scale x minor ticks.
     */
    public com.anychart.scales.Geo xMinorTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the set of scale x minor ticks.
     */
    public com.anychart.scales.Geo xMinorTicks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the set of scale x ticks.
     */
    public com.anychart.scales.GeoTicks xTicks() {
        return new com.anychart.scales.GeoTicks(jsBase + ".xTicks()");
    }
    /**
     * Setter for the set of scale x ticks.
     */
    public com.anychart.scales.Geo xTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the set of scale x ticks.
     */
    public com.anychart.scales.Geo xTicks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xTicks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the set of scale y minor ticks.
     */
    public com.anychart.scales.GeoTicks yMinorTicks() {
        return new com.anychart.scales.GeoTicks(jsBase + ".yMinorTicks()");
    }
    /**
     * Setter for the set of scale y minor ticks.
     */
    public com.anychart.scales.Geo yMinorTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the set of scale y minor ticks.
     */
    public com.anychart.scales.Geo yMinorTicks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the set of scale y ticks.
     */
    public com.anychart.scales.GeoTicks yTicks() {
        return new com.anychart.scales.GeoTicks(jsBase + ".yTicks()");
    }
    /**
     * Setter for the set of scale y ticks.
     */
    public com.anychart.scales.Geo yTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the set of scale y ticks.
     */
    public com.anychart.scales.Geo yTicks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yTicks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }

}