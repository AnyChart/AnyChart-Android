package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Parabolic SAR (PSAR) indicator class.
 */
public class PSAR extends JsObject {

    public PSAR() {
        js.setLength(0);
        js.append("var pSAR").append(++variableIndex).append(" = anychart.core.stock.indicators.pSAR();");
        jsBase = "pSAR" + variableIndex;
    }

    protected PSAR(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PSAR(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number accelerationFactorIncrement;

    /**
     * Setter for the acceleration factor increment value.
     */
    public PSAR setAccelerationFactorIncrement(Number accelerationFactorIncrement) {
        if (jsBase == null) {
            this.accelerationFactorIncrement = accelerationFactorIncrement;
        } else {
            this.accelerationFactorIncrement = accelerationFactorIncrement;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".accelerationFactorIncrement(%s)", accelerationFactorIncrement));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".accelerationFactorIncrement(%s);", accelerationFactorIncrement));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number accelerationFactorMaximum;

    /**
     * Setter for the acceleration factor maximum.
     */
    public PSAR setAccelerationFactorMaximum(Number accelerationFactorMaximum) {
        if (jsBase == null) {
            this.accelerationFactorMaximum = accelerationFactorMaximum;
        } else {
            this.accelerationFactorMaximum = accelerationFactorMaximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".accelerationFactorMaximum(%s)", accelerationFactorMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".accelerationFactorMaximum(%s);", accelerationFactorMaximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number accelerationFactorStart;

    /**
     * Setter for the acceleration factor start.
     */
    public PSAR setAccelerationFactorStart(Number accelerationFactorStart) {
        if (jsBase == null) {
            this.accelerationFactorStart = accelerationFactorStart;
        } else {
            this.accelerationFactorStart = accelerationFactorStart;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".accelerationFactorStart(%s)", accelerationFactorStart));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".accelerationFactorStart(%s);", accelerationFactorStart));
                js.setLength(0);
            }
        }
        return this;
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
    public PSAR setSeries(StockSeriesType type) {
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
    public PSAR setSeries(String type1) {
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}