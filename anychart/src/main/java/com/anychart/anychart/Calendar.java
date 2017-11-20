package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Calendar scale.
<b>Note:</b> To create instance use {@link anychart.scales#calendar} method.
 */
public class Calendar extends CoreBase {

    public Calendar() {
        js.setLength(0);
        js.append("var calendar").append(++variableIndex).append(" = anychart.scales.calendar();");
        jsBase = "calendar" + variableIndex;
    }

    protected Calendar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Calendar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Availability[] availabilities;
    private List<Calendar> setAvailabilities = new ArrayList<>();

    /**
     * Setter for the availabilities for the calendar.
     */
    public Calendar setAvailabilities(Availability[] availabilities) {
        if (jsBase == null) {
            this.availabilities = availabilities;
        } else {
            this.availabilities = availabilities;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".availabilities(%s)", arrayToString(availabilities)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".availabilities(%s)", arrayToString(availabilities)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAvailabilities() {
        if (!setAvailabilities.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Calendar item : setAvailabilities) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double var_value;
    private List<Calendar> setTimezoneOffset = new ArrayList<>();

    /**
     * Setter for the timezone offset for the output availabilities.
     */
    public Calendar setTimezoneOffset(Double var_value) {
        if (jsBase == null) {
            this.var_value = var_value;
        } else {
            this.var_value = var_value;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".timezoneOffset(%f)", var_value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".timezoneOffset(%f)", var_value));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTimezoneOffset() {
        if (!setTimezoneOffset.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Calendar item : setTimezoneOffset) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] var_value1;
    private List<Calendar> setWeekendRange = new ArrayList<>();

    /**
     * Setter for the regular weekend days.
     */
    public Calendar setWeekendRange(Double[] var_value1) {
        if (jsBase == null) {
            this.var_value = null;
            this.var_value1 = null;
            
            this.var_value1 = var_value1;
        } else {
            this.var_value1 = var_value1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".weekendRange(%s)", Arrays.toString(var_value1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".weekendRange(%s)", Arrays.toString(var_value1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWeekendRange() {
        if (!setWeekendRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Calendar item : setWeekendRange) {
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

        js.append(generateJSsetAvailabilities());
        js.append(generateJSsetTimezoneOffset());
        js.append(generateJSsetWeekendRange());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}