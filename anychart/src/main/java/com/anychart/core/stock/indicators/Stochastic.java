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
 * Stochastic indicator class.
{docs:Stock_Charts/Technical_Indicators/Stochastic_Oscillator}Learn more about the Stochastic indicator.{docs}
 */
public class Stochastic extends JsObject {

    protected Stochastic() {

    }

    public static Stochastic instantiate() {
        return new Stochastic("new anychart.core.stock.indicators.stochastic()");
    }

    

    public Stochastic(String jsChart) {
        jsBase = "stochastic" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the %D smoothing type.
     */
    public void dMAType() {
        APIlib.getInstance().addJSLine(jsBase + ".dMAType();");
    }
    /**
     * Setter for the %D smoothing type.
     */
    public com.anychart.core.stock.indicators.Stochastic dMAType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dMAType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the %D smoothing type.
     */
    public com.anychart.core.stock.indicators.Stochastic dMAType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dMAType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the %D Period.
     */
    public void dPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".dPeriod();");
    }
    /**
     * Setter for the %D Period.
     */
    public com.anychart.core.stock.indicators.Stochastic dPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator %D Series instance.
     */
    public com.anychart.core.stock.series.Base dSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".dSeries()");
    }
    /**
     * Setter for the indicator %D Series type.
     */
    public com.anychart.core.stock.indicators.Stochastic dSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator %D Series type.
     */
    public com.anychart.core.stock.indicators.Stochastic dSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the %K smoothing period.
     */
    public void kMAPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".kMAPeriod();");
    }
    /**
     * Setter for the %K smoothing period.
     */
    public com.anychart.core.stock.indicators.Stochastic kMAPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMAPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the %K smoothing type.
     */
    public void kMAType() {
        APIlib.getInstance().addJSLine(jsBase + ".kMAType();");
    }
    /**
     * Setter for the %K smoothing type.
     */
    public com.anychart.core.stock.indicators.Stochastic kMAType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMAType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the %K smoothing type.
     */
    public com.anychart.core.stock.indicators.Stochastic kMAType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMAType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the %K Period.
     */
    public void kPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".kPeriod();");
    }
    /**
     * Setter for the %K Period.
     */
    public com.anychart.core.stock.indicators.Stochastic kPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator %K Series instance.
     */
    public com.anychart.core.stock.series.Base kSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".kSeries()");
    }
    /**
     * Setter for the indicator %K Series type.
     */
    public com.anychart.core.stock.indicators.Stochastic kSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator %K Series type.
     */
    public com.anychart.core.stock.indicators.Stochastic kSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kSeries(%s);", wrapQuotes(type)));

        return this;
    }

}