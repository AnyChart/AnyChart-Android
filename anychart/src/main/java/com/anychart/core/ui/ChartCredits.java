package com.anychart.core.ui;

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
 * Define class Credits.<br/>
<b>Note:</b> Use {@link anychart.ui#credits} method to create instance of this class.<br/>
<b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
 */
public class ChartCredits extends Base {

    protected ChartCredits() {

    }

    public static ChartCredits instantiate() {
        return new ChartCredits("new anychart.core.ui.chartCredits()");
    }

    

    public ChartCredits(String jsChart) {
        jsBase = "chartCredits" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for credits alt.
     */
    public void alt() {
        APIlib.getInstance().addJSLine(jsBase + ".alt();");
    }
    /**
     * Setter for credits alt.
     */
    public com.anychart.core.ui.ChartCredits alt(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alt(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Getter for the credits state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the credits state.
     */
    public com.anychart.core.ui.ChartCredits enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the image alternative text.
     */
    public void imgAlt() {
        APIlib.getInstance().addJSLine(jsBase + ".imgAlt();");
    }
    /**
     * Setter for the image alternative text.
     */
    public com.anychart.core.ui.ChartCredits imgAlt(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".imgAlt(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Getter for credits logo source value.
     */
    public void logoSrc() {
        APIlib.getInstance().addJSLine(jsBase + ".logoSrc();");
    }
    /**
     * Setter for credits logo source value.<br/>
<b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
     */
    public com.anychart.core.ui.ChartCredits logoSrc(String logoSrc) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".logoSrc(%s);", wrapQuotes(logoSrc)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for credits text value.
     */
    public void text() {
        APIlib.getInstance().addJSLine(jsBase + ".text();");
    }
    /**
     * Setter for credits text value.
     */
    public com.anychart.core.ui.ChartCredits text(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".text(%s);", wrapQuotes(text)));

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
    /**
     * Getter for the credits URL.
     */
    public void url() {
        APIlib.getInstance().addJSLine(jsBase + ".url();");
    }
    /**
     * Setter for the credits URL.
     */
    public com.anychart.core.ui.ChartCredits url(String url) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".url(%s);", wrapQuotes(url)));

        return this;
    }

}