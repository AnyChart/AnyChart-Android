package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Candlestick extends JsObject {

    
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
    private Rect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds = bounds;
    }


    public void setBounds(Rect bounds1) {
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

    private Boolean clip;
    private Rect clip1;

    public void setClip(Boolean clip) {
        this.clip = null;
        this.clip1 = null;
        
        this.clip = clip;
    }


    public void setClip(Rect clip1) {
        this.clip = null;
        this.clip1 = null;
        
        this.clip1 = clip1;
    }

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data = data;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings = csvSettings;
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data = data;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }


    public void setData(Set data1, TextParsingMode csvSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data1 = data1;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings = csvSettings;
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data1 = data1;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }


    public void setData(String[] data2, TextParsingMode csvSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data2 = data2;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings = csvSettings;
    }


    public void setData(String[] data2, TextParsingSettings csvSettings1) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data2 = data2;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }


    public void setData(String data3, TextParsingMode csvSettings) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data3 = data3;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings = csvSettings;
    }


    public void setData(String data3, TextParsingSettings csvSettings1) {
        this.data = null;
        this.data1 = null;
        this.data2 = null;
        this.data3 = null;
        
        this.data3 = data3;
        this.csvSettings = null;
        this.csvSettings1 = null;
        
        this.csvSettings1 = csvSettings1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Double indexes;
    private Double[] indexes1;

    public void setExcludepoint(Double indexes) {
        this.indexes = null;
        this.indexes1 = null;
        
        this.indexes = indexes;
    }


    public void setExcludepoint(Double[] indexes1) {
        this.indexes = null;
        this.indexes1 = null;
        
        this.indexes1 = indexes1;
    }

    private Fill fallingFill;

    public void setFallingfill(Fill fallingFill) {
        this.fallingFill = fallingFill;
    }

    private String color1;
    private Double opacity;

    public void setFallingfill(String color1, Double opacity) {
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setFallingfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFallingfill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFallingfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFallingfill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFallingfill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }


    public void setFallingfill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }

    private Fill imageSettings;
    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color2;
    private Double thickness;
    private Double size;

    public void setFallinghatchfill(PatternFill patternFillOrTypeOrState, String color2, Double thickness, Double size) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        
        this.patternFillOrTypeOrState = patternFillOrTypeOrState;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setFallinghatchfill(HatchFill patternFillOrTypeOrState1, String color2, Double thickness, Double size) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        
        this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setFallinghatchfill(HatchFillType patternFillOrTypeOrState2, String color2, Double thickness, Double size) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        
        this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setFallinghatchfill(String patternFillOrTypeOrState3, String color2, Double thickness, Double size) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        
        this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }


    public void setFallinghatchfill(Boolean patternFillOrTypeOrState4, String color2, Double thickness, Double size) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        
        this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setFallingstroke(Stroke stroke, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke = stroke;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setFallingstroke(ColoredFill stroke1, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke1 = stroke1;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setFallingstroke(String stroke2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        
        this.stroke2 = stroke2;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Double index;

    public void setGetpoint(Double index) {
        this.index = index;
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

    private Double index1;

    public void setHover(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Double[] indexes2;

    public void setHover(Double[] indexes2) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        
        this.indexes2 = indexes2;
    }

    private Fill hoverFallingFill;

    public void setHoverfallingfill(Fill hoverFallingFill) {
        this.hoverFallingFill = hoverFallingFill;
    }

    private String color3;
    private Double opacity3;

    public void setHoverfallingfill(String color3, Double opacity3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color3 = color3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode3;
    private Rect mode4;
    private Double opacity4;

    public void setHoverfallingfill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfallingfill(GradientKey[] keys4, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfallingfill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setHoverfallingfill(String[] keys5, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private Rect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setHoverfallingfill(GradientKey[] keys6, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys6 = keys6;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setHoverfallingfill(String[] keys7, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys7 = keys7;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }

    private Fill imageSettings1;
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color4;
    private Double thickness2;
    private Double size1;

    public void setHoverfallinghatchfill(PatternFill patternFillOrType, String color4, Double thickness2, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType = patternFillOrType;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverfallinghatchfill(HatchFill patternFillOrType1, String color4, Double thickness2, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType1 = patternFillOrType1;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverfallinghatchfill(HatchFillType patternFillOrType2, String color4, Double thickness2, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType2 = patternFillOrType2;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setHoverfallinghatchfill(String patternFillOrType3, String color4, Double thickness2, Double size1) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType3 = patternFillOrType3;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }

    private Stroke color5;
    private ColoredFill color6;
    private String color7;
    private Double thickness3;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setHoverfallingstroke(Stroke color5, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color5 = color5;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setHoverfallingstroke(ColoredFill color6, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color6 = color6;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }


    public void setHoverfallingstroke(String color7, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color7 = color7;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.dashpattern = null;
        this.dashpattern1 = null;
        
        this.dashpattern1 = dashpattern1;
        this.lineJoin = null;
        this.lineJoin1 = null;
        
        this.lineJoin1 = lineJoin1;
        this.lineCap = null;
        this.lineCap1 = null;
        
        this.lineCap1 = lineCap1;
    }

    private Boolean hoverLabels;

    public void setHoverlabels(Boolean hoverLabels) {
        this.hoverLabels = hoverLabels;
    }

    private Boolean hoverMarkers;
    private String hoverMarkers1;

    public void setHovermarkers(Boolean hoverMarkers) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers = hoverMarkers;
    }


    public void setHovermarkers(String hoverMarkers1) {
        this.hoverMarkers = null;
        this.hoverMarkers1 = null;
        
        this.hoverMarkers1 = hoverMarkers1;
    }

    private Fill hoverRisingFill;

    public void setHoverrisingfill(Fill hoverRisingFill) {
        this.hoverRisingFill = hoverRisingFill;
    }

    private String color8;
    private Double opacity6;

    public void setHoverrisingfill(String color8, Double opacity6) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        
        this.color8 = color8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        
        this.opacity6 = opacity6;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode6;
    private Rect mode7;
    private Double opacity7;

    public void setHoverrisingfill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setHoverrisingfill(GradientKey[] keys8, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setHoverrisingfill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setHoverrisingfill(String[] keys9, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private Rect mode8;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setHoverrisingfill(GradientKey[] keys10, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys10 = keys10;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }


    public void setHoverrisingfill(String[] keys11, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys11 = keys11;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }

    private Fill imageSettings2;
    private PatternFill patternFillOrType4;
    private HatchFill patternFillOrType5;
    private HatchFillType patternFillOrType6;
    private String patternFillOrType7;
    private String color9;
    private Double thickness4;
    private Double size2;

    public void setHoverrisinghatchfill(PatternFill patternFillOrType4, String color9, Double thickness4, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        
        this.patternFillOrType4 = patternFillOrType4;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setHoverrisinghatchfill(HatchFill patternFillOrType5, String color9, Double thickness4, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        
        this.patternFillOrType5 = patternFillOrType5;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setHoverrisinghatchfill(HatchFillType patternFillOrType6, String color9, Double thickness4, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        
        this.patternFillOrType6 = patternFillOrType6;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setHoverrisinghatchfill(String patternFillOrType7, String color9, Double thickness4, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        
        this.patternFillOrType7 = patternFillOrType7;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        
        this.color9 = color9;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }

    private Stroke stroke3;
    private ColoredFill stroke4;
    private String stroke5;
    private Double thickness5;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setHoverrisingstroke(Stroke stroke3, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        
        this.stroke3 = stroke3;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setHoverrisingstroke(ColoredFill stroke4, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        
        this.stroke4 = stroke4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }


    public void setHoverrisingstroke(String stroke5, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        
        this.stroke5 = stroke5;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        
        this.dashpattern2 = dashpattern2;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        
        this.lineJoin2 = lineJoin2;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        
        this.lineCap2 = lineCap2;
    }

    private String id;
    private Double id1;

    public void setId(String id) {
        this.id = null;
        this.id1 = null;
        
        this.id = id;
    }


    public void setId(Double id1) {
        this.id = null;
        this.id1 = null;
        
        this.id1 = id1;
    }

    private Double indexes3;
    private Double[] indexes4;

    public void setIncludepoint(Double indexes3) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        
        this.indexes3 = indexes3;
    }


    public void setIncludepoint(Double[] indexes4) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        
        this.indexes4 = indexes4;
    }

    private Boolean isVertical;

    public void setIsvertical(Boolean isVertical) {
        this.isVertical = isVertical;
    }

    private Double indexes5;
    private Double[] indexes6;

    public void setKeeponlypoints(Double indexes5) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        
        this.indexes5 = indexes5;
    }


    public void setKeeponlypoints(Double[] indexes6) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        
        this.indexes6 = indexes6;
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;
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

    private Boolean markers;
    private String markers1;

    public void setMarkers(Boolean markers) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers = markers;
    }


    public void setMarkers(String markers1) {
        this.markers = null;
        this.markers1 = null;
        
        this.markers1 = markers1;
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

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private Double pointWidth;
    private String pointWidth1;

    public void setPointwidth(Double pointWidth) {
        this.pointWidth = null;
        this.pointWidth1 = null;
        
        this.pointWidth = pointWidth;
    }


    public void setPointwidth(String pointWidth1) {
        this.pointWidth = null;
        this.pointWidth1 = null;
        
        this.pointWidth1 = pointWidth1;
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

    private Fill risingFill;

    public void setRisingfill(Fill risingFill) {
        this.risingFill = risingFill;
    }

    private String color10;
    private Double opacity9;

    public void setRisingfill(String color10, Double opacity9) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        
        this.color10 = color10;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        
        this.opacity9 = opacity9;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode9;
    private Rect mode10;
    private Double opacity10;

    public void setRisingfill(GradientKey[] keys12, Boolean mode9, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys12 = keys12;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode9 = mode9;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRisingfill(GradientKey[] keys12, Rect mode10, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys12 = keys12;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode10 = mode10;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRisingfill(String[] keys13, Boolean mode9, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys13 = keys13;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode9 = mode9;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRisingfill(String[] keys13, Rect mode10, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys13 = keys13;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode10 = mode10;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private Rect mode11;
    private Double opacity11;
    private Double fx3;
    private Double fy3;

    public void setRisingfill(GradientKey[] keys14, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        
        this.keys14 = keys14;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        
        this.cx3 = cx3;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        
        this.cy3 = cy3;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        
        this.mode11 = mode11;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        
        this.fx3 = fx3;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        
        this.fy3 = fy3;
    }


    public void setRisingfill(String[] keys15, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        
        this.keys15 = keys15;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        
        this.cx3 = cx3;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        
        this.cy3 = cy3;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        
        this.mode11 = mode11;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        
        this.fx3 = fx3;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        
        this.fy3 = fy3;
    }

    private Fill imageSettings3;
    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color11;
    private Double thickness6;
    private Double size3;

    public void setRisinghatchfill(PatternFill patternFillOrTypeOrState5, String color11, Double thickness6, Double size3) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        
        this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setRisinghatchfill(HatchFill patternFillOrTypeOrState6, String color11, Double thickness6, Double size3) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        
        this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setRisinghatchfill(HatchFillType patternFillOrTypeOrState7, String color11, Double thickness6, Double size3) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        
        this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setRisinghatchfill(String patternFillOrTypeOrState8, String color11, Double thickness6, Double size3) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        
        this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setRisinghatchfill(Boolean patternFillOrTypeOrState9, String color11, Double thickness6, Double size3) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        
        this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }

    private Stroke color12;
    private ColoredFill color13;
    private String color14;
    private Double thickness7;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setRisingstroke(Stroke color12, Double thickness7, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        
        this.color12 = color12;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        
        this.thickness7 = thickness7;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }


    public void setRisingstroke(ColoredFill color13, Double thickness7, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        
        this.color13 = color13;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        
        this.thickness7 = thickness7;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }


    public void setRisingstroke(String color14, Double thickness7, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        
        this.color14 = color14;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        
        this.thickness7 = thickness7;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        
        this.dashpattern3 = dashpattern3;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        
        this.lineJoin3 = lineJoin3;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        
        this.lineCap3 = lineCap3;
    }

    private Double index2;

    public void setSelect(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
    }

    private Double indexes7;
    private Double[] indexes8;

    public void setSelect(Double[] indexes8) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        this.indexes7 = null;
        this.indexes8 = null;
        
        this.indexes8 = indexes8;
    }

    private Fill selectFallingFill;

    public void setSelectfallingfill(Fill selectFallingFill) {
        this.selectFallingFill = selectFallingFill;
    }

    private String color15;
    private Double opacity12;

    public void setSelectfallingfill(String color15, Double opacity12) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        
        this.color15 = color15;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        
        this.opacity12 = opacity12;
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode12;
    private Rect mode13;
    private Double opacity13;

    public void setSelectfallingfill(GradientKey[] keys16, Boolean mode12, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys16 = keys16;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode12 = mode12;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setSelectfallingfill(GradientKey[] keys16, Rect mode13, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys16 = keys16;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode13 = mode13;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setSelectfallingfill(String[] keys17, Boolean mode12, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys17 = keys17;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode12 = mode12;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setSelectfallingfill(String[] keys17, Rect mode13, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys17 = keys17;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode13 = mode13;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private Rect mode14;
    private Double opacity14;
    private Double fx4;
    private Double fy4;

    public void setSelectfallingfill(GradientKey[] keys18, Double cx4, Double cy4, Rect mode14, Double opacity14, Double fx4, Double fy4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        
        this.keys18 = keys18;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        
        this.cx4 = cx4;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        
        this.cy4 = cy4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        
        this.mode14 = mode14;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        
        this.fx4 = fx4;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        
        this.fy4 = fy4;
    }


    public void setSelectfallingfill(String[] keys19, Double cx4, Double cy4, Rect mode14, Double opacity14, Double fx4, Double fy4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        
        this.keys19 = keys19;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        
        this.cx4 = cx4;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        
        this.cy4 = cy4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        
        this.mode14 = mode14;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        
        this.fx4 = fx4;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        
        this.fy4 = fy4;
    }

    private Fill imageSettings4;
    private PatternFill patternFillOrTypeOrState10;
    private HatchFill patternFillOrTypeOrState11;
    private HatchFillType patternFillOrTypeOrState12;
    private String patternFillOrTypeOrState13;
    private Boolean patternFillOrTypeOrState14;
    private String color16;
    private Double thickness8;
    private Double size4;

    public void setSelectfallinghatchfill(PatternFill patternFillOrTypeOrState10, String color16, Double thickness8, Double size4) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        
        this.patternFillOrTypeOrState10 = patternFillOrTypeOrState10;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        
        this.color16 = color16;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        
        this.thickness8 = thickness8;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        
        this.size4 = size4;
    }


    public void setSelectfallinghatchfill(HatchFill patternFillOrTypeOrState11, String color16, Double thickness8, Double size4) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        
        this.patternFillOrTypeOrState11 = patternFillOrTypeOrState11;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        
        this.color16 = color16;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        
        this.thickness8 = thickness8;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        
        this.size4 = size4;
    }


    public void setSelectfallinghatchfill(HatchFillType patternFillOrTypeOrState12, String color16, Double thickness8, Double size4) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        
        this.patternFillOrTypeOrState12 = patternFillOrTypeOrState12;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        
        this.color16 = color16;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        
        this.thickness8 = thickness8;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        
        this.size4 = size4;
    }


    public void setSelectfallinghatchfill(String patternFillOrTypeOrState13, String color16, Double thickness8, Double size4) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        
        this.patternFillOrTypeOrState13 = patternFillOrTypeOrState13;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        
        this.color16 = color16;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        
        this.thickness8 = thickness8;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        
        this.size4 = size4;
    }


    public void setSelectfallinghatchfill(Boolean patternFillOrTypeOrState14, String color16, Double thickness8, Double size4) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        
        this.patternFillOrTypeOrState14 = patternFillOrTypeOrState14;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        
        this.color16 = color16;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        
        this.thickness8 = thickness8;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        
        this.size4 = size4;
    }

    private Stroke color17;
    private ColoredFill color18;
    private String color19;
    private Double thickness9;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    public void setSelectfallingstroke(Stroke color17, Double thickness9, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        
        this.color17 = color17;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        
        this.thickness9 = thickness9;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }


    public void setSelectfallingstroke(ColoredFill color18, Double thickness9, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        
        this.color18 = color18;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        
        this.thickness9 = thickness9;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }


    public void setSelectfallingstroke(String color19, Double thickness9, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        
        this.color19 = color19;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        
        this.thickness9 = thickness9;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        
        this.dashpattern4 = dashpattern4;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        
        this.lineJoin4 = lineJoin4;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        
        this.lineCap4 = lineCap4;
    }

    private Boolean selectLabels;

    public void setSelectlabels(Boolean selectLabels) {
        this.selectLabels = selectLabels;
    }

    private Boolean selectMarkers;
    private String selectMarkers1;

    public void setSelectmarkers(Boolean selectMarkers) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers = selectMarkers;
    }


    public void setSelectmarkers(String selectMarkers1) {
        this.selectMarkers = null;
        this.selectMarkers1 = null;
        
        this.selectMarkers1 = selectMarkers1;
    }

    private Fill selectRisingFill;

    public void setSelectrisingfill(Fill selectRisingFill) {
        this.selectRisingFill = selectRisingFill;
    }

    private String color20;
    private Double opacity15;

    public void setSelectrisingfill(String color20, Double opacity15) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        
        this.color20 = color20;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        
        this.opacity15 = opacity15;
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode15;
    private Rect mode16;
    private Double opacity16;

    public void setSelectrisingfill(GradientKey[] keys20, Boolean mode15, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys20 = keys20;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode15 = mode15;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setSelectrisingfill(GradientKey[] keys20, Rect mode16, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys20 = keys20;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode16 = mode16;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setSelectrisingfill(String[] keys21, Boolean mode15, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys21 = keys21;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode15 = mode15;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setSelectrisingfill(String[] keys21, Rect mode16, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys21 = keys21;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode16 = mode16;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private Rect mode17;
    private Double opacity17;
    private Double fx5;
    private Double fy5;

    public void setSelectrisingfill(GradientKey[] keys22, Double cx5, Double cy5, Rect mode17, Double opacity17, Double fx5, Double fy5) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        
        this.keys22 = keys22;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        
        this.cx5 = cx5;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        
        this.cy5 = cy5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        
        this.mode17 = mode17;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        
        this.fx5 = fx5;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        
        this.fy5 = fy5;
    }


    public void setSelectrisingfill(String[] keys23, Double cx5, Double cy5, Rect mode17, Double opacity17, Double fx5, Double fy5) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        
        this.keys23 = keys23;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        
        this.cx5 = cx5;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        
        this.cy5 = cy5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        
        this.mode17 = mode17;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        
        this.fx5 = fx5;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        
        this.fy5 = fy5;
    }

    private Fill imageSettings5;
    private PatternFill patternFillOrTypeOrState15;
    private HatchFill patternFillOrTypeOrState16;
    private HatchFillType patternFillOrTypeOrState17;
    private String patternFillOrTypeOrState18;
    private Boolean patternFillOrTypeOrState19;
    private String color21;
    private Double thickness10;
    private Double size5;

    public void setSelectrisinghatchfill(PatternFill patternFillOrTypeOrState15, String color21, Double thickness10, Double size5) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        this.patternFillOrTypeOrState15 = null;
        this.patternFillOrTypeOrState16 = null;
        this.patternFillOrTypeOrState17 = null;
        this.patternFillOrTypeOrState18 = null;
        this.patternFillOrTypeOrState19 = null;
        
        this.patternFillOrTypeOrState15 = patternFillOrTypeOrState15;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        this.color21 = null;
        
        this.color21 = color21;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        
        this.thickness10 = thickness10;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        this.size5 = null;
        
        this.size5 = size5;
    }


    public void setSelectrisinghatchfill(HatchFill patternFillOrTypeOrState16, String color21, Double thickness10, Double size5) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        this.patternFillOrTypeOrState15 = null;
        this.patternFillOrTypeOrState16 = null;
        this.patternFillOrTypeOrState17 = null;
        this.patternFillOrTypeOrState18 = null;
        this.patternFillOrTypeOrState19 = null;
        
        this.patternFillOrTypeOrState16 = patternFillOrTypeOrState16;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        this.color21 = null;
        
        this.color21 = color21;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        
        this.thickness10 = thickness10;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        this.size5 = null;
        
        this.size5 = size5;
    }


    public void setSelectrisinghatchfill(HatchFillType patternFillOrTypeOrState17, String color21, Double thickness10, Double size5) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        this.patternFillOrTypeOrState15 = null;
        this.patternFillOrTypeOrState16 = null;
        this.patternFillOrTypeOrState17 = null;
        this.patternFillOrTypeOrState18 = null;
        this.patternFillOrTypeOrState19 = null;
        
        this.patternFillOrTypeOrState17 = patternFillOrTypeOrState17;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        this.color21 = null;
        
        this.color21 = color21;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        
        this.thickness10 = thickness10;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        this.size5 = null;
        
        this.size5 = size5;
    }


    public void setSelectrisinghatchfill(String patternFillOrTypeOrState18, String color21, Double thickness10, Double size5) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        this.patternFillOrTypeOrState15 = null;
        this.patternFillOrTypeOrState16 = null;
        this.patternFillOrTypeOrState17 = null;
        this.patternFillOrTypeOrState18 = null;
        this.patternFillOrTypeOrState19 = null;
        
        this.patternFillOrTypeOrState18 = patternFillOrTypeOrState18;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        this.color21 = null;
        
        this.color21 = color21;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        
        this.thickness10 = thickness10;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        this.size5 = null;
        
        this.size5 = size5;
    }


    public void setSelectrisinghatchfill(Boolean patternFillOrTypeOrState19, String color21, Double thickness10, Double size5) {
        this.patternFillOrTypeOrState = null;
        this.patternFillOrTypeOrState1 = null;
        this.patternFillOrTypeOrState2 = null;
        this.patternFillOrTypeOrState3 = null;
        this.patternFillOrTypeOrState4 = null;
        this.patternFillOrTypeOrState5 = null;
        this.patternFillOrTypeOrState6 = null;
        this.patternFillOrTypeOrState7 = null;
        this.patternFillOrTypeOrState8 = null;
        this.patternFillOrTypeOrState9 = null;
        this.patternFillOrTypeOrState10 = null;
        this.patternFillOrTypeOrState11 = null;
        this.patternFillOrTypeOrState12 = null;
        this.patternFillOrTypeOrState13 = null;
        this.patternFillOrTypeOrState14 = null;
        this.patternFillOrTypeOrState15 = null;
        this.patternFillOrTypeOrState16 = null;
        this.patternFillOrTypeOrState17 = null;
        this.patternFillOrTypeOrState18 = null;
        this.patternFillOrTypeOrState19 = null;
        
        this.patternFillOrTypeOrState19 = patternFillOrTypeOrState19;
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        this.color8 = null;
        this.color9 = null;
        this.color10 = null;
        this.color11 = null;
        this.color12 = null;
        this.color13 = null;
        this.color14 = null;
        this.color15 = null;
        this.color16 = null;
        this.color17 = null;
        this.color18 = null;
        this.color19 = null;
        this.color20 = null;
        this.color21 = null;
        
        this.color21 = color21;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        
        this.thickness10 = thickness10;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        this.size4 = null;
        this.size5 = null;
        
        this.size5 = size5;
    }

    private Stroke stroke6;
    private ColoredFill stroke7;
    private String stroke8;
    private Double thickness11;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    public void setSelectrisingstroke(Stroke stroke6, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        this.stroke6 = null;
        this.stroke7 = null;
        this.stroke8 = null;
        
        this.stroke6 = stroke6;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        this.thickness11 = null;
        
        this.thickness11 = thickness11;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }


    public void setSelectrisingstroke(ColoredFill stroke7, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        this.stroke6 = null;
        this.stroke7 = null;
        this.stroke8 = null;
        
        this.stroke7 = stroke7;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        this.thickness11 = null;
        
        this.thickness11 = thickness11;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }


    public void setSelectrisingstroke(String stroke8, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.stroke = null;
        this.stroke1 = null;
        this.stroke2 = null;
        this.stroke3 = null;
        this.stroke4 = null;
        this.stroke5 = null;
        this.stroke6 = null;
        this.stroke7 = null;
        this.stroke8 = null;
        
        this.stroke8 = stroke8;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        this.thickness7 = null;
        this.thickness8 = null;
        this.thickness9 = null;
        this.thickness10 = null;
        this.thickness11 = null;
        
        this.thickness11 = thickness11;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        
        this.dashpattern5 = dashpattern5;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        
        this.lineJoin5 = lineJoin5;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        
        this.lineCap5 = lineCap5;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public void setSelectionmode(SelectionMode selectionMode) {
        this.selectionMode = null;
        this.selectionMode1 = null;
        
        this.selectionMode = selectionMode;
    }


    public void setSelectionmode(String selectionMode1) {
        this.selectionMode = null;
        this.selectionMode1 = null;
        
        this.selectionMode1 = selectionMode1;
    }

    private String seriesType;

    public void setSeriestype(String seriesType) {
        this.seriesType = seriesType;
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

    private Double subRangeRatio;

    public void setTransformx(Double subRangeRatio) {
        this.subRangeRatio = subRangeRatio;
    }

    private Double subRangeRatio1;

    public void setTransformy(Double subRangeRatio1) {
        this.subRangeRatio = null;
        this.subRangeRatio1 = null;
        
        this.subRangeRatio1 = subRangeRatio1;
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    public void setUnhover(Double indexOrIndexes) {
        this.indexOrIndexes = null;
        this.indexOrIndexes1 = null;
        
        this.indexOrIndexes = indexOrIndexes;
    }


    public void setUnhover(Double[] indexOrIndexes1) {
        this.indexOrIndexes = null;
        this.indexOrIndexes1 = null;
        
        this.indexOrIndexes1 = indexOrIndexes1;
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

    private Double index3;

    public void setUnselect(Double index3) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
    }

    private Double[] indexes9;

    public void setUnselect(Double[] indexes9) {
        this.indexes = null;
        this.indexes1 = null;
        this.indexes2 = null;
        this.indexes3 = null;
        this.indexes4 = null;
        this.indexes5 = null;
        this.indexes6 = null;
        this.indexes7 = null;
        this.indexes8 = null;
        this.indexes9 = null;
        
        this.indexes9 = indexes9;
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

    private Double position;

    public void setXpointposition(Double position) {
        this.position = position;
    }

    private Base xScale;

    public void setXscale(Base xScale) {
        this.xScale = xScale;
    }

    private Base yScale;

    public void setYscale(Base yScale) {
        this.yScale = yScale;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: \"%s\",", bottom1);
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
            return String.format(Locale.US, "x: \"%s\",", x1);
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
            return String.format(Locale.US, "y: \"%s\",", y1);
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
            return String.format(Locale.US, "width: \"%s\",", width1);
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
            return String.format(Locale.US, "height: \"%s\",", height1);
        }
        return "";
    }

    private String generateJSclip() {
        if (clip != null) {
            return String.format(Locale.US, "clip: %b,", clip);
        }
        return "";
    }

    private String generateJSclip1() {
        if (clip1 != null) {
            return String.format(Locale.US, "clip: %s,", (clip1 != null) ? clip1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: \"%s\",", color);
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
            return String.format(Locale.US, "data: %s,", Arrays.toString(data2));
        }
        return "";
    }

    private String generateJSdata3() {
        if (data3 != null) {
            return String.format(Locale.US, "data: \"%s\",", data3);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings != null) ? csvSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings1 != null) ? csvSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %f,", indexes);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes1));
        }
        return "";
    }

    private String generateJSfallingFill() {
        if (fallingFill != null) {
            return String.format(Locale.US, "fallingFill: %s,", (fallingFill != null) ? fallingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: \"%s\",", color1);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", (mode2 != null) ? mode2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState() {
        if (patternFillOrTypeOrState != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState1() {
        if (patternFillOrTypeOrState1 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState2() {
        if (patternFillOrTypeOrState2 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState3() {
        if (patternFillOrTypeOrState3 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: \"%s\",", patternFillOrTypeOrState3);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState4() {
        if (patternFillOrTypeOrState4 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState4);
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: \"%s\",", color2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: \"%s\",", stroke2);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern);
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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
            return String.format(Locale.US, "height: \"%s\",", height3);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes2));
        }
        return "";
    }

    private String generateJShoverFallingFill() {
        if (hoverFallingFill != null) {
            return String.format(Locale.US, "hoverFallingFill: %s,", (hoverFallingFill != null) ? hoverFallingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: \"%s\",", color3);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %b,", mode3);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %s,", (mode4 != null) ? mode4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType() {
        if (patternFillOrType != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType1() {
        if (patternFillOrType1 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType2() {
        if (patternFillOrType2 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType3() {
        if (patternFillOrType3 != null) {
            return String.format(Locale.US, "patternFillOrType: \"%s\",", patternFillOrType3);
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: \"%s\",", color4);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", (color5 != null) ? color5.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", (color6 != null) ? color6.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: \"%s\",", color7);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverLabels() {
        if (hoverLabels != null) {
            return String.format(Locale.US, "hoverLabels: %b,", hoverLabels);
        }
        return "";
    }

    private String generateJShoverMarkers() {
        if (hoverMarkers != null) {
            return String.format(Locale.US, "hoverMarkers: %b,", hoverMarkers);
        }
        return "";
    }

    private String generateJShoverMarkers1() {
        if (hoverMarkers1 != null) {
            return String.format(Locale.US, "hoverMarkers: \"%s\",", hoverMarkers1);
        }
        return "";
    }

    private String generateJShoverRisingFill() {
        if (hoverRisingFill != null) {
            return String.format(Locale.US, "hoverRisingFill: %s,", (hoverRisingFill != null) ? hoverRisingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: \"%s\",", color8);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %b,", mode6);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %s,", (mode8 != null) ? mode8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType4() {
        if (patternFillOrType4 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType4 != null) ? patternFillOrType4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType5() {
        if (patternFillOrType5 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType6() {
        if (patternFillOrType6 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType7() {
        if (patternFillOrType7 != null) {
            return String.format(Locale.US, "patternFillOrType: \"%s\",", patternFillOrType7);
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: \"%s\",", color9);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSsize2() {
        if (size2 != null) {
            return String.format(Locale.US, "size: %f,", size2);
        }
        return "";
    }

    private String generateJSstroke3() {
        if (stroke3 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke3 != null) ? stroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke4() {
        if (stroke4 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke4 != null) ? stroke4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke5() {
        if (stroke5 != null) {
            return String.format(Locale.US, "stroke: \"%s\",", stroke5);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: \"%s\",", id);
        }
        return "";
    }

    private String generateJSid1() {
        if (id1 != null) {
            return String.format(Locale.US, "id: %f,", id1);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes3);
        }
        return "";
    }

    private String generateJSindexes4() {
        if (indexes4 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes4));
        }
        return "";
    }

    private String generateJSisVertical() {
        if (isVertical != null) {
            return String.format(Locale.US, "isVertical: %b,", isVertical);
        }
        return "";
    }

    private String generateJSindexes5() {
        if (indexes5 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes5);
        }
        return "";
    }

    private String generateJSindexes6() {
        if (indexes6 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes6));
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %b,", labels);
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
            return String.format(Locale.US, "left: \"%s\",", left1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
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
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %b,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: \"%s\",", markers1);
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
            return String.format(Locale.US, "maxHeight: \"%s\",", maxHeight1);
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
            return String.format(Locale.US, "maxWidth: \"%s\",", maxWidth1);
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
            return String.format(Locale.US, "minHeight: \"%s\",", minHeight1);
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
            return String.format(Locale.US, "minWidth: \"%s\",", minWidth1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: \"%s\",", name);
        }
        return "";
    }

    private String generateJSpointWidth() {
        if (pointWidth != null) {
            return String.format(Locale.US, "pointWidth: %f,", pointWidth);
        }
        return "";
    }

    private String generateJSpointWidth1() {
        if (pointWidth1 != null) {
            return String.format(Locale.US, "pointWidth: \"%s\",", pointWidth1);
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
            return String.format(Locale.US, "type: \"%s\",", type2);
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
            return String.format(Locale.US, "right: \"%s\",", right1);
        }
        return "";
    }

    private String generateJSrisingFill() {
        if (risingFill != null) {
            return String.format(Locale.US, "risingFill: %s,", (risingFill != null) ? risingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: \"%s\",", color10);
        }
        return "";
    }

    private String generateJSopacity9() {
        if (opacity9 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity9);
        }
        return "";
    }

    private String generateJSkeys12() {
        if (keys12 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys12));
        }
        return "";
    }

    private String generateJSkeys13() {
        if (keys13 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys13));
        }
        return "";
    }

    private String generateJSangle3() {
        if (angle3 != null) {
            return String.format(Locale.US, "angle: %f,", angle3);
        }
        return "";
    }

    private String generateJSmode9() {
        if (mode9 != null) {
            return String.format(Locale.US, "mode: %b,", mode9);
        }
        return "";
    }

    private String generateJSmode10() {
        if (mode10 != null) {
            return String.format(Locale.US, "mode: %s,", (mode10 != null) ? mode10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity10() {
        if (opacity10 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity10);
        }
        return "";
    }

    private String generateJSkeys14() {
        if (keys14 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys14));
        }
        return "";
    }

    private String generateJSkeys15() {
        if (keys15 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys15));
        }
        return "";
    }

    private String generateJScx3() {
        if (cx3 != null) {
            return String.format(Locale.US, "cx: %f,", cx3);
        }
        return "";
    }

    private String generateJScy3() {
        if (cy3 != null) {
            return String.format(Locale.US, "cy: %f,", cy3);
        }
        return "";
    }

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity11() {
        if (opacity11 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity11);
        }
        return "";
    }

    private String generateJSfx3() {
        if (fx3 != null) {
            return String.format(Locale.US, "fx: %f,", fx3);
        }
        return "";
    }

    private String generateJSfy3() {
        if (fy3 != null) {
            return String.format(Locale.US, "fy: %f,", fy3);
        }
        return "";
    }

    private String generateJSimageSettings3() {
        if (imageSettings3 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings3 != null) ? imageSettings3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState5() {
        if (patternFillOrTypeOrState5 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState6() {
        if (patternFillOrTypeOrState6 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState7() {
        if (patternFillOrTypeOrState7 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState8() {
        if (patternFillOrTypeOrState8 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: \"%s\",", patternFillOrTypeOrState8);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState9() {
        if (patternFillOrTypeOrState9 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState9);
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: \"%s\",", color11);
        }
        return "";
    }

    private String generateJSthickness6() {
        if (thickness6 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness6);
        }
        return "";
    }

    private String generateJSsize3() {
        if (size3 != null) {
            return String.format(Locale.US, "size: %f,", size3);
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", (color12 != null) ? color12.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor13() {
        if (color13 != null) {
            return String.format(Locale.US, "color: %s,", (color13 != null) ? color13.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor14() {
        if (color14 != null) {
            return String.format(Locale.US, "color: \"%s\",", color14);
        }
        return "";
    }

    private String generateJSthickness7() {
        if (thickness7 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness7);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSindexes7() {
        if (indexes7 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes7);
        }
        return "";
    }

    private String generateJSindexes8() {
        if (indexes8 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes8));
        }
        return "";
    }

    private String generateJSselectFallingFill() {
        if (selectFallingFill != null) {
            return String.format(Locale.US, "selectFallingFill: %s,", (selectFallingFill != null) ? selectFallingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor15() {
        if (color15 != null) {
            return String.format(Locale.US, "color: \"%s\",", color15);
        }
        return "";
    }

    private String generateJSopacity12() {
        if (opacity12 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity12);
        }
        return "";
    }

    private String generateJSkeys16() {
        if (keys16 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys16));
        }
        return "";
    }

    private String generateJSkeys17() {
        if (keys17 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys17));
        }
        return "";
    }

    private String generateJSangle4() {
        if (angle4 != null) {
            return String.format(Locale.US, "angle: %f,", angle4);
        }
        return "";
    }

    private String generateJSmode12() {
        if (mode12 != null) {
            return String.format(Locale.US, "mode: %b,", mode12);
        }
        return "";
    }

    private String generateJSmode13() {
        if (mode13 != null) {
            return String.format(Locale.US, "mode: %s,", (mode13 != null) ? mode13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity13() {
        if (opacity13 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity13);
        }
        return "";
    }

    private String generateJSkeys18() {
        if (keys18 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys18));
        }
        return "";
    }

    private String generateJSkeys19() {
        if (keys19 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys19));
        }
        return "";
    }

    private String generateJScx4() {
        if (cx4 != null) {
            return String.format(Locale.US, "cx: %f,", cx4);
        }
        return "";
    }

    private String generateJScy4() {
        if (cy4 != null) {
            return String.format(Locale.US, "cy: %f,", cy4);
        }
        return "";
    }

    private String generateJSmode14() {
        if (mode14 != null) {
            return String.format(Locale.US, "mode: %s,", (mode14 != null) ? mode14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity14() {
        if (opacity14 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity14);
        }
        return "";
    }

    private String generateJSfx4() {
        if (fx4 != null) {
            return String.format(Locale.US, "fx: %f,", fx4);
        }
        return "";
    }

    private String generateJSfy4() {
        if (fy4 != null) {
            return String.format(Locale.US, "fy: %f,", fy4);
        }
        return "";
    }

    private String generateJSimageSettings4() {
        if (imageSettings4 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings4 != null) ? imageSettings4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState10() {
        if (patternFillOrTypeOrState10 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState10 != null) ? patternFillOrTypeOrState10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState11() {
        if (patternFillOrTypeOrState11 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState11 != null) ? patternFillOrTypeOrState11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState12() {
        if (patternFillOrTypeOrState12 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState12 != null) ? patternFillOrTypeOrState12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState13() {
        if (patternFillOrTypeOrState13 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: \"%s\",", patternFillOrTypeOrState13);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState14() {
        if (patternFillOrTypeOrState14 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState14);
        }
        return "";
    }

    private String generateJScolor16() {
        if (color16 != null) {
            return String.format(Locale.US, "color: \"%s\",", color16);
        }
        return "";
    }

    private String generateJSthickness8() {
        if (thickness8 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness8);
        }
        return "";
    }

    private String generateJSsize4() {
        if (size4 != null) {
            return String.format(Locale.US, "size: %f,", size4);
        }
        return "";
    }

    private String generateJScolor17() {
        if (color17 != null) {
            return String.format(Locale.US, "color: %s,", (color17 != null) ? color17.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor18() {
        if (color18 != null) {
            return String.format(Locale.US, "color: %s,", (color18 != null) ? color18.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor19() {
        if (color19 != null) {
            return String.format(Locale.US, "color: \"%s\",", color19);
        }
        return "";
    }

    private String generateJSthickness9() {
        if (thickness9 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness9);
        }
        return "";
    }

    private String generateJSdashpattern4() {
        if (dashpattern4 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern4);
        }
        return "";
    }

    private String generateJSlineJoin4() {
        if (lineJoin4 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin4 != null) ? lineJoin4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap4() {
        if (lineCap4 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap4 != null) ? lineCap4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectLabels() {
        if (selectLabels != null) {
            return String.format(Locale.US, "selectLabels: %b,", selectLabels);
        }
        return "";
    }

    private String generateJSselectMarkers() {
        if (selectMarkers != null) {
            return String.format(Locale.US, "selectMarkers: %b,", selectMarkers);
        }
        return "";
    }

    private String generateJSselectMarkers1() {
        if (selectMarkers1 != null) {
            return String.format(Locale.US, "selectMarkers: \"%s\",", selectMarkers1);
        }
        return "";
    }

    private String generateJSselectRisingFill() {
        if (selectRisingFill != null) {
            return String.format(Locale.US, "selectRisingFill: %s,", (selectRisingFill != null) ? selectRisingFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor20() {
        if (color20 != null) {
            return String.format(Locale.US, "color: \"%s\",", color20);
        }
        return "";
    }

    private String generateJSopacity15() {
        if (opacity15 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity15);
        }
        return "";
    }

    private String generateJSkeys20() {
        if (keys20 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys20));
        }
        return "";
    }

    private String generateJSkeys21() {
        if (keys21 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys21));
        }
        return "";
    }

    private String generateJSangle5() {
        if (angle5 != null) {
            return String.format(Locale.US, "angle: %f,", angle5);
        }
        return "";
    }

    private String generateJSmode15() {
        if (mode15 != null) {
            return String.format(Locale.US, "mode: %b,", mode15);
        }
        return "";
    }

    private String generateJSmode16() {
        if (mode16 != null) {
            return String.format(Locale.US, "mode: %s,", (mode16 != null) ? mode16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity16() {
        if (opacity16 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity16);
        }
        return "";
    }

    private String generateJSkeys22() {
        if (keys22 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys22));
        }
        return "";
    }

    private String generateJSkeys23() {
        if (keys23 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys23));
        }
        return "";
    }

    private String generateJScx5() {
        if (cx5 != null) {
            return String.format(Locale.US, "cx: %f,", cx5);
        }
        return "";
    }

    private String generateJScy5() {
        if (cy5 != null) {
            return String.format(Locale.US, "cy: %f,", cy5);
        }
        return "";
    }

    private String generateJSmode17() {
        if (mode17 != null) {
            return String.format(Locale.US, "mode: %s,", (mode17 != null) ? mode17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity17() {
        if (opacity17 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity17);
        }
        return "";
    }

    private String generateJSfx5() {
        if (fx5 != null) {
            return String.format(Locale.US, "fx: %f,", fx5);
        }
        return "";
    }

    private String generateJSfy5() {
        if (fy5 != null) {
            return String.format(Locale.US, "fy: %f,", fy5);
        }
        return "";
    }

    private String generateJSimageSettings5() {
        if (imageSettings5 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings5 != null) ? imageSettings5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState15() {
        if (patternFillOrTypeOrState15 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState15 != null) ? patternFillOrTypeOrState15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState16() {
        if (patternFillOrTypeOrState16 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState16 != null) ? patternFillOrTypeOrState16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState17() {
        if (patternFillOrTypeOrState17 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState17 != null) ? patternFillOrTypeOrState17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState18() {
        if (patternFillOrTypeOrState18 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: \"%s\",", patternFillOrTypeOrState18);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState19() {
        if (patternFillOrTypeOrState19 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState19);
        }
        return "";
    }

    private String generateJScolor21() {
        if (color21 != null) {
            return String.format(Locale.US, "color: \"%s\",", color21);
        }
        return "";
    }

    private String generateJSthickness10() {
        if (thickness10 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness10);
        }
        return "";
    }

    private String generateJSsize5() {
        if (size5 != null) {
            return String.format(Locale.US, "size: %f,", size5);
        }
        return "";
    }

    private String generateJSstroke6() {
        if (stroke6 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke6 != null) ? stroke6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke7() {
        if (stroke7 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke7 != null) ? stroke7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke8() {
        if (stroke8 != null) {
            return String.format(Locale.US, "stroke: \"%s\",", stroke8);
        }
        return "";
    }

    private String generateJSthickness11() {
        if (thickness11 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness11);
        }
        return "";
    }

    private String generateJSdashpattern5() {
        if (dashpattern5 != null) {
            return String.format(Locale.US, "dashpattern: \"%s\",", dashpattern5);
        }
        return "";
    }

    private String generateJSlineJoin5() {
        if (lineJoin5 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin5 != null) ? lineJoin5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap5() {
        if (lineCap5 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap5 != null) ? lineCap5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: \"%s\",", selectionMode1);
        }
        return "";
    }

    private String generateJSseriesType() {
        if (seriesType != null) {
            return String.format(Locale.US, "seriesType: \"%s\",", seriesType);
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
            return String.format(Locale.US, "top: \"%s\",", top1);
        }
        return "";
    }

    private String generateJSsubRangeRatio() {
        if (subRangeRatio != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio);
        }
        return "";
    }

    private String generateJSsubRangeRatio1() {
        if (subRangeRatio1 != null) {
            return String.format(Locale.US, "subRangeRatio: %f,", subRangeRatio1);
        }
        return "";
    }

    private String generateJSindexOrIndexes() {
        if (indexOrIndexes != null) {
            return String.format(Locale.US, "indexOrIndexes: %f,", indexOrIndexes);
        }
        return "";
    }

    private String generateJSindexOrIndexes1() {
        if (indexOrIndexes1 != null) {
            return String.format(Locale.US, "indexOrIndexes: %s,", Arrays.toString(indexOrIndexes1));
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSindexes9() {
        if (indexes9 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes9));
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
            return String.format(Locale.US, "width: \"%s\",", width3);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %f,", position);
        }
        return "";
    }

    private String generateJSxScale() {
        if (xScale != null) {
            return String.format(Locale.US, "xScale: %s,", (xScale != null) ? xScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSyScale() {
        if (yScale != null) {
            return String.format(Locale.US, "yScale: %s,", (yScale != null) ? yScale.generateJs() : "null");
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
        js.append(generateJSclip());
        js.append(generateJSclip1());
        js.append(generateJScolor());
        js.append(generateJSdata());
        js.append(generateJSdata1());
        js.append(generateJSdata2());
        js.append(generateJSdata3());
        js.append(generateJScsvSettings());
        js.append(generateJScsvSettings1());
        js.append(generateJSenabled());
        js.append(generateJSindexes());
        js.append(generateJSindexes1());
        js.append(generateJSfallingFill());
        js.append(generateJScolor1());
        js.append(generateJSopacity());
        js.append(generateJSkeys());
        js.append(generateJSkeys1());
        js.append(generateJSangle());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJSopacity1());
        js.append(generateJSkeys2());
        js.append(generateJSkeys3());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSmode2());
        js.append(generateJSopacity2());
        js.append(generateJSfx());
        js.append(generateJSfy());
        js.append(generateJSimageSettings());
        js.append(generateJSpatternFillOrTypeOrState());
        js.append(generateJSpatternFillOrTypeOrState1());
        js.append(generateJSpatternFillOrTypeOrState2());
        js.append(generateJSpatternFillOrTypeOrState3());
        js.append(generateJSpatternFillOrTypeOrState4());
        js.append(generateJScolor2());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJSstroke());
        js.append(generateJSstroke1());
        js.append(generateJSstroke2());
        js.append(generateJSthickness1());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSindex());
        js.append(generateJSheight2());
        js.append(generateJSheight3());
        js.append(generateJSindex1());
        js.append(generateJSindexes2());
        js.append(generateJShoverFallingFill());
        js.append(generateJScolor3());
        js.append(generateJSopacity3());
        js.append(generateJSkeys4());
        js.append(generateJSkeys5());
        js.append(generateJSangle1());
        js.append(generateJSmode3());
        js.append(generateJSmode4());
        js.append(generateJSopacity4());
        js.append(generateJSkeys6());
        js.append(generateJSkeys7());
        js.append(generateJScx1());
        js.append(generateJScy1());
        js.append(generateJSmode5());
        js.append(generateJSopacity5());
        js.append(generateJSfx1());
        js.append(generateJSfy1());
        js.append(generateJSimageSettings1());
        js.append(generateJSpatternFillOrType());
        js.append(generateJSpatternFillOrType1());
        js.append(generateJSpatternFillOrType2());
        js.append(generateJSpatternFillOrType3());
        js.append(generateJScolor4());
        js.append(generateJSthickness2());
        js.append(generateJSsize1());
        js.append(generateJScolor5());
        js.append(generateJScolor6());
        js.append(generateJScolor7());
        js.append(generateJSthickness3());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJShoverLabels());
        js.append(generateJShoverMarkers());
        js.append(generateJShoverMarkers1());
        js.append(generateJShoverRisingFill());
        js.append(generateJScolor8());
        js.append(generateJSopacity6());
        js.append(generateJSkeys8());
        js.append(generateJSkeys9());
        js.append(generateJSangle2());
        js.append(generateJSmode6());
        js.append(generateJSmode7());
        js.append(generateJSopacity7());
        js.append(generateJSkeys10());
        js.append(generateJSkeys11());
        js.append(generateJScx2());
        js.append(generateJScy2());
        js.append(generateJSmode8());
        js.append(generateJSopacity8());
        js.append(generateJSfx2());
        js.append(generateJSfy2());
        js.append(generateJSimageSettings2());
        js.append(generateJSpatternFillOrType4());
        js.append(generateJSpatternFillOrType5());
        js.append(generateJSpatternFillOrType6());
        js.append(generateJSpatternFillOrType7());
        js.append(generateJScolor9());
        js.append(generateJSthickness4());
        js.append(generateJSsize2());
        js.append(generateJSstroke3());
        js.append(generateJSstroke4());
        js.append(generateJSstroke5());
        js.append(generateJSthickness5());
        js.append(generateJSdashpattern2());
        js.append(generateJSlineJoin2());
        js.append(generateJSlineCap2());
        js.append(generateJSid());
        js.append(generateJSid1());
        js.append(generateJSindexes3());
        js.append(generateJSindexes4());
        js.append(generateJSisVertical());
        js.append(generateJSindexes5());
        js.append(generateJSindexes6());
        js.append(generateJSlabels());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmarkers());
        js.append(generateJSmarkers1());
        js.append(generateJSmaxHeight());
        js.append(generateJSmaxHeight1());
        js.append(generateJSmaxWidth());
        js.append(generateJSmaxWidth1());
        js.append(generateJSminHeight());
        js.append(generateJSminHeight1());
        js.append(generateJSminWidth());
        js.append(generateJSminWidth1());
        js.append(generateJSname());
        js.append(generateJSpointWidth());
        js.append(generateJSpointWidth1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSright());
        js.append(generateJSright1());
        js.append(generateJSrisingFill());
        js.append(generateJScolor10());
        js.append(generateJSopacity9());
        js.append(generateJSkeys12());
        js.append(generateJSkeys13());
        js.append(generateJSangle3());
        js.append(generateJSmode9());
        js.append(generateJSmode10());
        js.append(generateJSopacity10());
        js.append(generateJSkeys14());
        js.append(generateJSkeys15());
        js.append(generateJScx3());
        js.append(generateJScy3());
        js.append(generateJSmode11());
        js.append(generateJSopacity11());
        js.append(generateJSfx3());
        js.append(generateJSfy3());
        js.append(generateJSimageSettings3());
        js.append(generateJSpatternFillOrTypeOrState5());
        js.append(generateJSpatternFillOrTypeOrState6());
        js.append(generateJSpatternFillOrTypeOrState7());
        js.append(generateJSpatternFillOrTypeOrState8());
        js.append(generateJSpatternFillOrTypeOrState9());
        js.append(generateJScolor11());
        js.append(generateJSthickness6());
        js.append(generateJSsize3());
        js.append(generateJScolor12());
        js.append(generateJScolor13());
        js.append(generateJScolor14());
        js.append(generateJSthickness7());
        js.append(generateJSdashpattern3());
        js.append(generateJSlineJoin3());
        js.append(generateJSlineCap3());
        js.append(generateJSindex2());
        js.append(generateJSindexes7());
        js.append(generateJSindexes8());
        js.append(generateJSselectFallingFill());
        js.append(generateJScolor15());
        js.append(generateJSopacity12());
        js.append(generateJSkeys16());
        js.append(generateJSkeys17());
        js.append(generateJSangle4());
        js.append(generateJSmode12());
        js.append(generateJSmode13());
        js.append(generateJSopacity13());
        js.append(generateJSkeys18());
        js.append(generateJSkeys19());
        js.append(generateJScx4());
        js.append(generateJScy4());
        js.append(generateJSmode14());
        js.append(generateJSopacity14());
        js.append(generateJSfx4());
        js.append(generateJSfy4());
        js.append(generateJSimageSettings4());
        js.append(generateJSpatternFillOrTypeOrState10());
        js.append(generateJSpatternFillOrTypeOrState11());
        js.append(generateJSpatternFillOrTypeOrState12());
        js.append(generateJSpatternFillOrTypeOrState13());
        js.append(generateJSpatternFillOrTypeOrState14());
        js.append(generateJScolor16());
        js.append(generateJSthickness8());
        js.append(generateJSsize4());
        js.append(generateJScolor17());
        js.append(generateJScolor18());
        js.append(generateJScolor19());
        js.append(generateJSthickness9());
        js.append(generateJSdashpattern4());
        js.append(generateJSlineJoin4());
        js.append(generateJSlineCap4());
        js.append(generateJSselectLabels());
        js.append(generateJSselectMarkers());
        js.append(generateJSselectMarkers1());
        js.append(generateJSselectRisingFill());
        js.append(generateJScolor20());
        js.append(generateJSopacity15());
        js.append(generateJSkeys20());
        js.append(generateJSkeys21());
        js.append(generateJSangle5());
        js.append(generateJSmode15());
        js.append(generateJSmode16());
        js.append(generateJSopacity16());
        js.append(generateJSkeys22());
        js.append(generateJSkeys23());
        js.append(generateJScx5());
        js.append(generateJScy5());
        js.append(generateJSmode17());
        js.append(generateJSopacity17());
        js.append(generateJSfx5());
        js.append(generateJSfy5());
        js.append(generateJSimageSettings5());
        js.append(generateJSpatternFillOrTypeOrState15());
        js.append(generateJSpatternFillOrTypeOrState16());
        js.append(generateJSpatternFillOrTypeOrState17());
        js.append(generateJSpatternFillOrTypeOrState18());
        js.append(generateJSpatternFillOrTypeOrState19());
        js.append(generateJScolor21());
        js.append(generateJSthickness10());
        js.append(generateJSsize5());
        js.append(generateJSstroke6());
        js.append(generateJSstroke7());
        js.append(generateJSstroke8());
        js.append(generateJSthickness11());
        js.append(generateJSdashpattern5());
        js.append(generateJSlineJoin5());
        js.append(generateJSlineCap5());
        js.append(generateJSselectionMode());
        js.append(generateJSselectionMode1());
        js.append(generateJSseriesType());
        js.append(generateJStooltip());
        js.append(generateJStop());
        js.append(generateJStop1());
        js.append(generateJSsubRangeRatio());
        js.append(generateJSsubRangeRatio1());
        js.append(generateJSindexOrIndexes());
        js.append(generateJSindexOrIndexes1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSindex3());
        js.append(generateJSindexes9());
        js.append(generateJSwidth2());
        js.append(generateJSwidth3());
        js.append(generateJSposition());
        js.append(generateJSxScale());
        js.append(generateJSyScale());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}