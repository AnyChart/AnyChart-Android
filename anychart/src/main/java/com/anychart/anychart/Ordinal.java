package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Ordinal class contains methods for configuring Ordinal scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#ordinal} method.
 */
public class Ordinal extends ScalesBase {

    public Ordinal() {
        js.setLength(0);
        js.append("var ordinal").append(++variableIndex).append(" = anychart.scales.ordinal();");
        jsBase = "ordinal" + variableIndex;
    }

    protected Ordinal(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Ordinal(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number ratio;

    /**
     * Returns tick name by its ratio position.
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

    private String names;

    /**
     * Setter for scale ticks names.
     */
    public Ordinal setNames(String names) {
        if (jsBase == null) {
            this.names = names;
        } else {
            this.names = names;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".names(%s)", wrapQuotes(names)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".names(%s);", wrapQuotes(names)));
                js.setLength(0);
            }
        }
        return this;
    }

    private OrdinalTicks getTicks;

    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public OrdinalTicks getTicks() {
        if (getTicks == null)
            getTicks = new OrdinalTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public Ordinal setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public Ordinal setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%s)", arrayToStringWrapQuotes(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(ticks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number subRangeRatio;

    /**
     * Returns tick position ratio by its name.
<b>Note:</b> returns correct values only after {@link anychart.scales.Base#finishAutoCalc} or <b>chart.draw()</b>.
     */
    public void transform(Number subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transform(%s);", subRangeRatio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%s);", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Number[] weights;

    /**
     * Setter for scale weights.
     */
    public Ordinal setWeights(Number[] weights) {
        if (jsBase == null) {
            this.weights = weights;
        } else {
            this.weights = weights;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".weights(%s)", Arrays.toString(weights)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".weights(%s);", Arrays.toString(weights)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetTicks());

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