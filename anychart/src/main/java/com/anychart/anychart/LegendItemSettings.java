package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class LegendItemSettings extends JsObject {

    
    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        this.disablePointerEvents = disablePointerEvents;
    }

    private Boolean disabled;

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        this.fontColor = fontColor;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration = fontDecoration;
    }


    public void setFontdecoration(String fontDecoration1) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration1 = fontDecoration1;
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize = fontSize;
    }


    public void setFontsize(Double fontSize1) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize1 = fontSize1;
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(TextFontStyle fontStyle) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle = fontStyle;
    }


    public void setFontstyle(String fontStyle1) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle1 = fontStyle1;
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(TextFontVariant fontVariant) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant = fontVariant;
    }


    public void setFontvariant(String fontVariant1) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant1 = fontVariant1;
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight = fontWeight;
    }


    public void setFontweight(Double fontWeight1) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight1 = fontWeight1;
    }

    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public void setHalign(TextHAlign hAlign) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign = hAlign;
    }


    public void setHalign(String hAlign1) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign1 = hAlign1;
    }

    private Boolean iconEnabled;

    public void setIconenabled(Boolean iconEnabled) {
        this.iconEnabled = iconEnabled;
    }

    private Fill iconFill;

    public void setIconfill(Fill iconFill) {
        this.iconFill = iconFill;
    }

    private String color;
    private Double opacity;

    public void setIconfill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private Double opacity1;

    public void setIconfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public void setIconfill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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


    public void setIconfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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


    public void setIconfill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
    private GraphicsMathRect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setIconfill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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


    public void setIconfill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;

    public void setIconhatchfill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
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


    public void setIconhatchfill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
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


    public void setIconhatchfill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
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


    public void setIconhatchfill(String patternFillOrType3, String color1, Double thickness, Double size) {
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

    private Fill fillOrColorOrKeys;
    private GradientKey[] fillOrColorOrKeys1;
    private String[] fillOrColorOrKeys2;
    private Double opacityOrAngleOrCx;
    private Double modeOrCy;
    private Boolean modeOrCy1;
    private GraphicsMathRect modeOrCy2;
    private Double opacityOrMode;
    private GraphicsMathRect opacityOrMode1;
    private Double opacity3;
    private Double fx1;
    private Double fy1;

    public void setIconmarkerfill(Fill fillOrColorOrKeys, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(Fill fillOrColorOrKeys, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys = fillOrColorOrKeys;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(GradientKey[] fillOrColorOrKeys1, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys1 = fillOrColorOrKeys1;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Double modeOrCy, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Double modeOrCy, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy = modeOrCy;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, Boolean modeOrCy1, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy1 = modeOrCy1;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, Double opacityOrMode, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode = opacityOrMode;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setIconmarkerfill(String[] fillOrColorOrKeys2, GraphicsMathRect modeOrCy2, GraphicsMathRect opacityOrMode1, Double opacityOrAngleOrCx, Double opacity3, Double fx1, Double fy1) {
        this.fillOrColorOrKeys = null;
        this.fillOrColorOrKeys1 = null;
        this.fillOrColorOrKeys2 = null;
        
        this.fillOrColorOrKeys2 = fillOrColorOrKeys2;
        this.modeOrCy = null;
        this.modeOrCy1 = null;
        this.modeOrCy2 = null;
        
        this.modeOrCy2 = modeOrCy2;
        this.opacityOrMode = null;
        this.opacityOrMode1 = null;
        
        this.opacityOrMode1 = opacityOrMode1;
        this.opacityOrAngleOrCx = opacityOrAngleOrCx;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setIconmarkerstroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color2 = color2;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setIconmarkerstroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setIconmarkerstroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private MarkerType iconMarkerType;
    private String iconMarkerType1;

    public void setIconmarkertype(MarkerType iconMarkerType) {
        this.iconMarkerType = null;
        this.iconMarkerType1 = null;
        
        this.iconMarkerType = iconMarkerType;
    }


    public void setIconmarkertype(String iconMarkerType1) {
        this.iconMarkerType = null;
        this.iconMarkerType1 = null;
        
        this.iconMarkerType1 = iconMarkerType1;
    }

    private Double iconSize;
    private String iconSize1;

    public void setIconsize(Double iconSize) {
        this.iconSize = null;
        this.iconSize1 = null;
        
        this.iconSize = iconSize;
    }


    public void setIconsize(String iconSize1) {
        this.iconSize = null;
        this.iconSize1 = null;
        
        this.iconSize1 = iconSize1;
    }

    private Stroke iconStroke;
    private ColoredFill iconStroke1;
    private String iconStroke2;
    private Double thickness2;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setIconstroke(Stroke iconStroke, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.iconStroke = null;
        this.iconStroke1 = null;
        this.iconStroke2 = null;
        
        this.iconStroke = iconStroke;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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


    public void setIconstroke(ColoredFill iconStroke1, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.iconStroke = null;
        this.iconStroke1 = null;
        this.iconStroke2 = null;
        
        this.iconStroke1 = iconStroke1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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


    public void setIconstroke(String iconStroke2, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.iconStroke = null;
        this.iconStroke1 = null;
        this.iconStroke2 = null;
        
        this.iconStroke2 = iconStroke2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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

    private Double iconTextSpacing;

    public void setIcontextspacing(Double iconTextSpacing) {
        this.iconTextSpacing = iconTextSpacing;
    }

    private LegendItemIconType iconType;
    private String iconType1;

    public void setIcontype(LegendItemIconType iconType) {
        this.iconType = null;
        this.iconType1 = null;
        
        this.iconType = iconType;
    }


    public void setIcontype(String iconType1) {
        this.iconType = null;
        this.iconType1 = null;
        
        this.iconType1 = iconType1;
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        this.letterSpacing = null;
        this.letterSpacing1 = null;
        
        this.letterSpacing = letterSpacing;
    }


    public void setLetterspacing(Double letterSpacing1) {
        this.letterSpacing = null;
        this.letterSpacing1 = null;
        
        this.letterSpacing1 = letterSpacing1;
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight = lineHeight;
    }


    public void setLineheight(Double lineHeight1) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight1 = lineHeight1;
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

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection = textDirection;
    }


    public void setTextdirection(String textDirection1) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection1 = textDirection1;
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        this.textIndent = textIndent;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow = textOverflow;
    }


    public void setTextoverflow(String textOverflow1) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow1 = textOverflow1;
    }

    private String name;

    public void setTextsettings(String name) {
        this.name = name;
    }

    private String name1;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings = textSettings;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }


    public void setTextsettings(Double textSettings1, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings1 = textSettings1;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }


    public void setTextsettings(Boolean textSettings2, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings2 = textSettings2;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }

    private TextTextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextTextWrap textWrap) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap = textWrap;
    }


    public void setTextwrap(String textWrap1) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap1 = textWrap1;
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

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        this.useHtml = useHtml;
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public void setValign(TextVAlign vAlign) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign = vAlign;
    }


    public void setValign(String vAlign1) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign1 = vAlign1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdisabled() {
        if (disabled != null) {
            return String.format(Locale.US, "disabled: %b,", disabled);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: %s,", format);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
        }
        return "";
    }

    private String generateJSiconEnabled() {
        if (iconEnabled != null) {
            return String.format(Locale.US, "iconEnabled: %b,", iconEnabled);
        }
        return "";
    }

    private String generateJSiconFill() {
        if (iconFill != null) {
            return String.format(Locale.US, "iconFill: %s,", (iconFill != null) ? iconFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
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
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType3);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
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

    private String generateJSfillOrColorOrKeys() {
        if (fillOrColorOrKeys != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", (fillOrColorOrKeys != null) ? fillOrColorOrKeys.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys1() {
        if (fillOrColorOrKeys1 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", arrayToString(fillOrColorOrKeys1));
        }
        return "";
    }

    private String generateJSfillOrColorOrKeys2() {
        if (fillOrColorOrKeys2 != null) {
            return String.format(Locale.US, "fillOrColorOrKeys: %s,", Arrays.toString(fillOrColorOrKeys2));
        }
        return "";
    }

    private String generateJSopacityOrAngleOrCx() {
        if (opacityOrAngleOrCx != null) {
            return String.format(Locale.US, "opacityOrAngleOrCx: %f,", opacityOrAngleOrCx);
        }
        return "";
    }

    private String generateJSmodeOrCy() {
        if (modeOrCy != null) {
            return String.format(Locale.US, "modeOrCy: %f,", modeOrCy);
        }
        return "";
    }

    private String generateJSmodeOrCy1() {
        if (modeOrCy1 != null) {
            return String.format(Locale.US, "modeOrCy: %b,", modeOrCy1);
        }
        return "";
    }

    private String generateJSmodeOrCy2() {
        if (modeOrCy2 != null) {
            return String.format(Locale.US, "modeOrCy: %s,", (modeOrCy2 != null) ? modeOrCy2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacityOrMode() {
        if (opacityOrMode != null) {
            return String.format(Locale.US, "opacityOrMode: %f,", opacityOrMode);
        }
        return "";
    }

    private String generateJSopacityOrMode1() {
        if (opacityOrMode1 != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode1 != null) ? opacityOrMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
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

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", (color2 != null) ? color2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", (color3 != null) ? color3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
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

    private String generateJSiconMarkerType() {
        if (iconMarkerType != null) {
            return String.format(Locale.US, "iconMarkerType: %s,", (iconMarkerType != null) ? iconMarkerType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconMarkerType1() {
        if (iconMarkerType1 != null) {
            return String.format(Locale.US, "iconMarkerType: %s,", iconMarkerType1);
        }
        return "";
    }

    private String generateJSiconSize() {
        if (iconSize != null) {
            return String.format(Locale.US, "iconSize: %f,", iconSize);
        }
        return "";
    }

    private String generateJSiconSize1() {
        if (iconSize1 != null) {
            return String.format(Locale.US, "iconSize: %s,", iconSize1);
        }
        return "";
    }

    private String generateJSiconStroke() {
        if (iconStroke != null) {
            return String.format(Locale.US, "iconStroke: %s,", (iconStroke != null) ? iconStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconStroke1() {
        if (iconStroke1 != null) {
            return String.format(Locale.US, "iconStroke: %s,", (iconStroke1 != null) ? iconStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconStroke2() {
        if (iconStroke2 != null) {
            return String.format(Locale.US, "iconStroke: %s,", iconStroke2);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
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

    private String generateJSiconTextSpacing() {
        if (iconTextSpacing != null) {
            return String.format(Locale.US, "iconTextSpacing: %f,", iconTextSpacing);
        }
        return "";
    }

    private String generateJSiconType() {
        if (iconType != null) {
            return String.format(Locale.US, "iconType: %s,", (iconType != null) ? iconType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSiconType1() {
        if (iconType1 != null) {
            return String.format(Locale.US, "iconType: %s,", iconType1);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
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

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
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

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
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
        js.append(generateJSdisablePointerEvents());
        js.append(generateJSdisabled());
        js.append(generateJSenabled());
        js.append(generateJSfontColor());
        js.append(generateJSfontDecoration());
        js.append(generateJSfontDecoration1());
        js.append(generateJSfontFamily());
        js.append(generateJSfontOpacity());
        js.append(generateJSfontSize());
        js.append(generateJSfontSize1());
        js.append(generateJSfontStyle());
        js.append(generateJSfontStyle1());
        js.append(generateJSfontVariant());
        js.append(generateJSfontVariant1());
        js.append(generateJSfontWeight());
        js.append(generateJSfontWeight1());
        js.append(generateJSformat());
        js.append(generateJShAlign());
        js.append(generateJShAlign1());
        js.append(generateJSiconEnabled());
        js.append(generateJSiconFill());
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
        js.append(generateJSpatternFillOrType());
        js.append(generateJSpatternFillOrType1());
        js.append(generateJSpatternFillOrType2());
        js.append(generateJSpatternFillOrType3());
        js.append(generateJScolor1());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJSfillOrColorOrKeys());
        js.append(generateJSfillOrColorOrKeys1());
        js.append(generateJSfillOrColorOrKeys2());
        js.append(generateJSopacityOrAngleOrCx());
        js.append(generateJSmodeOrCy());
        js.append(generateJSmodeOrCy1());
        js.append(generateJSmodeOrCy2());
        js.append(generateJSopacityOrMode());
        js.append(generateJSopacityOrMode1());
        js.append(generateJSopacity3());
        js.append(generateJSfx1());
        js.append(generateJSfy1());
        js.append(generateJScolor2());
        js.append(generateJScolor3());
        js.append(generateJScolor4());
        js.append(generateJSthickness1());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSiconMarkerType());
        js.append(generateJSiconMarkerType1());
        js.append(generateJSiconSize());
        js.append(generateJSiconSize1());
        js.append(generateJSiconStroke());
        js.append(generateJSiconStroke1());
        js.append(generateJSiconStroke2());
        js.append(generateJSthickness2());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJSiconTextSpacing());
        js.append(generateJSiconType());
        js.append(generateJSiconType1());
        js.append(generateJSletterSpacing());
        js.append(generateJSletterSpacing1());
        js.append(generateJSlineHeight());
        js.append(generateJSlineHeight1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSselectable());
        js.append(generateJStext());
        js.append(generateJStextDirection());
        js.append(generateJStextDirection1());
        js.append(generateJStextIndent());
        js.append(generateJStextOverflow());
        js.append(generateJStextOverflow1());
        js.append(generateJSname());
        js.append(generateJSname1());
        js.append(generateJStextSettings());
        js.append(generateJStextSettings1());
        js.append(generateJStextSettings2());
        js.append(generateJStextWrap());
        js.append(generateJStextWrap1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSuseHtml());
        js.append(generateJSvAlign());
        js.append(generateJSvAlign1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}