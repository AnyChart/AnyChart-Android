package com.anychart.core.series;

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
 * Custom drawing series settings.<br/>
RenderingSettings class is a set of methods for overriding series drawing method.<br/>
The class allows overriding standard drawing functions.<br/>
To get a rendering object, use the rendering() method of the series which drawing you want to override.
 */
public class RenderingSettings extends Base {

    protected RenderingSettings() {

    }

    public static RenderingSettings instantiate() {
        return new RenderingSettings("new anychart.core.series.renderingSettings()");
    }

    

    public RenderingSettings(String jsChart) {
        jsBase = "renderingSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the finish.
     */
    public void finish() {
        APIlib.getInstance().addJSLine(jsBase + ".finish();");
    }
    /**
     * Setter for the finish.
     */
    public com.anychart.core.series.RenderingSettings finish(String finishFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".finish(%s);", wrapQuotes(finishFunction)));

        return this;
    }
    /**
     * Getter for points width.
     */
    public void needsWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".needsWidth();");
    }
    /**
     * Setter for points width.
     */
    public com.anychart.core.series.RenderingSettings needsWidth(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".needsWidth(%s);", enabled));

        return this;
    }
    /**
     * Getter for zero value.
     */
    public void needsZero() {
        APIlib.getInstance().addJSLine(jsBase + ".needsZero();");
    }
    /**
     * Setter for zero value.
     */
    public com.anychart.core.series.RenderingSettings needsZero(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".needsZero(%s);", enabled));

        return this;
    }
    /**
     * Getter for the point.
     */
    public void point() {
        APIlib.getInstance().addJSLine(jsBase + ".point();");
    }
    /**
     * Setter for the point.
     */
    public com.anychart.core.series.RenderingSettings point(String pointFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".point(%s);", wrapQuotes(pointFunction)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for shapes settings.
     */
    public void shapes() {
        APIlib.getInstance().addJSLine(jsBase + ".shapes();");
    }
    /**
     * Getter for the start.
     */
    public void start() {
        APIlib.getInstance().addJSLine(jsBase + ".start();");
    }
    /**
     * Setter for the start.
     */
    public com.anychart.core.series.RenderingSettings start(String startFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".start(%s);", wrapQuotes(startFunction)));

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
     * Getter for the update of a point.
     */
    public void updatePoint() {
        APIlib.getInstance().addJSLine(jsBase + ".updatePoint();");
    }
    /**
     * Setter for the update of a point.
Change the point shape when the state changes.
     */
    public com.anychart.core.series.RenderingSettings updatePoint(String pointFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".updatePoint(%s);", wrapQuotes(pointFunction)));

        return this;
    }
    /**
     * Getter for YScale values.
     */
    public void yValues() {
        APIlib.getInstance().addJSLine(jsBase + ".yValues();");
    }
    /**
     * Setter for YScale values.
     */
    public com.anychart.core.series.RenderingSettings yValues(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yValues(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }

}