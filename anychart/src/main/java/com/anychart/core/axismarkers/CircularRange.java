package com.anychart.core.axismarkers;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Circular range.
 */
public class CircularRange extends VisualBase {

    protected CircularRange() {

    }

    public static CircularRange instantiate() {
        return new CircularRange("new anychart.core.axisMarkers.circularRange()");
    }

    

    public CircularRange(String jsChart) {
        jsBase = "circularRange" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the axis index.
     */
    public void axisIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".axisIndex();");
    }
    /**
     * Setter for the axis index.
     */
    public com.anychart.core.axismarkers.CircularRange axisIndex(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".axisIndex(%s);", index));

        return this;
    }
    /**
     * Getter for the rounding of circular ranges.
     */
    public void cornersRounding() {
        APIlib.getInstance().addJSLine(jsBase + ".cornersRounding();");
    }
    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public com.anychart.core.axismarkers.CircularRange cornersRounding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornersRounding(%s);", value));

        return this;
    }
    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public com.anychart.core.axismarkers.CircularRange cornersRounding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cornersRounding(%s);", wrapQuotes(value)));

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
    public com.anychart.core.axismarkers.CircularRange enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the range end size.
     */
    public void endSize() {
        APIlib.getInstance().addJSLine(jsBase + ".endSize();");
    }
    /**
     * Setter for the range end size.
     */
    public com.anychart.core.axismarkers.CircularRange endSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".endSize(%s);", value));

        return this;
    }
    /**
     * Setter for the range end size.
     */
    public com.anychart.core.axismarkers.CircularRange endSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".endSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the range fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for the range fill.
     */
    public com.anychart.core.axismarkers.CircularRange fill(com.anychart.graphics.vector.Fill settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (settings != null) ? settings.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the range fill.
     */
    public com.anychart.core.axismarkers.CircularRange fill(com.anychart.graphics.vector.GradientKey settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (settings != null) ? settings.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the range fill.
     */
    public com.anychart.core.axismarkers.CircularRange fill(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the range fill.
     */
    public com.anychart.core.axismarkers.CircularRange fill(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the starting range value.
     */
    public void from() {
        APIlib.getInstance().addJSLine(jsBase + ".from();");
    }
    /**
     * Setter for the starting range value.
     */
    public com.anychart.core.axismarkers.CircularRange from(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".from(%s);", value));

        return this;
    }
    /**
     * Getter for the range position.
     */
    public void position() {
        APIlib.getInstance().addJSLine(jsBase + ".position();");
    }
    /**
     * Setter for the range position.
     */
    public com.anychart.core.axismarkers.CircularRange position(com.anychart.enums.GaugeSidePosition value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the range position.
     */
    public com.anychart.core.axismarkers.CircularRange position(String value) {
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
     * Getter for the range radius.
     */
    public void radius() {
        APIlib.getInstance().addJSLine(jsBase + ".radius();");
    }
    /**
     * Setter for the range radius.
     */
    public com.anychart.core.axismarkers.CircularRange radius(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".radius(%s);", value));

        return this;
    }
    /**
     * Setter for the range radius.
     */
    public com.anychart.core.axismarkers.CircularRange radius(String value) {
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
     * Getter for the range start size.
     */
    public void startSize() {
        APIlib.getInstance().addJSLine(jsBase + ".startSize();");
    }
    /**
     * Setter for the range start size.
     */
    public com.anychart.core.axismarkers.CircularRange startSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startSize(%s);", value));

        return this;
    }
    /**
     * Setter for the range start size.
     */
    public com.anychart.core.axismarkers.CircularRange startSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the ending range value.
     */
    public void to() {
        APIlib.getInstance().addJSLine(jsBase + ".to();");
    }
    /**
     * Setter for the ending range value.
     */
    public com.anychart.core.axismarkers.CircularRange to(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".to(%s);", value));

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
    public com.anychart.core.axismarkers.CircularRange zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}