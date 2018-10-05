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
 * TRIX indicator class.
 */
public class TRIX extends JsObject {

    protected TRIX() {

    }

    public static TRIX instantiate() {
        return new TRIX("new anychart.core.stock.indicators.tRIX()");
    }

    

    public TRIX(String jsChart) {
        jsBase = "tRIX" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the smoothing type.
     */
    public void maType() {
        APIlib.getInstance().addJSLine(jsBase + ".maType();");
    }
    /**
     * Setter for the smoothing type.
     */
    public com.anychart.core.stock.indicators.TRIX maType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the smoothing type.
     */
    public com.anychart.core.stock.indicators.TRIX maType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", wrapQuotes(type)));

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
    public com.anychart.core.stock.indicators.TRIX period(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".period(%s);", period));

        return this;
    }
    /**
     * Getter for the signal smoothing type.
     */
    public void signalMaType() {
        APIlib.getInstance().addJSLine(jsBase + ".signalMaType();");
    }
    /**
     * Setter for the signal smoothing type.
     */
    public com.anychart.core.stock.indicators.TRIX signalMaType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalMaType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Setter for the signal smoothing type.
     */
    public com.anychart.core.stock.indicators.TRIX signalMaType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalMaType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the signal period.
     */
    public void signalPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".signalPeriod();");
    }
    /**
     * Setter for the signal period.
     */
    public com.anychart.core.stock.indicators.TRIX signalPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator signal series instance.
     */
    public com.anychart.core.stock.series.Base signalSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".signalSeries()");
    }
    /**
     * Setter for the indicator signal series type.
     */
    public com.anychart.core.stock.indicators.TRIX signalSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator signal series type.
     */
    public com.anychart.core.stock.indicators.TRIX signalSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".signalSeries(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator TRIX series instance.
     */
    public com.anychart.core.stock.series.Base trixSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".trixSeries()");
    }
    /**
     * Setter for the indicator TRIX series type.
     */
    public com.anychart.core.stock.indicators.TRIX trixSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".trixSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator TRIX series type.
     */
    public com.anychart.core.stock.indicators.TRIX trixSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".trixSeries(%s);", wrapQuotes(type)));

        return this;
    }

}