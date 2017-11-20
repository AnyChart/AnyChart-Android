package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
        }
    }

    private TableMapping mapping;
    private StockSeriesType seriesType;
    private String seriesType1;
    private List<ADL> setAdl = new ArrayList<>();

    /**
     * Creates an Accumulation Distribution Line indicator on the plot.
     */
    public ADL adl(StockSeriesType seriesType, TableMapping mapping) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            
            this.seriesType = seriesType;
            this.mapping = mapping;
        } else {
            this.seriesType = seriesType;
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s)", ((seriesType != null) ? seriesType.generateJs() : "null"), ((mapping != null) ? mapping.generateJs() : "null")));
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
    public ADL adl(String seriesType1, TableMapping mapping) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            
            this.seriesType1 = seriesType1;
            this.mapping = mapping;
        } else {
            this.seriesType1 = seriesType1;
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s)", wrapQuotes(seriesType1), ((mapping != null) ? mapping.generateJs() : "null")));
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
    private Double period;
    private Double fastPeriod;
    private Double slowPeriod;
    private StockSeriesType seriesType2;
    private String seriesType3;
    private List<AMA> setAma = new ArrayList<>();

    /**
     * Creates AMA (Adaptive Moving Average) indicator on the plot.
     */
    public AMA ama(StockSeriesType seriesType2, TableMapping mapping1, Double period, Double fastPeriod, Double slowPeriod) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            
            this.seriesType2 = seriesType2;
            this.mapping = null;
            this.mapping1 = null;
            
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
        } else {
            this.seriesType2 = seriesType2;
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f)", ((seriesType2 != null) ? seriesType2.generateJs() : "null"), ((mapping1 != null) ? mapping1.generateJs() : "null"), period, fastPeriod, slowPeriod));
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
    public AMA ama(String seriesType3, TableMapping mapping1, Double period, Double fastPeriod, Double slowPeriod) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            
            this.seriesType3 = seriesType3;
            this.mapping = null;
            this.mapping1 = null;
            
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
        } else {
            this.seriesType3 = seriesType3;
            this.mapping1 = mapping1;
            this.period = period;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f)", wrapQuotes(seriesType3), ((mapping1 != null) ? mapping1.generateJs() : "null"), period, fastPeriod, slowPeriod));
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
    private List<Plot> setAnnotations = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".annotations(%s)", arrayToStringWrapQuotes(annotationsList)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnnotations() {
        if (!setAnnotations.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setAnnotations) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesArea> setArea = new ArrayList<>();

    /**
     * Creates and returns a new Area series.
     */
    public StockSeriesArea area(TableMapping mapping) {
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s);", mapping.getJsBase()));
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
    private Double period1;
    private StockSeriesType upSeriesType;
    private String upSeriesType1;
    private StockSeriesType downSeriesType;
    private String downSeriesType1;
    private List<Aroon> setAroon = new ArrayList<>();

    /**
     * Creates Aroon indicator on the plot.
     */
    public Aroon aroon(StockSeriesType upSeriesType, StockSeriesType downSeriesType, TableMapping mapping2, Double period1) {
        if (jsBase == null) {
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType = upSeriesType;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType = downSeriesType;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
        } else {
            this.upSeriesType = upSeriesType;
            this.downSeriesType = downSeriesType;
            this.mapping2 = mapping2;
            this.period1 = period1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), ((downSeriesType != null) ? downSeriesType.generateJs() : "null"), ((mapping2 != null) ? mapping2.generateJs() : "null"), period1));
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
    public Aroon aroon(StockSeriesType upSeriesType, String downSeriesType1, TableMapping mapping2, Double period1) {
        if (jsBase == null) {
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType = upSeriesType;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType1 = downSeriesType1;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
        } else {
            this.upSeriesType = upSeriesType;
            this.downSeriesType1 = downSeriesType1;
            this.mapping2 = mapping2;
            this.period1 = period1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", ((upSeriesType != null) ? upSeriesType.generateJs() : "null"), wrapQuotes(downSeriesType1), ((mapping2 != null) ? mapping2.generateJs() : "null"), period1));
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
    public Aroon aroon(String upSeriesType1, StockSeriesType downSeriesType, TableMapping mapping2, Double period1) {
        if (jsBase == null) {
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType = downSeriesType;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
        } else {
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = downSeriesType;
            this.mapping2 = mapping2;
            this.period1 = period1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", wrapQuotes(upSeriesType1), ((downSeriesType != null) ? downSeriesType.generateJs() : "null"), ((mapping2 != null) ? mapping2.generateJs() : "null"), period1));
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
    public Aroon aroon(String upSeriesType1, String downSeriesType1, TableMapping mapping2, Double period1) {
        if (jsBase == null) {
            this.upSeriesType = null;
            this.upSeriesType1 = null;
            
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType = null;
            this.downSeriesType1 = null;
            
            this.downSeriesType1 = downSeriesType1;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            
            this.mapping2 = mapping2;
            this.period = null;
            this.period1 = null;
            
            this.period1 = period1;
        } else {
            this.upSeriesType1 = upSeriesType1;
            this.downSeriesType1 = downSeriesType1;
            this.mapping2 = mapping2;
            this.period1 = period1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", wrapQuotes(upSeriesType1), wrapQuotes(downSeriesType1), ((mapping2 != null) ? mapping2.generateJs() : "null"), period1));
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
    private Double period2;
    private StockSeriesType seriesType4;
    private String seriesType5;
    private List<ATR> setAtr = new ArrayList<>();

    /**
     * Creates an Average True Range indicator on the plot.
     */
    public ATR atr(StockSeriesType seriesType4, TableMapping mapping3, Double period2) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            
            this.seriesType4 = seriesType4;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            
            this.mapping3 = mapping3;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            
            this.period2 = period2;
        } else {
            this.seriesType4 = seriesType4;
            this.mapping3 = mapping3;
            this.period2 = period2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %f)", ((seriesType4 != null) ? seriesType4.generateJs() : "null"), ((mapping3 != null) ? mapping3.generateJs() : "null"), period2));
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
    public ATR atr(String seriesType5, TableMapping mapping3, Double period2) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            
            this.seriesType5 = seriesType5;
            this.mapping = null;
            this.mapping1 = null;
            this.mapping2 = null;
            this.mapping3 = null;
            
            this.mapping3 = mapping3;
            this.period = null;
            this.period1 = null;
            this.period2 = null;
            
            this.period2 = period2;
        } else {
            this.seriesType5 = seriesType5;
            this.mapping3 = mapping3;
            this.period2 = period2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %f)", wrapQuotes(seriesType5), ((mapping3 != null) ? mapping3.generateJs() : "null"), period2));
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
    private List<Plot> setBackground = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setBackground1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground1() {
        if (!setBackground1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping4;
    private Double period3;
    private Double deviation;
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
    public BBands bbands(StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
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
        } else {
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = middleSeriesType;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null"), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
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
        } else {
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType1 = middleSeriesType1;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(StockSeriesType upperSeriesType, String lowerSeriesType1, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
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
        } else {
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = middleSeriesType;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null"), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(StockSeriesType upperSeriesType, String lowerSeriesType1, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
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
        } else {
            this.upperSeriesType = upperSeriesType;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType1 = middleSeriesType1;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", ((upperSeriesType != null) ? upperSeriesType.generateJs() : "null"), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(String upperSeriesType1, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
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
        } else {
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = middleSeriesType;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null"), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(String upperSeriesType1, StockSeriesType lowerSeriesType, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
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
        } else {
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = lowerSeriesType;
            this.middleSeriesType1 = middleSeriesType1;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", wrapQuotes(upperSeriesType1), ((lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null"), wrapQuotes(middleSeriesType1), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(String upperSeriesType1, String lowerSeriesType1, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType = middleSeriesType;
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
        } else {
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = middleSeriesType;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), ((middleSeriesType != null) ? middleSeriesType.generateJs() : "null"), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    public BBands bbands(String upperSeriesType1, String lowerSeriesType1, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
        if (jsBase == null) {
            this.upperSeriesType = null;
            this.upperSeriesType1 = null;
            
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType = null;
            this.lowerSeriesType1 = null;
            
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType = null;
            this.middleSeriesType1 = null;
            
            this.middleSeriesType1 = middleSeriesType1;
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
        } else {
            this.upperSeriesType1 = upperSeriesType1;
            this.lowerSeriesType1 = lowerSeriesType1;
            this.middleSeriesType1 = middleSeriesType1;
            this.mapping4 = mapping4;
            this.period3 = period3;
            this.deviation = deviation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", wrapQuotes(upperSeriesType1), wrapQuotes(lowerSeriesType1), wrapQuotes(middleSeriesType1), ((mapping4 != null) ? mapping4.generateJs() : "null"), period3, deviation));
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
    private Double period4;
    private Double deviation1;
    private StockSeriesType seriesType6;
    private String seriesType7;
    private List<BBandsB> setBbandsB = new ArrayList<>();

    /**
     * Creates %B indicator on the plot.
     */
    public BBandsB bbandsB(StockSeriesType seriesType6, TableMapping mapping5, Double period4, Double deviation1) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            
            this.seriesType6 = seriesType6;
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
        } else {
            this.seriesType6 = seriesType6;
            this.mapping5 = mapping5;
            this.period4 = period4;
            this.deviation1 = deviation1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f)", ((seriesType6 != null) ? seriesType6.generateJs() : "null"), ((mapping5 != null) ? mapping5.generateJs() : "null"), period4, deviation1));
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
    public BBandsB bbandsB(String seriesType7, TableMapping mapping5, Double period4, Double deviation1) {
        if (jsBase == null) {
            this.seriesType = null;
            this.seriesType1 = null;
            this.seriesType2 = null;
            this.seriesType3 = null;
            this.seriesType4 = null;
            this.seriesType5 = null;
            this.seriesType6 = null;
            this.seriesType7 = null;
            
            this.seriesType7 = seriesType7;
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
        } else {
            this.seriesType7 = seriesType7;
            this.mapping5 = mapping5;
            this.period4 = period4;
            this.deviation1 = deviation1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f)", wrapQuotes(seriesType7), ((mapping5 != null) ? mapping5.generateJs() : "null"), period4, deviation1));
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
    private Double period5;
    private Double deviation2;
    private StockSeriesType seriesType8;
    private String seriesType9;
    private List<BBandsWidth> setBbandsWidth = new ArrayList<>();

    /**
     * Creates Bollinger Bands Width indicator on the plot.
     */
    public BBandsWidth bbandsWidth(StockSeriesType seriesType8, TableMapping mapping6, Double period5, Double deviation2) {
        if (jsBase == null) {
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
        } else {
            this.seriesType8 = seriesType8;
            this.mapping6 = mapping6;
            this.period5 = period5;
            this.deviation2 = deviation2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f)", ((seriesType8 != null) ? seriesType8.generateJs() : "null"), ((mapping6 != null) ? mapping6.generateJs() : "null"), period5, deviation2));
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
    public BBandsWidth bbandsWidth(String seriesType9, TableMapping mapping6, Double period5, Double deviation2) {
        if (jsBase == null) {
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
        } else {
            this.seriesType9 = seriesType9;
            this.mapping6 = mapping6;
            this.period5 = period5;
            this.deviation2 = deviation2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f)", wrapQuotes(seriesType9), ((mapping6 != null) ? mapping6.generateJs() : "null"), period5, deviation2));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setCandlestick" + ++variableIndex + " = " + jsBase + ".candlestick(%s);", mapping.getJsBase()));
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
    private Double period6;
    private StockSeriesType seriesType10;
    private String seriesType11;
    private List<CCI> setCci = new ArrayList<>();

    /**
     * Creates a Commodity Channel Index indicator on the chart.
     */
    public CCI cci(StockSeriesType seriesType10, TableMapping mapping7, Double period6) {
        if (jsBase == null) {
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
        } else {
            this.seriesType10 = seriesType10;
            this.mapping7 = mapping7;
            this.period6 = period6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %f)", ((seriesType10 != null) ? seriesType10.generateJs() : "null"), ((mapping7 != null) ? mapping7.generateJs() : "null"), period6));
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
    public CCI cci(String seriesType11, TableMapping mapping7, Double period6) {
        if (jsBase == null) {
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
        } else {
            this.seriesType11 = seriesType11;
            this.mapping7 = mapping7;
            this.period6 = period6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %f)", wrapQuotes(seriesType11), ((mapping7 != null) ? mapping7.generateJs() : "null"), period6));
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
    private Double fastPeriod1;
    private Double slowPeriod1;
    private MovingAverageType maType;
    private String maType1;
    private StockSeriesType seriesType12;
    private String seriesType13;
    private List<CHO> setCho = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(MovingAverageType maType, StockSeriesType seriesType12, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.maType = maType;
            this.seriesType12 = seriesType12;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %f, %f)", ((maType != null) ? maType.generateJs() : "null"), ((seriesType12 != null) ? seriesType12.generateJs() : "null"), ((mapping8 != null) ? mapping8.generateJs() : "null"), fastPeriod1, slowPeriod1));
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
    public CHO cho(MovingAverageType maType, String seriesType13, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.maType = maType;
            this.seriesType13 = seriesType13;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %f, %f)", ((maType != null) ? maType.generateJs() : "null"), wrapQuotes(seriesType13), ((mapping8 != null) ? mapping8.generateJs() : "null"), fastPeriod1, slowPeriod1));
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
    public CHO cho(String maType1, StockSeriesType seriesType12, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.maType1 = maType1;
            this.seriesType12 = seriesType12;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %f, %f)", wrapQuotes(maType1), ((seriesType12 != null) ? seriesType12.generateJs() : "null"), ((mapping8 != null) ? mapping8.generateJs() : "null"), fastPeriod1, slowPeriod1));
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
    public CHO cho(String maType1, String seriesType13, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.maType1 = maType1;
            this.seriesType13 = seriesType13;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %f, %f)", wrapQuotes(maType1), wrapQuotes(seriesType13), ((mapping8 != null) ? mapping8.generateJs() : "null"), fastPeriod1, slowPeriod1));
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
    private Double period7;
    private StockSeriesType seriesType14;
    private String seriesType15;
    private List<CMF> setCmf = new ArrayList<>();

    /**
     * Creates a Chaikin Money Flow indicator on the chart.
     */
    public CMF cmf(StockSeriesType seriesType14, TableMapping mapping9, Double period7) {
        if (jsBase == null) {
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
        } else {
            this.seriesType14 = seriesType14;
            this.mapping9 = mapping9;
            this.period7 = period7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f)", ((seriesType14 != null) ? seriesType14.generateJs() : "null"), ((mapping9 != null) ? mapping9.generateJs() : "null"), period7));
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
    public CMF cmf(String seriesType15, TableMapping mapping9, Double period7) {
        if (jsBase == null) {
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
        } else {
            this.seriesType15 = seriesType15;
            this.mapping9 = mapping9;
            this.period7 = period7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f)", wrapQuotes(seriesType15), ((mapping9 != null) ? mapping9.generateJs() : "null"), period7));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s);", mapping.getJsBase()));
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
    private List<Plot> setCrosshair = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCrosshair() {
        if (!setCrosshair.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setCrosshair1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".crosshair(%b)", crosshair1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCrosshair1() {
        if (!setCrosshair1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesType defaultSeriesType;
    private String defaultSeriesType1;
    private List<Plot> setDefaultSeriesType = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType() {
        if (!setDefaultSeriesType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setDefaultSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setDefaultSeriesType1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType1() {
        if (!setDefaultSeriesType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setDefaultSeriesType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping10;
    private Double period8;
    private Double adxPeriod;
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
    public DMI dmi(StockSeriesType pdiSeriesType, StockSeriesType ndiSeriesType, StockSeriesType adxSeriesType, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
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
        } else {
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = adxSeriesType;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null"), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(StockSeriesType pdiSeriesType, StockSeriesType ndiSeriesType, String adxSeriesType1, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
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
        } else {
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType1 = adxSeriesType1;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(StockSeriesType pdiSeriesType, String ndiSeriesType1, StockSeriesType adxSeriesType, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
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
        } else {
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = adxSeriesType;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null"), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(StockSeriesType pdiSeriesType, String ndiSeriesType1, String adxSeriesType1, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
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
        } else {
            this.pdiSeriesType = pdiSeriesType;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType1 = adxSeriesType1;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", ((pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null"), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(String pdiSeriesType1, StockSeriesType ndiSeriesType, StockSeriesType adxSeriesType, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
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
        } else {
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = adxSeriesType;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null"), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(String pdiSeriesType1, StockSeriesType ndiSeriesType, String adxSeriesType1, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
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
        } else {
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = ndiSeriesType;
            this.adxSeriesType1 = adxSeriesType1;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", wrapQuotes(pdiSeriesType1), ((ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null"), wrapQuotes(adxSeriesType1), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(String pdiSeriesType1, String ndiSeriesType1, StockSeriesType adxSeriesType, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType = adxSeriesType;
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
        } else {
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = adxSeriesType;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), ((adxSeriesType != null) ? adxSeriesType.generateJs() : "null"), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    public DMI dmi(String pdiSeriesType1, String ndiSeriesType1, String adxSeriesType1, TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing) {
        if (jsBase == null) {
            this.pdiSeriesType = null;
            this.pdiSeriesType1 = null;
            
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType = null;
            this.ndiSeriesType1 = null;
            
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType = null;
            this.adxSeriesType1 = null;
            
            this.adxSeriesType1 = adxSeriesType1;
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
        } else {
            this.pdiSeriesType1 = pdiSeriesType1;
            this.ndiSeriesType1 = ndiSeriesType1;
            this.adxSeriesType1 = adxSeriesType1;
            this.mapping10 = mapping10;
            this.period8 = period8;
            this.adxPeriod = adxPeriod;
            this.useWildersSmoothing = useWildersSmoothing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", wrapQuotes(pdiSeriesType1), wrapQuotes(ndiSeriesType1), wrapQuotes(adxSeriesType1), ((mapping10 != null) ? mapping10.generateJs() : "null"), period8, adxPeriod, useWildersSmoothing));
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
    private Double period9;
    private StockSeriesType seriesType16;
    private String seriesType17;
    private List<EMA> setEma = new ArrayList<>();

    /**
     * Creates EMA (Exponential Moving Average) indicator on the plot.
     */
    public EMA ema(StockSeriesType seriesType16, TableMapping mapping11, Double period9) {
        if (jsBase == null) {
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
        } else {
            this.seriesType16 = seriesType16;
            this.mapping11 = mapping11;
            this.period9 = period9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %f)", ((seriesType16 != null) ? seriesType16.generateJs() : "null"), ((mapping11 != null) ? mapping11.generateJs() : "null"), period9));
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
    public EMA ema(String seriesType17, TableMapping mapping11, Double period9) {
        if (jsBase == null) {
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
        } else {
            this.seriesType17 = seriesType17;
            this.mapping11 = mapping11;
            this.period9 = period9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %f)", wrapQuotes(seriesType17), ((mapping11 != null) ? mapping11.generateJs() : "null"), period9));
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

    private List<StockSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public StockSeriesBase getGetSeries(Double id) {
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
    public StockSeriesBase getGetSeriesAt(Double index) {
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
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
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
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setJumpLine" + ++variableIndex + " = " + jsBase + ".jumpLine(%s);", mapping.getJsBase()));
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
    private Double kPeriod;
    private Double kMAPeriod;
    private Double dPeriod;
    private MovingAverageType kMAType;
    private String kMAType1;
    private MovingAverageType dMAType;
    private String dMAType1;
    private Double kMultiplier;
    private Double dMultiplier;
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, MovingAverageType dMAType, String kSeriesType1, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(MovingAverageType kMAType, String dMAType1, String kSeriesType1, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType = kMAType;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType = kMAType;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", ((kMAType != null) ? kMAType.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, MovingAverageType dMAType, String kSeriesType1, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType = dMAType;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType = dMAType;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, StockSeriesType kSeriesType, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, StockSeriesType kSeriesType, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, StockSeriesType kSeriesType, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType = kSeriesType;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType = kSeriesType;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), ((kSeriesType != null) ? kSeriesType.generateJs() : "null"), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, String kSeriesType1, StockSeriesType dSeriesType, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, String kSeriesType1, StockSeriesType dSeriesType, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType = dSeriesType;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = dSeriesType;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), ((dSeriesType != null) ? dSeriesType.generateJs() : "null"), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, String kSeriesType1, String dSeriesType1, StockSeriesType jSeriesType, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType = jSeriesType;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = jSeriesType;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), ((jSeriesType != null) ? jSeriesType.generateJs() : "null"), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    public KDJ kdj(String kMAType1, String dMAType1, String kSeriesType1, String dSeriesType1, String jSeriesType1, TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, Double kMultiplier, Double dMultiplier) {
        if (jsBase == null) {
            this.kMAType = null;
            this.kMAType1 = null;
            
            this.kMAType1 = kMAType1;
            this.dMAType = null;
            this.dMAType1 = null;
            
            this.dMAType1 = dMAType1;
            this.kSeriesType = null;
            this.kSeriesType1 = null;
            
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType = null;
            this.dSeriesType1 = null;
            
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType = null;
            this.jSeriesType1 = null;
            
            this.jSeriesType1 = jSeriesType1;
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
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
        } else {
            this.kMAType1 = kMAType1;
            this.dMAType1 = dMAType1;
            this.kSeriesType1 = kSeriesType1;
            this.dSeriesType1 = dSeriesType1;
            this.jSeriesType1 = jSeriesType1;
            this.mapping12 = mapping12;
            this.kPeriod = kPeriod;
            this.kMAPeriod = kMAPeriod;
            this.dPeriod = dPeriod;
            this.kMultiplier = kMultiplier;
            this.dMultiplier = dMultiplier;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", wrapQuotes(kMAType1), wrapQuotes(dMAType1), wrapQuotes(kSeriesType1), wrapQuotes(dSeriesType1), wrapQuotes(jSeriesType1), ((mapping12 != null) ? mapping12.generateJs() : "null"), kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
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
    private List<Plot> setLegend = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".legend(%s)", wrapQuotes(legend)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLegend() {
        if (!setLegend.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setLegend) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setLegend1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".legend(%b)", legend1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLegend1() {
        if (!setLegend1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setLegend1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesLine> setLine = new ArrayList<>();

    /**
     * Creates and returns a new Line series.
     */
    public StockSeriesLine line(TableMapping mapping) {
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s);", mapping.getJsBase()));
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
    private Double fastPeriod2;
    private Double slowPeriod2;
    private Double signalPeriod;
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
    public MACD macd(StockSeriesType macdSeriesType, StockSeriesType signalSeriesType, StockSeriesType histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
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
        } else {
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = histogramSeriesType;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null"), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(StockSeriesType macdSeriesType, StockSeriesType signalSeriesType, String histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
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
        } else {
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType1 = histogramSeriesType1;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(StockSeriesType macdSeriesType, String signalSeriesType1, StockSeriesType histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
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
        } else {
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = histogramSeriesType;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null"), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(StockSeriesType macdSeriesType, String signalSeriesType1, String histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
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
        } else {
            this.macdSeriesType = macdSeriesType;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType1 = histogramSeriesType1;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", ((macdSeriesType != null) ? macdSeriesType.generateJs() : "null"), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(String macdSeriesType1, StockSeriesType signalSeriesType, StockSeriesType histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
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
        } else {
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = histogramSeriesType;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null"), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(String macdSeriesType1, StockSeriesType signalSeriesType, String histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
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
        } else {
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = signalSeriesType;
            this.histogramSeriesType1 = histogramSeriesType1;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", wrapQuotes(macdSeriesType1), ((signalSeriesType != null) ? signalSeriesType.generateJs() : "null"), wrapQuotes(histogramSeriesType1), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(String macdSeriesType1, String signalSeriesType1, StockSeriesType histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType = histogramSeriesType;
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
        } else {
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = histogramSeriesType;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), ((histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null"), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
    public MACD macd(String macdSeriesType1, String signalSeriesType1, String histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
        if (jsBase == null) {
            this.macdSeriesType = null;
            this.macdSeriesType1 = null;
            
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType = null;
            this.signalSeriesType1 = null;
            
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType = null;
            this.histogramSeriesType1 = null;
            
            this.histogramSeriesType1 = histogramSeriesType1;
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
        } else {
            this.macdSeriesType1 = macdSeriesType1;
            this.signalSeriesType1 = signalSeriesType1;
            this.histogramSeriesType1 = histogramSeriesType1;
            this.mapping13 = mapping13;
            this.fastPeriod2 = fastPeriod2;
            this.slowPeriod2 = slowPeriod2;
            this.signalPeriod = signalPeriod;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", wrapQuotes(macdSeriesType1), wrapQuotes(signalSeriesType1), wrapQuotes(histogramSeriesType1), ((mapping13 != null) ? mapping13.generateJs() : "null"), fastPeriod2, slowPeriod2, signalPeriod));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s);", mapping.getJsBase()));
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
    private List<Plot> setMarkerPalette = new ArrayList<>();

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
        }
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setMarkerPalette1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkerPalette1() {
        if (!setMarkerPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setMarkerPalette2 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setMarkerPalette3 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkerPalette3() {
        if (!setMarkerPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<Plot> setMaxPointWidth = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
    public Plot setMaxPointWidth(Double maxPointWidth) {
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
            js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setMaxPointWidth1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPointLength;
    private String minPointLength1;
    private List<Plot> setMinPointLength = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
    public Plot setMinPointLength(Double minPointLength) {
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
            js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setMinPointLength1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setMinPointLength1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping14;
    private Double period10;
    private StockSeriesType seriesType18;
    private String seriesType19;
    private List<MMA> setMma = new ArrayList<>();

    /**
     * Creates MMA (Modified Moving Average) indicator on the plot.
     */
    public MMA mma(StockSeriesType seriesType18, TableMapping mapping14, Double period10) {
        if (jsBase == null) {
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
        } else {
            this.seriesType18 = seriesType18;
            this.mapping14 = mapping14;
            this.period10 = period10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %f)", ((seriesType18 != null) ? seriesType18.generateJs() : "null"), ((mapping14 != null) ? mapping14.generateJs() : "null"), period10));
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
    public MMA mma(String seriesType19, TableMapping mapping14, Double period10) {
        if (jsBase == null) {
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
        } else {
            this.seriesType19 = seriesType19;
            this.mapping14 = mapping14;
            this.period10 = period10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %f)", wrapQuotes(seriesType19), ((mapping14 != null) ? mapping14.generateJs() : "null"), period10));
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
    private List<Plot> setNoData = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".noData(%s)", wrapQuotes(noData)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNoData() {
        if (!setNoData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setNoData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesOHLC> setOhlc = new ArrayList<>();

    /**
     * Creates and returns a new OHLC series.
     */
    public StockSeriesOHLC ohlc(TableMapping mapping) {
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setOhlc" + ++variableIndex + " = " + jsBase + ".ohlc(%s);", mapping.getJsBase()));
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
    private List<Plot> setPalette = new ArrayList<>();

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
        }
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPalette1 = new ArrayList<>();

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
        }
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPalette2 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPalette3 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<Plot> setPointWidth = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
    public Plot setPointWidth(Double pointWidth) {
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
            js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPointWidth1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CurrentPriceIndicator> getPriceIndicator = new ArrayList<>();

    /**
     * Getter for the stock price indicator.
     */
    public CurrentPriceIndicator getPriceIndicator(Double index) {
        CurrentPriceIndicator item = new CurrentPriceIndicator(jsBase + ".priceIndicator(" + index + ")");
        getPriceIndicator.add(item);
        return item;
    }

    private String priceIndicator;
    private Boolean priceIndicator1;
    private List<Plot> setPriceIndicator = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".priceIndicator(%s)", wrapQuotes(priceIndicator)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPriceIndicator() {
        if (!setPriceIndicator.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPriceIndicator) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPriceIndicator1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".priceIndicator(%b)", priceIndicator1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPriceIndicator1() {
        if (!setPriceIndicator1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPriceIndicator1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private String priceIndicator2;
    private Boolean priceIndicator3;
    private List<Plot> setPriceIndicator2 = new ArrayList<>();

    /**
     * Setter for the stock price indicator settings by index.
     */
    public Plot setPriceIndicator(String priceIndicator2, Double index) {
        if (jsBase == null) {
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            this.priceIndicator2 = null;
            this.priceIndicator3 = null;
            
            this.priceIndicator2 = priceIndicator2;
            this.index = index;
        } else {
            this.priceIndicator2 = priceIndicator2;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".priceIndicator(%s, %f)", wrapQuotes(priceIndicator2), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".priceIndicator(%s, %f)", wrapQuotes(priceIndicator2), index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPriceIndicator2() {
        if (!setPriceIndicator2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPriceIndicator2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setPriceIndicator3 = new ArrayList<>();

    /**
     * Setter for the stock price indicator settings by index.
     */
    public Plot setPriceIndicator(Boolean priceIndicator3, Double index) {
        if (jsBase == null) {
            this.priceIndicator = null;
            this.priceIndicator1 = null;
            this.priceIndicator2 = null;
            this.priceIndicator3 = null;
            
            this.priceIndicator3 = priceIndicator3;
            this.index = index;
        } else {
            this.priceIndicator3 = priceIndicator3;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".priceIndicator(%b, %f)", priceIndicator3, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".priceIndicator(%b, %f)", priceIndicator3, index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPriceIndicator3() {
        if (!setPriceIndicator3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setPriceIndicator3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesRangeArea> setRangeArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Area series.
     */
    public StockSeriesRangeArea rangeArea(TableMapping mapping) {
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setRangeArea" + ++variableIndex + " = " + jsBase + ".rangeArea(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setRangeSplineArea" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setRangeStepArea" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s);", mapping.getJsBase()));
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

    private Double id;
    private String id1;
    private List<Plot> setRemoveSeries = new ArrayList<>();

    /**
     * Removes one of series from chart by its id.
     */
    public Plot removeSeries(Double id) {
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
            js.append(String.format(Locale.US, ".removeSeries(%f)", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%f)", id));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemoveSeries() {
        if (!setRemoveSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setRemoveSeries1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemoveSeries1() {
        if (!setRemoveSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<Plot> setRemoveSeriesAt = new ArrayList<>();

    /**
     * Removes one of series from chart by its index.
     */
    public Plot removeSeriesAt(Double index1) {
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
            js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setRemoveSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping15;
    private Double period11;
    private StockSeriesType seriesType20;
    private String seriesType21;
    private List<RoC> setRoc = new ArrayList<>();

    /**
     * Creates RoC (Rate of Change) indicator on the plot.
     */
    public RoC roc(StockSeriesType seriesType20, TableMapping mapping15, Double period11) {
        if (jsBase == null) {
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
        } else {
            this.seriesType20 = seriesType20;
            this.mapping15 = mapping15;
            this.period11 = period11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %f)", ((seriesType20 != null) ? seriesType20.generateJs() : "null"), ((mapping15 != null) ? mapping15.generateJs() : "null"), period11));
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
    public RoC roc(String seriesType21, TableMapping mapping15, Double period11) {
        if (jsBase == null) {
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
        } else {
            this.seriesType21 = seriesType21;
            this.mapping15 = mapping15;
            this.period11 = period11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %f)", wrapQuotes(seriesType21), ((mapping15 != null) ? mapping15.generateJs() : "null"), period11));
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
    private Double period12;
    private StockSeriesType seriesType22;
    private String seriesType23;
    private List<RSI> setRsi = new ArrayList<>();

    /**
     * Creates RSI (Relative Strength Index) indicator on the plot.
     */
    public RSI rsi(StockSeriesType seriesType22, TableMapping mapping16, Double period12) {
        if (jsBase == null) {
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
        } else {
            this.seriesType22 = seriesType22;
            this.mapping16 = mapping16;
            this.period12 = period12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f)", ((seriesType22 != null) ? seriesType22.generateJs() : "null"), ((mapping16 != null) ? mapping16.generateJs() : "null"), period12));
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
    public RSI rsi(String seriesType23, TableMapping mapping16, Double period12) {
        if (jsBase == null) {
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
        } else {
            this.seriesType23 = seriesType23;
            this.mapping16 = mapping16;
            this.period12 = period12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f)", wrapQuotes(seriesType23), ((mapping16 != null) ? mapping16.generateJs() : "null"), period12));
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
    private Double period13;
    private StockSeriesType seriesType24;
    private String seriesType25;
    private List<SMA> setSma = new ArrayList<>();

    /**
     * Creates SMA (Simple Moving Average) indicator on the plot.
     */
    public SMA sma(StockSeriesType seriesType24, TableMapping mapping17, Double period13) {
        if (jsBase == null) {
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
        } else {
            this.seriesType24 = seriesType24;
            this.mapping17 = mapping17;
            this.period13 = period13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %f)", ((seriesType24 != null) ? seriesType24.generateJs() : "null"), ((mapping17 != null) ? mapping17.generateJs() : "null"), period13));
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
    public SMA sma(String seriesType25, TableMapping mapping17, Double period13) {
        if (jsBase == null) {
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
        } else {
            this.seriesType25 = seriesType25;
            this.mapping17 = mapping17;
            this.period13 = period13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %f)", wrapQuotes(seriesType25), ((mapping17 != null) ? mapping17.generateJs() : "null"), period13));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setSpline" + ++variableIndex + " = " + jsBase + ".spline(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setSplineArea" + ++variableIndex + " = " + jsBase + ".splineArea(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setStepArea" + ++variableIndex + " = " + jsBase + ".stepArea(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setStepLine" + ++variableIndex + " = " + jsBase + ".stepLine(%s);", mapping.getJsBase()));
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
        if (jsBase == null) {
        } else {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(mapping.generateJs());
            js.append(String.format(Locale.US, "var setStick" + ++variableIndex + " = " + jsBase + ".stick(%s);", mapping.getJsBase()));
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
    private Double kPeriod1;
    private Double kMAPeriod1;
    private Double dPeriod1;
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
    public Stochastic stochastic(MovingAverageType kMAType2, MovingAverageType dMAType2, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, MovingAverageType dMAType2, StockSeriesType kSeriesType2, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, MovingAverageType dMAType2, String kSeriesType3, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, MovingAverageType dMAType2, String kSeriesType3, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, String dMAType3, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, String dMAType3, StockSeriesType kSeriesType2, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, String dMAType3, String kSeriesType3, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(MovingAverageType kMAType2, String dMAType3, String kSeriesType3, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType2 = kMAType2;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", ((kMAType2 != null) ? kMAType2.generateJs() : "null"), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, MovingAverageType dMAType2, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, MovingAverageType dMAType2, StockSeriesType kSeriesType2, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, MovingAverageType dMAType2, String kSeriesType3, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, MovingAverageType dMAType2, String kSeriesType3, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType2 = dMAType2;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), ((dMAType2 != null) ? dMAType2.generateJs() : "null"), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, String dMAType3, StockSeriesType kSeriesType2, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, String dMAType3, StockSeriesType kSeriesType2, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType2 = kSeriesType2;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), wrapQuotes(dMAType3), ((kSeriesType2 != null) ? kSeriesType2.generateJs() : "null"), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, String dMAType3, String kSeriesType3, StockSeriesType dSeriesType2, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType2 = dSeriesType2;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), ((dSeriesType2 != null) ? dSeriesType2.generateJs() : "null"), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    public Stochastic stochastic(String kMAType3, String dMAType3, String kSeriesType3, String dSeriesType3, TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1) {
        if (jsBase == null) {
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
        } else {
            this.kMAType3 = kMAType3;
            this.dMAType3 = dMAType3;
            this.kSeriesType3 = kSeriesType3;
            this.dSeriesType3 = dSeriesType3;
            this.mapping18 = mapping18;
            this.kPeriod1 = kPeriod1;
            this.kMAPeriod1 = kMAPeriod1;
            this.dPeriod1 = dPeriod1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", wrapQuotes(kMAType3), wrapQuotes(dMAType3), wrapQuotes(kSeriesType3), wrapQuotes(dSeriesType3), ((mapping18 != null) ? mapping18.generateJs() : "null"), kPeriod1, kMAPeriod1, dPeriod1));
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
    private List<Plot> setXAxis = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXAxis() {
        if (!setXAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setXAxis1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXAxis1() {
        if (!setXAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsStock> getXGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by X-scale.
     */
    public GridsStock getXGrid(Double index) {
        GridsStock item = new GridsStock(jsBase + ".xGrid(" + index + ")");
        getXGrid.add(item);
        return item;
    }

    private String xGrid;
    private Boolean xGrid1;
    private List<Plot> setXGrid = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXGrid() {
        if (!setXGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setXGrid1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b)", xGrid1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXGrid1() {
        if (!setXGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private String xGrid2;
    private Boolean xGrid3;
    private List<Plot> setXGrid2 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXGrid(String xGrid2, Double index2) {
        if (jsBase == null) {
            this.xGrid = null;
            this.xGrid1 = null;
            this.xGrid2 = null;
            this.xGrid3 = null;
            
            this.xGrid2 = xGrid2;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.xGrid2 = xGrid2;
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".xGrid(%s, %f)", wrapQuotes(xGrid2), index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", wrapQuotes(xGrid2), index2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXGrid2() {
        if (!setXGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setXGrid3 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXGrid(Boolean xGrid3, Double index2) {
        if (jsBase == null) {
            this.xGrid = null;
            this.xGrid1 = null;
            this.xGrid2 = null;
            this.xGrid3 = null;
            
            this.xGrid3 = xGrid3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.xGrid3 = xGrid3;
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXGrid3() {
        if (!setXGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsStock> getXMinorGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by X-scale.
     */
    public GridsStock getXMinorGrid(Double index) {
        GridsStock item = new GridsStock(jsBase + ".xMinorGrid(" + index + ")");
        getXMinorGrid.add(item);
        return item;
    }

    private String xMinorGrid;
    private Boolean xMinorGrid1;
    private List<Plot> setXMinorGrid = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorGrid() {
        if (!setXMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setXMinorGrid1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorGrid1() {
        if (!setXMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrValue;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;
    private List<Plot> setXMinorGrid2 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXMinorGrid(String xMinorGrid2, Double indexOrValue) {
        if (jsBase == null) {
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            this.xMinorGrid2 = null;
            this.xMinorGrid3 = null;
            
            this.xMinorGrid2 = xMinorGrid2;
            this.indexOrValue = indexOrValue;
        } else {
            this.xMinorGrid2 = xMinorGrid2;
            this.indexOrValue = indexOrValue;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", wrapQuotes(xMinorGrid2), indexOrValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", wrapQuotes(xMinorGrid2), indexOrValue));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorGrid2() {
        if (!setXMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setXMinorGrid3 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setXMinorGrid(Boolean xMinorGrid3, Double indexOrValue) {
        if (jsBase == null) {
            this.xMinorGrid = null;
            this.xMinorGrid1 = null;
            this.xMinorGrid2 = null;
            this.xMinorGrid3 = null;
            
            this.xMinorGrid3 = xMinorGrid3;
            this.indexOrValue = indexOrValue;
        } else {
            this.xMinorGrid3 = xMinorGrid3;
            this.indexOrValue = indexOrValue;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, indexOrValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, indexOrValue));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetXMinorGrid3() {
        if (!setXMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setXMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreAxesLinear> getYAxis = new ArrayList<>();

    /**
     * Getter for the current plot Y-axis.
     */
    public CoreAxesLinear getYAxis(Double index) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis(" + index + ")");
        getYAxis.add(item);
        return item;
    }

    private String yAxis;
    private Boolean yAxis1;
    private List<Plot> setYAxis = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYAxis() {
        if (!setYAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYAxis1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b)", yAxis1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYAxis1() {
        if (!setYAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private String yAxis2;
    private Boolean yAxis3;
    private List<Plot> setYAxis2 = new ArrayList<>();

    /**
     * Setter for the Y-axis by index.
     */
    public Plot setYAxis(String yAxis2, Double index3) {
        if (jsBase == null) {
            this.yAxis = null;
            this.yAxis1 = null;
            this.yAxis2 = null;
            this.yAxis3 = null;
            
            this.yAxis2 = yAxis2;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
        } else {
            this.yAxis2 = yAxis2;
            this.index3 = index3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYAxis2() {
        if (!setYAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYAxis3 = new ArrayList<>();

    /**
     * Setter for the Y-axis by index.
     */
    public Plot setYAxis(Boolean yAxis3, Double index3) {
        if (jsBase == null) {
            this.yAxis = null;
            this.yAxis1 = null;
            this.yAxis2 = null;
            this.yAxis3 = null;
            
            this.yAxis3 = yAxis3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
        } else {
            this.yAxis3 = yAxis3;
            this.index3 = index3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYAxis3() {
        if (!setYAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsStock> getYGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by Y-scale.
     */
    public GridsStock getYGrid(Double index) {
        GridsStock item = new GridsStock(jsBase + ".yGrid(" + index + ")");
        getYGrid.add(item);
        return item;
    }

    private String yGrid;
    private Boolean yGrid1;
    private List<Plot> setYGrid = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYGrid() {
        if (!setYGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYGrid1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b)", yGrid1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYGrid1() {
        if (!setYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index4;
    private String yGrid2;
    private Boolean yGrid3;
    private List<Plot> setYGrid2 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYGrid(String yGrid2, Double index4) {
        if (jsBase == null) {
            this.yGrid = null;
            this.yGrid1 = null;
            this.yGrid2 = null;
            this.yGrid3 = null;
            
            this.yGrid2 = yGrid2;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
        } else {
            this.yGrid2 = yGrid2;
            this.index4 = index4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yGrid(%s, %f)", wrapQuotes(yGrid2), index4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", wrapQuotes(yGrid2), index4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYGrid2() {
        if (!setYGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYGrid3 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYGrid(Boolean yGrid3, Double index4) {
        if (jsBase == null) {
            this.yGrid = null;
            this.yGrid1 = null;
            this.yGrid2 = null;
            this.yGrid3 = null;
            
            this.yGrid3 = yGrid3;
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
        } else {
            this.yGrid3 = yGrid3;
            this.index4 = index4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYGrid3() {
        if (!setYGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsStock> getYMinorGrid = new ArrayList<>();

    /**
     * Getter for the plot grid by Y-scale.
     */
    public GridsStock getYMinorGrid(Double index) {
        GridsStock item = new GridsStock(jsBase + ".yMinorGrid(" + index + ")");
        getYMinorGrid.add(item);
        return item;
    }

    private String yMinorGrid;
    private Boolean yMinorGrid1;
    private List<Plot> setYMinorGrid = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorGrid() {
        if (!setYMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYMinorGrid1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorGrid1() {
        if (!setYMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrValue1;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;
    private List<Plot> setYMinorGrid2 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYMinorGrid(String yMinorGrid2, Double indexOrValue1) {
        if (jsBase == null) {
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            this.yMinorGrid2 = null;
            this.yMinorGrid3 = null;
            
            this.yMinorGrid2 = yMinorGrid2;
            this.indexOrValue = null;
            this.indexOrValue1 = null;
            
            this.indexOrValue1 = indexOrValue1;
        } else {
            this.yMinorGrid2 = yMinorGrid2;
            this.indexOrValue1 = indexOrValue1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", wrapQuotes(yMinorGrid2), indexOrValue1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", wrapQuotes(yMinorGrid2), indexOrValue1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorGrid2() {
        if (!setYMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYMinorGrid3 = new ArrayList<>();

    /**
     * Setter for the plot grid by index.
     */
    public Plot setYMinorGrid(Boolean yMinorGrid3, Double indexOrValue1) {
        if (jsBase == null) {
            this.yMinorGrid = null;
            this.yMinorGrid1 = null;
            this.yMinorGrid2 = null;
            this.yMinorGrid3 = null;
            
            this.yMinorGrid3 = yMinorGrid3;
            this.indexOrValue = null;
            this.indexOrValue1 = null;
            
            this.indexOrValue1 = indexOrValue1;
        } else {
            this.yMinorGrid3 = yMinorGrid3;
            this.indexOrValue1 = indexOrValue1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, indexOrValue1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, indexOrValue1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYMinorGrid3() {
        if (!setYMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Plot> setYScale = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale != null) ? yScale.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYScale1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Plot> setYScale2 = new ArrayList<>();

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
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
        js.append(generateJSsetAnnotations());
        js.append(generateJSsetArea());
        js.append(generateJSsetAroon());
        js.append(generateJSsetAroon1());
        js.append(generateJSsetAroon2());
        js.append(generateJSsetAroon3());
        js.append(generateJSsetAtr());
        js.append(generateJSsetAtr1());
        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
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
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetDefaultSeriesType());
        js.append(generateJSsetDefaultSeriesType1());
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
        js.append(generateJSsetLegend());
        js.append(generateJSsetLegend1());
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
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMarkerPalette3());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetMma());
        js.append(generateJSsetMma1());
        js.append(generateJSsetNoData());
        js.append(generateJSsetOhlc());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetPriceIndicator());
        js.append(generateJSsetPriceIndicator1());
        js.append(generateJSsetPriceIndicator2());
        js.append(generateJSsetPriceIndicator3());
        js.append(generateJSsetRangeArea());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeSplineArea());
        js.append(generateJSsetRangeStepArea());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
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
        js.append(generateJSsetXAxis());
        js.append(generateJSsetXAxis1());
        js.append(generateJSsetXGrid());
        js.append(generateJSsetXGrid1());
        js.append(generateJSsetXGrid2());
        js.append(generateJSsetXGrid3());
        js.append(generateJSsetXMinorGrid());
        js.append(generateJSsetXMinorGrid1());
        js.append(generateJSsetXMinorGrid2());
        js.append(generateJSsetXMinorGrid3());
        js.append(generateJSsetYAxis());
        js.append(generateJSsetYAxis1());
        js.append(generateJSsetYAxis2());
        js.append(generateJSsetYAxis3());
        js.append(generateJSsetYGrid());
        js.append(generateJSsetYGrid1());
        js.append(generateJSsetYGrid2());
        js.append(generateJSsetYGrid3());
        js.append(generateJSsetYMinorGrid());
        js.append(generateJSsetYMinorGrid1());
        js.append(generateJSsetYMinorGrid2());
        js.append(generateJSsetYMinorGrid3());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}