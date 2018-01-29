package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Bollinger Bands (BBands) indicator class.
 */
public class BBands extends JsObject {

    public BBands() {
        js.setLength(0);
        js.append("var bBands").append(++variableIndex).append(" = anychart.core.stock.indicators.bBands();");
        jsBase = "bBands" + variableIndex;
    }

    protected BBands(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected BBands(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number deviation;

    /**
     * Setter for the deviation.
     */
    public BBands setDeviation(Number deviation) {
        if (jsBase == null) {
            this.deviation = deviation;
        } else {
            this.deviation = deviation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".deviation(%s)", deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".deviation(%s);", deviation));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getLowerSeries;

    /**
     * Getter for the indicator Lower Series.
     */
    public StockSeriesBase getLowerSeries() {
        if (getLowerSeries == null)
            getLowerSeries = new StockSeriesBase(jsBase + ".lowerSeries()");

        return getLowerSeries;
    }

    private StockSeriesType type;
    private String type1;

    /**
     * Setter for the indicator Lower Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerSeries(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator Lower Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lowerSeries(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getMiddleSeries;

    /**
     * Getter for the indicator Middle Series.
     */
    public StockSeriesBase getMiddleSeries() {
        if (getMiddleSeries == null)
            getMiddleSeries = new StockSeriesBase(jsBase + ".middleSeries()");

        return getMiddleSeries;
    }

    private StockSeriesType type2;
    private String type3;

    /**
     * Setter for the indicator Middle Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleSeries(%s);", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator Middle Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleSeries(%s);", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number period;

    /**
     * Setter for the period.
     */
    public BBands setPeriod(Number period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".period(%s)", period));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".period(%s);", period));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getUpperSeries;

    /**
     * Getter for the indicator Upper Series.
     */
    public StockSeriesBase getUpperSeries() {
        if (getUpperSeries == null)
            getUpperSeries = new StockSeriesBase(jsBase + ".upperSeries()");

        return getUpperSeries;
    }

    private StockSeriesType type4;
    private String type5;

    /**
     * Setter for the indicator Upper Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperSeries(%s);", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator Upper Series.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upperSeries(%s);", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLowerSeries() {
        if (getLowerSeries != null) {
            return getLowerSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetMiddleSeries() {
        if (getMiddleSeries != null) {
            return getMiddleSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetUpperSeries() {
        if (getUpperSeries != null) {
            return getUpperSeries.generateJs();
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}