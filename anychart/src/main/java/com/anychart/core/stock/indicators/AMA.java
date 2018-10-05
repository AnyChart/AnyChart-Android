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
 * Adaptive Moving Average (AMA) indicator class.
{docs:Stock_Charts/Technical_Indicators/Adaptive_Moving_Average_(AMA)}Learn more about the AMA indicator.{docs}
 */
public class AMA extends JsObject {

    protected AMA() {

    }

    public static AMA instantiate() {
        return new AMA("new anychart.core.stock.indicators.aMA()");
    }

    

    public AMA(String jsChart) {
        jsBase = "aMA" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the fast indicator period.
     */
    public void fastPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".fastPeriod();");
    }
    /**
     * Setter for the fast indicator period.
     */
    public com.anychart.core.stock.indicators.AMA fastPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fastPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator period.
     */
    public void period() {
        APIlib.getInstance().addJSLine(jsBase + ".period();");
    }
    /**
     * Setter for the indicator period.
     */
    public com.anychart.core.stock.indicators.AMA period(Number period) {
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
    public com.anychart.core.stock.indicators.AMA series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.AMA series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the slow indicator period.
     */
    public void slowPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".slowPeriod();");
    }
    /**
     * Setter for the slow indicator period.
     */
    public com.anychart.core.stock.indicators.AMA slowPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".slowPeriod(%s);", period));

        return this;
    }

}