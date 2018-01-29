package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The OrdinalTicks class contains methods for configuring ticks on the Ordinal scale.
 */
public class OrdinalTicks extends CoreBase {

    public OrdinalTicks() {
        js.setLength(0);
        js.append("var ordinalTicks").append(++variableIndex).append(" = anychart.scales.ordinalTicks();");
        jsBase = "ordinalTicks" + variableIndex;
    }

    protected OrdinalTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected OrdinalTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number interval;

    /**
     * Setter for ticks interval value.<br/>
Passed value is rounded and defaults to 1 in case of incorrect settings.
     */
    public OrdinalTicks setInterval(Number interval) {
        if (jsBase == null) {
            this.interval = interval;
        } else {
            this.interval = interval;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%s)", interval));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s);", interval));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxCount;

    /**
     * Setter for maximum ticks count.
     */
    public OrdinalTicks setMaxCount(Number maxCount) {
        if (jsBase == null) {
            this.maxCount = maxCount;
        } else {
            this.maxCount = maxCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxCount(%s)", maxCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxCount(%s);", maxCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] values;

    /**
     * Setter for the tick names.
     */
    public OrdinalTicks setNames(String[] values) {
        if (jsBase == null) {
            this.values = values;
        } else {
            this.values = values;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".names(%s)", arrayToStringWrapQuotes(values)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".names(%s);", arrayToStringWrapQuotes(values)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] ticks;

    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public OrdinalTicks set(String[] ticks) {
        if (jsBase == null) {
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".set(%s)", arrayToStringWrapQuotes(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", arrayToStringWrapQuotes(ticks)));
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