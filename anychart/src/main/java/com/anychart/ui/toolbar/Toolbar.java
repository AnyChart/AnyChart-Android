package com.anychart.ui.toolbar;

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
 * 
 */
public class Toolbar extends JsObject {

    protected Toolbar() {

    }

    public static Toolbar instantiate() {
        return new Toolbar("new anychart.ui.toolbar.toolbar()");
    }

    

    public Toolbar(String jsChart) {
        jsBase = "toolbar" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * 
     */
    public com.anychart.ui.toolbar.Toolbar container(String element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(element)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.ui.toolbar.Toolbar draw() {
        APIlib.getInstance().addJSLine(jsBase + ".draw();");

        return this;
    }
    /**
     * 
     */
    public com.anychart.ui.toolbar.Toolbar target(com.anychart.core.Chart value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".target(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }

}