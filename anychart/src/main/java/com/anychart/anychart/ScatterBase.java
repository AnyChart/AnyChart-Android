package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base for all scatter scales (Linear, Logarithmic and DateTime).
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

    
    private Double ratio;

    /**
     * Returns tick by its position ratio.<br/>
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
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

    private Double maxTicksCount;

    /**
     * Setter for maximum ticks count.<br/>
     */
    public ScatterBase setMaxTicksCount(Double maxTicksCount) {
        if (jsBase == null) {
            this.maxTicksCount = maxTicksCount;
        } else {
            this.maxTicksCount = maxTicksCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maximum;

    /**
     * Setter for scale maximum.
     */
    public ScatterBase setMaximum(Double maximum) {
        if (jsBase == null) {
            this.maximum = maximum;
        } else {
            this.maximum = maximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maximum(%f)", maximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximum(%f)", maximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minimum;

    /**
     * Setter for scale minimum.
     */
    public ScatterBase setMinimum(Double minimum) {
        if (jsBase == null) {
            this.minimum = minimum;
        } else {
            this.minimum = minimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minimum(%f)", minimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimum(%f)", minimum));
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