package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dMAType(%s);", ((dMAType != null) ? dMAType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dMAType(%s);", wrapQuotes(dMAType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number dMultiplier;

    /**
     * Setter for the %D multiplier.
     */
    public KDJ setDMultiplier(Number dMultiplier) {
        if (jsBase == null) {
            this.dMultiplier = dMultiplier;
        } else {
            this.dMultiplier = dMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".dMultiplier(%s)", dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dMultiplier(%s);", dMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number dPeriod;

    /**
     * Setter for the %D Period.
     */
    public KDJ setDPeriod(Number dPeriod) {
        if (jsBase == null) {
            this.dPeriod = dPeriod;
        } else {
            this.dPeriod = dPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".dPeriod(%s)", dPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dPeriod(%s);", dPeriod));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dSeries(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dSeries(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jSeries(%s);", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jSeries(%s);", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<KDJ> getKMAPeriod = new ArrayList<>();

    /**
     * Getter and setter for the %K smoothing period.
     */
    public KDJ getKMAPeriod(Number kMAPeriod) {
        KDJ item = new KDJ(jsBase + ".kMAPeriod(" + kMAPeriod + ")");
        getKMAPeriod.add(item);
        return item;
    }

    private MovingAverageType kMAType;
    private String kMAType1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMAType(%s);", ((kMAType != null) ? kMAType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMAType(%s);", wrapQuotes(kMAType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number kMultiplier;

    /**
     * Setter for the %K multiplier.
     */
    public KDJ setKMultiplier(Number kMultiplier) {
        if (jsBase == null) {
            this.kMultiplier = kMultiplier;
        } else {
            this.kMultiplier = kMultiplier;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kMultiplier(%s)", kMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kMultiplier(%s);", kMultiplier));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number kPeriod;

    /**
     * Setter for the %K Period.
     */
    public KDJ setKPeriod(Number kPeriod) {
        if (jsBase == null) {
            this.kPeriod = kPeriod;
        } else {
            this.kPeriod = kPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".kPeriod(%s)", kPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kPeriod(%s);", kPeriod));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kSeries(%s);", ((type4 != null) ? type4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kSeries(%s);", wrapQuotes(type5)));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}