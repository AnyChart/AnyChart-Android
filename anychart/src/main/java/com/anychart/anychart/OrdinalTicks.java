package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Scale ticks settings.
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

    
    private Double interval;
    private List<OrdinalTicks> setInterval = new ArrayList<>();

    /**
     * Setter for ticks interval value. Passed value as rounded and defaults to 1 in case of incorrect settings.
     */
    public OrdinalTicks setInterval(Double interval) {
        if (jsBase == null) {
            this.interval = interval;
        } else {
            this.interval = interval;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%f)", interval));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%f)", interval));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetInterval() {
        if (!setInterval.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalTicks item : setInterval) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] values;
    private List<OrdinalTicks> setNames = new ArrayList<>();

    /**
     * Setter for tick names.
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
                onChangeListener.onChange(String.format(Locale.US, ".names(%s)", arrayToStringWrapQuotes(values)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNames() {
        if (!setNames.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalTicks item : setNames) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] ticks;
    private List<OrdinalTicks> setSet = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", arrayToStringWrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSet() {
        if (!setSet.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (OrdinalTicks item : setSet) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetInterval());
        js.append(generateJSsetNames());
        js.append(generateJSsetSet());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}