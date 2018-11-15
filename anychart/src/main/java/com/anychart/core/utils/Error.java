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
 * Class representing series error.<br/>
{docs:Basic_Charts/Error_Chart/Overview}Learn more about error chart.{docs}
 */
public class Error extends Base {

    protected Error() {

    }

    public static Error instantiate() {
        return new Error("new anychart.core.utils.error()");
    }

    

    public Error(String jsChart) {
        jsBase = "error" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for error mode.
     */
    public void mode() {
        APIlib.getInstance().addJSLine(jsBase + ".mode();");
    }
    /**
     * Setter for error mode.<br/>
Error mode defines the rule to parse values for series with an error.
     */
    public com.anychart.core.utils.Error mode(com.anychart.enums.ErrorMode mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".mode(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for error mode.<br/>
Error mode defines the rule to parse values for series with an error.
     */
    public com.anychart.core.utils.Error mode(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".mode(%s);", wrapQuotes(mode)));

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
    /**
     * Getter for value error.
     */
    public void valueError() {
        APIlib.getInstance().addJSLine(jsBase + ".valueError();");
    }
    /**
     * Setter for value error.
     */
    public com.anychart.core.utils.Error valueError(String valueError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueError(%s);", wrapQuotes(valueError)));

        return this;
    }
    /**
     * Setter for value error.
     */
    public com.anychart.core.utils.Error valueError(Number valueError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueError(%s);", valueError));

        return this;
    }
    /**
     * Getter for value error stroke settings.
     */
    public void valueErrorStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".valueErrorStroke();");
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.Stroke strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(com.anychart.graphics.vector.ColoredFill strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(String strokeOrFill, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(String strokeOrFill, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(String strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for value error stroke settings.
     */
    public com.anychart.core.utils.Error valueErrorStroke(String strokeOrFill, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(strokeOrFill), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for value error width settings.
     */
    public void valueErrorWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".valueErrorWidth();");
    }
    /**
     * Setter for value error width settings. Length pins for value axis in pixels.
     */
    public com.anychart.core.utils.Error valueErrorWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueErrorWidth(%s);", width));

        return this;
    }
    /**
     * Getter for value lower error.
     */
    public void valueLowerError() {
        APIlib.getInstance().addJSLine(jsBase + ".valueLowerError();");
    }
    /**
     * Setter for value lower error.
     */
    public com.anychart.core.utils.Error valueLowerError(String valueLowerError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueLowerError(%s);", wrapQuotes(valueLowerError)));

        return this;
    }
    /**
     * Setter for value lower error.
     */
    public com.anychart.core.utils.Error valueLowerError(Number valueLowerError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueLowerError(%s);", valueLowerError));

        return this;
    }
    /**
     * Getter for value upper error.
     */
    public void valueUpperError() {
        APIlib.getInstance().addJSLine(jsBase + ".valueUpperError();");
    }
    /**
     * Setter for value upper error.
     */
    public com.anychart.core.utils.Error valueUpperError(String valueUpperError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueUpperError(%s);", wrapQuotes(valueUpperError)));

        return this;
    }
    /**
     * Setter for value upper error.
     */
    public com.anychart.core.utils.Error valueUpperError(Number valueUpperError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueUpperError(%s);", valueUpperError));

        return this;
    }
    /**
     * Getter for X error.
     */
    public void xError() {
        APIlib.getInstance().addJSLine(jsBase + ".xError();");
    }
    /**
     * Setter for X error.
     */
    public com.anychart.core.utils.Error xError(String xError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xError(%s);", wrapQuotes(xError)));

        return this;
    }
    /**
     * Setter for X error.
     */
    public com.anychart.core.utils.Error xError(Number xError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xError(%s);", xError));

        return this;
    }
    /**
     * Getter for X error stroke settings.
     */
    public void xErrorStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".xErrorStroke();");
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for X error stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.utils.Error xErrorStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for X error width settings.
     */
    public void xErrorWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".xErrorWidth();");
    }
    /**
     * Setter for X error width settings. Length pins for X axis in pixels.
     */
    public com.anychart.core.utils.Error xErrorWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xErrorWidth(%s);", width));

        return this;
    }
    /**
     * Getter for X lower error.
     */
    public void xLowerError() {
        APIlib.getInstance().addJSLine(jsBase + ".xLowerError();");
    }
    /**
     * Setter for X lower error.
     */
    public com.anychart.core.utils.Error xLowerError(String xLowerError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLowerError(%s);", wrapQuotes(xLowerError)));

        return this;
    }
    /**
     * Setter for X lower error.
     */
    public com.anychart.core.utils.Error xLowerError(Number xLowerError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLowerError(%s);", xLowerError));

        return this;
    }
    /**
     * Getter for X upper error.
     */
    public void xUpperError() {
        APIlib.getInstance().addJSLine(jsBase + ".xUpperError();");
    }
    /**
     * Setter for X upper error.
     */
    public com.anychart.core.utils.Error xUpperError(String xUpperError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xUpperError(%s);", wrapQuotes(xUpperError)));

        return this;
    }
    /**
     * Setter for X upper error.
     */
    public com.anychart.core.utils.Error xUpperError(Number xUpperError) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xUpperError(%s);", xUpperError));

        return this;
    }

}