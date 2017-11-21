package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Map geo scale ticks.
 */
public class GeoTicks extends CoreBase {

    public GeoTicks() {
        js.setLength(0);
        js.append("var geoTicks").append(++variableIndex).append(" = anychart.scales.geoTicks();");
        jsBase = "geoTicks" + variableIndex;
    }

    protected GeoTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GeoTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double count;
    private List<GeoTicks> setCount = new ArrayList<>();

    /**
     * Setter for ticks count value.
<b>Note:</b> Final number of ticks can be greater (one more tick can be added).
     */
    public GeoTicks setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCount() {
        if (!setCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GeoTicks item : setCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumCount;
    private Double maximumCount;
    private List<GeoTicks> setCount1 = new ArrayList<>();

    /**
     * Setter for ticks count value using two parameters.
<b>Note:</b> Final number of ticks can be greater than maximum (one more tick can be added).
     */
    public GeoTicks setCount(Double minimumCount, Double maximumCount) {
        if (jsBase == null) {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;
        } else {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%f, %f)", minimumCount, maximumCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f, %f)", minimumCount, maximumCount));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCount1() {
        if (!setCount1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GeoTicks item : setCount1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double interval;
    private List<GeoTicks> setInterval = new ArrayList<>();

    /**
     * Setter for ticks interval value.
     */
    public GeoTicks setInterval(Double interval) {
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
            for (GeoTicks item : setInterval) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] ticks;
    private List<GeoTicks> setSet = new ArrayList<>();

    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public GeoTicks set(String[] ticks) {
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
            for (GeoTicks item : setSet) {
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

        js.append(generateJSsetCount());
        js.append(generateJSsetCount1());
        js.append(generateJSsetInterval());
        js.append(generateJSsetSet());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}