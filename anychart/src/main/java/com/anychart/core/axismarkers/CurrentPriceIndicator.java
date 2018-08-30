package com.anychart.core.axismarkers;

import com.anychart.APIlib;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Stock current price indicator class.
 */
public class CurrentPriceIndicator extends VisualBase {

    protected CurrentPriceIndicator() {

    }

    public static CurrentPriceIndicator instantiate() {
        return new CurrentPriceIndicator("new anychart.core.axisMarkers.currentPriceIndicator()");
    }

    

    public CurrentPriceIndicator(String jsChart) {
        jsBase = "currentPriceIndicator" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the target axis.
     */
    public com.anychart.core.axes.Linear axis() {
        return new com.anychart.core.axes.Linear(jsBase + ".axis()");
    }
    /**
     * Setter for the target axis.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator axis(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".axis(%s);", value));

        return this;
    }
    /**
     * Setter for the target axis.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator axis(com.anychart.core.axes.Linear value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".axis(%s);", (value != null) ? value.getJsBase() : null));

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
    public com.anychart.core.axismarkers.CurrentPriceIndicator enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the price indicator falling label.
     */
    public com.anychart.core.ui.Label fallingLabel() {
        return new com.anychart.core.ui.Label(jsBase + ".fallingLabel()");
    }
    /**
     * Setter for the price indicator falling label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingLabel(String index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingLabel(%s, %s);", wrapQuotes(index), value));

        return this;
    }
    /**
     * Setter for the price indicator falling label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingLabel(String index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingLabel(%s, %s);", wrapQuotes(index), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the price indicator falling label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingLabel(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingLabel(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the price indicator falling label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingLabel(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingLabel(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the price indicator falling stroke.
     */
    public void fallingStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".fallingStroke();");
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator falling stroke.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator fallingStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fallingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the price indicator label.
     */
    public com.anychart.core.ui.LabelsFactory label() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".label()");
    }
    /**
     * Setter for the price indicator label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator label(String index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), value));

        return this;
    }
    /**
     * Setter for the price indicator label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator label(String index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the price indicator label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator label(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the price indicator label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator label(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, wrapQuotes(value)));

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
     * Getter for the price indicator rising label.
     */
    public com.anychart.core.ui.Label risingLabel() {
        return new com.anychart.core.ui.Label(jsBase + ".risingLabel()");
    }
    /**
     * Setter for the price indicator rising label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingLabel(String index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingLabel(%s, %s);", wrapQuotes(index), value));

        return this;
    }
    /**
     * Setter for the price indicator rising label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingLabel(String index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingLabel(%s, %s);", wrapQuotes(index), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the price indicator rising label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingLabel(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingLabel(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the price indicator rising label.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingLabel(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingLabel(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the price indicator rising stroke.
     */
    public void risingStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".risingStroke();");
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator rising stroke.<br/>
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator risingStroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".risingStroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the target series.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the target series.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator series(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", value));

        return this;
    }
    /**
     * Setter for the target series.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator series(com.anychart.core.stock.series.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the price indicator stroke.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the price indicator stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

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
     * Getter for the price indicator value.
     */
    public void value() {
        APIlib.getInstance().addJSLine(jsBase + ".value();");
    }
    /**
     * Setter for the stock price indicator.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator value(com.anychart.enums.PriceIndicatorDataSource value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".value(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the stock price indicator.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator value(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".value(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the stock price indicator.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator value(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".value(%s);", value));

        return this;
    }
    /**
     * Getter for the price indicator value field.
     */
    public void valueField() {
        APIlib.getInstance().addJSLine(jsBase + ".valueField();");
    }
    /**
     * Setter for the price indicator value field.<br/>
valueField() method use with {@link anychart.core.axisMarkers.CurrentPriceIndicator#value} method.
This method sets the field to be used as the value for the price indicator
     */
    public void valueField(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueField(%s);", wrapQuotes(value)));
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
    public com.anychart.core.axismarkers.CurrentPriceIndicator zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }

}