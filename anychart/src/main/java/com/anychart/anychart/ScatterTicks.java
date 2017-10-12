package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ScatterTicks extends CoreBase {

    public ScatterTicks() {

    }

    protected ScatterTicks(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ScatterTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double base;

    public ScatterTicks setBase(Double base) {
        if (jsBase == null) {
            this.base = base;
        } else {
            this.base = base;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".base(%f)", base));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".base(%f)", base));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double count;

    public ScatterTicks setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double minimumCount;
    private Double maximumCount;

    public ScatterTicks setCount(Double minimumCount, Double maximumCount) {
        if (jsBase == null) {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;
        } else {
            this.minimumCount = minimumCount;
            this.maximumCount = maximumCount;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".count(%f, %f)", minimumCount, maximumCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f, %f)", minimumCount, maximumCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double interval;

    public ScatterTicks setInterval(Double interval) {
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

    private ScatterTicksMode mode;
    private String mode1;

    public ScatterTicks setMode(ScatterTicksMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", (mode != null) ? mode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public ScatterTicks setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".mode(%s)", mode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", mode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] ticks;

    public ScatterTicks setSet(String[] ticks) {
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

    private String generateJSbase() {
        if (base != null) {
            return String.format(Locale.US, "base: %f,", base);
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }

    private String generateJSminimumCount() {
        if (minimumCount != null) {
            return String.format(Locale.US, "minimumCount: %f,", minimumCount);
        }
        return "";
    }

    private String generateJSmaximumCount() {
        if (maximumCount != null) {
            return String.format(Locale.US, "maximumCount: %f,", maximumCount);
        }
        return "";
    }

    private String generateJSinterval() {
        if (interval != null) {
            return String.format(Locale.US, "interval: %f,", interval);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", (mode != null) ? mode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", mode1);
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
            js.append(generateJSbase());
            js.append(generateJScount());
            js.append(generateJSminimumCount());
            js.append(generateJSmaximumCount());
            js.append(generateJSinterval());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSticks());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}