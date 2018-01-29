package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock Plot class.
 */
public class Plot extends VisualBaseWithBounds {

    public Plot() {
        js.setLength(0);
        js.append("var plot").append(++variableIndex).append(" = anychart.core.stock.plot();");
        jsBase = "plot" + variableIndex;
    }

    protected Plot(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Plot(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TableMapping var_args;

    /**
     * Add series to chart.
     */
    public void addSeries(TableMapping var_args) {
        if (jsBase == null) {
            this.var_args = var_args;
        } else {
            this.var_args = var_args;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(var_args.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addSeries(%s);",  ((var_args != null) ? var_args.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s);", ((var_args != null) ? var_args.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private TableMapping mapping;
    private StockSeriesType seriesType;
    private String seriesType1;
    private List<ADL> setAdl = new ArrayList<>();

    /**
     * Creates an Accumulation Distribution Line indicator on the plot.
     */
    public ADL adl(TableMapping mapping, StockSeriesType seriesType) {
        if (jsBase == null) {
            this.mapping = mapping;
            this.seriesType = null;
            this.seriesType1 = null;
            
            this.seriesType = seriesType;
        } else {
            this.mapping = mapping;
            this.seriesType = seriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setAdl" + ++variableIndex + " = " + jsBase + ".adl(%s, %s);", ((mapping != null) ? mapping.getJsBase() : "null"), ((seriesType != null) ? seriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s);", ((mapping != null) ? mapping.getJsBase() : "null"), ((seriesType != null) ? seriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ADL item = new ADL("setAdl" + variableIndex);
        setAdl.add(item);
        return item;
    }
    private String generateJSsetAdl() {
        if (!setAdl.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ADL item : setAdl) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ADL> setAdl1 = new ArrayList<>();

    /**
     * Creates an Accumulation Distribution Line indicator on the plot.
     */
    public ADL adl(TableMapping mapping, String seriesType1) {
        if (jsBase == null) {
            this.mapping = mapping;
            this.seriesType = null;
            this.seriesType1 = null;
            
            this.seriesType1 = seriesType1;
        } else {
            this.mapping = mapping;
            this.seriesType1 = seriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setAdl1" + ++variableIndex + " = " + jsBase + ".adl(%s, %s);", ((mapping != null) ? mapping.getJsBase() : "null"), wrapQuotes(seriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s);", ((mapping != null) ? mapping.getJsBase() : "null"), wrapQuotes(seriesType1)));
                js.setLength(0);
            }
        }
        ADL item = new ADL("setAdl1" + variableIndex);
        setAdl1.add(item);
        return item;
    }
    private String generateJSsetAdl1() {
        if (!setAdl1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ADL item : setAdl1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping1;
    private Number period;
    private Number fastPeriod;
    private Number slowPeriod;
    private StockSeriesType seriesType2;
    private String seriesType3;
    private List<AMA> setAma = new ArrayList<>();

    /**
     * Creates AMA (Adaptive Moving Average) indicator on the plot.
     */
    public AMA ama(TableMapping mapping1, Number period, Number fastPeriod, Number slowPeriod, StockSeriesType seriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            
            this.seriesType2 = seriesType2;
        } else {
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.seriesType2 = seriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping1.generateJs());
            js.append(String.format(Locale.US, "var setAma" + ++variableIndex + " = " + jsBase + ".ama(%s, %s, %s, %s, %s);", ((mapping1 != null) ? mapping1.getJsBase() : "null"), period, fastPeriod, slowPeriod, ((seriesType2 != null) ? seriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s);", ((mapping1 != null) ? mapping1.getJsBase() : "null"), period, fastPeriod, slowPeriod, ((seriesType2 != null) ? seriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        AMA item = new AMA("setAma" + variableIndex);
        setAma.add(item);
        return item;
    }
    private String generateJSsetAma() {
        if (!setAma.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AMA item : setAma) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AMA> setAma1 = new ArrayList<>();

    /**
     * Creates AMA (Adaptive Moving Average) indicator on the plot.
     */
    public AMA ama(TableMapping mapping1, Number period, Number fastPeriod, Number slowPeriod, String seriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            
            this.seriesType3 = seriesType3;
        } else {
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.seriesType3 = seriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping1.generateJs());
            js.append(String.format(Locale.US, "var setAma1" + ++variableIndex + " = " + jsBase + ".ama(%s, %s, %s, %s, %s);", ((mapping1 != null) ? mapping1.getJsBase() : "null"), period, fastPeriod, slowPeriod, wrapQuotes(seriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s);", ((mapping1 != null) ? mapping1.getJsBase() : "null"), period, fastPeriod, slowPeriod, wrapQuotes(seriesType3)));
                js.setLength(0);
            }
        }
        AMA item = new AMA("setAma1" + variableIndex);
        setAma1.add(item);
        return item;
    }
    private String generateJSsetAma1() {
        if (!setAma1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AMA item : setAma1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PlotController getAnnotations;

    /**
     * Getter for the plot annotations.
     */
    public PlotController getAnnotations() {
        if (getAnnotations == null)
            getAnnotations = new PlotController(jsBase + ".annotations()");

        return getAnnotations;
    }

    private String[] annotationsList;

    /**
     * Setter for the plot annotations.
     */
    public Plot setAnnotations(String[] annotationsList) {
        if (jsBase == null) {
            this.annotationsList = annotationsList;
        } else {
            this.annotationsList = annotationsList;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".annotations(%s)", arrayToStringWrapQuotes(annotationsList)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".annotations(%s);", arrayToStringWrapQuotes(annotationsList)));
                js.setLength(0);
            }
        }
        return this;
    }


    private List<StockSeriesArea> setArea = new ArrayList<>();

    /**
     * Creates and returns a new Area series.
     */
    public StockSeriesArea area(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesArea item = new StockSeriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }

    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping2;
    private Number period1;
    private StockSeriesType upSeriesType;
    private String upSeriesType1;
    private StockSeriesType downSeriesType;
    private String downSeriesType1;
    private List<Aroon> setAroon = new ArrayList<>();

    /**
     * Creates Aroon indicator on the plot.
     */
    public Aroon aroon(TableMapping mapping2, Number period1, StockSeriesType upSeriesType, StockSeriesType downSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType = upSeriesType;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType = downSeriesType;
        } else {
            this.mapping2 = mapping2;
            this.period1 = period1;
            this.upSeriesType = upSeriesType;
            this.downSeriesType = downSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping2.generateJs());
            js.append(String.format(Locale.US, "var setAroon" + ++variableIndex + " = " + jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), ((downSeriesType != null) ? downSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), ((downSeriesType != null) ? downSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Aroon item = new Aroon("setAroon" + variableIndex);
        setAroon.add(item);
        return item;
    }
    private String generateJSsetAroon() {
        if (!setAroon.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Aroon item : setAroon) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Aroon> setAroon1 = new ArrayList<>();

    /**
     * Creates Aroon indicator on the plot.
     */
    public Aroon aroon(TableMapping mapping2, Number period1, StockSeriesType upSeriesType, String downSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType = upSeriesType;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType1 = downSeriesType1;
        } else {
            this.mapping2 = mapping2;
            this.period1 = period1;
            this.upSeriesType = upSeriesType;
            this.downSeriesType1 = downSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping2.generateJs());
            js.append(String.format(Locale.US, "var setAroon1" + ++variableIndex + " = " + jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), wrapQuotes(downSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), wrapQuotes(downSeriesType1)));
                js.setLength(0);
            }
        }
        Aroon item = new Aroon("setAroon1" + variableIndex);
        setAroon1.add(item);
        return item;
    }
    private String generateJSsetAroon1() {
        if (!setAroon1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Aroon item : setAroon1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Aroon> setAroon2 = new ArrayList<>();

    /**
     * Creates Aroon indicator on the plot.
     */
    public Aroon aroon(TableMapping mapping2, Number period1, String upSeriesType1, StockSeriesType downSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType = downSeriesType;
        } else {
            this.mapping2 = mapping2;
            this.period1 = period1;
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = downSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping2.generateJs());
            js.append(String.format(Locale.US, "var setAroon2" + ++variableIndex + " = " + jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, wrapQuotes(upSeriesType1), ((downSeriesType != null) ? downSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, wrapQuotes(upSeriesType1), ((downSeriesType != null) ? downSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Aroon item = new Aroon("setAroon2" + variableIndex);
        setAroon2.add(item);
        return item;
    }
    private String generateJSsetAroon2() {
        if (!setAroon2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Aroon item : setAroon2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Aroon> setAroon3 = new ArrayList<>();

    /**
     * Creates Aroon indicator on the plot.
     */
    public Aroon aroon(TableMapping mapping2, Number period1, String upSeriesType1, String downSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType1 = downSeriesType1;
        } else {
            this.mapping2 = mapping2;
            this.period1 = period1;
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType1 = downSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping2.generateJs());
            js.append(String.format(Locale.US, "var setAroon3" + ++variableIndex + " = " + jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, wrapQuotes(upSeriesType1), wrapQuotes(downSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s);", ((mapping2 != null) ? mapping2.getJsBase() : "null"), period1, wrapQuotes(upSeriesType1), wrapQuotes(downSeriesType1)));
                js.setLength(0);
            }
        }
        Aroon item = new Aroon("setAroon3" + variableIndex);
        setAroon3.add(item);
        return item;
    }
    private String generateJSsetAroon3() {
        if (!setAroon3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Aroon item : setAroon3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping3;
    private Number period2;
    private StockSeriesType seriesType4;
    private String seriesType5;
    private List<ATR> setAtr = new ArrayList<>();

    /**
     * Creates an Average True Range indicator on the plot.
     */
    public ATR atr(TableMapping mapping3, Number period2, StockSeriesType seriesType4) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            
            this.mapping3 = mapping3;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            
            this.period2 = period2;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            
            this.seriesType4 = seriesType4;
        } else {
            this.mapping3 = mapping3;
            this.period2 = period2;
            this.seriesType4 = seriesType4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping3.generateJs());
            js.append(String.format(Locale.US, "var setAtr" + ++variableIndex + " = " + jsBase + ".atr(%s, %s, %s);", ((mapping3 != null) ? mapping3.getJsBase() : "null"), period2, ((seriesType4 != null) ? seriesType4.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %s);", ((mapping3 != null) ? mapping3.getJsBase() : "null"), period2, ((seriesType4 != null) ? seriesType4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ATR item = new ATR("setAtr" + variableIndex);
        setAtr.add(item);
        return item;
    }
    private String generateJSsetAtr() {
        if (!setAtr.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ATR item : setAtr) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ATR> setAtr1 = new ArrayList<>();

    /**
     * Creates an Average True Range indicator on the plot.
     */
    public ATR atr(TableMapping mapping3, Number period2, String seriesType5) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            
            this.mapping3 = mapping3;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            
            this.period2 = period2;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            
            this.seriesType5 = seriesType5;
        } else {
            this.mapping3 = mapping3;
            this.period2 = period2;
            this.seriesType5 = seriesType5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping3.generateJs());
            js.append(String.format(Locale.US, "var setAtr1" + ++variableIndex + " = " + jsBase + ".atr(%s, %s, %s);", ((mapping3 != null) ? mapping3.getJsBase() : "null"), period2, wrapQuotes(seriesType5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %s);", ((mapping3 != null) ? mapping3.getJsBase() : "null"), period2, wrapQuotes(seriesType5)));
                js.setLength(0);
            }
        }
        ATR item = new ATR("setAtr1" + variableIndex);
        setAtr1.add(item);
        return item;
    }
    private String generateJSsetAtr1() {
        if (!setAtr1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ATR item : setAtr1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for the current plot background.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    /**
     * Setter for the plot background.
     */
    public Plot setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot background.
     */
    public Plot setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background2));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mapping4;
    private Number period3;
    private Number deviation;
    private StockSeriesType upperSeriesType;
    private String upperSeriesType1;
    private StockSeriesType lowerSeriesType;
    private String lowerSeriesType1;
    private StockSeriesType middleSeriesType;
    private String middleSeriesType1;
    private List<BBands> setBbands = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = middleSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands" + variableIndex);
        setBbands.add(item);
        return item;
    }
    private String generateJSsetBbands() {
        if (!setBbands.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands1 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, String middleSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType1 = middleSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands1" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1)));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands1" + variableIndex);
        setBbands1.add(item);
        return item;
    }
    private String generateJSsetBbands1() {
        if (!setBbands1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands2 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, StockSeriesType upperSeriesType, String lowerSeriesType1, StockSeriesType middleSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = middleSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands2" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands2" + variableIndex);
        setBbands2.add(item);
        return item;
    }
    private String generateJSsetBbands2() {
        if (!setBbands2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands3 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, StockSeriesType upperSeriesType, String lowerSeriesType1, String middleSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType1 = middleSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands3" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1)));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands3" + variableIndex);
        setBbands3.add(item);
        return item;
    }
    private String generateJSsetBbands3() {
        if (!setBbands3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands4 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, String upperSeriesType1, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = middleSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands4" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands4" + variableIndex);
        setBbands4.add(item);
        return item;
    }
    private String generateJSsetBbands4() {
        if (!setBbands4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands5 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, String upperSeriesType1, StockSeriesType lowerSeriesType, String middleSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType1 = middleSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands5" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1)));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands5" + variableIndex);
        setBbands5.add(item);
        return item;
    }
    private String generateJSsetBbands5() {
        if (!setBbands5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands6 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, String upperSeriesType1, String lowerSeriesType1, StockSeriesType middleSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = middleSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands6" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands6" + variableIndex);
        setBbands6.add(item);
        return item;
    }
    private String generateJSsetBbands6() {
        if (!setBbands6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBands> setBbands7 = new ArrayList<>();

    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public BBands bbands(TableMapping mapping4, Number period3, Number deviation, String upperSeriesType1, String lowerSeriesType1, String middleSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            
            this.mapping4 = mapping4;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
        } else {
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType1 = middleSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping4.generateJs());
            js.append(String.format(Locale.US, "var setBbands7" + ++variableIndex + " = " + jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s);", ((mapping4 != null) ? mapping4.getJsBase() : "null"), period3, deviation, wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1)));
                js.setLength(0);
            }
        }
        BBands item = new BBands("setBbands7" + variableIndex);
        setBbands7.add(item);
        return item;
    }
    private String generateJSsetBbands7() {
        if (!setBbands7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBands item : setBbands7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping5;
    private Number period4;
    private Number deviation1;
    private StockSeriesType seriesType6;
    private String seriesType7;
    private List<BBandsB> setBbandsB = new ArrayList<>();

    /**
     * Creates %B indicator on the plot.
     */
    public BBandsB bbandsB(TableMapping mapping5, Number period4, Number deviation1, StockSeriesType seriesType6) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            
            this.mapping5 = mapping5;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            
            this.period4 = period4;
            this.deviation = null;
            this.deviation1 = null;
            
            this.deviation1 = deviation1;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            
            this.seriesType6 = seriesType6;
        } else {
            this.mapping5 = mapping5;
            this.period4 = period4;
            this.deviation1 = deviation1;
            this.seriesType6 = seriesType6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping5.generateJs());
            js.append(String.format(Locale.US, "var setBbandsB" + ++variableIndex + " = " + jsBase + ".bbandsB(%s, %s, %s, %s);", ((mapping5 != null) ? mapping5.getJsBase() : "null"), period4, deviation1, ((seriesType6 != null) ? seriesType6.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s);", ((mapping5 != null) ? mapping5.getJsBase() : "null"), period4, deviation1, ((seriesType6 != null) ? seriesType6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBandsB item = new BBandsB("setBbandsB" + variableIndex);
        setBbandsB.add(item);
        return item;
    }
    private String generateJSsetBbandsB() {
        if (!setBbandsB.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : setBbandsB) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBandsB> setBbandsB1 = new ArrayList<>();

    /**
     * Creates %B indicator on the plot.
     */
    public BBandsB bbandsB(TableMapping mapping5, Number period4, Number deviation1, String seriesType7) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            
            this.mapping5 = mapping5;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            
            this.period4 = period4;
            this.deviation = null;
            this.deviation1 = null;
            
            this.deviation1 = deviation1;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            
            this.seriesType7 = seriesType7;
        } else {
            this.mapping5 = mapping5;
            this.period4 = period4;
            this.deviation1 = deviation1;
            this.seriesType7 = seriesType7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping5.generateJs());
            js.append(String.format(Locale.US, "var setBbandsB1" + ++variableIndex + " = " + jsBase + ".bbandsB(%s, %s, %s, %s);", ((mapping5 != null) ? mapping5.getJsBase() : "null"), period4, deviation1, wrapQuotes(seriesType7)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s);", ((mapping5 != null) ? mapping5.getJsBase() : "null"), period4, deviation1, wrapQuotes(seriesType7)));
                js.setLength(0);
            }
        }
        BBandsB item = new BBandsB("setBbandsB1" + variableIndex);
        setBbandsB1.add(item);
        return item;
    }
    private String generateJSsetBbandsB1() {
        if (!setBbandsB1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsB item : setBbandsB1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping6;
    private Number period5;
    private Number deviation2;
    private StockSeriesType seriesType8;
    private String seriesType9;
    private List<BBandsWidth> setBbandsWidth = new ArrayList<>();

    /**
     * Creates Bollinger Bands Width indicator on the plot.
     */
    public BBandsWidth bbandsWidth(TableMapping mapping6, Number period5, Number deviation2, StockSeriesType seriesType8) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            
            this.mapping6 = mapping6;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            
            this.period5 = period5;
            this.deviation = null;
            this.deviation1 = null;
            this.deviation2 = null;
            
            this.deviation2 = deviation2;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            
            this.seriesType8 = seriesType8;
        } else {
            this.mapping6 = mapping6;
            this.period5 = period5;
            this.deviation2 = deviation2;
            this.seriesType8 = seriesType8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping6.generateJs());
            js.append(String.format(Locale.US, "var setBbandsWidth" + ++variableIndex + " = " + jsBase + ".bbandsWidth(%s, %s, %s, %s);", ((mapping6 != null) ? mapping6.getJsBase() : "null"), period5, deviation2, ((seriesType8 != null) ? seriesType8.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s);", ((mapping6 != null) ? mapping6.getJsBase() : "null"), period5, deviation2, ((seriesType8 != null) ? seriesType8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        BBandsWidth item = new BBandsWidth("setBbandsWidth" + variableIndex);
        setBbandsWidth.add(item);
        return item;
    }
    private String generateJSsetBbandsWidth() {
        if (!setBbandsWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsWidth item : setBbandsWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<BBandsWidth> setBbandsWidth1 = new ArrayList<>();

    /**
     * Creates Bollinger Bands Width indicator on the plot.
     */
    public BBandsWidth bbandsWidth(TableMapping mapping6, Number period5, Number deviation2, String seriesType9) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            
            this.mapping6 = mapping6;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            
            this.period5 = period5;
            this.deviation = null;
            this.deviation1 = null;
            this.deviation2 = null;
            
            this.deviation2 = deviation2;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            
            this.seriesType9 = seriesType9;
        } else {
            this.mapping6 = mapping6;
            this.period5 = period5;
            this.deviation2 = deviation2;
            this.seriesType9 = seriesType9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping6.generateJs());
            js.append(String.format(Locale.US, "var setBbandsWidth1" + ++variableIndex + " = " + jsBase + ".bbandsWidth(%s, %s, %s, %s);", ((mapping6 != null) ? mapping6.getJsBase() : "null"), period5, deviation2, wrapQuotes(seriesType9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s);", ((mapping6 != null) ? mapping6.getJsBase() : "null"), period5, deviation2, wrapQuotes(seriesType9)));
                js.setLength(0);
            }
        }
        BBandsWidth item = new BBandsWidth("setBbandsWidth1" + variableIndex);
        setBbandsWidth1.add(item);
        return item;
    }
    private String generateJSsetBbandsWidth1() {
        if (!setBbandsWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (BBandsWidth item : setBbandsWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesCandlestick> setCandlestick = new ArrayList<>();

    /**
     * Creates and returns a new Candlestick series.
     */
    public StockSeriesCandlestick candlestick(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setCandlestick" + ++variableIndex + " = " + jsBase + ".candlestick(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesCandlestick item = new StockSeriesCandlestick("setCandlestick" + variableIndex);
        setCandlestick.add(item);
        return item;
    }

    private String generateJSsetCandlestick() {
        if (!setCandlestick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesCandlestick item : setCandlestick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping7;
    private Number period6;
    private StockSeriesType seriesType10;
    private String seriesType11;
    private List<CCI> setCci = new ArrayList<>();

    /**
     * Creates a Commodity Channel Index indicator on the chart.
     */
    public CCI cci(TableMapping mapping7, Number period6, StockSeriesType seriesType10) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            
            this.mapping7 = mapping7;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            
            this.period6 = period6;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            
            this.seriesType10 = seriesType10;
        } else {
            this.mapping7 = mapping7;
            this.period6 = period6;
            this.seriesType10 = seriesType10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping7.generateJs());
            js.append(String.format(Locale.US, "var setCci" + ++variableIndex + " = " + jsBase + ".cci(%s, %s, %s);", ((mapping7 != null) ? mapping7.getJsBase() : "null"), period6, ((seriesType10 != null) ? seriesType10.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %s);", ((mapping7 != null) ? mapping7.getJsBase() : "null"), period6, ((seriesType10 != null) ? seriesType10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CCI item = new CCI("setCci" + variableIndex);
        setCci.add(item);
        return item;
    }
    private String generateJSsetCci() {
        if (!setCci.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CCI item : setCci) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CCI> setCci1 = new ArrayList<>();

    /**
     * Creates a Commodity Channel Index indicator on the chart.
     */
    public CCI cci(TableMapping mapping7, Number period6, String seriesType11) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            
            this.mapping7 = mapping7;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            
            this.period6 = period6;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            
            this.seriesType11 = seriesType11;
        } else {
            this.mapping7 = mapping7;
            this.period6 = period6;
            this.seriesType11 = seriesType11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping7.generateJs());
            js.append(String.format(Locale.US, "var setCci1" + ++variableIndex + " = " + jsBase + ".cci(%s, %s, %s);", ((mapping7 != null) ? mapping7.getJsBase() : "null"), period6, wrapQuotes(seriesType11)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %s);", ((mapping7 != null) ? mapping7.getJsBase() : "null"), period6, wrapQuotes(seriesType11)));
                js.setLength(0);
            }
        }
        CCI item = new CCI("setCci1" + variableIndex);
        setCci1.add(item);
        return item;
    }
    private String generateJSsetCci1() {
        if (!setCci1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CCI item : setCci1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping8;
    private Number fastPeriod1;
    private Number slowPeriod1;
    private MovingAverageType maType;
    private String maType1;
    private StockSeriesType seriesType12;
    private String seriesType13;
    private List<CHO> setCho = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, MovingAverageType maType, StockSeriesType seriesType12) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            
            this.mapping8 = mapping8;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            
            this.slowPeriod1 = slowPeriod1;
            this.maType = null;
            this.maType1 = null;
            
            this.maType = maType;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            
            this.seriesType12 = seriesType12;
        } else {
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType = maType;
            this.seriesType12 = seriesType12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping8.generateJs());
            js.append(String.format(Locale.US, "var setCho" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, ((maType != null) ? maType.generateJs() : "null"), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, ((maType != null) ? maType.generateJs() : "null"), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CHO item = new CHO("setCho" + variableIndex);
        setCho.add(item);
        return item;
    }
    private String generateJSsetCho() {
        if (!setCho.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setCho) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CHO> setCho1 = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, MovingAverageType maType, String seriesType13) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            
            this.mapping8 = mapping8;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            
            this.slowPeriod1 = slowPeriod1;
            this.maType = null;
            this.maType1 = null;
            
            this.maType = maType;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            
            this.seriesType13 = seriesType13;
        } else {
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType = maType;
            this.seriesType13 = seriesType13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping8.generateJs());
            js.append(String.format(Locale.US, "var setCho1" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, ((maType != null) ? maType.generateJs() : "null"), wrapQuotes(seriesType13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, ((maType != null) ? maType.generateJs() : "null"), wrapQuotes(seriesType13)));
                js.setLength(0);
            }
        }
        CHO item = new CHO("setCho1" + variableIndex);
        setCho1.add(item);
        return item;
    }
    private String generateJSsetCho1() {
        if (!setCho1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setCho1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CHO> setCho2 = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, String maType1, StockSeriesType seriesType12) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            
            this.mapping8 = mapping8;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            
            this.slowPeriod1 = slowPeriod1;
            this.maType = null;
            this.maType1 = null;
            
            this.maType1 = maType1;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            
            this.seriesType12 = seriesType12;
        } else {
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType1 = maType1;
            this.seriesType12 = seriesType12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping8.generateJs());
            js.append(String.format(Locale.US, "var setCho2" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType1), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType1), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CHO item = new CHO("setCho2" + variableIndex);
        setCho2.add(item);
        return item;
    }
    private String generateJSsetCho2() {
        if (!setCho2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setCho2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CHO> setCho3 = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, String maType1, String seriesType13) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            
            this.mapping8 = mapping8;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            
            this.slowPeriod1 = slowPeriod1;
            this.maType = null;
            this.maType1 = null;
            
            this.maType1 = maType1;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            
            this.seriesType13 = seriesType13;
        } else {
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType1 = maType1;
            this.seriesType13 = seriesType13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping8.generateJs());
            js.append(String.format(Locale.US, "var setCho3" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType1), wrapQuotes(seriesType13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType1), wrapQuotes(seriesType13)));
                js.setLength(0);
            }
        }
        CHO item = new CHO("setCho3" + variableIndex);
        setCho3.add(item);
        return item;
    }
    private String generateJSsetCho3() {
        if (!setCho3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setCho3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping9;
    private Number period7;
    private StockSeriesType seriesType14;
    private String seriesType15;
    private List<CMF> setCmf = new ArrayList<>();

    /**
     * Creates a Chaikin Money Flow indicator on the chart.
     */
    public CMF cmf(TableMapping mapping9, Number period7, StockSeriesType seriesType14) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            
            this.mapping9 = mapping9;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            
            this.period7 = period7;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            
            this.seriesType14 = seriesType14;
        } else {
            this.mapping9 = mapping9;
            this.period7 = period7;
            this.seriesType14 = seriesType14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping9.generateJs());
            js.append(String.format(Locale.US, "var setCmf" + ++variableIndex + " = " + jsBase + ".cmf(%s, %s, %s);", ((mapping9 != null) ? mapping9.getJsBase() : "null"), period7, ((seriesType14 != null) ? seriesType14.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s);", ((mapping9 != null) ? mapping9.getJsBase() : "null"), period7, ((seriesType14 != null) ? seriesType14.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CMF item = new CMF("setCmf" + variableIndex);
        setCmf.add(item);
        return item;
    }
    private String generateJSsetCmf() {
        if (!setCmf.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CMF item : setCmf) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CMF> setCmf1 = new ArrayList<>();

    /**
     * Creates a Chaikin Money Flow indicator on the chart.
     */
    public CMF cmf(TableMapping mapping9, Number period7, String seriesType15) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            
            this.mapping9 = mapping9;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            
            this.period7 = period7;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            
            this.seriesType15 = seriesType15;
        } else {
            this.mapping9 = mapping9;
            this.period7 = period7;
            this.seriesType15 = seriesType15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping9.generateJs());
            js.append(String.format(Locale.US, "var setCmf1" + ++variableIndex + " = " + jsBase + ".cmf(%s, %s, %s);", ((mapping9 != null) ? mapping9.getJsBase() : "null"), period7, wrapQuotes(seriesType15)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s);", ((mapping9 != null) ? mapping9.getJsBase() : "null"), period7, wrapQuotes(seriesType15)));
                js.setLength(0);
            }
        }
        CMF item = new CMF("setCmf1" + variableIndex);
        setCmf1.add(item);
        return item;
    }
    private String generateJSsetCmf1() {
        if (!setCmf1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CMF item : setCmf1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesColumn> setColumn = new ArrayList<>();

    /**
     * Creates and returns a new Column series.
     */
    public StockSeriesColumn column(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesColumn item = new StockSeriesColumn("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }

    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesColumn item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Crosshair getCrosshair;

    /**
     * Getter for crosshair settings.
     */
    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }

    private String crosshair;
    private Boolean crosshair1;

    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public Plot setCrosshair(String crosshair) {
        if (jsBase == null) {
            this.crosshair = null;
            this.crosshair1 = null;
            
            this.crosshair = crosshair;
        } else {
            this.crosshair = crosshair;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".crosshair(%s);", wrapQuotes(crosshair)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public Plot setCrosshair(Boolean crosshair1) {
        if (jsBase == null) {
            this.crosshair = null;
            this.crosshair1 = null;
            
            this.crosshair1 = crosshair1;
        } else {
            this.crosshair1 = crosshair1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".crosshair(%b);", crosshair1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the stock plot defaultSeriesType.
     */
    public Plot setDefaultSeriesType(StockSeriesType defaultSeriesType) {
        if (jsBase == null) {
            this.defaultSeriesType = null;
            this.defaultSeriesType1 = null;
            
            this.defaultSeriesType = defaultSeriesType;
        } else {
            this.defaultSeriesType = defaultSeriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultSeriesType(%s)", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the stock plot defaultSeriesType.
     */
    public Plot setDefaultSeriesType(String defaultSeriesType1) {
        if (jsBase == null) {
            this.defaultSeriesType = null;
            this.defaultSeriesType1 = null;
            
            this.defaultSeriesType1 = defaultSeriesType1;
        } else {
            this.defaultSeriesType1 = defaultSeriesType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", wrapQuotes(defaultSeriesType1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mapping10;
    private Number period8;
    private Number adxPeriod;
    private Boolean useWildersSmoothing;
    private StockSeriesType pdiSeriesType;
    private String pdiSeriesType1;
    private StockSeriesType ndiSeriesType;
    private String ndiSeriesType1;
    private StockSeriesType adxSeriesType;
    private String adxSeriesType1;
    private List<DMI> setDmi = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, StockSeriesType pdiSeriesType, StockSeriesType ndiSeriesType, StockSeriesType adxSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = adxSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi" + variableIndex);
        setDmi.add(item);
        return item;
    }
    private String generateJSsetDmi() {
        if (!setDmi.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi1 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, StockSeriesType pdiSeriesType, StockSeriesType ndiSeriesType, String adxSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType1 = adxSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi1" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1)));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi1" + variableIndex);
        setDmi1.add(item);
        return item;
    }
    private String generateJSsetDmi1() {
        if (!setDmi1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi2 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, StockSeriesType pdiSeriesType, String ndiSeriesType1, StockSeriesType adxSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = adxSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi2" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi2" + variableIndex);
        setDmi2.add(item);
        return item;
    }
    private String generateJSsetDmi2() {
        if (!setDmi2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi3 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, StockSeriesType pdiSeriesType, String ndiSeriesType1, String adxSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType1 = adxSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi3" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1)));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi3" + variableIndex);
        setDmi3.add(item);
        return item;
    }
    private String generateJSsetDmi3() {
        if (!setDmi3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi4 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType1, StockSeriesType ndiSeriesType, StockSeriesType adxSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = adxSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi4" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi4" + variableIndex);
        setDmi4.add(item);
        return item;
    }
    private String generateJSsetDmi4() {
        if (!setDmi4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi5 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType1, StockSeriesType ndiSeriesType, String adxSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType1 = adxSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi5" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1)));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi5" + variableIndex);
        setDmi5.add(item);
        return item;
    }
    private String generateJSsetDmi5() {
        if (!setDmi5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi6 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType1, String ndiSeriesType1, StockSeriesType adxSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = adxSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi6" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi6" + variableIndex);
        setDmi6.add(item);
        return item;
    }
    private String generateJSsetDmi6() {
        if (!setDmi6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DMI> setDmi7 = new ArrayList<>();

    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public DMI dmi(TableMapping mapping10, Number period8, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType1, String ndiSeriesType1, String adxSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            
            this.mapping10 = mapping10;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
        } else {
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType1 = adxSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping10.generateJs());
            js.append(String.format(Locale.US, "var setDmi7" + ++variableIndex + " = " + jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %b, %s, %s, %s);", ((mapping10 != null) ? mapping10.getJsBase() : "null"), period8, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1)));
                js.setLength(0);
            }
        }
        DMI item = new DMI("setDmi7" + variableIndex);
        setDmi7.add(item);
        return item;
    }
    private String generateJSsetDmi7() {
        if (!setDmi7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DMI item : setDmi7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping11;
    private Number period9;
    private StockSeriesType seriesType16;
    private String seriesType17;
    private List<EMA> setEma = new ArrayList<>();

    /**
     * Creates EMA (Exponential Moving Average) indicator on the plot.
     */
    public EMA ema(TableMapping mapping11, Number period9, StockSeriesType seriesType16) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            
            this.mapping11 = mapping11;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            
            this.period9 = period9;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            
            this.seriesType16 = seriesType16;
        } else {
            this.mapping11 = mapping11;
            this.period9 = period9;
            this.seriesType16 = seriesType16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping11.generateJs());
            js.append(String.format(Locale.US, "var setEma" + ++variableIndex + " = " + jsBase + ".ema(%s, %s, %s);", ((mapping11 != null) ? mapping11.getJsBase() : "null"), period9, ((seriesType16 != null) ? seriesType16.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %s);", ((mapping11 != null) ? mapping11.getJsBase() : "null"), period9, ((seriesType16 != null) ? seriesType16.generateJs() : "null")));
                js.setLength(0);
            }
        }
        EMA item = new EMA("setEma" + variableIndex);
        setEma.add(item);
        return item;
    }
    private String generateJSsetEma() {
        if (!setEma.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (EMA item : setEma) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<EMA> setEma1 = new ArrayList<>();

    /**
     * Creates EMA (Exponential Moving Average) indicator on the plot.
     */
    public EMA ema(TableMapping mapping11, Number period9, String seriesType17) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            
            this.mapping11 = mapping11;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            
            this.period9 = period9;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            
            this.seriesType17 = seriesType17;
        } else {
            this.mapping11 = mapping11;
            this.period9 = period9;
            this.seriesType17 = seriesType17;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping11.generateJs());
            js.append(String.format(Locale.US, "var setEma1" + ++variableIndex + " = " + jsBase + ".ema(%s, %s, %s);", ((mapping11 != null) ? mapping11.getJsBase() : "null"), period9, wrapQuotes(seriesType17)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %s);", ((mapping11 != null) ? mapping11.getJsBase() : "null"), period9, wrapQuotes(seriesType17)));
                js.setLength(0);
            }
        }
        EMA item = new EMA("setEma1" + variableIndex);
        setEma1.add(item);
        return item;
    }
    private String generateJSsetEma1() {
        if (!setEma1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (EMA item : setEma1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Controller getEventMarkers;

    /**
     * Getter for the event markers controller.
     */
    public Controller getEventMarkers() {
        if (getEventMarkers == null)
            getEventMarkers = new Controller(jsBase + ".eventMarkers()");

        return getEventMarkers;
    }

    private String eventMarkers;
    private Boolean eventMarkers1;

    /**
     * Setter for the event markers controller.
     */
    public Plot setEventMarkers(String eventMarkers) {
        if (jsBase == null) {
            this.eventMarkers = null;
            this.eventMarkers1 = null;
            
            this.eventMarkers = eventMarkers;
        } else {
            this.eventMarkers = eventMarkers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".eventMarkers(%s)", wrapQuotes(eventMarkers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".eventMarkers(%s);", wrapQuotes(eventMarkers)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the event markers controller.
     */
    public Plot setEventMarkers(Boolean eventMarkers1) {
        if (jsBase == null) {
            this.eventMarkers = null;
            this.eventMarkers1 = null;
            
            this.eventMarkers1 = eventMarkers1;
        } else {
            this.eventMarkers1 = eventMarkers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".eventMarkers(%b)", eventMarkers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".eventMarkers(%b);", eventMarkers1));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<StockSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public StockSeriesBase getGetSeries(Number id) {
        StockSeriesBase item = new StockSeriesBase(jsBase + ".getSeries(" + id + ")");
        getGetSeries.add(item);
        return item;
    }

    private List<StockSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public StockSeriesBase getGetSeries(String id) {
        StockSeriesBase item = new StockSeriesBase(jsBase + ".getSeries(" + wrapQuotes(id) + ")");
        getGetSeries1.add(item);
        return item;
    }

    private List<StockSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Gets series by its index.
     */
    public StockSeriesBase getGetSeriesAt(Number index) {
        StockSeriesBase item = new StockSeriesBase(jsBase + ".getSeriesAt(" + index + ")");
        getGetSeriesAt.add(item);
        return item;
    }

    private HatchFills getHatchFillPalette;

    /**
     * Getter for the current hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;
    private List<HatchFills> setHatchFillPalette = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public HatchFills setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette = hatchFillPalette;
        } else {
            this.hatchFillPalette = hatchFillPalette;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFillPalette" + ++variableIndex + " = " + jsBase + ".hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
                js.setLength(0);
            }
        }
        HatchFills item = new HatchFills("setHatchFillPalette" + variableIndex);
        setHatchFillPalette.add(item);
        return item;
    }
    private String generateJSsetHatchFillPalette() {
        if (!setHatchFillPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setHatchFillPalette1 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public HatchFills setHatchFillPalette(String hatchFillPalette1) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette1 = hatchFillPalette1;
        } else {
            this.hatchFillPalette1 = hatchFillPalette1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFillPalette1" + ++variableIndex + " = " + jsBase + ".hatchFillPalette(%s);", wrapQuotes(hatchFillPalette1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", wrapQuotes(hatchFillPalette1)));
                js.setLength(0);
            }
        }
        HatchFills item = new HatchFills("setHatchFillPalette1" + variableIndex);
        setHatchFillPalette1.add(item);
        return item;
    }
    private String generateJSsetHatchFillPalette1() {
        if (!setHatchFillPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setHatchFillPalette2 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public HatchFills setHatchFillPalette(HatchFills hatchFillPalette2) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette2 = hatchFillPalette2;
        } else {
            this.hatchFillPalette2 = hatchFillPalette2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(hatchFillPalette2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        HatchFills item = new HatchFills("setHatchFillPalette2" + variableIndex);
        setHatchFillPalette2.add(item);
        return item;
    }
    private String generateJSsetHatchFillPalette2() {
        if (!setHatchFillPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesHilo> setHilo = new ArrayList<>();

    /**
     * Creates and returns a new HiLo series.
     */
    public StockSeriesHilo hilo(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesHilo item = new StockSeriesHilo("setHilo" + variableIndex);
        setHilo.add(item);
        return item;
    }

    private String generateJSsetHilo() {
        if (!setHilo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesHilo item : setHilo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesJumpLine> setJumpLine = new ArrayList<>();

    /**
     * Creates and returns a new Jump Line series.
     */
    public StockSeriesJumpLine jumpLine(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setJumpLine" + ++variableIndex + " = " + jsBase + ".jumpLine(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesJumpLine item = new StockSeriesJumpLine("setJumpLine" + variableIndex);
        setJumpLine.add(item);
        return item;
    }

    private String generateJSsetJumpLine() {
        if (!setJumpLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesJumpLine item : setJumpLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping12;
    private Number kPeriod;
    private Number kMAPeriod;
    private Number dPeriod;
    private MovingAverageType kMAType;
    private String kMAType1;
    private MovingAverageType dMAType;
    private String dMAType1;
    private Number kMultiplier;
    private Number dMultiplier;
    private StockSeriesType kSeriesType;
    private String kSeriesType1;
    private StockSeriesType dSeriesType;
    private String dSeriesType1;
    private StockSeriesType jSeriesType;
    private String jSeriesType1;
    private List<KDJ> setKdj = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj" + variableIndex);
        setKdj.add(item);
        return item;
    }
    private String generateJSsetKdj() {
        if (!setKdj.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj1 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj1" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj1" + variableIndex);
        setKdj1.add(item);
        return item;
    }
    private String generateJSsetKdj1() {
        if (!setKdj1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj2 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj2" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj2" + variableIndex);
        setKdj2.add(item);
        return item;
    }
    private String generateJSsetKdj2() {
        if (!setKdj2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj3 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj3" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj3" + variableIndex);
        setKdj3.add(item);
        return item;
    }
    private String generateJSsetKdj3() {
        if (!setKdj3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj4 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj4" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj4" + variableIndex);
        setKdj4.add(item);
        return item;
    }
    private String generateJSsetKdj4() {
        if (!setKdj4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj5 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj5" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj5" + variableIndex);
        setKdj5.add(item);
        return item;
    }
    private String generateJSsetKdj5() {
        if (!setKdj5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj6 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj6" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj6" + variableIndex);
        setKdj6.add(item);
        return item;
    }
    private String generateJSsetKdj6() {
        if (!setKdj6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj7 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj7" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj7" + variableIndex);
        setKdj7.add(item);
        return item;
    }
    private String generateJSsetKdj7() {
        if (!setKdj7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj8 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj8" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj8" + variableIndex);
        setKdj8.add(item);
        return item;
    }
    private String generateJSsetKdj8() {
        if (!setKdj8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj9 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj9" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj9" + variableIndex);
        setKdj9.add(item);
        return item;
    }
    private String generateJSsetKdj9() {
        if (!setKdj9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj10 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj10" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj10" + variableIndex);
        setKdj10.add(item);
        return item;
    }
    private String generateJSsetKdj10() {
        if (!setKdj10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj11 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj11" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj11" + variableIndex);
        setKdj11.add(item);
        return item;
    }
    private String generateJSsetKdj11() {
        if (!setKdj11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj12 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj12" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj12" + variableIndex);
        setKdj12.add(item);
        return item;
    }
    private String generateJSsetKdj12() {
        if (!setKdj12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj13 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj13" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj13" + variableIndex);
        setKdj13.add(item);
        return item;
    }
    private String generateJSsetKdj13() {
        if (!setKdj13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj14 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj14" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj14" + variableIndex);
        setKdj14.add(item);
        return item;
    }
    private String generateJSsetKdj14() {
        if (!setKdj14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj15 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, MovingAverageType kMAType, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = kMAType;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj15" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, ((kMAType != null) ? kMAType.generateJs() : "null"), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj15" + variableIndex);
        setKdj15.add(item);
        return item;
    }
    private String generateJSsetKdj15() {
        if (!setKdj15.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj15) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj16 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj16" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj16" + variableIndex);
        setKdj16.add(item);
        return item;
    }
    private String generateJSsetKdj16() {
        if (!setKdj16.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj16) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj17 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj17" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj17" + variableIndex);
        setKdj17.add(item);
        return item;
    }
    private String generateJSsetKdj17() {
        if (!setKdj17.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj17) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj18 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj18" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj18" + variableIndex);
        setKdj18.add(item);
        return item;
    }
    private String generateJSsetKdj18() {
        if (!setKdj18.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj18) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj19 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj19" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj19" + variableIndex);
        setKdj19.add(item);
        return item;
    }
    private String generateJSsetKdj19() {
        if (!setKdj19.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj19) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj20 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj20" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj20" + variableIndex);
        setKdj20.add(item);
        return item;
    }
    private String generateJSsetKdj20() {
        if (!setKdj20.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj20) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj21 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj21" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj21" + variableIndex);
        setKdj21.add(item);
        return item;
    }
    private String generateJSsetKdj21() {
        if (!setKdj21.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj21) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj22 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj22" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj22" + variableIndex);
        setKdj22.add(item);
        return item;
    }
    private String generateJSsetKdj22() {
        if (!setKdj22.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj22) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj23 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, MovingAverageType dMAType, Number dMultiplier, String kSeriesType1, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = dMAType;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj23" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, ((dMAType != null) ? dMAType.generateJs() : "null"), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj23" + variableIndex);
        setKdj23.add(item);
        return item;
    }
    private String generateJSsetKdj23() {
        if (!setKdj23.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj23) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj24 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj24" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj24" + variableIndex);
        setKdj24.add(item);
        return item;
    }
    private String generateJSsetKdj24() {
        if (!setKdj24.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj24) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj25 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj25" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj25" + variableIndex);
        setKdj25.add(item);
        return item;
    }
    private String generateJSsetKdj25() {
        if (!setKdj25.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj25) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj26 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj26" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj26" + variableIndex);
        setKdj26.add(item);
        return item;
    }
    private String generateJSsetKdj26() {
        if (!setKdj26.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj26) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj27 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj27" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj27" + variableIndex);
        setKdj27.add(item);
        return item;
    }
    private String generateJSsetKdj27() {
        if (!setKdj27.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj27) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj28 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj28" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj28" + variableIndex);
        setKdj28.add(item);
        return item;
    }
    private String generateJSsetKdj28() {
        if (!setKdj28.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj28) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj29 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj29" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj29" + variableIndex);
        setKdj29.add(item);
        return item;
    }
    private String generateJSsetKdj29() {
        if (!setKdj29.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj29) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj30 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj30" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj30" + variableIndex);
        setKdj30.add(item);
        return item;
    }
    private String generateJSsetKdj30() {
        if (!setKdj30.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj30) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<KDJ> setKdj31 = new ArrayList<>();

    /**
     * Creates a KDJ indicator on the plot.
     */
    public KDJ kdj(TableMapping mapping12, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType1, Number kMultiplier, String dMAType1, Number dMultiplier, String kSeriesType1, String dSeriesType1, String jSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
        } else {
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMAType1 = kMAType1;
            this.kMultiplier = kMultiplier;
            this.dMAType1 = dMAType1;
            this.dMultiplier = dMultiplier;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping12.generateJs());
            js.append(String.format(Locale.US, "var setKdj31" + ++variableIndex + " = " + jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);", ((mapping12 != null) ? mapping12.getJsBase() : "null"), kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType1), kMultiplier, wrapQuotes(dMAType1), dMultiplier, wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1)));
                js.setLength(0);
            }
        }
        KDJ item = new KDJ("setKdj31" + variableIndex);
        setKdj31.add(item);
        return item;
    }
    private String generateJSsetKdj31() {
        if (!setKdj31.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (KDJ item : setKdj31) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLegend getLegend;

    /**
     * Getter for the plot legend.
     */
    public UiLegend getLegend() {
        if (getLegend == null)
            getLegend = new UiLegend(jsBase + ".legend()");

        return getLegend;
    }

    private String legend;
    private Boolean legend1;

    /**
     * Setter for the plot legend setting.
     */
    public Plot setLegend(String legend) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend = legend;
        } else {
            this.legend = legend;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".legend(%s)", wrapQuotes(legend)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legend(%s);", wrapQuotes(legend)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot legend setting.
     */
    public Plot setLegend(Boolean legend1) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend1 = legend1;
        } else {
            this.legend1 = legend1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".legend(%b)", legend1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legend(%b);", legend1));
                js.setLength(0);
            }
        }
        return this;
    }


    private List<StockSeriesLine> setLine = new ArrayList<>();

    /**
     * Creates and returns a new Line series.
     */
    public StockSeriesLine line(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesLine item = new StockSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }

    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping13;
    private Number fastPeriod2;
    private Number slowPeriod2;
    private Number signalPeriod;
    private StockSeriesType macdSeriesType;
    private String macdSeriesType1;
    private StockSeriesType signalSeriesType;
    private String signalSeriesType1;
    private StockSeriesType histogramSeriesType;
    private String histogramSeriesType1;
    private List<MACD> setMacd = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, StockSeriesType macdSeriesType, StockSeriesType signalSeriesType, StockSeriesType histogramSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = histogramSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd" + variableIndex);
        setMacd.add(item);
        return item;
    }
    private String generateJSsetMacd() {
        if (!setMacd.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd1 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, StockSeriesType macdSeriesType, StockSeriesType signalSeriesType, String histogramSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType1 = histogramSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd1" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1)));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd1" + variableIndex);
        setMacd1.add(item);
        return item;
    }
    private String generateJSsetMacd1() {
        if (!setMacd1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd2 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, StockSeriesType macdSeriesType, String signalSeriesType1, StockSeriesType histogramSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = histogramSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd2" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd2" + variableIndex);
        setMacd2.add(item);
        return item;
    }
    private String generateJSsetMacd2() {
        if (!setMacd2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd3 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, StockSeriesType macdSeriesType, String signalSeriesType1, String histogramSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType1 = histogramSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd3" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1)));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd3" + variableIndex);
        setMacd3.add(item);
        return item;
    }
    private String generateJSsetMacd3() {
        if (!setMacd3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd4 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, String macdSeriesType1, StockSeriesType signalSeriesType, StockSeriesType histogramSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = histogramSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd4" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd4" + variableIndex);
        setMacd4.add(item);
        return item;
    }
    private String generateJSsetMacd4() {
        if (!setMacd4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd5 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, String macdSeriesType1, StockSeriesType signalSeriesType, String histogramSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType1 = histogramSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd5" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1)));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd5" + variableIndex);
        setMacd5.add(item);
        return item;
    }
    private String generateJSsetMacd5() {
        if (!setMacd5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd6 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, String macdSeriesType1, String signalSeriesType1, StockSeriesType histogramSeriesType) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = histogramSeriesType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd6" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd6" + variableIndex);
        setMacd6.add(item);
        return item;
    }
    private String generateJSsetMacd6() {
        if (!setMacd6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MACD> setMacd7 = new ArrayList<>();

    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public MACD macd(TableMapping mapping13, Number fastPeriod2, Number slowPeriod2, Number signalPeriod, String macdSeriesType1, String signalSeriesType1, String histogramSeriesType1) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            
            this.mapping13 = mapping13;
            this.fastPeriod = null;
            this.fastPeriod1 = null;
            this.fastPeriod2 = null;
            
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod = null;
            this.slowPeriod1 = null;
            this.slowPeriod2 = null;
            
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
        } else {
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType1 = histogramSeriesType1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping13.generateJs());
            js.append(String.format(Locale.US, "var setMacd7" + ++variableIndex + " = " + jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s);", ((mapping13 != null) ? mapping13.getJsBase() : "null"), fastPeriod2, slowPeriod2, signalPeriod, wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1)));
                js.setLength(0);
            }
        }
        MACD item = new MACD("setMacd7" + variableIndex);
        setMacd7.add(item);
        return item;
    }
    private String generateJSsetMacd7() {
        if (!setMacd7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MACD item : setMacd7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Creates and returns a new Marker series.
     */
    public StockSeriesMarker marker(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesMarker item = new StockSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }

    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Markers getMarkerPalette;

    /**
     * Getter for chart markers palette settings.
     */
    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers(jsBase + ".markerPalette()");

        return getMarkerPalette;
    }

    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;
    private String[] markerPalette3;

    /**
     * Setter for the chart markers palette settings.
     */
    public Plot setMarkerPalette(Markers markerPalette) {
        if (jsBase == null) {
            this.markerPalette = null;
            this.markerPalette1 = null;
            this.markerPalette2 = null;
            this.markerPalette3 = null;
            
            this.markerPalette = markerPalette;
        } else {
            this.markerPalette = markerPalette;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(markerPalette.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s);", ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart markers palette settings.
     */
    public Plot setMarkerPalette(String markerPalette1) {
        if (jsBase == null) {
            this.markerPalette = null;
            this.markerPalette1 = null;
            this.markerPalette2 = null;
            this.markerPalette3 = null;
            
            this.markerPalette1 = markerPalette1;
        } else {
            this.markerPalette1 = markerPalette1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s);", wrapQuotes(markerPalette1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart markers palette settings.
     */
    public Plot setMarkerPalette(MarkerType[] markerPalette2) {
        if (jsBase == null) {
            this.markerPalette = null;
            this.markerPalette1 = null;
            this.markerPalette2 = null;
            this.markerPalette3 = null;
            
            this.markerPalette2 = markerPalette2;
        } else {
            this.markerPalette2 = markerPalette2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s);", arrayToString(markerPalette2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the chart markers palette settings.
     */
    public Plot setMarkerPalette(String[] markerPalette3) {
        if (jsBase == null) {
            this.markerPalette = null;
            this.markerPalette1 = null;
            this.markerPalette2 = null;
            this.markerPalette3 = null;
            
            this.markerPalette3 = markerPalette3;
        } else {
            this.markerPalette3 = markerPalette3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s);", arrayToStringWrapQuotes(markerPalette3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public Plot setMaxPointWidth(Number maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum point width.
     */
    public Plot setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minPointLength;
    private String minPointLength1;

    /**
     * Setter for the minimum point length.
     */
    public Plot setMinPointLength(Number minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%s);", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minimum point length.
     */
    public Plot setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mapping14;
    private Number period10;
    private StockSeriesType seriesType18;
    private String seriesType19;
    private List<MMA> setMma = new ArrayList<>();

    /**
     * Creates MMA (Modified Moving Average) indicator on the plot.
     */
    public MMA mma(TableMapping mapping14, Number period10, StockSeriesType seriesType18) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            
            this.mapping14 = mapping14;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            
            this.period10 = period10;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            
            this.seriesType18 = seriesType18;
        } else {
            this.mapping14 = mapping14;
            this.period10 = period10;
            this.seriesType18 = seriesType18;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping14.generateJs());
            js.append(String.format(Locale.US, "var setMma" + ++variableIndex + " = " + jsBase + ".mma(%s, %s, %s);", ((mapping14 != null) ? mapping14.getJsBase() : "null"), period10, ((seriesType18 != null) ? seriesType18.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %s);", ((mapping14 != null) ? mapping14.getJsBase() : "null"), period10, ((seriesType18 != null) ? seriesType18.generateJs() : "null")));
                js.setLength(0);
            }
        }
        MMA item = new MMA("setMma" + variableIndex);
        setMma.add(item);
        return item;
    }
    private String generateJSsetMma() {
        if (!setMma.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MMA item : setMma) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MMA> setMma1 = new ArrayList<>();

    /**
     * Creates MMA (Modified Moving Average) indicator on the plot.
     */
    public MMA mma(TableMapping mapping14, Number period10, String seriesType19) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            
            this.mapping14 = mapping14;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            
            this.period10 = period10;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            
            this.seriesType19 = seriesType19;
        } else {
            this.mapping14 = mapping14;
            this.period10 = period10;
            this.seriesType19 = seriesType19;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping14.generateJs());
            js.append(String.format(Locale.US, "var setMma1" + ++variableIndex + " = " + jsBase + ".mma(%s, %s, %s);", ((mapping14 != null) ? mapping14.getJsBase() : "null"), period10, wrapQuotes(seriesType19)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %s);", ((mapping14 != null) ? mapping14.getJsBase() : "null"), period10, wrapQuotes(seriesType19)));
                js.setLength(0);
            }
        }
        MMA item = new MMA("setMma1" + variableIndex);
        setMma1.add(item);
        return item;
    }
    private String generateJSsetMma1() {
        if (!setMma1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MMA item : setMma1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private NoDataSettings getNoData;

    /**
     * Getter for noData settings.
     */
    public NoDataSettings getNoData() {
        if (getNoData == null)
            getNoData = new NoDataSettings(jsBase + ".noData()");

        return getNoData;
    }

    private String noData;

    /**
     * Setter for noData settings.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
     */
    public Plot setNoData(String noData) {
        if (jsBase == null) {
            this.noData = noData;
        } else {
            this.noData = noData;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".noData(%s)", wrapQuotes(noData)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".noData(%s);", wrapQuotes(noData)));
                js.setLength(0);
            }
        }
        return this;
    }


    private List<StockSeriesOHLC> setOhlc = new ArrayList<>();

    /**
     * Creates and returns a new OHLC series.
     */
    public StockSeriesOHLC ohlc(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setOhlc" + ++variableIndex + " = " + jsBase + ".ohlc(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesOHLC item = new StockSeriesOHLC("setOhlc" + variableIndex);
        setOhlc.add(item);
        return item;
    }

    private String generateJSsetOhlc() {
        if (!setOhlc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesOHLC item : setOhlc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RangeColors getPalette;

    /**
     * Getter for the current series colors palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

    /**
     * Setter for the series colors palette.
     */
    public Plot setPalette(RangeColors palette) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette = palette;
        } else {
            this.palette = palette;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(palette.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", ((palette != null) ? palette.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the series colors palette.
     */
    public Plot setPalette(DistinctColors palette1) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette1 = palette1;
        } else {
            this.palette1 = palette1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(palette1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", ((palette1 != null) ? palette1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the series colors palette.
     */
    public Plot setPalette(String palette2) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette2 = palette2;
        } else {
            this.palette2 = palette2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", wrapQuotes(palette2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the series colors palette.
     */
    public Plot setPalette(String[] palette3) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette3 = palette3;
        } else {
            this.palette3 = palette3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", arrayToStringWrapQuotes(palette3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number pointWidth;
    private String pointWidth1;

    /**
     * Setter for the point width settings.
     */
    public Plot setPointWidth(Number pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%s);", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the point width settings.
     */
    public Plot setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<CurrentPriceIndicator> getPriceIndicator = new ArrayList<>();

    /**
     * Getter for the stock price indicator.
     */
    public CurrentPriceIndicator getPriceIndicator(Number index) {
        CurrentPriceIndicator item = new CurrentPriceIndicator(jsBase + ".priceIndicator(" + index + ")");
        getPriceIndicator.add(item);
        return item;
    }

    private String priceIndicator;
    private Boolean priceIndicator1;

    /**
     * Setter for the stock price indicator settings.
     */
    public Plot setPriceIndicator(String priceIndicator) {
        if (jsBase == null) {
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            
            this.priceIndicator = priceIndicator;
        } else {
            this.priceIndicator = priceIndicator;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".priceIndicator(%s)", wrapQuotes(priceIndicator)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".priceIndicator(%s);", wrapQuotes(priceIndicator)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the stock price indicator settings.
     */
    public Plot setPriceIndicator(Boolean priceIndicator1) {
        if (jsBase == null) {
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            
            this.priceIndicator1 = priceIndicator1;
        } else {
            this.priceIndicator1 = priceIndicator1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".priceIndicator(%b)", priceIndicator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".priceIndicator(%b);", priceIndicator1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private String priceIndicator2;
    private Boolean priceIndicator3;

    /**
     * Setter for the stock price indicator settings by index.
     */
    public Plot setPriceIndicator(Number index, String priceIndicator2) {
        if (jsBase == null) {
            this.index = index;
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            this.priceIndicator2 = null;
            this.priceIndicator3 = null;
            
            this.priceIndicator2 = priceIndicator2;
        } else {
            this.index = index;
            this.priceIndicator2 = priceIndicator2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".priceIndicator(%s, %s)", index, wrapQuotes(priceIndicator2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".priceIndicator(%s, %s);", index, wrapQuotes(priceIndicator2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the stock price indicator settings by index.
     */
    public Plot setPriceIndicator(Number index, Boolean priceIndicator3) {
        if (jsBase == null) {
            this.index = index;
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            this.priceIndicator2 = null;
            this.priceIndicator3 = null;
            
            this.priceIndicator3 = priceIndicator3;
        } else {
            this.index = index;
            this.priceIndicator3 = priceIndicator3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".priceIndicator(%s, %b)", index, priceIndicator3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".priceIndicator(%s, %b);", index, priceIndicator3));
                js.setLength(0);
            }
        }
        return this;
    }


    private List<StockSeriesRangeArea> setRangeArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Area series.
     */
    public StockSeriesRangeArea rangeArea(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setRangeArea" + ++variableIndex + " = " + jsBase + ".rangeArea(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesRangeArea item = new StockSeriesRangeArea("setRangeArea" + variableIndex);
        setRangeArea.add(item);
        return item;
    }

    private String generateJSsetRangeArea() {
        if (!setRangeArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesRangeArea item : setRangeArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesRangeColumn> setRangeColumn = new ArrayList<>();

    /**
     * Creates and returns a new Range Column series.
     */
    public StockSeriesRangeColumn rangeColumn(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesRangeColumn item = new StockSeriesRangeColumn("setRangeColumn" + variableIndex);
        setRangeColumn.add(item);
        return item;
    }

    private String generateJSsetRangeColumn() {
        if (!setRangeColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesRangeColumn item : setRangeColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesRangeSplineArea> setRangeSplineArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Spline Area series.
     */
    public StockSeriesRangeSplineArea rangeSplineArea(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setRangeSplineArea" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesRangeSplineArea item = new StockSeriesRangeSplineArea("setRangeSplineArea" + variableIndex);
        setRangeSplineArea.add(item);
        return item;
    }

    private String generateJSsetRangeSplineArea() {
        if (!setRangeSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesRangeSplineArea item : setRangeSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesRangeStepArea> setRangeStepArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Step Area series.
     */
    public StockSeriesRangeStepArea rangeStepArea(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setRangeStepArea" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesRangeStepArea item = new StockSeriesRangeStepArea("setRangeStepArea" + variableIndex);
        setRangeStepArea.add(item);
        return item;
    }

    private String generateJSsetRangeStepArea() {
        if (!setRangeStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesRangeStepArea item : setRangeStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number id;
    private String id1;

    /**
     * Removes one of series from chart by its id.
     */
    public Plot removeSeries(Number id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".removeSeries(%s)", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeSeries(%s);", id));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Removes one of series from chart by its id.
     */
    public Plot removeSeries(String id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeSeries(%s);", wrapQuotes(id1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;

    /**
     * Removes one of series from chart by its index.
     */
    public Plot removeSeriesAt(Number index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".removeSeriesAt(%s)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeSeriesAt(%s);", index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mapping15;
    private Number period11;
    private StockSeriesType seriesType20;
    private String seriesType21;
    private List<RoC> setRoc = new ArrayList<>();

    /**
     * Creates RoC (Rate of Change) indicator on the plot.
     */
    public RoC roc(TableMapping mapping15, Number period11, StockSeriesType seriesType20) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            
            this.mapping15 = mapping15;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            
            this.period11 = period11;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            
            this.seriesType20 = seriesType20;
        } else {
            this.mapping15 = mapping15;
            this.period11 = period11;
            this.seriesType20 = seriesType20;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping15.generateJs());
            js.append(String.format(Locale.US, "var setRoc" + ++variableIndex + " = " + jsBase + ".roc(%s, %s, %s);", ((mapping15 != null) ? mapping15.getJsBase() : "null"), period11, ((seriesType20 != null) ? seriesType20.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %s);", ((mapping15 != null) ? mapping15.getJsBase() : "null"), period11, ((seriesType20 != null) ? seriesType20.generateJs() : "null")));
                js.setLength(0);
            }
        }
        RoC item = new RoC("setRoc" + variableIndex);
        setRoc.add(item);
        return item;
    }
    private String generateJSsetRoc() {
        if (!setRoc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RoC item : setRoc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RoC> setRoc1 = new ArrayList<>();

    /**
     * Creates RoC (Rate of Change) indicator on the plot.
     */
    public RoC roc(TableMapping mapping15, Number period11, String seriesType21) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            
            this.mapping15 = mapping15;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            
            this.period11 = period11;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            
            this.seriesType21 = seriesType21;
        } else {
            this.mapping15 = mapping15;
            this.period11 = period11;
            this.seriesType21 = seriesType21;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping15.generateJs());
            js.append(String.format(Locale.US, "var setRoc1" + ++variableIndex + " = " + jsBase + ".roc(%s, %s, %s);", ((mapping15 != null) ? mapping15.getJsBase() : "null"), period11, wrapQuotes(seriesType21)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %s);", ((mapping15 != null) ? mapping15.getJsBase() : "null"), period11, wrapQuotes(seriesType21)));
                js.setLength(0);
            }
        }
        RoC item = new RoC("setRoc1" + variableIndex);
        setRoc1.add(item);
        return item;
    }
    private String generateJSsetRoc1() {
        if (!setRoc1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RoC item : setRoc1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping16;
    private Number period12;
    private StockSeriesType seriesType22;
    private String seriesType23;
    private List<RSI> setRsi = new ArrayList<>();

    /**
     * Creates RSI (Relative Strength Index) indicator on the plot.
     */
    public RSI rsi(TableMapping mapping16, Number period12, StockSeriesType seriesType22) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            
            this.mapping16 = mapping16;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            this.period12 = null;
            
            this.period12 = period12;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            this.seriesType22 = null;
            this.seriesType23 = null;
            
            this.seriesType22 = seriesType22;
        } else {
            this.mapping16 = mapping16;
            this.period12 = period12;
            this.seriesType22 = seriesType22;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping16.generateJs());
            js.append(String.format(Locale.US, "var setRsi" + ++variableIndex + " = " + jsBase + ".rsi(%s, %s, %s);", ((mapping16 != null) ? mapping16.getJsBase() : "null"), period12, ((seriesType22 != null) ? seriesType22.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s);", ((mapping16 != null) ? mapping16.getJsBase() : "null"), period12, ((seriesType22 != null) ? seriesType22.generateJs() : "null")));
                js.setLength(0);
            }
        }
        RSI item = new RSI("setRsi" + variableIndex);
        setRsi.add(item);
        return item;
    }
    private String generateJSsetRsi() {
        if (!setRsi.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RSI item : setRsi) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RSI> setRsi1 = new ArrayList<>();

    /**
     * Creates RSI (Relative Strength Index) indicator on the plot.
     */
    public RSI rsi(TableMapping mapping16, Number period12, String seriesType23) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            
            this.mapping16 = mapping16;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            this.period12 = null;
            
            this.period12 = period12;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            this.seriesType22 = null;
            this.seriesType23 = null;
            
            this.seriesType23 = seriesType23;
        } else {
            this.mapping16 = mapping16;
            this.period12 = period12;
            this.seriesType23 = seriesType23;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping16.generateJs());
            js.append(String.format(Locale.US, "var setRsi1" + ++variableIndex + " = " + jsBase + ".rsi(%s, %s, %s);", ((mapping16 != null) ? mapping16.getJsBase() : "null"), period12, wrapQuotes(seriesType23)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s);", ((mapping16 != null) ? mapping16.getJsBase() : "null"), period12, wrapQuotes(seriesType23)));
                js.setLength(0);
            }
        }
        RSI item = new RSI("setRsi1" + variableIndex);
        setRsi1.add(item);
        return item;
    }
    private String generateJSsetRsi1() {
        if (!setRsi1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RSI item : setRsi1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping17;
    private Number period13;
    private StockSeriesType seriesType24;
    private String seriesType25;
    private List<SMA> setSma = new ArrayList<>();

    /**
     * Creates SMA (Simple Moving Average) indicator on the plot.
     */
    public SMA sma(TableMapping mapping17, Number period13, StockSeriesType seriesType24) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            
            this.mapping17 = mapping17;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            this.period12 = null;
            this.period13 = null;
            
            this.period13 = period13;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            this.seriesType22 = null;
            this.seriesType23 = null;
            this.seriesType24 = null;
            this.seriesType25 = null;
            
            this.seriesType24 = seriesType24;
        } else {
            this.mapping17 = mapping17;
            this.period13 = period13;
            this.seriesType24 = seriesType24;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping17.generateJs());
            js.append(String.format(Locale.US, "var setSma" + ++variableIndex + " = " + jsBase + ".sma(%s, %s, %s);", ((mapping17 != null) ? mapping17.getJsBase() : "null"), period13, ((seriesType24 != null) ? seriesType24.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %s);", ((mapping17 != null) ? mapping17.getJsBase() : "null"), period13, ((seriesType24 != null) ? seriesType24.generateJs() : "null")));
                js.setLength(0);
            }
        }
        SMA item = new SMA("setSma" + variableIndex);
        setSma.add(item);
        return item;
    }
    private String generateJSsetSma() {
        if (!setSma.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SMA item : setSma) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SMA> setSma1 = new ArrayList<>();

    /**
     * Creates SMA (Simple Moving Average) indicator on the plot.
     */
    public SMA sma(TableMapping mapping17, Number period13, String seriesType25) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            
            this.mapping17 = mapping17;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            this.period3 = null;
            this.period4 = null;
            this.period5 = null;
            this.period6 = null;
            this.period7 = null;
            this.period8 = null;
            this.period9 = null;
            this.period10 = null;
            this.period11 = null;
            this.period12 = null;
            this.period13 = null;
            
            this.period13 = period13;
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            this.seriesType8 = null;
            this.seriesType9 = null;
            this.seriesType10 = null;
            this.seriesType11 = null;
            this.seriesType12 = null;
            this.seriesType13 = null;
            this.seriesType14 = null;
            this.seriesType15 = null;
            this.seriesType16 = null;
            this.seriesType17 = null;
            this.seriesType18 = null;
            this.seriesType19 = null;
            this.seriesType20 = null;
            this.seriesType21 = null;
            this.seriesType22 = null;
            this.seriesType23 = null;
            this.seriesType24 = null;
            this.seriesType25 = null;
            
            this.seriesType25 = seriesType25;
        } else {
            this.mapping17 = mapping17;
            this.period13 = period13;
            this.seriesType25 = seriesType25;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping17.generateJs());
            js.append(String.format(Locale.US, "var setSma1" + ++variableIndex + " = " + jsBase + ".sma(%s, %s, %s);", ((mapping17 != null) ? mapping17.getJsBase() : "null"), period13, wrapQuotes(seriesType25)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %s);", ((mapping17 != null) ? mapping17.getJsBase() : "null"), period13, wrapQuotes(seriesType25)));
                js.setLength(0);
            }
        }
        SMA item = new SMA("setSma1" + variableIndex);
        setSma1.add(item);
        return item;
    }
    private String generateJSsetSma1() {
        if (!setSma1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SMA item : setSma1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesSpline> setSpline = new ArrayList<>();

    /**
     * Creates and returns a new Spline series.
     */
    public StockSeriesSpline spline(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setSpline" + ++variableIndex + " = " + jsBase + ".spline(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesSpline item = new StockSeriesSpline("setSpline" + variableIndex);
        setSpline.add(item);
        return item;
    }

    private String generateJSsetSpline() {
        if (!setSpline.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesSpline item : setSpline) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesSplineArea> setSplineArea = new ArrayList<>();

    /**
     * Creates and returns a new Spline Area series.
     */
    public StockSeriesSplineArea splineArea(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setSplineArea" + ++variableIndex + " = " + jsBase + ".splineArea(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesSplineArea item = new StockSeriesSplineArea("setSplineArea" + variableIndex);
        setSplineArea.add(item);
        return item;
    }

    private String generateJSsetSplineArea() {
        if (!setSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesSplineArea item : setSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesStepArea> setStepArea = new ArrayList<>();

    /**
     * Creates and returns a new Step Area series.
     */
    public StockSeriesStepArea stepArea(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setStepArea" + ++variableIndex + " = " + jsBase + ".stepArea(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesStepArea item = new StockSeriesStepArea("setStepArea" + variableIndex);
        setStepArea.add(item);
        return item;
    }

    private String generateJSsetStepArea() {
        if (!setStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesStepArea item : setStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesStepLine> setStepLine = new ArrayList<>();

    /**
     * Creates and returns a new Step Line series.
     */
    public StockSeriesStepLine stepLine(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setStepLine" + ++variableIndex + " = " + jsBase + ".stepLine(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesStepLine item = new StockSeriesStepLine("setStepLine" + variableIndex);
        setStepLine.add(item);
        return item;
    }

    private String generateJSsetStepLine() {
        if (!setStepLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesStepLine item : setStepLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private List<StockSeriesStick> setStick = new ArrayList<>();

    /**
     * Creates and returns a new Stick series.
     */
    public StockSeriesStick stick(TableMapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setStick" + ++variableIndex + " = " + jsBase + ".stick(%s);", mapping.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s);", mapping.getJsBase()));
            js.setLength(0);
        }

        StockSeriesStick item = new StockSeriesStick("setStick" + variableIndex);
        setStick.add(item);
        return item;
    }

    private String generateJSsetStick() {
        if (!setStick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesStick item : setStick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping18;
    private Number kPeriod1;
    private Number kMAPeriod1;
    private Number dPeriod1;
    private MovingAverageType kMAType2;
    private String kMAType3;
    private MovingAverageType dMAType2;
    private String dMAType3;
    private StockSeriesType kSeriesType2;
    private String kSeriesType3;
    private StockSeriesType dSeriesType2;
    private String dSeriesType3;
    private List<Stochastic> setStochastic = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, MovingAverageType dMAType2, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic" + variableIndex);
        setStochastic.add(item);
        return item;
    }
    private String generateJSsetStochastic() {
        if (!setStochastic.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic1 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, MovingAverageType dMAType2, StockSeriesType kSeriesType2, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic1" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic1" + variableIndex);
        setStochastic1.add(item);
        return item;
    }
    private String generateJSsetStochastic1() {
        if (!setStochastic1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic2 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, MovingAverageType dMAType2, String kSeriesType3, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic2" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic2" + variableIndex);
        setStochastic2.add(item);
        return item;
    }
    private String generateJSsetStochastic2() {
        if (!setStochastic2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic3 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, MovingAverageType dMAType2, String kSeriesType3, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic3" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic3" + variableIndex);
        setStochastic3.add(item);
        return item;
    }
    private String generateJSsetStochastic3() {
        if (!setStochastic3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic4 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, String dMAType3, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic4" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic4" + variableIndex);
        setStochastic4.add(item);
        return item;
    }
    private String generateJSsetStochastic4() {
        if (!setStochastic4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic5 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, String dMAType3, StockSeriesType kSeriesType2, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic5" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic5" + variableIndex);
        setStochastic5.add(item);
        return item;
    }
    private String generateJSsetStochastic5() {
        if (!setStochastic5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic6 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, String dMAType3, String kSeriesType3, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic6" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic6" + variableIndex);
        setStochastic6.add(item);
        return item;
    }
    private String generateJSsetStochastic6() {
        if (!setStochastic6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic7 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, MovingAverageType kMAType2, String dMAType3, String kSeriesType3, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType2 = kMAType2;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic7" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic7" + variableIndex);
        setStochastic7.add(item);
        return item;
    }
    private String generateJSsetStochastic7() {
        if (!setStochastic7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic8 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, MovingAverageType dMAType2, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic8" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic8" + variableIndex);
        setStochastic8.add(item);
        return item;
    }
    private String generateJSsetStochastic8() {
        if (!setStochastic8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic9 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, MovingAverageType dMAType2, StockSeriesType kSeriesType2, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic9" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic9" + variableIndex);
        setStochastic9.add(item);
        return item;
    }
    private String generateJSsetStochastic9() {
        if (!setStochastic9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic10 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, MovingAverageType dMAType2, String kSeriesType3, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic10" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic10" + variableIndex);
        setStochastic10.add(item);
        return item;
    }
    private String generateJSsetStochastic10() {
        if (!setStochastic10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic11 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, MovingAverageType dMAType2, String kSeriesType3, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType2 = dMAType2;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic11" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic11" + variableIndex);
        setStochastic11.add(item);
        return item;
    }
    private String generateJSsetStochastic11() {
        if (!setStochastic11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic12 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, String dMAType3, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic12" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic12" + variableIndex);
        setStochastic12.add(item);
        return item;
    }
    private String generateJSsetStochastic12() {
        if (!setStochastic12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic13 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, String dMAType3, StockSeriesType kSeriesType2, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic13" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic13" + variableIndex);
        setStochastic13.add(item);
        return item;
    }
    private String generateJSsetStochastic13() {
        if (!setStochastic13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic14 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, String dMAType3, String kSeriesType3, StockSeriesType dSeriesType2) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType2 = dSeriesType2;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic14" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic14" + variableIndex);
        setStochastic14.add(item);
        return item;
    }
    private String generateJSsetStochastic14() {
        if (!setStochastic14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Stochastic> setStochastic15 = new ArrayList<>();

    /**
     * Creates a Stochastic indicator on the plot.
     */
    public Stochastic stochastic(TableMapping mapping18, Number kPeriod1, Number kMAPeriod1, Number dPeriod1, String kMAType3, String dMAType3, String kSeriesType3, String dSeriesType3) {
        if (jsBase == null) {
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            this.mapping4 = null;
            this.mapping5 = null;
            this.mapping6 = null;
            this.mapping7 = null;
            this.mapping8 = null;
            this.mapping9 = null;
            this.mapping10 = null;
            this.mapping11 = null;
            this.mapping12 = null;
            this.mapping13 = null;
            this.mapping14 = null;
            this.mapping15 = null;
            this.mapping16 = null;
            this.mapping17 = null;
            this.mapping18 = null;
            
            this.mapping18 = mapping18;
            this.kPeriod = null;
            this.kPeriod1 = null;
            
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod = null;
            this.kMAPeriod1 = null;
            
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod = null;
            this.dPeriod1 = null;
            
            this.dPeriod1 = dPeriod1;
            this.kMAType = null;
            this.kMAType1 = null;
            this.kMAType2 = null;
            this.kMAType3 = null;
            
            this.kMAType3 = kMAType3;
            this.dMAType = null;
            this.dMAType1 = null;
            this.dMAType2 = null;
            this.dMAType3 = null;
            
            this.dMAType3 = dMAType3;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            this.kSeriesType2 = null;
            this.kSeriesType3 = null;
            
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            this.dSeriesType2 = null;
            this.dSeriesType3 = null;
            
            this.dSeriesType3 = dSeriesType3;
        } else {
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mapping18.generateJs());
            js.append(String.format(Locale.US, "var setStochastic15" + ++variableIndex + " = " + jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s);", ((mapping18 != null) ? mapping18.getJsBase() : "null"), kPeriod1, kMAPeriod1, dPeriod1, wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3)));
                js.setLength(0);
            }
        }
        Stochastic item = new Stochastic("setStochastic15" + variableIndex);
        setStochastic15.add(item);
        return item;
    }
    private String generateJSsetStochastic15() {
        if (!setStochastic15.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Stochastic item : setStochastic15) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockDateTime getXAxis;

    /**
     * Getter for the current X-axis.
     */
    public StockDateTime getXAxis() {
        if (getXAxis == null)
            getXAxis = new StockDateTime(jsBase + ".xAxis()");

        return getXAxis;
    }

    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the X-axis.
     */
    public Plot setXAxis(String xAxis) {
        if (jsBase == null) {
            this.xAxis = null;
            this.xAxis1 = null;
            
            this.xAxis = xAxis;
        } else {
            this.xAxis = xAxis;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xAxis(%s);", wrapQuotes(xAxis)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the X-axis.
     */
    public Plot setXAxis(Boolean xAxis1) {
        if (jsBase == null) {
            this.xAxis = null;
            this.xAxis1 = null;
            
            this.xAxis1 = xAxis1;
        } else {
            this.xAxis1 = xAxis1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xAxis(%b)", xAxis1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xAxis(%b);", xAxis1));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GridsStock> getXGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by X-scale.
     */
    public GridsStock getXGrid(Number index) {
        GridsStock item = new GridsStock(jsBase + ".xGrid(" + index + ")");
        getXGrid.add(item);
        return item;
    }

    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the plot grid by X-scale.
     */
    public Plot setXGrid(String xGrid) {
        if (jsBase == null) {
            this.xGrid = null;
            this.xGrid1 = null;
            
            this.xGrid = xGrid;
        } else {
            this.xGrid = xGrid;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xGrid(%s);", wrapQuotes(xGrid)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by X-scale.
     */
    public Plot setXGrid(Boolean xGrid1) {
        if (jsBase == null) {
            this.xGrid = null;
            this.xGrid1 = null;
            
            this.xGrid1 = xGrid1;
        } else {
            this.xGrid1 = xGrid1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xGrid(%b)", xGrid1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xGrid(%b);", xGrid1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index2;
    private String xGrid2;
    private Boolean xGrid3;

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXGrid(Number index2, String xGrid2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.xGrid = null;
            this.xGrid1 = null;
            this.xGrid2 = null;
            this.xGrid3 = null;
            
            this.xGrid2 = xGrid2;
        } else {
            this.index2 = index2;
            this.xGrid2 = xGrid2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xGrid(%s, %s)", index2, wrapQuotes(xGrid2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index2, wrapQuotes(xGrid2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by index.
     */
    public Plot setXGrid(Number index2, Boolean xGrid3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.xGrid = null;
            this.xGrid1 = null;
            this.xGrid2 = null;
            this.xGrid3 = null;
            
            this.xGrid3 = xGrid3;
        } else {
            this.index2 = index2;
            this.xGrid3 = xGrid3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xGrid(%s, %b)", index2, xGrid3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xGrid(%s, %b);", index2, xGrid3));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GridsStock> getXMinorGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by X-scale.
     */
    public GridsStock getXMinorGrid(Number index) {
        GridsStock item = new GridsStock(jsBase + ".xMinorGrid(" + index + ")");
        getXMinorGrid.add(item);
        return item;
    }

    private String xMinorGrid;
    private Boolean xMinorGrid1;

    /**
     * Setter for the plot grid by X-scale.
     */
    public Plot setXMinorGrid(String xMinorGrid) {
        if (jsBase == null) {
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            
            this.xMinorGrid = xMinorGrid;
        } else {
            this.xMinorGrid = xMinorGrid;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", wrapQuotes(xMinorGrid)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by X-scale.
     */
    public Plot setXMinorGrid(Boolean xMinorGrid1) {
        if (jsBase == null) {
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            
            this.xMinorGrid1 = xMinorGrid1;
        } else {
            this.xMinorGrid1 = xMinorGrid1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorGrid(%b);", xMinorGrid1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number indexOrValue;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXMinorGrid(Number indexOrValue, String xMinorGrid2) {
        if (jsBase == null) {
            this.indexOrValue = indexOrValue;
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            this.xMinorGrid2 = null;
            this.xMinorGrid3 = null;
            
            this.xMinorGrid2 = xMinorGrid2;
        } else {
            this.indexOrValue = indexOrValue;
            this.xMinorGrid2 = xMinorGrid2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorGrid(%s, %s)", indexOrValue, wrapQuotes(xMinorGrid2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", indexOrValue, wrapQuotes(xMinorGrid2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by index.
     */
    public Plot setXMinorGrid(Number indexOrValue, Boolean xMinorGrid3) {
        if (jsBase == null) {
            this.indexOrValue = indexOrValue;
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            this.xMinorGrid2 = null;
            this.xMinorGrid3 = null;
            
            this.xMinorGrid3 = xMinorGrid3;
        } else {
            this.indexOrValue = indexOrValue;
            this.xMinorGrid3 = xMinorGrid3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".xMinorGrid(%s, %b)", indexOrValue, xMinorGrid3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %b);", indexOrValue, xMinorGrid3));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<CoreAxesLinear> getYAxis = new ArrayList<>();

    /**
     * Getter for the current plot Y-axis.
     */
    public CoreAxesLinear getYAxis(Number index) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis(" + index + ")");
        getYAxis.add(item);
        return item;
    }

    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the plot Y-axis.
     */
    public Plot setYAxis(String yAxis) {
        if (jsBase == null) {
            this.yAxis = null;
            this.yAxis1 = null;
            
            this.yAxis = yAxis;
        } else {
            this.yAxis = yAxis;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yAxis(%s);", wrapQuotes(yAxis)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot Y-axis.
     */
    public Plot setYAxis(Boolean yAxis1) {
        if (jsBase == null) {
            this.yAxis = null;
            this.yAxis1 = null;
            
            this.yAxis1 = yAxis1;
        } else {
            this.yAxis1 = yAxis1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yAxis(%b)", yAxis1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yAxis(%b);", yAxis1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index3;
    private String yAxis2;
    private Boolean yAxis3;

    /**
     * Setter for the Y-axis by index.
     */
    public Plot setYAxis(Number index3, String yAxis2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.yAxis = null;
            this.yAxis1 = null;
            this.yAxis2 = null;
            this.yAxis3 = null;
            
            this.yAxis2 = yAxis2;
        } else {
            this.index3 = index3;
            this.yAxis2 = yAxis2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yAxis(%s, %s)", index3, wrapQuotes(yAxis2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index3, wrapQuotes(yAxis2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Y-axis by index.
     */
    public Plot setYAxis(Number index3, Boolean yAxis3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.yAxis = null;
            this.yAxis1 = null;
            this.yAxis2 = null;
            this.yAxis3 = null;
            
            this.yAxis3 = yAxis3;
        } else {
            this.index3 = index3;
            this.yAxis3 = yAxis3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yAxis(%s, %b)", index3, yAxis3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yAxis(%s, %b);", index3, yAxis3));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GridsStock> getYGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by Y-scale.
     */
    public GridsStock getYGrid(Number index) {
        GridsStock item = new GridsStock(jsBase + ".yGrid(" + index + ")");
        getYGrid.add(item);
        return item;
    }

    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the plot grid by Y-scale.
     */
    public Plot setYGrid(String yGrid) {
        if (jsBase == null) {
            this.yGrid = null;
            this.yGrid1 = null;
            
            this.yGrid = yGrid;
        } else {
            this.yGrid = yGrid;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yGrid(%s);", wrapQuotes(yGrid)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by Y-scale.
     */
    public Plot setYGrid(Boolean yGrid1) {
        if (jsBase == null) {
            this.yGrid = null;
            this.yGrid1 = null;
            
            this.yGrid1 = yGrid1;
        } else {
            this.yGrid1 = yGrid1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yGrid(%b)", yGrid1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yGrid(%b);", yGrid1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index4;
    private String yGrid2;
    private Boolean yGrid3;

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYGrid(Number index4, String yGrid2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
            this.yGrid = null;
            this.yGrid1 = null;
            this.yGrid2 = null;
            this.yGrid3 = null;
            
            this.yGrid2 = yGrid2;
        } else {
            this.index4 = index4;
            this.yGrid2 = yGrid2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yGrid(%s, %s)", index4, wrapQuotes(yGrid2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index4, wrapQuotes(yGrid2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by index.
     */
    public Plot setYGrid(Number index4, Boolean yGrid3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
            this.yGrid = null;
            this.yGrid1 = null;
            this.yGrid2 = null;
            this.yGrid3 = null;
            
            this.yGrid3 = yGrid3;
        } else {
            this.index4 = index4;
            this.yGrid3 = yGrid3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yGrid(%s, %b)", index4, yGrid3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yGrid(%s, %b);", index4, yGrid3));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<GridsStock> getYMinorGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by Y-scale.
     */
    public GridsStock getYMinorGrid(Number index) {
        GridsStock item = new GridsStock(jsBase + ".yMinorGrid(" + index + ")");
        getYMinorGrid.add(item);
        return item;
    }

    private String yMinorGrid;
    private Boolean yMinorGrid1;

    /**
     * Setter for the plot grid by Y-scale.
     */
    public Plot setYMinorGrid(String yMinorGrid) {
        if (jsBase == null) {
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            
            this.yMinorGrid = yMinorGrid;
        } else {
            this.yMinorGrid = yMinorGrid;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", wrapQuotes(yMinorGrid)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by Y-scale.
     */
    public Plot setYMinorGrid(Boolean yMinorGrid1) {
        if (jsBase == null) {
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            
            this.yMinorGrid1 = yMinorGrid1;
        } else {
            this.yMinorGrid1 = yMinorGrid1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorGrid(%b);", yMinorGrid1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number indexOrValue1;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYMinorGrid(Number indexOrValue1, String yMinorGrid2) {
        if (jsBase == null) {
            this.indexOrValue = null;
            this.indexOrValue1 = null;
            
            this.indexOrValue1 = indexOrValue1;
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            this.yMinorGrid2 = null;
            this.yMinorGrid3 = null;
            
            this.yMinorGrid2 = yMinorGrid2;
        } else {
            this.indexOrValue1 = indexOrValue1;
            this.yMinorGrid2 = yMinorGrid2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorGrid(%s, %s)", indexOrValue1, wrapQuotes(yMinorGrid2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", indexOrValue1, wrapQuotes(yMinorGrid2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot grid by index.
     */
    public Plot setYMinorGrid(Number indexOrValue1, Boolean yMinorGrid3) {
        if (jsBase == null) {
            this.indexOrValue = null;
            this.indexOrValue1 = null;
            
            this.indexOrValue1 = indexOrValue1;
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            this.yMinorGrid2 = null;
            this.yMinorGrid3 = null;
            
            this.yMinorGrid3 = yMinorGrid3;
        } else {
            this.indexOrValue1 = indexOrValue1;
            this.yMinorGrid3 = yMinorGrid3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yMinorGrid(%s, %b)", indexOrValue1, yMinorGrid3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %b);", indexOrValue1, yMinorGrid3));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterBase getYScale;

    /**
     * Getter for the default plot Y-scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterScaleTypes yScale;
    private String yScale1;
    private ScatterBase yScale2;
    private String yScale3;

    /**
     * Setter for the plot Y-scale.
     */
    public Plot setYScale(ScatterScaleTypes yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", ((yScale != null) ? yScale.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale != null) ? yScale.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot Y-scale.
     */
    public Plot setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the plot Y-scale.
     */
    public Plot setYScale(ScatterBase yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale2 != null) ? yScale2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetAnnotations() {
        if (getAnnotations != null) {
            return getAnnotations.generateJs();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetCrosshair() {
        if (getCrosshair != null) {
            return getCrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetEventMarkers() {
        if (getEventMarkers != null) {
            return getEventMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeries() {
        if (!getGetSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : getGetSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetLegend() {
        if (getLegend != null) {
            return getLegend.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetNoData() {
        if (getNoData != null) {
            return getNoData.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetPriceIndicator() {
        if (!getPriceIndicator.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CurrentPriceIndicator item : getPriceIndicator) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetXGrid() {
        if (!getXGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsStock item : getXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXMinorGrid() {
        if (!getXMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsStock item : getXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYAxis() {
        if (!getYAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesLinear item : getYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYGrid() {
        if (!getYGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsStock item : getYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYMinorGrid() {
        if (!getYMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsStock item : getYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetAnnotations());
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetCrosshair());
        jsGetters.append(generateJSgetEventMarkers());
        jsGetters.append(generateJSgetGetSeries());
        jsGetters.append(generateJSgetGetSeries1());
        jsGetters.append(generateJSgetGetSeriesAt());
        jsGetters.append(generateJSgetHatchFillPalette());
        jsGetters.append(generateJSgetLegend());
        jsGetters.append(generateJSgetMarkerPalette());
        jsGetters.append(generateJSgetNoData());
        jsGetters.append(generateJSgetPalette());
        jsGetters.append(generateJSgetPriceIndicator());
        jsGetters.append(generateJSgetXAxis());
        jsGetters.append(generateJSgetXGrid());
        jsGetters.append(generateJSgetXMinorGrid());
        jsGetters.append(generateJSgetYAxis());
        jsGetters.append(generateJSgetYGrid());
        jsGetters.append(generateJSgetYMinorGrid());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAdl());
        js.append(generateJSsetAdl1());
        js.append(generateJSsetAma());
        js.append(generateJSsetAma1());
        js.append(generateJSsetArea());
        js.append(generateJSsetAroon());
        js.append(generateJSsetAroon1());
        js.append(generateJSsetAroon2());
        js.append(generateJSsetAroon3());
        js.append(generateJSsetAtr());
        js.append(generateJSsetAtr1());
        js.append(generateJSsetBbands());
        js.append(generateJSsetBbands1());
        js.append(generateJSsetBbands2());
        js.append(generateJSsetBbands3());
        js.append(generateJSsetBbands4());
        js.append(generateJSsetBbands5());
        js.append(generateJSsetBbands6());
        js.append(generateJSsetBbands7());
        js.append(generateJSsetBbandsB());
        js.append(generateJSsetBbandsB1());
        js.append(generateJSsetBbandsWidth());
        js.append(generateJSsetBbandsWidth1());
        js.append(generateJSsetCandlestick());
        js.append(generateJSsetCci());
        js.append(generateJSsetCci1());
        js.append(generateJSsetCho());
        js.append(generateJSsetCho1());
        js.append(generateJSsetCho2());
        js.append(generateJSsetCho3());
        js.append(generateJSsetCmf());
        js.append(generateJSsetCmf1());
        js.append(generateJSsetColumn());
        js.append(generateJSsetDmi());
        js.append(generateJSsetDmi1());
        js.append(generateJSsetDmi2());
        js.append(generateJSsetDmi3());
        js.append(generateJSsetDmi4());
        js.append(generateJSsetDmi5());
        js.append(generateJSsetDmi6());
        js.append(generateJSsetDmi7());
        js.append(generateJSsetEma());
        js.append(generateJSsetEma1());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHilo());
        js.append(generateJSsetJumpLine());
        js.append(generateJSsetKdj());
        js.append(generateJSsetKdj1());
        js.append(generateJSsetKdj2());
        js.append(generateJSsetKdj3());
        js.append(generateJSsetKdj4());
        js.append(generateJSsetKdj5());
        js.append(generateJSsetKdj6());
        js.append(generateJSsetKdj7());
        js.append(generateJSsetKdj8());
        js.append(generateJSsetKdj9());
        js.append(generateJSsetKdj10());
        js.append(generateJSsetKdj11());
        js.append(generateJSsetKdj12());
        js.append(generateJSsetKdj13());
        js.append(generateJSsetKdj14());
        js.append(generateJSsetKdj15());
        js.append(generateJSsetKdj16());
        js.append(generateJSsetKdj17());
        js.append(generateJSsetKdj18());
        js.append(generateJSsetKdj19());
        js.append(generateJSsetKdj20());
        js.append(generateJSsetKdj21());
        js.append(generateJSsetKdj22());
        js.append(generateJSsetKdj23());
        js.append(generateJSsetKdj24());
        js.append(generateJSsetKdj25());
        js.append(generateJSsetKdj26());
        js.append(generateJSsetKdj27());
        js.append(generateJSsetKdj28());
        js.append(generateJSsetKdj29());
        js.append(generateJSsetKdj30());
        js.append(generateJSsetKdj31());
        js.append(generateJSsetLine());
        js.append(generateJSsetMacd());
        js.append(generateJSsetMacd1());
        js.append(generateJSsetMacd2());
        js.append(generateJSsetMacd3());
        js.append(generateJSsetMacd4());
        js.append(generateJSsetMacd5());
        js.append(generateJSsetMacd6());
        js.append(generateJSsetMacd7());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMma());
        js.append(generateJSsetMma1());
        js.append(generateJSsetOhlc());
        js.append(generateJSsetRangeArea());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeSplineArea());
        js.append(generateJSsetRangeStepArea());
        js.append(generateJSsetRoc());
        js.append(generateJSsetRoc1());
        js.append(generateJSsetRsi());
        js.append(generateJSsetRsi1());
        js.append(generateJSsetSma());
        js.append(generateJSsetSma1());
        js.append(generateJSsetSpline());
        js.append(generateJSsetSplineArea());
        js.append(generateJSsetStepArea());
        js.append(generateJSsetStepLine());
        js.append(generateJSsetStick());
        js.append(generateJSsetStochastic());
        js.append(generateJSsetStochastic1());
        js.append(generateJSsetStochastic2());
        js.append(generateJSsetStochastic3());
        js.append(generateJSsetStochastic4());
        js.append(generateJSsetStochastic5());
        js.append(generateJSsetStochastic6());
        js.append(generateJSsetStochastic7());
        js.append(generateJSsetStochastic8());
        js.append(generateJSsetStochastic9());
        js.append(generateJSsetStochastic10());
        js.append(generateJSsetStochastic11());
        js.append(generateJSsetStochastic12());
        js.append(generateJSsetStochastic13());
        js.append(generateJSsetStochastic14());
        js.append(generateJSsetStochastic15());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}