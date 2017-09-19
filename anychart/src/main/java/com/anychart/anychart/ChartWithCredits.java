package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartWithCredits extends JsObject {

    
    private Boolean animation;

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        this.enabled = enabled;
        this.duration = duration;
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

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        this.container = null;
        this.container1 = null;
        this.container2 = null;
        this.container3 = null;
        
        this.container = container;
    }


    public void setContainer(Stage container1) {
        this.container = null;
        this.container1 = null;
        this.container2 = null;
        this.container3 = null;
        
        this.container1 = container1;
    }


    public void setContainer(String container2) {
        this.container = null;
        this.container1 = null;
        this.container2 = null;
        this.container3 = null;
        
        this.container2 = container2;
    }


    public void setContainer(Element container3) {
        this.container = null;
        this.container1 = null;
        this.container2 = null;
        this.container3 = null;
        
        this.container3 = container3;
    }

    private Boolean contextMenu;

    public void setContextmenu(Boolean contextMenu) {
        this.contextMenu = contextMenu;
    }

    private Boolean credits;

    public void setCredits(Boolean credits) {
        this.credits = credits;
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        this.async = async;
    }

    private Boolean enabled1;

    public void setEnabled(Boolean enabled1) {
        this.enabled = null;
        this.enabled1 = null;
        
        this.enabled1 = enabled1;
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = null;
        this.key1 = null;
        
        this.key = key;
    }


    public void setGetstat(Statistics key1) {
        this.key = null;
        this.key1 = null;
        
        this.key1 = key1;
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
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

    private String index;
    private Double index1;

    public void setLabel(String index) {
        this.index = null;
        this.index1 = null;
        
        this.index = index;
    }


    public void setLabel(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Boolean label;
    private String label1;

    public void setLabel(Boolean label) {
        this.label = null;
        this.label1 = null;
        
        this.label = label;
    }

    private String index2;
    private Double index3;
    private Boolean label2;
    private String label3;

    public void setLabel(String index2, Boolean label2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index2 = index2;
        this.label = null;
        this.label1 = null;
        this.label2 = null;
        this.label3 = null;
        
        this.label2 = label2;
    }


    public void setLabel(String index2, String label3) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index2 = index2;
        this.label = null;
        this.label1 = null;
        this.label2 = null;
        this.label3 = null;
        
        this.label3 = label3;
    }


    public void setLabel(Double index3, Boolean label2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
        this.label = null;
        this.label1 = null;
        this.label2 = null;
        this.label3 = null;
        
        this.label2 = label2;
    }


    public void setLabel(Double index3, String label3) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
        this.label = null;
        this.label1 = null;
        this.label2 = null;
        this.label3 = null;
        
        this.label3 = label3;
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

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
        this.xCoord = null;
        this.xCoord1 = null;
        
        this.xCoord1 = xCoord1;
        this.yCoord = null;
        this.yCoord1 = null;
        
        this.yCoord1 = yCoord1;
    }

    private Double[] margin;
    private String[] margin1;

    public void setMargin(Double[] margin) {
        this.margin = null;
        this.margin1 = null;
        
        this.margin = margin;
    }


    public void setMargin(String[] margin1) {
        this.margin = null;
        this.margin1 = null;
        
        this.margin1 = margin1;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value6 = value6;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value7 = value7;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value = value;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value1 = value1;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value2 = value2;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value3 = value3;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value4 = value4;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        
        this.value5 = value5;
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

    private Double[] padding;
    private String[] padding1;

    public void setPadding(Double[] padding) {
        this.padding = null;
        this.padding1 = null;
        
        this.padding = padding;
    }


    public void setPadding(String[] padding1) {
        this.padding = null;
        this.padding1 = null;
        
        this.padding1 = padding1;
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value14 = value14;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value8 = value8;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value9 = value9;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value10 = value10;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value11 = value11;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value12 = value12;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value13 = value13;
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value15 = value15;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value8 = value8;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value9 = value9;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value10 = value10;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value11 = value11;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value12 = value12;
        this.value = null;
        this.value1 = null;
        this.value2 = null;
        this.value3 = null;
        this.value4 = null;
        this.value5 = null;
        this.value6 = null;
        this.value7 = null;
        this.value8 = null;
        this.value9 = null;
        this.value10 = null;
        this.value11 = null;
        this.value12 = null;
        this.value13 = null;
        this.value14 = null;
        this.value15 = null;
        
        this.value13 = value13;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
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

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings, String filename) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings = csvSettings;
        this.filename = filename;
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings, String filename) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings = csvSettings;
        this.filename = filename;
    }

    private Double width2;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;
    private String filename1;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        
        this.width2 = width2;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename = null;
        this.filename1 = null;
        
        this.filename1 = filename1;
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        this.includeTheme = includeTheme;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        
        this.filename2 = filename2;
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private Boolean landscape1;
    private Double x2;
    private Double y2;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions = null;
        this.paperSizeOrWidthOrOptions1 = null;
        
        this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
        this.landscape = null;
        this.landscape1 = null;
        
        this.landscape1 = landscape1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        
        this.x2 = x2;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        
        this.y2 = y2;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        
        this.filename3 = filename3;
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions = null;
        this.paperSizeOrWidthOrOptions1 = null;
        
        this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
        this.landscape = null;
        this.landscape1 = null;
        
        this.landscape1 = landscape1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        
        this.x2 = x2;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        
        this.y2 = y2;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        
        this.filename3 = filename3;
    }

    private Double width3;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width3, Double height5, Double quality1, String filename4) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        
        this.width3 = width3;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        
        this.height5 = height5;
        this.quality = null;
        this.quality1 = null;
        
        this.quality1 = quality1;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        
        this.filename4 = filename4;
    }

    private String paperSize;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        this.paperSize = paperSize;
        this.landscape = null;
        this.landscape1 = null;
        this.landscape2 = null;
        
        this.landscape2 = landscape2;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        
        this.filename5 = filename5;
    }

    private Double width4;
    private Double height6;

    public void setSaveassvg(Double width4, Double height6) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        
        this.width4 = width4;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        
        this.height6 = height6;
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        this.chartDataExportMode2 = null;
        this.chartDataExportMode3 = null;
        
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        
        this.filename6 = filename6;
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        this.chartDataExportMode2 = null;
        this.chartDataExportMode3 = null;
        
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        
        this.filename6 = filename6;
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        this.includeTheme = null;
        this.includeTheme1 = null;
        
        this.includeTheme1 = includeTheme1;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        this.filename7 = null;
        
        this.filename7 = filename7;
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        this.title = null;
        this.title1 = null;
        
        this.title = title;
    }


    public void setTitle(String title1) {
        this.title = null;
        this.title1 = null;
        
        this.title1 = title1;
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings1;

    public void setTocsv(String chartDataExportMode4, String csvSettings1) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        this.chartDataExportMode2 = null;
        this.chartDataExportMode3 = null;
        this.chartDataExportMode4 = null;
        this.chartDataExportMode5 = null;
        
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings1) {
        this.chartDataExportMode = null;
        this.chartDataExportMode1 = null;
        this.chartDataExportMode2 = null;
        this.chartDataExportMode3 = null;
        this.chartDataExportMode4 = null;
        this.chartDataExportMode5 = null;
        
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        this.stringify = stringify;
        this.includeTheme = null;
        this.includeTheme1 = null;
        this.includeTheme2 = null;
        
        this.includeTheme2 = includeTheme2;
    }

    private String paperSize1;
    private Boolean landscape3;

    public void setTosvg(String paperSize1, Boolean landscape3) {
        this.paperSize = null;
        this.paperSize1 = null;
        
        this.paperSize1 = paperSize1;
        this.landscape = null;
        this.landscape1 = null;
        this.landscape2 = null;
        this.landscape3 = null;
        
        this.landscape3 = landscape3;
    }

    private Double width5;
    private Double height7;

    public void setTosvg(Double width5, Double height7) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        
        this.width5 = width5;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        
        this.height7 = height7;
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        this.asXmlNode = asXmlNode;
        this.includeTheme = null;
        this.includeTheme1 = null;
        this.includeTheme2 = null;
        this.includeTheme3 = null;
        
        this.includeTheme3 = includeTheme3;
    }

    private Boolean tooltip;

    public void setTooltip(Boolean tooltip) {
        this.tooltip = tooltip;
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

    private Double width6;
    private String width7;

    public void setWidth(Double width6) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        
        this.width6 = width6;
    }


    public void setWidth(String width7) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        
        this.width7 = width7;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSanimation() {
        if (animation != null) {
            return String.format(Locale.US, "animation: %b,", animation);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSduration() {
        if (duration != null) {
            return String.format(Locale.US, "duration: %f,", duration);
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

    private String generateJScontainer() {
        if (container != null) {
            return String.format(Locale.US, "container: %s,", (container != null) ? container.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer1() {
        if (container1 != null) {
            return String.format(Locale.US, "container: %s,", (container1 != null) ? container1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer2() {
        if (container2 != null) {
            return String.format(Locale.US, "container: %s,", container2);
        }
        return "";
    }

    private String generateJScontainer3() {
        if (container3 != null) {
            return String.format(Locale.US, "container: %s,", (container3 != null) ? container3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontextMenu() {
        if (contextMenu != null) {
            return String.format(Locale.US, "contextMenu: %b,", contextMenu);
        }
        return "";
    }

    private String generateJScredits() {
        if (credits != null) {
            return String.format(Locale.US, "credits: %b,", credits);
        }
        return "";
    }

    private String generateJSasync() {
        if (async != null) {
            return String.format(Locale.US, "async: %b,", async);
        }
        return "";
    }

    private String generateJSenabled1() {
        if (enabled1 != null) {
            return String.format(Locale.US, "enabled: %b,", enabled1);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSxCoord() {
        if (xCoord != null) {
            return String.format(Locale.US, "xCoord: %f,", xCoord);
        }
        return "";
    }

    private String generateJSyCoord() {
        if (yCoord != null) {
            return String.format(Locale.US, "yCoord: %f,", yCoord);
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %s,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSlabel() {
        if (label != null) {
            return String.format(Locale.US, "label: %b,", label);
        }
        return "";
    }

    private String generateJSlabel1() {
        if (label1 != null) {
            return String.format(Locale.US, "label: %s,", label1);
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %s,", index2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSlabel2() {
        if (label2 != null) {
            return String.format(Locale.US, "label: %b,", label2);
        }
        return "";
    }

    private String generateJSlabel3() {
        if (label3 != null) {
            return String.format(Locale.US, "label: %s,", label3);
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

    private String generateJSxCoord1() {
        if (xCoord1 != null) {
            return String.format(Locale.US, "xCoord: %f,", xCoord1);
        }
        return "";
    }

    private String generateJSyCoord1() {
        if (yCoord1 != null) {
            return String.format(Locale.US, "yCoord: %f,", yCoord1);
        }
        return "";
    }

    private String generateJSmargin() {
        if (margin != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin));
        }
        return "";
    }

    private String generateJSmargin1() {
        if (margin1 != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin1));
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
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

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSvalue8() {
        if (value8 != null) {
            return String.format(Locale.US, "value: %s,", value8);
        }
        return "";
    }

    private String generateJSvalue9() {
        if (value9 != null) {
            return String.format(Locale.US, "value: %f,", value9);
        }
        return "";
    }

    private String generateJSvalue10() {
        if (value10 != null) {
            return String.format(Locale.US, "value: %s,", value10);
        }
        return "";
    }

    private String generateJSvalue11() {
        if (value11 != null) {
            return String.format(Locale.US, "value: %f,", value11);
        }
        return "";
    }

    private String generateJSvalue12() {
        if (value12 != null) {
            return String.format(Locale.US, "value: %s,", value12);
        }
        return "";
    }

    private String generateJSvalue13() {
        if (value13 != null) {
            return String.format(Locale.US, "value: %f,", value13);
        }
        return "";
    }

    private String generateJSvalue14() {
        if (value14 != null) {
            return String.format(Locale.US, "value: %s,", value14);
        }
        return "";
    }

    private String generateJSvalue15() {
        if (value15 != null) {
            return String.format(Locale.US, "value: %f,", value15);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJSchartDataExportMode() {
        if (chartDataExportMode != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode);
        }
        return "";
    }

    private String generateJSchartDataExportMode1() {
        if (chartDataExportMode1 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: %s,", filename);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
        }
        return "";
    }

    private String generateJSquality() {
        if (quality != null) {
            return String.format(Locale.US, "quality: %f,", quality);
        }
        return "";
    }

    private String generateJSforceTransparentWhite() {
        if (forceTransparentWhite != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite);
        }
        return "";
    }

    private String generateJSfilename1() {
        if (filename1 != null) {
            return String.format(Locale.US, "filename: %s,", filename1);
        }
        return "";
    }

    private String generateJSincludeTheme() {
        if (includeTheme != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme);
        }
        return "";
    }

    private String generateJSfilename2() {
        if (filename2 != null) {
            return String.format(Locale.US, "filename: %s,", filename2);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidthOrOptions() {
        if (paperSizeOrWidthOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrWidthOrOptions: %f,", paperSizeOrWidthOrOptions);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidthOrOptions1() {
        if (paperSizeOrWidthOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrWidthOrOptions: %s,", paperSizeOrWidthOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape1() {
        if (landscape1 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape1);
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSfilename3() {
        if (filename3 != null) {
            return String.format(Locale.US, "filename: %s,", filename3);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %f,", width3);
        }
        return "";
    }

    private String generateJSheight5() {
        if (height5 != null) {
            return String.format(Locale.US, "height: %f,", height5);
        }
        return "";
    }

    private String generateJSquality1() {
        if (quality1 != null) {
            return String.format(Locale.US, "quality: %f,", quality1);
        }
        return "";
    }

    private String generateJSfilename4() {
        if (filename4 != null) {
            return String.format(Locale.US, "filename: %s,", filename4);
        }
        return "";
    }

    private String generateJSpaperSize() {
        if (paperSize != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize);
        }
        return "";
    }

    private String generateJSlandscape2() {
        if (landscape2 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape2);
        }
        return "";
    }

    private String generateJSfilename5() {
        if (filename5 != null) {
            return String.format(Locale.US, "filename: %s,", filename5);
        }
        return "";
    }

    private String generateJSwidth4() {
        if (width4 != null) {
            return String.format(Locale.US, "width: %f,", width4);
        }
        return "";
    }

    private String generateJSheight6() {
        if (height6 != null) {
            return String.format(Locale.US, "height: %f,", height6);
        }
        return "";
    }

    private String generateJSchartDataExportMode2() {
        if (chartDataExportMode2 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode2);
        }
        return "";
    }

    private String generateJSchartDataExportMode3() {
        if (chartDataExportMode3 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfilename6() {
        if (filename6 != null) {
            return String.format(Locale.US, "filename: %s,", filename6);
        }
        return "";
    }

    private String generateJSincludeTheme1() {
        if (includeTheme1 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme1);
        }
        return "";
    }

    private String generateJSfilename7() {
        if (filename7 != null) {
            return String.format(Locale.US, "filename: %s,", filename7);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJSchartDataExportMode4() {
        if (chartDataExportMode4 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", chartDataExportMode4);
        }
        return "";
    }

    private String generateJSchartDataExportMode5() {
        if (chartDataExportMode5 != null) {
            return String.format(Locale.US, "chartDataExportMode: %s,", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings1);
        }
        return "";
    }

    private String generateJSstringify() {
        if (stringify != null) {
            return String.format(Locale.US, "stringify: %b,", stringify);
        }
        return "";
    }

    private String generateJSincludeTheme2() {
        if (includeTheme2 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme2);
        }
        return "";
    }

    private String generateJSpaperSize1() {
        if (paperSize1 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize1);
        }
        return "";
    }

    private String generateJSlandscape3() {
        if (landscape3 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape3);
        }
        return "";
    }

    private String generateJSwidth5() {
        if (width5 != null) {
            return String.format(Locale.US, "width: %f,", width5);
        }
        return "";
    }

    private String generateJSheight7() {
        if (height7 != null) {
            return String.format(Locale.US, "height: %f,", height7);
        }
        return "";
    }

    private String generateJSasXmlNode() {
        if (asXmlNode != null) {
            return String.format(Locale.US, "asXmlNode: %b,", asXmlNode);
        }
        return "";
    }

    private String generateJSincludeTheme3() {
        if (includeTheme3 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme3);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip);
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

    private String generateJSwidth6() {
        if (width6 != null) {
            return String.format(Locale.US, "width: %f,", width6);
        }
        return "";
    }

    private String generateJSwidth7() {
        if (width7 != null) {
            return String.format(Locale.US, "width: %s,", width7);
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
        js.append(generateJSanimation());
        js.append(generateJSenabled());
        js.append(generateJSduration());
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
        js.append(generateJScontainer());
        js.append(generateJScontainer1());
        js.append(generateJScontainer2());
        js.append(generateJScontainer3());
        js.append(generateJScontextMenu());
        js.append(generateJScredits());
        js.append(generateJSasync());
        js.append(generateJSenabled1());
        js.append(generateJSkey());
        js.append(generateJSkey1());
        js.append(generateJSxCoord());
        js.append(generateJSyCoord());
        js.append(generateJSheight2());
        js.append(generateJSheight3());
        js.append(generateJSindex());
        js.append(generateJSindex1());
        js.append(generateJSlabel());
        js.append(generateJSlabel1());
        js.append(generateJSindex2());
        js.append(generateJSindex3());
        js.append(generateJSlabel2());
        js.append(generateJSlabel3());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSxCoord1());
        js.append(generateJSyCoord1());
        js.append(generateJSmargin());
        js.append(generateJSmargin1());
        js.append(generateJSvalue());
        js.append(generateJSvalue1());
        js.append(generateJSvalue2());
        js.append(generateJSvalue3());
        js.append(generateJSvalue4());
        js.append(generateJSvalue5());
        js.append(generateJSvalue6());
        js.append(generateJSvalue7());
        js.append(generateJSmaxHeight());
        js.append(generateJSmaxHeight1());
        js.append(generateJSmaxWidth());
        js.append(generateJSmaxWidth1());
        js.append(generateJSminHeight());
        js.append(generateJSminHeight1());
        js.append(generateJSminWidth());
        js.append(generateJSminWidth1());
        js.append(generateJSpadding());
        js.append(generateJSpadding1());
        js.append(generateJSvalue8());
        js.append(generateJSvalue9());
        js.append(generateJSvalue10());
        js.append(generateJSvalue11());
        js.append(generateJSvalue12());
        js.append(generateJSvalue13());
        js.append(generateJSvalue14());
        js.append(generateJSvalue15());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSright());
        js.append(generateJSright1());
        js.append(generateJSchartDataExportMode());
        js.append(generateJSchartDataExportMode1());
        js.append(generateJScsvSettings());
        js.append(generateJSfilename());
        js.append(generateJSwidth2());
        js.append(generateJSheight4());
        js.append(generateJSquality());
        js.append(generateJSforceTransparentWhite());
        js.append(generateJSfilename1());
        js.append(generateJSincludeTheme());
        js.append(generateJSfilename2());
        js.append(generateJSpaperSizeOrWidthOrOptions());
        js.append(generateJSpaperSizeOrWidthOrOptions1());
        js.append(generateJSlandscape1());
        js.append(generateJSx2());
        js.append(generateJSy2());
        js.append(generateJSfilename3());
        js.append(generateJSwidth3());
        js.append(generateJSheight5());
        js.append(generateJSquality1());
        js.append(generateJSfilename4());
        js.append(generateJSpaperSize());
        js.append(generateJSlandscape2());
        js.append(generateJSfilename5());
        js.append(generateJSwidth4());
        js.append(generateJSheight6());
        js.append(generateJSchartDataExportMode2());
        js.append(generateJSchartDataExportMode3());
        js.append(generateJSfilename6());
        js.append(generateJSincludeTheme1());
        js.append(generateJSfilename7());
        js.append(generateJStitle());
        js.append(generateJStitle1());
        js.append(generateJSchartDataExportMode4());
        js.append(generateJSchartDataExportMode5());
        js.append(generateJScsvSettings1());
        js.append(generateJSstringify());
        js.append(generateJSincludeTheme2());
        js.append(generateJSpaperSize1());
        js.append(generateJSlandscape3());
        js.append(generateJSwidth5());
        js.append(generateJSheight7());
        js.append(generateJSasXmlNode());
        js.append(generateJSincludeTheme3());
        js.append(generateJStooltip());
        js.append(generateJStop());
        js.append(generateJStop1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSwidth6());
        js.append(generateJSwidth7());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}