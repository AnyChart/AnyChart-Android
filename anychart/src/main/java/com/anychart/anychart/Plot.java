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
        return new ADL(jsBase);
    }


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
        return new ADL(jsBase);
    }

    private TableMapping mapping1;
    private Double period;
    private Double fastPeriod;
    private Double slowPeriod;
    private StockSeriesType seriesType2;
    private String seriesType3;

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
        return new AMA(jsBase);
    }


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
        return new AMA(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".annotations(%s)", arrayToStringWrapQuotes(annotationsList)));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesArea(jsBase);
    }

    private TableMapping mapping2;
    private Double period1;
    private StockSeriesType upSeriesType;
    private String upSeriesType1;
    private StockSeriesType downSeriesType;
    private String downSeriesType1;

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
        return new Aroon(jsBase);
    }


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
        return new Aroon(jsBase);
    }


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
        return new Aroon(jsBase);
    }


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
        return new Aroon(jsBase);
    }

    private TableMapping mapping3;
    private Double period2;
    private StockSeriesType seriesType4;
    private String seriesType5;

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
        return new ATR(jsBase);
    }


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
        return new ATR(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
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
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }


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
        return new BBands(jsBase);
    }

    private TableMapping mapping5;
    private Double period4;
    private Double deviation1;
    private StockSeriesType seriesType6;
    private String seriesType7;

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
        return new BBandsB(jsBase);
    }


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
        return new BBandsB(jsBase);
    }

    private TableMapping mapping6;
    private Double period5;
    private Double deviation2;
    private StockSeriesType seriesType8;
    private String seriesType9;

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
        return new BBandsWidth(jsBase);
    }


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
        return new BBandsWidth(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesCandlestick(jsBase);
    }

    private TableMapping mapping7;
    private Double period6;
    private StockSeriesType seriesType10;
    private String seriesType11;

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
        return new CCI(jsBase);
    }


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
        return new CCI(jsBase);
    }

    private TableMapping mapping8;
    private Double fastPeriod1;
    private Double slowPeriod1;
    private MovingAverageType maType;
    private String maType1;
    private StockSeriesType seriesType12;
    private String seriesType13;

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
        return new CHO(jsBase);
    }


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
        return new CHO(jsBase);
    }


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
        return new CHO(jsBase);
    }


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
        return new CHO(jsBase);
    }

    private TableMapping mapping9;
    private Double period7;
    private StockSeriesType seriesType14;
    private String seriesType15;

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
        return new CMF(jsBase);
    }


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
        return new CMF(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesColumn(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));
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
                onChangeListener.onChange(String.format(Locale.US, ".crosshair(%b)", crosshair1));
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
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));
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
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType1)));
                js.setLength(0);
            }
        }
        return this;
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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }


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
        return new DMI(jsBase);
    }

    private TableMapping mapping11;
    private Double period9;
    private StockSeriesType seriesType16;
    private String seriesType17;

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
        return new EMA(jsBase);
    }


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
        return new EMA(jsBase);
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
        return new HatchFills(jsBase);
    }


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
        return new HatchFills(jsBase);
    }


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
        return new HatchFills(jsBase);
    }


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
        return new StockSeriesHilo(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesJumpLine(jsBase);
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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
    }


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
        return new KDJ(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".legend(%s)", wrapQuotes(legend)));
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
                onChangeListener.onChange(String.format(Locale.US, ".legend(%b)", legend1));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesLine(jsBase);
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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
        return new MACD(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesMarker(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));
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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));
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
                onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxPointWidth;
    private String maxPointWidth1;

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

    private Double minPointLength;
    private String minPointLength1;

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

    private TableMapping mapping14;
    private Double period10;
    private StockSeriesType seriesType18;
    private String seriesType19;

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
        return new MMA(jsBase);
    }


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
        return new MMA(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".noData(%s)", wrapQuotes(noData)));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesOHLC(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
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
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double pointWidth;
    private String pointWidth1;

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

    private Double index;
    private String priceIndicator2;
    private Boolean priceIndicator3;

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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesRangeArea(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesRangeColumn(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesRangeSplineArea(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesRangeStepArea(jsBase);
    }

    private Double id;
    private String id1;

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

    private Double index1;

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

    private TableMapping mapping15;
    private Double period11;
    private StockSeriesType seriesType20;
    private String seriesType21;

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
        return new RoC(jsBase);
    }


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
        return new RoC(jsBase);
    }

    private TableMapping mapping16;
    private Double period12;
    private StockSeriesType seriesType22;
    private String seriesType23;

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
        return new RSI(jsBase);
    }


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
        return new RSI(jsBase);
    }

    private TableMapping mapping17;
    private Double period13;
    private StockSeriesType seriesType24;
    private String seriesType25;

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
        return new SMA(jsBase);
    }


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
        return new SMA(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesSpline(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesSplineArea(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesStepArea(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesStepLine(jsBase);
    }


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
            js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", mapping.getJsBase()));
        }
        return new StockSeriesStick(jsBase);
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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
    }


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
        return new Stochastic(jsBase);
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
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));
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
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
                js.setLength(0);
            }
        }
        return this;
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

    private Double index2;
    private String xGrid2;
    private Boolean xGrid3;

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

    private Double indexOrValue;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;

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

    private Double index3;
    private String yAxis2;
    private Boolean yAxis3;

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

    private Double index4;
    private String yGrid2;
    private Boolean yGrid3;

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

    private Double indexOrValue1;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;

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
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale != null) ? yScale.generateJs() : "null")));
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
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}