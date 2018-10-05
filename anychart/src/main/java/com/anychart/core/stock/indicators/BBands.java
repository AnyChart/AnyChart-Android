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
 * Bollinger Bands (BBands) indicator class.
 */
public class BBands extends JsObject {

    protected BBands() {

    }

    public static BBands instantiate() {
        return new BBands("new anychart.core.stock.indicators.bBands()");
    }

    

    public BBands(String jsChart) {
        jsBase = "bBands" + ++variableIndex;
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
    public com.anychart.core.stock.indicators.BBands deviation(Number deviation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".deviation(%s);", deviation));

        return this;
    }
    /**
     * Getter for the indicator Lower Series instance.
     */
    public com.anychart.core.stock.series.Base lowerSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".lowerSeries()");
    }
    /**
     * Setter for the indicator Lower Series type.
     */
    public com.anychart.core.stock.indicators.BBands lowerSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lowerSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Lower Series type.
     */
    public com.anychart.core.stock.indicators.BBands lowerSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lowerSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator Middle Series instance.
     */
    public com.anychart.core.stock.series.Base middleSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".middleSeries()");
    }
    /**
     * Setter for the indicator Middle Series type.
     */
    public com.anychart.core.stock.indicators.BBands middleSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Middle Series type.
     */
    public com.anychart.core.stock.indicators.BBands middleSeries(String type) {
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
    public com.anychart.core.stock.indicators.BBands period(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator Range Series instance.
     */
    public com.anychart.core.stock.series.Base rangeSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".rangeSeries()");
    }
    /**
     * Setter for the indicator Range Series type.
     */
    public com.anychart.core.stock.indicators.BBands rangeSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Range Series type.
     */
    public com.anychart.core.stock.indicators.BBands rangeSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator Upper Series instance.
     */
    public com.anychart.core.stock.series.Base upperSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".upperSeries()");
    }
    /**
     * Setter for the indicator Upper Series type.
     */
    public com.anychart.core.stock.indicators.BBands upperSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upperSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Upper Series type.
     */
    public com.anychart.core.stock.indicators.BBands upperSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upperSeries(%s);", wrapQuotes(type)));

        return this;
    }

}