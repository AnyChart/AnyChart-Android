package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The DateTimeWithCalendar class contains methods for configuring calendar on the DateTime scale.
 */
public class DateTimeWithCalendar extends ScatterBase {

    public DateTimeWithCalendar() {
        js.setLength(0);
        js.append("var dateTimeWithCalendar").append(++variableIndex).append(" = anychart.scales.dateTimeWithCalendar();");
        jsBase = "dateTimeWithCalendar" + variableIndex;
    }

    protected DateTimeWithCalendar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DateTimeWithCalendar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Calendar getCalendar;

    /**
     * Getter for the scale calendar.
     */
    public Calendar getCalendar() {
        if (getCalendar == null)
            getCalendar = new Calendar(jsBase + ".calendar()");

        return getCalendar;
    }

    private Number count;

    /**
     * Setter for the unit count.
     */
    public DateTimeWithCalendar setCount(Number count) {
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

    private Number date;

    /**
     * Transforms date to pixels.
     */
    public void dateToPix(Number date) {
        if (jsBase == null) {
            this.date = date;
        } else {
            this.date = date;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".dateToPix(%s);", date));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dateToPix(%s);", date));
                js.setLength(0);
            }
        }
    }

    private Number fromPix;
    private Number toPix;
    private Interval unit;
    private String unit1;
    private Number count1;

    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with a passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Number fromPix, Number toPix, Interval unit, Number count1) {
        if (jsBase == null) {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = unit;
            this.count1 = count1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, ((unit != null) ? unit.generateJs() : "null"), count1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, ((unit != null) ? unit.generateJs() : "null"), count1));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns ticks array (even indexes are left borders, odd indexes are right borders of the tick)
with a passed interval. Ticks fill space from the fromPix pixel to the toPix pixel (if available).
     */
    public void getTicks(Number fromPix, Number toPix, String unit1, Number count1) {
        if (jsBase == null) {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.count = null;
            this.count1 = null;
            
            this.count1 = count1;
        } else {
            this.fromPix = fromPix;
            this.toPix = toPix;
            this.unit1 = unit1;
            this.count1 = count1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, wrapQuotes(unit1), count1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getTicks(%s, %s, %s, %s);", fromPix, toPix, wrapQuotes(unit1), count1));
                js.setLength(0);
            }
        }
    }

    private Number maximumGap;
    private List<DateTime> setMaximumGap = new ArrayList<>();

    /**
     * Setter for the scale maximum gap.
     */
    public DateTime setMaximumGap(Number maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaximumGap" + ++variableIndex + " = " + jsBase + ".maximumGap(%s);", maximumGap));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%s);", maximumGap));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setMaximumGap" + variableIndex);
        setMaximumGap.add(item);
        return item;
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

    private Number minimumGap;
    private List<DateTime> setMinimumGap = new ArrayList<>();

    /**
     * Setter for the scale minimum gap.
     */
    public DateTime setMinimumGap(Number minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinimumGap" + ++variableIndex + " = " + jsBase + ".minimumGap(%s);", minimumGap));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%s);", minimumGap));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setMinimumGap" + variableIndex);
        setMinimumGap.add(item);
        return item;
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

    private Number pix;

    /**
     * Transforms pixels to date.
     */
    public void pixToDate(Number pix) {
        if (jsBase == null) {
            this.pix = pix;
        } else {
            this.pix = pix;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".pixToDate(%s);", pix));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pixToDate(%s);", pix));
                js.setLength(0);
            }
        }
    }

    private Boolean skipHolidays;

    /**
     * Setter for skipping of holidays.
     */
    public DateTimeWithCalendar setSkipHolidays(Boolean skipHolidays) {
        if (jsBase == null) {
            this.skipHolidays = skipHolidays;
        } else {
            this.skipHolidays = skipHolidays;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".skipHolidays(%b)", skipHolidays));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".skipHolidays(%b);", skipHolidays));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number softMaximum;
    private List<DateTime> setSoftMaximum = new ArrayList<>();

    /**
     * Setter for the soft maximum.
     */
    public DateTime setSoftMaximum(Number softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSoftMaximum" + ++variableIndex + " = " + jsBase + ".softMaximum(%s);", softMaximum));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%s);", softMaximum));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setSoftMaximum" + variableIndex);
        setSoftMaximum.add(item);
        return item;
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

    private Number softMinimum;
    private List<DateTime> setSoftMinimum = new ArrayList<>();

    /**
     * Setter for the soft minimum.
     */
    public DateTime setSoftMinimum(Number softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSoftMinimum" + ++variableIndex + " = " + jsBase + ".softMinimum(%s);", softMinimum));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%s);", softMinimum));
                js.setLength(0);
            }
        }
        DateTime item = new DateTime("setSoftMinimum" + variableIndex);
        setSoftMinimum.add(item);
        return item;
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

    private Interval unit2;
    private String unit3;

    /**
     * Setter for the unit interval.
     */
    public DateTimeWithCalendar setUnit(Interval unit2) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit2 = unit2;
        } else {
            this.unit2 = unit2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unit(%s)", ((unit2 != null) ? unit2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", ((unit2 != null) ? unit2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the unit interval.
     */
    public DateTimeWithCalendar setUnit(String unit3) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            this.unit2 = null;
            this.unit3 = null;
            
            this.unit3 = unit3;
        } else {
            this.unit3 = unit3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unit(%s)", wrapQuotes(unit3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unit(%s);", wrapQuotes(unit3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number unitPixSize;
    private String unitPixSize1;

    /**
     * Setter for the unit size.
     */
    public DateTimeWithCalendar setUnitPixSize(Number unitPixSize) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize = unitPixSize;
        } else {
            this.unitPixSize = unitPixSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unitPixSize(%s)", unitPixSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%s);", unitPixSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the unit size.
     */
    public DateTimeWithCalendar setUnitPixSize(String unitPixSize1) {
        if (jsBase == null) {
            this.unitPixSize = null;
            this.unitPixSize1 = null;
            
            this.unitPixSize1 = unitPixSize1;
        } else {
            this.unitPixSize1 = unitPixSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unitPixSize(%s)", wrapQuotes(unitPixSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unitPixSize(%s);", wrapQuotes(unitPixSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetCalendar() {
        if (getCalendar != null) {
            return getCalendar.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCalendar());

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
        js.append(generateJSsetSoftMaximum());
        js.append(generateJSsetSoftMinimum());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}