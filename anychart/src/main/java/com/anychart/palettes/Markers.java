package com.anychart.palettes;

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
 * Marker palette class.
 */
public class Markers extends Base {

    protected Markers() {

    }

    public static Markers instantiate() {
        return new Markers("new anychart.palettes.markers()");
    }

    

    public Markers(String jsChart) {
        jsBase = "markers" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for type palette markers from list by index.
     */
    public void itemAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s);", index));
    }
    /**
     * Setter for type palette markers from list by index.
     */
    public com.anychart.palettes.Markers itemAt(Number index, com.anychart.enums.MarkerType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for type palette markers from list by index.
     */
    public com.anychart.palettes.Markers itemAt(Number index, com.anychart.enums.BulletMarkerType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for type palette markers from list by index.
     */
    public com.anychart.palettes.Markers itemAt(Number index, String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for markers list of palette.
     */
    public void items() {
        APIlib.getInstance().addJSLine(jsBase + ".items();");
    }
    /**
     * Setter for markers list of palette.
     */
    public com.anychart.palettes.Markers items(String[] type, String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToStringWrapQuotes(type), wrapQuotes(var_args)));

        return this;
    }
    /**
     * Setter for markers list of palette.
     */
    public com.anychart.palettes.Markers items(String type, String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", wrapQuotes(type), wrapQuotes(var_args)));

        return this;
    }
    /**
     * Setter for markers list of palette.
     */
    public com.anychart.palettes.Markers items(com.anychart.enums.MarkerType type, String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (type != null) ? type.getJsBase() : null, wrapQuotes(var_args)));

        return this;
    }
    /**
     * Setter for markers list of palette.
     */
    public com.anychart.palettes.Markers items(com.anychart.enums.BulletMarkerType type, String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (type != null) ? type.getJsBase() : null, wrapQuotes(var_args)));

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