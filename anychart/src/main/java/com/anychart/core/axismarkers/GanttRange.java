package com.anychart.core.axismarkers;

import com.anychart.APIlib;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Gantt range marker.
 */
public class GanttRange extends VisualBase {

    protected GanttRange() {

    }

    public static GanttRange instantiate() {
        return new GanttRange("new anychart.core.axisMarkers.ganttRange()");
    }

    

    public GanttRange(String jsChart) {
        jsBase = "ganttRange" + ++variableIndex;
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
    public com.anychart.core.axismarkers.GanttRange enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the range marker fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.axismarkers.GanttRange fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the starting marker value.
     */
    public void from() {
        APIlib.getInstance().addJSLine(jsBase + ".from();");
    }
    /**
     * Setter for the starting marker value.
     */
    public com.anychart.core.axismarkers.GanttRange from(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".from(%s);", value));

        return this;
    }
    /**
     * Setter for the starting marker value.
     */
    public com.anychart.core.axismarkers.GanttRange from(com.anychart.enums.GanttDateTimeMarkers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".from(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the starting marker value.
     */
    public com.anychart.core.axismarkers.GanttRange from(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".from(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Whether a range marker has horizontal layout.<br/>
<b>Note:</b> Any type of Gantt diagram will return "false", because markers in Gantt charts can be only vertical.<br/>
Layout is defined by {@link anychart.core.axisMarkers.GanttLine#layout} method.
     */
    public void isHorizontal() {
        APIlib.getInstance().addJSLine(jsBase + ".isHorizontal();");
    }
    /**
     * Getter for the Gantt chart range marker layout.
     */
    public void layout() {
        APIlib.getInstance().addJSLine(jsBase + ".layout();");
    }
    /**
     * Setter for the Gantt chart range marker layout.
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public com.anychart.core.axismarkers.GanttRange layout(com.anychart.enums.Layout value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".layout(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the Gantt chart range marker layout.
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public com.anychart.core.axismarkers.GanttRange layout(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".layout(%s);", wrapQuotes(value)));

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
     * Getter for the Gantt chart range marker scale.
     */
    public com.anychart.scales.GanttDateTime scale() {
        return new com.anychart.scales.GanttDateTime(jsBase + ".scale()");
    }
    /**
     * Setter for the Gantt chart range marker scale.
<b>Note:</b> The scale method will not work here, only "dateTime" scale are available in Gantt Chart.
{docs:Gantt_Chart/Timeline#special_features}Learn more about scale.{docs}
     */
    public com.anychart.core.axismarkers.GanttRange scale(com.anychart.scales.GanttDateTime value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".scale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the ending marker value.
     */
    public void to() {
        APIlib.getInstance().addJSLine(jsBase + ".to();");
    }
    /**
     * Setter for the ending marker value.
     */
    public com.anychart.core.axismarkers.GanttRange to(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".to(%s);", value));

        return this;
    }
    /**
     * Setter for the ending marker value.
     */
    public com.anychart.core.axismarkers.GanttRange to(com.anychart.enums.GanttDateTimeMarkers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".to(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the ending marker value.
     */
    public com.anychart.core.axismarkers.GanttRange to(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".to(%s);", wrapQuotes(value)));

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
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.axismarkers.GanttRange zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}