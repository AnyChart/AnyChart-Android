package com.anychart.scales;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.scales.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Ordinal class contains methods for configuring Ordinal scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#ordinal} method.
 */
public class Ordinal extends Base {

    protected Ordinal() {

    }

    public static Ordinal instantiate() {
        return new Ordinal("new anychart.scales.ordinal()");
    }

    

    public Ordinal(String jsChart) {
        jsBase = "ordinal" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Extends the current input domain with the passed values (if such don't exist in the domain).
<b>Note:</b> Attention! {@link anychart.scales.Base#finishAutoCalc} drops all passed values.
     */
    public com.anychart.scales.Ordinal extendDataRange(String var_args) {
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
     * Returns tick name by its ratio position.
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
    public com.anychart.scales.Ordinal inverted(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", enabled));

        return this;
    }
    /**
     * Getter for scale ticks names.
     */
    public void names() {
        APIlib.getInstance().addJSLine(jsBase + ".names();");
    }
    /**
     * Setter for scale ticks names.
     */
    public com.anychart.scales.Ordinal names(String[] names) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".names(%s);", arrayToStringWrapQuotes(names)));

        return this;
    }
    /**
     * Setter for scale ticks names.
     */
    public com.anychart.scales.Ordinal names(String names) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".names(%s);", wrapQuotes(names)));

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
    public com.anychart.scales.Ordinal startAutoCalc() {
        APIlib.getInstance().addJSLine(jsBase + ".startAutoCalc();");

        return this;
    }
    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.OrdinalTicks ticks() {
        return new com.anychart.scales.OrdinalTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.Ordinal ticks(String ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(ticks)));

        return this;
    }
    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public com.anychart.scales.Ordinal ticks(String[] ticks) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(ticks)));

        return this;
    }
    /**
     * Returns tick position ratio by its name.
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void transform(String value, Number subRangeRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s, %s);", wrapQuotes(value), subRangeRatio));
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
     * 
     */
    public com.anychart.scales.Ordinal values(String[] values) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".values(%s);", arrayToStringWrapQuotes(values)));

        return this;
    }
    /**
     * Getter for scale weights.
     */
    public void weights() {
        APIlib.getInstance().addJSLine(jsBase + ".weights();");
    }
    /**
     * Setter for scale weights.
     */
    public com.anychart.scales.Ordinal weights(Number[] weights) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".weights(%s);", Arrays.toString(weights)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.scales.Ordinal values(String values) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".values(%s);", wrapQuotes(values)));

        return this;
    }

}