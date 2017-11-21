package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Scale ticks.
 */
public class ScatterTicks extends CoreBase {

    public ScatterTicks() {
        js.setLength(0);
        js.append("var scatterTicks").append(++variableIndex).append(" = anychart.scales.scatterTicks();");
        jsBase = "scatterTicks" + variableIndex;
    }

    protected ScatterTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScatterTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double base;
    private List<ScatterTicks> setBase = new ArrayList<>();

    /**
     * Setter for ticks base value.
<b>Note:</b> it is a number that is guaranteed to set a tick if the number is located between minimum and maximum values of the scale.
     */
    public ScatterTicks setBase(Double base) {
        if (jsBase == null) {
            this.base = base;
        } else {
            this.base = base;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".base(%f)", base));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".base(%f)", base));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBase() {
        if (!setBase.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterTicks item : setBase) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double count;
    private List<ScatterTicks> setCount = new ArrayList<>();

    /**
     * Setter for ticks count value.
<b>Note:</b> Final number of ticks can be greater (one more tick can be added).
     */
    public ScatterTicks setCount(Double count) {
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
            for (ScatterTicks item : setCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumCount;
    private Double maximumCount;
    private List<ScatterTicks> setCount1 = new ArrayList<>();

    /**
     * Setter for ticks count value using two parameters.
<b>Note:</b> Final number of ticks can be greater than maximum (one more tick can be added).
     */
    public ScatterTicks setCount(Double minimumCount, Double maximumCount) {
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
            for (ScatterTicks item : setCount1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double interval;
    private List<ScatterTicks> setInterval = new ArrayList<>();

    /**
     * Setter for ticks interval value.
     */
    public ScatterTicks setInterval(Double interval) {
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
            for (ScatterTicks item : setInterval) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScatterTicksMode mode;
    private String mode1;
    private List<ScatterTicks> setMode = new ArrayList<>();

    /**
     * Setter for ticks mode.
<b>Note:</b> Use only with logarithmic scales.
     */
    public ScatterTicks setMode(ScatterTicksMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode() {
        if (!setMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterTicks item : setMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterTicks> setMode1 = new ArrayList<>();

    /**
     * Setter for ticks mode.
<b>Note:</b> Use only with logarithmic scales.
     */
    public ScatterTicks setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode1() {
        if (!setMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterTicks item : setMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] ticks;
    private List<ScatterTicks> setSet = new ArrayList<>();

    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public ScatterTicks set(String[] ticks) {
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
            for (ScatterTicks item : setSet) {
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

        js.append(generateJSsetBase());
        js.append(generateJSsetCount());
        js.append(generateJSsetCount1());
        js.append(generateJSsetInterval());
        js.append(generateJSsetMode());
        js.append(generateJSsetMode1());
        js.append(generateJSsetSet());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}