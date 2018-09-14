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
 * The Zoom class contains methods for configuring zoom ui element.
 */
public class Zoom extends JsObject {

    protected Zoom() {

    }

    public static Zoom instantiate() {
        return new Zoom("new anychart.ui.zoom()");
    }

    

    public Zoom(String jsChart) {
        jsBase = "zoom" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Disposes zoom controller.<br/>
Removes it from parent layer, nulls links, removes from DOM.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Renders the zoom controller.
     */
    public void render(com.anychart.charts.Map parentElement) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".render(%s);", (parentElement != null) ? parentElement.getJsBase() : null));
    }
    /**
     * Set Map chart for zoom controller.
     */
    public void target(com.anychart.charts.Map chart) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".target(%s);", (chart != null) ? chart.getJsBase() : null));
    }

}