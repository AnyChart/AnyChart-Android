package com.anychart.core.utils;

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
 * Quarter settings class.
 */
public class QuarterSettings extends Base {

    protected QuarterSettings() {

    }

    public static QuarterSettings instantiate() {
        return new QuarterSettings("new anychart.core.utils.quarterSettings()");
    }

    

    public QuarterSettings(String jsChart) {
        jsBase = "quarterSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for left-bottom quarter.
     */
    public com.anychart.core.utils.Quarter leftBottom() {
        return new com.anychart.core.utils.Quarter(jsBase + ".leftBottom()");
    }
    /**
     * Setter for left-bottom quarter.
     */
    public com.anychart.core.utils.QuarterSettings leftBottom(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftBottom(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for left-top quarter.
     */
    public com.anychart.core.utils.Quarter leftTop() {
        return new com.anychart.core.utils.Quarter(jsBase + ".leftTop()");
    }
    /**
     * Setter for left-top quarter.
     */
    public com.anychart.core.utils.QuarterSettings leftTop(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftTop(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for right-bottom quarter.
     */
    public com.anychart.core.utils.Quarter rightBottom() {
        return new com.anychart.core.utils.Quarter(jsBase + ".rightBottom()");
    }
    /**
     * Setter for right-bottom quarter.
     */
    public com.anychart.core.utils.QuarterSettings rightBottom(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightBottom(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for right-top quarter.
     */
    public com.anychart.core.utils.Quarter rightTop() {
        return new com.anychart.core.utils.Quarter(jsBase + ".rightTop()");
    }
    /**
     * Setter for right-top quarter.
     */
    public com.anychart.core.utils.QuarterSettings rightTop(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightTop(%s);", wrapQuotes(settings)));

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