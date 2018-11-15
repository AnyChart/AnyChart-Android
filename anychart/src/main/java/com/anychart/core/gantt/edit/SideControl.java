package com.anychart.core.gantt.edit;

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
 * Edit thumb class.
The SideControl class for editing the visual display the thumb and connector thumb.
Thumb allows to edit the start or end interval of a task.
The connector thumb allows creating a new connector for a task.
 */
public class SideControl extends Base {

    protected SideControl() {

    }

    public static SideControl instantiate() {
        return new SideControl("new anychart.core.gantt.edit.sideControl()");
    }

    

    public SideControl(String jsChart) {
        jsBase = "sideControl" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the connector thumb settings.
     */
    public com.anychart.core.gantt.edit.Thumb connectorThumb() {
        return new com.anychart.core.gantt.edit.Thumb(jsBase + ".connectorThumb()");
    }
    /**
     * Setter for the connector thumb settings.<br/>
The connector thumb is a circle on the task that allows creating connector from one task to another.
     */
    public com.anychart.core.gantt.edit.SideControl connectorThumb(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorThumb(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the thumb settings.
     */
    public com.anychart.core.gantt.edit.Thumb thumb() {
        return new com.anychart.core.gantt.edit.Thumb(jsBase + ".thumb()");
    }
    /**
     * Setter for the thumb settings.<br/>
Thumb is a rectangle on the task that allows editing the interval of the task.
     */
    public com.anychart.core.gantt.edit.SideControl thumb(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".thumb(%s);", wrapQuotes(settings)));

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