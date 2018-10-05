package com.anychart.core.ui;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class for the Gantt chart timeline.
 */
public class Timeline extends JsObject {

    protected Timeline() {

    }

    public static Timeline instantiate() {
        return new Timeline("new anychart.core.ui.timeline()");
    }

    

    public Timeline(String jsChart) {
        jsBase = "timeline" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the background fill.
     */
    public void backgroundFill() {
        APIlib.getInstance().addJSLine(jsBase + ".backgroundFill();");
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Fill color with opacity.
     */
    public com.anychart.core.ui.Timeline backgroundFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline backgroundFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".backgroundFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void baseBarAnchor() {
        APIlib.getInstance().addJSLine(jsBase + ".baseBarAnchor();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarAnchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarAnchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarAnchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarAnchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void baseBarHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".baseBarHeight();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarHeight(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void baseBarOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".baseBarOffset();");
    }
    /**
     * Setter for the base bar offset.
     */
    public com.anychart.core.ui.Timeline baseBarOffset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarOffset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the base bar offset.
     */
    public com.anychart.core.ui.Timeline baseBarOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void baseBarPosition() {
        APIlib.getInstance().addJSLine(jsBase + ".baseBarPosition();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarPosition(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarPosition(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseBarPosition(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseBarPosition(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void baseFill() {
        APIlib.getInstance().addJSLine(jsBase + ".baseFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory baseLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".baseLabels()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseLabels(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void baseStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".baseStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baseStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void baselineAbove() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineAbove();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineAbove(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineAbove(%s);", value));

        return this;
    }
    /**
     * Getter for the baseline bar anchor.
     */
    public void baselineBarAnchor() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineBarAnchor();");
    }
    /**
     * Setter for the baseline bar anchor.
     */
    public com.anychart.core.ui.Timeline baselineBarAnchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarAnchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the baseline bar anchor.
     */
    public com.anychart.core.ui.Timeline baselineBarAnchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarAnchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the baseline bar height.
     */
    public void baselineBarHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineBarHeight();");
    }
    /**
     * Setter for the baseline bar height.
     */
    public com.anychart.core.ui.Timeline baselineBarHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the baseline bar height.
     */
    public com.anychart.core.ui.Timeline baselineBarHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarHeight(%s);", value));

        return this;
    }
    /**
     * Getter for the baseline bar offset.
     */
    public void baselineBarOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineBarOffset();");
    }
    /**
     * Setter for the baseline bar offset.
     */
    public com.anychart.core.ui.Timeline baselineBarOffset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarOffset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the baseline bar offset.
     */
    public com.anychart.core.ui.Timeline baselineBarOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarOffset(%s);", value));

        return this;
    }
    /**
     * Getter for the baseline bar position.
     */
    public void baselineBarPosition() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineBarPosition();");
    }
    /**
     * Setter for the baseline bar position.
     */
    public com.anychart.core.ui.Timeline baselineBarPosition(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarPosition(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the baseline bar position.
     */
    public com.anychart.core.ui.Timeline baselineBarPosition(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineBarPosition(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void baselineFill() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory baselineLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".baselineLabels()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineLabels(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void baselineStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".baselineStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline baselineStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselineStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for baselines.
     */
    public com.anychart.core.gantt.elements.BaselinesElement baselines() {
        return new com.anychart.core.gantt.elements.BaselinesElement(jsBase + ".baselines()");
    }
    /**
     * Setter for baselines.
     */
    public com.anychart.core.ui.Timeline baselines(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baselines(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the column stroke.
     */
    public void columnStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".columnStroke();");
    }
    /**
     * Setter for the column stroke.
     */
    public com.anychart.core.ui.Timeline columnStroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".columnStroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the column stroke.
     */
    public com.anychart.core.ui.Timeline columnStroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".columnStroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void connectorFill() {
        APIlib.getInstance().addJSLine(jsBase + ".connectorFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorFill(com.anychart.graphics.vector.Fill value, Number cx, Number cy, com.anychart.graphics.math.Rect opacityOrMode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorFill(%s, %s, %s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, cx, cy, (opacityOrMode != null) ? opacityOrMode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorFill(com.anychart.graphics.vector.GradientKey value, Number cx, Number cy, com.anychart.graphics.math.Rect opacityOrMode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorFill(%s, %s, %s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, cx, cy, (opacityOrMode != null) ? opacityOrMode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorFill(String[] value, Number cx, Number cy, com.anychart.graphics.math.Rect opacityOrMode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(value), cx, cy, (opacityOrMode != null) ? opacityOrMode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void connectorPreviewStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".connectorPreviewStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorPreviewStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void connectorStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".connectorStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline connectorStroke(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectorStroke(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for connectors.
     */
    public com.anychart.core.gantt.elements.ConnectorElement connectors() {
        return new com.anychart.core.gantt.elements.ConnectorElement(jsBase + ".connectors()");
    }
    /**
     * Setter for connectors.
     */
    public com.anychart.core.ui.Timeline connectors(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connectors(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for live edit settings.
     */
    public com.anychart.core.gantt.edit.StructureEdit edit() {
        return new com.anychart.core.gantt.edit.StructureEdit(jsBase + ".edit()");
    }
    /**
     * Setter for live edit settings.
{docs:Gantt_Chart/Live_Edit_UI_and_API}Learn more about Live editing.{docs}
     */
    public com.anychart.core.ui.Timeline edit(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".edit(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for live edit settings.
{docs:Gantt_Chart/Live_Edit_UI_and_API}Learn more about Live editing.{docs}
     */
    public com.anychart.core.ui.Timeline edit(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".edit(%s);", settings));

        return this;
    }
    /**
     * 
     */
    public void editConnectorThumbFill() {
        APIlib.getInstance().addJSLine(jsBase + ".editConnectorThumbFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void editConnectorThumbStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editConnectorThumbStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editConnectorThumbStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editConnectorThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editFinishConnectorMarkerHorizontalOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".editFinishConnectorMarkerHorizontalOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editFinishConnectorMarkerHorizontalOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerHorizontalOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editFinishConnectorMarkerSize() {
        APIlib.getInstance().addJSLine(jsBase + ".editFinishConnectorMarkerSize();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editFinishConnectorMarkerSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerSize(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editFinishConnectorMarkerType() {
        APIlib.getInstance().addJSLine(jsBase + ".editFinishConnectorMarkerType();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editFinishConnectorMarkerType(com.anychart.enums.MarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editFinishConnectorMarkerType(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerType(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void editFinishConnectorMarkerVerticalOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".editFinishConnectorMarkerVerticalOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editFinishConnectorMarkerVerticalOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editFinishConnectorMarkerVerticalOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editIntervalThumbFill() {
        APIlib.getInstance().addJSLine(jsBase + ".editIntervalThumbFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void editIntervalThumbStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editIntervalThumbStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalThumbStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalThumbStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editIntervalWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".editIntervalWidth();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editIntervalWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editIntervalWidth(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editPreviewFill() {
        APIlib.getInstance().addJSLine(jsBase + ".editPreviewFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void editPreviewStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editPreviewStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editPreviewStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editPreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editProgressFill() {
        APIlib.getInstance().addJSLine(jsBase + ".editProgressFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void editProgressStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editProgressStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editProgressStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editProgressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editStartConnectorMarkerHorizontalOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".editStartConnectorMarkerHorizontalOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStartConnectorMarkerHorizontalOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStartConnectorMarkerHorizontalOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editStartConnectorMarkerSize() {
        APIlib.getInstance().addJSLine(jsBase + ".editStartConnectorMarkerSize();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStartConnectorMarkerSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStartConnectorMarkerSize(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editStartConnectorMarkerType() {
        APIlib.getInstance().addJSLine(jsBase + ".editStartConnectorMarkerType();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStartConnectorMarkerType(com.anychart.enums.MarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStartConnectorMarkerType(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStartConnectorMarkerType(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void editStartConnectorMarkerVerticalOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".editStartConnectorMarkerVerticalOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStartConnectorMarkerVerticalOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStartConnectorMarkerVerticalOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void editStructurePreviewDashStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editStructurePreviewDashStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewDashStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewDashStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editStructurePreviewFill() {
        APIlib.getInstance().addJSLine(jsBase + ".editStructurePreviewFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void editStructurePreviewStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".editStructurePreviewStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editStructurePreviewStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editStructurePreviewStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void editing() {
        APIlib.getInstance().addJSLine(jsBase + ".editing();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline editing(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".editing(%s);", value));

        return this;
    }
    /**
     * Getter for elements.
     */
    public com.anychart.core.gantt.elements.TimelineElement elements() {
        return new com.anychart.core.gantt.elements.TimelineElement(jsBase + ".elements()");
    }
    /**
     * Setter for elements.
     */
    public com.anychart.core.ui.Timeline elements(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".elements(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for grouping tasks.
     */
    public com.anychart.core.gantt.elements.GroupingTasksElement groupingTasks() {
        return new com.anychart.core.gantt.elements.GroupingTasksElement(jsBase + ".groupingTasks()");
    }
    /**
     * Setter for grouping tasks.
     */
    public com.anychart.core.ui.Timeline groupingTasks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".groupingTasks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the timeline header.
     */
    public com.anychart.core.gantt.TimeLineHeader header() {
        return new com.anychart.core.gantt.TimeLineHeader(jsBase + ".header()");
    }
    /**
     * Setter for the timeline header.
     */
    public com.anychart.core.ui.Timeline header(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".header(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the horizontal scroll bar.
     */
    public com.anychart.core.ui.ScrollBar horizontalScrollBar() {
        return new com.anychart.core.ui.ScrollBar(jsBase + ".horizontalScrollBar()");
    }
    /**
     * Setter for the horizontal scroll bar.
     */
    public com.anychart.core.ui.Timeline horizontalScrollBar(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".horizontalScrollBar(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the labels factory.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for the labels factory.
     */
    public com.anychart.core.ui.Timeline labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the line marker.
     */
    public com.anychart.core.axismarkers.GanttLine lineMarker(Number index) {
        return new com.anychart.core.axismarkers.GanttLine(String.format(Locale.US, jsBase + ".lineMarker(%s)", index));
    }
    /**
     * Setter for the line marker.
     */
    public com.anychart.core.ui.Timeline lineMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the line marker.
     */
    public com.anychart.core.ui.Timeline lineMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", value));

        return this;
    }
    /**
     * Setter for the line marker by index.
     */
    public com.anychart.core.ui.Timeline lineMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the line marker by index.
     */
    public com.anychart.core.ui.Timeline lineMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the line marker by index.
     */
    public com.anychart.core.ui.Timeline lineMarker(Number index, com.anychart.enums.GanttDateTimeMarkers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the markers factory.
     */
    public com.anychart.core.ui.MarkersFactory markers() {
        return new com.anychart.core.ui.MarkersFactory(jsBase + ".markers()");
    }
    /**
     * Setter for the markers factory.
     */
    public com.anychart.core.ui.Timeline markers(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markers(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void maximumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumGap();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline maximumGap(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximumGap(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void milestoneAnchor() {
        APIlib.getInstance().addJSLine(jsBase + ".milestoneAnchor();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneAnchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneAnchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneAnchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneAnchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void milestoneFill() {
        APIlib.getInstance().addJSLine(jsBase + ".milestoneFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void milestoneHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".milestoneHeight();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneHeight(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory milestoneLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".milestoneLabels()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneLabels(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void milestoneOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".milestoneOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneOffset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneOffset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void milestonePosition() {
        APIlib.getInstance().addJSLine(jsBase + ".milestonePosition();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestonePosition(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestonePosition(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestonePosition(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestonePosition(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void milestoneStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".milestoneStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline milestoneStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestoneStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for milestones.
     */
    public com.anychart.core.gantt.elements.MilestonesElement milestones() {
        return new com.anychart.core.gantt.elements.MilestonesElement(jsBase + ".milestones()");
    }
    /**
     * Setter for milestones.
     */
    public com.anychart.core.ui.Timeline milestones(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".milestones(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * 
     */
    public void minimumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumGap();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline minimumGap(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimumGap(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void parentBarAnchor() {
        APIlib.getInstance().addJSLine(jsBase + ".parentBarAnchor();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarAnchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarAnchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarAnchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarAnchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void parentBarHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".parentBarHeight();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarHeight(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void parentBarOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".parentBarOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarOffset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarOffset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void parentBarPosition() {
        APIlib.getInstance().addJSLine(jsBase + ".parentBarPosition();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarPosition(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarPosition(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentBarPosition(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBarPosition(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void parentFill() {
        APIlib.getInstance().addJSLine(jsBase + ".parentFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory parentLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".parentLabels()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentLabels(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void parentStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".parentStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline parentStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for periods.
     */
    public com.anychart.core.gantt.elements.PeriodsElement periods() {
        return new com.anychart.core.gantt.elements.PeriodsElement(jsBase + ".periods()");
    }
    /**
     * Setter for periods.
     */
    public com.anychart.core.ui.Timeline periods(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".periods(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * 
     */
    public void progressBarAnchor() {
        APIlib.getInstance().addJSLine(jsBase + ".progressBarAnchor();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarAnchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarAnchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarAnchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarAnchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void progressBarHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".progressBarHeight();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarHeight(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void progressBarOffset() {
        APIlib.getInstance().addJSLine(jsBase + ".progressBarOffset();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarOffset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarOffset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarOffset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarOffset(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void progressBarPosition() {
        APIlib.getInstance().addJSLine(jsBase + ".progressBarPosition();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarPosition(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarPosition(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressBarPosition(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressBarPosition(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void progressFill() {
        APIlib.getInstance().addJSLine(jsBase + ".progressFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory progressLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".progressLabels()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressLabels(%s);", value));

        return this;
    }
    /**
     * 
     */
    public void progressStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".progressStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline progressStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".progressStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the range marker.
     */
    public com.anychart.core.axismarkers.GanttRange rangeMarker(Number index) {
        return new com.anychart.core.axismarkers.GanttRange(String.format(Locale.US, jsBase + ".rangeMarker(%s)", index));
    }
    /**
     * Setter for the range marker.
     */
    public com.anychart.core.ui.Timeline rangeMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the range marker.
     */
    public com.anychart.core.ui.Timeline rangeMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", value));

        return this;
    }
    /**
     * Setter for the range marker by index.
     */
    public com.anychart.core.ui.Timeline rangeMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the range marker by index.
     */
    public com.anychart.core.ui.Timeline rangeMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the range marker by index.
     */
    public com.anychart.core.ui.Timeline rangeMarker(Number index, com.anychart.enums.GanttDateTimeMarkers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the row even fill.
     */
    public void rowEvenFill() {
        APIlib.getInstance().addJSLine(jsBase + ".rowEvenFill();");
    }
    /**
     * Setter for row even fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row even fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row even fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowEvenFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the row fill.
     */
    public void rowFill() {
        APIlib.getInstance().addJSLine(jsBase + ".rowFill();");
    }
    /**
     * Setter for row fill settings using an array, an object or a string. Resets odd fill and even fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row fill settings using an array, an object or a string. Resets odd fill and even fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.GradientKey value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row fill settings using an array, an object or a string. Resets odd fill and even fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.ui.Timeline rowFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the row hover fill.
     */
    public void rowHoverFill() {
        APIlib.getInstance().addJSLine(jsBase + ".rowHoverFill();");
    }
    /**
     * Setter for row hover fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row hover fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.GradientKey value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row hover fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowHoverFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowHoverFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the row odd fill.
     */
    public void rowOddFill() {
        APIlib.getInstance().addJSLine(jsBase + ".rowOddFill();");
    }
    /**
     * Setter for row odd fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row odd fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.GradientKey value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row odd fill settings using an object, an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.ui.Timeline rowOddFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowOddFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for row fill in selected mode.
     */
    public void rowSelectedFill() {
        APIlib.getInstance().addJSLine(jsBase + ".rowSelectedFill();");
    }
    /**
     * Setter for row fill settings in selected mode using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row fill settings in selected mode using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for row fill settings in selected mode using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Fill color in selected mode with opacity. Fill as a string or an object.
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode)));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String[] keys, Number angle, Boolean mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String[] keys, Number angle, String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode)));

        return this;
    }
    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.ui.Timeline rowSelectedFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rowSelectedFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the timeline scale.
     */
    public com.anychart.scales.GanttDateTime scale() {
        return new com.anychart.scales.GanttDateTime(jsBase + ".scale()");
    }
    /**
     * Setter for the timeline scale.
     */
    public com.anychart.core.ui.Timeline scale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void selectedConnectorStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".selectedConnectorStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedConnectorStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedConnectorStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public void selectedElementFill() {
        APIlib.getInstance().addJSLine(jsBase + ".selectedElementFill();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * 
     */
    public void selectedElementStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".selectedElementStroke();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.Timeline selectedElementStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedElementStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for tasks.
     */
    public com.anychart.core.gantt.elements.TasksElement tasks() {
        return new com.anychart.core.gantt.elements.TasksElement(jsBase + ".tasks()");
    }
    /**
     * Setter for tasks.
     */
    public com.anychart.core.ui.Timeline tasks(String settingss) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tasks(%s);", wrapQuotes(settingss)));

        return this;
    }
    /**
     * Getter for the text marker.
     */
    public com.anychart.core.axismarkers.GanttText textMarker(Number index) {
        return new com.anychart.core.axismarkers.GanttText(String.format(Locale.US, jsBase + ".textMarker(%s)", index));
    }
    /**
     * Setter for the text marker.
     */
    public com.anychart.core.ui.Timeline textMarker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text marker.
     */
    public com.anychart.core.ui.Timeline textMarker(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", value));

        return this;
    }
    /**
     * Setter for text marker by index.
     */
    public com.anychart.core.ui.Timeline textMarker(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text marker by index.
     */
    public com.anychart.core.ui.Timeline textMarker(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for text marker by index.
     */
    public com.anychart.core.ui.Timeline textMarker(Number index, com.anychart.enums.GanttDateTimeMarkers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for tooltip settings.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for the tooltip.
     */
    public com.anychart.core.ui.Timeline tooltip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the tooltip.
     */
    public com.anychart.core.ui.Timeline tooltip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", value));

        return this;
    }
    /**
     * Getter for the vertical scroll bar.
     */
    public com.anychart.core.ui.ScrollBar verticalScrollBar() {
        return new com.anychart.core.ui.ScrollBar(jsBase + ".verticalScrollBar()");
    }
    /**
     * Setter for the vertical scroll bar.
     */
    public com.anychart.core.ui.Timeline verticalScrollBar(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".verticalScrollBar(%s);", wrapQuotes(value)));

        return this;
    }

}