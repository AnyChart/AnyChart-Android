package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock scroller class. Adds series drawing to UI Scroller.
 */
public class StockScroller extends UiScroller {

    public StockScroller() {
        js.setLength(0);
        js.append("var stockScroller").append(++variableIndex).append(" = anychart.core.stock.scroller();");
        jsBase = "stockScroller" + variableIndex;
    }

    protected StockScroller(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockScroller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(View var_args) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
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


    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(Set var_args1) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.var_args1 = var_args1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(var_args1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addSeries(%s);",  ((var_args1 != null) ? var_args1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s);", ((var_args1 != null) ? var_args1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(String[] var_args2) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.var_args2 = var_args2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);", arrayToStringWrapQuotes(var_args2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s);", arrayToStringWrapQuotes(var_args2)));
                js.setLength(0);
            }
        }
    }

    private TableMapping mapping;
    private StockSeriesType seriesType;
    private String seriesType1;
    private List<ADL> setAdl = new ArrayList<>();

    /**
     * Creates an Accumulation Distribution Line indicator on the scroller.
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
     * Creates an Accumulation Distribution Line indicator on the scroller.
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
     * Creates AMA (Adaptive Moving Average) indicator on the scroller.
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
     * Creates AMA (Adaptive Moving Average) indicator on the scroller.
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

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;
    private String csvSettings;
    private List<ScrollerseriesArea> setArea = new ArrayList<>();

    /**
     * Creates and returns a new Area series.
     */
    public ScrollerseriesArea area(TableMapping data, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s, %s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScrollerseriesArea item = new ScrollerseriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesArea> setArea1 = new ArrayList<>();

    /**
     * Creates and returns a new Area series.
     */
    public ScrollerseriesArea area(DataTable data1, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, "var setArea1" + ++variableIndex + " = " + jsBase + ".area(%s, %s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScrollerseriesArea item = new ScrollerseriesArea("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesArea item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesArea> setArea2 = new ArrayList<>();

    /**
     * Creates and returns a new Area series.
     */
    public ScrollerseriesArea area(String data2, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setArea2" + ++variableIndex + " = " + jsBase + ".area(%s, %s, %s);", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        ScrollerseriesArea item = new ScrollerseriesArea("setArea2" + variableIndex);
        setArea2.add(item);
        return item;
    }
    private String generateJSsetArea2() {
        if (!setArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesArea item : setArea2) {
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
     * Creates Aroon indicator on the scroller.
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
     * Creates Aroon indicator on the scroller.
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
     * Creates Aroon indicator on the scroller.
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
     * Creates Aroon indicator on the scroller.
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
     * Creates an Average True Range indicator on the chart.
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
     * Creates an Average True Range indicator on the chart.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates Bollinger Bands indicator on the scroller.
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
     * Creates %B indicator on the scroller.
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
     * Creates %B indicator on the scroller.
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
     * Creates Bollinger Bands Width indicator on the scroller.
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
     * Creates Bollinger Bands Width indicator on the scroller.
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

    private TableMapping data4;
    private DataTable data5;
    private String data6;
    private String data7;
    private String mappingSettings1;
    private String csvSettings1;
    private List<ScrollerseriesCandlestick> setCandlestick = new ArrayList<>();

    /**
     * Creates and returns a new Candlestick series.
     */
    public ScrollerseriesCandlestick candlestick(TableMapping data4, String mappingSettings1, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            
            this.data4 = data4;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data4 = data4;
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data4.generateJs());
            js.append(String.format(Locale.US, "var setCandlestick" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s, %s);", ((data4 != null) ? data4.getJsBase() : "null"), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", ((data4 != null) ? data4.getJsBase() : "null"), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScrollerseriesCandlestick item = new ScrollerseriesCandlestick("setCandlestick" + variableIndex);
        setCandlestick.add(item);
        return item;
    }
    private String generateJSsetCandlestick() {
        if (!setCandlestick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setCandlestick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setCandlestick1 = new ArrayList<>();

    /**
     * Creates and returns a new Candlestick series.
     */
    public ScrollerseriesCandlestick candlestick(DataTable data5, String mappingSettings1, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            
            this.data5 = data5;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data5 = data5;
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data5.generateJs());
            js.append(String.format(Locale.US, "var setCandlestick1" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s, %s);", ((data5 != null) ? data5.getJsBase() : "null"), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", ((data5 != null) ? data5.getJsBase() : "null"), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScrollerseriesCandlestick item = new ScrollerseriesCandlestick("setCandlestick1" + variableIndex);
        setCandlestick1.add(item);
        return item;
    }
    private String generateJSsetCandlestick1() {
        if (!setCandlestick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setCandlestick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesCandlestick> setCandlestick2 = new ArrayList<>();

    /**
     * Creates and returns a new Candlestick series.
     */
    public ScrollerseriesCandlestick candlestick(String data6, String mappingSettings1, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            
            this.data6 = data6;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data6 = data6;
            this.mappingSettings1 = mappingSettings1;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCandlestick2" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s, %s);", wrapQuotes(data6), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", wrapQuotes(data6), wrapQuotes(mappingSettings1), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScrollerseriesCandlestick item = new ScrollerseriesCandlestick("setCandlestick2" + variableIndex);
        setCandlestick2.add(item);
        return item;
    }
    private String generateJSsetCandlestick2() {
        if (!setCandlestick2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesCandlestick item : setCandlestick2) {
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
     * Creates a Commodity Channel Index indicator on the scroller.
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
     * Creates a Commodity Channel Index indicator on the scroller.
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
    private String maType;
    private StockSeriesType seriesType12;
    private String seriesType13;
    private List<CHO> setCho = new ArrayList<>();

    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, String maType, StockSeriesType seriesType12) {
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
            js.append(String.format(Locale.US, "var setCho" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType), ((seriesType12 != null) ? seriesType12.generateJs() : "null")));
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
    public CHO cho(TableMapping mapping8, Number fastPeriod1, Number slowPeriod1, String maType, String seriesType13) {
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
            js.append(String.format(Locale.US, "var setCho1" + ++variableIndex + " = " + jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType), wrapQuotes(seriesType13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s);", ((mapping8 != null) ? mapping8.getJsBase() : "null"), fastPeriod1, slowPeriod1, wrapQuotes(maType), wrapQuotes(seriesType13)));
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

    private TableMapping data8;
    private DataTable data9;
    private String data10;
    private String data11;
    private String mappingSettings2;
    private String csvSettings2;
    private List<ScrollerseriesColumn> setColumn = new ArrayList<>();

    /**
     * Creates and returns a new column series.
     */
    public ScrollerseriesColumn column(TableMapping data8, String mappingSettings2, String csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            
            this.data8 = data8;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data8 = data8;
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data8.generateJs());
            js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s, %s, %s);", ((data8 != null) ? data8.getJsBase() : "null"), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", ((data8 != null) ? data8.getJsBase() : "null"), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
                js.setLength(0);
            }
        }
        ScrollerseriesColumn item = new ScrollerseriesColumn("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesColumn item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesColumn> setColumn1 = new ArrayList<>();

    /**
     * Creates and returns a new column series.
     */
    public ScrollerseriesColumn column(DataTable data9, String mappingSettings2, String csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            
            this.data9 = data9;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data9 = data9;
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data9.generateJs());
            js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s, %s, %s);", ((data9 != null) ? data9.getJsBase() : "null"), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", ((data9 != null) ? data9.getJsBase() : "null"), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
                js.setLength(0);
            }
        }
        ScrollerseriesColumn item = new ScrollerseriesColumn("setColumn1" + variableIndex);
        setColumn1.add(item);
        return item;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesColumn item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesColumn> setColumn2 = new ArrayList<>();

    /**
     * Creates and returns a new column series.
     */
    public ScrollerseriesColumn column(String data10, String mappingSettings2, String csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            
            this.data10 = data10;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data10 = data10;
            this.mappingSettings2 = mappingSettings2;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setColumn2" + ++variableIndex + " = " + jsBase + ".column(%s, %s, %s);", wrapQuotes(data10), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", wrapQuotes(data10), wrapQuotes(mappingSettings2), wrapQuotes(csvSettings2)));
                js.setLength(0);
            }
        }
        ScrollerseriesColumn item = new ScrollerseriesColumn("setColumn2" + variableIndex);
        setColumn2.add(item);
        return item;
    }
    private String generateJSsetColumn2() {
        if (!setColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesColumn item : setColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the stock scroller default series type.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public StockScroller setDefaultSeriesType(StockSeriesType defaultSeriesType) {
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
     * Setter for the stock scroller default series type.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public StockScroller setDefaultSeriesType(String defaultSeriesType1) {
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
     * Creates EMA (Exponential Moving Average) indicator on the scroller.
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
     * Creates EMA (Exponential Moving Average) indicator on the scroller.
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

    private List<ScrollerseriesBase> getGetSeries = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public ScrollerseriesBase getGetSeries(Number id) {
        ScrollerseriesBase item = new ScrollerseriesBase(jsBase + ".getSeries(" + id + ")");
        getGetSeries.add(item);
        return item;
    }

    private List<ScrollerseriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public ScrollerseriesBase getGetSeries(String id) {
        ScrollerseriesBase item = new ScrollerseriesBase(jsBase + ".getSeries(" + wrapQuotes(id) + ")");
        getGetSeries1.add(item);
        return item;
    }

    private List<ScrollerseriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Gets the series by its index.
     */
    public ScrollerseriesBase getGetSeriesAt(Number index) {
        ScrollerseriesBase item = new ScrollerseriesBase(jsBase + ".getSeriesAt(" + index + ")");
        getGetSeriesAt.add(item);
        return item;
    }

    private HatchFills getHatchFillPalette;

    /**
     * Getter for hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    /**
     * Hatch fill palette settings.
     */
    public StockScroller hatchFillPalette(HatchFillType[] hatchFillPalette) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette = hatchFillPalette;
        } else {
            this.hatchFillPalette = hatchFillPalette;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Hatch fill palette settings.
     */
    public StockScroller hatchFillPalette(String hatchFillPalette1) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette1 = hatchFillPalette1;
        } else {
            this.hatchFillPalette1 = hatchFillPalette1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", wrapQuotes(hatchFillPalette1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Hatch fill palette settings.
     */
    public StockScroller hatchFillPalette(HatchFills hatchFillPalette2) {
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
        return this;
    }

    private TableMapping data12;
    private DataTable data13;
    private String data14;
    private String data15;
    private String mappingSettings3;
    private String csvSettings3;
    private List<ScrollerseriesHilo> setHilo = new ArrayList<>();

    /**
     * Creates and returns a new HiLo series.
     */
    public ScrollerseriesHilo hilo(TableMapping data12, String mappingSettings3, String csvSettings3) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            
            this.data12 = data12;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            
            this.csvSettings3 = csvSettings3;
        } else {
            this.data12 = data12;
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings3 = csvSettings3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data12.generateJs());
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s, %s);", ((data12 != null) ? data12.getJsBase() : "null"), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", ((data12 != null) ? data12.getJsBase() : "null"), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
                js.setLength(0);
            }
        }
        ScrollerseriesHilo item = new ScrollerseriesHilo("setHilo" + variableIndex);
        setHilo.add(item);
        return item;
    }
    private String generateJSsetHilo() {
        if (!setHilo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesHilo item : setHilo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesHilo> setHilo1 = new ArrayList<>();

    /**
     * Creates and returns a new HiLo series.
     */
    public ScrollerseriesHilo hilo(DataTable data13, String mappingSettings3, String csvSettings3) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            
            this.data13 = data13;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            
            this.csvSettings3 = csvSettings3;
        } else {
            this.data13 = data13;
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings3 = csvSettings3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data13.generateJs());
            js.append(String.format(Locale.US, "var setHilo1" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s, %s);", ((data13 != null) ? data13.getJsBase() : "null"), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", ((data13 != null) ? data13.getJsBase() : "null"), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
                js.setLength(0);
            }
        }
        ScrollerseriesHilo item = new ScrollerseriesHilo("setHilo1" + variableIndex);
        setHilo1.add(item);
        return item;
    }
    private String generateJSsetHilo1() {
        if (!setHilo1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesHilo item : setHilo1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesHilo> setHilo2 = new ArrayList<>();

    /**
     * Creates and returns a new HiLo series.
     */
    public ScrollerseriesHilo hilo(String data14, String mappingSettings3, String csvSettings3) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            
            this.data14 = data14;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            
            this.csvSettings3 = csvSettings3;
        } else {
            this.data14 = data14;
            this.mappingSettings3 = mappingSettings3;
            this.csvSettings3 = csvSettings3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHilo2" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s, %s);", wrapQuotes(data14), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", wrapQuotes(data14), wrapQuotes(mappingSettings3), wrapQuotes(csvSettings3)));
                js.setLength(0);
            }
        }
        ScrollerseriesHilo item = new ScrollerseriesHilo("setHilo2" + variableIndex);
        setHilo2.add(item);
        return item;
    }
    private String generateJSsetHilo2() {
        if (!setHilo2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesHilo item : setHilo2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data16;
    private DataTable data17;
    private String data18;
    private String data19;
    private String mappingSettings4;
    private String csvSettings4;
    private List<ScrollerseriesJumpLine> setJumpLine = new ArrayList<>();

    /**
     * Creates and returns a new Jump Line series.
     */
    public ScrollerseriesJumpLine jumpLine(TableMapping data16, String mappingSettings4, String csvSettings4) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            
            this.data16 = data16;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            
            this.csvSettings4 = csvSettings4;
        } else {
            this.data16 = data16;
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings4 = csvSettings4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data16.generateJs());
            js.append(String.format(Locale.US, "var setJumpLine" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s, %s);", ((data16 != null) ? data16.getJsBase() : "null"), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", ((data16 != null) ? data16.getJsBase() : "null"), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
                js.setLength(0);
            }
        }
        ScrollerseriesJumpLine item = new ScrollerseriesJumpLine("setJumpLine" + variableIndex);
        setJumpLine.add(item);
        return item;
    }
    private String generateJSsetJumpLine() {
        if (!setJumpLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesJumpLine item : setJumpLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesJumpLine> setJumpLine1 = new ArrayList<>();

    /**
     * Creates and returns a new Jump Line series.
     */
    public ScrollerseriesJumpLine jumpLine(DataTable data17, String mappingSettings4, String csvSettings4) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            
            this.data17 = data17;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            
            this.csvSettings4 = csvSettings4;
        } else {
            this.data17 = data17;
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings4 = csvSettings4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data17.generateJs());
            js.append(String.format(Locale.US, "var setJumpLine1" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s, %s);", ((data17 != null) ? data17.getJsBase() : "null"), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", ((data17 != null) ? data17.getJsBase() : "null"), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
                js.setLength(0);
            }
        }
        ScrollerseriesJumpLine item = new ScrollerseriesJumpLine("setJumpLine1" + variableIndex);
        setJumpLine1.add(item);
        return item;
    }
    private String generateJSsetJumpLine1() {
        if (!setJumpLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesJumpLine item : setJumpLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesJumpLine> setJumpLine2 = new ArrayList<>();

    /**
     * Creates and returns a new Jump Line series.
     */
    public ScrollerseriesJumpLine jumpLine(String data18, String mappingSettings4, String csvSettings4) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            
            this.data18 = data18;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            
            this.csvSettings4 = csvSettings4;
        } else {
            this.data18 = data18;
            this.mappingSettings4 = mappingSettings4;
            this.csvSettings4 = csvSettings4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setJumpLine2" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s, %s);", wrapQuotes(data18), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", wrapQuotes(data18), wrapQuotes(mappingSettings4), wrapQuotes(csvSettings4)));
                js.setLength(0);
            }
        }
        ScrollerseriesJumpLine item = new ScrollerseriesJumpLine("setJumpLine2" + variableIndex);
        setJumpLine2.add(item);
        return item;
    }
    private String generateJSsetJumpLine2() {
        if (!setJumpLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesJumpLine item : setJumpLine2) {
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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
     * Creates a KDJ indicator on the scroller.
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

    private TableMapping data20;
    private DataTable data21;
    private String data22;
    private String data23;
    private String mappingSettings5;
    private String csvSettings5;
    private List<ScrollerseriesLine> setLine = new ArrayList<>();

    /**
     * Creates and returns a new line series.
     */
    public ScrollerseriesLine line(TableMapping data20, String mappingSettings5, String csvSettings5) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            
            this.data20 = data20;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            
            this.csvSettings5 = csvSettings5;
        } else {
            this.data20 = data20;
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings5 = csvSettings5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data20.generateJs());
            js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s, %s);", ((data20 != null) ? data20.getJsBase() : "null"), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", ((data20 != null) ? data20.getJsBase() : "null"), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
                js.setLength(0);
            }
        }
        ScrollerseriesLine item = new ScrollerseriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesLine> setLine1 = new ArrayList<>();

    /**
     * Creates and returns a new line series.
     */
    public ScrollerseriesLine line(DataTable data21, String mappingSettings5, String csvSettings5) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            
            this.data21 = data21;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            
            this.csvSettings5 = csvSettings5;
        } else {
            this.data21 = data21;
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings5 = csvSettings5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data21.generateJs());
            js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s, %s);", ((data21 != null) ? data21.getJsBase() : "null"), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", ((data21 != null) ? data21.getJsBase() : "null"), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
                js.setLength(0);
            }
        }
        ScrollerseriesLine item = new ScrollerseriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesLine> setLine2 = new ArrayList<>();

    /**
     * Creates and returns a new line series.
     */
    public ScrollerseriesLine line(String data22, String mappingSettings5, String csvSettings5) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            
            this.data22 = data22;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            
            this.csvSettings5 = csvSettings5;
        } else {
            this.data22 = data22;
            this.mappingSettings5 = mappingSettings5;
            this.csvSettings5 = csvSettings5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s, %s);", wrapQuotes(data22), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", wrapQuotes(data22), wrapQuotes(mappingSettings5), wrapQuotes(csvSettings5)));
                js.setLength(0);
            }
        }
        ScrollerseriesLine item = new ScrollerseriesLine("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesLine item : setLine2) {
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
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

    private TableMapping data24;
    private DataTable data25;
    private String data26;
    private String data27;
    private String mappingSettings6;
    private String csvSettings6;
    private List<ScrollerseriesMarker> setMarker = new ArrayList<>();

    /**
     * Creates and returns a new Marker series.
     */
    public ScrollerseriesMarker marker(TableMapping data24, String mappingSettings6, String csvSettings6) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            
            this.data24 = data24;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            
            this.csvSettings6 = csvSettings6;
        } else {
            this.data24 = data24;
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings6 = csvSettings6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data24.generateJs());
            js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s, %s);", ((data24 != null) ? data24.getJsBase() : "null"), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", ((data24 != null) ? data24.getJsBase() : "null"), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
                js.setLength(0);
            }
        }
        ScrollerseriesMarker item = new ScrollerseriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesMarker> setMarker1 = new ArrayList<>();

    /**
     * Creates and returns a new Marker series.
     */
    public ScrollerseriesMarker marker(DataTable data25, String mappingSettings6, String csvSettings6) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            
            this.data25 = data25;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            
            this.csvSettings6 = csvSettings6;
        } else {
            this.data25 = data25;
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings6 = csvSettings6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data25.generateJs());
            js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s, %s);", ((data25 != null) ? data25.getJsBase() : "null"), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", ((data25 != null) ? data25.getJsBase() : "null"), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
                js.setLength(0);
            }
        }
        ScrollerseriesMarker item = new ScrollerseriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesMarker> setMarker2 = new ArrayList<>();

    /**
     * Creates and returns a new Marker series.
     */
    public ScrollerseriesMarker marker(String data26, String mappingSettings6, String csvSettings6) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            
            this.data26 = data26;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            
            this.csvSettings6 = csvSettings6;
        } else {
            this.data26 = data26;
            this.mappingSettings6 = mappingSettings6;
            this.csvSettings6 = csvSettings6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s, %s);", wrapQuotes(data26), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", wrapQuotes(data26), wrapQuotes(mappingSettings6), wrapQuotes(csvSettings6)));
                js.setLength(0);
            }
        }
        ScrollerseriesMarker item = new ScrollerseriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mapping14;
    private Number period10;
    private StockSeriesType seriesType18;
    private String seriesType19;
    private List<MMA> setMma = new ArrayList<>();

    /**
     * Creates MMA (Modified Moving Average) indicator on the scroller.
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
     * Creates MMA (Modified Moving Average) indicator on the scroller.
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

    private TableMapping data28;
    private DataTable data29;
    private String data30;
    private String data31;
    private String mappingSettings7;
    private String csvSettings7;
    private List<ScrollerseriesOHLC> setOhlc = new ArrayList<>();

    /**
     * Creates and returns a new OHLC series.
     */
    public ScrollerseriesOHLC ohlc(TableMapping data28, String mappingSettings7, String csvSettings7) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            
            this.data28 = data28;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            
            this.csvSettings7 = csvSettings7;
        } else {
            this.data28 = data28;
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings7 = csvSettings7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data28.generateJs());
            js.append(String.format(Locale.US, "var setOhlc" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s, %s);", ((data28 != null) ? data28.getJsBase() : "null"), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", ((data28 != null) ? data28.getJsBase() : "null"), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
                js.setLength(0);
            }
        }
        ScrollerseriesOHLC item = new ScrollerseriesOHLC("setOhlc" + variableIndex);
        setOhlc.add(item);
        return item;
    }
    private String generateJSsetOhlc() {
        if (!setOhlc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setOhlc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setOhlc1 = new ArrayList<>();

    /**
     * Creates and returns a new OHLC series.
     */
    public ScrollerseriesOHLC ohlc(DataTable data29, String mappingSettings7, String csvSettings7) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            
            this.data29 = data29;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            
            this.csvSettings7 = csvSettings7;
        } else {
            this.data29 = data29;
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings7 = csvSettings7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data29.generateJs());
            js.append(String.format(Locale.US, "var setOhlc1" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s, %s);", ((data29 != null) ? data29.getJsBase() : "null"), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", ((data29 != null) ? data29.getJsBase() : "null"), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
                js.setLength(0);
            }
        }
        ScrollerseriesOHLC item = new ScrollerseriesOHLC("setOhlc1" + variableIndex);
        setOhlc1.add(item);
        return item;
    }
    private String generateJSsetOhlc1() {
        if (!setOhlc1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setOhlc1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesOHLC> setOhlc2 = new ArrayList<>();

    /**
     * Creates and returns a new OHLC series.
     */
    public ScrollerseriesOHLC ohlc(String data30, String mappingSettings7, String csvSettings7) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            
            this.data30 = data30;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            
            this.csvSettings7 = csvSettings7;
        } else {
            this.data30 = data30;
            this.mappingSettings7 = mappingSettings7;
            this.csvSettings7 = csvSettings7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setOhlc2" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s, %s);", wrapQuotes(data30), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", wrapQuotes(data30), wrapQuotes(mappingSettings7), wrapQuotes(csvSettings7)));
                js.setLength(0);
            }
        }
        ScrollerseriesOHLC item = new ScrollerseriesOHLC("setOhlc2" + variableIndex);
        setOhlc2.add(item);
        return item;
    }
    private String generateJSsetOhlc2() {
        if (!setOhlc2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesOHLC item : setOhlc2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RangeColors getPalette;

    /**
     * Getter for the scroller colors palette.
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
     * Setter for the scroller colors palette.
     */
    public StockScroller setPalette(RangeColors palette) {
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
     * Setter for the scroller colors palette.
     */
    public StockScroller setPalette(DistinctColors palette1) {
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
     * Setter for the scroller colors palette.
     */
    public StockScroller setPalette(String palette2) {
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
     * Setter for the scroller colors palette.
     */
    public StockScroller setPalette(String[] palette3) {
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

    private TableMapping data32;
    private DataTable data33;
    private String data34;
    private String data35;
    private String mappingSettings8;
    private String csvSettings8;
    private List<ScrollerseriesRangeArea> setRangeArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Area series.
     */
    public ScrollerseriesRangeArea rangeArea(TableMapping data32, String mappingSettings8, String csvSettings8) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            
            this.data32 = data32;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            
            this.csvSettings8 = csvSettings8;
        } else {
            this.data32 = data32;
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings8 = csvSettings8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data32.generateJs());
            js.append(String.format(Locale.US, "var setRangeArea" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s, %s);", ((data32 != null) ? data32.getJsBase() : "null"), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", ((data32 != null) ? data32.getJsBase() : "null"), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeArea item = new ScrollerseriesRangeArea("setRangeArea" + variableIndex);
        setRangeArea.add(item);
        return item;
    }
    private String generateJSsetRangeArea() {
        if (!setRangeArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeArea item : setRangeArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeArea> setRangeArea1 = new ArrayList<>();

    /**
     * Creates and returns a new Range Area series.
     */
    public ScrollerseriesRangeArea rangeArea(DataTable data33, String mappingSettings8, String csvSettings8) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            
            this.data33 = data33;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            
            this.csvSettings8 = csvSettings8;
        } else {
            this.data33 = data33;
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings8 = csvSettings8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data33.generateJs());
            js.append(String.format(Locale.US, "var setRangeArea1" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s, %s);", ((data33 != null) ? data33.getJsBase() : "null"), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", ((data33 != null) ? data33.getJsBase() : "null"), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeArea item = new ScrollerseriesRangeArea("setRangeArea1" + variableIndex);
        setRangeArea1.add(item);
        return item;
    }
    private String generateJSsetRangeArea1() {
        if (!setRangeArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeArea item : setRangeArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeArea> setRangeArea2 = new ArrayList<>();

    /**
     * Creates and returns a new Range Area series.
     */
    public ScrollerseriesRangeArea rangeArea(String data34, String mappingSettings8, String csvSettings8) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            
            this.data34 = data34;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            
            this.csvSettings8 = csvSettings8;
        } else {
            this.data34 = data34;
            this.mappingSettings8 = mappingSettings8;
            this.csvSettings8 = csvSettings8;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRangeArea2" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s, %s);", wrapQuotes(data34), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", wrapQuotes(data34), wrapQuotes(mappingSettings8), wrapQuotes(csvSettings8)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeArea item = new ScrollerseriesRangeArea("setRangeArea2" + variableIndex);
        setRangeArea2.add(item);
        return item;
    }
    private String generateJSsetRangeArea2() {
        if (!setRangeArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeArea item : setRangeArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data36;
    private DataTable data37;
    private String data38;
    private String data39;
    private String mappingSettings9;
    private String csvSettings9;
    private List<ScrollerseriesRangeColumn> setRangeColumn = new ArrayList<>();

    /**
     * Creates and returns a new Range Column series.
     */
    public ScrollerseriesRangeColumn rangeColumn(TableMapping data36, String mappingSettings9, String csvSettings9) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            
            this.data36 = data36;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            
            this.csvSettings9 = csvSettings9;
        } else {
            this.data36 = data36;
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings9 = csvSettings9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data36.generateJs());
            js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s, %s);", ((data36 != null) ? data36.getJsBase() : "null"), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", ((data36 != null) ? data36.getJsBase() : "null"), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeColumn item = new ScrollerseriesRangeColumn("setRangeColumn" + variableIndex);
        setRangeColumn.add(item);
        return item;
    }
    private String generateJSsetRangeColumn() {
        if (!setRangeColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeColumn item : setRangeColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeColumn> setRangeColumn1 = new ArrayList<>();

    /**
     * Creates and returns a new Range Column series.
     */
    public ScrollerseriesRangeColumn rangeColumn(DataTable data37, String mappingSettings9, String csvSettings9) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            
            this.data37 = data37;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            
            this.csvSettings9 = csvSettings9;
        } else {
            this.data37 = data37;
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings9 = csvSettings9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data37.generateJs());
            js.append(String.format(Locale.US, "var setRangeColumn1" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s, %s);", ((data37 != null) ? data37.getJsBase() : "null"), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", ((data37 != null) ? data37.getJsBase() : "null"), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeColumn item = new ScrollerseriesRangeColumn("setRangeColumn1" + variableIndex);
        setRangeColumn1.add(item);
        return item;
    }
    private String generateJSsetRangeColumn1() {
        if (!setRangeColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeColumn item : setRangeColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeColumn> setRangeColumn2 = new ArrayList<>();

    /**
     * Creates and returns a new Range Column series.
     */
    public ScrollerseriesRangeColumn rangeColumn(String data38, String mappingSettings9, String csvSettings9) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            
            this.data38 = data38;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            
            this.csvSettings9 = csvSettings9;
        } else {
            this.data38 = data38;
            this.mappingSettings9 = mappingSettings9;
            this.csvSettings9 = csvSettings9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRangeColumn2" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s, %s);", wrapQuotes(data38), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", wrapQuotes(data38), wrapQuotes(mappingSettings9), wrapQuotes(csvSettings9)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeColumn item = new ScrollerseriesRangeColumn("setRangeColumn2" + variableIndex);
        setRangeColumn2.add(item);
        return item;
    }
    private String generateJSsetRangeColumn2() {
        if (!setRangeColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeColumn item : setRangeColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data40;
    private DataTable data41;
    private String data42;
    private String data43;
    private String mappingSettings10;
    private String csvSettings10;
    private List<ScrollerseriesRangeSplineArea> setRangeSplineArea = new ArrayList<>();

    /**
     * Creates and returns a new Range Spline Area series.
     */
    public ScrollerseriesRangeSplineArea rangeSplineArea(TableMapping data40, String mappingSettings10, String csvSettings10) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            
            this.data40 = data40;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            
            this.csvSettings10 = csvSettings10;
        } else {
            this.data40 = data40;
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings10 = csvSettings10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data40.generateJs());
            js.append(String.format(Locale.US, "var setRangeSplineArea" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s, %s);", ((data40 != null) ? data40.getJsBase() : "null"), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", ((data40 != null) ? data40.getJsBase() : "null"), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeSplineArea item = new ScrollerseriesRangeSplineArea("setRangeSplineArea" + variableIndex);
        setRangeSplineArea.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea() {
        if (!setRangeSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeSplineArea item : setRangeSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeSplineArea> setRangeSplineArea1 = new ArrayList<>();

    /**
     * Creates and returns a new Range Spline Area series.
     */
    public ScrollerseriesRangeSplineArea rangeSplineArea(DataTable data41, String mappingSettings10, String csvSettings10) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            
            this.data41 = data41;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            
            this.csvSettings10 = csvSettings10;
        } else {
            this.data41 = data41;
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings10 = csvSettings10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data41.generateJs());
            js.append(String.format(Locale.US, "var setRangeSplineArea1" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s, %s);", ((data41 != null) ? data41.getJsBase() : "null"), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", ((data41 != null) ? data41.getJsBase() : "null"), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeSplineArea item = new ScrollerseriesRangeSplineArea("setRangeSplineArea1" + variableIndex);
        setRangeSplineArea1.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea1() {
        if (!setRangeSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeSplineArea item : setRangeSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeSplineArea> setRangeSplineArea2 = new ArrayList<>();

    /**
     * Creates and returns a new Range Spline Area series.
     */
    public ScrollerseriesRangeSplineArea rangeSplineArea(String data42, String mappingSettings10, String csvSettings10) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            
            this.data42 = data42;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            
            this.csvSettings10 = csvSettings10;
        } else {
            this.data42 = data42;
            this.mappingSettings10 = mappingSettings10;
            this.csvSettings10 = csvSettings10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRangeSplineArea2" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s, %s);", wrapQuotes(data42), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", wrapQuotes(data42), wrapQuotes(mappingSettings10), wrapQuotes(csvSettings10)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeSplineArea item = new ScrollerseriesRangeSplineArea("setRangeSplineArea2" + variableIndex);
        setRangeSplineArea2.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea2() {
        if (!setRangeSplineArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeSplineArea item : setRangeSplineArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data44;
    private DataTable data45;
    private String data46;
    private String data47;
    private String mappingSettings11;
    private String csvSettings11;
    private List<ScrollerseriesRangeStepArea> setRangeStepArea = new ArrayList<>();

    /**
     * Creates and returns a new rangeStepArea series.
     */
    public ScrollerseriesRangeStepArea rangeStepArea(TableMapping data44, String mappingSettings11, String csvSettings11) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            
            this.data44 = data44;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            
            this.csvSettings11 = csvSettings11;
        } else {
            this.data44 = data44;
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings11 = csvSettings11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data44.generateJs());
            js.append(String.format(Locale.US, "var setRangeStepArea" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s, %s);", ((data44 != null) ? data44.getJsBase() : "null"), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", ((data44 != null) ? data44.getJsBase() : "null"), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeStepArea item = new ScrollerseriesRangeStepArea("setRangeStepArea" + variableIndex);
        setRangeStepArea.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea() {
        if (!setRangeStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeStepArea item : setRangeStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeStepArea> setRangeStepArea1 = new ArrayList<>();

    /**
     * Creates and returns a new rangeStepArea series.
     */
    public ScrollerseriesRangeStepArea rangeStepArea(DataTable data45, String mappingSettings11, String csvSettings11) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            
            this.data45 = data45;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            
            this.csvSettings11 = csvSettings11;
        } else {
            this.data45 = data45;
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings11 = csvSettings11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data45.generateJs());
            js.append(String.format(Locale.US, "var setRangeStepArea1" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s, %s);", ((data45 != null) ? data45.getJsBase() : "null"), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", ((data45 != null) ? data45.getJsBase() : "null"), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeStepArea item = new ScrollerseriesRangeStepArea("setRangeStepArea1" + variableIndex);
        setRangeStepArea1.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea1() {
        if (!setRangeStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeStepArea item : setRangeStepArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesRangeStepArea> setRangeStepArea2 = new ArrayList<>();

    /**
     * Creates and returns a new rangeStepArea series.
     */
    public ScrollerseriesRangeStepArea rangeStepArea(String data46, String mappingSettings11, String csvSettings11) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            
            this.data46 = data46;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            
            this.csvSettings11 = csvSettings11;
        } else {
            this.data46 = data46;
            this.mappingSettings11 = mappingSettings11;
            this.csvSettings11 = csvSettings11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRangeStepArea2" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s, %s);", wrapQuotes(data46), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", wrapQuotes(data46), wrapQuotes(mappingSettings11), wrapQuotes(csvSettings11)));
                js.setLength(0);
            }
        }
        ScrollerseriesRangeStepArea item = new ScrollerseriesRangeStepArea("setRangeStepArea2" + variableIndex);
        setRangeStepArea2.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea2() {
        if (!setRangeStepArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesRangeStepArea item : setRangeStepArea2) {
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
    public StockScroller removeSeries(Number id) {
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
    public StockScroller removeSeries(String id1) {
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

    private Number index;

    /**
     * Removes one of series from chart by its index.
     */
    public StockScroller removeSeriesAt(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".removeSeriesAt(%s)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeSeriesAt(%s);", index));
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
     * Creates RoC (Rate of Change) indicator on the scroller.
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
     * Creates RoC (Rate of Change) indicator on the scroller.
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
     * Creates RSI (Relative Strength Index) indicator on the scroller.
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
     * Creates RSI (Relative Strength Index) indicator on the scroller.
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
     * Creates SMA (Simple Moving Average) indicator on the scroller.
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
     * Creates SMA (Simple Moving Average) indicator on the scroller.
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

    private TableMapping data48;
    private DataTable data49;
    private String data50;
    private String data51;
    private String mappingSettings12;
    private String csvSettings12;
    private List<ScrollerseriesSpline> setSpline = new ArrayList<>();

    /**
     * Creates and returns a new Spline series.
     */
    public ScrollerseriesSpline spline(TableMapping data48, String mappingSettings12, String csvSettings12) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            
            this.data48 = data48;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            
            this.csvSettings12 = csvSettings12;
        } else {
            this.data48 = data48;
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings12 = csvSettings12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data48.generateJs());
            js.append(String.format(Locale.US, "var setSpline" + ++variableIndex + " = " + jsBase + ".spline(%s, %s, %s);", ((data48 != null) ? data48.getJsBase() : "null"), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", ((data48 != null) ? data48.getJsBase() : "null"), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
                js.setLength(0);
            }
        }
        ScrollerseriesSpline item = new ScrollerseriesSpline("setSpline" + variableIndex);
        setSpline.add(item);
        return item;
    }
    private String generateJSsetSpline() {
        if (!setSpline.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSpline item : setSpline) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesSpline> setSpline1 = new ArrayList<>();

    /**
     * Creates and returns a new Spline series.
     */
    public ScrollerseriesSpline spline(DataTable data49, String mappingSettings12, String csvSettings12) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            
            this.data49 = data49;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            
            this.csvSettings12 = csvSettings12;
        } else {
            this.data49 = data49;
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings12 = csvSettings12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data49.generateJs());
            js.append(String.format(Locale.US, "var setSpline1" + ++variableIndex + " = " + jsBase + ".spline(%s, %s, %s);", ((data49 != null) ? data49.getJsBase() : "null"), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", ((data49 != null) ? data49.getJsBase() : "null"), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
                js.setLength(0);
            }
        }
        ScrollerseriesSpline item = new ScrollerseriesSpline("setSpline1" + variableIndex);
        setSpline1.add(item);
        return item;
    }
    private String generateJSsetSpline1() {
        if (!setSpline1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSpline item : setSpline1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesSpline> setSpline2 = new ArrayList<>();

    /**
     * Creates and returns a new Spline series.
     */
    public ScrollerseriesSpline spline(String data50, String mappingSettings12, String csvSettings12) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            
            this.data50 = data50;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            
            this.csvSettings12 = csvSettings12;
        } else {
            this.data50 = data50;
            this.mappingSettings12 = mappingSettings12;
            this.csvSettings12 = csvSettings12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSpline2" + ++variableIndex + " = " + jsBase + ".spline(%s, %s, %s);", wrapQuotes(data50), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", wrapQuotes(data50), wrapQuotes(mappingSettings12), wrapQuotes(csvSettings12)));
                js.setLength(0);
            }
        }
        ScrollerseriesSpline item = new ScrollerseriesSpline("setSpline2" + variableIndex);
        setSpline2.add(item);
        return item;
    }
    private String generateJSsetSpline2() {
        if (!setSpline2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSpline item : setSpline2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data52;
    private DataTable data53;
    private String data54;
    private String data55;
    private String mappingSettings13;
    private String csvSettings13;
    private List<ScrollerseriesSplineArea> setSplineArea = new ArrayList<>();

    /**
     * Creates and returns a new Spline Area series.
     */
    public ScrollerseriesSplineArea splineArea(TableMapping data52, String mappingSettings13, String csvSettings13) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            
            this.data52 = data52;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            
            this.csvSettings13 = csvSettings13;
        } else {
            this.data52 = data52;
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings13 = csvSettings13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data52.generateJs());
            js.append(String.format(Locale.US, "var setSplineArea" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s, %s);", ((data52 != null) ? data52.getJsBase() : "null"), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", ((data52 != null) ? data52.getJsBase() : "null"), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
                js.setLength(0);
            }
        }
        ScrollerseriesSplineArea item = new ScrollerseriesSplineArea("setSplineArea" + variableIndex);
        setSplineArea.add(item);
        return item;
    }
    private String generateJSsetSplineArea() {
        if (!setSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSplineArea item : setSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesSplineArea> setSplineArea1 = new ArrayList<>();

    /**
     * Creates and returns a new Spline Area series.
     */
    public ScrollerseriesSplineArea splineArea(DataTable data53, String mappingSettings13, String csvSettings13) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            
            this.data53 = data53;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            
            this.csvSettings13 = csvSettings13;
        } else {
            this.data53 = data53;
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings13 = csvSettings13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data53.generateJs());
            js.append(String.format(Locale.US, "var setSplineArea1" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s, %s);", ((data53 != null) ? data53.getJsBase() : "null"), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", ((data53 != null) ? data53.getJsBase() : "null"), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
                js.setLength(0);
            }
        }
        ScrollerseriesSplineArea item = new ScrollerseriesSplineArea("setSplineArea1" + variableIndex);
        setSplineArea1.add(item);
        return item;
    }
    private String generateJSsetSplineArea1() {
        if (!setSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSplineArea item : setSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesSplineArea> setSplineArea2 = new ArrayList<>();

    /**
     * Creates and returns a new Spline Area series.
     */
    public ScrollerseriesSplineArea splineArea(String data54, String mappingSettings13, String csvSettings13) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            
            this.data54 = data54;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            
            this.csvSettings13 = csvSettings13;
        } else {
            this.data54 = data54;
            this.mappingSettings13 = mappingSettings13;
            this.csvSettings13 = csvSettings13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSplineArea2" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s, %s);", wrapQuotes(data54), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", wrapQuotes(data54), wrapQuotes(mappingSettings13), wrapQuotes(csvSettings13)));
                js.setLength(0);
            }
        }
        ScrollerseriesSplineArea item = new ScrollerseriesSplineArea("setSplineArea2" + variableIndex);
        setSplineArea2.add(item);
        return item;
    }
    private String generateJSsetSplineArea2() {
        if (!setSplineArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesSplineArea item : setSplineArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data56;
    private DataTable data57;
    private String data58;
    private String data59;
    private String mappingSettings14;
    private String csvSettings14;
    private List<ScrollerseriesStepArea> setStepArea = new ArrayList<>();

    /**
     * Creates and returns a new Step Area series.
     */
    public ScrollerseriesStepArea stepArea(TableMapping data56, String mappingSettings14, String csvSettings14) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            
            this.data56 = data56;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            
            this.csvSettings14 = csvSettings14;
        } else {
            this.data56 = data56;
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings14 = csvSettings14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data56.generateJs());
            js.append(String.format(Locale.US, "var setStepArea" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s, %s);", ((data56 != null) ? data56.getJsBase() : "null"), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", ((data56 != null) ? data56.getJsBase() : "null"), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepArea item = new ScrollerseriesStepArea("setStepArea" + variableIndex);
        setStepArea.add(item);
        return item;
    }
    private String generateJSsetStepArea() {
        if (!setStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepArea item : setStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStepArea> setStepArea1 = new ArrayList<>();

    /**
     * Creates and returns a new Step Area series.
     */
    public ScrollerseriesStepArea stepArea(DataTable data57, String mappingSettings14, String csvSettings14) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            
            this.data57 = data57;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            
            this.csvSettings14 = csvSettings14;
        } else {
            this.data57 = data57;
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings14 = csvSettings14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data57.generateJs());
            js.append(String.format(Locale.US, "var setStepArea1" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s, %s);", ((data57 != null) ? data57.getJsBase() : "null"), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", ((data57 != null) ? data57.getJsBase() : "null"), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepArea item = new ScrollerseriesStepArea("setStepArea1" + variableIndex);
        setStepArea1.add(item);
        return item;
    }
    private String generateJSsetStepArea1() {
        if (!setStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepArea item : setStepArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStepArea> setStepArea2 = new ArrayList<>();

    /**
     * Creates and returns a new Step Area series.
     */
    public ScrollerseriesStepArea stepArea(String data58, String mappingSettings14, String csvSettings14) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            
            this.data58 = data58;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            
            this.csvSettings14 = csvSettings14;
        } else {
            this.data58 = data58;
            this.mappingSettings14 = mappingSettings14;
            this.csvSettings14 = csvSettings14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStepArea2" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s, %s);", wrapQuotes(data58), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", wrapQuotes(data58), wrapQuotes(mappingSettings14), wrapQuotes(csvSettings14)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepArea item = new ScrollerseriesStepArea("setStepArea2" + variableIndex);
        setStepArea2.add(item);
        return item;
    }
    private String generateJSsetStepArea2() {
        if (!setStepArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepArea item : setStepArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data60;
    private DataTable data61;
    private String data62;
    private String data63;
    private String mappingSettings15;
    private String csvSettings15;
    private List<ScrollerseriesStepLine> setStepLine = new ArrayList<>();

    /**
     * Creates and returns a new Step Line series.
     */
    public ScrollerseriesStepLine stepLine(TableMapping data60, String mappingSettings15, String csvSettings15) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            
            this.data60 = data60;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            
            this.csvSettings15 = csvSettings15;
        } else {
            this.data60 = data60;
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings15 = csvSettings15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data60.generateJs());
            js.append(String.format(Locale.US, "var setStepLine" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s, %s);", ((data60 != null) ? data60.getJsBase() : "null"), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", ((data60 != null) ? data60.getJsBase() : "null"), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepLine item = new ScrollerseriesStepLine("setStepLine" + variableIndex);
        setStepLine.add(item);
        return item;
    }
    private String generateJSsetStepLine() {
        if (!setStepLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepLine item : setStepLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStepLine> setStepLine1 = new ArrayList<>();

    /**
     * Creates and returns a new Step Line series.
     */
    public ScrollerseriesStepLine stepLine(DataTable data61, String mappingSettings15, String csvSettings15) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            
            this.data61 = data61;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            
            this.csvSettings15 = csvSettings15;
        } else {
            this.data61 = data61;
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings15 = csvSettings15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data61.generateJs());
            js.append(String.format(Locale.US, "var setStepLine1" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s, %s);", ((data61 != null) ? data61.getJsBase() : "null"), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", ((data61 != null) ? data61.getJsBase() : "null"), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepLine item = new ScrollerseriesStepLine("setStepLine1" + variableIndex);
        setStepLine1.add(item);
        return item;
    }
    private String generateJSsetStepLine1() {
        if (!setStepLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepLine item : setStepLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStepLine> setStepLine2 = new ArrayList<>();

    /**
     * Creates and returns a new Step Line series.
     */
    public ScrollerseriesStepLine stepLine(String data62, String mappingSettings15, String csvSettings15) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            
            this.data62 = data62;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            
            this.csvSettings15 = csvSettings15;
        } else {
            this.data62 = data62;
            this.mappingSettings15 = mappingSettings15;
            this.csvSettings15 = csvSettings15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStepLine2" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s, %s);", wrapQuotes(data62), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", wrapQuotes(data62), wrapQuotes(mappingSettings15), wrapQuotes(csvSettings15)));
                js.setLength(0);
            }
        }
        ScrollerseriesStepLine item = new ScrollerseriesStepLine("setStepLine2" + variableIndex);
        setStepLine2.add(item);
        return item;
    }
    private String generateJSsetStepLine2() {
        if (!setStepLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStepLine item : setStepLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping data64;
    private DataTable data65;
    private String data66;
    private String data67;
    private String mappingSettings16;
    private String csvSettings16;
    private List<ScrollerseriesStick> setStick = new ArrayList<>();

    /**
     * Creates and returns a new Stick series.
     */
    public ScrollerseriesStick stick(TableMapping data64, String mappingSettings16, String csvSettings16) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            this.data64 = null;
            this.data65 = null;
            this.data66 = null;
            this.data67 = null;
            
            this.data64 = data64;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            this.mappingSettings16 = null;
            
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            this.csvSettings16 = null;
            
            this.csvSettings16 = csvSettings16;
        } else {
            this.data64 = data64;
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings16 = csvSettings16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data64.generateJs());
            js.append(String.format(Locale.US, "var setStick" + ++variableIndex + " = " + jsBase + ".stick(%s, %s, %s);", ((data64 != null) ? data64.getJsBase() : "null"), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", ((data64 != null) ? data64.getJsBase() : "null"), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
                js.setLength(0);
            }
        }
        ScrollerseriesStick item = new ScrollerseriesStick("setStick" + variableIndex);
        setStick.add(item);
        return item;
    }
    private String generateJSsetStick() {
        if (!setStick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStick item : setStick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStick> setStick1 = new ArrayList<>();

    /**
     * Creates and returns a new Stick series.
     */
    public ScrollerseriesStick stick(DataTable data65, String mappingSettings16, String csvSettings16) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            this.data64 = null;
            this.data65 = null;
            this.data66 = null;
            this.data67 = null;
            
            this.data65 = data65;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            this.mappingSettings16 = null;
            
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            this.csvSettings16 = null;
            
            this.csvSettings16 = csvSettings16;
        } else {
            this.data65 = data65;
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings16 = csvSettings16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data65.generateJs());
            js.append(String.format(Locale.US, "var setStick1" + ++variableIndex + " = " + jsBase + ".stick(%s, %s, %s);", ((data65 != null) ? data65.getJsBase() : "null"), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", ((data65 != null) ? data65.getJsBase() : "null"), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
                js.setLength(0);
            }
        }
        ScrollerseriesStick item = new ScrollerseriesStick("setStick1" + variableIndex);
        setStick1.add(item);
        return item;
    }
    private String generateJSsetStick1() {
        if (!setStick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStick item : setStick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesStick> setStick2 = new ArrayList<>();

    /**
     * Creates and returns a new Stick series.
     */
    public ScrollerseriesStick stick(String data66, String mappingSettings16, String csvSettings16) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            this.data4 = null;
            this.data5 = null;
            this.data6 = null;
            this.data7 = null;
            this.data8 = null;
            this.data9 = null;
            this.data10 = null;
            this.data11 = null;
            this.data12 = null;
            this.data13 = null;
            this.data14 = null;
            this.data15 = null;
            this.data16 = null;
            this.data17 = null;
            this.data18 = null;
            this.data19 = null;
            this.data20 = null;
            this.data21 = null;
            this.data22 = null;
            this.data23 = null;
            this.data24 = null;
            this.data25 = null;
            this.data26 = null;
            this.data27 = null;
            this.data28 = null;
            this.data29 = null;
            this.data30 = null;
            this.data31 = null;
            this.data32 = null;
            this.data33 = null;
            this.data34 = null;
            this.data35 = null;
            this.data36 = null;
            this.data37 = null;
            this.data38 = null;
            this.data39 = null;
            this.data40 = null;
            this.data41 = null;
            this.data42 = null;
            this.data43 = null;
            this.data44 = null;
            this.data45 = null;
            this.data46 = null;
            this.data47 = null;
            this.data48 = null;
            this.data49 = null;
            this.data50 = null;
            this.data51 = null;
            this.data52 = null;
            this.data53 = null;
            this.data54 = null;
            this.data55 = null;
            this.data56 = null;
            this.data57 = null;
            this.data58 = null;
            this.data59 = null;
            this.data60 = null;
            this.data61 = null;
            this.data62 = null;
            this.data63 = null;
            this.data64 = null;
            this.data65 = null;
            this.data66 = null;
            this.data67 = null;
            
            this.data66 = data66;
            this.mappingSettings = null;
            this.mappingSettings1 = null;
            this.mappingSettings2 = null;
            this.mappingSettings3 = null;
            this.mappingSettings4 = null;
            this.mappingSettings5 = null;
            this.mappingSettings6 = null;
            this.mappingSettings7 = null;
            this.mappingSettings8 = null;
            this.mappingSettings9 = null;
            this.mappingSettings10 = null;
            this.mappingSettings11 = null;
            this.mappingSettings12 = null;
            this.mappingSettings13 = null;
            this.mappingSettings14 = null;
            this.mappingSettings15 = null;
            this.mappingSettings16 = null;
            
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            this.csvSettings3 = null;
            this.csvSettings4 = null;
            this.csvSettings5 = null;
            this.csvSettings6 = null;
            this.csvSettings7 = null;
            this.csvSettings8 = null;
            this.csvSettings9 = null;
            this.csvSettings10 = null;
            this.csvSettings11 = null;
            this.csvSettings12 = null;
            this.csvSettings13 = null;
            this.csvSettings14 = null;
            this.csvSettings15 = null;
            this.csvSettings16 = null;
            
            this.csvSettings16 = csvSettings16;
        } else {
            this.data66 = data66;
            this.mappingSettings16 = mappingSettings16;
            this.csvSettings16 = csvSettings16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStick2" + ++variableIndex + " = " + jsBase + ".stick(%s, %s, %s);", wrapQuotes(data66), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", wrapQuotes(data66), wrapQuotes(mappingSettings16), wrapQuotes(csvSettings16)));
                js.setLength(0);
            }
        }
        ScrollerseriesStick item = new ScrollerseriesStick("setStick2" + variableIndex);
        setStick2.add(item);
        return item;
    }
    private String generateJSsetStick2() {
        if (!setStick2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesStick item : setStick2) {
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Creates a Stochastic indicator on the scroller.
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
     * Getter for the current scroller X-axis.
     */
    public StockDateTime getXAxis() {
        if (getXAxis == null)
            getXAxis = new StockDateTime(jsBase + ".xAxis()");

        return getXAxis;
    }

    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the scroller X-axis.
     */
    public StockScroller setXAxis(String xAxis) {
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
     * Setter for the scroller X-axis.
     */
    public StockScroller setXAxis(Boolean xAxis1) {
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

    private ScatterBase getYScale;

    /**
     * Getter for the current scroller Y-scale.
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
     * Setter for the scroller Y-scale.
     */
    public StockScroller setYScale(ScatterScaleTypes yScale) {
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
     * Setter for the scroller Y-scale.
     */
    public StockScroller setYScale(String yScale1) {
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
     * Setter for the scroller Y-scale.
     */
    public StockScroller setYScale(ScatterBase yScale2) {
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

    private String generateJSgetGetSeries() {
        if (!getGetSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : getGetSeriesAt) {
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

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
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

    
        jsGetters.append(generateJSgetGetSeries());
        jsGetters.append(generateJSgetGetSeries1());
        jsGetters.append(generateJSgetGetSeriesAt());
        jsGetters.append(generateJSgetHatchFillPalette());
        jsGetters.append(generateJSgetPalette());
        jsGetters.append(generateJSgetXAxis());
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
        js.append(generateJSsetArea1());
        js.append(generateJSsetArea2());
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
        js.append(generateJSsetCandlestick1());
        js.append(generateJSsetCandlestick2());
        js.append(generateJSsetCci());
        js.append(generateJSsetCci1());
        js.append(generateJSsetCho());
        js.append(generateJSsetCho1());
        js.append(generateJSsetCmf());
        js.append(generateJSsetCmf1());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetColumn2());
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
        js.append(generateJSsetHilo());
        js.append(generateJSsetHilo1());
        js.append(generateJSsetHilo2());
        js.append(generateJSsetJumpLine());
        js.append(generateJSsetJumpLine1());
        js.append(generateJSsetJumpLine2());
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
        js.append(generateJSsetLine1());
        js.append(generateJSsetLine2());
        js.append(generateJSsetMacd());
        js.append(generateJSsetMacd1());
        js.append(generateJSsetMacd2());
        js.append(generateJSsetMacd3());
        js.append(generateJSsetMacd4());
        js.append(generateJSsetMacd5());
        js.append(generateJSsetMacd6());
        js.append(generateJSsetMacd7());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetMarker2());
        js.append(generateJSsetMma());
        js.append(generateJSsetMma1());
        js.append(generateJSsetOhlc());
        js.append(generateJSsetOhlc1());
        js.append(generateJSsetOhlc2());
        js.append(generateJSsetRangeArea());
        js.append(generateJSsetRangeArea1());
        js.append(generateJSsetRangeArea2());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeColumn1());
        js.append(generateJSsetRangeColumn2());
        js.append(generateJSsetRangeSplineArea());
        js.append(generateJSsetRangeSplineArea1());
        js.append(generateJSsetRangeSplineArea2());
        js.append(generateJSsetRangeStepArea());
        js.append(generateJSsetRangeStepArea1());
        js.append(generateJSsetRangeStepArea2());
        js.append(generateJSsetRoc());
        js.append(generateJSsetRoc1());
        js.append(generateJSsetRsi());
        js.append(generateJSsetRsi1());
        js.append(generateJSsetSma());
        js.append(generateJSsetSma1());
        js.append(generateJSsetSpline());
        js.append(generateJSsetSpline1());
        js.append(generateJSsetSpline2());
        js.append(generateJSsetSplineArea());
        js.append(generateJSsetSplineArea1());
        js.append(generateJSsetSplineArea2());
        js.append(generateJSsetStepArea());
        js.append(generateJSsetStepArea1());
        js.append(generateJSsetStepArea2());
        js.append(generateJSsetStepLine());
        js.append(generateJSsetStepLine1());
        js.append(generateJSsetStepLine2());
        js.append(generateJSsetStick());
        js.append(generateJSsetStick1());
        js.append(generateJSsetStick2());
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