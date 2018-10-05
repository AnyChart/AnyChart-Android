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
 * The Preloader class contains methods for configuring preloader.
 */
public class Preloader extends JsObject {

    protected Preloader() {

    }

    public static Preloader instantiate() {
        return new Preloader("new anychart.ui.preloader()");
    }

    

    public Preloader(String jsChart) {
        jsBase = "preloader" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the visibility of the preloader.
     */
    public void visible() {
        APIlib.getInstance().addJSLine(jsBase + ".visible();");
    }
    /**
     * Setter for the visibility of the preloader.
     */
    public com.anychart.ui.Preloader visible(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".visible(%s);", enabled));

        return this;
    }

}