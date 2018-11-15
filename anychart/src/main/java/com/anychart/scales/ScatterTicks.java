package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The ScatterTicks class contains methods for configuring ticks on the Scatter scale.
 */
public class ScatterTicks extends Base {

    protected ScatterTicks() {

    }

    public static ScatterTicks instantiate() {
        return new ScatterTicks("new anychart.scales.scatterTicks()");
    }

    

    public ScatterTicks(String jsChart) {
        jsBase = "scatterTicks" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the allowFractional flag.
     */
    public void allowFractional() {
        APIlib.getInstance().addJSLine(jsBase + ".allowFractional();");
    }
    /**
     * Setter for the allowFractional flag.<br/>
Whether to the allow fractional values in ticks.<br/>
<b>Note</b>: When {@link anychart.scales.ScatterTicks#mode} set to 'logarithmic', the allowFractional flag is always <b>false</b>.
     */
    public com.anychart.scales.ScatterTicks allowFractional(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".allowFractional(%s);", enabled));

        return this;
    }
    /**
     * Getter for ticks base value.
     */
    public void base() {
        APIlib.getInstance().addJSLine(jsBase + ".base();");
    }
    /**
     * Setter for ticks base value.
<b>Note:</b> it is a number that is guaranteed to set a tick if the number is located between minimum and maximum values of the scale.
     */
    public com.anychart.scales.ScatterTicks base(Number baseValue) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".base(%s);", baseValue));

        return this;
    }
    /**
     * Getter for ticks count.
     */
    public void count() {
        APIlib.getInstance().addJSLine(jsBase + ".count();");
    }
    /**
     * Setter for ticks count value.
<b>Note:</b> Final number of ticks can be greater (one more tick can be added).
     */
    public com.anychart.scales.ScatterTicks count(Number count) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s);", count));

        return this;
    }
    /**
     * Setter for ticks count value using two parameters.
<b>Note:</b> Final number of ticks can be greater than maximum (one more tick can be added).
     */
    public com.anychart.scales.ScatterTicks count(Number minimumCount, Number maximumCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".count(%s, %s);", minimumCount, maximumCount));

        return this;
    }
    /**
     * Returns an array of ticks. Each tick is a value in terms of data, to make a tick on.
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or after <b>chart.draw()</b>
     */
    public void get() {
        APIlib.getInstance().addJSLine(jsBase + ".get();");
    }
    /**
     * Getter for ticks interval value.
<b>Note:</b> You can get interval value only if it was set explicitly, otherwise its returns NaN.
     */
    public void interval() {
        APIlib.getInstance().addJSLine(jsBase + ".interval();");
    }
    /**
     * Setter for ticks interval value.
     */
    public com.anychart.scales.ScatterTicks interval(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interval(%s);", value));

        return this;
    }
    /**
     * Getter for the ticks mode.
     */
    public void mode() {
        APIlib.getInstance().addJSLine(jsBase + ".mode();");
    }
    /**
     * Setter for the ticks mode.
<b>Note:</b> Use only with logarithmic scales.
     */
    public com.anychart.scales.ScatterTicks mode(com.anychart.enums.ScatterTicksMode mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".mode(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the ticks mode.
<b>Note:</b> Use only with logarithmic scales.
     */
    public com.anychart.scales.ScatterTicks mode(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".mode(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public com.anychart.scales.ScatterTicks set(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s);", arrayToStringWrapQuotes(ticks)));

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

}