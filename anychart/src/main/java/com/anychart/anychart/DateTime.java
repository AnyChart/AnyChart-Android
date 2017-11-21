package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Define Datetime scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#dateTime} method.
 */
public class DateTime extends ScatterBase {

    public DateTime() {
        js.setLength(0);
        js.append("var dateTime").append(++variableIndex).append(" = anychart.scales.dateTime();");
        jsBase = "dateTime" + variableIndex;
    }

    protected DateTime(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double maximumGap;
    private List<DateTime> setMaximumGap = new ArrayList<>();

    /**
     * Setter for the scale maximum gap.
     */
    public DateTime setMaximumGap(Double maximumGap) {
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
            for (DateTime item : setMaximumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minimumGap;
    private List<DateTime> setMinimumGap = new ArrayList<>();

    /**
     * Setter for the scale minimum gap.
     */
    public DateTime setMinimumGap(Double minimumGap) {
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
            for (DateTime item : setMinimumGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private DateTimeTicks getMinorTicks;

    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public DateTimeTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new DateTimeTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private String[] minorTicks1;
    private List<DateTime> setMinorTicks = new ArrayList<>();

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public DateTime setMinorTicks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks() {
        if (!setMinorTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DateTime> setMinorTicks1 = new ArrayList<>();

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public DateTime setMinorTicks(String[] minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", arrayToStringWrapQuotes(minorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", arrayToStringWrapQuotes(minorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks1() {
        if (!setMinorTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double softMaximum;
    private List<DateTime> setSoftMaximum = new ArrayList<>();

    /**
     * Setter for soft maximum.
     */
    public DateTime setSoftMaximum(Double softMaximum) {
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
            for (DateTime item : setSoftMaximum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double softMinimum;
    private List<DateTime> setSoftMinimum = new ArrayList<>();

    /**
     * Setter for soft minimum.
     */
    public DateTime setSoftMinimum(Double softMinimum) {
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
            for (DateTime item : setSoftMinimum) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private DateTimeTicks getTicks;

    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public DateTimeTicks getTicks() {
        if (getTicks == null)
            getTicks = new DateTimeTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;
    private List<DateTime> setTicks = new ArrayList<>();

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public DateTime setTicks(String ticks) {
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
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTicks() {
        if (!setTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DateTime> setTicks1 = new ArrayList<>();

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public DateTime setTicks(String[] ticks1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", arrayToStringWrapQuotes(ticks1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTicks1() {
        if (!setTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DateTime item : setTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetMinorTicks() {
        if (getMinorTicks != null) {
            return getMinorTicks.generateJs();
        }
        return "";
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

    
        jsGetters.append(generateJSgetMinorTicks());
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

        js.append(generateJSsetMaximumGap());
        js.append(generateJSsetMinimumGap());
        js.append(generateJSsetMinorTicks());
        js.append(generateJSsetMinorTicks1());
        js.append(generateJSsetSoftMaximum());
        js.append(generateJSsetSoftMinimum());
        js.append(generateJSsetTicks());
        js.append(generateJSsetTicks1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}