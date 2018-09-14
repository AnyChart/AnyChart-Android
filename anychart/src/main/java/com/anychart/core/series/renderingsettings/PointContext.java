package com.anychart.core.series.renderingsettings;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.series.renderingsettings.Context;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Rendering functions context.
 */
public class PointContext extends Context {

    protected PointContext() {

    }

    public static PointContext instantiate() {
        return new PointContext("new anychart.core.series.RenderingSettings.pointContext()");
    }

    

    public PointContext(String jsChart) {
        jsBase = "pointContext" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns data value by name.
     */
    public void getDataValue(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getDataValue(%s);", wrapQuotes(name)));
    }
    /**
     * Returns stacked value if the series is stacked.
     */
    public void getStackedValue() {
        APIlib.getInstance().addJSLine(jsBase + ".getStackedValue();");
    }
    /**
     * Returns stacked zero value if the series is stacked.
     */
    public void getStackedZero() {
        APIlib.getInstance().addJSLine(jsBase + ".getStackedZero();");
    }
    /**
     * Fetch statistics value by its key or a whole object if no key provided.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }

}