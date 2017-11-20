package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Thermometer pointer class.
 */
public class Thermometer extends LineargaugePointersBase {

    public Thermometer() {
        js.setLength(0);
        js.append("var thermometer").append(++variableIndex).append(" = anychart.core.linearGauge.pointers.thermometer();");
        jsBase = "thermometer" + variableIndex;
    }

    protected Thermometer(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Thermometer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String bulbPadding;
    private Double bulbPadding1;
    private List<Thermometer> setBulbPadding = new ArrayList<>();

    /**
     * Setter for the bulb padding.
     */
    public Thermometer setBulbPadding(String bulbPadding) {
        if (jsBase == null) {
            this.bulbPadding = null;
            this.bulbPadding1 = null;
            
            this.bulbPadding = bulbPadding;
        } else {
            this.bulbPadding = bulbPadding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bulbPadding(%s)", wrapQuotes(bulbPadding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bulbPadding(%s)", wrapQuotes(bulbPadding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBulbPadding() {
        if (!setBulbPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Thermometer item : setBulbPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Thermometer> setBulbPadding1 = new ArrayList<>();

    /**
     * Setter for the bulb padding.
     */
    public Thermometer setBulbPadding(Double bulbPadding1) {
        if (jsBase == null) {
            this.bulbPadding = null;
            this.bulbPadding1 = null;
            
            this.bulbPadding1 = bulbPadding1;
        } else {
            this.bulbPadding1 = bulbPadding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bulbPadding(%f)", bulbPadding1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bulbPadding(%f)", bulbPadding1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBulbPadding1() {
        if (!setBulbPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Thermometer item : setBulbPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String bulbRadius;
    private List<Thermometer> setBulbRadius = new ArrayList<>();

    /**
     * Setter for the bulb radius.
     */
    public Thermometer setBulbRadius(String bulbRadius) {
        if (jsBase == null) {
            this.bulbRadius = bulbRadius;
        } else {
            this.bulbRadius = bulbRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bulbRadius(%s)", wrapQuotes(bulbRadius)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bulbRadius(%s)", wrapQuotes(bulbRadius)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBulbRadius() {
        if (!setBulbRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Thermometer item : setBulbRadius) {
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

        js.append(generateJSsetBulbPadding());
        js.append(generateJSsetBulbPadding1());
        js.append(generateJSsetBulbRadius());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}