package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The GanttDateTime class contains methods for configuring DateTime scale on the Gantt chart.
 */
public class GanttDateTime extends CoreBase {

    public GanttDateTime() {
        js.setLength(0);
        js.append("var ganttDateTime").append(++variableIndex).append(" = anychart.scales.ganttDateTime();");
        jsBase = "ganttDateTime" + variableIndex;
    }

    protected GanttDateTime(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GanttDateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number maximum;

    /**
     * Setter for the scale maximum.
     */
    public GanttDateTime setMaximum(Number maximum) {
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

    private Number maximumGap;

    /**
     * Setter for the maximum gap.
     */
    public GanttDateTime setMaximumGap(Number maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximumGap(%s)", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%s);", maximumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minimum;

    /**
     * Setter for the scale minimum.
     */
    public GanttDateTime setMinimum(Number minimum) {
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

    private Number minimumGap;

    /**
     * Setter for the minimum gap.
     */
    public GanttDateTime setMinimumGap(Number minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimumGap(%s)", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%s);", minimumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number softMaximum;

    /**
     * Setter for the scale soft maximum.
     */
    public GanttDateTime setSoftMaximum(Number softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMaximum(%s)", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%s);", softMaximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number softMinimum;

    /**
     * Setter for the scale soft minimum.
     */
    public GanttDateTime setSoftMinimum(Number softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMinimum(%s)", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%s);", softMinimum));
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