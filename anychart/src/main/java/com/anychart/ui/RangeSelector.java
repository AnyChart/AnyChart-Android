package com.anychart.ui;

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
 * The RangeSelector class contains methods for configuring range selector in a stock chart.
 */
public class RangeSelector extends JsObject {

    protected RangeSelector() {

    }

    public static RangeSelector instantiate() {
        return new RangeSelector("new anychart.ui.rangeSelector()");
    }

    

    public RangeSelector(String jsChart) {
        jsBase = "rangeSelector" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Disposes range selector.<br/>
Removes it from parent layer, nulls links, removes from DOM.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Returns the editable DOM element or null if this field.
     */
    public void getElement() {
        APIlib.getInstance().addJSLine(jsBase + ".getElement();");
    }
    /**
     * Getter for buttons setup.
     */
    public void ranges() {
        APIlib.getInstance().addJSLine(jsBase + ".ranges();");
    }
    /**
     * Setter for buttons setup.
     */
    public void ranges(com.anychart.ui.rangeselector.Range[] ranges) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ranges(%s);", arrayToString(ranges)));
    }
    /**
     * Renders the range selector.
     */
    public void render(com.anychart.charts.Stock parentElement) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".render(%s);", (parentElement != null) ? parentElement.getJsBase() : null));
    }
    /**
     * Sets stock chart for range selector.
     */
    public void target(com.anychart.charts.Stock chart) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".target(%s);", (chart != null) ? chart.getJsBase() : null));
    }
    /**
     * Getter for the label text.
     */
    public void zoomLabelText() {
        APIlib.getInstance().addJSLine(jsBase + ".zoomLabelText();");
    }
    /**
     * Setter fot the label text.
     */
    public com.anychart.ui.RangeSelector zoomLabelText(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zoomLabelText(%s);", wrapQuotes(text)));

        return this;
    }

}