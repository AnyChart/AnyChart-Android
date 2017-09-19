package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Plot extends JsObject {

    
    private TableMapping var_args;

    public void setAddseries(TableMapping var_args) {
        this.var_args = var_args;
    }

    private TableMapping mapping;
    private StockSeriesType seriesType;

    public void setAdl(TableMapping mapping, StockSeriesType seriesType) {
        this.mapping = mapping;
        this.seriesType = seriesType;
    }

    private TableMapping mapping1;
    private Double period;
    private Double fastPeriod;
    private Double slowPeriod;
    private StockSeriesType seriesType1;
    private String seriesType2;

    public void setAma(StockSeriesType seriesType1, TableMapping mapping1, Double period, Double fastPeriod, Double slowPeriod) {
        this.seriesType = null;
        this.seriesType1 = null;
        this.seriesType2 = null;
        
        this.seriesType1 = seriesType1;
        this.mapping = null;
        this.mapping1 = null;
        
        this.mapping1 = mapping1;
        this.period = period;
        this.fastPeriod = fastPeriod;
        this.slowPeriod = slowPeriod;
    }


    public void setAma(String seriesType2, TableMapping mapping1, Double period, Double fastPeriod, Double slowPeriod) {
        this.seriesType = null;
        this.seriesType1 = null;
        this.seriesType2 = null;
        
        this.seriesType2 = seriesType2;
        this.mapping = null;
        this.mapping1 = null;
        
        this.mapping1 = mapping1;
        this.period = period;
        this.fastPeriod = fastPeriod;
        this.slowPeriod = slowPeriod;
    }

    private String[] annotationsList;

    public void setAnnotations(String[] annotationsList) {
        this.annotationsList = annotationsList;
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;

    public void setArea(TableMapping data, String mappingSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data = data;
        this.mappingSettings = mappingSettings;
    }


    public void setArea(DataTable data1, String mappingSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data1 = data1;
        this.mappingSettings = mappingSettings;
    }


    public void setArea(String data2, String mappingSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data2 = data2;
        this.mappingSettings = mappingSettings;
    }

    private TableMapping mapping2;
    private Double period1;
    private StockSeriesType upSeriesType;
    private StockSeriesType downSeriesType;

    public void setAroon(TableMapping mapping2, Double period1, StockSeriesType upSeriesType, StockSeriesType downSeriesType) {
        this.mapping = null;
        this.mapping1 = null;
        this.mapping2 = null;
        
        this.mapping2 = mapping2;
        this.period = null;
        this.period1 = null;
        
        this.period1 = period1;
        this.upSeriesType = upSeriesType;
        this.downSeriesType = downSeriesType;
    }

    private TableMapping mapping3;
    private Double period2;
    private StockSeriesType seriesType3;

    public void setAtr(TableMapping mapping3, Double period2, StockSeriesType seriesType3) {
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
        
        this.seriesType3 = seriesType3;
    }

    private String background;
    private Boolean background1;

    public void setBackground(String background) {
        this.background = null;
        this.background1 = null;
        
        this.background = background;
    }


    public void setBackground(Boolean background1) {
        this.background = null;
        this.background1 = null;
        
        this.background1 = background1;
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

    public void setBbands(StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(StockSeriesType upperSeriesType, StockSeriesType lowerSeriesType, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(StockSeriesType upperSeriesType, String lowerSeriesType1, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(StockSeriesType upperSeriesType, String lowerSeriesType1, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(String upperSeriesType1, StockSeriesType lowerSeriesType, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(String upperSeriesType1, StockSeriesType lowerSeriesType, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(String upperSeriesType1, String lowerSeriesType1, StockSeriesType middleSeriesType, TableMapping mapping4, Double period3, Double deviation) {
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
    }


    public void setBbands(String upperSeriesType1, String lowerSeriesType1, String middleSeriesType1, TableMapping mapping4, Double period3, Double deviation) {
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
    }

    private TableMapping mapping5;
    private Double period4;
    private Double deviation1;
    private StockSeriesType seriesType4;
    private String seriesType5;

    public void setBbandsb(StockSeriesType seriesType4, TableMapping mapping5, Double period4, Double deviation1) {
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
    }


    public void setBbandsb(String seriesType5, TableMapping mapping5, Double period4, Double deviation1) {
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
    }

    private TableMapping mapping6;
    private Double period5;
    private Double deviation2;
    private StockSeriesType seriesType6;
    private String seriesType7;

    public void setBbandswidth(StockSeriesType seriesType6, TableMapping mapping6, Double period5, Double deviation2) {
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
    }


    public void setBbandswidth(String seriesType7, TableMapping mapping6, Double period5, Double deviation2) {
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
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
    }


    public void setBottom(String bottom1) {
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds = bounds;
    }


    public void setBounds(AnychartMathRect bounds1) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds1 = bounds1;
    }


    public void setBounds(Bounds bounds2) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds2 = bounds2;
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }

    private TableMapping data4;
    private DataTable data5;
    private String data6;
    private String data7;
    private String mappingSettings1;

    public void setCandlestick(TableMapping data4, String mappingSettings1) {
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
    }


    public void setCandlestick(DataTable data5, String mappingSettings1) {
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
    }


    public void setCandlestick(String data6, String mappingSettings1) {
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
    }

    private TableMapping mapping7;
    private Double period6;
    private StockSeriesType seriesType8;

    public void setCci(TableMapping mapping7, Double period6, StockSeriesType seriesType8) {
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
        
        this.seriesType8 = seriesType8;
    }

    private TableMapping mapping8;
    private Double fastPeriod1;
    private Double slowPeriod1;
    private String maType;
    private MovingAverageType maType1;
    private StockSeriesType seriesType9;

    public void setCho(String maType, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1, StockSeriesType seriesType9) {
        this.maType = null;
        this.maType1 = null;
        
        this.maType = maType;
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
    }


    public void setCho(MovingAverageType maType1, TableMapping mapping8, Double fastPeriod1, Double slowPeriod1, StockSeriesType seriesType9) {
        this.maType = null;
        this.maType1 = null;
        
        this.maType1 = maType1;
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
    }

    private TableMapping mapping9;
    private Double period7;
    private StockSeriesType seriesType10;

    public void setCmf(TableMapping mapping9, Double period7, StockSeriesType seriesType10) {
        this.mapping = null;
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
        
        this.seriesType10 = seriesType10;
    }

    private TableMapping data8;
    private DataTable data9;
    private String data10;
    private String data11;
    private String mappingSettings2;

    public void setColumn(TableMapping data8, String mappingSettings2) {
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
    }


    public void setColumn(DataTable data9, String mappingSettings2) {
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
    }


    public void setColumn(String data10, String mappingSettings2) {
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
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setDatetimehighlighter(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color = color;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setDatetimehighlighter(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setDatetimehighlighter(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private String defaultSeriesType;
    private StockSeriesType defaultSeriesType1;

    public void setDefaultseriestype(String defaultSeriesType) {
        this.defaultSeriesType = null;
        this.defaultSeriesType1 = null;
        
        this.defaultSeriesType = defaultSeriesType;
    }


    public void setDefaultseriestype(StockSeriesType defaultSeriesType1) {
        this.defaultSeriesType = null;
        this.defaultSeriesType1 = null;
        
        this.defaultSeriesType1 = defaultSeriesType1;
    }

    private TableMapping mapping10;
    private Double period8;
    private Double adxPeriod;
    private Boolean useWildersSmoothing;
    private StockSeriesType pdiSeriesType;
    private StockSeriesType ndiSeriesType;
    private StockSeriesType adxSeriesType;

    public void setDmi(TableMapping mapping10, Double period8, Double adxPeriod, Boolean useWildersSmoothing, StockSeriesType pdiSeriesType, StockSeriesType ndiSeriesType, StockSeriesType adxSeriesType) {
        this.mapping = null;
        this.mapping1 = null;
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
        this.pdiSeriesType = pdiSeriesType;
        this.ndiSeriesType = ndiSeriesType;
        this.adxSeriesType = adxSeriesType;
    }

    private TableMapping mapping11;
    private Double period9;
    private String seriesType11;
    private StockSeriesType seriesType12;

    public void setEma(String seriesType11, TableMapping mapping11, Double period9) {
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
        
        this.seriesType11 = seriesType11;
        this.mapping = null;
        this.mapping1 = null;
        this.mapping2 = null;
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
    }


    public void setEma(StockSeriesType seriesType12, TableMapping mapping11, Double period9) {
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
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Double id;
    private String id1;

    public void setGetseries(Double id) {
        this.id = null;
        this.id1 = null;
        
        this.id = id;
    }


    public void setGetseries(String id1) {
        this.id = null;
        this.id1 = null;
        
        this.id1 = id1;
    }

    private Double index;

    public void setGetseriesat(Double index) {
        this.index = index;
    }

    private Double index1;

    public void setGrid(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Boolean grid;

    public void setGrid(Boolean grid) {
        this.grid = grid;
    }

    private Double index2;
    private Boolean grid1;

    public void setGrid(Double index2, Boolean grid1) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
        this.grid = null;
        this.grid1 = null;
        
        this.grid1 = grid1;
    }

    private HatchFillType[] hatchFillPalette;
    private HatchFills hatchFillPalette1;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = null;
        this.hatchFillPalette1 = null;
        
        this.hatchFillPalette = hatchFillPalette;
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette1) {
        this.hatchFillPalette = null;
        this.hatchFillPalette1 = null;
        
        this.hatchFillPalette1 = hatchFillPalette1;
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        
        this.height2 = height2;
    }


    public void setHeight(String height3) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        
        this.height3 = height3;
    }

    private TableMapping data12;
    private DataTable data13;
    private String data14;
    private String data15;
    private String mappingSettings3;

    public void setHilo(TableMapping data12, String mappingSettings3) {
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
    }


    public void setHilo(DataTable data13, String mappingSettings3) {
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
    }


    public void setHilo(String data14, String mappingSettings3) {
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
    }

    private TableMapping data16;
    private DataTable data17;
    private String data18;
    private String data19;
    private String mappingSettings4;

    public void setJumpline(TableMapping data16, String mappingSettings4) {
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
    }


    public void setJumpline(DataTable data17, String mappingSettings4) {
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
    }


    public void setJumpline(String data18, String mappingSettings4) {
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
    }

    private TableMapping mapping12;
    private Double kPeriod;
    private Double kMAPeriod;
    private Double dPeriod;
    private MovingAverageType kMAType;
    private MovingAverageType dMAType;
    private Double kMultiplier;
    private Double dMultiplier;
    private StockSeriesType kSeriesType;
    private StockSeriesType dSeriesType;
    private StockSeriesType jSeriesType;

    public void setKdj(TableMapping mapping12, Double kPeriod, Double kMAPeriod, Double dPeriod, MovingAverageType kMAType, MovingAverageType dMAType, Double kMultiplier, Double dMultiplier, StockSeriesType kSeriesType, StockSeriesType dSeriesType, StockSeriesType jSeriesType) {
        this.mapping = null;
        this.mapping1 = null;
        this.mapping2 = null;
        this.mapping3 = null;
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
        this.kMAType = kMAType;
        this.dMAType = dMAType;
        this.kMultiplier = kMultiplier;
        this.dMultiplier = dMultiplier;
        this.kSeriesType = kSeriesType;
        this.dSeriesType = dSeriesType;
        this.jSeriesType = jSeriesType;
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setLeft(String left1) {
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }

    private Boolean legend;

    public void setLegend(Boolean legend) {
        this.legend = legend;
    }

    private TableMapping data20;
    private DataTable data21;
    private String data22;
    private String data23;
    private String mappingSettings5;

    public void setLine(TableMapping data20, String mappingSettings5) {
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
    }


    public void setLine(DataTable data21, String mappingSettings5) {
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
    }


    public void setLine(String data22, String mappingSettings5) {
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
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private TableMapping mapping13;
    private Double fastPeriod2;
    private Double slowPeriod2;
    private Double signalPeriod;
    private String macdSeriesType;
    private StockSeriesType macdSeriesType1;
    private String signalSeriesType;
    private StockSeriesType signalSeriesType1;
    private String histogramSeriesType;
    private StockSeriesType histogramSeriesType1;

    public void setMacd(String macdSeriesType, String signalSeriesType, String histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(String macdSeriesType, String signalSeriesType, StockSeriesType histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(String macdSeriesType, StockSeriesType signalSeriesType1, String histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(String macdSeriesType, StockSeriesType signalSeriesType1, StockSeriesType histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(StockSeriesType macdSeriesType1, String signalSeriesType, String histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(StockSeriesType macdSeriesType1, String signalSeriesType, StockSeriesType histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(StockSeriesType macdSeriesType1, StockSeriesType signalSeriesType1, String histogramSeriesType, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }


    public void setMacd(StockSeriesType macdSeriesType1, StockSeriesType signalSeriesType1, StockSeriesType histogramSeriesType1, TableMapping mapping13, Double fastPeriod2, Double slowPeriod2, Double signalPeriod) {
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
    }

    private TableMapping data24;
    private DataTable data25;
    private String data26;
    private String data27;
    private String mappingSettings6;

    public void setMarker(TableMapping data24, String mappingSettings6) {
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
    }


    public void setMarker(DataTable data25, String mappingSettings6) {
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
    }


    public void setMarker(String data26, String mappingSettings6) {
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
    }

    private Markers markerPalette;
    private MarkerType[] markerPalette1;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = null;
        this.markerPalette1 = null;
        
        this.markerPalette = markerPalette;
    }


    public void setMarkerpalette(MarkerType[] markerPalette1) {
        this.markerPalette = null;
        this.markerPalette1 = null;
        
        this.markerPalette1 = markerPalette1;
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = null;
        this.maxHeight1 = null;
        
        this.maxHeight = maxHeight;
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight = null;
        this.maxHeight1 = null;
        
        this.maxHeight1 = maxHeight1;
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = null;
        this.maxWidth1 = null;
        
        this.maxWidth = maxWidth;
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth = null;
        this.maxWidth1 = null;
        
        this.maxWidth1 = maxWidth1;
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = null;
        this.minHeight1 = null;
        
        this.minHeight = minHeight;
    }


    public void setMinheight(String minHeight1) {
        this.minHeight = null;
        this.minHeight1 = null;
        
        this.minHeight1 = minHeight1;
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = null;
        this.minWidth1 = null;
        
        this.minWidth = minWidth;
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth = null;
        this.minWidth1 = null;
        
        this.minWidth1 = minWidth1;
    }

    private Double index3;

    public void setMinorgrid(Double index3) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
    }

    private Boolean minorGrid;

    public void setMinorgrid(Boolean minorGrid) {
        this.minorGrid = minorGrid;
    }

    private Double indexOrValue;
    private Boolean minorGrid1;

    public void setMinorgrid(Double indexOrValue, Boolean minorGrid1) {
        this.indexOrValue = indexOrValue;
        this.minorGrid = null;
        this.minorGrid1 = null;
        
        this.minorGrid1 = minorGrid1;
    }

    private TableMapping mapping14;
    private Double period10;
    private StockSeriesType seriesType13;
    private String seriesType14;

    public void setMma(StockSeriesType seriesType13, TableMapping mapping14, Double period10) {
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
    }


    public void setMma(String seriesType14, TableMapping mapping14, Double period10) {
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
    }

    private TableMapping data28;
    private DataTable data29;
    private String data30;
    private String data31;
    private String mappingSettings7;

    public void setOhlc(TableMapping data28, String mappingSettings7) {
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
    }


    public void setOhlc(DataTable data29, String mappingSettings7) {
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
    }


    public void setOhlc(String data30, String mappingSettings7) {
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
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String[] palette2;

    public void setPalette(RangeColors palette) {
        this.palette = null;
        this.palette1 = null;
        this.palette2 = null;
        
        this.palette = palette;
    }


    public void setPalette(DistinctColors palette1) {
        this.palette = null;
        this.palette1 = null;
        this.palette2 = null;
        
        this.palette1 = palette1;
    }


    public void setPalette(String[] palette2) {
        this.palette = null;
        this.palette1 = null;
        this.palette2 = null;
        
        this.palette2 = palette2;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private TableMapping data32;
    private DataTable data33;
    private String data34;
    private String data35;
    private String mappingSettings8;

    public void setRangearea(TableMapping data32, String mappingSettings8) {
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
    }


    public void setRangearea(DataTable data33, String mappingSettings8) {
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
    }


    public void setRangearea(String data34, String mappingSettings8) {
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
    }

    private TableMapping data36;
    private DataTable data37;
    private String data38;
    private String data39;
    private String mappingSettings9;

    public void setRangecolumn(TableMapping data36, String mappingSettings9) {
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
    }


    public void setRangecolumn(DataTable data37, String mappingSettings9) {
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
    }


    public void setRangecolumn(String data38, String mappingSettings9) {
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
    }

    private TableMapping data40;
    private DataTable data41;
    private String data42;
    private String data43;
    private String mappingSettings10;

    public void setRangesplinearea(TableMapping data40, String mappingSettings10) {
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
    }


    public void setRangesplinearea(DataTable data41, String mappingSettings10) {
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
    }


    public void setRangesplinearea(String data42, String mappingSettings10) {
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
    }

    private TableMapping data44;
    private DataTable data45;
    private String data46;
    private String data47;
    private String mappingSettings11;

    public void setRangesteparea(TableMapping data44, String mappingSettings11) {
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
    }


    public void setRangesteparea(DataTable data45, String mappingSettings11) {
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
    }


    public void setRangesteparea(String data46, String mappingSettings11) {
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
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double id2;
    private String id3;

    public void setRemoveseries(Double id2) {
        this.id = null;
        this.id1 = null;
        this.id2 = null;
        this.id3 = null;
        
        this.id2 = id2;
    }


    public void setRemoveseries(String id3) {
        this.id = null;
        this.id1 = null;
        this.id2 = null;
        this.id3 = null;
        
        this.id3 = id3;
    }

    private Double index4;

    public void setRemoveseriesat(Double index4) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        
        this.index4 = index4;
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = null;
        this.right1 = null;
        
        this.right = right;
    }


    public void setRight(String right1) {
        this.right = null;
        this.right1 = null;
        
        this.right1 = right1;
    }

    private TableMapping mapping15;
    private Double period11;
    private String seriesType15;
    private StockSeriesType seriesType16;

    public void setRoc(String seriesType15, TableMapping mapping15, Double period11) {
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
    }


    public void setRoc(StockSeriesType seriesType16, TableMapping mapping15, Double period11) {
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
    }

    private TableMapping mapping16;
    private Double period12;
    private String seriesType17;
    private StockSeriesType seriesType18;

    public void setRsi(String seriesType17, TableMapping mapping16, Double period12) {
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
    }


    public void setRsi(StockSeriesType seriesType18, TableMapping mapping16, Double period12) {
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
    }

    private TableMapping mapping17;
    private Double period13;
    private String seriesType19;
    private StockSeriesType seriesType20;

    public void setSma(String seriesType19, TableMapping mapping17, Double period13) {
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
    }


    public void setSma(StockSeriesType seriesType20, TableMapping mapping17, Double period13) {
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
    }

    private TableMapping data48;
    private DataTable data49;
    private String data50;
    private String data51;
    private String mappingSettings12;

    public void setSpline(TableMapping data48, String mappingSettings12) {
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
    }


    public void setSpline(DataTable data49, String mappingSettings12) {
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
    }


    public void setSpline(String data50, String mappingSettings12) {
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
    }

    private TableMapping data52;
    private DataTable data53;
    private String data54;
    private String data55;
    private String mappingSettings13;

    public void setSplinearea(TableMapping data52, String mappingSettings13) {
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
    }


    public void setSplinearea(DataTable data53, String mappingSettings13) {
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
    }


    public void setSplinearea(String data54, String mappingSettings13) {
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
    }

    private TableMapping data56;
    private DataTable data57;
    private String data58;
    private String data59;
    private String mappingSettings14;

    public void setSteparea(TableMapping data56, String mappingSettings14) {
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
    }


    public void setSteparea(DataTable data57, String mappingSettings14) {
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
    }


    public void setSteparea(String data58, String mappingSettings14) {
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
    }

    private TableMapping data60;
    private DataTable data61;
    private String data62;
    private String data63;
    private String mappingSettings15;

    public void setStepline(TableMapping data60, String mappingSettings15) {
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
    }


    public void setStepline(DataTable data61, String mappingSettings15) {
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
    }


    public void setStepline(String data62, String mappingSettings15) {
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
    }

    private TableMapping data64;
    private DataTable data65;
    private String data66;
    private String data67;
    private String mappingSettings16;

    public void setStick(TableMapping data64, String mappingSettings16) {
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
    }


    public void setStick(DataTable data65, String mappingSettings16) {
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
    }


    public void setStick(String data66, String mappingSettings16) {
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
    }

    private TableMapping mapping18;
    private Double kPeriod1;
    private Double kMAPeriod1;
    private Double dPeriod1;
    private MovingAverageType kMAType1;
    private MovingAverageType dMAType1;
    private StockSeriesType kSeriesType1;
    private StockSeriesType dSeriesType1;

    public void setStochastic(TableMapping mapping18, Double kPeriod1, Double kMAPeriod1, Double dPeriod1, MovingAverageType kMAType1, MovingAverageType dMAType1, StockSeriesType kSeriesType1, StockSeriesType dSeriesType1) {
        this.mapping = null;
        this.mapping1 = null;
        this.mapping2 = null;
        this.mapping3 = null;
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
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        this.top = null;
        this.top1 = null;
        
        this.top = top;
    }


    public void setTop(String top1) {
        this.top = null;
        this.top1 = null;
        
        this.top1 = top1;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double width2;
    private String width3;

    public void setWidth(Double width2) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        
        this.width2 = width2;
    }


    public void setWidth(String width3) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        
        this.width3 = width3;
    }

    private Boolean xAxis;

    public void setXaxis(Boolean xAxis) {
        this.xAxis = xAxis;
    }

    private Double index5;

    public void setYaxis(Double index5) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        this.index5 = null;
        
        this.index5 = index5;
    }

    private Boolean yAxis;

    public void setYaxis(Boolean yAxis) {
        this.yAxis = yAxis;
    }

    private Double index6;
    private Boolean yAxis1;

    public void setYaxis(Double index6, Boolean yAxis1) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        this.index5 = null;
        this.index6 = null;
        
        this.index6 = index6;
        this.yAxis = null;
        this.yAxis1 = null;
        
        this.yAxis1 = yAxis1;
    }

    private ScatterScaleTypes yScale;
    private ScatterBase yScale1;

    public void setYscale(ScatterScaleTypes yScale) {
        this.yScale = null;
        this.yScale1 = null;
        
        this.yScale = yScale;
    }


    public void setYscale(ScatterBase yScale1) {
        this.yScale = null;
        this.yScale1 = null;
        
        this.yScale1 = yScale1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args != null) ? var_args.generateJs() : "null");
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

    private String generateJSseriesType1() {
        if (seriesType1 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType1 != null) ? seriesType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType2() {
        if (seriesType2 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType2);
        }
        return "";
    }

    private String generateJSannotationsList() {
        if (annotationsList != null) {
            return String.format(Locale.US, "annotationsList: %s,", Arrays.toString(annotationsList));
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

    private String generateJSdownSeriesType() {
        if (downSeriesType != null) {
            return String.format(Locale.US, "downSeriesType: %s,", (downSeriesType != null) ? downSeriesType.generateJs() : "null");
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

    private String generateJSseriesType3() {
        if (seriesType3 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType3 != null) ? seriesType3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %b,", background1);
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

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom1);
        }
        return "";
    }

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds1() {
        if (bounds1 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds1 != null) ? bounds1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds2() {
        if (bounds2 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds2 != null) ? bounds2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %s,", x1);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %s,", y1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
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

    private String generateJSseriesType8() {
        if (seriesType8 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType8 != null) ? seriesType8.generateJs() : "null");
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

    private String generateJSmaType1() {
        if (maType1 != null) {
            return String.format(Locale.US, "maType: %s,", (maType1 != null) ? maType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType9() {
        if (seriesType9 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType9 != null) ? seriesType9.generateJs() : "null");
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

    private String generateJSseriesType10() {
        if (seriesType10 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType10 != null) ? seriesType10.generateJs() : "null");
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

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", (color != null) ? color.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdefaultSeriesType() {
        if (defaultSeriesType != null) {
            return String.format(Locale.US, "defaultSeriesType: %s,", defaultSeriesType);
        }
        return "";
    }

    private String generateJSdefaultSeriesType1() {
        if (defaultSeriesType1 != null) {
            return String.format(Locale.US, "defaultSeriesType: %s,", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null");
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

    private String generateJSndiSeriesType() {
        if (ndiSeriesType != null) {
            return String.format(Locale.US, "ndiSeriesType: %s,", (ndiSeriesType != null) ? ndiSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSadxSeriesType() {
        if (adxSeriesType != null) {
            return String.format(Locale.US, "adxSeriesType: %s,", (adxSeriesType != null) ? adxSeriesType.generateJs() : "null");
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

    private String generateJSseriesType11() {
        if (seriesType11 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType11);
        }
        return "";
    }

    private String generateJSseriesType12() {
        if (seriesType12 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType12 != null) ? seriesType12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
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

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSgrid() {
        if (grid != null) {
            return String.format(Locale.US, "grid: %b,", grid);
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSgrid1() {
        if (grid1 != null) {
            return String.format(Locale.US, "grid: %b,", grid1);
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
            return String.format(Locale.US, "hatchFillPalette: %s,", (hatchFillPalette1 != null) ? hatchFillPalette1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %s,", height3);
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

    private String generateJSdMAType() {
        if (dMAType != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType != null) ? dMAType.generateJs() : "null");
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

    private String generateJSdSeriesType() {
        if (dSeriesType != null) {
            return String.format(Locale.US, "dSeriesType: %s,", (dSeriesType != null) ? dSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSjSeriesType() {
        if (jSeriesType != null) {
            return String.format(Locale.US, "jSeriesType: %s,", (jSeriesType != null) ? jSeriesType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %s,", left1);
        }
        return "";
    }

    private String generateJSlegend() {
        if (legend != null) {
            return String.format(Locale.US, "legend: %b,", legend);
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

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
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
            return String.format(Locale.US, "macdSeriesType: %s,", macdSeriesType);
        }
        return "";
    }

    private String generateJSmacdSeriesType1() {
        if (macdSeriesType1 != null) {
            return String.format(Locale.US, "macdSeriesType: %s,", (macdSeriesType1 != null) ? macdSeriesType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsignalSeriesType() {
        if (signalSeriesType != null) {
            return String.format(Locale.US, "signalSeriesType: %s,", signalSeriesType);
        }
        return "";
    }

    private String generateJSsignalSeriesType1() {
        if (signalSeriesType1 != null) {
            return String.format(Locale.US, "signalSeriesType: %s,", (signalSeriesType1 != null) ? signalSeriesType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShistogramSeriesType() {
        if (histogramSeriesType != null) {
            return String.format(Locale.US, "histogramSeriesType: %s,", histogramSeriesType);
        }
        return "";
    }

    private String generateJShistogramSeriesType1() {
        if (histogramSeriesType1 != null) {
            return String.format(Locale.US, "histogramSeriesType: %s,", (histogramSeriesType1 != null) ? histogramSeriesType1.generateJs() : "null");
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

    private String generateJSmarkerPalette() {
        if (markerPalette != null) {
            return String.format(Locale.US, "markerPalette: %s,", (markerPalette != null) ? markerPalette.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmarkerPalette1() {
        if (markerPalette1 != null) {
            return String.format(Locale.US, "markerPalette: %s,", arrayToString(markerPalette1));
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: %s,", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: %s,", maxWidth1);
        }
        return "";
    }

    private String generateJSminHeight() {
        if (minHeight != null) {
            return String.format(Locale.US, "minHeight: %f,", minHeight);
        }
        return "";
    }

    private String generateJSminHeight1() {
        if (minHeight1 != null) {
            return String.format(Locale.US, "minHeight: %s,", minHeight1);
        }
        return "";
    }

    private String generateJSminWidth() {
        if (minWidth != null) {
            return String.format(Locale.US, "minWidth: %f,", minWidth);
        }
        return "";
    }

    private String generateJSminWidth1() {
        if (minWidth1 != null) {
            return String.format(Locale.US, "minWidth: %s,", minWidth1);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSminorGrid() {
        if (minorGrid != null) {
            return String.format(Locale.US, "minorGrid: %b,", minorGrid);
        }
        return "";
    }

    private String generateJSindexOrValue() {
        if (indexOrValue != null) {
            return String.format(Locale.US, "indexOrValue: %f,", indexOrValue);
        }
        return "";
    }

    private String generateJSminorGrid1() {
        if (minorGrid1 != null) {
            return String.format(Locale.US, "minorGrid: %b,", minorGrid1);
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

    private String generateJSseriesType13() {
        if (seriesType13 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType13 != null) ? seriesType13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSseriesType14() {
        if (seriesType14 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType14);
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
            return String.format(Locale.US, "palette: %s,", Arrays.toString(palette2));
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSid2() {
        if (id2 != null) {
            return String.format(Locale.US, "id: %f,", id2);
        }
        return "";
    }

    private String generateJSid3() {
        if (id3 != null) {
            return String.format(Locale.US, "id: %s,", id3);
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJSright() {
        if (right != null) {
            return String.format(Locale.US, "right: %f,", right);
        }
        return "";
    }

    private String generateJSright1() {
        if (right1 != null) {
            return String.format(Locale.US, "right: %s,", right1);
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

    private String generateJSseriesType15() {
        if (seriesType15 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType15);
        }
        return "";
    }

    private String generateJSseriesType16() {
        if (seriesType16 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType16 != null) ? seriesType16.generateJs() : "null");
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

    private String generateJSseriesType17() {
        if (seriesType17 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType17);
        }
        return "";
    }

    private String generateJSseriesType18() {
        if (seriesType18 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType18 != null) ? seriesType18.generateJs() : "null");
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

    private String generateJSseriesType19() {
        if (seriesType19 != null) {
            return String.format(Locale.US, "seriesType: %s,", seriesType19);
        }
        return "";
    }

    private String generateJSseriesType20() {
        if (seriesType20 != null) {
            return String.format(Locale.US, "seriesType: %s,", (seriesType20 != null) ? seriesType20.generateJs() : "null");
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

    private String generateJSkMAType1() {
        if (kMAType1 != null) {
            return String.format(Locale.US, "kMAType: %s,", (kMAType1 != null) ? kMAType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdMAType1() {
        if (dMAType1 != null) {
            return String.format(Locale.US, "dMAType: %s,", (dMAType1 != null) ? dMAType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkSeriesType1() {
        if (kSeriesType1 != null) {
            return String.format(Locale.US, "kSeriesType: %s,", (kSeriesType1 != null) ? kSeriesType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdSeriesType1() {
        if (dSeriesType1 != null) {
            return String.format(Locale.US, "dSeriesType: %s,", (dSeriesType1 != null) ? dSeriesType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJStop1() {
        if (top1 != null) {
            return String.format(Locale.US, "top: %s,", top1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %s,", width3);
        }
        return "";
    }

    private String generateJSxAxis() {
        if (xAxis != null) {
            return String.format(Locale.US, "xAxis: %b,", xAxis);
        }
        return "";
    }

    private String generateJSindex5() {
        if (index5 != null) {
            return String.format(Locale.US, "index: %f,", index5);
        }
        return "";
    }

    private String generateJSyAxis() {
        if (yAxis != null) {
            return String.format(Locale.US, "yAxis: %b,", yAxis);
        }
        return "";
    }

    private String generateJSindex6() {
        if (index6 != null) {
            return String.format(Locale.US, "index: %f,", index6);
        }
        return "";
    }

    private String generateJSyAxis1() {
        if (yAxis1 != null) {
            return String.format(Locale.US, "yAxis: %b,", yAxis1);
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
            return String.format(Locale.US, "yScale: %s,", (yScale1 != null) ? yScale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSvar_args());
        js.append(generateJSmapping());
        js.append(generateJSseriesType());
        js.append(generateJSmapping1());
        js.append(generateJSperiod());
        js.append(generateJSfastPeriod());
        js.append(generateJSslowPeriod());
        js.append(generateJSseriesType1());
        js.append(generateJSseriesType2());
        js.append(generateJSannotationsList());
        js.append(generateJSdata());
        js.append(generateJSdata1());
        js.append(generateJSdata2());
        js.append(generateJSdata3());
        js.append(generateJSmappingSettings());
        js.append(generateJSmapping2());
        js.append(generateJSperiod1());
        js.append(generateJSupSeriesType());
        js.append(generateJSdownSeriesType());
        js.append(generateJSmapping3());
        js.append(generateJSperiod2());
        js.append(generateJSseriesType3());
        js.append(generateJSbackground());
        js.append(generateJSbackground1());
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
        js.append(generateJSseriesType4());
        js.append(generateJSseriesType5());
        js.append(generateJSmapping6());
        js.append(generateJSperiod5());
        js.append(generateJSdeviation2());
        js.append(generateJSseriesType6());
        js.append(generateJSseriesType7());
        js.append(generateJSbottom());
        js.append(generateJSbottom1());
        js.append(generateJSbounds());
        js.append(generateJSbounds1());
        js.append(generateJSbounds2());
        js.append(generateJSx());
        js.append(generateJSx1());
        js.append(generateJSy());
        js.append(generateJSy1());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSheight());
        js.append(generateJSheight1());
        js.append(generateJSdata4());
        js.append(generateJSdata5());
        js.append(generateJSdata6());
        js.append(generateJSdata7());
        js.append(generateJSmappingSettings1());
        js.append(generateJSmapping7());
        js.append(generateJSperiod6());
        js.append(generateJSseriesType8());
        js.append(generateJSmapping8());
        js.append(generateJSfastPeriod1());
        js.append(generateJSslowPeriod1());
        js.append(generateJSmaType());
        js.append(generateJSmaType1());
        js.append(generateJSseriesType9());
        js.append(generateJSmapping9());
        js.append(generateJSperiod7());
        js.append(generateJSseriesType10());
        js.append(generateJSdata8());
        js.append(generateJSdata9());
        js.append(generateJSdata10());
        js.append(generateJSdata11());
        js.append(generateJSmappingSettings2());
        js.append(generateJScolor());
        js.append(generateJScolor1());
        js.append(generateJScolor2());
        js.append(generateJSthickness());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSdefaultSeriesType());
        js.append(generateJSdefaultSeriesType1());
        js.append(generateJSmapping10());
        js.append(generateJSperiod8());
        js.append(generateJSadxPeriod());
        js.append(generateJSuseWildersSmoothing());
        js.append(generateJSpdiSeriesType());
        js.append(generateJSndiSeriesType());
        js.append(generateJSadxSeriesType());
        js.append(generateJSmapping11());
        js.append(generateJSperiod9());
        js.append(generateJSseriesType11());
        js.append(generateJSseriesType12());
        js.append(generateJSenabled());
        js.append(generateJSid());
        js.append(generateJSid1());
        js.append(generateJSindex());
        js.append(generateJSindex1());
        js.append(generateJSgrid());
        js.append(generateJSindex2());
        js.append(generateJSgrid1());
        js.append(generateJShatchFillPalette());
        js.append(generateJShatchFillPalette1());
        js.append(generateJSheight2());
        js.append(generateJSheight3());
        js.append(generateJSdata12());
        js.append(generateJSdata13());
        js.append(generateJSdata14());
        js.append(generateJSdata15());
        js.append(generateJSmappingSettings3());
        js.append(generateJSdata16());
        js.append(generateJSdata17());
        js.append(generateJSdata18());
        js.append(generateJSdata19());
        js.append(generateJSmappingSettings4());
        js.append(generateJSmapping12());
        js.append(generateJSkPeriod());
        js.append(generateJSkMAPeriod());
        js.append(generateJSdPeriod());
        js.append(generateJSkMAType());
        js.append(generateJSdMAType());
        js.append(generateJSkMultiplier());
        js.append(generateJSdMultiplier());
        js.append(generateJSkSeriesType());
        js.append(generateJSdSeriesType());
        js.append(generateJSjSeriesType());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJSlegend());
        js.append(generateJSdata20());
        js.append(generateJSdata21());
        js.append(generateJSdata22());
        js.append(generateJSdata23());
        js.append(generateJSmappingSettings5());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
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
        js.append(generateJSmarkerPalette());
        js.append(generateJSmarkerPalette1());
        js.append(generateJSmaxHeight());
        js.append(generateJSmaxHeight1());
        js.append(generateJSmaxWidth());
        js.append(generateJSmaxWidth1());
        js.append(generateJSminHeight());
        js.append(generateJSminHeight1());
        js.append(generateJSminWidth());
        js.append(generateJSminWidth1());
        js.append(generateJSindex3());
        js.append(generateJSminorGrid());
        js.append(generateJSindexOrValue());
        js.append(generateJSminorGrid1());
        js.append(generateJSmapping14());
        js.append(generateJSperiod10());
        js.append(generateJSseriesType13());
        js.append(generateJSseriesType14());
        js.append(generateJSdata28());
        js.append(generateJSdata29());
        js.append(generateJSdata30());
        js.append(generateJSdata31());
        js.append(generateJSmappingSettings7());
        js.append(generateJSpalette());
        js.append(generateJSpalette1());
        js.append(generateJSpalette2());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJSdata32());
        js.append(generateJSdata33());
        js.append(generateJSdata34());
        js.append(generateJSdata35());
        js.append(generateJSmappingSettings8());
        js.append(generateJSdata36());
        js.append(generateJSdata37());
        js.append(generateJSdata38());
        js.append(generateJSdata39());
        js.append(generateJSmappingSettings9());
        js.append(generateJSdata40());
        js.append(generateJSdata41());
        js.append(generateJSdata42());
        js.append(generateJSdata43());
        js.append(generateJSmappingSettings10());
        js.append(generateJSdata44());
        js.append(generateJSdata45());
        js.append(generateJSdata46());
        js.append(generateJSdata47());
        js.append(generateJSmappingSettings11());
        js.append(generateJStype2());
        js.append(generateJSid2());
        js.append(generateJSid3());
        js.append(generateJSindex4());
        js.append(generateJSright());
        js.append(generateJSright1());
        js.append(generateJSmapping15());
        js.append(generateJSperiod11());
        js.append(generateJSseriesType15());
        js.append(generateJSseriesType16());
        js.append(generateJSmapping16());
        js.append(generateJSperiod12());
        js.append(generateJSseriesType17());
        js.append(generateJSseriesType18());
        js.append(generateJSmapping17());
        js.append(generateJSperiod13());
        js.append(generateJSseriesType19());
        js.append(generateJSseriesType20());
        js.append(generateJSdata48());
        js.append(generateJSdata49());
        js.append(generateJSdata50());
        js.append(generateJSdata51());
        js.append(generateJSmappingSettings12());
        js.append(generateJSdata52());
        js.append(generateJSdata53());
        js.append(generateJSdata54());
        js.append(generateJSdata55());
        js.append(generateJSmappingSettings13());
        js.append(generateJSdata56());
        js.append(generateJSdata57());
        js.append(generateJSdata58());
        js.append(generateJSdata59());
        js.append(generateJSmappingSettings14());
        js.append(generateJSdata60());
        js.append(generateJSdata61());
        js.append(generateJSdata62());
        js.append(generateJSdata63());
        js.append(generateJSmappingSettings15());
        js.append(generateJSdata64());
        js.append(generateJSdata65());
        js.append(generateJSdata66());
        js.append(generateJSdata67());
        js.append(generateJSmappingSettings16());
        js.append(generateJSmapping18());
        js.append(generateJSkPeriod1());
        js.append(generateJSkMAPeriod1());
        js.append(generateJSdPeriod1());
        js.append(generateJSkMAType1());
        js.append(generateJSdMAType1());
        js.append(generateJSkSeriesType1());
        js.append(generateJSdSeriesType1());
        js.append(generateJStop());
        js.append(generateJStop1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSwidth2());
        js.append(generateJSwidth3());
        js.append(generateJSxAxis());
        js.append(generateJSindex5());
        js.append(generateJSyAxis());
        js.append(generateJSindex6());
        js.append(generateJSyAxis1());
        js.append(generateJSyScale());
        js.append(generateJSyScale1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}