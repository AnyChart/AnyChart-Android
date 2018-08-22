package com.anychart.core.stock.indicators;

import com.anychart.APIlib;
import com.anychart.JsObject;

// class
/**
 * 
 */
public class Base extends JsObject {

    protected Base() {

    }

    public static Base instantiate() {
        return new Base("new anychart.core.stock.indicators.base()");
    }

    

    public Base(String jsChart) {
        jsBase = "base" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    

}