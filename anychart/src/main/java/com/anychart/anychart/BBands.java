package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    
    private Double deviation;
    private List<BBands> setDeviation = new ArrayList<>();

    /**
     * Setter for the deviation.
     */
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
    private String generateJSsetDeviation() {
        if (!setDeviation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setDeviation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<BBands> setLowerSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".lowerSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowerSeries() {
        if (!setLowerSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setLowerSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setLowerSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".lowerSeries(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowerSeries1() {
        if (!setLowerSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setLowerSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<BBands> setMiddleSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".middleSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleSeries() {
        if (!setMiddleSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setMiddleSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setMiddleSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".middleSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleSeries1() {
        if (!setMiddleSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setMiddleSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double period;
    private List<BBands> setPeriod = new ArrayList<>();

    /**
     * Setter for the period.
     */
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
    private String generateJSsetPeriod() {
        if (!setPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<BBands> setUpperSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".upperSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUpperSeries() {
        if (!setUpperSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setUpperSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setUpperSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".upperSeries(%s)", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUpperSeries1() {
        if (!setUpperSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setUpperSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetDeviation());
        js.append(generateJSsetLowerSeries());
        js.append(generateJSsetLowerSeries1());
        js.append(generateJSsetMiddleSeries());
        js.append(generateJSsetMiddleSeries1());
        js.append(generateJSsetPeriod());
        js.append(generateJSsetUpperSeries());
        js.append(generateJSsetUpperSeries1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}