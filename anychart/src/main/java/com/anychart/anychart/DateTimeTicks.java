package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Scale ticks.
 */
public class DateTimeTicks extends CoreBase {

    public DateTimeTicks() {
        js.setLength(0);
        js.append("var dateTimeTicks").append(++variableIndex).append(" = anychart.scales.dateTimeTicks();");
        jsBase = "dateTimeTicks" + variableIndex;
    }

    protected DateTimeTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DateTimeTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double count;

    /**
     * Setter for ticks count value.
     */
    public DateTimeTicks setCount(Double count) {
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

    private String isodate;

    /**
     * Setter for ticks interval value by string representing date part or ISO 8601 interval string.
     */
    public DateTimeTicks setInterval(String isodate) {
        if (jsBase == null) {
            this.isodate = isodate;
        } else {
            this.isodate = isodate;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%s)", wrapQuotes(isodate)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s)", wrapQuotes(isodate)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval unit;
    private String unit1;
    private Double count1;

    /**
     * Setter for ticks interval value by unit.
     */
    public DateTimeTicks setInterval(Interval unit, Double count1) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.unit = unit;
            this.count1 = count1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%s, %f)", ((unit != null) ? unit.generateJs() : "null"), count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s, %f)", ((unit != null) ? unit.generateJs() : "null"), count1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for ticks interval value by unit.
     */
    public DateTimeTicks setInterval(String unit1, Double count1) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.unit1 = unit1;
            this.count1 = count1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%s, %f)", wrapQuotes(unit1), count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s, %f)", wrapQuotes(unit1), count1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double years;
    private Double months;
    private Double days;
    private Double hours;
    private Double minutes;
    private Double seconds;

    /**
     * Setter for ticks interval value.
<b>Note:</b> If any passed value is defined but is not a number or less than 0, it defaults to NaN and count() resets to 5.
     */
    public DateTimeTicks setInterval(Double years, Double months, Double days, Double hours, Double minutes, Double seconds) {
        if (jsBase == null) {
            this.years = years;
            this.months = months;
            this.days = days;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            this.years = years;
            this.months = months;
            this.days = days;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".interval(%f, %f, %f, %f, %f, %f)", years, months, days, hours, minutes, seconds));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%f, %f, %f, %f, %f, %f)", years, months, days, hours, minutes, seconds));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] ticks;

    /**
     * Setups ticks as an explicit array of fixed ticks.
     */
    public DateTimeTicks set(String[] ticks) {
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