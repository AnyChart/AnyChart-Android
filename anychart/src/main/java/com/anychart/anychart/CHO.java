package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CHO extends JsObject {

    public CHO() {

    }

    protected CHO(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CHO(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double fastPeriod;

    public CHO setFastPeriod(Double fastPeriod) {
        if (jsBase == null) {
            this.fastPeriod = fastPeriod;
        } else {
            this.fastPeriod = fastPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fastPeriod(%f)", fastPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fastPeriod(%f)", fastPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private MovingAverageType maType;
    private String maType1;

    public CHO setMaType(MovingAverageType maType) {
        if (jsBase == null) {
            this.maType = null;
            this.maType1 = null;
            
            this.maType = maType;
        } else {
            this.maType = maType;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maType(%s)", (maType != null) ? maType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maType(%s)", (maType != null) ? maType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CHO setMaType(String maType1) {
        if (jsBase == null) {
            this.maType = null;
            this.maType1 = null;
            
            this.maType1 = maType1;
        } else {
            this.maType1 = maType1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maType(%s)", maType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maType(%s)", maType1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getSeries;

    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;

    public CHO setSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = type;
        } else {
            this.type = type;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".series(%s)", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double slowPeriod;

    public CHO setSlowPeriod(Double slowPeriod) {
        if (jsBase == null) {
            this.slowPeriod = slowPeriod;
        } else {
            this.slowPeriod = slowPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".slowPeriod(%f)", slowPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".slowPeriod(%f)", slowPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
    }

    private String generateJSfastPeriod() {
        if (fastPeriod != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod);
        }
        return "";
    }

    private String generateJSmaType() {
        if (maType != null) {
            return String.format(Locale.US, "maType: %s,", (maType != null) ? maType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmaType1() {
        if (maType1 != null) {
            return String.format(Locale.US, "maType: %s,", maType1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJSslowPeriod() {
        if (slowPeriod != null) {
            return String.format(Locale.US, "slowPeriod: %f,", slowPeriod);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetSeries());

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
            js.append(generateJSfastPeriod());
            js.append(generateJSmaType());
            js.append(generateJSmaType1());
            js.append(generateJStype());
            js.append(generateJSslowPeriod());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}