package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Moving Average Convergence Divergence (MACD) indicator class.
{docs:Stock_Charts/Technical_Indicators/Moving_Average_Convergence_Divergence_(MACD)}Learn more about the MACD indicator.{docs}
 */
public class MACD extends JsObject {

    public MACD() {
        js.setLength(0);
        js.append("var mACD").append(++variableIndex).append(" = anychart.core.stock.indicators.mACD();");
        jsBase = "mACD" + variableIndex;
    }

    protected MACD(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected MACD(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number fastPeriod;

    /**
     * Setter for the fast period.
     */
    public MACD setFastPeriod(Number fastPeriod) {
        if (jsBase == null) {
            this.fastPeriod = fastPeriod;
        } else {
            this.fastPeriod = fastPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fastPeriod(%s)", fastPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fastPeriod(%s);", fastPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getHistogramSeries;

    /**
     * Getter for the current indicator histogram series.
     */
    public StockSeriesBase getHistogramSeries() {
        if (getHistogramSeries == null)
            getHistogramSeries = new StockSeriesBase(jsBase + ".histogramSeries()");

        return getHistogramSeries;
    }

    private StockSeriesType type;
    private String type1;

    /**
     * Setter for the indicator histogram series.
     */
    public MACD setHistogramSeries(StockSeriesType type) {
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
            
            js.append(String.format(Locale.US, ".histogramSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".histogramSeries(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator histogram series.
     */
    public MACD setHistogramSeries(String type1) {
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
            
            js.append(String.format(Locale.US, ".histogramSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".histogramSeries(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getMacdSeries;

    /**
     * Getter for the current indicator MACD series.
     */
    public StockSeriesBase getMacdSeries() {
        if (getMacdSeries == null)
            getMacdSeries = new StockSeriesBase(jsBase + ".macdSeries()");

        return getMacdSeries;
    }

    private StockSeriesType type2;
    private String type3;

    /**
     * Setter for the indicator MACD series.
     */
    public MACD setMacdSeries(StockSeriesType type2) {
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
            
            js.append(String.format(Locale.US, ".macdSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macdSeries(%s);", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator MACD series.
     */
    public MACD setMacdSeries(String type3) {
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
            
            js.append(String.format(Locale.US, ".macdSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macdSeries(%s);", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number signalPeriod;

    /**
     * Setter for the signal period.
     */
    public MACD setSignalPeriod(Number signalPeriod) {
        if (jsBase == null) {
            this.signalPeriod = signalPeriod;
        } else {
            this.signalPeriod = signalPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".signalPeriod(%s)", signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalPeriod(%s);", signalPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getSignalSeries;

    /**
     * Getter for the current signal series.
     */
    public StockSeriesBase getSignalSeries() {
        if (getSignalSeries == null)
            getSignalSeries = new StockSeriesBase(jsBase + ".signalSeries()");

        return getSignalSeries;
    }

    private StockSeriesType type4;
    private String type5;

    /**
     * Setter for the signal series.
     */
    public MACD setSignalSeries(StockSeriesType type4) {
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
            
            js.append(String.format(Locale.US, ".signalSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalSeries(%s);", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the signal series.
     */
    public MACD setSignalSeries(String type5) {
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
            
            js.append(String.format(Locale.US, ".signalSeries(%s)", wrapQuotes(type5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".signalSeries(%s);", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<MACD> getSlowPeriod = new ArrayList<>();

    /**
     * Getter and setter for the slow period.
     */
    public MACD getSlowPeriod(Number slowPeriod) {
        MACD item = new MACD(jsBase + ".slowPeriod(" + slowPeriod + ")");
        getSlowPeriod.add(item);
        return item;
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
        if (!getSlowPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : getSlowPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}