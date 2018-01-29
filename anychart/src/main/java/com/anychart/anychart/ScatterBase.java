package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The ScatterBase class contains methods for configuring all scatter scales (Linear, Logarithmic and DateTime).<br/>
Doesn't declare any ticks, so different scales can declare their own.
 */
public class ScatterBase extends ScalesBase {

    public ScatterBase() {
        js.setLength(0);
        js.append("var scatterBase").append(++variableIndex).append(" = anychart.scales.scatterBase();");
        jsBase = "scatterBase" + variableIndex;
    }

    protected ScatterBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScatterBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number ratio;

    /**
     * Returns tick by its position ratio.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void inverseTransform(Number ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".inverseTransform(%s);", ratio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
                js.setLength(0);
            }
        }
    }

    private Number maxTicksCount;

    /**
     * Setter for the maximum ticks count.<br/>
     */
    public ScatterBase setMaxTicksCount(Number maxTicksCount) {
        if (jsBase == null) {
            this.maxTicksCount = maxTicksCount;
        } else {
            this.maxTicksCount = maxTicksCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxTicksCount(%s)", maxTicksCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxTicksCount(%s);", maxTicksCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maximum;

    /**
     * Setter for the scale maximum.
     */
    public ScatterBase setMaximum(Number maximum) {
        if (jsBase == null) {
            this.maximum = maximum;
        } else {
            this.maximum = maximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximum(%s)", maximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximum(%s);", maximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minimum;

    /**
     * Setter for the scale minimum.
     */
    public ScatterBase setMinimum(Number minimum) {
        if (jsBase == null) {
            this.minimum = minimum;
        } else {
            this.minimum = minimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimum(%s)", minimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimum(%s);", minimum));
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