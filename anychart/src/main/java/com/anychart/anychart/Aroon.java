package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

    private StockSeriesType type;
    private String type1;

    public Aroon setDownSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".downSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".downSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Aroon setDownSeries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".downSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".downSeries(%s)", wrapQuotes(type1)));
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

    private StockSeriesType type2;
    private String type3;

    public Aroon setUpSeries(StockSeriesType type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".upSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public Aroon setUpSeries(String type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".upSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSStockSeriesBase getDownSeries() {
//        if (StockSeriesBase getDownSeries != null) {
//            return StockSeriesBase getDownSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getUpSeries() {
//        if (StockSeriesBase getUpSeries != null) {
//            return StockSeriesBase getUpSeries.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetDownSeries() {
        if (getDownSeries != null) {
            return getDownSeries.generateJs();
            //return String.format(Locale.US, "getDownSeries: %s,", ((getDownSeries != null) ? getDownSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetUpSeries() {
        if (getUpSeries != null) {
            return getUpSeries.generateJs();
            //return String.format(Locale.US, "getUpSeries: %s,", ((getUpSeries != null) ? getUpSeries.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJStype());
////        
//            js.append(generateJStype1());
////        
//            js.append(generateJSperiod());
////        
//            js.append(generateJStype2());
////        
//            js.append(generateJStype3());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}