package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CartesianSeriesRangeStepArea extends ContinuousRangeBase {

    public CartesianSeriesRangeStepArea() {

    }

    protected CartesianSeriesRangeStepArea(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CartesianSeriesRangeStepArea(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private StepDirection stepDirection;
    private String stepDirection1;

    public CartesianSeriesRangeStepArea setStepDirection(StepDirection stepDirection) {
        if (jsBase == null) {
            this.stepDirection = null;
            this.stepDirection1 = null;
            
            this.stepDirection = stepDirection;
        } else {
            this.stepDirection = stepDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stepDirection(%s)", (stepDirection != null) ? stepDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stepDirection(%s)", (stepDirection != null) ? stepDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CartesianSeriesRangeStepArea setStepDirection(String stepDirection1) {
        if (jsBase == null) {
            this.stepDirection = null;
            this.stepDirection1 = null;
            
            this.stepDirection1 = stepDirection1;
        } else {
            this.stepDirection1 = stepDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".stepDirection(%s)", stepDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stepDirection(%s)", stepDirection1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSstepDirection() {
        if (stepDirection != null) {
            return String.format(Locale.US, "stepDirection: %s,", (stepDirection != null) ? stepDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstepDirection1() {
        if (stepDirection1 != null) {
            return String.format(Locale.US, "stepDirection: %s,", stepDirection1);
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
            js.append(generateJSstepDirection());
            js.append(generateJSstepDirection1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}