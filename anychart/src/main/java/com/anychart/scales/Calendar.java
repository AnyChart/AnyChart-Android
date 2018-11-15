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
 * The Calendar class contains methods for configuring calendar in the Resource chart.
<b>Note:</b> To create instance use {@link anychart.scales#calendar} method.
 */
public class Calendar extends Base {

    protected Calendar() {

    }

    public static Calendar instantiate() {
        return new Calendar("new anychart.scales.calendar()");
    }

    

    public Calendar(String jsChart) {
        jsBase = "calendar" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the availabilities for the calendar.
     */
    public void availabilities() {
        APIlib.getInstance().addJSLine(jsBase + ".availabilities();");
    }
    /**
     * Setter for the availabilities for the calendar.
     */
    public com.anychart.scales.Calendar availabilities(com.anychart.scales.calendar.Availability[] availabilities) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".availabilities(%s);", arrayToString(availabilities)));

        return this;
    }
    /**
     * Gets the working time in passed datetime interval.
     */
    public void getWorkingSchedule(Number startDate, Number endDate, com.anychart.enums.Interval unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %s, %s, %s);", startDate, endDate, (unit != null) ? unit.getJsBase() : null, count));
    }
    /**
     * Gets the working time in passed datetime interval.
     */
    public void getWorkingSchedule(Number startDate, Number endDate, String unit, Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %s, %s, %s);", startDate, endDate, wrapQuotes(unit), count));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the timezone offset.
     */
    public void timezoneOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".timezoneOffset();");
    }
    /**
     * Setter for the timezone offset for the output availabilities.
     */
    public com.anychart.scales.Calendar timezoneOffset(Number var_offset) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".timezoneOffset(%s);", var_offset));

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
    /**
     * Getter for the regular weekend days.
     */
    public void weekendRange() {
        APIlib.getInstance().addJSLine(jsBase + ".weekendRange();");
    }
    /**
     * Setter for the regular weekend days.
     */
    public com.anychart.scales.Calendar weekendRange(Number[] var_range) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".weekendRange(%s);", Arrays.toString(var_range)));

        return this;
    }

}