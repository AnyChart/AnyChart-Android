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
 * DMI indicator class.
{docs:Stock_Charts/Technical_Indicators/Directional_Movement_Index_(DMI)}Learn more about the DMI indicator.{docs}
 */
public class DMI extends JsObject {

    protected DMI() {

    }

    public static DMI instantiate() {
        return new DMI("new anychart.core.stock.indicators.dMI()");
    }

    

    public DMI(String jsChart) {
        jsBase = "dMI" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the ADX period.
     */
    public void adxPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".adxPeriod();");
    }
    /**
     * Setter for the ADX period.
     */
    public com.anychart.core.stock.indicators.DMI adxPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adxPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator ADX series instance.
     */
    public com.anychart.core.stock.series.Base adxSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".adxSeries()");
    }
    /**
     * Setter for the indicator ADX series type.
     */
    public com.anychart.core.stock.indicators.DMI adxSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adxSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator ADX series type.
     */
    public com.anychart.core.stock.indicators.DMI adxSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adxSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator -DI series instance.
     */
    public com.anychart.core.stock.series.Base ndiSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".ndiSeries()");
    }
    /**
     * Setter for the indicator -DI series type.
     */
    public com.anychart.core.stock.indicators.DMI ndiSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ndiSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator -DI series type.
     */
    public com.anychart.core.stock.indicators.DMI ndiSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ndiSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator +DI series instance.
     */
    public com.anychart.core.stock.series.Base pdiSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".pdiSeries()");
    }
    /**
     * Setter for the indicator +DI series type.
     */
    public com.anychart.core.stock.indicators.DMI pdiSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pdiSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator +DI series type.
     */
    public com.anychart.core.stock.indicators.DMI pdiSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pdiSeries(%s);", wrapQuotes(type)));

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
    public com.anychart.core.stock.indicators.DMI period(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", period));

        return this;
    }
    /**
     * Getter for the Wilders smoothing.
     */
    public void useWildersSmoothing() {
        APIlib.getInstance().addJSLine(jsBase + ".useWildersSmoothing();");
    }
    /**
     * Getter and setter for the Wilders smoothing.
     */
    public com.anychart.core.stock.indicators.DMI useWildersSmoothing(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useWildersSmoothing(%s);", enabled));

        return this;
    }

}