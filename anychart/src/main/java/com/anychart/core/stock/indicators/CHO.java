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
 * CHO indicator class.
{docs:Stock_Charts/Technical_Indicators/Chaikin_Oscillator_(CHO)}Learn more about the CHO indicator.{docs}
 */
public class CHO extends JsObject {

    protected CHO() {

    }

    public static CHO instantiate() {
        return new CHO("new anychart.core.stock.indicators.cHO()");
    }

    

    public CHO(String jsChart) {
        jsBase = "cHO" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the fast period.
     */
    public void fastPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".fastPeriod();");
    }
    /**
     * Setter for the fast period.
     */
    public com.anychart.core.stock.indicators.CHO fastPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fastPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator smoothing type.
     */
    public void maType() {
        APIlib.getInstance().addJSLine(jsBase + ".maType();");
    }
    /**
     * Setter for the indicator smoothing type.
     */
    public com.anychart.core.stock.indicators.CHO maType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator smoothing type.
     */
    public com.anychart.core.stock.indicators.CHO maType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", wrapQuotes(type)));

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
    public com.anychart.core.stock.indicators.CHO series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.CHO series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the slow period.
     */
    public void slowPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".slowPeriod();");
    }
    /**
     * Setter for the slow period.
     */
    public com.anychart.core.stock.indicators.CHO slowPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".slowPeriod(%s);", period));

        return this;
    }

}