package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Bollinger Bands %B (BBands %B) indicator class.
 */
public class BBandsB extends JsObject {

    public BBandsB() {
        js.setLength(0);
        js.append("var bBandsB").append(++variableIndex).append(" = anychart.core.stock.indicators.bBandsB();");
        jsBase = "bBandsB" + variableIndex;
    }

    protected BBandsB(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected BBandsB(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double deviation;
    private List<BBandsB> setDeviation = new ArrayList<>();

    /**
     * Setter for the deviation.
     */
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
    private String generateJSsetDeviation() {
        if (!setDeviation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : setDeviation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBandsB> getPeriod = new ArrayList<>();

    /**
     * Getter and setter for the period.
     */
    public BBandsB getPeriod(Double period) {
        BBandsB item = new BBandsB(jsBase + ".period(" + period + ")");
        getPeriod.add(item);
        return item;
    }

    private StockSeriesBase getSeries;

    /**
     * Getter for the indicator series.
     */
    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;
    private String type1;
    private List<BBandsB> setSeries = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
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
    private String generateJSsetSeries() {
        if (!setSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : setSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBandsB> setSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
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
    private String generateJSsetSeries1() {
        if (!setSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : setSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

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

        js.append(generateJsGetters());

        js.append(generateJSsetDeviation());
        js.append(generateJSsetSeries());
        js.append(generateJSsetSeries1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}