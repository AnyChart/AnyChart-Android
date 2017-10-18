package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class DateTimeTicks extends CoreBase {

    public DateTimeTicks() {

    }

    protected DateTimeTicks(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DateTimeTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double count;

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

    public DateTimeTicks setInterval(String isodate) {
        if (jsBase == null) {
            this.isodate = isodate;
        } else {
            this.isodate = isodate;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interval(%s)", isodate));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s)", isodate));
                js.setLength(0);
            }
        }
        return this;
    }

    private Interval unit;
    private String unit1;
    private Double count1;

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

            js.append(String.format(Locale.US, ".interval(%s, %f)", (unit != null) ? unit.generateJs() : "null", count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s, %f)", (unit != null) ? unit.generateJs() : "null", count1));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".interval(%s, %f)", unit1, count1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%s, %f)", unit1, count1));
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

    public DateTimeTicks set(String[] ticks) {
        if (jsBase == null) {
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", Arrays.toString(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", Arrays.toString(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSisodate() {
        if (isodate != null) {
            return String.format(Locale.US, "isodate: %s,", isodate);
        }
        return "";
    }

    private String generateJSunit() {
        if (unit != null) {
            return String.format(Locale.US, "unit: %s,", (unit != null) ? unit.generateJs() : "null");
        }
        return "";
    }

    private String generateJSunit1() {
        if (unit1 != null) {
            return String.format(Locale.US, "unit: %s,", unit1);
        }
        return "";
    }

    private String generateJScount1() {
        if (count1 != null) {
            return String.format(Locale.US, "count: %f,", count1);
        }
        return "";
    }

    private String generateJSyears() {
        if (years != null) {
            return String.format(Locale.US, "years: %f,", years);
        }
        return "";
    }

    private String generateJSmonths() {
        if (months != null) {
            return String.format(Locale.US, "months: %f,", months);
        }
        return "";
    }

    private String generateJSdays() {
        if (days != null) {
            return String.format(Locale.US, "days: %f,", days);
        }
        return "";
    }

    private String generateJShours() {
        if (hours != null) {
            return String.format(Locale.US, "hours: %f,", hours);
        }
        return "";
    }

    private String generateJSminutes() {
        if (minutes != null) {
            return String.format(Locale.US, "minutes: %f,", minutes);
        }
        return "";
    }

    private String generateJSseconds() {
        if (seconds != null) {
            return String.format(Locale.US, "seconds: %f,", seconds);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJScount());
            js.append(generateJSisodate());
            js.append(generateJSunit());
            js.append(generateJSunit1());
            js.append(generateJScount1());
            js.append(generateJSyears());
            js.append(generateJSmonths());
            js.append(generateJSdays());
            js.append(generateJShours());
            js.append(generateJSminutes());
            js.append(generateJSseconds());
            js.append(generateJSticks());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}