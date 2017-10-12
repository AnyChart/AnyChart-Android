package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Stochastic extends JsObject {

    public Stochastic() {

    }

    protected Stochastic(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Stochastic(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private MovingAverageType dMAType;

    public Stochastic setDMAType(MovingAverageType dMAType) {
        if (jsBase == null) {
            this.dMAType = dMAType;
        } else {
            this.dMAType = dMAType;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dMAType(%s)", (dMAType != null) ? dMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMAType(%s)", (dMAType != null) ? dMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double dPeriod;

    public Stochastic setDPeriod(Double dPeriod) {
        if (jsBase == null) {
            this.dPeriod = dPeriod;
        } else {
            this.dPeriod = dPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dPeriod(%f)", dPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dPeriod(%f)", dPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getDSeries;

    public StockSeriesBase getDSeries() {
        if (getDSeries == null)
            getDSeries = new StockSeriesBase(jsBase + ".dSeries()");

        return getDSeries;
    }

    private StockSeriesType type;

    public Stochastic setDSeries(StockSeriesType type) {
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

            js.append(String.format(Locale.US, ".dSeries(%s)", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dSeries(%s)", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double kMAPeriod;

    public Stochastic setKMAPeriod(Double kMAPeriod) {
        if (jsBase == null) {
            this.kMAPeriod = kMAPeriod;
        } else {
            this.kMAPeriod = kMAPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kMAPeriod(%f)", kMAPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAPeriod(%f)", kMAPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private MovingAverageType kMAType;

    public Stochastic setKMAType(MovingAverageType kMAType) {
        if (jsBase == null) {
            this.kMAType = kMAType;
        } else {
            this.kMAType = kMAType;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kMAType(%s)", (kMAType != null) ? kMAType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAType(%s)", (kMAType != null) ? kMAType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double kPeriod;

    public Stochastic setKPeriod(Double kPeriod) {
        if (jsBase == null) {
            this.kPeriod = kPeriod;
        } else {
            this.kPeriod = kPeriod;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".kPeriod(%f)", kPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kPeriod(%f)", kPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getKSeries;

    public StockSeriesBase getKSeries() {
        if (getKSeries == null)
            getKSeries = new StockSeriesBase(jsBase + ".kSeries()");

        return getKSeries;
    }

    private StockSeriesType type1;

    public Stochastic setKSeries(StockSeriesType type1) {
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

            js.append(String.format(Locale.US, ".kSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetDSeries() {
        if (getDSeries != null) {
            return getDSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetKSeries() {
        if (getKSeries != null) {
            return getKSeries.generateJs();
        }
        return "";
    }

    private String generateJSdMAType() {
        if (dMAType != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType != null) ? dMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdPeriod() {
        if (dPeriod != null) {
            return String.format(Locale.US, "dPeriod: %f,", dPeriod);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkMAPeriod() {
        if (kMAPeriod != null) {
            return String.format(Locale.US, "kMAPeriod: %f,", kMAPeriod);
        }
        return "";
    }

    private String generateJSkMAType() {
        if (kMAType != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType != null) ? kMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkPeriod() {
        if (kPeriod != null) {
            return String.format(Locale.US, "kPeriod: %f,", kPeriod);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", (type1 != null) ? type1.generateJs() : "null");
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetDSeries());
        jsGetters.append(generateJSgetKSeries());

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
            js.append(generateJSdMAType());
            js.append(generateJSdPeriod());
            js.append(generateJStype());
            js.append(generateJSkMAPeriod());
            js.append(generateJSkMAType());
            js.append(generateJSkPeriod());
            js.append(generateJStype1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}