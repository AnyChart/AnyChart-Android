package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The DateTimeTicks class contains methods for configuring ticks on the DateTime scale.
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

    
    private Number count;

    /**
     * Setter for ticks count value.
     */
    public DateTimeTicks setCount(Number count) {
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

    private String isodate;

    /**
     * Setter for ticks interval value by a string representing date part or ISO 8601 interval string..
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s);", wrapQuotes(isodate)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval unit;
    private String unit1;
    private Number count1;

    /**
     * Setter for ticks interval value by the unit.
     */
    public DateTimeTicks setInterval(Interval unit, Number count1) {
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
            
            js.append(String.format(Locale.US, ".interval(%s, %s)", ((unit != null) ? unit.generateJs() : "null"), count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s, %s);", ((unit != null) ? unit.generateJs() : "null"), count1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for ticks interval value by the unit.
     */
    public DateTimeTicks setInterval(String unit1, Number count1) {
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
            
            js.append(String.format(Locale.US, ".interval(%s, %s)", wrapQuotes(unit1), count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s, %s);", wrapQuotes(unit1), count1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number years;
    private Number months;
    private Number days;
    private Number hours;
    private Number minutes;
    private Number seconds;

    /**
     * Setter for ticks interval value.
<b>Note:</b> If any passed value is defined but is not a number or less than 0, it defaults to NaN and count() resets to 5.
     */
    public DateTimeTicks setInterval(Number years, Number months, Number days, Number hours, Number minutes, Number seconds) {
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
            
            js.append(String.format(Locale.US, ".interval(%s, %s, %s, %s, %s, %s)", years, months, days, hours, minutes, seconds));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".interval(%s, %s, %s, %s, %s, %s);", years, months, days, hours, minutes, seconds));
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", arrayToStringWrapQuotes(ticks)));
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