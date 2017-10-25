package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class BBandsB extends JsObject {

    public BBandsB() {

    }

    protected BBandsB(String jsBase) {
        this.jsBase = jsBase;
    }

    protected BBandsB(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double deviation;

    public BBandsB setDeviation(Double deviation) {
        if (jsBase == null) {
            this.deviation = deviation;
        } else {
            this.deviation = deviation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".deviation(%f)", deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".deviation(%f)", deviation));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<BBandsB> getPeriod = new ArrayList<>();

    public BBandsB getPeriod(Double period) {
        BBandsB item = new BBandsB(jsBase + ".period(" + period + ")");
        getPeriod.add(item);
        return item;
    }

    private StockSeriesBase getSeries;

    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;
    private String type1;

    public BBandsB setSeries(StockSeriesType type) {
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

            js.append(String.format(Locale.US, ".series(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public BBandsB setSeries(String type1) {
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

            js.append(String.format(Locale.US, ".series(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSBBandsB getPeriod() {
//        if (BBandsB getPeriod != null) {
//            return BBandsB getPeriod.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getSeries() {
//        if (StockSeriesBase getSeries != null) {
//            return StockSeriesBase getSeries.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetPeriod() {
        if (!getPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : getPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
            //return String.format(Locale.US, "getSeries: %s,", ((getSeries != null) ? getSeries.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetPeriod());
        jsGetters.append(generateJSgetSeries());

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
//            js.append(generateJSdeviation());
////        
//            js.append(generateJStype());
////        
//            js.append(generateJStype1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}