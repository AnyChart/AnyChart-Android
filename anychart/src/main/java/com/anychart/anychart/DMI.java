package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

    
    private Double adxPeriod;
    private List<DMI> setAdxPeriod = new ArrayList<>();

    /**
     * Setter for the ADX period.
     */
    public DMI setAdxPeriod(Double adxPeriod) {
        if (jsBase == null) {
            this.adxPeriod = adxPeriod;
        } else {
            this.adxPeriod = adxPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".adxPeriod(%f)", adxPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adxPeriod(%f)", adxPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdxPeriod() {
        if (!setAdxPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setAdxPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<DMI> setAdxSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".adxSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdxSeries() {
        if (!setAdxSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setAdxSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setAdxSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".adxSeries(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdxSeries1() {
        if (!setAdxSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setAdxSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<DMI> setNdiSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".ndiSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNdiSeries() {
        if (!setNdiSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setNdiSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setNdiSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".ndiSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNdiSeries1() {
        if (!setNdiSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setNdiSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<DMI> setPdiSeries = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".pdiSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPdiSeries() {
        if (!setPdiSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setPdiSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setPdiSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".pdiSeries(%s)", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPdiSeries1() {
        if (!setPdiSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setPdiSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double period;
    private List<DMI> setPeriod = new ArrayList<>();

    /**
     * Setter for the period.
     */
    public DMI setPeriod(Double period) {
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
            for (DMI item : setPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetAdxPeriod());
        js.append(generateJSsetAdxSeries());
        js.append(generateJSsetAdxSeries1());
        js.append(generateJSsetNdiSeries());
        js.append(generateJSsetNdiSeries1());
        js.append(generateJSsetPdiSeries());
        js.append(generateJSsetPdiSeries1());
        js.append(generateJSsetPeriod());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}