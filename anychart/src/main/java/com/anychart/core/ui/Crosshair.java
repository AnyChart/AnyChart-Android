package com.anychart.core.ui;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.VisualBase;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Crosshair class.
 */
public class Crosshair extends VisualBase {

    protected Crosshair() {

    }

    public static Crosshair instantiate() {
        return new Crosshair("new anychart.core.ui.crosshair()");
    }

    

    public Crosshair(String jsChart) {
        jsBase = "crosshair" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the crosshair display mode.
     */
    public void displayMode() {
        APIlib.getInstance().addJSLine(jsBase + ".displayMode();");
    }
    /**
     * Setter for the display mode for crosshair.
     */
    public com.anychart.core.ui.Crosshair displayMode(com.anychart.enums.CrosshairDisplayMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".displayMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the display mode for crosshair.
     */
    public com.anychart.core.ui.Crosshair displayMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".displayMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.core.ui.Crosshair enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
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
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for the crosshair X-label settings.
     */
    public com.anychart.core.ui.CrosshairLabel xLabel(Number index) {
        return new com.anychart.core.ui.CrosshairLabel(String.format(Locale.US, jsBase + ".xLabel(%s)", index));
    }
    /**
     * Setter for the crosshair X-label settings.
     */
    public com.anychart.core.ui.Crosshair xLabel(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLabel(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair X-label settings.
     */
    public com.anychart.core.ui.Crosshair xLabel(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLabel(%s);", value));

        return this;
    }
    /**
     * Setter for the crosshair X-label settings by index.
     */
    public com.anychart.core.ui.Crosshair xLabel(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLabel(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair X-label settings by index.
     */
    public com.anychart.core.ui.Crosshair xLabel(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xLabel(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the X-line stroke.
     */
    public void xStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".xStroke();");
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the X-line stroke.
     */
    public com.anychart.core.ui.Crosshair xStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the crosshair Y-label settings.
     */
    public com.anychart.core.ui.CrosshairLabel yLabel(Number index) {
        return new com.anychart.core.ui.CrosshairLabel(String.format(Locale.US, jsBase + ".yLabel(%s)", index));
    }
    /**
     * Setter for the crosshair Y-label settings.
     */
    public com.anychart.core.ui.Crosshair yLabel(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yLabel(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair Y-label settings.
     */
    public com.anychart.core.ui.Crosshair yLabel(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yLabel(%s);", value));

        return this;
    }
    /**
     * Setter for the crosshair Y-label settings by index.
     */
    public com.anychart.core.ui.Crosshair yLabel(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yLabel(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair Y-label settings by index.
     */
    public com.anychart.core.ui.Crosshair yLabel(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yLabel(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the Y-line stroke.
     */
    public void yStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".yStroke();");
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the Y-line stroke.
     */
    public com.anychart.core.ui.Crosshair yStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.ui.Crosshair zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}