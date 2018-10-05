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
 * KDJ indicator class.
{docs:Stock_Charts/Technical_Indicators/KDJ}Learn more about the KDJ indicator.{docs}
 */
public class KDJ extends JsObject {

    protected KDJ() {

    }

    public static KDJ instantiate() {
        return new KDJ("new anychart.core.stock.indicators.kDJ()");
    }

    

    public KDJ(String jsChart) {
        jsBase = "kDJ" + ++variableIndex;
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
    public com.anychart.core.stock.indicators.KDJ dMAType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dMAType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the %D smoothing type.
     */
    public com.anychart.core.stock.indicators.KDJ dMAType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dMAType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the %D multiplier.
     */
    public void dMultiplier() {
        APIlib.getInstance().addJSLine(jsBase + ".dMultiplier();");
    }
    /**
     * Setter for the %D multiplier.
     */
    public com.anychart.core.stock.indicators.KDJ dMultiplier(Number multiplier) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dMultiplier(%s);", multiplier));

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
    public com.anychart.core.stock.indicators.KDJ dPeriod(Number period) {
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
    public com.anychart.core.stock.indicators.KDJ dSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator %D Series type.
     */
    public com.anychart.core.stock.indicators.KDJ dSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator %J Series instance.
     */
    public com.anychart.core.stock.series.Base jSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".jSeries()");
    }
    /**
     * Setter for the indicator %J Series type.
     */
    public com.anychart.core.stock.indicators.KDJ jSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".jSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator %J Series type.
     */
    public com.anychart.core.stock.indicators.KDJ jSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".jSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the %K smoothing period.
     */
    public void kMAPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".kMAPeriod();");
    }
    /**
     * Getter and setter for the %K smoothing period.
     */
    public com.anychart.core.stock.indicators.KDJ kMAPeriod(Number period) {
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
    public com.anychart.core.stock.indicators.KDJ kMAType(com.anychart.enums.MovingAverageType period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMAType(%s);", (period != null) ? period.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the %K smoothing type.
     */
    public com.anychart.core.stock.indicators.KDJ kMAType(String period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMAType(%s);", wrapQuotes(period)));

        return this;
    }
    /**
     * Getter for the %K multiplier.
     */
    public void kMultiplier() {
        APIlib.getInstance().addJSLine(jsBase + ".kMultiplier();");
    }
    /**
     * Setter for the %K multiplier.
     */
    public com.anychart.core.stock.indicators.KDJ kMultiplier(Number multiplier) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kMultiplier(%s);", multiplier));

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
    public com.anychart.core.stock.indicators.KDJ kPeriod(Number period) {
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
    public com.anychart.core.stock.indicators.KDJ kSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator %K Series type.
     */
    public com.anychart.core.stock.indicators.KDJ kSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".kSeries(%s);", wrapQuotes(type)));

        return this;
    }

}