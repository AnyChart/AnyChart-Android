package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Linear Gauge axis class.<br/>
Any axis must be bound to a scale.<br/>
To obtain a new instance of Axis use {@link anychart.standalones.axes#linear}.
 */
public class AxesLinearGauge extends CoreAxesLinear {

    public AxesLinearGauge() {
        js.setLength(0);
        js.append("var axesLinearGauge").append(++variableIndex).append(" = anychart.core.axes.linearGauge();");
        jsBase = "axesLinearGauge" + variableIndex;
    }

    protected AxesLinearGauge(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AxesLinearGauge(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String offset;

    /**
     * Setter for the axis offset.
     */
    public AxesLinearGauge setOffset(String offset) {
        if (jsBase == null) {
            this.offset = offset;
        } else {
            this.offset = offset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offset(%s)", wrapQuotes(offset)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offset(%s);", wrapQuotes(offset)));
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