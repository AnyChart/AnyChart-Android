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
 * The GanttDateTime class contains methods for configuring DateTime scale on the Gantt chart.
 */
public class GanttDateTime extends Base {

    protected GanttDateTime() {

    }

    public static GanttDateTime instantiate() {
        return new GanttDateTime("new anychart.scales.ganttDateTime()");
    }

    

    public GanttDateTime(String jsChart) {
        jsBase = "ganttDateTime" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Gets minimum and maximum visible dates set for a scale.
     */
    public void getRange() {
        APIlib.getInstance().addJSLine(jsBase + ".getRange();");
    }
    /**
     * Gets total minimum and maximum dates set for a scale.
     */
    public void getTotalRange() {
        APIlib.getInstance().addJSLine(jsBase + ".getTotalRange();");
    }
    /**
     * Processes reverse transformation of the ratio backward to value.
     */
    public void inverseTransform(Number ratio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
    }
    /**
     * Getter for the scale maximum.
     */
    public void maximum() {
        APIlib.getInstance().addJSLine(jsBase + ".maximum();");
    }
    /**
     * Setter for the scale maximum.
     */
    public com.anychart.scales.GanttDateTime maximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the maximum gap.
     */
    public void maximumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumGap();");
    }
    /**
     * Setter for the maximum gap.
     */
    public com.anychart.scales.GanttDateTime maximumGap(Number gap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximumGap(%s);", gap));

        return this;
    }
    /**
     * Getter for the scale minimum.
     */
    public void minimum() {
        APIlib.getInstance().addJSLine(jsBase + ".minimum();");
    }
    /**
     * Setter for the scale minimum.
     */
    public com.anychart.scales.GanttDateTime minimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimum(%s);", minimum));

        return this;
    }
    /**
     * Getter for the minimum gap.
     */
    public void minimumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumGap();");
    }
    /**
     * Setter for the minimum gap.
     */
    public com.anychart.scales.GanttDateTime minimumGap(Number gap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimumGap(%s);", gap));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the scale soft maximum.
     */
    public void softMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMaximum();");
    }
    /**
     * Setter for the scale soft maximum.
     */
    public com.anychart.scales.GanttDateTime softMaximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".softMaximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the scale soft minimum.
     */
    public void softMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMinimum();");
    }
    /**
     * Setter for the scale soft minimum.
     */
    public com.anychart.scales.GanttDateTime softMinimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".softMinimum(%s);", minimum));

        return this;
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
     * Getter for zoom levels settings.
     */
    public void zoomLevels() {
        APIlib.getInstance().addJSLine(jsBase + ".zoomLevels();");
    }

}