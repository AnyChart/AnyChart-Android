package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Aroon extends JsObject {

    public Aroon() {

    }

    protected Aroon(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Aroon(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private StockSeriesBase getDownSeries;

    public StockSeriesBase getDownSeries() {
        if (getDownSeries == null)
            getDownSeries = new StockSeriesBase(jsBase + ".downSeries()");

        return getDownSeries;
    }

    private String type;
    private StockSeriesType type1;

    public Aroon setDownSeries(String type) {
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

            js.append(String.format(Locale.US, ".downSeries(%s)", type));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".downSeries(%s)", type));
                js.setLength(0);
            }
        }
        return this;
    }


    public Aroon setDownSeries(StockSeriesType type1) {
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

            js.append(String.format(Locale.US, ".downSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".downSeries(%s)", (type1 != null) ? type1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double period;

    public Aroon setPeriod(Double period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".period(%f)", period));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".period(%f)", period));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getUpSeries;

    public StockSeriesBase getUpSeries() {
        if (getUpSeries == null)
            getUpSeries = new StockSeriesBase(jsBase + ".upSeries()");

        return getUpSeries;
    }

    private String type2;
    private StockSeriesType type3;

    public Aroon setUpSeries(String type2) {
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

            js.append(String.format(Locale.US, ".upSeries(%s)", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upSeries(%s)", type2));
                js.setLength(0);
            }
        }
        return this;
    }


    public Aroon setUpSeries(StockSeriesType type3) {
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

            js.append(String.format(Locale.US, ".upSeries(%s)", (type3 != null) ? type3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upSeries(%s)", (type3 != null) ? type3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetDownSeries() {
        if (getDownSeries != null) {
            return getDownSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetUpSeries() {
        if (getUpSeries != null) {
            return getUpSeries.generateJs();
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

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetDownSeries());
        jsGetters.append(generateJSgetUpSeries());

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
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJSperiod());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}