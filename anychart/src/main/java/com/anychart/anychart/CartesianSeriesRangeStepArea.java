package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * RangeStepArea Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian#rangeStepArea} method to get this series.<br/>
{docs:/Basic_Charts/Range_Step_Area_Chart}Learn more about RangeStepArea series{docs}
 */
public class CartesianSeriesRangeStepArea extends ContinuousRangeBase {

    public CartesianSeriesRangeStepArea() {
        js.setLength(0);
        js.append("var cartesianSeriesRangeStepArea").append(++variableIndex).append(" = anychart.core.cartesian.series.rangeStepArea();");
        jsBase = "cartesianSeriesRangeStepArea" + variableIndex;
    }

    protected CartesianSeriesRangeStepArea(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesRangeStepArea(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private StepDirection stepDirection;
    private String stepDirection1;

    /**
     * Setter for the step direction.
     */
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
            
            js.append(String.format(Locale.US, ".stepDirection(%s)", ((stepDirection != null) ? stepDirection.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepDirection(%s);", ((stepDirection != null) ? stepDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the step direction.
     */
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
            
            js.append(String.format(Locale.US, ".stepDirection(%s)", wrapQuotes(stepDirection1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepDirection(%s);", wrapQuotes(stepDirection1)));
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