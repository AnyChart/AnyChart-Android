package com.anychart.format;

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
 * The Context class contains methods to show some information from extra fields in the format function context.
 */
public class Context extends JsObject {

    protected Context() {

    }

    public static Context instantiate() {
        return new Context("new anychart.format.context()");
    }

    

    public Context(String jsChart) {
        jsBase = "context" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Gets data value by the single parameter.
     */
    public void getData(String fieldPath) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getData(%s);", wrapQuotes(fieldPath)));
    }
    /**
     * Gets meta value.
     */
    public void getMeta(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getMeta(%s);", wrapQuotes(name)));
    }
    /**
     * Gets statistics value by key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }

}