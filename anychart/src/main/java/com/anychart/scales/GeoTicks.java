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
 * The GeoTicks class contains methods for configuring ticks on the Geo scale.
 */
public class GeoTicks extends Base {

    protected GeoTicks() {

    }

    public static GeoTicks instantiate() {
        return new GeoTicks("new anychart.scales.geoTicks()");
    }

    

    public GeoTicks(String jsChart) {
        jsBase = "geoTicks" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for ticks count.
     */
    public void count() {
        APIlib.getInstance().addJSLine(jsBase + ".count();");
    }
    /**
     * Setter for ticks count value.
<b>Note:</b> Final number of ticks can be greater (one more tick can be added).
     */
    public com.anychart.scales.GeoTicks count(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s);", count));

        return this;
    }
    /**
     * Setter for ticks count value using two parameters.
<b>Note:</b> Final number of ticks can be greater than maximum (one more tick can be added).
     */
    public com.anychart.scales.GeoTicks count(Number minimumCount, Number maximumCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s, %s);", minimumCount, maximumCount));

        return this;
    }
    /**
     * Returns an array of ticks.<br/>
Each tick is a value in terms of data, to make a tick on.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or after <b>chart.draw()</b>
     */
    public void get() {
        APIlib.getInstance().addJSLine(jsBase + ".get();");
    }
    /**
     * Getter for ticks interval value.
<b>Note:</b> You can get interval value only if it was set explicitly, it returns NaN otherwise
     */
    public void interval() {
        APIlib.getInstance().addJSLine(jsBase + ".interval();");
    }
    /**
     * Setter for ticks interval value.
     */
    public com.anychart.scales.GeoTicks interval(Number interval) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s);", interval));

        return this;
    }
    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public com.anychart.scales.GeoTicks set(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s);", arrayToStringWrapQuotes(ticks)));

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

}