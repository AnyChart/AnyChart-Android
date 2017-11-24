package com.anychart.anychart;

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

    private Double count;

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

    private Double minimumCount;
    private Double maximumCount;

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

    private Double interval;

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

    private ScatterTicksMode mode;
    private String mode1;

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

    private String[] ticks;

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