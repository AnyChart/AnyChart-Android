package com.anychart.standalones;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * The ColorRange class contains methods for configuring standalones color range.
 */
public class ColorRange extends JsObject {

    protected ColorRange() {

    }

    public static ColorRange instantiate() {
        return new ColorRange("new anychart.standalones.colorRange()");
    }

    

    public ColorRange(String jsChart) {
        jsBase = "colorRange" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for color range align settings.
     */
    public void align() {
        APIlib.getInstance().addJSLine(jsBase + ".align();");
    }
    /**
     * Setter for color range align settings.
     */
    public com.anychart.standalones.ColorRange align(com.anychart.enums.Align value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for color range align settings.
     */
    public com.anychart.standalones.ColorRange align(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the color line size.
     */
    public void colorLineSize() {
        APIlib.getInstance().addJSLine(jsBase + ".colorLineSize();");
    }
    /**
     * Setter for the color line size.
     */
    public com.anychart.standalones.ColorRange colorLineSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colorLineSize(%s);", value));

        return this;
    }
    /**
     * Getter for the color range container.
     */
    public void container() {
        APIlib.getInstance().addJSLine(jsBase + ".container();");
    }
    /**
     * Setter for the color range container.
     */
    public com.anychart.standalones.ColorRange container(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Draw color range.
     */
    public com.anychart.standalones.ColorRange draw() {
        APIlib.getInstance().addJSLine(jsBase + ".draw();");

        return this;
    }
    /**
     * Getter for the first label drawing flag.
     */
    public void drawFirstLabel() {
        APIlib.getInstance().addJSLine(jsBase + ".drawFirstLabel();");
    }
    /**
     * Setter for the first label drawing flag.
     */
    public com.anychart.standalones.ColorRange drawFirstLabel(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drawFirstLabel(%s);", value));

        return this;
    }
    /**
     * Getter for the last label drawing flag.
     */
    public void drawLastLabel() {
        APIlib.getInstance().addJSLine(jsBase + ".drawLastLabel();");
    }
    /**
     * Setter for the last label drawing flag.
     */
    public com.anychart.standalones.ColorRange drawLastLabel(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drawLastLabel(%s);", value));

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
    public com.anychart.standalones.ColorRange enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Returns remaining parent bounds to use elsewhere.
     */
    public com.anychart.math.Rect getRemainingBounds() {
        return new com.anychart.math.Rect(jsBase + ".getRemainingBounds()");
    }
    /**
     * Whether an axis is horizontal.
     */
    public void isHorizontal() {
        APIlib.getInstance().addJSLine(jsBase + ".isHorizontal();");
    }
    /**
     * Getter for axis labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for axis labels.
     */
    public com.anychart.standalones.ColorRange labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for axis labels.
     */
    public com.anychart.standalones.ColorRange labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for the color range line length.
     */
    public void length() {
        APIlib.getInstance().addJSLine(jsBase + ".length();");
    }
    /**
     * Setter for the current color range line length.
     */
    public com.anychart.standalones.ColorRange length(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".length(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the current color range line length.
     */
    public com.anychart.standalones.ColorRange length(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".length(%s);", value));

        return this;
    }
    /**
     * Getter for the color range marker.
     */
    public com.anychart.core.ui.markersfactory.Marker marker() {
        return new com.anychart.core.ui.markersfactory.Marker(jsBase + ".marker()");
    }
    /**
     * Getter for the color range marker.
     */
    public com.anychart.standalones.ColorRange marker(com.anychart.core.ui.markersfactory.Marker value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".marker(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the color range marker.
     */
    public com.anychart.standalones.ColorRange marker(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".marker(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for axis minor labels.
     */
    public com.anychart.core.ui.LabelsFactory minorLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minorLabels()");
    }
    /**
     * Setter for axis minor labels.
     */
    public com.anychart.standalones.ColorRange minorLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for axis minor labels.
     */
    public com.anychart.standalones.ColorRange minorLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", value));

        return this;
    }
    /**
     * Getter for minor axis ticks.
     */
    public com.anychart.core.axes.Ticks minorTicks() {
        return new com.anychart.core.axes.Ticks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.standalones.ColorRange minorTicks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.standalones.ColorRange minorTicks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", value));

        return this;
    }
    /**
     * Getter for the axis orientation.
     */
    public void orientation() {
        APIlib.getInstance().addJSLine(jsBase + ".orientation();");
    }
    /**
     * Setter for the axis orientation.
     */
    public com.anychart.standalones.ColorRange orientation(com.anychart.enums.Orientation value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the axis orientation.
     */
    public com.anychart.standalones.ColorRange orientation(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for labels overlap mode.
     */
    public void overlapMode() {
        APIlib.getInstance().addJSLine(jsBase + ".overlapMode();");
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.standalones.ColorRange overlapMode(com.anychart.enums.LabelsOverlapMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.standalones.ColorRange overlapMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for padding settings object.
     */
    public com.anychart.core.ui.table.Padding padding() {
        return new com.anychart.core.ui.table.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public com.anychart.standalones.ColorRange padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public com.anychart.standalones.ColorRange padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public com.anychart.standalones.ColorRange padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public com.anychart.standalones.ColorRange padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for parent bounds.<br/>
As a getter falls back to stage bounds.
     */
    public com.anychart.math.Rect parentBounds() {
        return new com.anychart.math.Rect(jsBase + ".parentBounds()");
    }
    /**
     * Setter for bounds using single value.
     */
    public com.anychart.standalones.ColorRange parentBounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds using single value.
     */
    public com.anychart.standalones.ColorRange parentBounds(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for bounds using several values.
     */
    public com.anychart.standalones.ColorRange parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

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
     * Getter for the axis scale.
     */
    public com.anychart.scales.Base scale() {
        return new com.anychart.scales.Base(jsBase + ".scale()");
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.standalones.ColorRange scale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.standalones.ColorRange scale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.standalones.ColorRange scale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for stagger lines.
     */
    public void staggerLines() {
        APIlib.getInstance().addJSLine(jsBase + ".staggerLines();");
    }
    /**
     * Setter for stagger lines.<br/>
<b>Note:</b> pass <b>null</b> to enable autocalculation.
     */
    public com.anychart.standalones.ColorRange staggerLines(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".staggerLines(%s);", value));

        return this;
    }
    /**
     * Getter for maximum stagger lines.
     */
    public void staggerMaxLines() {
        APIlib.getInstance().addJSLine(jsBase + ".staggerMaxLines();");
    }
    /**
     * Setter for maximum stagger lines in autocalculation mode (if {@link anychart.core.axes.Linear#staggerLines} passed null).
     */
    public com.anychart.standalones.ColorRange staggerMaxLines(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".staggerMaxLines(%s);", value));

        return this;
    }
    /**
     * Getter for the stagger mode state.
     */
    public void staggerMode() {
        APIlib.getInstance().addJSLine(jsBase + ".staggerMode();");
    }
    /**
     * Setter for the stagger mode state.
     */
    public com.anychart.standalones.ColorRange staggerMode(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".staggerMode(%s);", value));

        return this;
    }
    /**
     * Getter for axis stroke settings.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.standalones.ColorRange stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for axis ticks.
     */
    public com.anychart.core.axes.Ticks ticks() {
        return new com.anychart.core.axes.Ticks(jsBase + ".ticks()");
    }
    /**
     * Setter for axis ticks.
     */
    public com.anychart.standalones.ColorRange ticks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for axis ticks.
     */
    public com.anychart.standalones.ColorRange ticks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", value));

        return this;
    }
    /**
     * Getter for the axis title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the axis title.
     */
    public com.anychart.standalones.ColorRange title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for the axis title.
     */
    public com.anychart.standalones.ColorRange title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

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
     * Getter for the axis width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the axis width.
     */
    public com.anychart.standalones.ColorRange width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for the axis width.
     */
    public com.anychart.standalones.ColorRange width(String value) {
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
    public com.anychart.standalones.ColorRange zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Returns pixel bounds of the axis.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * 
     */
    public com.anychart.standalones.ColorRange stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }

}