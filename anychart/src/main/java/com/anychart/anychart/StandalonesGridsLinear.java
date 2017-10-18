package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class StandalonesGridsLinear extends CoreGridsLinear {

    public StandalonesGridsLinear() {

    }

    protected StandalonesGridsLinear(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StandalonesGridsLinear(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Layout layout;
    private String layout1;

    public StandalonesGridsLinear setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public StandalonesGridsLinear setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".layout(%s)", layout1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", layout1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", (layout != null) ? layout.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", layout1);
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
            js.append(generateJSlayout());
            js.append(generateJSlayout1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}