package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Grid extends JsObject {

    
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

    private Boolean drawBottomLine;

    public void setDrawbottomline(Boolean drawBottomLine) {
        this.drawBottomLine = drawBottomLine;
    }

    private Boolean drawLeftLine;

    public void setDrawleftline(Boolean drawLeftLine) {
        this.drawLeftLine = drawLeftLine;
    }

    private Boolean drawRightLine;

    public void setDrawrightline(Boolean drawRightLine) {
        this.drawRightLine = drawRightLine;
    }

    private Boolean drawTopLine;

    public void setDrawtopline(Boolean drawTopLine) {
        this.drawTopLine = drawTopLine;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Fill evenFill;

    public void setEvenfill(Fill evenFill) {
        this.evenFill = evenFill;
    }

    private String color;
    private Double opacity;

    public void setEvenfill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setEvenfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public void setEvenfill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
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


    public void setEvenfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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


    public void setEvenfill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
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

    public void setEvenfill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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


    public void setEvenfill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;

    public void setEvenhatchfill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType = patternFillOrType;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setEvenhatchfill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType1 = patternFillOrType1;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setEvenhatchfill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType2 = patternFillOrType2;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setEvenhatchfill(String patternFillOrType3, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType3 = patternFillOrType3;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }

    private Fill evenHolidayFill;

    public void setEvenholidayfill(Fill evenHolidayFill) {
        this.evenHolidayFill = evenHolidayFill;
    }

    private String color2;
    private Double opacity3;

    public void setEvenholidayfill(String color2, Double opacity3) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
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

    public void setEvenholidayfill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
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


    public void setEvenholidayfill(GradientKey[] keys4, Rect mode4, Double angle1, Double opacity4) {
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


    public void setEvenholidayfill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
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


    public void setEvenholidayfill(String[] keys5, Rect mode4, Double angle1, Double opacity4) {
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

    public void setEvenholidayfill(GradientKey[] keys6, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
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


    public void setEvenholidayfill(String[] keys7, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
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
    private PatternFill patternFillOrType4;
    private HatchFill patternFillOrType5;
    private HatchFillType patternFillOrType6;
    private String patternFillOrType7;
    private String color3;
    private Double thickness1;
    private Double size1;

    public void setEvenholidayhatchfill(PatternFill patternFillOrType4, String color3, Double thickness1, Double size1) {
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
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setEvenholidayhatchfill(HatchFill patternFillOrType5, String color3, Double thickness1, Double size1) {
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
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setEvenholidayhatchfill(HatchFillType patternFillOrType6, String color3, Double thickness1, Double size1) {
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
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
    }


    public void setEvenholidayhatchfill(String patternFillOrType7, String color3, Double thickness1, Double size1) {
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
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.size = null;
        this.size1 = null;
        
        this.size1 = size1;
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

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness2;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHorizontalstroke(Stroke color4, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHorizontalstroke(ColoredFill color5, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color5 = color5;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setHorizontalstroke(String color6, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color6 = color6;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
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

    private Fill oddFill;

    public void setOddfill(Fill oddFill) {
        this.oddFill = oddFill;
    }

    private String color7;
    private Double opacity6;

    public void setOddfill(String color7, Double opacity6) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        this.color7 = null;
        
        this.color7 = color7;
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

    public void setOddfill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
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


    public void setOddfill(GradientKey[] keys8, Rect mode7, Double angle2, Double opacity7) {
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


    public void setOddfill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
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


    public void setOddfill(String[] keys9, Rect mode7, Double angle2, Double opacity7) {
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

    public void setOddfill(GradientKey[] keys10, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
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


    public void setOddfill(String[] keys11, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
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
    private PatternFill patternFillOrType8;
    private HatchFill patternFillOrType9;
    private HatchFillType patternFillOrType10;
    private String patternFillOrType11;
    private String color8;
    private Double thickness3;
    private Double size2;

    public void setOddhatchfill(PatternFill patternFillOrType8, String color8, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        
        this.patternFillOrType8 = patternFillOrType8;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setOddhatchfill(HatchFill patternFillOrType9, String color8, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        
        this.patternFillOrType9 = patternFillOrType9;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setOddhatchfill(HatchFillType patternFillOrType10, String color8, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        
        this.patternFillOrType10 = patternFillOrType10;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }


    public void setOddhatchfill(String patternFillOrType11, String color8, Double thickness3, Double size2) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        
        this.patternFillOrType11 = patternFillOrType11;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        
        this.size2 = size2;
    }

    private Fill oddHolidayFill;

    public void setOddholidayfill(Fill oddHolidayFill) {
        this.oddHolidayFill = oddHolidayFill;
    }

    private String color9;
    private Double opacity9;

    public void setOddholidayfill(String color9, Double opacity9) {
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

    public void setOddholidayfill(GradientKey[] keys12, Boolean mode9, Double angle3, Double opacity10) {
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


    public void setOddholidayfill(GradientKey[] keys12, Rect mode10, Double angle3, Double opacity10) {
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


    public void setOddholidayfill(String[] keys13, Boolean mode9, Double angle3, Double opacity10) {
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


    public void setOddholidayfill(String[] keys13, Rect mode10, Double angle3, Double opacity10) {
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

    public void setOddholidayfill(GradientKey[] keys14, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
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


    public void setOddholidayfill(String[] keys15, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
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
    private PatternFill patternFillOrType12;
    private HatchFill patternFillOrType13;
    private HatchFillType patternFillOrType14;
    private String patternFillOrType15;
    private String color10;
    private Double thickness4;
    private Double size3;

    public void setOddholidayhatchfill(PatternFill patternFillOrType12, String color10, Double thickness4, Double size3) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        this.patternFillOrType15 = null;
        
        this.patternFillOrType12 = patternFillOrType12;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setOddholidayhatchfill(HatchFill patternFillOrType13, String color10, Double thickness4, Double size3) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        this.patternFillOrType15 = null;
        
        this.patternFillOrType13 = patternFillOrType13;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setOddholidayhatchfill(HatchFillType patternFillOrType14, String color10, Double thickness4, Double size3) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        this.patternFillOrType15 = null;
        
        this.patternFillOrType14 = patternFillOrType14;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }


    public void setOddholidayhatchfill(String patternFillOrType15, String color10, Double thickness4, Double size3) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        this.patternFillOrType4 = null;
        this.patternFillOrType5 = null;
        this.patternFillOrType6 = null;
        this.patternFillOrType7 = null;
        this.patternFillOrType8 = null;
        this.patternFillOrType9 = null;
        this.patternFillOrType10 = null;
        this.patternFillOrType11 = null;
        this.patternFillOrType12 = null;
        this.patternFillOrType13 = null;
        this.patternFillOrType14 = null;
        this.patternFillOrType15 = null;
        
        this.patternFillOrType15 = patternFillOrType15;
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
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
        this.size = null;
        this.size1 = null;
        this.size2 = null;
        this.size3 = null;
        
        this.size3 = size3;
    }

    private Boolean overlay;

    public void setOverlay(Boolean overlay) {
        this.overlay = overlay;
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

    private Stroke color11;
    private ColoredFill color12;
    private String color13;
    private Double thickness5;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setVerticalstroke(Stroke color11, Double thickness5, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
        
        this.color11 = color11;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
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


    public void setVerticalstroke(ColoredFill color12, Double thickness5, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
        
        this.color12 = color12;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
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


    public void setVerticalstroke(String color13, Double thickness5, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
        
        this.color13 = color13;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        
        this.thickness5 = thickness5;
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

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: \"%s\",", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %b,", background1);
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

    private String generateJSdrawBottomLine() {
        if (drawBottomLine != null) {
            return String.format(Locale.US, "drawBottomLine: %b,", drawBottomLine);
        }
        return "";
    }

    private String generateJSdrawLeftLine() {
        if (drawLeftLine != null) {
            return String.format(Locale.US, "drawLeftLine: %b,", drawLeftLine);
        }
        return "";
    }

    private String generateJSdrawRightLine() {
        if (drawRightLine != null) {
            return String.format(Locale.US, "drawRightLine: %b,", drawRightLine);
        }
        return "";
    }

    private String generateJSdrawTopLine() {
        if (drawTopLine != null) {
            return String.format(Locale.US, "drawTopLine: %b,", drawTopLine);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSevenFill() {
        if (evenFill != null) {
            return String.format(Locale.US, "evenFill: %s,", (evenFill != null) ? evenFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: \"%s\",", color);
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

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: \"%s\",", color1);
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

    private String generateJSevenHolidayFill() {
        if (evenHolidayFill != null) {
            return String.format(Locale.US, "evenHolidayFill: %s,", (evenHolidayFill != null) ? evenHolidayFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: \"%s\",", color2);
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

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: \"%s\",", color3);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
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

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", (color4 != null) ? color4.generateJs() : "null");
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
            return String.format(Locale.US, "color: \"%s\",", color6);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
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

    private String generateJSoddFill() {
        if (oddFill != null) {
            return String.format(Locale.US, "oddFill: %s,", (oddFill != null) ? oddFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: \"%s\",", color7);
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

    private String generateJSpatternFillOrType8() {
        if (patternFillOrType8 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType8 != null) ? patternFillOrType8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType9() {
        if (patternFillOrType9 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType10() {
        if (patternFillOrType10 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType11() {
        if (patternFillOrType11 != null) {
            return String.format(Locale.US, "patternFillOrType: \"%s\",", patternFillOrType11);
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: \"%s\",", color8);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSsize2() {
        if (size2 != null) {
            return String.format(Locale.US, "size: %f,", size2);
        }
        return "";
    }

    private String generateJSoddHolidayFill() {
        if (oddHolidayFill != null) {
            return String.format(Locale.US, "oddHolidayFill: %s,", (oddHolidayFill != null) ? oddHolidayFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: \"%s\",", color9);
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

    private String generateJSpatternFillOrType12() {
        if (patternFillOrType12 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType13() {
        if (patternFillOrType13 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType13 != null) ? patternFillOrType13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType14() {
        if (patternFillOrType14 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType14 != null) ? patternFillOrType14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType15() {
        if (patternFillOrType15 != null) {
            return String.format(Locale.US, "patternFillOrType: \"%s\",", patternFillOrType15);
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: \"%s\",", color10);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSsize3() {
        if (size3 != null) {
            return String.format(Locale.US, "size: %f,", size3);
        }
        return "";
    }

    private String generateJSoverlay() {
        if (overlay != null) {
            return String.format(Locale.US, "overlay: %b,", overlay);
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

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", (color11 != null) ? color11.generateJs() : "null");
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
            return String.format(Locale.US, "color: \"%s\",", color13);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
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

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSbackground());
        js.append(generateJSbackground1());
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
        js.append(generateJSdrawBottomLine());
        js.append(generateJSdrawLeftLine());
        js.append(generateJSdrawRightLine());
        js.append(generateJSdrawTopLine());
        js.append(generateJSenabled());
        js.append(generateJSevenFill());
        js.append(generateJScolor());
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
        js.append(generateJSpatternFillOrType());
        js.append(generateJSpatternFillOrType1());
        js.append(generateJSpatternFillOrType2());
        js.append(generateJSpatternFillOrType3());
        js.append(generateJScolor1());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJSevenHolidayFill());
        js.append(generateJScolor2());
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
        js.append(generateJSpatternFillOrType4());
        js.append(generateJSpatternFillOrType5());
        js.append(generateJSpatternFillOrType6());
        js.append(generateJSpatternFillOrType7());
        js.append(generateJScolor3());
        js.append(generateJSthickness1());
        js.append(generateJSsize1());
        js.append(generateJSheight2());
        js.append(generateJSheight3());
        js.append(generateJScolor4());
        js.append(generateJScolor5());
        js.append(generateJScolor6());
        js.append(generateJSthickness2());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaxHeight());
        js.append(generateJSmaxHeight1());
        js.append(generateJSmaxWidth());
        js.append(generateJSmaxWidth1());
        js.append(generateJSminHeight());
        js.append(generateJSminHeight1());
        js.append(generateJSminWidth());
        js.append(generateJSminWidth1());
        js.append(generateJSoddFill());
        js.append(generateJScolor7());
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
        js.append(generateJSpatternFillOrType8());
        js.append(generateJSpatternFillOrType9());
        js.append(generateJSpatternFillOrType10());
        js.append(generateJSpatternFillOrType11());
        js.append(generateJScolor8());
        js.append(generateJSthickness3());
        js.append(generateJSsize2());
        js.append(generateJSoddHolidayFill());
        js.append(generateJScolor9());
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
        js.append(generateJSpatternFillOrType12());
        js.append(generateJSpatternFillOrType13());
        js.append(generateJSpatternFillOrType14());
        js.append(generateJSpatternFillOrType15());
        js.append(generateJScolor10());
        js.append(generateJSthickness4());
        js.append(generateJSsize3());
        js.append(generateJSoverlay());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSright());
        js.append(generateJSright1());
        js.append(generateJStop());
        js.append(generateJStop1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJScolor11());
        js.append(generateJScolor12());
        js.append(generateJScolor13());
        js.append(generateJSthickness5());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJSwidth2());
        js.append(generateJSwidth3());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}