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
 * The OrdinalTicks class contains methods for configuring ticks on the Ordinal scale.
 */
public class OrdinalTicks extends Base {

    protected OrdinalTicks() {

    }

    public static OrdinalTicks instantiate() {
        return new OrdinalTicks("new anychart.scales.ordinalTicks()");
    }

    

    public OrdinalTicks(String jsChart) {
        jsBase = "ordinalTicks" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns an array of ticks. Each tick can be:<br/>
<ol>
   <li> A value in terms of data, to make a tick on.</li>
   <li> An array of two values to make the tick from the first one to the second one.</li>
</ol>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or after <b>chart.draw()</b>.
     */
    public void get() {
        APIlib.getInstance().addJSLine(jsBase + ".get();");
    }
    /**
     * Getter for ticks interval value.
     */
    public void interval() {
        APIlib.getInstance().addJSLine(jsBase + ".interval();");
    }
    /**
     * Setter for ticks interval value.<br/>
Passed value is rounded and defaults to 1 in case of incorrect settings.
     */
    public com.anychart.scales.OrdinalTicks interval(Number interval) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s);", interval));

        return this;
    }
    /**
     * Getter for maximum ticks count.
     */
    public void maxCount() {
        APIlib.getInstance().addJSLine(jsBase + ".maxCount();");
    }
    /**
     * Setter for maximum ticks count.
     */
    public com.anychart.scales.OrdinalTicks maxCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxCount(%s);", count));

        return this;
    }
    /**
     * Getter for the tick names.
     */
    public void names() {
        APIlib.getInstance().addJSLine(jsBase + ".names();");
    }
    /**
     * Setter for the tick names.
     */
    public com.anychart.scales.OrdinalTicks names(String[] names) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".names(%s);", arrayToStringWrapQuotes(names)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public com.anychart.scales.OrdinalTicks set(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s);", arrayToStringWrapQuotes(ticks)));

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