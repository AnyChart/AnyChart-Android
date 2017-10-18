package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Thermometer extends LineargaugePointersBase {

    public Thermometer() {

    }

    protected Thermometer(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Thermometer(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String bulbPadding;
    private Double bulbPadding1;

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

            js.append(String.format(Locale.US, ".bulbPadding(%s)", bulbPadding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bulbPadding(%s)", bulbPadding));
                js.setLength(0);
            }
        }
        return this;
    }


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

    private String bulbRadius;

    public Thermometer setBulbRadius(String bulbRadius) {
        if (jsBase == null) {
            this.bulbRadius = bulbRadius;
        } else {
            this.bulbRadius = bulbRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bulbRadius(%s)", bulbRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bulbRadius(%s)", bulbRadius));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSbulbPadding() {
        if (bulbPadding != null) {
            return String.format(Locale.US, "bulbPadding: %s,", bulbPadding);
        }
        return "";
    }

    private String generateJSbulbPadding1() {
        if (bulbPadding1 != null) {
            return String.format(Locale.US, "bulbPadding: %f,", bulbPadding1);
        }
        return "";
    }

    private String generateJSbulbRadius() {
        if (bulbRadius != null) {
            return String.format(Locale.US, "bulbRadius: %s,", bulbRadius);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSbulbPadding());
            js.append(generateJSbulbPadding1());
            js.append(generateJSbulbRadius());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}