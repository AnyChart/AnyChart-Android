package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * KDJ indicator class.
{docs:Stock_Charts/Technical_Indicators/KDJ}Learn more about the KDJ indicator.{docs}
 */
public class KDJ extends JsObject {

    public KDJ() {
        js.setLength(0);
        js.append("var kDJ").append(++variableIndex).append(" = anychart.core.stock.indicators.kDJ();");
        jsBase = "kDJ" + variableIndex;
    }

    protected KDJ(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected KDJ(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private MovingAverageType dMAType;
    private String dMAType1;
    private List<KDJ> setDMAType = new ArrayList<>();

    /**
     * Setter for the %D smoothing type.
     */
    public KDJ setDMAType(MovingAverageType dMAType) {
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
            for (KDJ item : setDMAType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setDMAType1 = new ArrayList<>();

    /**
     * Setter for the %D smoothing type.
     */
    public KDJ setDMAType(String dMAType1) {
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
            for (KDJ item : setDMAType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dMultiplier;
    private List<KDJ> setDMultiplier = new ArrayList<>();

    /**
     * Setter for the %D multiplier.
     */
    public KDJ setDMultiplier(Double dMultiplier) {
        if (jsBase == null) {
            this.dMultiplier = dMultiplier;
        } else {
            this.dMultiplier = dMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dMultiplier(%f)", dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dMultiplier(%f)", dMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDMultiplier() {
        if (!setDMultiplier.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setDMultiplier) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dPeriod;
    private List<KDJ> setDPeriod = new ArrayList<>();

    /**
     * Setter for the %D Period.
     */
    public KDJ setDPeriod(Double dPeriod) {
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
            for (KDJ item : setDPeriod) {
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
    private List<KDJ> setDSeries = new ArrayList<>();

    /**
     * Setter for the indicator %D Series.
     */
    public KDJ setDSeries(StockSeriesType type) {
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
            for (KDJ item : setDSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setDSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator %D Series.
     */
    public KDJ setDSeries(String type1) {
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
            for (KDJ item : setDSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesBase getJSeries;

    /**
     * Getter for the indicator %J Series.
     */
    public StockSeriesBase getJSeries() {
        if (getJSeries == null)
            getJSeries = new StockSeriesBase(jsBase + ".jSeries()");

        return getJSeries;
    }

    private StockSeriesType type2;
    private String type3;
    private List<KDJ> setJSeries = new ArrayList<>();

    /**
     * Setter for the indicator %J Series.
     */
    public KDJ setJSeries(StockSeriesType type2) {
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
            js.append(String.format(Locale.US, ".jSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".jSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetJSeries() {
        if (!setJSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setJSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setJSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator %J Series.
     */
    public KDJ setJSeries(String type3) {
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
            js.append(String.format(Locale.US, ".jSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".jSeries(%s)", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetJSeries1() {
        if (!setJSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setJSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> getKMAPeriod = new ArrayList<>();

    /**
     * Getter and setter for the %K smoothing period.
     */
    public KDJ getKMAPeriod(Double kMAPeriod) {
        KDJ item = new KDJ(jsBase + ".kMAPeriod(" + kMAPeriod + ")");
        getKMAPeriod.add(item);
        return item;
    }

    private MovingAverageType kMAType;
    private String kMAType1;
    private List<KDJ> setKMAType = new ArrayList<>();

    /**
     * Setter for the %K smoothing type.
     */
    public KDJ setKMAType(MovingAverageType kMAType) {
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
            for (KDJ item : setKMAType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKMAType1 = new ArrayList<>();

    /**
     * Setter for the %K smoothing type.
     */
    public KDJ setKMAType(String kMAType1) {
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
            for (KDJ item : setKMAType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double kMultiplier;
    private List<KDJ> setKMultiplier = new ArrayList<>();

    /**
     * Setter for the %K multiplier.
     */
    public KDJ setKMultiplier(Double kMultiplier) {
        if (jsBase == null) {
            this.kMultiplier = kMultiplier;
        } else {
            this.kMultiplier = kMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".kMultiplier(%f)", kMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kMultiplier(%f)", kMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKMultiplier() {
        if (!setKMultiplier.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKMultiplier) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double kPeriod;
    private List<KDJ> setKPeriod = new ArrayList<>();

    /**
     * Setter for the %K Period.
     */
    public KDJ setKPeriod(Double kPeriod) {
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
            for (KDJ item : setKPeriod) {
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

    private StockSeriesType type4;
    private String type5;
    private List<KDJ> setKSeries = new ArrayList<>();

    /**
     * Setter for the indicator %K Series.
     */
    public KDJ setKSeries(StockSeriesType type4) {
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
            js.append(String.format(Locale.US, ".kSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKSeries() {
        if (!setKSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator %K Series.
     */
    public KDJ setKSeries(String type5) {
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
            js.append(String.format(Locale.US, ".kSeries(%s)", wrapQuotes(type5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".kSeries(%s)", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetKSeries1() {
        if (!setKSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKSeries1) {
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

    private String generateJSgetJSeries() {
        if (getJSeries != null) {
            return getJSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetKMAPeriod() {
        if (!getKMAPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : getKMAPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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
        jsGetters.append(generateJSgetJSeries());
        jsGetters.append(generateJSgetKMAPeriod());
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
        js.append(generateJSsetDMultiplier());
        js.append(generateJSsetDPeriod());
        js.append(generateJSsetDSeries());
        js.append(generateJSsetDSeries1());
        js.append(generateJSsetJSeries());
        js.append(generateJSsetJSeries1());
        js.append(generateJSsetKMAType());
        js.append(generateJSsetKMAType1());
        js.append(generateJSsetKMultiplier());
        js.append(generateJSsetKPeriod());
        js.append(generateJSsetKSeries());
        js.append(generateJSsetKSeries1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}