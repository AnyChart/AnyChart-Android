package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class StockScroller extends UiScroller {

    public StockScroller() {

    }

    protected StockScroller(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StockScroller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

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

            js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", Arrays.toString(var_args2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", Arrays.toString(var_args2)));
                js.setLength(0);
            }
        }
    }

    private TableMapping mapping;
    private StockSeriesType seriesType;
    private String seriesType1;

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

            js.append(String.format(Locale.US, jsBase + ".adl(%s, %s);", (seriesType != null) ? seriesType.generateJs() : "null", (mapping != null) ? mapping.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s)", (seriesType != null) ? seriesType.generateJs() : "null", (mapping != null) ? mapping.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new ADL(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".adl(%s, %s);", seriesType1, (mapping != null) ? mapping.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".adl(%s, %s)", seriesType1, (mapping != null) ? mapping.generateJs() : "null"));
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

            js.append(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f);", (seriesType2 != null) ? seriesType2.generateJs() : "null", (mapping1 != null) ? mapping1.generateJs() : "null", period, fastPeriod, slowPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f)", (seriesType2 != null) ? seriesType2.generateJs() : "null", (mapping1 != null) ? mapping1.generateJs() : "null", period, fastPeriod, slowPeriod));
                js.setLength(0);
            }
        }
        return new AMA(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f);", seriesType3, (mapping1 != null) ? mapping1.generateJs() : "null", period, fastPeriod, slowPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ama(%s, %s, %f, %f, %f)", seriesType3, (mapping1 != null) ? mapping1.generateJs() : "null", period, fastPeriod, slowPeriod));
                js.setLength(0);
            }
        }
        return new AMA(jsBase);
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;
    private String csvSettings;

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

            js.append(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", (data != null) ? data.generateJs() : "null", mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s)", (data != null) ? data.generateJs() : "null", mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return new ScrollerseriesArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", (data1 != null) ? data1.generateJs() : "null", mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s)", (data1 != null) ? data1.generateJs() : "null", mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return new ScrollerseriesArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".area(%s, %s, %s);", data2, mappingSettings, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s, %s)", data2, mappingSettings, csvSettings));
                js.setLength(0);
            }
        }
        return new ScrollerseriesArea(jsBase);
    }

    private TableMapping mapping2;
    private Double period1;
    private StockSeriesType upSeriesType;
    private String upSeriesType1;
    private StockSeriesType downSeriesType;
    private String downSeriesType1;

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

            js.append(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f);", (upSeriesType != null) ? upSeriesType.generateJs() : "null", (downSeriesType != null) ? downSeriesType.generateJs() : "null", (mapping2 != null) ? mapping2.generateJs() : "null", period1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", (upSeriesType != null) ? upSeriesType.generateJs() : "null", (downSeriesType != null) ? downSeriesType.generateJs() : "null", (mapping2 != null) ? mapping2.generateJs() : "null", period1));
                js.setLength(0);
            }
        }
        return new Aroon(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f);", (upSeriesType != null) ? upSeriesType.generateJs() : "null", downSeriesType1, (mapping2 != null) ? mapping2.generateJs() : "null", period1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", (upSeriesType != null) ? upSeriesType.generateJs() : "null", downSeriesType1, (mapping2 != null) ? mapping2.generateJs() : "null", period1));
                js.setLength(0);
            }
        }
        return new Aroon(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f);", upSeriesType1, (downSeriesType != null) ? downSeriesType.generateJs() : "null", (mapping2 != null) ? mapping2.generateJs() : "null", period1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", upSeriesType1, (downSeriesType != null) ? downSeriesType.generateJs() : "null", (mapping2 != null) ? mapping2.generateJs() : "null", period1));
                js.setLength(0);
            }
        }
        return new Aroon(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f);", upSeriesType1, downSeriesType1, (mapping2 != null) ? mapping2.generateJs() : "null", period1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %f)", upSeriesType1, downSeriesType1, (mapping2 != null) ? mapping2.generateJs() : "null", period1));
                js.setLength(0);
            }
        }
        return new Aroon(jsBase);
    }

    private TableMapping mapping3;
    private Double period2;
    private StockSeriesType seriesType4;
    private String seriesType5;

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

            js.append(String.format(Locale.US, jsBase + ".atr(%s, %s, %f);", (seriesType4 != null) ? seriesType4.generateJs() : "null", (mapping3 != null) ? mapping3.generateJs() : "null", period2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %f)", (seriesType4 != null) ? seriesType4.generateJs() : "null", (mapping3 != null) ? mapping3.generateJs() : "null", period2));
                js.setLength(0);
            }
        }
        return new ATR(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".atr(%s, %s, %f);", seriesType5, (mapping3 != null) ? mapping3.generateJs() : "null", period2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".atr(%s, %s, %f)", seriesType5, (mapping3 != null) ? mapping3.generateJs() : "null", period2));
                js.setLength(0);
            }
        }
        return new ATR(jsBase);
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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", lowerSeriesType1, (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", lowerSeriesType1, (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", lowerSeriesType1, middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null", lowerSeriesType1, middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", upperSeriesType1, (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", upperSeriesType1, (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", upperSeriesType1, (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", upperSeriesType1, (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null", middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", upperSeriesType1, lowerSeriesType1, (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", upperSeriesType1, lowerSeriesType1, (middleSeriesType != null) ? middleSeriesType.generateJs() : "null", (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
                js.setLength(0);
            }
        }
        return new BBands(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f);", upperSeriesType1, lowerSeriesType1, middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %f, %f)", upperSeriesType1, lowerSeriesType1, middleSeriesType1, (mapping4 != null) ? mapping4.generateJs() : "null", period3, deviation));
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

            js.append(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f);", (seriesType6 != null) ? seriesType6.generateJs() : "null", (mapping5 != null) ? mapping5.generateJs() : "null", period4, deviation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f)", (seriesType6 != null) ? seriesType6.generateJs() : "null", (mapping5 != null) ? mapping5.generateJs() : "null", period4, deviation1));
                js.setLength(0);
            }
        }
        return new BBandsB(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f);", seriesType7, (mapping5 != null) ? mapping5.generateJs() : "null", period4, deviation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %f, %f)", seriesType7, (mapping5 != null) ? mapping5.generateJs() : "null", period4, deviation1));
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

            js.append(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f);", (seriesType8 != null) ? seriesType8.generateJs() : "null", (mapping6 != null) ? mapping6.generateJs() : "null", period5, deviation2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f)", (seriesType8 != null) ? seriesType8.generateJs() : "null", (mapping6 != null) ? mapping6.generateJs() : "null", period5, deviation2));
                js.setLength(0);
            }
        }
        return new BBandsWidth(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f);", seriesType9, (mapping6 != null) ? mapping6.generateJs() : "null", period5, deviation2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %f, %f)", seriesType9, (mapping6 != null) ? mapping6.generateJs() : "null", period5, deviation2));
                js.setLength(0);
            }
        }
        return new BBandsWidth(jsBase);
    }

    private TableMapping data4;
    private DataTable data5;
    private String data6;
    private String data7;
    private String mappingSettings1;
    private String csvSettings1;

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

            js.append(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", (data4 != null) ? data4.generateJs() : "null", mappingSettings1, csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s)", (data4 != null) ? data4.generateJs() : "null", mappingSettings1, csvSettings1));
                js.setLength(0);
            }
        }
        return new ScrollerseriesCandlestick(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", (data5 != null) ? data5.generateJs() : "null", mappingSettings1, csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s)", (data5 != null) ? data5.generateJs() : "null", mappingSettings1, csvSettings1));
                js.setLength(0);
            }
        }
        return new ScrollerseriesCandlestick(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s);", data6, mappingSettings1, csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s, %s)", data6, mappingSettings1, csvSettings1));
                js.setLength(0);
            }
        }
        return new ScrollerseriesCandlestick(jsBase);
    }

    private TableMapping mapping7;
    private Double period6;
    private StockSeriesType seriesType10;
    private String seriesType11;

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

            js.append(String.format(Locale.US, jsBase + ".cci(%s, %s, %f);", (seriesType10 != null) ? seriesType10.generateJs() : "null", (mapping7 != null) ? mapping7.generateJs() : "null", period6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %f)", (seriesType10 != null) ? seriesType10.generateJs() : "null", (mapping7 != null) ? mapping7.generateJs() : "null", period6));
                js.setLength(0);
            }
        }
        return new CCI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".cci(%s, %s, %f);", seriesType11, (mapping7 != null) ? mapping7.generateJs() : "null", period6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cci(%s, %s, %f)", seriesType11, (mapping7 != null) ? mapping7.generateJs() : "null", period6));
                js.setLength(0);
            }
        }
        return new CCI(jsBase);
    }

    private TableMapping mapping8;
    private Double fastPeriod1;
    private Double slowPeriod1;
    private String maType;
    private StockSeriesType seriesType12;
    private String seriesType13;

    public CHO cho(StockSeriesType seriesType12, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1, String maType) {
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
            this.maType = maType;
        } else {
            this.seriesType12 = seriesType12;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType = maType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cho(%s, %s, %f, %f, %s);", (seriesType12 != null) ? seriesType12.generateJs() : "null", (mapping8 != null) ? mapping8.generateJs() : "null", fastPeriod1, slowPeriod1, maType));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %f, %f, %s)", (seriesType12 != null) ? seriesType12.generateJs() : "null", (mapping8 != null) ? mapping8.generateJs() : "null", fastPeriod1, slowPeriod1, maType));
                js.setLength(0);
            }
        }
        return new CHO(jsBase);
    }


    public CHO cho(String seriesType13, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1, String maType) {
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
            this.maType = maType;
        } else {
            this.seriesType13 = seriesType13;
            this.mapping8 = mapping8;
            this.fastPeriod1 = fastPeriod1;
            this.slowPeriod1 = slowPeriod1;
            this.maType = maType;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cho(%s, %s, %f, %f, %s);", seriesType13, (mapping8 != null) ? mapping8.generateJs() : "null", fastPeriod1, slowPeriod1, maType));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cho(%s, %s, %f, %f, %s)", seriesType13, (mapping8 != null) ? mapping8.generateJs() : "null", fastPeriod1, slowPeriod1, maType));
                js.setLength(0);
            }
        }
        return new CHO(jsBase);
    }

    private TableMapping mapping9;
    private Double period7;
    private StockSeriesType seriesType14;
    private String seriesType15;

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

            js.append(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f);", (seriesType14 != null) ? seriesType14.generateJs() : "null", (mapping9 != null) ? mapping9.generateJs() : "null", period7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f)", (seriesType14 != null) ? seriesType14.generateJs() : "null", (mapping9 != null) ? mapping9.generateJs() : "null", period7));
                js.setLength(0);
            }
        }
        return new CMF(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f);", seriesType15, (mapping9 != null) ? mapping9.generateJs() : "null", period7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cmf(%s, %s, %f)", seriesType15, (mapping9 != null) ? mapping9.generateJs() : "null", period7));
                js.setLength(0);
            }
        }
        return new CMF(jsBase);
    }

    private TableMapping data8;
    private DataTable data9;
    private String data10;
    private String data11;
    private String mappingSettings2;
    private String csvSettings2;

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

            js.append(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", (data8 != null) ? data8.generateJs() : "null", mappingSettings2, csvSettings2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s)", (data8 != null) ? data8.generateJs() : "null", mappingSettings2, csvSettings2));
                js.setLength(0);
            }
        }
        return new ScrollerseriesColumn(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", (data9 != null) ? data9.generateJs() : "null", mappingSettings2, csvSettings2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s)", (data9 != null) ? data9.generateJs() : "null", mappingSettings2, csvSettings2));
                js.setLength(0);
            }
        }
        return new ScrollerseriesColumn(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".column(%s, %s, %s);", data10, mappingSettings2, csvSettings2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s, %s)", data10, mappingSettings2, csvSettings2));
                js.setLength(0);
            }
        }
        return new ScrollerseriesColumn(jsBase);
    }

    private StockSeriesType defaultSeriesType;
    private String defaultSeriesType1;

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

            js.append(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType1));
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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", ndiSeriesType1, (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", ndiSeriesType1, (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", ndiSeriesType1, adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null", ndiSeriesType1, adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", pdiSeriesType1, (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", pdiSeriesType1, (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", pdiSeriesType1, (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", pdiSeriesType1, (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null", adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", pdiSeriesType1, ndiSeriesType1, (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", pdiSeriesType1, ndiSeriesType1, (adxSeriesType != null) ? adxSeriesType.generateJs() : "null", (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b);", pdiSeriesType1, ndiSeriesType1, adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %f, %f, %b)", pdiSeriesType1, ndiSeriesType1, adxSeriesType1, (mapping10 != null) ? mapping10.generateJs() : "null", period8, adxPeriod, useWildersSmoothing));
                js.setLength(0);
            }
        }
        return new DMI(jsBase);
    }

    private TableMapping mapping11;
    private Double period9;
    private StockSeriesType seriesType16;
    private String seriesType17;

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

            js.append(String.format(Locale.US, jsBase + ".ema(%s, %s, %f);", (seriesType16 != null) ? seriesType16.generateJs() : "null", (mapping11 != null) ? mapping11.generateJs() : "null", period9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %f)", (seriesType16 != null) ? seriesType16.generateJs() : "null", (mapping11 != null) ? mapping11.generateJs() : "null", period9));
                js.setLength(0);
            }
        }
        return new EMA(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".ema(%s, %s, %f);", seriesType17, (mapping11 != null) ? mapping11.generateJs() : "null", period9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ema(%s, %s, %f)", seriesType17, (mapping11 != null) ? mapping11.generateJs() : "null", period9));
                js.setLength(0);
            }
        }
        return new EMA(jsBase);
    }

    private ScrollerseriesBase getGetSeries;

    public ScrollerseriesBase getGetSeries() {
        if (getGetSeries == null)
            getGetSeries = new ScrollerseriesBase(jsBase + ".getSeries()");

        return getGetSeries;
    }

    private ScrollerseriesBase getGetSeriesAt;

    public ScrollerseriesBase getGetSeriesAt() {
        if (getGetSeriesAt == null)
            getGetSeriesAt = new ScrollerseriesBase(jsBase + ".getSeriesAt()");

        return getGetSeriesAt;
    }

    private HatchFills getHatchFillPalette;

    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

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
                onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));
                js.setLength(0);
            }
        }
        return this;
    }


    public StockScroller hatchFillPalette(HatchFills hatchFillPalette2) {
        if (jsBase == null) {
            this.hatchFillPalette = null;
            this.hatchFillPalette1 = null;
            this.hatchFillPalette2 = null;
            
            this.hatchFillPalette2 = hatchFillPalette2;
        } else {
            this.hatchFillPalette2 = hatchFillPalette2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
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

            js.append(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", (data12 != null) ? data12.generateJs() : "null", mappingSettings3, csvSettings3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s)", (data12 != null) ? data12.generateJs() : "null", mappingSettings3, csvSettings3));
                js.setLength(0);
            }
        }
        return new ScrollerseriesHilo(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", (data13 != null) ? data13.generateJs() : "null", mappingSettings3, csvSettings3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s)", (data13 != null) ? data13.generateJs() : "null", mappingSettings3, csvSettings3));
                js.setLength(0);
            }
        }
        return new ScrollerseriesHilo(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s);", data14, mappingSettings3, csvSettings3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s, %s)", data14, mappingSettings3, csvSettings3));
                js.setLength(0);
            }
        }
        return new ScrollerseriesHilo(jsBase);
    }

    private TableMapping data16;
    private DataTable data17;
    private String data18;
    private String data19;
    private String mappingSettings4;
    private String csvSettings4;

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

            js.append(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", (data16 != null) ? data16.generateJs() : "null", mappingSettings4, csvSettings4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s)", (data16 != null) ? data16.generateJs() : "null", mappingSettings4, csvSettings4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesJumpLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", (data17 != null) ? data17.generateJs() : "null", mappingSettings4, csvSettings4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s)", (data17 != null) ? data17.generateJs() : "null", mappingSettings4, csvSettings4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesJumpLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s);", data18, mappingSettings4, csvSettings4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s, %s)", data18, mappingSettings4, csvSettings4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesJumpLine(jsBase);
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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", (kMAType != null) ? kMAType.generateJs() : "null", dMAType1, kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, (dMAType != null) ? dMAType.generateJs() : "null", kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, (kSeriesType != null) ? kSeriesType.generateJs() : "null", dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, kSeriesType1, (dSeriesType != null) ? dSeriesType.generateJs() : "null", jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, kSeriesType1, dSeriesType1, (jSeriesType != null) ? jSeriesType.generateJs() : "null", (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f);", kMAType1, dMAType1, kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %f, %f, %f, %f, %f)", kMAType1, dMAType1, kSeriesType1, dSeriesType1, jSeriesType1, (mapping12 != null) ? mapping12.generateJs() : "null", kPeriod, kMAPeriod, dPeriod, kMultiplier, dMultiplier));
                js.setLength(0);
            }
        }
        return new KDJ(jsBase);
    }

    private TableMapping data20;
    private DataTable data21;
    private String data22;
    private String data23;
    private String mappingSettings5;
    private String csvSettings5;

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

            js.append(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", (data20 != null) ? data20.generateJs() : "null", mappingSettings5, csvSettings5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s)", (data20 != null) ? data20.generateJs() : "null", mappingSettings5, csvSettings5));
                js.setLength(0);
            }
        }
        return new ScrollerseriesLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", (data21 != null) ? data21.generateJs() : "null", mappingSettings5, csvSettings5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s)", (data21 != null) ? data21.generateJs() : "null", mappingSettings5, csvSettings5));
                js.setLength(0);
            }
        }
        return new ScrollerseriesLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".line(%s, %s, %s);", data22, mappingSettings5, csvSettings5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s, %s)", data22, mappingSettings5, csvSettings5));
                js.setLength(0);
            }
        }
        return new ScrollerseriesLine(jsBase);
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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", signalSeriesType1, (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", signalSeriesType1, (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", signalSeriesType1, histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null", signalSeriesType1, histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", macdSeriesType1, (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", macdSeriesType1, (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", macdSeriesType1, (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", macdSeriesType1, (signalSeriesType != null) ? signalSeriesType.generateJs() : "null", histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", macdSeriesType1, signalSeriesType1, (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", macdSeriesType1, signalSeriesType1, (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null", (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f);", macdSeriesType1, signalSeriesType1, histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %f, %f, %f)", macdSeriesType1, signalSeriesType1, histogramSeriesType1, (mapping13 != null) ? mapping13.generateJs() : "null", fastPeriod2, slowPeriod2, signalPeriod));
                js.setLength(0);
            }
        }
        return new MACD(jsBase);
    }

    private TableMapping data24;
    private DataTable data25;
    private String data26;
    private String data27;
    private String mappingSettings6;
    private String csvSettings6;

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

            js.append(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", (data24 != null) ? data24.generateJs() : "null", mappingSettings6, csvSettings6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s)", (data24 != null) ? data24.generateJs() : "null", mappingSettings6, csvSettings6));
                js.setLength(0);
            }
        }
        return new ScrollerseriesMarker(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", (data25 != null) ? data25.generateJs() : "null", mappingSettings6, csvSettings6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s)", (data25 != null) ? data25.generateJs() : "null", mappingSettings6, csvSettings6));
                js.setLength(0);
            }
        }
        return new ScrollerseriesMarker(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".marker(%s, %s, %s);", data26, mappingSettings6, csvSettings6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s, %s)", data26, mappingSettings6, csvSettings6));
                js.setLength(0);
            }
        }
        return new ScrollerseriesMarker(jsBase);
    }

    private TableMapping mapping14;
    private Double period10;
    private StockSeriesType seriesType18;
    private String seriesType19;

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

            js.append(String.format(Locale.US, jsBase + ".mma(%s, %s, %f);", (seriesType18 != null) ? seriesType18.generateJs() : "null", (mapping14 != null) ? mapping14.generateJs() : "null", period10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %f)", (seriesType18 != null) ? seriesType18.generateJs() : "null", (mapping14 != null) ? mapping14.generateJs() : "null", period10));
                js.setLength(0);
            }
        }
        return new MMA(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".mma(%s, %s, %f);", seriesType19, (mapping14 != null) ? mapping14.generateJs() : "null", period10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mma(%s, %s, %f)", seriesType19, (mapping14 != null) ? mapping14.generateJs() : "null", period10));
                js.setLength(0);
            }
        }
        return new MMA(jsBase);
    }

    private TableMapping data28;
    private DataTable data29;
    private String data30;
    private String data31;
    private String mappingSettings7;
    private String csvSettings7;

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

            js.append(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", (data28 != null) ? data28.generateJs() : "null", mappingSettings7, csvSettings7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s)", (data28 != null) ? data28.generateJs() : "null", mappingSettings7, csvSettings7));
                js.setLength(0);
            }
        }
        return new ScrollerseriesOHLC(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", (data29 != null) ? data29.generateJs() : "null", mappingSettings7, csvSettings7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s)", (data29 != null) ? data29.generateJs() : "null", mappingSettings7, csvSettings7));
                js.setLength(0);
            }
        }
        return new ScrollerseriesOHLC(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s);", data30, mappingSettings7, csvSettings7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s, %s)", data30, mappingSettings7, csvSettings7));
                js.setLength(0);
            }
        }
        return new ScrollerseriesOHLC(jsBase);
    }

    private RangeColors getPalette;

    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

    public StockScroller setPalette(RangeColors palette) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette = palette;
        } else {
            this.palette = palette;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public StockScroller setPalette(DistinctColors palette1) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette1 = palette1;
        } else {
            this.palette1 = palette1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".palette(%s)", palette2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", palette2));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));
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

            js.append(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", (data32 != null) ? data32.generateJs() : "null", mappingSettings8, csvSettings8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s)", (data32 != null) ? data32.generateJs() : "null", mappingSettings8, csvSettings8));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", (data33 != null) ? data33.generateJs() : "null", mappingSettings8, csvSettings8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s)", (data33 != null) ? data33.generateJs() : "null", mappingSettings8, csvSettings8));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s);", data34, mappingSettings8, csvSettings8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s, %s)", data34, mappingSettings8, csvSettings8));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeArea(jsBase);
    }

    private TableMapping data36;
    private DataTable data37;
    private String data38;
    private String data39;
    private String mappingSettings9;
    private String csvSettings9;

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

            js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", (data36 != null) ? data36.generateJs() : "null", mappingSettings9, csvSettings9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s)", (data36 != null) ? data36.generateJs() : "null", mappingSettings9, csvSettings9));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeColumn(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", (data37 != null) ? data37.generateJs() : "null", mappingSettings9, csvSettings9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s)", (data37 != null) ? data37.generateJs() : "null", mappingSettings9, csvSettings9));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeColumn(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s);", data38, mappingSettings9, csvSettings9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s, %s)", data38, mappingSettings9, csvSettings9));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeColumn(jsBase);
    }

    private TableMapping data40;
    private DataTable data41;
    private String data42;
    private String data43;
    private String mappingSettings10;
    private String csvSettings10;

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

            js.append(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", (data40 != null) ? data40.generateJs() : "null", mappingSettings10, csvSettings10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s)", (data40 != null) ? data40.generateJs() : "null", mappingSettings10, csvSettings10));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeSplineArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", (data41 != null) ? data41.generateJs() : "null", mappingSettings10, csvSettings10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s)", (data41 != null) ? data41.generateJs() : "null", mappingSettings10, csvSettings10));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeSplineArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s);", data42, mappingSettings10, csvSettings10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s, %s)", data42, mappingSettings10, csvSettings10));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeSplineArea(jsBase);
    }

    private TableMapping data44;
    private DataTable data45;
    private String data46;
    private String data47;
    private String mappingSettings11;
    private String csvSettings11;

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

            js.append(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", (data44 != null) ? data44.generateJs() : "null", mappingSettings11, csvSettings11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s)", (data44 != null) ? data44.generateJs() : "null", mappingSettings11, csvSettings11));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeStepArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", (data45 != null) ? data45.generateJs() : "null", mappingSettings11, csvSettings11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s)", (data45 != null) ? data45.generateJs() : "null", mappingSettings11, csvSettings11));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeStepArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s);", data46, mappingSettings11, csvSettings11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s, %s)", data46, mappingSettings11, csvSettings11));
                js.setLength(0);
            }
        }
        return new ScrollerseriesRangeStepArea(jsBase);
    }

    private Double id;
    private String id1;

    public StockScroller removeSeries(Double id) {
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

            js.append(String.format(Locale.US, ".removeSeries(%s)", id1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;

    public StockScroller removeSeriesAt(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mapping15;
    private Double period11;
    private StockSeriesType seriesType20;
    private String seriesType21;

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

            js.append(String.format(Locale.US, jsBase + ".roc(%s, %s, %f);", (seriesType20 != null) ? seriesType20.generateJs() : "null", (mapping15 != null) ? mapping15.generateJs() : "null", period11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %f)", (seriesType20 != null) ? seriesType20.generateJs() : "null", (mapping15 != null) ? mapping15.generateJs() : "null", period11));
                js.setLength(0);
            }
        }
        return new RoC(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".roc(%s, %s, %f);", seriesType21, (mapping15 != null) ? mapping15.generateJs() : "null", period11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roc(%s, %s, %f)", seriesType21, (mapping15 != null) ? mapping15.generateJs() : "null", period11));
                js.setLength(0);
            }
        }
        return new RoC(jsBase);
    }

    private TableMapping mapping16;
    private Double period12;
    private StockSeriesType seriesType22;
    private String seriesType23;

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

            js.append(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f);", (seriesType22 != null) ? seriesType22.generateJs() : "null", (mapping16 != null) ? mapping16.generateJs() : "null", period12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f)", (seriesType22 != null) ? seriesType22.generateJs() : "null", (mapping16 != null) ? mapping16.generateJs() : "null", period12));
                js.setLength(0);
            }
        }
        return new RSI(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f);", seriesType23, (mapping16 != null) ? mapping16.generateJs() : "null", period12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rsi(%s, %s, %f)", seriesType23, (mapping16 != null) ? mapping16.generateJs() : "null", period12));
                js.setLength(0);
            }
        }
        return new RSI(jsBase);
    }

    private TableMapping mapping17;
    private Double period13;
    private StockSeriesType seriesType24;
    private String seriesType25;

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

            js.append(String.format(Locale.US, jsBase + ".sma(%s, %s, %f);", (seriesType24 != null) ? seriesType24.generateJs() : "null", (mapping17 != null) ? mapping17.generateJs() : "null", period13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %f)", (seriesType24 != null) ? seriesType24.generateJs() : "null", (mapping17 != null) ? mapping17.generateJs() : "null", period13));
                js.setLength(0);
            }
        }
        return new SMA(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".sma(%s, %s, %f);", seriesType25, (mapping17 != null) ? mapping17.generateJs() : "null", period13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sma(%s, %s, %f)", seriesType25, (mapping17 != null) ? mapping17.generateJs() : "null", period13));
                js.setLength(0);
            }
        }
        return new SMA(jsBase);
    }

    private TableMapping data48;
    private DataTable data49;
    private String data50;
    private String data51;
    private String mappingSettings12;
    private String csvSettings12;

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

            js.append(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", (data48 != null) ? data48.generateJs() : "null", mappingSettings12, csvSettings12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s)", (data48 != null) ? data48.generateJs() : "null", mappingSettings12, csvSettings12));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSpline(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", (data49 != null) ? data49.generateJs() : "null", mappingSettings12, csvSettings12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s)", (data49 != null) ? data49.generateJs() : "null", mappingSettings12, csvSettings12));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSpline(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".spline(%s, %s, %s);", data50, mappingSettings12, csvSettings12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s, %s)", data50, mappingSettings12, csvSettings12));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSpline(jsBase);
    }

    private TableMapping data52;
    private DataTable data53;
    private String data54;
    private String data55;
    private String mappingSettings13;
    private String csvSettings13;

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

            js.append(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", (data52 != null) ? data52.generateJs() : "null", mappingSettings13, csvSettings13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s)", (data52 != null) ? data52.generateJs() : "null", mappingSettings13, csvSettings13));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSplineArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", (data53 != null) ? data53.generateJs() : "null", mappingSettings13, csvSettings13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s)", (data53 != null) ? data53.generateJs() : "null", mappingSettings13, csvSettings13));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSplineArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s);", data54, mappingSettings13, csvSettings13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s, %s)", data54, mappingSettings13, csvSettings13));
                js.setLength(0);
            }
        }
        return new ScrollerseriesSplineArea(jsBase);
    }

    private TableMapping data56;
    private DataTable data57;
    private String data58;
    private String data59;
    private String mappingSettings14;
    private String csvSettings14;

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

            js.append(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", (data56 != null) ? data56.generateJs() : "null", mappingSettings14, csvSettings14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s)", (data56 != null) ? data56.generateJs() : "null", mappingSettings14, csvSettings14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", (data57 != null) ? data57.generateJs() : "null", mappingSettings14, csvSettings14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s)", (data57 != null) ? data57.generateJs() : "null", mappingSettings14, csvSettings14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepArea(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s);", data58, mappingSettings14, csvSettings14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s, %s)", data58, mappingSettings14, csvSettings14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepArea(jsBase);
    }

    private TableMapping data60;
    private DataTable data61;
    private String data62;
    private String data63;
    private String mappingSettings15;
    private String csvSettings15;

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

            js.append(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", (data60 != null) ? data60.generateJs() : "null", mappingSettings15, csvSettings15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s)", (data60 != null) ? data60.generateJs() : "null", mappingSettings15, csvSettings15));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", (data61 != null) ? data61.generateJs() : "null", mappingSettings15, csvSettings15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s)", (data61 != null) ? data61.generateJs() : "null", mappingSettings15, csvSettings15));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepLine(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s);", data62, mappingSettings15, csvSettings15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s, %s)", data62, mappingSettings15, csvSettings15));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStepLine(jsBase);
    }

    private TableMapping data64;
    private DataTable data65;
    private String data66;
    private String data67;
    private String mappingSettings16;
    private String csvSettings16;

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

            js.append(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", (data64 != null) ? data64.generateJs() : "null", mappingSettings16, csvSettings16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s)", (data64 != null) ? data64.generateJs() : "null", mappingSettings16, csvSettings16));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStick(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", (data65 != null) ? data65.generateJs() : "null", mappingSettings16, csvSettings16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s)", (data65 != null) ? data65.generateJs() : "null", mappingSettings16, csvSettings16));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStick(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stick(%s, %s, %s);", data66, mappingSettings16, csvSettings16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s, %s)", data66, mappingSettings16, csvSettings16));
                js.setLength(0);
            }
        }
        return new ScrollerseriesStick(jsBase);
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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", (kMAType2 != null) ? kMAType2.generateJs() : "null", dMAType3, kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, (dMAType2 != null) ? dMAType2.generateJs() : "null", kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, dMAType3, (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null", dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, dMAType3, kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, dMAType3, kSeriesType3, (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null", (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f);", kMAType3, dMAType3, kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %f, %f, %f)", kMAType3, dMAType3, kSeriesType3, dSeriesType3, (mapping18 != null) ? mapping18.generateJs() : "null", kPeriod1, kMAPeriod1, dPeriod1));
                js.setLength(0);
            }
        }
        return new Stochastic(jsBase);
    }

    private StockDateTime getXAxis;

    public StockDateTime getXAxis() {
        if (getXAxis == null)
            getXAxis = new StockDateTime(jsBase + ".xAxis()");

        return getXAxis;
    }

    private String xAxis;
    private Boolean xAxis1;

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

            js.append(String.format(Locale.US, ".xAxis(%s)", xAxis));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", xAxis));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterBase getYScale;

    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterScaleTypes yScale;
    private String yScale1;
    private ScatterBase yScale2;
    private String yScale3;

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

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".yScale(%s)", yScale1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale1));
                js.setLength(0);
            }
        }
        return this;
    }


    public StockScroller setYScale(ScatterBase yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetGetSeries() {
        if (getGetSeries != null) {
            return getGetSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeriesAt() {
        if (getGetSeriesAt != null) {
            return getGetSeriesAt.generateJs();
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

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args != null) ? var_args.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args1 != null) ? var_args1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %s,", Arrays.toString(var_args2));
        }
        return "";
    }

    private String generateJSmapping() {
        if (mapping != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping != null) ? mapping.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType() {
        if (seriesType != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType != null) ? seriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType1() {
        if (seriesType1 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType1);
        }
        return "";
    }

    private String generateJSmapping1() {
        if (mapping1 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping1 != null) ? mapping1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJSfastPeriod() {
        if (fastPeriod != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod);
        }
        return "";
    }

    private String generateJSslowPeriod() {
        if (slowPeriod != null) {
            return String.format(Locale.US, "slowPeriod: %f,", slowPeriod);
        }
        return "";
    }

    private String generateJSseriesType2() {
        if (seriesType2 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType2 != null) ? seriesType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType3() {
        if (seriesType3 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType3);
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", (data != null) ? data.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", (data1 != null) ? data1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata2() {
        if (data2 != null) {
            return String.format(Locale.US, "data: %s,", data2);
        }
        return "";
    }

    private String generateJSdata3() {
        if (data3 != null) {
            return String.format(Locale.US, "data: %s,", data3);
        }
        return "";
    }

    private String generateJSmappingSettings() {
        if (mappingSettings != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJSmapping2() {
        if (mapping2 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping2 != null) ? mapping2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod1() {
        if (period1 != null) {
            return String.format(Locale.US, "period: %f,", period1);
        }
        return "";
    }

    private String generateJSupSeriesType() {
        if (upSeriesType != null) {
            return String.format(Locale.US, "upSeriesType: %s,", (upSeriesType != null) ? upSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSupSeriesType1() {
        if (upSeriesType1 != null) {
            return String.format(Locale.US, "upSeriesType: %s,", upSeriesType1);
        }
        return "";
    }

    private String generateJSdownSeriesType() {
        if (downSeriesType != null) {
            return String.format(Locale.US, "downSeriesType: %s,", (downSeriesType != null) ? downSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdownSeriesType1() {
        if (downSeriesType1 != null) {
            return String.format(Locale.US, "downSeriesType: %s,", downSeriesType1);
        }
        return "";
    }

    private String generateJSmapping3() {
        if (mapping3 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping3 != null) ? mapping3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod2() {
        if (period2 != null) {
            return String.format(Locale.US, "period: %f,", period2);
        }
        return "";
    }

    private String generateJSseriesType4() {
        if (seriesType4 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType4 != null) ? seriesType4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType5() {
        if (seriesType5 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType5);
        }
        return "";
    }

    private String generateJSmapping4() {
        if (mapping4 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping4 != null) ? mapping4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod3() {
        if (period3 != null) {
            return String.format(Locale.US, "period: %f,", period3);
        }
        return "";
    }

    private String generateJSdeviation() {
        if (deviation != null) {
            return String.format(Locale.US, "deviation: %f,", deviation);
        }
        return "";
    }

    private String generateJSupperSeriesType() {
        if (upperSeriesType != null) {
            return String.format(Locale.US, "upperSeriesType: %s,", (upperSeriesType != null) ? upperSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSupperSeriesType1() {
        if (upperSeriesType1 != null) {
            return String.format(Locale.US, "upperSeriesType: %s,", upperSeriesType1);
        }
        return "";
    }

    private String generateJSlowerSeriesType() {
        if (lowerSeriesType != null) {
            return String.format(Locale.US, "lowerSeriesType: %s,", (lowerSeriesType != null) ? lowerSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlowerSeriesType1() {
        if (lowerSeriesType1 != null) {
            return String.format(Locale.US, "lowerSeriesType: %s,", lowerSeriesType1);
        }
        return "";
    }

    private String generateJSmiddleSeriesType() {
        if (middleSeriesType != null) {
            return String.format(Locale.US, "middleSeriesType: %s,", (middleSeriesType != null) ? middleSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmiddleSeriesType1() {
        if (middleSeriesType1 != null) {
            return String.format(Locale.US, "middleSeriesType: %s,", middleSeriesType1);
        }
        return "";
    }

    private String generateJSmapping5() {
        if (mapping5 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping5 != null) ? mapping5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod4() {
        if (period4 != null) {
            return String.format(Locale.US, "period: %f,", period4);
        }
        return "";
    }

    private String generateJSdeviation1() {
        if (deviation1 != null) {
            return String.format(Locale.US, "deviation: %f,", deviation1);
        }
        return "";
    }

    private String generateJSseriesType6() {
        if (seriesType6 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType6 != null) ? seriesType6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType7() {
        if (seriesType7 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType7);
        }
        return "";
    }

    private String generateJSmapping6() {
        if (mapping6 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping6 != null) ? mapping6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod5() {
        if (period5 != null) {
            return String.format(Locale.US, "period: %f,", period5);
        }
        return "";
    }

    private String generateJSdeviation2() {
        if (deviation2 != null) {
            return String.format(Locale.US, "deviation: %f,", deviation2);
        }
        return "";
    }

    private String generateJSseriesType8() {
        if (seriesType8 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType8 != null) ? seriesType8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType9() {
        if (seriesType9 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType9);
        }
        return "";
    }

    private String generateJSdata4() {
        if (data4 != null) {
            return String.format(Locale.US, "data: %s,", (data4 != null) ? data4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata5() {
        if (data5 != null) {
            return String.format(Locale.US, "data: %s,", (data5 != null) ? data5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata6() {
        if (data6 != null) {
            return String.format(Locale.US, "data: %s,", data6);
        }
        return "";
    }

    private String generateJSdata7() {
        if (data7 != null) {
            return String.format(Locale.US, "data: %s,", data7);
        }
        return "";
    }

    private String generateJSmappingSettings1() {
        if (mappingSettings1 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings1);
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings1);
        }
        return "";
    }

    private String generateJSmapping7() {
        if (mapping7 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping7 != null) ? mapping7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod6() {
        if (period6 != null) {
            return String.format(Locale.US, "period: %f,", period6);
        }
        return "";
    }

    private String generateJSseriesType10() {
        if (seriesType10 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType10 != null) ? seriesType10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType11() {
        if (seriesType11 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType11);
        }
        return "";
    }

    private String generateJSmapping8() {
        if (mapping8 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping8 != null) ? mapping8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfastPeriod1() {
        if (fastPeriod1 != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod1);
        }
        return "";
    }

    private String generateJSslowPeriod1() {
        if (slowPeriod1 != null) {
            return String.format(Locale.US, "slowPeriod: %f,", slowPeriod1);
        }
        return "";
    }

    private String generateJSmaType() {
        if (maType != null) {
            return String.format(Locale.US, "maType: %s,", maType);
        }
        return "";
    }

    private String generateJSseriesType12() {
        if (seriesType12 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType12 != null) ? seriesType12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType13() {
        if (seriesType13 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType13);
        }
        return "";
    }

    private String generateJSmapping9() {
        if (mapping9 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping9 != null) ? mapping9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod7() {
        if (period7 != null) {
            return String.format(Locale.US, "period: %f,", period7);
        }
        return "";
    }

    private String generateJSseriesType14() {
        if (seriesType14 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType14 != null) ? seriesType14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType15() {
        if (seriesType15 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType15);
        }
        return "";
    }

    private String generateJSdata8() {
        if (data8 != null) {
            return String.format(Locale.US, "data: %s,", (data8 != null) ? data8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata9() {
        if (data9 != null) {
            return String.format(Locale.US, "data: %s,", (data9 != null) ? data9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata10() {
        if (data10 != null) {
            return String.format(Locale.US, "data: %s,", data10);
        }
        return "";
    }

    private String generateJSdata11() {
        if (data11 != null) {
            return String.format(Locale.US, "data: %s,", data11);
        }
        return "";
    }

    private String generateJSmappingSettings2() {
        if (mappingSettings2 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings2);
        }
        return "";
    }

    private String generateJScsvSettings2() {
        if (csvSettings2 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings2);
        }
        return "";
    }

    private String generateJSdefaultSeriesType() {
        if (defaultSeriesType != null) {
            return String.format(Locale.US, "defaultSeriesType: %s,", (defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdefaultSeriesType1() {
        if (defaultSeriesType1 != null) {
            return String.format(Locale.US, "defaultSeriesType: %s,", defaultSeriesType1);
        }
        return "";
    }

    private String generateJSmapping10() {
        if (mapping10 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping10 != null) ? mapping10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod8() {
        if (period8 != null) {
            return String.format(Locale.US, "period: %f,", period8);
        }
        return "";
    }

    private String generateJSadxPeriod() {
        if (adxPeriod != null) {
            return String.format(Locale.US, "adxPeriod: %f,", adxPeriod);
        }
        return "";
    }

    private String generateJSuseWildersSmoothing() {
        if (useWildersSmoothing != null) {
            return String.format(Locale.US, "useWildersSmoothing: %b,", useWildersSmoothing);
        }
        return "";
    }

    private String generateJSpdiSeriesType() {
        if (pdiSeriesType != null) {
            return String.format(Locale.US, "pdiSeriesType: %s,", (pdiSeriesType != null) ? pdiSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpdiSeriesType1() {
        if (pdiSeriesType1 != null) {
            return String.format(Locale.US, "pdiSeriesType: %s,", pdiSeriesType1);
        }
        return "";
    }

    private String generateJSndiSeriesType() {
        if (ndiSeriesType != null) {
            return String.format(Locale.US, "ndiSeriesType: %s,", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSndiSeriesType1() {
        if (ndiSeriesType1 != null) {
            return String.format(Locale.US, "ndiSeriesType: %s,", ndiSeriesType1);
        }
        return "";
    }

    private String generateJSadxSeriesType() {
        if (adxSeriesType != null) {
            return String.format(Locale.US, "adxSeriesType: %s,", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSadxSeriesType1() {
        if (adxSeriesType1 != null) {
            return String.format(Locale.US, "adxSeriesType: %s,", adxSeriesType1);
        }
        return "";
    }

    private String generateJSmapping11() {
        if (mapping11 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping11 != null) ? mapping11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod9() {
        if (period9 != null) {
            return String.format(Locale.US, "period: %f,", period9);
        }
        return "";
    }

    private String generateJSseriesType16() {
        if (seriesType16 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType16 != null) ? seriesType16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType17() {
        if (seriesType17 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType17);
        }
        return "";
    }

    private String generateJShatchFillPalette() {
        if (hatchFillPalette != null) {
            return String.format(Locale.US, "hatchFillPalette: %s,", arrayToString(hatchFillPalette));
        }
        return "";
    }

    private String generateJShatchFillPalette1() {
        if (hatchFillPalette1 != null) {
            return String.format(Locale.US, "hatchFillPalette: %s,", hatchFillPalette1);
        }
        return "";
    }

    private String generateJShatchFillPalette2() {
        if (hatchFillPalette2 != null) {
            return String.format(Locale.US, "hatchFillPalette: %s,", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata12() {
        if (data12 != null) {
            return String.format(Locale.US, "data: %s,", (data12 != null) ? data12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata13() {
        if (data13 != null) {
            return String.format(Locale.US, "data: %s,", (data13 != null) ? data13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata14() {
        if (data14 != null) {
            return String.format(Locale.US, "data: %s,", data14);
        }
        return "";
    }

    private String generateJSdata15() {
        if (data15 != null) {
            return String.format(Locale.US, "data: %s,", data15);
        }
        return "";
    }

    private String generateJSmappingSettings3() {
        if (mappingSettings3 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings3);
        }
        return "";
    }

    private String generateJScsvSettings3() {
        if (csvSettings3 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings3);
        }
        return "";
    }

    private String generateJSdata16() {
        if (data16 != null) {
            return String.format(Locale.US, "data: %s,", (data16 != null) ? data16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata17() {
        if (data17 != null) {
            return String.format(Locale.US, "data: %s,", (data17 != null) ? data17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata18() {
        if (data18 != null) {
            return String.format(Locale.US, "data: %s,", data18);
        }
        return "";
    }

    private String generateJSdata19() {
        if (data19 != null) {
            return String.format(Locale.US, "data: %s,", data19);
        }
        return "";
    }

    private String generateJSmappingSettings4() {
        if (mappingSettings4 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings4);
        }
        return "";
    }

    private String generateJScsvSettings4() {
        if (csvSettings4 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings4);
        }
        return "";
    }

    private String generateJSmapping12() {
        if (mapping12 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping12 != null) ? mapping12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkPeriod() {
        if (kPeriod != null) {
            return String.format(Locale.US, "kPeriod: %f,", kPeriod);
        }
        return "";
    }

    private String generateJSkMAPeriod() {
        if (kMAPeriod != null) {
            return String.format(Locale.US, "kMAPeriod: %f,", kMAPeriod);
        }
        return "";
    }

    private String generateJSdPeriod() {
        if (dPeriod != null) {
            return String.format(Locale.US, "dPeriod: %f,", dPeriod);
        }
        return "";
    }

    private String generateJSkMAType() {
        if (kMAType != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType != null) ? kMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkMAType1() {
        if (kMAType1 != null) {
            return String.format(Locale.US, "kMAType: %s,", kMAType1);
        }
        return "";
    }

    private String generateJSdMAType() {
        if (dMAType != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType != null) ? dMAType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdMAType1() {
        if (dMAType1 != null) {
            return String.format(Locale.US, "dMAType: %s,", dMAType1);
        }
        return "";
    }

    private String generateJSkMultiplier() {
        if (kMultiplier != null) {
            return String.format(Locale.US, "kMultiplier: %f,", kMultiplier);
        }
        return "";
    }

    private String generateJSdMultiplier() {
        if (dMultiplier != null) {
            return String.format(Locale.US, "dMultiplier: %f,", dMultiplier);
        }
        return "";
    }

    private String generateJSkSeriesType() {
        if (kSeriesType != null) {
            return String.format(Locale.US, "kSeriesType: %s,", (kSeriesType != null) ? kSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkSeriesType1() {
        if (kSeriesType1 != null) {
            return String.format(Locale.US, "kSeriesType: %s,", kSeriesType1);
        }
        return "";
    }

    private String generateJSdSeriesType() {
        if (dSeriesType != null) {
            return String.format(Locale.US, "dSeriesType: %s,", (dSeriesType != null) ? dSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdSeriesType1() {
        if (dSeriesType1 != null) {
            return String.format(Locale.US, "dSeriesType: %s,", dSeriesType1);
        }
        return "";
    }

    private String generateJSjSeriesType() {
        if (jSeriesType != null) {
            return String.format(Locale.US, "jSeriesType: %s,", (jSeriesType != null) ? jSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSjSeriesType1() {
        if (jSeriesType1 != null) {
            return String.format(Locale.US, "jSeriesType: %s,", jSeriesType1);
        }
        return "";
    }

    private String generateJSdata20() {
        if (data20 != null) {
            return String.format(Locale.US, "data: %s,", (data20 != null) ? data20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata21() {
        if (data21 != null) {
            return String.format(Locale.US, "data: %s,", (data21 != null) ? data21.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata22() {
        if (data22 != null) {
            return String.format(Locale.US, "data: %s,", data22);
        }
        return "";
    }

    private String generateJSdata23() {
        if (data23 != null) {
            return String.format(Locale.US, "data: %s,", data23);
        }
        return "";
    }

    private String generateJSmappingSettings5() {
        if (mappingSettings5 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings5);
        }
        return "";
    }

    private String generateJScsvSettings5() {
        if (csvSettings5 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings5);
        }
        return "";
    }

    private String generateJSmapping13() {
        if (mapping13 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping13 != null) ? mapping13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfastPeriod2() {
        if (fastPeriod2 != null) {
            return String.format(Locale.US, "fastPeriod: %f,", fastPeriod2);
        }
        return "";
    }

    private String generateJSslowPeriod2() {
        if (slowPeriod2 != null) {
            return String.format(Locale.US, "slowPeriod: %f,", slowPeriod2);
        }
        return "";
    }

    private String generateJSsignalPeriod() {
        if (signalPeriod != null) {
            return String.format(Locale.US, "signalPeriod: %f,", signalPeriod);
        }
        return "";
    }

    private String generateJSmacdSeriesType() {
        if (macdSeriesType != null) {
            return String.format(Locale.US, "macdSeriesType: %s,", (macdSeriesType != null) ? macdSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmacdSeriesType1() {
        if (macdSeriesType1 != null) {
            return String.format(Locale.US, "macdSeriesType: %s,", macdSeriesType1);
        }
        return "";
    }

    private String generateJSsignalSeriesType() {
        if (signalSeriesType != null) {
            return String.format(Locale.US, "signalSeriesType: %s,", (signalSeriesType != null) ? signalSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsignalSeriesType1() {
        if (signalSeriesType1 != null) {
            return String.format(Locale.US, "signalSeriesType: %s,", signalSeriesType1);
        }
        return "";
    }

    private String generateJShistogramSeriesType() {
        if (histogramSeriesType != null) {
            return String.format(Locale.US, "histogramSeriesType: %s,", (histogramSeriesType != null) ? histogramSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJShistogramSeriesType1() {
        if (histogramSeriesType1 != null) {
            return String.format(Locale.US, "histogramSeriesType: %s,", histogramSeriesType1);
        }
        return "";
    }

    private String generateJSdata24() {
        if (data24 != null) {
            return String.format(Locale.US, "data: %s,", (data24 != null) ? data24.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata25() {
        if (data25 != null) {
            return String.format(Locale.US, "data: %s,", (data25 != null) ? data25.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata26() {
        if (data26 != null) {
            return String.format(Locale.US, "data: %s,", data26);
        }
        return "";
    }

    private String generateJSdata27() {
        if (data27 != null) {
            return String.format(Locale.US, "data: %s,", data27);
        }
        return "";
    }

    private String generateJSmappingSettings6() {
        if (mappingSettings6 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings6);
        }
        return "";
    }

    private String generateJScsvSettings6() {
        if (csvSettings6 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings6);
        }
        return "";
    }

    private String generateJSmapping14() {
        if (mapping14 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping14 != null) ? mapping14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod10() {
        if (period10 != null) {
            return String.format(Locale.US, "period: %f,", period10);
        }
        return "";
    }

    private String generateJSseriesType18() {
        if (seriesType18 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType18 != null) ? seriesType18.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType19() {
        if (seriesType19 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType19);
        }
        return "";
    }

    private String generateJSdata28() {
        if (data28 != null) {
            return String.format(Locale.US, "data: %s,", (data28 != null) ? data28.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata29() {
        if (data29 != null) {
            return String.format(Locale.US, "data: %s,", (data29 != null) ? data29.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata30() {
        if (data30 != null) {
            return String.format(Locale.US, "data: %s,", data30);
        }
        return "";
    }

    private String generateJSdata31() {
        if (data31 != null) {
            return String.format(Locale.US, "data: %s,", data31);
        }
        return "";
    }

    private String generateJSmappingSettings7() {
        if (mappingSettings7 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings7);
        }
        return "";
    }

    private String generateJScsvSettings7() {
        if (csvSettings7 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings7);
        }
        return "";
    }

    private String generateJSpalette() {
        if (palette != null) {
            return String.format(Locale.US, "palette: %s,", (palette != null) ? palette.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpalette1() {
        if (palette1 != null) {
            return String.format(Locale.US, "palette: %s,", (palette1 != null) ? palette1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpalette2() {
        if (palette2 != null) {
            return String.format(Locale.US, "palette: %s,", palette2);
        }
        return "";
    }

    private String generateJSpalette3() {
        if (palette3 != null) {
            return String.format(Locale.US, "palette: %s,", Arrays.toString(palette3));
        }
        return "";
    }

    private String generateJSdata32() {
        if (data32 != null) {
            return String.format(Locale.US, "data: %s,", (data32 != null) ? data32.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata33() {
        if (data33 != null) {
            return String.format(Locale.US, "data: %s,", (data33 != null) ? data33.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata34() {
        if (data34 != null) {
            return String.format(Locale.US, "data: %s,", data34);
        }
        return "";
    }

    private String generateJSdata35() {
        if (data35 != null) {
            return String.format(Locale.US, "data: %s,", data35);
        }
        return "";
    }

    private String generateJSmappingSettings8() {
        if (mappingSettings8 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings8);
        }
        return "";
    }

    private String generateJScsvSettings8() {
        if (csvSettings8 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings8);
        }
        return "";
    }

    private String generateJSdata36() {
        if (data36 != null) {
            return String.format(Locale.US, "data: %s,", (data36 != null) ? data36.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata37() {
        if (data37 != null) {
            return String.format(Locale.US, "data: %s,", (data37 != null) ? data37.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata38() {
        if (data38 != null) {
            return String.format(Locale.US, "data: %s,", data38);
        }
        return "";
    }

    private String generateJSdata39() {
        if (data39 != null) {
            return String.format(Locale.US, "data: %s,", data39);
        }
        return "";
    }

    private String generateJSmappingSettings9() {
        if (mappingSettings9 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings9);
        }
        return "";
    }

    private String generateJScsvSettings9() {
        if (csvSettings9 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings9);
        }
        return "";
    }

    private String generateJSdata40() {
        if (data40 != null) {
            return String.format(Locale.US, "data: %s,", (data40 != null) ? data40.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata41() {
        if (data41 != null) {
            return String.format(Locale.US, "data: %s,", (data41 != null) ? data41.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata42() {
        if (data42 != null) {
            return String.format(Locale.US, "data: %s,", data42);
        }
        return "";
    }

    private String generateJSdata43() {
        if (data43 != null) {
            return String.format(Locale.US, "data: %s,", data43);
        }
        return "";
    }

    private String generateJSmappingSettings10() {
        if (mappingSettings10 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings10);
        }
        return "";
    }

    private String generateJScsvSettings10() {
        if (csvSettings10 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings10);
        }
        return "";
    }

    private String generateJSdata44() {
        if (data44 != null) {
            return String.format(Locale.US, "data: %s,", (data44 != null) ? data44.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata45() {
        if (data45 != null) {
            return String.format(Locale.US, "data: %s,", (data45 != null) ? data45.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata46() {
        if (data46 != null) {
            return String.format(Locale.US, "data: %s,", data46);
        }
        return "";
    }

    private String generateJSdata47() {
        if (data47 != null) {
            return String.format(Locale.US, "data: %s,", data47);
        }
        return "";
    }

    private String generateJSmappingSettings11() {
        if (mappingSettings11 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings11);
        }
        return "";
    }

    private String generateJScsvSettings11() {
        if (csvSettings11 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings11);
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %f,", id);
        }
        return "";
    }

    private String generateJSid1() {
        if (id1 != null) {
            return String.format(Locale.US, "id: %s,", id1);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSmapping15() {
        if (mapping15 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping15 != null) ? mapping15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod11() {
        if (period11 != null) {
            return String.format(Locale.US, "period: %f,", period11);
        }
        return "";
    }

    private String generateJSseriesType20() {
        if (seriesType20 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType20 != null) ? seriesType20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType21() {
        if (seriesType21 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType21);
        }
        return "";
    }

    private String generateJSmapping16() {
        if (mapping16 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping16 != null) ? mapping16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod12() {
        if (period12 != null) {
            return String.format(Locale.US, "period: %f,", period12);
        }
        return "";
    }

    private String generateJSseriesType22() {
        if (seriesType22 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType22 != null) ? seriesType22.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType23() {
        if (seriesType23 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType23);
        }
        return "";
    }

    private String generateJSmapping17() {
        if (mapping17 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping17 != null) ? mapping17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSperiod13() {
        if (period13 != null) {
            return String.format(Locale.US, "period: %f,", period13);
        }
        return "";
    }

    private String generateJSseriesType24() {
        if (seriesType24 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType24 != null) ? seriesType24.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType25() {
        if (seriesType25 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType25);
        }
        return "";
    }

    private String generateJSdata48() {
        if (data48 != null) {
            return String.format(Locale.US, "data: %s,", (data48 != null) ? data48.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata49() {
        if (data49 != null) {
            return String.format(Locale.US, "data: %s,", (data49 != null) ? data49.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata50() {
        if (data50 != null) {
            return String.format(Locale.US, "data: %s,", data50);
        }
        return "";
    }

    private String generateJSdata51() {
        if (data51 != null) {
            return String.format(Locale.US, "data: %s,", data51);
        }
        return "";
    }

    private String generateJSmappingSettings12() {
        if (mappingSettings12 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings12);
        }
        return "";
    }

    private String generateJScsvSettings12() {
        if (csvSettings12 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings12);
        }
        return "";
    }

    private String generateJSdata52() {
        if (data52 != null) {
            return String.format(Locale.US, "data: %s,", (data52 != null) ? data52.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata53() {
        if (data53 != null) {
            return String.format(Locale.US, "data: %s,", (data53 != null) ? data53.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata54() {
        if (data54 != null) {
            return String.format(Locale.US, "data: %s,", data54);
        }
        return "";
    }

    private String generateJSdata55() {
        if (data55 != null) {
            return String.format(Locale.US, "data: %s,", data55);
        }
        return "";
    }

    private String generateJSmappingSettings13() {
        if (mappingSettings13 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings13);
        }
        return "";
    }

    private String generateJScsvSettings13() {
        if (csvSettings13 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings13);
        }
        return "";
    }

    private String generateJSdata56() {
        if (data56 != null) {
            return String.format(Locale.US, "data: %s,", (data56 != null) ? data56.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata57() {
        if (data57 != null) {
            return String.format(Locale.US, "data: %s,", (data57 != null) ? data57.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata58() {
        if (data58 != null) {
            return String.format(Locale.US, "data: %s,", data58);
        }
        return "";
    }

    private String generateJSdata59() {
        if (data59 != null) {
            return String.format(Locale.US, "data: %s,", data59);
        }
        return "";
    }

    private String generateJSmappingSettings14() {
        if (mappingSettings14 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings14);
        }
        return "";
    }

    private String generateJScsvSettings14() {
        if (csvSettings14 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings14);
        }
        return "";
    }

    private String generateJSdata60() {
        if (data60 != null) {
            return String.format(Locale.US, "data: %s,", (data60 != null) ? data60.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata61() {
        if (data61 != null) {
            return String.format(Locale.US, "data: %s,", (data61 != null) ? data61.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata62() {
        if (data62 != null) {
            return String.format(Locale.US, "data: %s,", data62);
        }
        return "";
    }

    private String generateJSdata63() {
        if (data63 != null) {
            return String.format(Locale.US, "data: %s,", data63);
        }
        return "";
    }

    private String generateJSmappingSettings15() {
        if (mappingSettings15 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings15);
        }
        return "";
    }

    private String generateJScsvSettings15() {
        if (csvSettings15 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings15);
        }
        return "";
    }

    private String generateJSdata64() {
        if (data64 != null) {
            return String.format(Locale.US, "data: %s,", (data64 != null) ? data64.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata65() {
        if (data65 != null) {
            return String.format(Locale.US, "data: %s,", (data65 != null) ? data65.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata66() {
        if (data66 != null) {
            return String.format(Locale.US, "data: %s,", data66);
        }
        return "";
    }

    private String generateJSdata67() {
        if (data67 != null) {
            return String.format(Locale.US, "data: %s,", data67);
        }
        return "";
    }

    private String generateJSmappingSettings16() {
        if (mappingSettings16 != null) {
            return String.format(Locale.US, "mappingSettings: %s,", mappingSettings16);
        }
        return "";
    }

    private String generateJScsvSettings16() {
        if (csvSettings16 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings16);
        }
        return "";
    }

    private String generateJSmapping18() {
        if (mapping18 != null) {
            return String.format(Locale.US, "mapping: %s,", (mapping18 != null) ? mapping18.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkPeriod1() {
        if (kPeriod1 != null) {
            return String.format(Locale.US, "kPeriod: %f,", kPeriod1);
        }
        return "";
    }

    private String generateJSkMAPeriod1() {
        if (kMAPeriod1 != null) {
            return String.format(Locale.US, "kMAPeriod: %f,", kMAPeriod1);
        }
        return "";
    }

    private String generateJSdPeriod1() {
        if (dPeriod1 != null) {
            return String.format(Locale.US, "dPeriod: %f,", dPeriod1);
        }
        return "";
    }

    private String generateJSkMAType2() {
        if (kMAType2 != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType2 != null) ? kMAType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkMAType3() {
        if (kMAType3 != null) {
            return String.format(Locale.US, "kMAType: %s,", kMAType3);
        }
        return "";
    }

    private String generateJSdMAType2() {
        if (dMAType2 != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType2 != null) ? dMAType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdMAType3() {
        if (dMAType3 != null) {
            return String.format(Locale.US, "dMAType: %s,", dMAType3);
        }
        return "";
    }

    private String generateJSkSeriesType2() {
        if (kSeriesType2 != null) {
            return String.format(Locale.US, "kSeriesType: %s,", (kSeriesType2 != null) ? kSeriesType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkSeriesType3() {
        if (kSeriesType3 != null) {
            return String.format(Locale.US, "kSeriesType: %s,", kSeriesType3);
        }
        return "";
    }

    private String generateJSdSeriesType2() {
        if (dSeriesType2 != null) {
            return String.format(Locale.US, "dSeriesType: %s,", (dSeriesType2 != null) ? dSeriesType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdSeriesType3() {
        if (dSeriesType3 != null) {
            return String.format(Locale.US, "dSeriesType: %s,", dSeriesType3);
        }
        return "";
    }

    private String generateJSxAxis() {
        if (xAxis != null) {
            return String.format(Locale.US, "xAxis: %s,", xAxis);
        }
        return "";
    }

    private String generateJSxAxis1() {
        if (xAxis1 != null) {
            return String.format(Locale.US, "xAxis: %b,", xAxis1);
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale1() {
        if (yScale1 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale1);
        }
        return "";
    }

    private String generateJSyScale2() {
        if (yScale2 != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale2 != null) ? yScale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale3() {
        if (yScale3 != null) {
            return String.format(Locale.US, "yScale: %s,", yScale3);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetSeries());
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append(generateJSmapping());
            js.append(generateJSseriesType());
            js.append(generateJSseriesType1());
            js.append(generateJSmapping1());
            js.append(generateJSperiod());
            js.append(generateJSfastPeriod());
            js.append(generateJSslowPeriod());
            js.append(generateJSseriesType2());
            js.append(generateJSseriesType3());
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSdata2());
            js.append(generateJSdata3());
            js.append(generateJSmappingSettings());
            js.append(generateJScsvSettings());
            js.append(generateJSmapping2());
            js.append(generateJSperiod1());
            js.append(generateJSupSeriesType());
            js.append(generateJSupSeriesType1());
            js.append(generateJSdownSeriesType());
            js.append(generateJSdownSeriesType1());
            js.append(generateJSmapping3());
            js.append(generateJSperiod2());
            js.append(generateJSseriesType4());
            js.append(generateJSseriesType5());
            js.append(generateJSmapping4());
            js.append(generateJSperiod3());
            js.append(generateJSdeviation());
            js.append(generateJSupperSeriesType());
            js.append(generateJSupperSeriesType1());
            js.append(generateJSlowerSeriesType());
            js.append(generateJSlowerSeriesType1());
            js.append(generateJSmiddleSeriesType());
            js.append(generateJSmiddleSeriesType1());
            js.append(generateJSmapping5());
            js.append(generateJSperiod4());
            js.append(generateJSdeviation1());
            js.append(generateJSseriesType6());
            js.append(generateJSseriesType7());
            js.append(generateJSmapping6());
            js.append(generateJSperiod5());
            js.append(generateJSdeviation2());
            js.append(generateJSseriesType8());
            js.append(generateJSseriesType9());
            js.append(generateJSdata4());
            js.append(generateJSdata5());
            js.append(generateJSdata6());
            js.append(generateJSdata7());
            js.append(generateJSmappingSettings1());
            js.append(generateJScsvSettings1());
            js.append(generateJSmapping7());
            js.append(generateJSperiod6());
            js.append(generateJSseriesType10());
            js.append(generateJSseriesType11());
            js.append(generateJSmapping8());
            js.append(generateJSfastPeriod1());
            js.append(generateJSslowPeriod1());
            js.append(generateJSmaType());
            js.append(generateJSseriesType12());
            js.append(generateJSseriesType13());
            js.append(generateJSmapping9());
            js.append(generateJSperiod7());
            js.append(generateJSseriesType14());
            js.append(generateJSseriesType15());
            js.append(generateJSdata8());
            js.append(generateJSdata9());
            js.append(generateJSdata10());
            js.append(generateJSdata11());
            js.append(generateJSmappingSettings2());
            js.append(generateJScsvSettings2());
            js.append(generateJSdefaultSeriesType());
            js.append(generateJSdefaultSeriesType1());
            js.append(generateJSmapping10());
            js.append(generateJSperiod8());
            js.append(generateJSadxPeriod());
            js.append(generateJSuseWildersSmoothing());
            js.append(generateJSpdiSeriesType());
            js.append(generateJSpdiSeriesType1());
            js.append(generateJSndiSeriesType());
            js.append(generateJSndiSeriesType1());
            js.append(generateJSadxSeriesType());
            js.append(generateJSadxSeriesType1());
            js.append(generateJSmapping11());
            js.append(generateJSperiod9());
            js.append(generateJSseriesType16());
            js.append(generateJSseriesType17());
            js.append(generateJShatchFillPalette());
            js.append(generateJShatchFillPalette1());
            js.append(generateJShatchFillPalette2());
            js.append(generateJSdata12());
            js.append(generateJSdata13());
            js.append(generateJSdata14());
            js.append(generateJSdata15());
            js.append(generateJSmappingSettings3());
            js.append(generateJScsvSettings3());
            js.append(generateJSdata16());
            js.append(generateJSdata17());
            js.append(generateJSdata18());
            js.append(generateJSdata19());
            js.append(generateJSmappingSettings4());
            js.append(generateJScsvSettings4());
            js.append(generateJSmapping12());
            js.append(generateJSkPeriod());
            js.append(generateJSkMAPeriod());
            js.append(generateJSdPeriod());
            js.append(generateJSkMAType());
            js.append(generateJSkMAType1());
            js.append(generateJSdMAType());
            js.append(generateJSdMAType1());
            js.append(generateJSkMultiplier());
            js.append(generateJSdMultiplier());
            js.append(generateJSkSeriesType());
            js.append(generateJSkSeriesType1());
            js.append(generateJSdSeriesType());
            js.append(generateJSdSeriesType1());
            js.append(generateJSjSeriesType());
            js.append(generateJSjSeriesType1());
            js.append(generateJSdata20());
            js.append(generateJSdata21());
            js.append(generateJSdata22());
            js.append(generateJSdata23());
            js.append(generateJSmappingSettings5());
            js.append(generateJScsvSettings5());
            js.append(generateJSmapping13());
            js.append(generateJSfastPeriod2());
            js.append(generateJSslowPeriod2());
            js.append(generateJSsignalPeriod());
            js.append(generateJSmacdSeriesType());
            js.append(generateJSmacdSeriesType1());
            js.append(generateJSsignalSeriesType());
            js.append(generateJSsignalSeriesType1());
            js.append(generateJShistogramSeriesType());
            js.append(generateJShistogramSeriesType1());
            js.append(generateJSdata24());
            js.append(generateJSdata25());
            js.append(generateJSdata26());
            js.append(generateJSdata27());
            js.append(generateJSmappingSettings6());
            js.append(generateJScsvSettings6());
            js.append(generateJSmapping14());
            js.append(generateJSperiod10());
            js.append(generateJSseriesType18());
            js.append(generateJSseriesType19());
            js.append(generateJSdata28());
            js.append(generateJSdata29());
            js.append(generateJSdata30());
            js.append(generateJSdata31());
            js.append(generateJSmappingSettings7());
            js.append(generateJScsvSettings7());
            js.append(generateJSpalette());
            js.append(generateJSpalette1());
            js.append(generateJSpalette2());
            js.append(generateJSpalette3());
            js.append(generateJSdata32());
            js.append(generateJSdata33());
            js.append(generateJSdata34());
            js.append(generateJSdata35());
            js.append(generateJSmappingSettings8());
            js.append(generateJScsvSettings8());
            js.append(generateJSdata36());
            js.append(generateJSdata37());
            js.append(generateJSdata38());
            js.append(generateJSdata39());
            js.append(generateJSmappingSettings9());
            js.append(generateJScsvSettings9());
            js.append(generateJSdata40());
            js.append(generateJSdata41());
            js.append(generateJSdata42());
            js.append(generateJSdata43());
            js.append(generateJSmappingSettings10());
            js.append(generateJScsvSettings10());
            js.append(generateJSdata44());
            js.append(generateJSdata45());
            js.append(generateJSdata46());
            js.append(generateJSdata47());
            js.append(generateJSmappingSettings11());
            js.append(generateJScsvSettings11());
            js.append(generateJSid());
            js.append(generateJSid1());
            js.append(generateJSindex());
            js.append(generateJSmapping15());
            js.append(generateJSperiod11());
            js.append(generateJSseriesType20());
            js.append(generateJSseriesType21());
            js.append(generateJSmapping16());
            js.append(generateJSperiod12());
            js.append(generateJSseriesType22());
            js.append(generateJSseriesType23());
            js.append(generateJSmapping17());
            js.append(generateJSperiod13());
            js.append(generateJSseriesType24());
            js.append(generateJSseriesType25());
            js.append(generateJSdata48());
            js.append(generateJSdata49());
            js.append(generateJSdata50());
            js.append(generateJSdata51());
            js.append(generateJSmappingSettings12());
            js.append(generateJScsvSettings12());
            js.append(generateJSdata52());
            js.append(generateJSdata53());
            js.append(generateJSdata54());
            js.append(generateJSdata55());
            js.append(generateJSmappingSettings13());
            js.append(generateJScsvSettings13());
            js.append(generateJSdata56());
            js.append(generateJSdata57());
            js.append(generateJSdata58());
            js.append(generateJSdata59());
            js.append(generateJSmappingSettings14());
            js.append(generateJScsvSettings14());
            js.append(generateJSdata60());
            js.append(generateJSdata61());
            js.append(generateJSdata62());
            js.append(generateJSdata63());
            js.append(generateJSmappingSettings15());
            js.append(generateJScsvSettings15());
            js.append(generateJSdata64());
            js.append(generateJSdata65());
            js.append(generateJSdata66());
            js.append(generateJSdata67());
            js.append(generateJSmappingSettings16());
            js.append(generateJScsvSettings16());
            js.append(generateJSmapping18());
            js.append(generateJSkPeriod1());
            js.append(generateJSkMAPeriod1());
            js.append(generateJSdPeriod1());
            js.append(generateJSkMAType2());
            js.append(generateJSkMAType3());
            js.append(generateJSdMAType2());
            js.append(generateJSdMAType3());
            js.append(generateJSkSeriesType2());
            js.append(generateJSkSeriesType3());
            js.append(generateJSdSeriesType2());
            js.append(generateJSdSeriesType3());
            js.append(generateJSxAxis());
            js.append(generateJSxAxis1());
            js.append(generateJSyScale());
            js.append(generateJSyScale1());
            js.append(generateJSyScale2());
            js.append(generateJSyScale3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}