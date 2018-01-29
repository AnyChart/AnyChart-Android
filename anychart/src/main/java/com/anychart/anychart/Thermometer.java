package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
    private Number bulbPadding1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bulbPadding(%s);", wrapQuotes(bulbPadding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the bulb padding.
     */
    public Thermometer setBulbPadding(Number bulbPadding1) {
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
            
            js.append(String.format(Locale.US, ".bulbPadding(%s)", bulbPadding1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bulbPadding(%s);", bulbPadding1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String bulbRadius;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bulbRadius(%s);", wrapQuotes(bulbRadius)));
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