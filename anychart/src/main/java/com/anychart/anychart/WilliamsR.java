package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Williams %R (%R) indicator class.
 */
public class WilliamsR extends JsObject {

    public WilliamsR() {
        js.setLength(0);
        js.append("var williamsR").append(++variableIndex).append(" = anychart.core.stock.indicators.williamsR();");
        jsBase = "williamsR" + variableIndex;
    }

    protected WilliamsR(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected WilliamsR(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number period;
    private List<MFI> setPeriod = new ArrayList<>();

    /**
     * Setter for the indicator period.
     */
    public MFI setPeriod(Number period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPeriod" + ++variableIndex + " = " + jsBase + ".period(%s);", period));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".period(%s);", period));
                js.setLength(0);
            }
        }
        MFI item = new MFI("setPeriod" + variableIndex);
        setPeriod.add(item);
        return item;
    }
    private String generateJSsetPeriod() {
        if (!setPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MFI item : setPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

    /**
     * Setter for the indicator series.
     */
    public WilliamsR setSeries(StockSeriesType type) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator series.
     */
    public WilliamsR setSeries(String type1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
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

        js.append(generateJSsetPeriod());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}