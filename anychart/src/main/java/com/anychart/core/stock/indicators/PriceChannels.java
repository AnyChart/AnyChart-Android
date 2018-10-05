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
 * Price Channels indicator class.
 */
public class PriceChannels extends JsObject {

    protected PriceChannels() {

    }

    public static PriceChannels instantiate() {
        return new PriceChannels("new anychart.core.stock.indicators.priceChannels()");
    }

    

    public PriceChannels(String jsChart) {
        jsBase = "priceChannels" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the indicator middle series instance.
     */
    public com.anychart.core.stock.series.Base middleSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".middleSeries()");
    }
    /**
     * Setter for the indicator middle series type.
     */
    public com.anychart.core.stock.indicators.PriceChannels middleSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator middle series type.
     */
    public com.anychart.core.stock.indicators.PriceChannels middleSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the period.
     */
    public void period() {
        APIlib.getInstance().addJSLine(jsBase + ".period();");
    }
    /**
     * Setter for the period.
     */
    public com.anychart.core.stock.indicators.PriceChannels period(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator range series instance.
     */
    public com.anychart.core.stock.series.Base rangeSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".rangeSeries()");
    }
    /**
     * Setter for the indicator range series type.
     */
    public com.anychart.core.stock.indicators.PriceChannels rangeSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator range series type.
     */
    public com.anychart.core.stock.indicators.PriceChannels rangeSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeSeries(%s);", wrapQuotes(type)));

        return this;
    }

}