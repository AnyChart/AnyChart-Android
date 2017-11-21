package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Marker palette.
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

    
    private Double index;
    private String type;
    private List<Markers> setItemAt = new ArrayList<>();

    /**
     * Setter for type palette markers from list by index.
     */
    public Markers setItemAt(Double index, String type) {
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
            
            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index, wrapQuotes(type)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index, wrapQuotes(type)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt() {
        if (!setItemAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Markers item : setItemAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] items;
    private String items1;
    private String var_args;
    private List<Markers> setItems = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems() {
        if (!setItems.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Markers item : setItems) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Markers> setItems1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items1), wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems1() {
        if (!setItems1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Markers item : setItems1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetItemAt());
        js.append(generateJSsetItems());
        js.append(generateJSsetItems1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}