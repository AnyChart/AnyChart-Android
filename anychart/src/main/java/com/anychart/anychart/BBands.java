package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class BBands extends JsObject {

    public BBands() {

    }

    protected BBands(String jsBase) {
        this.jsBase = jsBase;
    }

    protected BBands(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double deviation;

    public BBands setDeviation(Double deviation) {
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

    private StockSeriesBase getLowerSeries;

    public StockSeriesBase getLowerSeries() {
        if (getLowerSeries == null)
            getLowerSeries = new StockSeriesBase(jsBase + ".lowerSeries()");

        return getLowerSeries;
    }

    private StockSeriesType type;
    private String type1;

    public BBands setLowerSeries(StockSeriesType type) {
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

            js.append(String.format(Locale.US, ".lowerSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public BBands setLowerSeries(String type1) {
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

            js.append(String.format(Locale.US, ".lowerSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerSeries(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getMiddleSeries;

    public StockSeriesBase getMiddleSeries() {
        if (getMiddleSeries == null)
            getMiddleSeries = new StockSeriesBase(jsBase + ".middleSeries()");

        return getMiddleSeries;
    }

    private StockSeriesType type2;
    private String type3;

    public BBands setMiddleSeries(StockSeriesType type2) {
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

            js.append(String.format(Locale.US, ".middleSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public BBands setMiddleSeries(String type3) {
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

            js.append(String.format(Locale.US, ".middleSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double period;

    public BBands setPeriod(Double period) {
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

    private StockSeriesBase getUpperSeries;

    public StockSeriesBase getUpperSeries() {
        if (getUpperSeries == null)
            getUpperSeries = new StockSeriesBase(jsBase + ".upperSeries()");

        return getUpperSeries;
    }

    private StockSeriesType type4;
    private String type5;

    public BBands setUpperSeries(StockSeriesType type4) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".upperSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public BBands setUpperSeries(String type5) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".upperSeries(%s)", wrapQuotes(type5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperSeries(%s)", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSStockSeriesBase getLowerSeries() {
//        if (StockSeriesBase getLowerSeries != null) {
//            return StockSeriesBase getLowerSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getMiddleSeries() {
//        if (StockSeriesBase getMiddleSeries != null) {
//            return StockSeriesBase getMiddleSeries.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStockSeriesBase getUpperSeries() {
//        if (StockSeriesBase getUpperSeries != null) {
//            return StockSeriesBase getUpperSeries.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetLowerSeries() {
        if (getLowerSeries != null) {
            return getLowerSeries.generateJs();
            //return String.format(Locale.US, "getLowerSeries: %s,", ((getLowerSeries != null) ? getLowerSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetMiddleSeries() {
        if (getMiddleSeries != null) {
            return getMiddleSeries.generateJs();
            //return String.format(Locale.US, "getMiddleSeries: %s,", ((getMiddleSeries != null) ? getMiddleSeries.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetUpperSeries() {
        if (getUpperSeries != null) {
            return getUpperSeries.generateJs();
            //return String.format(Locale.US, "getUpperSeries: %s,", ((getUpperSeries != null) ? getUpperSeries.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLowerSeries());
        jsGetters.append(generateJSgetMiddleSeries());
        jsGetters.append(generateJSgetUpperSeries());

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
////        
//            js.append(generateJStype2());
////        
//            js.append(generateJStype3());
////        
//            js.append(generateJSperiod());
////        
//            js.append(generateJStype4());
////        
//            js.append(generateJStype5());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}