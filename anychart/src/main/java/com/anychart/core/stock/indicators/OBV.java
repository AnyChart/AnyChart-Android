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
 * OBV indicator class.
 */
public class OBV extends JsObject {

    protected OBV() {

    }

    public static OBV instantiate() {
        return new OBV("new anychart.core.stock.indicators.oBV()");
    }

    

    public OBV(String jsChart) {
        jsBase = "oBV" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
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
    public com.anychart.core.stock.indicators.OBV series(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Setter for the indicator series type.
     */
    public com.anychart.core.stock.indicators.OBV series(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }

}