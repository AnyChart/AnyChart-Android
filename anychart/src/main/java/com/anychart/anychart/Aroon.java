package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Aroon indicator class.
{docs:Stock_Charts/Technical_Indicators/Aroon}Learn more about the Aroon indicator.{docs}
 */
public class Aroon extends JsObject {

    public Aroon() {
        js.setLength(0);
        js.append("var aroon").append(++variableIndex).append(" = anychart.core.stock.indicators.aroon();");
        jsBase = "aroon" + variableIndex;
    }

    protected Aroon(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Aroon(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private StockSeriesBase getDownSeries;

    /**
     * Getter for the indicator Down Series.
     */
    public StockSeriesBase getDownSeries() {
        if (getDownSeries == null)
            getDownSeries = new StockSeriesBase(jsBase + ".downSeries()");

        return getDownSeries;
    }

    private StockSeriesType type;
    private String type1;

    /**
     * Setter for the indicator Down Series.
     */
    public Aroon setDownSeries(StockSeriesType type) {
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
            
            js.append(String.format(Locale.US, ".downSeries(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".downSeries(%s);", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator Down Series.
     */
    public Aroon setDownSeries(String type1) {
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
            
            js.append(String.format(Locale.US, ".downSeries(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".downSeries(%s);", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number period;

    /**
     * Setter for the indicator period.
     */
    public Aroon setPeriod(Number period) {
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

    private StockSeriesBase getUpSeries;

    /**
     * Getter for the indicator Up Series.
     */
    public StockSeriesBase getUpSeries() {
        if (getUpSeries == null)
            getUpSeries = new StockSeriesBase(jsBase + ".upSeries()");

        return getUpSeries;
    }

    private StockSeriesType type2;
    private String type3;

    /**
     * Setter for the indicator Up Series.
     */
    public Aroon setUpSeries(StockSeriesType type2) {
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
            
            js.append(String.format(Locale.US, ".upSeries(%s)", ((type2 != null) ? type2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upSeries(%s);", ((type2 != null) ? type2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the indicator Up Series.
     */
    public Aroon setUpSeries(String type3) {
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
            
            js.append(String.format(Locale.US, ".upSeries(%s)", wrapQuotes(type3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".upSeries(%s);", wrapQuotes(type3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetDownSeries() {
        if (getDownSeries != null) {
            return getDownSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetUpSeries() {
        if (getUpSeries != null) {
            return getUpSeries.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetDownSeries());
        jsGetters.append(generateJSgetUpSeries());

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