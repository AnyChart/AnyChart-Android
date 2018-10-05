package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Bollinger Bands %B (BBands %B) indicator class.
 */
public class BBandsB extends JsObject {

    protected BBandsB() {

    }

    public static BBandsB instantiate() {
        return new BBandsB("new anychart.core.stock.indicators.bBandsB()");
    }

    

    public BBandsB(String jsChart) {
        jsBase = "bBandsB" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the deviation.
     */
    public void deviation() {
        APIlib.getInstance().addJSLine(jsBase + ".deviation();");
    }
    /**
     * Setter for the deviation.
     */
    public void deviation(Number deviation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".deviation(%s);", deviation));
    }
    /**
     * Getter for the period.
     */
    public void period() {
        APIlib.getInstance().addJSLine(jsBase + ".period();");
    }
    /**
     * Getter and setter for the period.
     */
    public com.anychart.core.stock.indicators.BBandsB period(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator series instance.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.BBandsB series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.BBandsB series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}