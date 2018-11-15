package com.anychart.core.stock;

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
 * Grouping settings class.
 */
public class Grouping extends Base {

    protected Grouping() {

    }

    public static Grouping instantiate() {
        return new Grouping("new anychart.core.stock.grouping()");
    }

    

    public Grouping(String jsChart) {
        jsBase = "grouping" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the current grouping enabled state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the grouping enabled state.
     */
    public com.anychart.core.stock.Grouping enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the current forced grouping settings.
     */
    public void forced() {
        APIlib.getInstance().addJSLine(jsBase + ".forced();");
    }
    /**
     * Setter for the forced grouping settings.
     */
    public com.anychart.core.stock.Grouping forced(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".forced(%s);", enabled));

        return this;
    }
    /**
     * Returns current grouping level.
     */
    public void getCurrentDataInterval() {
        APIlib.getInstance().addJSLine(jsBase + ".getCurrentDataInterval();");
    }
    /**
     * Whether the data is grouped.<br/>
     */
    public void isGrouped() {
        APIlib.getInstance().addJSLine(jsBase + ".isGrouped();");
    }
    /**
     * Getter for the data grouping levels.
     */
    public void levels() {
        APIlib.getInstance().addJSLine(jsBase + ".levels();");
    }
    /**
     * Setter for the data grouping levels.
     */
    public com.anychart.core.stock.Grouping levels(com.anychart.core.stock.grouping.Level levelsList) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".levels(%s);", (levelsList != null) ? levelsList.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the data grouping levels.
     */
    public com.anychart.core.stock.Grouping levels(String[] levelsList) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".levels(%s);", arrayToStringWrapQuotes(levelsList)));

        return this;
    }
    /**
     * Getter for the maximum visible points count.
     */
    public void maxVisiblePoints() {
        APIlib.getInstance().addJSLine(jsBase + ".maxVisiblePoints();");
    }
    /**
     * Setter for the maximum visible points count.
     */
    public com.anychart.core.stock.Grouping maxVisiblePoints(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxVisiblePoints(%s);", count));

        return this;
    }
    /**
     * Getter for the minimum pixels per point count.
     */
    public void minPixPerPoint() {
        APIlib.getInstance().addJSLine(jsBase + ".minPixPerPoint();");
    }
    /**
     * Setter for minimum pixels per point count.
     */
    public com.anychart.core.stock.Grouping minPixPerPoint(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPixPerPoint(%s);", count));

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