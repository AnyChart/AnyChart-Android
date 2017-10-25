package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

    private Double var_value;

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

    private Double[] var_value1;

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


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSavailabilities());
////        
//            js.append(generateJSvar_value());
////        
//            js.append(generateJSvar_value1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}