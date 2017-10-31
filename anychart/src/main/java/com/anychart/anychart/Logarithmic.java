package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Define Logarithmic scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#log} method.
 */
public class Logarithmic extends ScalesLinear {

    public Logarithmic() {
        js.setLength(0);
        js.append("var logarithmic").append(++variableIndex).append(" = anychart.scales.logarithmic();");
        jsBase = "logarithmic" + variableIndex;
    }

    protected Logarithmic(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Logarithmic(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double logBase;

    /**
     * Setter for Log base value.<br/>
<b>Note:</b> Affects tick values auto calculation.
     */
    public Logarithmic setLogBase(Double logBase) {
        if (jsBase == null) {
            this.logBase = logBase;
        } else {
            this.logBase = logBase;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".logBase(%f)", logBase));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".logBase(%f)", logBase));
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