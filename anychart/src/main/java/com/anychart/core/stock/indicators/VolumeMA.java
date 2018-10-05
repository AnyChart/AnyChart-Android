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
 * Volume + MA indicator class.
 */
public class VolumeMA extends JsObject {

    protected VolumeMA() {

    }

    public static VolumeMA instantiate() {
        return new VolumeMA("new anychart.core.stock.indicators.volumeMA()");
    }

    

    public VolumeMA(String jsChart) {
        jsBase = "volumeMA" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the Moving Average period.
     */
    public void maPeriod() {
        APIlib.getInstance().addJSLine(jsBase + ".maPeriod();");
    }
    /**
     * Setter for the Moving Average period.
     */
    public com.anychart.core.stock.indicators.VolumeMA maPeriod(Number period) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maPeriod(%s);", period));

        return this;
    }
    /**
     * Getter for the indicator moving average series instance.
     */
    public com.anychart.core.stock.series.Base maSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".maSeries()");
    }
    /**
     * Setter for the indicator moving average series type.
     */
    public com.anychart.core.stock.indicators.Base maSeries(com.anychart.enums.StockSeriesType type) {
        return new com.anychart.core.stock.indicators.Base(String.format(Locale.US, jsBase + ".maSeries(%s)", (type != null) ? type.getJsBase() : null));
    }
    /**
     * Setter for the indicator moving average series type.
     */
    public com.anychart.core.stock.indicators.Base maSeries(String type) {
        return new com.anychart.core.stock.indicators.Base(String.format(Locale.US, jsBase + ".maSeries(%s)", wrapQuotes(type)));
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
    public com.anychart.core.stock.indicators.VolumeMA maType(com.anychart.enums.MovingAverageType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the smoothing type.
     */
    public com.anychart.core.stock.indicators.VolumeMA maType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Getter for the indicator volume series instance.
     */
    public com.anychart.core.stock.series.Base volumeSeries() {
        return new com.anychart.core.stock.series.Base(jsBase + ".volumeSeries()");
    }
    /**
     * Setter for the indicator volume series type.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeSeries(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".volumeSeries(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the indicator volume series type.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeSeries(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".volumeSeries(%s);", wrapQuotes(type)));

        return this;
    }

}