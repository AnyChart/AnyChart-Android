package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Marker palette class.
 */
public class Markers extends CoreBase {

    public Markers() {
        js.setLength(0);
        js.append("var markers").append(++variableIndex).append(" = anychart.palettes.markers();");
        jsBase = "markers" + variableIndex;
    }

    protected Markers(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Markers(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number index;
    private String type;

    /**
     * Setter for type palette markers from list by index.
     */
    public Markers setItemAt(Number index, String type) {
        if (jsBase == null) {
            this.index = index;
            this.type = type;
        } else {
            this.index = index;
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemAt(%s, %s)", index, wrapQuotes(type)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, wrapQuotes(type)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] items;
    private String items1;
    private String var_args;

    /**
     * Setter for markers list of palette.
     */
    public Markers setItems(String[] items, String var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items = items;
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items), wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToStringWrapQuotes(items), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for markers list of palette.
     */
    public Markers setItems(String items1, String var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            
            this.items1 = items1;
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items1), wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", wrapQuotes(items1), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}