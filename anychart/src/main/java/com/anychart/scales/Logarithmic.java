package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.scales.Linear;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Logarithmic class contains methods for configuring Logarithmic scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#log} method.
 */
public class Logarithmic extends Linear {

    protected Logarithmic() {

    }

    public static Logarithmic instantiate() {
        return new Logarithmic("new anychart.scales.logarithmic()");
    }

    

    public Logarithmic(String jsChart) {
        jsBase = "logarithmic" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
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
    public com.anychart.scales.Logarithmic alignMaximum(Boolean enabled) {
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
    public com.anychart.scales.Logarithmic alignMinimum(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alignMinimum(%s);", enabled));

        return this;
    }
    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).<br/>
<b>Note:</b> Attention! {@link anychart.scales.Base#finishAutoCalc} drops all passed values.
     */
    public com.anychart.scales.Logarithmic extendDataRange(String var_args) {
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
     * Returns the tick by its position ratio.
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
    public com.anychart.scales.Logarithmic inverted(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", enabled));

        return this;
    }
    /**
     * Getter for the logarithmic base value.
     */
    public void logBase() {
        APIlib.getInstance().addJSLine(jsBase + ".logBase();");
    }
    /**
     * Setter for the logarithmic base value.<br/>
<b>Note:</b> Affects tick values auto calculation.
     */
    public com.anychart.scales.Logarithmic logBase(Number baseValue) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".logBase(%s);", baseValue));

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
    public com.anychart.scales.Logarithmic maximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the scale maximum gap.
     */
    public void maximumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".maximumGap();");
    }
    /**
     * Setter for the scale maximum gap.
     */
    public com.anychart.scales.Logarithmic maximumGap(Number gap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maximumGap(%s);", gap));

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
    public com.anychart.scales.Logarithmic minimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimum(%s);", minimum));

        return this;
    }
    /**
     * Getter for the scale minimum gap.
     */
    public void minimumGap() {
        APIlib.getInstance().addJSLine(jsBase + ".minimumGap();");
    }
    /**
     * Setter for the scale minimum gap.
     */
    public com.anychart.scales.Logarithmic minimumGap(Number gap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minimumGap(%s);", gap));

        return this;
    }
    /**
     * Getter for set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.ScatterTicks minorTicks() {
        return new com.anychart.scales.ScatterTicks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.Logarithmic minorTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for set of scale minor ticks in terms of data values.
     */
    public com.anychart.scales.Logarithmic minorTicks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the soft maximum.
     */
    public void softMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMaximum();");
    }
    /**
     * Setter for the soft maximum.
     */
    public com.anychart.scales.Logarithmic softMaximum(Number maximum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".softMaximum(%s);", maximum));

        return this;
    }
    /**
     * Getter for the soft minimum.
     */
    public void softMinimum() {
        APIlib.getInstance().addJSLine(jsBase + ".softMinimum();");
    }
    /**
     * Setter for the soft minimum.
     */
    public com.anychart.scales.Logarithmic softMinimum(Number minimum) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".softMinimum(%s);", minimum));

        return this;
    }
    /**
     * Getter for the stacking direction.
     */
    public void stackDirection() {
        APIlib.getInstance().addJSLine(jsBase + ".stackDirection();");
    }
    /**
     * Setter for the stacking direction.
     */
    public com.anychart.scales.Logarithmic stackDirection(com.anychart.enums.ScaleStackDirection direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stackDirection(%s);", (direction != null) ? direction.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the stacking direction.
     */
    public com.anychart.scales.Logarithmic stackDirection(String direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stackDirection(%s);", wrapQuotes(direction)));

        return this;
    }
    /**
     * Getter for the stacked mode.
     */
    public void stackMode() {
        APIlib.getInstance().addJSLine(jsBase + ".stackMode();");
    }
    /**
     * Setter for the stacked mode.
     */
    public com.anychart.scales.Logarithmic stackMode(com.anychart.enums.ScaleStackMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stackMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the stacked mode.
     */
    public com.anychart.scales.Logarithmic stackMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stackMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Informs scale that an auto-range calculation started for the chart, so it should reset its data range on the first
call of this method if needed.
     */
    public com.anychart.scales.Logarithmic startAutoCalc() {
        APIlib.getInstance().addJSLine(jsBase + ".startAutoCalc();");

        return this;
    }
    /**
     * Getter for stick to zero.
     */
    public void stickToZero() {
        APIlib.getInstance().addJSLine(jsBase + ".stickToZero();");
    }
    /**
     * Setter for stick to zero.
Flag to stick to zero value on auto calc if gaps lead to zero crossing.
     */
    public com.anychart.scales.Logarithmic stickToZero(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stickToZero(%s);", enabled));

        return this;
    }
    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.ScatterTicks ticks() {
        return new com.anychart.scales.ScatterTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.Logarithmic ticks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.Logarithmic ticks(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Returns the tick position ratio by its name.
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
     * Getter for date the which should be used as a changes zero for series.
     */
    public void compareWith() {
        APIlib.getInstance().addJSLine(jsBase + ".compareWith();");
    }
    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public com.anychart.scales.Logarithmic compareWith(com.anychart.enums.ScaleCompareWithMode mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".compareWith(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public com.anychart.scales.Logarithmic compareWith(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".compareWith(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public com.anychart.scales.Logarithmic compareWith(Number mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".compareWith(%s);", mode));

        return this;
    }
    /**
     * Getter for the scale changes mode.
     */
    public void comparisonMode() {
        APIlib.getInstance().addJSLine(jsBase + ".comparisonMode();");
    }
    /**
     * Setter for the scale changes mode.
     */
    public com.anychart.scales.Logarithmic comparisonMode(com.anychart.enums.ScaleComparisonMode mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".comparisonMode(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the scale changes mode.
     */
    public com.anychart.scales.Logarithmic comparisonMode(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".comparisonMode(%s);", wrapQuotes(mode)));

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
    public com.anychart.scales.Logarithmic maxTicksCount(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxTicksCount(%s);", count));

        return this;
    }

}