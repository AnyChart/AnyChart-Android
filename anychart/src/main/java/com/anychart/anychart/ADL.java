package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Accumulation Distribution Line (ADL) indicator class.
 */
public class ADL extends JsObject {

    public ADL() {
        js.setLength(0);
        js.append("var aDL").append(++variableIndex).append(" = anychart.core.stock.indicators.aDL();");
        jsBase = "aDL" + variableIndex;
    }

    protected ADL(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ADL(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
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
    private List<ADL> setSeries = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
    public ADL setSeries(StockSeriesType type) {
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
            for (ADL item : setSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ADL> setSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
    public ADL setSeries(String type1) {
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
            for (ADL item : setSeries1) {
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

        js.append(generateJSsetSeries());
        js.append(generateJSsetSeries1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}