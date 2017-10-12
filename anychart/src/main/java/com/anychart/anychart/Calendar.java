package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Calendar extends CoreBase {

    public Calendar() {

    }

    protected Calendar(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Calendar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Availability[] availabilities;

    public Calendar setAvailabilities(Availability[] availabilities) {
        if (jsBase == null) {
            this.availabilities = availabilities;
        } else {
            this.availabilities = availabilities;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double startDate;
    private Double endDate;
    private Interval unit;
    private String unit1;
    private Double count;

    public void setGetWorkingSchedule(Interval unit, Double startDate, Double endDate, Double count) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit = unit;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;
        } else {
            this.unit = unit;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", (unit != null) ? unit.generateJs() : "null", startDate, endDate, count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f)", (unit != null) ? unit.generateJs() : "null", startDate, endDate, count));
                js.setLength(0);
            }
        }
    }


    public void setGetWorkingSchedule(String unit1, Double startDate, Double endDate, Double count) {
        if (jsBase == null) {
            this.unit = null;
            this.unit1 = null;
            
            this.unit1 = unit1;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;
        } else {
            this.unit1 = unit1;
            this.startDate = startDate;
            this.endDate = endDate;
            this.count = count;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f);", unit1, startDate, endDate, count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getWorkingSchedule(%s, %f, %f, %f)", unit1, startDate, endDate, count));
                js.setLength(0);
            }
        }
    }

    private Double var_value;

    public Calendar setTimezoneOffset(Double var_value) {
        if (jsBase == null) {
            this.var_value = var_value;
        } else {
            this.var_value = var_value;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double[] var_value1;

    public Calendar setWeekendRange(Double[] var_value1) {
        if (jsBase == null) {
            this.var_value = null;
            this.var_value1 = null;
            
            this.var_value1 = var_value1;
        } else {
            this.var_value1 = var_value1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private String generateJSavailabilities() {
        if (availabilities != null) {
            return String.format(Locale.US, "availabilities: %s,", arrayToString(availabilities));
        }
        return "";
    }

    private String generateJSstartDate() {
        if (startDate != null) {
            return String.format(Locale.US, "startDate: %f,", startDate);
        }
        return "";
    }

    private String generateJSendDate() {
        if (endDate != null) {
            return String.format(Locale.US, "endDate: %f,", endDate);
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

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSvar_value() {
        if (var_value != null) {
            return String.format(Locale.US, "var_value: %f,", var_value);
        }
        return "";
    }

    private String generateJSvar_value1() {
        if (var_value1 != null) {
            return String.format(Locale.US, "var_value: %s,", Arrays.toString(var_value1));
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
            js.append(generateJSavailabilities());
            js.append(generateJSstartDate());
            js.append(generateJSendDate());
            js.append(generateJSunit());
            js.append(generateJSunit1());
            js.append(generateJScount());
            js.append(generateJSvar_value());
            js.append(generateJSvar_value1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}