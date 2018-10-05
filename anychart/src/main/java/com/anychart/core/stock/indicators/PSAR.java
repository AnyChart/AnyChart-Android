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
 * Parabolic SAR (PSAR) indicator class.
 */
public class PSAR extends JsObject {

    protected PSAR() {

    }

    public static PSAR instantiate() {
        return new PSAR("new anychart.core.stock.indicators.pSAR()");
    }

    

    public PSAR(String jsChart) {
        jsBase = "pSAR" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the acceleration factor increment value.
     */
    public void accelerationFactorIncrement() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorIncrement();");
    }
    /**
     * Setter for the acceleration factor increment value.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorIncrement(Number factor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorIncrement(%s);", factor));

        return this;
    }
    /**
     * Getter for the acceleration factor maximum.
     */
    public void accelerationFactorMaximum() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorMaximum();");
    }
    /**
     * Setter for the acceleration factor maximum.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorMaximum(Number factor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorMaximum(%s);", factor));

        return this;
    }
    /**
     * Getter for the acceleration factor start.
     */
    public void accelerationFactorStart() {
        APIlib.getInstance().addJSLine(jsBase + ".accelerationFactorStart();");
    }
    /**
     * Setter for the acceleration factor start.
     */
    public com.anychart.core.stock.indicators.PSAR accelerationFactorStart(Number factor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".accelerationFactorStart(%s);", factor));

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
    public com.anychart.core.stock.indicators.PSAR series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.PSAR series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }

}