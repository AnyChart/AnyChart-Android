package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Ordinal extends ScalesBase {

    public Ordinal() {

    }

    protected Ordinal(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Ordinal(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double ratio;

    public void setInverseTransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f)", ratio));
                js.setLength(0);
            }
        }
    }

    private String names;

    public Ordinal setNames(String names) {
        if (jsBase == null) {
            this.names = names;
        } else {
            this.names = names;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".names(%s)", names));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".names(%s)", names));
                js.setLength(0);
            }
        }
        return this;
    }

    private OrdinalTicks getTicks;

    public OrdinalTicks getTicks() {
        if (getTicks == null)
            getTicks = new OrdinalTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    public Ordinal setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
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

            js.append(String.format(Locale.US, ".ticks(%s)", ticks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", ticks));
                js.setLength(0);
            }
        }
        return this;
    }


    public Ordinal setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".ticks(%s)", Arrays.toString(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", Arrays.toString(ticks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double subRangeRatio;

    public void setTransform(Double subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transform(%f);", subRangeRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%f)", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Double[] weights;

    public Ordinal setWeights(Double[] weights) {
        if (jsBase == null) {
            this.weights = weights;
        } else {
            this.weights = weights;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".weights(%s)", Arrays.toString(weights)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".weights(%s)", Arrays.toString(weights)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }

    private String generateJSratio() {
        if (ratio != null) {
            return String.format(Locale.US, "ratio: %f,", ratio);
        }
        return "";
    }

    private String generateJSnames() {
        if (names != null) {
            return String.format(Locale.US, "names: %s,", names);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", ticks);
        }
        return "";
    }

    private String generateJSticks1() {
        if (ticks1 != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks1));
        }
        return "";
    }

    private String generateJSsubRangeRatio() {
        if (subRangeRatio != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio);
        }
        return "";
    }

    private String generateJSweights() {
        if (weights != null) {
            return String.format(Locale.US, "weights: %s,", Arrays.toString(weights));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetTicks());

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
            js.append(generateJSratio());
            js.append(generateJSnames());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJSsubRangeRatio());
            js.append(generateJSweights());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}