package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * DMI indicator class.
 */
public class DMI extends JsObject {

    public DMI() {
        js.setLength(0);
        js.append("var dMI").append(++variableIndex).append(" = anychart.core.stock.indicators.dMI();");
        jsBase = "dMI" + variableIndex;
    }

    protected DMI(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected DMI(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number adxPeriod;

    /**
     * Setter for the ADX period.
     */
    public DMI setAdxPeriod(Number adxPeriod) {
        if (jsBase == null) {
            this.adxPeriod = adxPeriod;
        } else {
            this.adxPeriod = adxPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adxPeriod(%s)", adxPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adxPeriod(%s);", adxPeriod));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getAdxSeries;

    /**
     * Getter for the indicator ADX series.
     */
    public StockSeriesBase getAdxSeries() {
        if (getAdxSeries == null)
            getAdxSeries = new StockSeriesBase(jsBase + ".adxSeries()");

        return getAdxSeries;
    }

    private StockSeriesType type;
    private String type1;

    /**
     * Setter for the indicator ADX series.
     */
    public DMI setAdxSeries(StockSeriesType type) {
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
            
            js.append(String.format(Locale.US, ".adxSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adxSeries(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator ADX series.
     */
    public DMI setAdxSeries(String type1) {
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
            
            js.append(String.format(Locale.US, ".adxSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adxSeries(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getNdiSeries;

    /**
     * Getter for the indicator -DI series.
     */
    public StockSeriesBase getNdiSeries() {
        if (getNdiSeries == null)
            getNdiSeries = new StockSeriesBase(jsBase + ".ndiSeries()");

        return getNdiSeries;
    }

    private StockSeriesType type2;
    private String type3;

    /**
     * Setter for the indicator -DI series.
     */
    public DMI setNdiSeries(StockSeriesType type2) {
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
            
            js.append(String.format(Locale.US, ".ndiSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ndiSeries(%s);", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator -DI series.
     */
    public DMI setNdiSeries(String type3) {
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
            
            js.append(String.format(Locale.US, ".ndiSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ndiSeries(%s);", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesBase getPdiSeries;

    /**
     * Getter for the indicator +DI series.
     */
    public StockSeriesBase getPdiSeries() {
        if (getPdiSeries == null)
            getPdiSeries = new StockSeriesBase(jsBase + ".pdiSeries()");

        return getPdiSeries;
    }

    private StockSeriesType type4;
    private String type5;

    /**
     * Setter for the indicator +DI series.
     */
    public DMI setPdiSeries(StockSeriesType type4) {
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
            
            js.append(String.format(Locale.US, ".pdiSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pdiSeries(%s);", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator +DI series.
     */
    public DMI setPdiSeries(String type5) {
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
            
            js.append(String.format(Locale.US, ".pdiSeries(%s)", wrapQuotes(type5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pdiSeries(%s);", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number period;

    /**
     * Setter for the period.
     */
    public DMI setPeriod(Number period) {
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

    private List<DMI> getUseWildersSmoothing = new ArrayList<>();

    /**
     * Getter and setter for the Wilders smoothing.
     */
    public DMI getUseWildersSmoothing(Boolean useWildersSmoothing) {
        DMI item = new DMI(jsBase + ".useWildersSmoothing(" + useWildersSmoothing + ")");
        getUseWildersSmoothing.add(item);
        return item;
    }

    private String generateJSgetAdxSeries() {
        if (getAdxSeries != null) {
            return getAdxSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetNdiSeries() {
        if (getNdiSeries != null) {
            return getNdiSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetPdiSeries() {
        if (getPdiSeries != null) {
            return getPdiSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetUseWildersSmoothing() {
        if (!getUseWildersSmoothing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : getUseWildersSmoothing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAdxSeries());
        jsGetters.append(generateJSgetNdiSeries());
        jsGetters.append(generateJSgetPdiSeries());
        jsGetters.append(generateJSgetUseWildersSmoothing());

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