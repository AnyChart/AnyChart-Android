package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class GanttDateTime extends CoreBase {

    public GanttDateTime() {

    }

    protected GanttDateTime(String jsBase) {
        this.jsBase = jsBase;
    }

    protected GanttDateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double maximum;

    public GanttDateTime setMaximum(Double maximum) {
        if (jsBase == null) {
            this.maximum = maximum;
        } else {
            this.maximum = maximum;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double maximumGap;

    public GanttDateTime setMaximumGap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double minimum;

    public GanttDateTime setMinimum(Double minimum) {
        if (jsBase == null) {
            this.minimum = minimum;
        } else {
            this.minimum = minimum;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double minimumGap;

    public GanttDateTime setMinimumGap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double softMaximum;

    public GanttDateTime setSoftMaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double softMinimum;

    public GanttDateTime setSoftMinimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private String generateJSmaximum() {
        if (maximum != null) {
            return String.format(Locale.US, "maximum: %f,", maximum);
        }
        return "";
    }

    private String generateJSmaximumGap() {
        if (maximumGap != null) {
            return String.format(Locale.US, "maximumGap: %f,", maximumGap);
        }
        return "";
    }

    private String generateJSminimum() {
        if (minimum != null) {
            return String.format(Locale.US, "minimum: %f,", minimum);
        }
        return "";
    }

    private String generateJSminimumGap() {
        if (minimumGap != null) {
            return String.format(Locale.US, "minimumGap: %f,", minimumGap);
        }
        return "";
    }

    private String generateJSsoftMaximum() {
        if (softMaximum != null) {
            return String.format(Locale.US, "softMaximum: %f,", softMaximum);
        }
        return "";
    }

    private String generateJSsoftMinimum() {
        if (softMinimum != null) {
            return String.format(Locale.US, "softMinimum: %f,", softMinimum);
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
            js.append(generateJSmaximum());
            js.append(generateJSmaximumGap());
            js.append(generateJSminimum());
            js.append(generateJSminimumGap());
            js.append(generateJSsoftMaximum());
            js.append(generateJSsoftMinimum());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}