package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.scales.ScatterBase;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The LinearColor class contains methods for configuring Linear color scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#linearColor} method.
 */
public class LinearColor extends ScatterBase {

    protected LinearColor() {

    }

    public static LinearColor instantiate() {
        return new LinearColor("new anychart.scales.linearColor()");
    }

    

    public LinearColor(String jsChart) {
        jsBase = "linearColor" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Converts color to value. Returns number ratio by its color.
     */
    public void colorToValue(String color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colorToValue(%s);", wrapQuotes(color)));
    }
    /**
     * Getter for the linear gradient for the linear color scale.
     */
    public void colors() {
        APIlib.getInstance().addJSLine(jsBase + ".colors();");
    }
    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public com.anychart.scales.LinearColor colors(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public com.anychart.scales.LinearColor colors(com.anychart.graphics.vector.SolidFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public com.anychart.scales.LinearColor colors(com.anychart.graphics.vector.LinearGradientFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public com.anychart.scales.LinearColor colors(com.anychart.graphics.vector.RadialGradientFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public com.anychart.scales.LinearColor colors(String[] var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", arrayToStringWrapQuotes(var_args)));

        return this;
    }
    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).<br/>
<b>Note:</b> Attention! {@link anychart.scales.Base#finishAutoCalc} drops all passed values.
     */
    public com.anychart.scales.LinearColor extendDataRange(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".extendDataRange(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * Informs the scale that an auto-range calculation started for the chart in past was ended.
     */
    public void finishAutoCalc(Boolean silently) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".finishAutoCalc(%s);", silently));
    }
    /**
     * Returns scale type.
     */
    public void getType() {
        APIlib.getInstance().addJSLine(jsBase + ".getType();");
    }
    /**
     * Returns tick by its position ratio.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void inverseTransform(Number ratio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
    }
    /**
     * Getter for the scale inversion.
     */
    public void inverted() {
        APIlib.getInstance().addJSLine(jsBase + ".inverted();");
    }
    /**
     * Setter for scale inversion.<br/> If the scale is <b>inverted</b>, axes and series go upside-down or right-to-left
instead of bottom-to-top and left-to-right.
     */
    public com.anychart.scales.LinearColor inverted(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", enabled));

        return this;
    }
    /**
     * Getter for the scale maximum.
     */
    public void maximum() {
        APIlib.getInstance().addJSLine(jsBase + ".maximum();");
    }
    /**
     * Setter for the scale maximum.
     */
    public com.anychart.scales.LinearColor maximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the scale minimum.
     */
    public void minimum() {
        APIlib.getInstance().addJSLine(jsBase + ".minimum();");
    }
    /**
     * Setter for the scale minimum.
     */
    public com.anychart.scales.LinearColor minimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimum(%s);", minimum));

        return this;
    }
    /**
     * Getter for the set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.ScatterTicks minorTicks() {
        return new com.anychart.scales.ScatterTicks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for the  set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.LinearColor minorTicks(String ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(ticks)));

        return this;
    }
    /**
     * Setter for the  set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.LinearColor minorTicks(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", arrayToStringWrapQuotes(ticks)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Informs scale that an auto-range calculation started for the chart, so it should reset its data range on the first
call of this method if needed.
     */
    public com.anychart.scales.LinearColor startAutoCalc() {
        APIlib.getInstance().addJSLine(jsBase + ".startAutoCalc();");

        return this;
    }
    /**
     * Getter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.ScatterTicks ticks() {
        return new com.anychart.scales.ScatterTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.LinearColor ticks(String ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(ticks)));

        return this;
    }
    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.LinearColor ticks(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(ticks)));

        return this;
    }
    /**
     * Returns tick position ratio by its name.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void transform(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s);", wrapQuotes(value)));
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

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
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
     * Converts value to color. Returns color ratio by its number.
     */
    public void valueToColor(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueToColor(%s);", value));
    }
    /**
     * Getter for a flag if the maximum should be aligned by major ticks interval.
     */
    public void alignMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".alignMaximum();");
    }
    /**
     * Getter for a flag if the maximum should be aligned by major ticks interval.<br/>
     */
    public com.anychart.scales.LinearColor alignMaximum(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alignMaximum(%s);", enabled));

        return this;
    }
    /**
     * Setter for a flag if the minimum should be aligned by major ticks interval.
     */
    public void alignMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".alignMinimum();");
    }
    /**
     * Setter for a flag if the minimum should be aligned by major ticks interval.
     */
    public com.anychart.scales.LinearColor alignMinimum(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alignMinimum(%s);", enabled));

        return this;
    }
    /**
     * Getter for the maximum ticks count.
     */
    public void maxTicksCount() {
        APIlib.getInstance().addJSLine(jsBase + ".maxTicksCount();");
    }
    /**
     * Setter for the maximum ticks count.<br/>
     */
    public com.anychart.scales.LinearColor maxTicksCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxTicksCount(%s);", count));

        return this;
    }

}