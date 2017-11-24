package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Gantt date time scale.
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

    
    private Double maximum;

    /**
     * Setter for the scale maximum.
     */
    public GanttDateTime setMaximum(Double maximum) {
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

    private Double maximumGap;

    /**
     * Setter for the maximum gap.
     */
    public GanttDateTime setMaximumGap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximumGap(%f)", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumGap(%f)", maximumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minimum;

    /**
     * Setter for the scale minimum.
     */
    public GanttDateTime setMinimum(Double minimum) {
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

    private Double minimumGap;

    /**
     * Setter for the minimum gap.
     */
    public GanttDateTime setMinimumGap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimumGap(%f)", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumGap(%f)", minimumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double softMaximum;

    /**
     * Setter for the scale soft maximum.
     */
    public GanttDateTime setSoftMaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMaximum(%f)", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".softMaximum(%f)", softMaximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double softMinimum;

    /**
     * Setter for the scale soft minimum.
     */
    public GanttDateTime setSoftMinimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMinimum(%f)", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".softMinimum(%f)", softMinimum));
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