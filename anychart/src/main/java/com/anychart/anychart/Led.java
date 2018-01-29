package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Led pointer class.
 */
public class Led extends LineargaugePointersBase {

    public Led() {
        js.setLength(0);
        js.append("var led").append(++variableIndex).append(" = anychart.core.linearGauge.pointers.led();");
        jsBase = "led" + variableIndex;
    }

    protected Led(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Led(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Led getColorScale;

    /**
     * Getter for led color scale.
     */
    public Led getColorScale() {
        if (getColorScale == null)
            getColorScale = new Led(jsBase + ".colorScale()");

        return getColorScale;
    }

    private LinearColor colorScale;
    private OrdinalColor colorScale1;

    /**
     * Setter for the led color scale.
     */
    public Led setColorScale(LinearColor colorScale) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale = colorScale;
        } else {
            this.colorScale = colorScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(colorScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s);", ((colorScale != null) ? colorScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the led color scale.
     */
    public Led setColorScale(OrdinalColor colorScale1) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale1 = colorScale1;
        } else {
            this.colorScale1 = colorScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(colorScale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s);", ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number count;

    /**
     * Setter for the led interval.
     */
    public Led setCount(Number count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%s)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%s);", count));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number gap;
    private String gap1;

    /**
     * Setter for the led gap.
     */
    public Led setGap(Number gap) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap = gap;
        } else {
            this.gap = gap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".gap(%s)", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".gap(%s);", gap));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the led gap.
     */
    public Led setGap(String gap1) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap1 = gap1;
        } else {
            this.gap1 = gap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".gap(%s)", wrapQuotes(gap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".gap(%s);", wrapQuotes(gap1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number size;
    private String size1;

    /**
     * Setter for the led size.
     */
    public Led setSize(Number size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%s)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".size(%s);", size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the led size.
     */
    public Led setSize(String size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".size(%s);", wrapQuotes(size1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetColorScale());

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