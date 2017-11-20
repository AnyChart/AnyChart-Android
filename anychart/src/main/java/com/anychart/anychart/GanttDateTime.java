package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
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
    private List<GanttDateTime> setMaximum = new ArrayList<>();

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
    private String generateJSsetMaximum() {
        if (!setMaximum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setMaximum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maximumGap;
    private List<GanttDateTime> setMaximumGap = new ArrayList<>();

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
    private String generateJSsetMaximumGap() {
        if (!setMaximumGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setMaximumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimum;
    private List<GanttDateTime> setMinimum = new ArrayList<>();

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
    private String generateJSsetMinimum() {
        if (!setMinimum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setMinimum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumGap;
    private List<GanttDateTime> setMinimumGap = new ArrayList<>();

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
    private String generateJSsetMinimumGap() {
        if (!setMinimumGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setMinimumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double softMaximum;
    private List<GanttDateTime> setSoftMaximum = new ArrayList<>();

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
    private String generateJSsetSoftMaximum() {
        if (!setSoftMaximum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setSoftMaximum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double softMinimum;
    private List<GanttDateTime> setSoftMinimum = new ArrayList<>();

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
    private String generateJSsetSoftMinimum() {
        if (!setSoftMinimum.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttDateTime item : setSoftMinimum) {
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

        js.append(generateJSsetMaximum());
        js.append(generateJSsetMaximumGap());
        js.append(generateJSsetMinimum());
        js.append(generateJSsetMinimumGap());
        js.append(generateJSsetSoftMaximum());
        js.append(generateJSsetSoftMinimum());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}