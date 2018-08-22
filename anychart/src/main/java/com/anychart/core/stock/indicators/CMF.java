package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Chaikin Money Flow (CMF) indicator class.
{docs:Stock_Charts/Technical_Indicators/Chaikin_Money_Flow_(CMF)}Learn more about the CMF indicator.{docs}
 */
public class CMF extends JsObject {

    protected CMF() {

    }

    public static CMF instantiate() {
        return new CMF("new anychart.core.stock.indicators.cMF()");
    }

    

    public CMF(String jsChart) {
        jsBase = "cMF" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
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
    public com.anychart.core.stock.indicators.CMF period(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", value));

        return this;
    }
    /**
     * Getter for the indicator series.
     */
    public com.anychart.core.stock.series.Base series() {
        return new com.anychart.core.stock.series.Base(jsBase + ".series()");
    }
    /**
     * Setter for the indicator series.
     */
    public com.anychart.core.stock.indicators.CMF series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series.
     */
    public com.anychart.core.stock.indicators.CMF series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}