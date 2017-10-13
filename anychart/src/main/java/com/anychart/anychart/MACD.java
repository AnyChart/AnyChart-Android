package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class MACD extends JsObject {

    public MACD() {

    }

    protected MACD(String jsBase) {
        this.jsBase = jsBase;
    }

    protected MACD(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double fastPeriod;

    public MACD setFastPeriod(Double fastPeriod) {
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

    private StockSeriesBase getHistogramSeries;

    public StockSeriesBase getHistogramSeries() {
        if (getHistogramSeries == null)
            getHistogramSeries = new StockSeriesBase(jsBase + ".histogramSeries()");

        return getHistogramSeries;
    }

    private String type;
    private StockSeriesType type1;

    public MACD setHistogramSeries(String type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
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

            js.append(String.format(Locale.US, ".histogramSeries(%s)", type));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".histogramSeries(%s)", type));
                js.setLength(0);
            }
        }
        return this;
    }


    public MACD setHistogramSeries(StockSeriesType type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".histogramSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".histogramSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getMacdSeries;

    public StockSeriesBase getMacdSeries() {
        if (getMacdSeries == null)
            getMacdSeries = new StockSeriesBase(jsBase + ".macdSeries()");

        return getMacdSeries;
    }

    private String type2;
    private StockSeriesType type3;

    public MACD setMacdSeries(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".macdSeries(%s)", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".macdSeries(%s)", type2));
                js.setLength(0);
            }
        }
        return this;
    }


    public MACD setMacdSeries(StockSeriesType type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".macdSeries(%s)", (type3 != null) ? type3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".macdSeries(%s)", (type3 != null) ? type3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double signalPeriod;

    public MACD setSignalPeriod(Double signalPeriod) {
        if (jsBase == null) {
            this.signalPeriod = signalPeriod;
        } else {
            this.signalPeriod = signalPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".signalPeriod(%f)", signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".signalPeriod(%f)", signalPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getSignalSeries;

    public StockSeriesBase getSignalSeries() {
        if (getSignalSeries == null)
            getSignalSeries = new StockSeriesBase(jsBase + ".signalSeries()");

        return getSignalSeries;
    }

    private String type4;
    private StockSeriesType type5;

    public MACD setSignalSeries(String type4) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type4 = type4;
        } else {
            this.type4 = type4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".signalSeries(%s)", type4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".signalSeries(%s)", type4));
                js.setLength(0);
            }
        }
        return this;
    }


    public MACD setSignalSeries(StockSeriesType type5) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type5 = type5;
        } else {
            this.type5 = type5;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".signalSeries(%s)", (type5 != null) ? type5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".signalSeries(%s)", (type5 != null) ? type5.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private MACD getSlowPeriod;

    public MACD getSlowPeriod() {
        if (getSlowPeriod == null)
            getSlowPeriod = new MACD(jsBase + ".slowPeriod()");

        return getSlowPeriod;
    }

    private String generateJSgetHistogramSeries() {
        if (getHistogramSeries != null) {
            return getHistogramSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetMacdSeries() {
        if (getMacdSeries != null) {
            return getMacdSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetSignalSeries() {
        if (getSignalSeries != null) {
            return getSignalSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetSlowPeriod() {
        if (getSlowPeriod != null) {
            return getSlowPeriod.generateJs();
        }
        return "";
    }

    private String generateJSfastPeriod() {
        if (fastPeriod != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", (type1 != null) ? type1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", (type3 != null) ? type3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsignalPeriod() {
        if (signalPeriod != null) {
            return String.format(Locale.US, "signalPeriod: %f,", signalPeriod);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
        }
        return "";
    }

    private String generateJStype5() {
        if (type5 != null) {
            return String.format(Locale.US, "type: %s,", (type5 != null) ? type5.generateJs() : "null");
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHistogramSeries());
        jsGetters.append(generateJSgetMacdSeries());
        jsGetters.append(generateJSgetSignalSeries());
        jsGetters.append(generateJSgetSlowPeriod());

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
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append(generateJSsignalPeriod());
            js.append(generateJStype4());
            js.append(generateJStype5());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}