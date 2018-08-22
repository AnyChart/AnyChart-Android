package com.anychart.ui;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

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
    public com.anychart.ui.Preloader visible(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".visible(%s);", value));

        return this;
    }

}