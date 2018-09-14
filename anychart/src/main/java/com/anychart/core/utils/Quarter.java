package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.ui.Background;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Quarter settings representation class.<br/>
{docs:Basic_Charts/Quadrant_Chart#quarters}Learn more about the quarters.{docs}
 */
public class Quarter extends Background {

    protected Quarter() {

    }

    public static Quarter instantiate() {
        return new Quarter("new anychart.core.utils.quarter()");
    }

    

    public Quarter(String jsChart) {
        jsBase = "quarter" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the bottom stroke.
     */
    public void bottomStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".bottomStroke();");
    }
    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.ColoredFill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bottom stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter bottomStroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for bottom stroke settings.
     */
    public com.anychart.core.utils.Quarter bottomStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottomStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the corner type.
     */
    public void cornerType() {
        APIlib.getInstance().addJSLine(jsBase + ".cornerType();");
    }
    /**
     * Setter for the corner type.
     */
    public com.anychart.core.utils.Quarter cornerType(com.anychart.enums.BackgroundCornersType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornerType(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the corner type.
     */
    public com.anychart.core.utils.Quarter cornerType(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornerType(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the corner radius.
     */
    public void corners() {
        APIlib.getInstance().addJSLine(jsBase + ".corners();");
    }
    /**
     * Setter for the corner radius by one value.
     */
    public com.anychart.core.utils.Quarter corners(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s);", value));

        return this;
    }
    /**
     * Setter for the corner radius by one value.
     */
    public com.anychart.core.utils.Quarter corners(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the corner radius by one value.
     */
    public com.anychart.core.utils.Quarter corners(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, Number topRight, Number bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, topRight, bottomRight, bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, Number topRight, Number bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, topRight, bottomRight, wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, Number topRight, String bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, topRight, wrapQuotes(bottomRight), bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, Number topRight, String bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, topRight, wrapQuotes(bottomRight), wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, String topRight, Number bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, wrapQuotes(topRight), bottomRight, bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, String topRight, Number bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, wrapQuotes(topRight), bottomRight, wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, String topRight, String bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, wrapQuotes(topRight), wrapQuotes(bottomRight), bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(Number topLeft, String topRight, String bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft, wrapQuotes(topRight), wrapQuotes(bottomRight), wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, Number topRight, Number bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), topRight, bottomRight, bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, Number topRight, Number bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), topRight, bottomRight, wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, Number topRight, String bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), topRight, wrapQuotes(bottomRight), bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, Number topRight, String bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), topRight, wrapQuotes(bottomRight), wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, String topRight, Number bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), wrapQuotes(topRight), bottomRight, bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, String topRight, Number bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), wrapQuotes(topRight), bottomRight, wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, String topRight, String bottomRight, Number bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), wrapQuotes(topRight), wrapQuotes(bottomRight), bottomLeft));

        return this;
    }
    /**
     * Setter for the corner radius by each value.
     */
    public com.anychart.core.utils.Quarter corners(String topLeft, String topRight, String bottomRight, String bottomLeft) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", wrapQuotes(topLeft), wrapQuotes(topRight), wrapQuotes(bottomRight), wrapQuotes(bottomLeft)));

        return this;
    }
    /**
     * Getter for the background fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an object or a string.<br/>
Accepts:
<ul>
<li>{@link anychart.graphics.vector.LinearGradientFill}</li>
<li>{@link anychart.graphics.vector.RadialGradientFill}</li>
<li>{@link anychart.graphics.vector.Fill}</li>
<li>{@link anychart.graphics.vector.ImageFill}</li>
</ul>
or a color as a string, along with opacity, if needed, format is "<b>Color Opacity</b>",
e.g. "red 0.5".
     */
    public com.anychart.core.utils.Quarter fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill as a color with opacity.
     */
    public com.anychart.core.utils.Quarter fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
     */
    public com.anychart.core.utils.Quarter fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for quarter label.
     */
    public com.anychart.core.ui.Label label(String index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", wrapQuotes(index)));
    }
    /**
     * Getter for quarter label.
     */
    public com.anychart.core.ui.Label label(Number index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", index));
    }
    /**
     * Setter for quarter label.
     */
    public com.anychart.core.Chart label(Boolean value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".label(%s)", value));
    }
    /**
     * Setter for quarter label.
     */
    public com.anychart.core.Chart label(String index, Boolean value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".label(%s, %s)", wrapQuotes(index), value));
    }
    /**
     * Setter for quarter label.
     */
    public com.anychart.core.Chart label(String index, String value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".label(%s, %s)", wrapQuotes(index), wrapQuotes(value)));
    }
    /**
     * Setter for quarter label.
     */
    public com.anychart.core.Chart label(Number index, Boolean value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".label(%s, %s)", index, value));
    }
    /**
     * Setter for quarter label.
     */
    public com.anychart.core.Chart label(Number index, String value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".label(%s, %s)", index, wrapQuotes(value)));
    }
    /**
     * Getter for the left stroke.
     */
    public void leftStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".leftStroke();");
    }
    /**
     * Setter for left stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter leftStroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for left stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter leftStroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for left stroke settings.
     */
    public com.anychart.core.utils.Quarter leftStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".leftStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the quarter margin.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public com.anychart.core.utils.Quarter margin(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public com.anychart.core.utils.Quarter margin(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public com.anychart.core.utils.Quarter margin(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public com.anychart.core.utils.Quarter margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the quarter padding.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public com.anychart.core.Chart padding(Number[] value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s)", Arrays.toString(value)));
    }
    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public com.anychart.core.Chart padding(String[] value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s)", arrayToStringWrapQuotes(value)));
    }
    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public com.anychart.core.Chart padding(String value) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s)", wrapQuotes(value)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, String value2, String value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, String value2, String value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, String value2, Number value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, String value2, Number value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), wrapQuotes(value2), value3, value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, Number value2, String value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, Number value2, String value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), value2, wrapQuotes(value3), value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, Number value2, Number value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(String value1, Number value2, Number value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", wrapQuotes(value1), value2, value3, value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, String value2, String value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, String value2, String value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, wrapQuotes(value2), wrapQuotes(value3), value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, String value2, Number value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, String value2, Number value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, wrapQuotes(value2), value3, value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, Number value2, String value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, Number value2, String value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, value2, wrapQuotes(value3), value4));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, Number value2, Number value3, String value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, value2, value3, wrapQuotes(value4)));
    }
    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public com.anychart.core.Chart padding(Number value1, Number value2, Number value3, Number value4) {
        return new com.anychart.core.Chart(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s)", value1, value2, value3, value4));
    }
    /**
     * Getter for the right stroke.
     */
    public void rightStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".rightStroke();");
    }
    /**
     * Setter for right stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for right stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.ColoredFill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for right stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter rightStroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for right stroke settings.
     */
    public com.anychart.core.utils.Quarter rightStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rightStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the background stroke.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.ColoredFill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for stroke settings.
     */
    public com.anychart.core.utils.Quarter stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the title.
     */
    public com.anychart.core.utils.Quarter title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for the title.
     */
    public com.anychart.core.utils.Quarter title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the top stroke.
     */
    public void topStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".topStroke();");
    }
    /**
     * Setter for top stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for top stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.ColoredFill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for top stroke settings using one parameter.
     */
    public com.anychart.core.utils.Quarter topStroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for top stroke settings.
     */
    public com.anychart.core.utils.Quarter topStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".topStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for element bottom bound settings.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.utils.Quarter bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.utils.Quarter bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element bounds settings.
     */
    public com.anychart.core.utils.Bounds bounds() {
        return new com.anychart.core.utils.Bounds(jsBase + ".bounds()");
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.utils.Quarter bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.utils.Quarter bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.utils.Quarter bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.utils.Quarter bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

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
    public com.anychart.core.utils.Quarter enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Getter for element height settings.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.utils.Quarter height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.utils.Quarter height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element left bound settings.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.utils.Quarter left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.utils.Quarter left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.utils.Quarter maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.utils.Quarter maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum width.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.utils.Quarter maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.utils.Quarter maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.utils.Quarter minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.utils.Quarter minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum width.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.utils.Quarter minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.utils.Quarter minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

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
    /**
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.utils.Quarter right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.utils.Quarter right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for element top bound settings.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.utils.Quarter top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.utils.Quarter top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

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
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.utils.Quarter width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.utils.Quarter width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

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
    public com.anychart.core.utils.Quarter zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}