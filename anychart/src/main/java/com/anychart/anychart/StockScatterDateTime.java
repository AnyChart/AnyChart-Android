package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock scatter datetime scale class.
 */
public class StockScatterDateTime extends CoreBase {

    public StockScatterDateTime() {
        js.setLength(0);
        js.append("var stockScatterDateTime").append(++variableIndex).append(" = anychart.scales.stockScatterDateTime();");
        jsBase = "stockScatterDateTime" + variableIndex;
    }

    protected StockScatterDateTime(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockScatterDateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double ratio;

    /**
     * Processes reverse transformation of the ratio backward to value.
     */
    public void inverseTransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f)", ratio));
                js.setLength(0);
            }
        }
    }

    private Double transform;
    private String transform1;

    /**
     * Transforms values to ratio.
     */
    public void transform(Double transform) {
        if (jsBase == null) {
            this.transform = null;
            this.transform1 = null;
            
            this.transform = transform;
        } else {
            this.transform = transform;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%f)", transform));
                js.setLength(0);
            }
        }
    }


    /**
     * Transforms values to ratio.
     */
    public void transform(String transform1) {
        if (jsBase == null) {
            this.transform = null;
            this.transform1 = null;
            
            this.transform1 = transform1;
        } else {
            this.transform1 = transform1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%s)", wrapQuotes(transform1)));
                js.setLength(0);
            }
        }
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