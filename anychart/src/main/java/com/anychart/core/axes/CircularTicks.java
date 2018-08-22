package com.anychart.core.axes;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Axis ticks class.
 */
public class CircularTicks extends VisualBase {

    protected CircularTicks() {

    }

    public static CircularTicks instantiate() {
        return new CircularTicks("new anychart.core.axes.circularTicks()");
    }

    

    public CircularTicks(String jsChart) {
        jsBase = "circularTicks" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
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
    public com.anychart.core.axes.CircularTicks enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for ticks fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for ticks fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Ticks fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.axes.CircularTicks fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.CircularTicks fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for ticks hatch fill settings.
     */
    public com.anychart.graphics.vector.PatternFill hatchFill() {
        return new com.anychart.graphics.vector.PatternFill(jsBase + ".hatchFill()");
    }
    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks hatchFill(com.anychart.graphics.vector.PatternFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks hatchFill(com.anychart.graphics.vector.HatchFill patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks hatchFill(com.anychart.graphics.vector.hatchfill.HatchFillType patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", (patternFillOrType != null) ? patternFillOrType.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks hatchFill(String patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrType), wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks hatchFill(Boolean patternFillOrType, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %s, %s);", patternFillOrType, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Getter for ticks length.
     */
    public void length() {
        APIlib.getInstance().addJSLine(jsBase + ".length();");
    }
    /**
     * Setter for ticks length.
     */
    public com.anychart.core.axes.CircularTicks length(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".length(%s);", value));

        return this;
    }
    /**
     * Setter for ticks length.
     */
    public com.anychart.core.axes.CircularTicks length(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".length(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for ticks position.
     */
    public void position() {
        APIlib.getInstance().addJSLine(jsBase + ".position();");
    }
    /**
     * Setter for ticks position.
     */
    public com.anychart.core.axes.CircularTicks position(com.anychart.enums.SidePosition value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks position.
     */
    public com.anychart.core.axes.CircularTicks position(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(value)));

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
     * Getter for ticks stroke.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for ticks stroke by function.
     */
    public com.anychart.core.axes.CircularTicks stroke(String strokeFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(strokeFunction)));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.CircularTicks stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Getter for ticks type.
     */
    public void type() {
        APIlib.getInstance().addJSLine(jsBase + ".type();");
    }
    /**
     * Setter for ticks type.
     */
    public com.anychart.core.axes.CircularTicks type(com.anychart.enums.MarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for ticks type.
     */
    public com.anychart.core.axes.CircularTicks type(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", wrapQuotes(value)));

        return this;
    }
    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
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

        ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
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
    public com.anychart.core.axes.CircularTicks zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}