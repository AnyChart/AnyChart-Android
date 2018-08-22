package com.anychart.core.ui.table;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Padding settings proxy. Doesn't store anything - just passes settings to and from the parent object.
 */
public class Padding extends JsObject {

    protected Padding() {

    }

    public static Padding instantiate() {
        return new Padding("new anychart.core.ui.table.padding()");
    }

    

    public Padding(String jsChart) {
        jsBase = "padding" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for bottom padding.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for bottom padding.
     */
    public com.anychart.core.ui.table.Padding bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for bottom padding.
     */
    public com.anychart.core.ui.table.Padding bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for left padding.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for left padding.
     */
    public com.anychart.core.ui.table.Padding left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for left padding.
     */
    public com.anychart.core.ui.table.Padding left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for right padding.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for right padding.
     */
    public com.anychart.core.ui.table.Padding right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for right padding.
     */
    public com.anychart.core.ui.table.Padding right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for top padding.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for top padding.
     */
    public com.anychart.core.ui.table.Padding top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for top padding.
     */
    public com.anychart.core.ui.table.Padding top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }

}