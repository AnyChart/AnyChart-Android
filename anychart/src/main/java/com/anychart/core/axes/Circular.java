package com.anychart.core.axes;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Circular axis class.
{docs:Gauges/Circular_Gauge#axis}Learn more about circular axis.{docs}
 */
public class Circular extends VisualBase {

    protected Circular() {

    }

    public static Circular instantiate() {
        return new Circular("new anychart.core.axes.circular()");
    }

    

    public Circular(String jsChart) {
        jsBase = "circular" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the rounding of corners.
     */
    public void cornersRounding() {
        APIlib.getInstance().addJSLine(jsBase + ".cornersRounding();");
    }
    /**
     * Setter for the rounding of corners.
Round off the ends of axes to the specified radius.
     */
    public com.anychart.core.axes.Circular cornersRounding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornersRounding(%s);", value));

        return this;
    }
    /**
     * Setter for the rounding of corners.
Round off the ends of axes to the specified radius.
     */
    public com.anychart.core.axes.Circular cornersRounding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornersRounding(%s);", wrapQuotes(value)));

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
    public com.anychart.core.axes.Circular drawFirstLabel(Boolean value) {
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
    public com.anychart.core.axes.Circular drawLastLabel(Boolean value) {
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
    public com.anychart.core.axes.Circular enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the axis fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for axis fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Axis fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.axes.Circular fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial axis fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axes.Circular fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for labels.
     */
    public com.anychart.core.axes.Circular labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for labels.
     */
    public com.anychart.core.axes.Circular labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for minor labels.
     */
    public com.anychart.core.ui.LabelsFactory minorLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minorLabels()");
    }
    /**
     * Setter for minor labels.
     */
    public com.anychart.core.axes.Circular minorLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for minor labels.
     */
    public com.anychart.core.axes.Circular minorLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", value));

        return this;
    }
    /**
     * Getter for minor axis ticks.
     */
    public com.anychart.core.axes.CircularTicks minorTicks() {
        return new com.anychart.core.axes.CircularTicks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.core.axes.Circular minorTicks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.core.axes.Circular minorTicks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", value));

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
    public com.anychart.core.axes.Circular overlapMode(com.anychart.enums.LabelsOverlapMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.core.axes.Circular overlapMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.core.axes.Circular overlapMode(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", value));

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
     * Getter for the axis radius.
     */
    public void radius() {
        APIlib.getInstance().addJSLine(jsBase + ".radius();");
    }
    /**
     * Setter for the axis radius.
     */
    public com.anychart.core.axes.Circular radius(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".radius(%s);", value));

        return this;
    }
    /**
     * Setter for the axis radius.
     */
    public com.anychart.core.axes.Circular radius(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".radius(%s);", wrapQuotes(value)));

        return this;
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
    public com.anychart.scales.Linear scale() {
        return new com.anychart.scales.Linear(jsBase + ".scale()");
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.core.axes.Circular scale(com.anychart.enums.GaugeScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.core.axes.Circular scale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the axis scale.
     */
    public com.anychart.core.axes.Circular scale(com.anychart.scales.Linear value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the start angle.
     */
    public void startAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".startAngle();");
    }
    /**
     * Setter for the start angle.
     */
    public com.anychart.core.axes.Circular startAngle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startAngle(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the start angle.
     */
    public com.anychart.core.axes.Circular startAngle(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startAngle(%s);", value));

        return this;
    }
    /**
     * Getter for the sweep angle.
     */
    public void sweepAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".sweepAngle();");
    }
    /**
     * Setter for the sweep angle.
     */
    public com.anychart.core.axes.Circular sweepAngle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".sweepAngle(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the sweep angle.
     */
    public com.anychart.core.axes.Circular sweepAngle(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".sweepAngle(%s);", value));

        return this;
    }
    /**
     * Getter for circular ticks.
     */
    public com.anychart.core.axes.CircularTicks ticks() {
        return new com.anychart.core.axes.CircularTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for circular ticks.
     */
    public com.anychart.core.axes.Circular ticks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for circular ticks.
     */
    public com.anychart.core.axes.Circular ticks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", value));

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
     * Getter for the axis width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the axis width.
     */
    public com.anychart.core.axes.Circular width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for the axis width.
     */
    public com.anychart.core.axes.Circular width(String value) {
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
    public com.anychart.core.axes.Circular zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}