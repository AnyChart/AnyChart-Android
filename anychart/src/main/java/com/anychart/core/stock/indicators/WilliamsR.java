package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Williams %R (%R) indicator class.
 */
public class WilliamsR extends JsObject {

    protected WilliamsR() {

    }

    public static WilliamsR instantiate() {
        return new WilliamsR("new anychart.core.stock.indicators.williamsR()");
    }

    

    public WilliamsR(String jsChart) {
        jsBase = "williamsR" + ++variableIndex;
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
    public com.anychart.core.stock.indicators.MFI period(Number value) {
        return new com.anychart.core.stock.indicators.MFI(String.format(Locale.US, jsBase + ".period(%s)", value));
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
    public com.anychart.core.stock.indicators.WilliamsR series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series.
     */
    public com.anychart.core.stock.indicators.WilliamsR series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}