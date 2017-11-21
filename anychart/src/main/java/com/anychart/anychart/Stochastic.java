package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Stochastic indicator class.
{docs:Stock_Charts/Technical_Indicators/Stochastic_Oscillator}Learn more about the Stochastic indicator.{docs}
 */
public class Stochastic extends JsObject {

    public Stochastic() {
        js.setLength(0);
        js.append("var stochastic").append(++variableIndex).append(" = anychart.core.stock.indicators.stochastic();");
        jsBase = "stochastic" + variableIndex;
    }

    protected Stochastic(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Stochastic(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private MovingAverageType dMAType;
    private String dMAType1;
    private List<Stochastic> setDMAType = new ArrayList<>();

    /**
     * Setter for the %D smoothing type.
     */
    public Stochastic setDMAType(MovingAverageType dMAType) {
        if (jsBase == null) {
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
        } else {
            this.dMAType = dMAType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".dMAType(%s)", ((dMAType != null) ? dMAType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMAType(%s)", ((dMAType != null) ? dMAType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDMAType() {
        if (!setDMAType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setDMAType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setDMAType1 = new ArrayList<>();

    /**
     * Setter for the %D smoothing type.
     */
    public Stochastic setDMAType(String dMAType1) {
        if (jsBase == null) {
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
        } else {
            this.dMAType1 = dMAType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".dMAType(%s)", wrapQuotes(dMAType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMAType(%s)", wrapQuotes(dMAType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDMAType1() {
        if (!setDMAType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setDMAType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dPeriod;
    private List<Stochastic> setDPeriod = new ArrayList<>();

    /**
     * Setter for the %D Period.
     */
    public Stochastic setDPeriod(Double dPeriod) {
        if (jsBase == null) {
            this.dPeriod = dPeriod;
        } else {
            this.dPeriod = dPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".dPeriod(%f)", dPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dPeriod(%f)", dPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDPeriod() {
        if (!setDPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setDPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesBase getDSeries;

    /**
     * Getter for the indicator %D Series.
     */
    public StockSeriesBase getDSeries() {
        if (getDSeries == null)
            getDSeries = new StockSeriesBase(jsBase + ".dSeries()");

        return getDSeries;
    }

    private StockSeriesType type;
    private String type1;
    private List<Stochastic> setDSeries = new ArrayList<>();

    /**
     * Setter for the indicator %D Series.
     */
    public Stochastic setDSeries(StockSeriesType type) {
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
            
            js.append(String.format(Locale.US, ".dSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dSeries(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDSeries() {
        if (!setDSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setDSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setDSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator %D Series.
     */
    public Stochastic setDSeries(String type1) {
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
            
            js.append(String.format(Locale.US, ".dSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dSeries(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDSeries1() {
        if (!setDSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setDSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double kMAPeriod;
    private List<Stochastic> setKMAPeriod = new ArrayList<>();

    /**
     * Setter for the %K smoothing period.
     */
    public Stochastic setKMAPeriod(Double kMAPeriod) {
        if (jsBase == null) {
            this.kMAPeriod = kMAPeriod;
        } else {
            this.kMAPeriod = kMAPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kMAPeriod(%f)", kMAPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAPeriod(%f)", kMAPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKMAPeriod() {
        if (!setKMAPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKMAPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MovingAverageType kMAType;
    private String kMAType1;
    private List<Stochastic> setKMAType = new ArrayList<>();

    /**
     * Setter for the %K smoothing type.
     */
    public Stochastic setKMAType(MovingAverageType kMAType) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
        } else {
            this.kMAType = kMAType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kMAType(%s)", ((kMAType != null) ? kMAType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAType(%s)", ((kMAType != null) ? kMAType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKMAType() {
        if (!setKMAType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKMAType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setKMAType1 = new ArrayList<>();

    /**
     * Setter for the %K smoothing type.
     */
    public Stochastic setKMAType(String kMAType1) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
        } else {
            this.kMAType1 = kMAType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kMAType(%s)", wrapQuotes(kMAType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMAType(%s)", wrapQuotes(kMAType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKMAType1() {
        if (!setKMAType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKMAType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double kPeriod;
    private List<Stochastic> setKPeriod = new ArrayList<>();

    /**
     * Setter for the %K Period.
     */
    public Stochastic setKPeriod(Double kPeriod) {
        if (jsBase == null) {
            this.kPeriod = kPeriod;
        } else {
            this.kPeriod = kPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kPeriod(%f)", kPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kPeriod(%f)", kPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKPeriod() {
        if (!setKPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesBase getKSeries;

    /**
     * Getter for the indicator %K Series.
     */
    public StockSeriesBase getKSeries() {
        if (getKSeries == null)
            getKSeries = new StockSeriesBase(jsBase + ".kSeries()");

        return getKSeries;
    }

    private StockSeriesType type2;
    private String type3;
    private List<Stochastic> setKSeries = new ArrayList<>();

    /**
     * Setter for the indicator %K Series.
     */
    public Stochastic setKSeries(StockSeriesType type2) {
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
            
            js.append(String.format(Locale.US, ".kSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKSeries() {
        if (!setKSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setKSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator %K Series.
     */
    public Stochastic setKSeries(String type3) {
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
            
            js.append(String.format(Locale.US, ".kSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKSeries1() {
        if (!setKSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setKSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetDSeries() {
        if (getDSeries != null) {
            return getDSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetKSeries() {
        if (getKSeries != null) {
            return getKSeries.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetDSeries());
        jsGetters.append(generateJSgetKSeries());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDMAType());
        js.append(generateJSsetDMAType1());
        js.append(generateJSsetDPeriod());
        js.append(generateJSsetDSeries());
        js.append(generateJSsetDSeries1());
        js.append(generateJSsetKMAPeriod());
        js.append(generateJSsetKMAType());
        js.append(generateJSsetKMAType1());
        js.append(generateJSsetKPeriod());
        js.append(generateJSsetKSeries());
        js.append(generateJSsetKSeries1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}