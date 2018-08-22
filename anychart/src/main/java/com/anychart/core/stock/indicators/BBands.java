package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

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
    public com.anychart.core.stock.indicators.BBands deviation(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".deviation(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator Lower Series.
     */
    public com.anychart.core.stock.series.Base lowerSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".lowerSeries()");
    }
    /**
     * Setter for the indicator Lower Series.
     */
    public com.anychart.core.stock.indicators.BBands lowerSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lowerSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Lower Series.
     */
    public com.anychart.core.stock.indicators.BBands lowerSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lowerSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator Middle Series.
     */
    public com.anychart.core.stock.series.Base middleSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".middleSeries()");
    }
    /**
     * Setter for the indicator Middle Series.
     */
    public com.anychart.core.stock.indicators.BBands middleSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".middleSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Middle Series.
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
    public com.anychart.core.stock.indicators.BBands period(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator Upper Series.
     */
    public com.anychart.core.stock.series.Base upperSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".upperSeries()");
    }
    /**
     * Setter for the indicator Upper Series.
     */
    public com.anychart.core.stock.indicators.BBands upperSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upperSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator Upper Series.
     */
    public com.anychart.core.stock.indicators.BBands upperSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".upperSeries(%s);", wrapQuotes(type)));

        return this;
    }

}