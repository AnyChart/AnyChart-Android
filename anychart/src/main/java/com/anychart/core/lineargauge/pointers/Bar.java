package com.anychart.core.lineargauge.pointers;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;

import java.util.List;
import java.util.Locale;

// class
/**
 * Bar pointer class.
 */
public class Bar extends Base {

    protected Bar() {

    }

    public static Bar instantiate() {
        return new Bar("new anychart.core.linearGauge.pointers.bar()");
    }

    

    public Bar(String jsChart) {
        jsBase = "bar" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the pointer color.
     */
    public void color() {
        APIlib.getInstance().addJSLine(jsBase + ".color();");
    }
    /**
     * Setter for the pointer color.
     */
    public com.anychart.core.lineargauge.pointers.Bar color(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".color(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
    }
    /**
     * Getter for the data index.
     */
    public void dataIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".dataIndex();");
    }
    /**
     * Setter for the data index.
     */
    public com.anychart.core.lineargauge.pointers.Bar dataIndex(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dataIndex(%s);", index));

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
    public com.anychart.core.lineargauge.pointers.Bar enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the pointer fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the gauge.
     */
    public com.anychart.charts.LinearGauge getGauge() {
        return new com.anychart.charts.LinearGauge(jsBase + ".getGauge()");
    }
    /**
     * Getter for pointer hatch fill settings.
     */
    public com.anychart.graphics.vector.PatternFill hatchFill() {
        return new com.anychart.graphics.vector.PatternFill(jsBase + ".hatchFill()");
    }
    /**
     * Setter for hatch fill settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hatchFill(com.anychart.graphics.vector.PatternFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hatchFill(com.anychart.graphics.vector.HatchFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hatchFill(String patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrType), wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hatchFill(com.anychart.graphics.vector.hatchfill.HatchFillType patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for hatch fill settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hatchFill(Boolean patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", patternFillOrType, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Hovers a pointer.
     */
    public com.anychart.core.lineargauge.pointers.Bar hover() {
        APIlib.getInstance().addJSLine(jsBase + ".hover();");

        return this;
    }
    /**
     * Getter for hovered state settings.
     */
    public com.anychart.core.StateSettings hovered() {
        return new com.anychart.core.StateSettings(jsBase + ".hovered()");
    }
    /**
     * Setter for hovered state settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar hovered(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the pointer id.
     */
    public com.anychart.core.gauge.pointers.Base id() {
        return new com.anychart.core.gauge.pointers.Base(jsBase + ".id()");
    }
    /**
     * Setter for the pointer id.
     */
    public com.anychart.core.gauge.pointers.Base id(String id) {
        return new com.anychart.core.gauge.pointers.Base(String.format(Locale.US, jsBase + ".id(%s)", wrapQuotes(id)));
    }
    /**
     * Setter for the pointer id.
     */
    public com.anychart.core.gauge.pointers.Base id(Number id) {
        return new com.anychart.core.gauge.pointers.Base(String.format(Locale.US, jsBase + ".id(%s)", id));
    }
    /**
     * Getter for the pointer labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for the pointer labels.
     */
    public com.anychart.core.lineargauge.pointers.Bar labels(com.anychart.core.ui.LabelsFactory value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the pointer labels.
     */
    public com.anychart.core.lineargauge.pointers.Bar labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the pointer labels.
     */
    public com.anychart.core.lineargauge.pointers.Bar labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for the legend item settings.
     */
    public com.anychart.core.utils.LegendItemSettings legendItem() {
        return new com.anychart.core.utils.LegendItemSettings(jsBase + ".legendItem()");
    }
    /**
     * Setter for the legend item settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar legendItem(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legendItem(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the pointer name.
     */
    public void name() {
        APIlib.getInstance().addJSLine(jsBase + ".name();");
    }
    /**
     * Setter for the pointer name.
     */
    public com.anychart.core.lineargauge.pointers.Bar name(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".name(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for normal state settings.
     */
    public com.anychart.core.StateSettings normal() {
        return new com.anychart.core.StateSettings(jsBase + ".normal()");
    }
    /**
     * Setter for normal state settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar normal(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the pointer offset.
     */
    public void offset() {
        APIlib.getInstance().addJSLine(jsBase + ".offset();");
    }
    /**
     * Setter for the pointer offset.
     */
    public com.anychart.core.lineargauge.pointers.Bar offset(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".offset(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the pointer offset.
     */
    public com.anychart.core.lineargauge.pointers.Bar offset(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".offset(%s);", value));

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
     * Getter for the pointer scale.
     */
    public com.anychart.scales.Base scale() {
        return new com.anychart.scales.Base(jsBase + ".scale()");
    }
    /**
     * Setter for the pointer scale.
     */
    public com.anychart.core.lineargauge.pointers.Bar scale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for selected state settings.
     */
    public com.anychart.core.StateSettings selected() {
        return new com.anychart.core.StateSettings(jsBase + ".selected()");
    }
    /**
     * Setter for selected state settings.
     */
    public com.anychart.core.lineargauge.pointers.Bar selected(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the pointer stroke.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for the pointer stroke using function.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.Stroke value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the pointer stroke using function.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.lineargauge.pointers.Bar stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Removes hover from the pointer.
     */
    public com.anychart.core.lineargauge.pointers.Bar unhover() {
        APIlib.getInstance().addJSLine(jsBase + ".unhover();");

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
     * Deselects a pointer.
     */
    public com.anychart.core.lineargauge.pointers.Bar unselect() {
        APIlib.getInstance().addJSLine(jsBase + ".unselect();");

        return this;
    }
    /**
     * Getter for the pointer width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the pointer width.
     */
    public com.anychart.core.lineargauge.pointers.Bar width(String value) {
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
    public com.anychart.core.lineargauge.pointers.Bar zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(com.anychart.data.View data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, String fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), wrapQuotes(fillMethod)));
    }

}