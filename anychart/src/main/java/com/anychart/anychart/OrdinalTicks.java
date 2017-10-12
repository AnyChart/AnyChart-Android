package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class OrdinalTicks extends CoreBase {

    public OrdinalTicks() {

    }

    protected OrdinalTicks(String jsBase) {
        this.jsBase = jsBase;
    }

    protected OrdinalTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double interval;

    public OrdinalTicks setInterval(Double interval) {
        if (jsBase == null) {
            this.interval = interval;
        } else {
            this.interval = interval;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interval(%f)", interval));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interval(%f)", interval));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] values;

    public OrdinalTicks setNames(String[] values) {
        if (jsBase == null) {
            this.values = values;
        } else {
            this.values = values;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".names(%s)", Arrays.toString(values)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".names(%s)", Arrays.toString(values)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] ticks;

    public OrdinalTicks setSet(String[] ticks) {
        if (jsBase == null) {
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private String generateJSinterval() {
        if (interval != null) {
            return String.format(Locale.US, "interval: %f,", interval);
        }
        return "";
    }

    private String generateJSvalues() {
        if (values != null) {
            return String.format(Locale.US, "values: %s,", Arrays.toString(values));
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
            js.append(generateJSinterval());
            js.append(generateJSvalues());
            js.append(generateJSticks());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}