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
 * The DateTimeTicks class contains methods for configuring ticks on the DateTime scale.
 */
public class DateTimeTicks extends Base {

    protected DateTimeTicks() {

    }

    public static DateTimeTicks instantiate() {
        return new DateTimeTicks("new anychart.scales.dateTimeTicks()");
    }

    

    public DateTimeTicks(String jsChart) {
        jsBase = "dateTimeTicks" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for ticks count value.
     */
    public void count() {
        APIlib.getInstance().addJSLine(jsBase + ".count();");
    }
    /**
     * Setter for ticks count value.
     */
    public com.anychart.scales.DateTimeTicks count(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s);", count));

        return this;
    }
    /**
     * Returns an array of ticks. Each tick is a value in terms of data, to make a tick on.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or after <b>chart.draw()</b>
     */
    public void get() {
        APIlib.getInstance().addJSLine(jsBase + ".get();");
    }
    /**
     * Returns interval unit.<br/>
     */
    public void getIntervalUnit() {
        APIlib.getInstance().addJSLine(jsBase + ".getIntervalUnit();");
    }
    /**
     * Returns interval unit count.<br/>
     */
    public void getIntervalUnitCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getIntervalUnitCount();");
    }
    /**
     * Getter for ticks interval value.
<b>Note:</b> Interval value can get only if it was set explicitly, otherwise, it returns NaN.
     */
    public void interval() {
        APIlib.getInstance().addJSLine(jsBase + ".interval();");
    }
    /**
     * Setter for ticks interval value by a string representing date part or ISO 8601 interval string..
     */
    public com.anychart.scales.DateTimeTicks interval(String isoDate) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s);", wrapQuotes(isoDate)));

        return this;
    }
    /**
     * Setter for ticks interval value by the unit.
     */
    public com.anychart.scales.DateTimeTicks interval(com.anychart.enums.Interval unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s, %s);", (unit != null) ? unit.getJsBase() : null, count));

        return this;
    }
    /**
     * Setter for ticks interval value by the unit.
     */
    public com.anychart.scales.DateTimeTicks interval(String unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s, %s);", wrapQuotes(unit), count));

        return this;
    }
    /**
     * Setter for ticks interval value.
<b>Note:</b> If any passed value is defined but is not a number or less than 0, it defaults to NaN and count() resets to 5.
     */
    public com.anychart.scales.DateTimeTicks interval(Number years, Number months, Number days, Number hours, Number minutes, Number seconds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s, %s, %s, %s, %s, %s);", years, months, days, hours, minutes, seconds));

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
    public com.anychart.scales.DateTimeTicks set(String[] ticks) {
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