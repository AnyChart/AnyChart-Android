package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ProjectTimeline extends JsObject {

    
    private Fill backgroundFill;

    public void setBackgroundfill(Fill backgroundFill) {
        this.backgroundFill = backgroundFill;
    }

    private String color;
    private Double opacity;

    public void setBackgroundfill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private Double opacity1;

    public void setBackgroundfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public void setBackgroundfill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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


    public void setBackgroundfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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


    public void setBackgroundfill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

    public void setBackgroundfill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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


    public void setBackgroundfill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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
    private Fill baseFill;

    public void setBasefill(Fill baseFill) {
        this.baseFill = baseFill;
    }

    private String color1;
    private Double opacity3;

    public void setBasefill(String color1, Double opacity3) {
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
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
    private VectorRect mode4;
    private Double opacity4;

    public void setBasefill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
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


    public void setBasefill(GradientKey[] keys4, VectorRect mode4, Double angle1, Double opacity4) {
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


    public void setBasefill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
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


    public void setBasefill(String[] keys5, VectorRect mode4, Double angle1, Double opacity4) {
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
    private GraphicsMathRect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setBasefill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode5, Double opacity5, Double fx1, Double fy1) {
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


    public void setBasefill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode5, Double opacity5, Double fx1, Double fy1) {
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
    private Stroke baseStroke;
    private ColoredFill baseStroke1;
    private String baseStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setBasestroke(Stroke baseStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.baseStroke = null;
        this.baseStroke1 = null;
        this.baseStroke2 = null;
        
        this.baseStroke = baseStroke;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setBasestroke(ColoredFill baseStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.baseStroke = null;
        this.baseStroke1 = null;
        this.baseStroke2 = null;
        
        this.baseStroke1 = baseStroke1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setBasestroke(String baseStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.baseStroke = null;
        this.baseStroke1 = null;
        this.baseStroke2 = null;
        
        this.baseStroke2 = baseStroke2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private Boolean baselineAbove;

    public void setBaselineabove(Boolean baselineAbove) {
        this.baselineAbove = baselineAbove;
    }

    private Fill baselineFill;

    public void setBaselinefill(Fill baselineFill) {
        this.baselineFill = baselineFill;
    }

    private String color2;
    private Double opacity6;

    public void setBaselinefill(String color2, Double opacity6) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
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
    private VectorRect mode7;
    private Double opacity7;

    public void setBaselinefill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
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


    public void setBaselinefill(GradientKey[] keys8, VectorRect mode7, Double angle2, Double opacity7) {
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


    public void setBaselinefill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
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


    public void setBaselinefill(String[] keys9, VectorRect mode7, Double angle2, Double opacity7) {
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
    private GraphicsMathRect mode8;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setBaselinefill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode8, Double opacity8, Double fx2, Double fy2) {
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


    public void setBaselinefill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode8, Double opacity8, Double fx2, Double fy2) {
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
    private Stroke baselineStroke;
    private ColoredFill baselineStroke1;
    private String baselineStroke2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setBaselinestroke(Stroke baselineStroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.baselineStroke = null;
        this.baselineStroke1 = null;
        this.baselineStroke2 = null;
        
        this.baselineStroke = baselineStroke;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
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


    public void setBaselinestroke(ColoredFill baselineStroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.baselineStroke = null;
        this.baselineStroke1 = null;
        this.baselineStroke2 = null;
        
        this.baselineStroke1 = baselineStroke1;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
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


    public void setBaselinestroke(String baselineStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.baselineStroke = null;
        this.baselineStroke1 = null;
        this.baselineStroke2 = null;
        
        this.baselineStroke2 = baselineStroke2;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
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

    private Stroke columnStroke;
    private String columnStroke1;

    public void setColumnstroke(Stroke columnStroke) {
        this.columnStroke = null;
        this.columnStroke1 = null;
        
        this.columnStroke = columnStroke;
    }


    public void setColumnstroke(String columnStroke1) {
        this.columnStroke = null;
        this.columnStroke1 = null;
        
        this.columnStroke1 = columnStroke1;
    }

    private Fill connectorFill;
    private GradientKey[] connectorFill1;
    private String[] connectorFill2;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect opacityOrMode;
    private Double opacity9;
    private Double fx3;
    private Double fy3;

    public void setConnectorfill(Fill connectorFill, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        this.connectorFill = null;
        this.connectorFill1 = null;
        this.connectorFill2 = null;
        
        this.connectorFill = connectorFill;
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
        this.opacityOrMode = opacityOrMode;
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


    public void setConnectorfill(GradientKey[] connectorFill1, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        this.connectorFill = null;
        this.connectorFill1 = null;
        this.connectorFill2 = null;
        
        this.connectorFill1 = connectorFill1;
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
        this.opacityOrMode = opacityOrMode;
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


    public void setConnectorfill(String[] connectorFill2, Double cx3, Double cy3, GraphicsMathRect opacityOrMode, Double opacity9, Double fx3, Double fy3) {
        this.connectorFill = null;
        this.connectorFill1 = null;
        this.connectorFill2 = null;
        
        this.connectorFill2 = connectorFill2;
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
        this.opacityOrMode = opacityOrMode;
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

    private Stroke connectorPreviewStroke;
    private ColoredFill connectorPreviewStroke1;
    private String connectorPreviewStroke2;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setConnectorpreviewstroke(Stroke connectorPreviewStroke, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.connectorPreviewStroke = null;
        this.connectorPreviewStroke1 = null;
        this.connectorPreviewStroke2 = null;
        
        this.connectorPreviewStroke = connectorPreviewStroke;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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


    public void setConnectorpreviewstroke(ColoredFill connectorPreviewStroke1, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.connectorPreviewStroke = null;
        this.connectorPreviewStroke1 = null;
        this.connectorPreviewStroke2 = null;
        
        this.connectorPreviewStroke1 = connectorPreviewStroke1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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


    public void setConnectorpreviewstroke(String connectorPreviewStroke2, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.connectorPreviewStroke = null;
        this.connectorPreviewStroke1 = null;
        this.connectorPreviewStroke2 = null;
        
        this.connectorPreviewStroke2 = connectorPreviewStroke2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        
        this.thickness2 = thickness2;
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

    private Stroke connectorStroke;
    private ColoredFill connectorStroke1;
    private String connectorStroke2;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setConnectorstroke(Stroke connectorStroke, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.connectorStroke = null;
        this.connectorStroke1 = null;
        this.connectorStroke2 = null;
        
        this.connectorStroke = connectorStroke;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
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


    public void setConnectorstroke(ColoredFill connectorStroke1, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.connectorStroke = null;
        this.connectorStroke1 = null;
        this.connectorStroke2 = null;
        
        this.connectorStroke1 = connectorStroke1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
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


    public void setConnectorstroke(String connectorStroke2, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.connectorStroke = null;
        this.connectorStroke1 = null;
        this.connectorStroke2 = null;
        
        this.connectorStroke2 = connectorStroke2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        
        this.thickness3 = thickness3;
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

    private Double defaultRowHeight;

    public void setDefaultrowheight(Double defaultRowHeight) {
        this.defaultRowHeight = defaultRowHeight;
    }

    private Fill editConnectorThumbFill;

    public void setEditconnectorthumbfill(Fill editConnectorThumbFill) {
        this.editConnectorThumbFill = editConnectorThumbFill;
    }

    private String color3;
    private Double opacity10;

    public void setEditconnectorthumbfill(String color3, Double opacity10) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color3 = color3;
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

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode9;
    private VectorRect mode10;
    private Double opacity11;

    public void setEditconnectorthumbfill(GradientKey[] keys12, Boolean mode9, Double angle3, Double opacity11) {
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
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
    }


    public void setEditconnectorthumbfill(GradientKey[] keys12, VectorRect mode10, Double angle3, Double opacity11) {
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
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
    }


    public void setEditconnectorthumbfill(String[] keys13, Boolean mode9, Double angle3, Double opacity11) {
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
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
    }


    public void setEditconnectorthumbfill(String[] keys13, VectorRect mode10, Double angle3, Double opacity11) {
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
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode11;
    private Double opacity12;
    private Double fx4;
    private Double fy4;

    public void setEditconnectorthumbfill(GradientKey[] keys14, Double cx4, Double cy4, GraphicsMathRect mode11, Double opacity12, Double fx4, Double fy4) {
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
        this.opacity12 = null;
        
        this.opacity12 = opacity12;
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


    public void setEditconnectorthumbfill(String[] keys15, Double cx4, Double cy4, GraphicsMathRect mode11, Double opacity12, Double fx4, Double fy4) {
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
        this.opacity12 = null;
        
        this.opacity12 = opacity12;
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

    private Fill imageSettings3;
    private Stroke editConnectorThumbStroke;
    private ColoredFill editConnectorThumbStroke1;
    private String editConnectorThumbStroke2;
    private Double thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    public void setEditconnectorthumbstroke(Stroke editConnectorThumbStroke, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.editConnectorThumbStroke = null;
        this.editConnectorThumbStroke1 = null;
        this.editConnectorThumbStroke2 = null;
        
        this.editConnectorThumbStroke = editConnectorThumbStroke;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
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


    public void setEditconnectorthumbstroke(ColoredFill editConnectorThumbStroke1, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.editConnectorThumbStroke = null;
        this.editConnectorThumbStroke1 = null;
        this.editConnectorThumbStroke2 = null;
        
        this.editConnectorThumbStroke1 = editConnectorThumbStroke1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
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


    public void setEditconnectorthumbstroke(String editConnectorThumbStroke2, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        this.editConnectorThumbStroke = null;
        this.editConnectorThumbStroke1 = null;
        this.editConnectorThumbStroke2 = null;
        
        this.editConnectorThumbStroke2 = editConnectorThumbStroke2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        
        this.thickness4 = thickness4;
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

    private Fill editIntervalThumbFill;

    public void setEditintervalthumbfill(Fill editIntervalThumbFill) {
        this.editIntervalThumbFill = editIntervalThumbFill;
    }

    private String color4;
    private Double opacity13;

    public void setEditintervalthumbfill(String color4, Double opacity13) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
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

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode12;
    private VectorRect mode13;
    private Double opacity14;

    public void setEditintervalthumbfill(GradientKey[] keys16, Boolean mode12, Double angle4, Double opacity14) {
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
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
    }


    public void setEditintervalthumbfill(GradientKey[] keys16, VectorRect mode13, Double angle4, Double opacity14) {
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
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
    }


    public void setEditintervalthumbfill(String[] keys17, Boolean mode12, Double angle4, Double opacity14) {
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
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
    }


    public void setEditintervalthumbfill(String[] keys17, VectorRect mode13, Double angle4, Double opacity14) {
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
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode14;
    private Double opacity15;
    private Double fx5;
    private Double fy5;

    public void setEditintervalthumbfill(GradientKey[] keys18, Double cx5, Double cy5, GraphicsMathRect mode14, Double opacity15, Double fx5, Double fy5) {
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
        this.opacity15 = null;
        
        this.opacity15 = opacity15;
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


    public void setEditintervalthumbfill(String[] keys19, Double cx5, Double cy5, GraphicsMathRect mode14, Double opacity15, Double fx5, Double fy5) {
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
        this.opacity15 = null;
        
        this.opacity15 = opacity15;
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

    private Fill imageSettings4;
    private Stroke editIntervalThumbStroke;
    private ColoredFill editIntervalThumbStroke1;
    private String editIntervalThumbStroke2;
    private Double thickness5;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    public void setEditintervalthumbstroke(Stroke editIntervalThumbStroke, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.editIntervalThumbStroke = null;
        this.editIntervalThumbStroke1 = null;
        this.editIntervalThumbStroke2 = null;
        
        this.editIntervalThumbStroke = editIntervalThumbStroke;
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


    public void setEditintervalthumbstroke(ColoredFill editIntervalThumbStroke1, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.editIntervalThumbStroke = null;
        this.editIntervalThumbStroke1 = null;
        this.editIntervalThumbStroke2 = null;
        
        this.editIntervalThumbStroke1 = editIntervalThumbStroke1;
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


    public void setEditintervalthumbstroke(String editIntervalThumbStroke2, Double thickness5, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        this.editIntervalThumbStroke = null;
        this.editIntervalThumbStroke1 = null;
        this.editIntervalThumbStroke2 = null;
        
        this.editIntervalThumbStroke2 = editIntervalThumbStroke2;
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

    private Fill editPreviewFill;

    public void setEditpreviewfill(Fill editPreviewFill) {
        this.editPreviewFill = editPreviewFill;
    }

    private String color5;
    private Double opacity16;

    public void setEditpreviewfill(String color5, Double opacity16) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        
        this.color5 = color5;
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

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode15;
    private VectorRect mode16;
    private Double opacity17;

    public void setEditpreviewfill(GradientKey[] keys20, Boolean mode15, Double angle5, Double opacity17) {
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
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
    }


    public void setEditpreviewfill(GradientKey[] keys20, VectorRect mode16, Double angle5, Double opacity17) {
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
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
    }


    public void setEditpreviewfill(String[] keys21, Boolean mode15, Double angle5, Double opacity17) {
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
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
    }


    public void setEditpreviewfill(String[] keys21, VectorRect mode16, Double angle5, Double opacity17) {
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
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx6;
    private Double cy6;
    private GraphicsMathRect mode17;
    private Double opacity18;
    private Double fx6;
    private Double fy6;

    public void setEditpreviewfill(GradientKey[] keys22, Double cx6, Double cy6, GraphicsMathRect mode17, Double opacity18, Double fx6, Double fy6) {
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
        this.cx6 = null;
        
        this.cx6 = cx6;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        
        this.cy6 = cy6;
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
        this.opacity18 = null;
        
        this.opacity18 = opacity18;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        
        this.fx6 = fx6;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        
        this.fy6 = fy6;
    }


    public void setEditpreviewfill(String[] keys23, Double cx6, Double cy6, GraphicsMathRect mode17, Double opacity18, Double fx6, Double fy6) {
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
        this.cx6 = null;
        
        this.cx6 = cx6;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        
        this.cy6 = cy6;
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
        this.opacity18 = null;
        
        this.opacity18 = opacity18;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        
        this.fx6 = fx6;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        
        this.fy6 = fy6;
    }

    private Fill imageSettings5;
    private Stroke editPreviewStroke;
    private ColoredFill editPreviewStroke1;
    private String editPreviewStroke2;
    private Double thickness6;
    private String dashpattern6;
    private StrokeLineJoin lineJoin6;
    private StrokeLineCap lineCap6;

    public void setEditpreviewstroke(Stroke editPreviewStroke, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        this.editPreviewStroke = null;
        this.editPreviewStroke1 = null;
        this.editPreviewStroke2 = null;
        
        this.editPreviewStroke = editPreviewStroke;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        
        this.dashpattern6 = dashpattern6;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        
        this.lineJoin6 = lineJoin6;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        
        this.lineCap6 = lineCap6;
    }


    public void setEditpreviewstroke(ColoredFill editPreviewStroke1, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        this.editPreviewStroke = null;
        this.editPreviewStroke1 = null;
        this.editPreviewStroke2 = null;
        
        this.editPreviewStroke1 = editPreviewStroke1;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        
        this.dashpattern6 = dashpattern6;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        
        this.lineJoin6 = lineJoin6;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        
        this.lineCap6 = lineCap6;
    }


    public void setEditpreviewstroke(String editPreviewStroke2, Double thickness6, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        this.editPreviewStroke = null;
        this.editPreviewStroke1 = null;
        this.editPreviewStroke2 = null;
        
        this.editPreviewStroke2 = editPreviewStroke2;
        this.thickness = null;
        this.thickness1 = null;
        this.thickness2 = null;
        this.thickness3 = null;
        this.thickness4 = null;
        this.thickness5 = null;
        this.thickness6 = null;
        
        this.thickness6 = thickness6;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        
        this.dashpattern6 = dashpattern6;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        
        this.lineJoin6 = lineJoin6;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        
        this.lineCap6 = lineCap6;
    }

    private Fill editProgressFill;

    public void setEditprogressfill(Fill editProgressFill) {
        this.editProgressFill = editProgressFill;
    }

    private String color6;
    private Double opacity19;

    public void setEditprogressfill(String color6, Double opacity19) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color6 = color6;
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
        this.opacity18 = null;
        this.opacity19 = null;
        
        this.opacity19 = opacity19;
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Double angle6;
    private Boolean mode18;
    private VectorRect mode19;
    private Double opacity20;

    public void setEditprogressfill(GradientKey[] keys24, Boolean mode18, Double angle6, Double opacity20) {
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
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys24 = keys24;
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
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode18 = mode18;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        
        this.opacity20 = opacity20;
    }


    public void setEditprogressfill(GradientKey[] keys24, VectorRect mode19, Double angle6, Double opacity20) {
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
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys24 = keys24;
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
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode19 = mode19;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        
        this.opacity20 = opacity20;
    }


    public void setEditprogressfill(String[] keys25, Boolean mode18, Double angle6, Double opacity20) {
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
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys25 = keys25;
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
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode18 = mode18;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        
        this.opacity20 = opacity20;
    }


    public void setEditprogressfill(String[] keys25, VectorRect mode19, Double angle6, Double opacity20) {
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
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys25 = keys25;
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
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode19 = mode19;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        
        this.opacity20 = opacity20;
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Double cx7;
    private Double cy7;
    private GraphicsMathRect mode20;
    private Double opacity21;
    private Double fx7;
    private Double fy7;

    public void setEditprogressfill(GradientKey[] keys26, Double cx7, Double cy7, GraphicsMathRect mode20, Double opacity21, Double fx7, Double fy7) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        
        this.keys26 = keys26;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        
        this.cx7 = cx7;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        
        this.cy7 = cy7;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        
        this.mode20 = mode20;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        
        this.opacity21 = opacity21;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        
        this.fx7 = fx7;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        
        this.fy7 = fy7;
    }


    public void setEditprogressfill(String[] keys27, Double cx7, Double cy7, GraphicsMathRect mode20, Double opacity21, Double fx7, Double fy7) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        
        this.keys27 = keys27;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        
        this.cx7 = cx7;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        
        this.cy7 = cy7;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        
        this.mode20 = mode20;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        
        this.opacity21 = opacity21;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        
        this.fx7 = fx7;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        
        this.fy7 = fy7;
    }

    private Fill imageSettings6;
    private Stroke editProgressStroke;
    private ColoredFill editProgressStroke1;
    private String editProgressStroke2;
    private Double thickness7;
    private String dashpattern7;
    private StrokeLineJoin lineJoin7;
    private StrokeLineCap lineCap7;

    public void setEditprogressstroke(Stroke editProgressStroke, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        this.editProgressStroke = null;
        this.editProgressStroke1 = null;
        this.editProgressStroke2 = null;
        
        this.editProgressStroke = editProgressStroke;
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
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        
        this.dashpattern7 = dashpattern7;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        
        this.lineJoin7 = lineJoin7;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        
        this.lineCap7 = lineCap7;
    }


    public void setEditprogressstroke(ColoredFill editProgressStroke1, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        this.editProgressStroke = null;
        this.editProgressStroke1 = null;
        this.editProgressStroke2 = null;
        
        this.editProgressStroke1 = editProgressStroke1;
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
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        
        this.dashpattern7 = dashpattern7;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        
        this.lineJoin7 = lineJoin7;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        
        this.lineCap7 = lineCap7;
    }


    public void setEditprogressstroke(String editProgressStroke2, Double thickness7, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        this.editProgressStroke = null;
        this.editProgressStroke1 = null;
        this.editProgressStroke2 = null;
        
        this.editProgressStroke2 = editProgressStroke2;
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
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        
        this.dashpattern7 = dashpattern7;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        
        this.lineJoin7 = lineJoin7;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        
        this.lineCap7 = lineCap7;
    }

    private Stroke editStructurePreviewDashStroke;
    private ColoredFill editStructurePreviewDashStroke1;
    private String editStructurePreviewDashStroke2;
    private Double thickness8;
    private String dashpattern8;
    private StrokeLineJoin lineJoin8;
    private StrokeLineCap lineCap8;

    public void setEditstructurepreviewdashstroke(Stroke editStructurePreviewDashStroke, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        this.editStructurePreviewDashStroke = null;
        this.editStructurePreviewDashStroke1 = null;
        this.editStructurePreviewDashStroke2 = null;
        
        this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        
        this.dashpattern8 = dashpattern8;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        
        this.lineJoin8 = lineJoin8;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        
        this.lineCap8 = lineCap8;
    }


    public void setEditstructurepreviewdashstroke(ColoredFill editStructurePreviewDashStroke1, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        this.editStructurePreviewDashStroke = null;
        this.editStructurePreviewDashStroke1 = null;
        this.editStructurePreviewDashStroke2 = null;
        
        this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        
        this.dashpattern8 = dashpattern8;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        
        this.lineJoin8 = lineJoin8;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        
        this.lineCap8 = lineCap8;
    }


    public void setEditstructurepreviewdashstroke(String editStructurePreviewDashStroke2, Double thickness8, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        this.editStructurePreviewDashStroke = null;
        this.editStructurePreviewDashStroke1 = null;
        this.editStructurePreviewDashStroke2 = null;
        
        this.editStructurePreviewDashStroke2 = editStructurePreviewDashStroke2;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        
        this.dashpattern8 = dashpattern8;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        
        this.lineJoin8 = lineJoin8;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        
        this.lineCap8 = lineCap8;
    }

    private Fill editStructurePreviewFill;

    public void setEditstructurepreviewfill(Fill editStructurePreviewFill) {
        this.editStructurePreviewFill = editStructurePreviewFill;
    }

    private String color7;
    private Double opacity22;

    public void setEditstructurepreviewfill(String color7, Double opacity22) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        
        this.opacity22 = opacity22;
    }

    private GradientKey[] keys28;
    private String[] keys29;
    private Double angle7;
    private Boolean mode21;
    private VectorRect mode22;
    private Double opacity23;

    public void setEditstructurepreviewfill(GradientKey[] keys28, Boolean mode21, Double angle7, Double opacity23) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        
        this.keys28 = keys28;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        
        this.mode21 = mode21;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        
        this.angle7 = angle7;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        
        this.opacity23 = opacity23;
    }


    public void setEditstructurepreviewfill(GradientKey[] keys28, VectorRect mode22, Double angle7, Double opacity23) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        
        this.keys28 = keys28;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        
        this.mode22 = mode22;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        
        this.angle7 = angle7;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        
        this.opacity23 = opacity23;
    }


    public void setEditstructurepreviewfill(String[] keys29, Boolean mode21, Double angle7, Double opacity23) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        
        this.keys29 = keys29;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        
        this.mode21 = mode21;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        
        this.angle7 = angle7;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        
        this.opacity23 = opacity23;
    }


    public void setEditstructurepreviewfill(String[] keys29, VectorRect mode22, Double angle7, Double opacity23) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        
        this.keys29 = keys29;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        
        this.mode22 = mode22;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        
        this.angle7 = angle7;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        
        this.opacity23 = opacity23;
    }

    private GradientKey[] keys30;
    private String[] keys31;
    private Double cx8;
    private Double cy8;
    private GraphicsMathRect mode23;
    private Double opacity24;
    private Double fx8;
    private Double fy8;

    public void setEditstructurepreviewfill(GradientKey[] keys30, Double cx8, Double cy8, GraphicsMathRect mode23, Double opacity24, Double fx8, Double fy8) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        
        this.keys30 = keys30;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        
        this.cx8 = cx8;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        
        this.cy8 = cy8;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        
        this.mode23 = mode23;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        
        this.opacity24 = opacity24;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        
        this.fx8 = fx8;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        
        this.fy8 = fy8;
    }


    public void setEditstructurepreviewfill(String[] keys31, Double cx8, Double cy8, GraphicsMathRect mode23, Double opacity24, Double fx8, Double fy8) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        
        this.keys31 = keys31;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        
        this.cx8 = cx8;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        
        this.cy8 = cy8;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        
        this.mode23 = mode23;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        
        this.opacity24 = opacity24;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        
        this.fx8 = fx8;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        
        this.fy8 = fy8;
    }

    private Fill imageSettings7;
    private Stroke editStructurePreviewStroke;
    private ColoredFill editStructurePreviewStroke1;
    private String editStructurePreviewStroke2;
    private Double thickness9;
    private String dashpattern9;
    private StrokeLineJoin lineJoin9;
    private StrokeLineCap lineCap9;

    public void setEditstructurepreviewstroke(Stroke editStructurePreviewStroke, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        this.editStructurePreviewStroke = null;
        this.editStructurePreviewStroke1 = null;
        this.editStructurePreviewStroke2 = null;
        
        this.editStructurePreviewStroke = editStructurePreviewStroke;
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
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        
        this.dashpattern9 = dashpattern9;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        
        this.lineJoin9 = lineJoin9;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        
        this.lineCap9 = lineCap9;
    }


    public void setEditstructurepreviewstroke(ColoredFill editStructurePreviewStroke1, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        this.editStructurePreviewStroke = null;
        this.editStructurePreviewStroke1 = null;
        this.editStructurePreviewStroke2 = null;
        
        this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
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
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        
        this.dashpattern9 = dashpattern9;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        
        this.lineJoin9 = lineJoin9;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        
        this.lineCap9 = lineCap9;
    }


    public void setEditstructurepreviewstroke(String editStructurePreviewStroke2, Double thickness9, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        this.editStructurePreviewStroke = null;
        this.editStructurePreviewStroke1 = null;
        this.editStructurePreviewStroke2 = null;
        
        this.editStructurePreviewStroke2 = editStructurePreviewStroke2;
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
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        
        this.dashpattern9 = dashpattern9;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        
        this.lineJoin9 = lineJoin9;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        
        this.lineCap9 = lineCap9;
    }

    private Boolean editing;

    public void setEditing(Boolean editing) {
        this.editing = editing;
    }

    private Double index;

    public void setLinemarker(Double index) {
        this.index = index;
    }

    private Boolean lineMarker;

    public void setLinemarker(Boolean lineMarker) {
        this.lineMarker = lineMarker;
    }

    private Double index1;
    private Boolean lineMarker1;
    private GanttDateTimeMarkers lineMarker2;

    public void setLinemarker(Boolean lineMarker1, Double index1) {
        this.lineMarker = null;
        this.lineMarker1 = null;
        this.lineMarker2 = null;
        
        this.lineMarker1 = lineMarker1;
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }


    public void setLinemarker(GanttDateTimeMarkers lineMarker2, Double index1) {
        this.lineMarker = null;
        this.lineMarker1 = null;
        this.lineMarker2 = null;
        
        this.lineMarker2 = lineMarker2;
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Fill milestoneFill;

    public void setMilestonefill(Fill milestoneFill) {
        this.milestoneFill = milestoneFill;
    }

    private String color8;
    private Double opacity25;

    public void setMilestonefill(String color8, Double opacity25) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        
        this.opacity25 = opacity25;
    }

    private GradientKey[] keys32;
    private String[] keys33;
    private Double angle8;
    private Boolean mode24;
    private VectorRect mode25;
    private Double opacity26;

    public void setMilestonefill(GradientKey[] keys32, Boolean mode24, Double angle8, Double opacity26) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        
        this.keys32 = keys32;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        
        this.mode24 = mode24;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        
        this.angle8 = angle8;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        
        this.opacity26 = opacity26;
    }


    public void setMilestonefill(GradientKey[] keys32, VectorRect mode25, Double angle8, Double opacity26) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        
        this.keys32 = keys32;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        
        this.mode25 = mode25;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        
        this.angle8 = angle8;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        
        this.opacity26 = opacity26;
    }


    public void setMilestonefill(String[] keys33, Boolean mode24, Double angle8, Double opacity26) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        
        this.keys33 = keys33;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        
        this.mode24 = mode24;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        
        this.angle8 = angle8;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        
        this.opacity26 = opacity26;
    }


    public void setMilestonefill(String[] keys33, VectorRect mode25, Double angle8, Double opacity26) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        
        this.keys33 = keys33;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        
        this.mode25 = mode25;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        
        this.angle8 = angle8;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        
        this.opacity26 = opacity26;
    }

    private GradientKey[] keys34;
    private String[] keys35;
    private Double cx9;
    private Double cy9;
    private GraphicsMathRect mode26;
    private Double opacity27;
    private Double fx9;
    private Double fy9;

    public void setMilestonefill(GradientKey[] keys34, Double cx9, Double cy9, GraphicsMathRect mode26, Double opacity27, Double fx9, Double fy9) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        
        this.keys34 = keys34;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        
        this.cx9 = cx9;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        
        this.cy9 = cy9;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        
        this.mode26 = mode26;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        
        this.opacity27 = opacity27;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        
        this.fx9 = fx9;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        
        this.fy9 = fy9;
    }


    public void setMilestonefill(String[] keys35, Double cx9, Double cy9, GraphicsMathRect mode26, Double opacity27, Double fx9, Double fy9) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        
        this.keys35 = keys35;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        
        this.cx9 = cx9;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        
        this.cy9 = cy9;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        
        this.mode26 = mode26;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        
        this.opacity27 = opacity27;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        
        this.fx9 = fx9;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        
        this.fy9 = fy9;
    }

    private Fill imageSettings8;
    private Stroke milestoneStroke;
    private ColoredFill milestoneStroke1;
    private String milestoneStroke2;
    private Double thickness10;
    private String dashpattern10;
    private StrokeLineJoin lineJoin10;
    private StrokeLineCap lineCap10;

    public void setMilestonestroke(Stroke milestoneStroke, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        this.milestoneStroke = null;
        this.milestoneStroke1 = null;
        this.milestoneStroke2 = null;
        
        this.milestoneStroke = milestoneStroke;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        
        this.dashpattern10 = dashpattern10;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        
        this.lineJoin10 = lineJoin10;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        
        this.lineCap10 = lineCap10;
    }


    public void setMilestonestroke(ColoredFill milestoneStroke1, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        this.milestoneStroke = null;
        this.milestoneStroke1 = null;
        this.milestoneStroke2 = null;
        
        this.milestoneStroke1 = milestoneStroke1;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        
        this.dashpattern10 = dashpattern10;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        
        this.lineJoin10 = lineJoin10;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        
        this.lineCap10 = lineCap10;
    }


    public void setMilestonestroke(String milestoneStroke2, Double thickness10, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        this.milestoneStroke = null;
        this.milestoneStroke1 = null;
        this.milestoneStroke2 = null;
        
        this.milestoneStroke2 = milestoneStroke2;
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
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        
        this.dashpattern10 = dashpattern10;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        
        this.lineJoin10 = lineJoin10;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        
        this.lineCap10 = lineCap10;
    }

    private Fill parentFill;

    public void setParentfill(Fill parentFill) {
        this.parentFill = parentFill;
    }

    private String color9;
    private Double opacity28;

    public void setParentfill(String color9, Double opacity28) {
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
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        
        this.opacity28 = opacity28;
    }

    private GradientKey[] keys36;
    private String[] keys37;
    private Double angle9;
    private Boolean mode27;
    private VectorRect mode28;
    private Double opacity29;

    public void setParentfill(GradientKey[] keys36, Boolean mode27, Double angle9, Double opacity29) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        
        this.keys36 = keys36;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        
        this.mode27 = mode27;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        
        this.angle9 = angle9;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        
        this.opacity29 = opacity29;
    }


    public void setParentfill(GradientKey[] keys36, VectorRect mode28, Double angle9, Double opacity29) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        
        this.keys36 = keys36;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        
        this.mode28 = mode28;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        
        this.angle9 = angle9;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        
        this.opacity29 = opacity29;
    }


    public void setParentfill(String[] keys37, Boolean mode27, Double angle9, Double opacity29) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        
        this.keys37 = keys37;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        
        this.mode27 = mode27;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        
        this.angle9 = angle9;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        
        this.opacity29 = opacity29;
    }


    public void setParentfill(String[] keys37, VectorRect mode28, Double angle9, Double opacity29) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        
        this.keys37 = keys37;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        
        this.mode28 = mode28;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        
        this.angle9 = angle9;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        
        this.opacity29 = opacity29;
    }

    private GradientKey[] keys38;
    private String[] keys39;
    private Double cx10;
    private Double cy10;
    private GraphicsMathRect mode29;
    private Double opacity30;
    private Double fx10;
    private Double fy10;

    public void setParentfill(GradientKey[] keys38, Double cx10, Double cy10, GraphicsMathRect mode29, Double opacity30, Double fx10, Double fy10) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        
        this.keys38 = keys38;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        
        this.cx10 = cx10;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        
        this.cy10 = cy10;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        
        this.mode29 = mode29;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        
        this.opacity30 = opacity30;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        
        this.fx10 = fx10;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        
        this.fy10 = fy10;
    }


    public void setParentfill(String[] keys39, Double cx10, Double cy10, GraphicsMathRect mode29, Double opacity30, Double fx10, Double fy10) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        
        this.keys39 = keys39;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        
        this.cx10 = cx10;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        
        this.cy10 = cy10;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        
        this.mode29 = mode29;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        
        this.opacity30 = opacity30;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        
        this.fx10 = fx10;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        
        this.fy10 = fy10;
    }

    private Fill imageSettings9;
    private Stroke parentStroke;
    private ColoredFill parentStroke1;
    private String parentStroke2;
    private Double thickness11;
    private String dashpattern11;
    private StrokeLineJoin lineJoin11;
    private StrokeLineCap lineCap11;

    public void setParentstroke(Stroke parentStroke, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        this.parentStroke = null;
        this.parentStroke1 = null;
        this.parentStroke2 = null;
        
        this.parentStroke = parentStroke;
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
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        
        this.dashpattern11 = dashpattern11;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        
        this.lineJoin11 = lineJoin11;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        
        this.lineCap11 = lineCap11;
    }


    public void setParentstroke(ColoredFill parentStroke1, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        this.parentStroke = null;
        this.parentStroke1 = null;
        this.parentStroke2 = null;
        
        this.parentStroke1 = parentStroke1;
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
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        
        this.dashpattern11 = dashpattern11;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        
        this.lineJoin11 = lineJoin11;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        
        this.lineCap11 = lineCap11;
    }


    public void setParentstroke(String parentStroke2, Double thickness11, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        this.parentStroke = null;
        this.parentStroke1 = null;
        this.parentStroke2 = null;
        
        this.parentStroke2 = parentStroke2;
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
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        
        this.dashpattern11 = dashpattern11;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        
        this.lineJoin11 = lineJoin11;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        
        this.lineCap11 = lineCap11;
    }

    private Fill progressFill;

    public void setProgressfill(Fill progressFill) {
        this.progressFill = progressFill;
    }

    private String color10;
    private Double opacity31;

    public void setProgressfill(String color10, Double opacity31) {
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
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        
        this.opacity31 = opacity31;
    }

    private GradientKey[] keys40;
    private String[] keys41;
    private Double angle10;
    private Boolean mode30;
    private VectorRect mode31;
    private Double opacity32;

    public void setProgressfill(GradientKey[] keys40, Boolean mode30, Double angle10, Double opacity32) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        
        this.keys40 = keys40;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        
        this.mode30 = mode30;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        
        this.angle10 = angle10;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        
        this.opacity32 = opacity32;
    }


    public void setProgressfill(GradientKey[] keys40, VectorRect mode31, Double angle10, Double opacity32) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        
        this.keys40 = keys40;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        
        this.mode31 = mode31;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        
        this.angle10 = angle10;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        
        this.opacity32 = opacity32;
    }


    public void setProgressfill(String[] keys41, Boolean mode30, Double angle10, Double opacity32) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        
        this.keys41 = keys41;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        
        this.mode30 = mode30;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        
        this.angle10 = angle10;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        
        this.opacity32 = opacity32;
    }


    public void setProgressfill(String[] keys41, VectorRect mode31, Double angle10, Double opacity32) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        
        this.keys41 = keys41;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        
        this.mode31 = mode31;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        
        this.angle10 = angle10;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        
        this.opacity32 = opacity32;
    }

    private GradientKey[] keys42;
    private String[] keys43;
    private Double cx11;
    private Double cy11;
    private GraphicsMathRect mode32;
    private Double opacity33;
    private Double fx11;
    private Double fy11;

    public void setProgressfill(GradientKey[] keys42, Double cx11, Double cy11, GraphicsMathRect mode32, Double opacity33, Double fx11, Double fy11) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        
        this.keys42 = keys42;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        
        this.cx11 = cx11;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        
        this.cy11 = cy11;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        
        this.mode32 = mode32;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        
        this.opacity33 = opacity33;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        
        this.fx11 = fx11;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        
        this.fy11 = fy11;
    }


    public void setProgressfill(String[] keys43, Double cx11, Double cy11, GraphicsMathRect mode32, Double opacity33, Double fx11, Double fy11) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        
        this.keys43 = keys43;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        
        this.cx11 = cx11;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        
        this.cy11 = cy11;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        
        this.mode32 = mode32;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        
        this.opacity33 = opacity33;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        
        this.fx11 = fx11;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        
        this.fy11 = fy11;
    }

    private Fill imageSettings10;
    private Stroke progressStroke;
    private ColoredFill progressStroke1;
    private String progressStroke2;
    private Double thickness12;
    private String dashpattern12;
    private StrokeLineJoin lineJoin12;
    private StrokeLineCap lineCap12;

    public void setProgressstroke(Stroke progressStroke, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        this.progressStroke = null;
        this.progressStroke1 = null;
        this.progressStroke2 = null;
        
        this.progressStroke = progressStroke;
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
        this.thickness12 = null;
        
        this.thickness12 = thickness12;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        
        this.dashpattern12 = dashpattern12;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        
        this.lineJoin12 = lineJoin12;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        
        this.lineCap12 = lineCap12;
    }


    public void setProgressstroke(ColoredFill progressStroke1, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        this.progressStroke = null;
        this.progressStroke1 = null;
        this.progressStroke2 = null;
        
        this.progressStroke1 = progressStroke1;
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
        this.thickness12 = null;
        
        this.thickness12 = thickness12;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        
        this.dashpattern12 = dashpattern12;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        
        this.lineJoin12 = lineJoin12;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        
        this.lineCap12 = lineCap12;
    }


    public void setProgressstroke(String progressStroke2, Double thickness12, String dashpattern12, StrokeLineJoin lineJoin12, StrokeLineCap lineCap12) {
        this.progressStroke = null;
        this.progressStroke1 = null;
        this.progressStroke2 = null;
        
        this.progressStroke2 = progressStroke2;
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
        this.thickness12 = null;
        
        this.thickness12 = thickness12;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        
        this.dashpattern12 = dashpattern12;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        
        this.lineJoin12 = lineJoin12;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        
        this.lineCap12 = lineCap12;
    }

    private Double index2;

    public void setRangemarker(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
    }

    private Boolean rangeMarker;

    public void setRangemarker(Boolean rangeMarker) {
        this.rangeMarker = rangeMarker;
    }

    private Double index3;
    private Boolean rangeMarker1;
    private GanttDateTimeMarkers rangeMarker2;

    public void setRangemarker(Boolean rangeMarker1, Double index3) {
        this.rangeMarker = null;
        this.rangeMarker1 = null;
        this.rangeMarker2 = null;
        
        this.rangeMarker1 = rangeMarker1;
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
    }


    public void setRangemarker(GanttDateTimeMarkers rangeMarker2, Double index3) {
        this.rangeMarker = null;
        this.rangeMarker1 = null;
        this.rangeMarker2 = null;
        
        this.rangeMarker2 = rangeMarker2;
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
    }

    private Fill rowEvenFill;

    public void setRowevenfill(Fill rowEvenFill) {
        this.rowEvenFill = rowEvenFill;
    }

    private String color11;
    private Double opacity34;

    public void setRowevenfill(String color11, Double opacity34) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        
        this.opacity34 = opacity34;
    }

    private GradientKey[] keys44;
    private String[] keys45;
    private Double angle11;
    private Boolean mode33;
    private VectorRect mode34;
    private Double opacity35;

    public void setRowevenfill(GradientKey[] keys44, Boolean mode33, Double angle11, Double opacity35) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        
        this.keys44 = keys44;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        
        this.mode33 = mode33;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        
        this.angle11 = angle11;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        
        this.opacity35 = opacity35;
    }


    public void setRowevenfill(GradientKey[] keys44, VectorRect mode34, Double angle11, Double opacity35) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        
        this.keys44 = keys44;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        
        this.mode34 = mode34;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        
        this.angle11 = angle11;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        
        this.opacity35 = opacity35;
    }


    public void setRowevenfill(String[] keys45, Boolean mode33, Double angle11, Double opacity35) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        
        this.keys45 = keys45;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        
        this.mode33 = mode33;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        
        this.angle11 = angle11;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        
        this.opacity35 = opacity35;
    }


    public void setRowevenfill(String[] keys45, VectorRect mode34, Double angle11, Double opacity35) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        
        this.keys45 = keys45;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        
        this.mode34 = mode34;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        
        this.angle11 = angle11;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        
        this.opacity35 = opacity35;
    }

    private GradientKey[] keys46;
    private String[] keys47;
    private Double cx12;
    private Double cy12;
    private GraphicsMathRect mode35;
    private Double opacity36;
    private Double fx12;
    private Double fy12;

    public void setRowevenfill(GradientKey[] keys46, Double cx12, Double cy12, GraphicsMathRect mode35, Double opacity36, Double fx12, Double fy12) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        
        this.keys46 = keys46;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        
        this.cx12 = cx12;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        
        this.cy12 = cy12;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        
        this.mode35 = mode35;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        
        this.opacity36 = opacity36;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        
        this.fx12 = fx12;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        
        this.fy12 = fy12;
    }


    public void setRowevenfill(String[] keys47, Double cx12, Double cy12, GraphicsMathRect mode35, Double opacity36, Double fx12, Double fy12) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        
        this.keys47 = keys47;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        
        this.cx12 = cx12;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        
        this.cy12 = cy12;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        
        this.mode35 = mode35;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        
        this.opacity36 = opacity36;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        
        this.fx12 = fx12;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        
        this.fy12 = fy12;
    }

    private Fill imageSettings11;
    private Fill rowFill;

    public void setRowfill(Fill rowFill) {
        this.rowFill = rowFill;
    }

    private String color12;
    private Double opacity37;

    public void setRowfill(String color12, Double opacity37) {
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
        
        this.color12 = color12;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        
        this.opacity37 = opacity37;
    }

    private GradientKey[] keys48;
    private String[] keys49;
    private Double angle12;
    private Boolean mode36;
    private VectorRect mode37;
    private Double opacity38;

    public void setRowfill(GradientKey[] keys48, Boolean mode36, Double angle12, Double opacity38) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        
        this.keys48 = keys48;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        
        this.mode36 = mode36;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        
        this.angle12 = angle12;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        
        this.opacity38 = opacity38;
    }


    public void setRowfill(GradientKey[] keys48, VectorRect mode37, Double angle12, Double opacity38) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        
        this.keys48 = keys48;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        
        this.mode37 = mode37;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        
        this.angle12 = angle12;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        
        this.opacity38 = opacity38;
    }


    public void setRowfill(String[] keys49, Boolean mode36, Double angle12, Double opacity38) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        
        this.keys49 = keys49;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        
        this.mode36 = mode36;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        
        this.angle12 = angle12;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        
        this.opacity38 = opacity38;
    }


    public void setRowfill(String[] keys49, VectorRect mode37, Double angle12, Double opacity38) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        
        this.keys49 = keys49;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        
        this.mode37 = mode37;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        
        this.angle12 = angle12;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        
        this.opacity38 = opacity38;
    }

    private GradientKey[] keys50;
    private String[] keys51;
    private Double cx13;
    private Double cy13;
    private GraphicsMathRect mode38;
    private Double opacity39;
    private Double fx13;
    private Double fy13;

    public void setRowfill(GradientKey[] keys50, Double cx13, Double cy13, GraphicsMathRect mode38, Double opacity39, Double fx13, Double fy13) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        
        this.keys50 = keys50;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        
        this.cx13 = cx13;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        
        this.cy13 = cy13;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        
        this.mode38 = mode38;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        
        this.opacity39 = opacity39;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        
        this.fx13 = fx13;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        
        this.fy13 = fy13;
    }


    public void setRowfill(String[] keys51, Double cx13, Double cy13, GraphicsMathRect mode38, Double opacity39, Double fx13, Double fy13) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        
        this.keys51 = keys51;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        
        this.cx13 = cx13;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        
        this.cy13 = cy13;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        
        this.mode38 = mode38;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        
        this.opacity39 = opacity39;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        
        this.fx13 = fx13;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        
        this.fy13 = fy13;
    }

    private Fill imageSettings12;
    private Fill rowHoverFill;

    public void setRowhoverfill(Fill rowHoverFill) {
        this.rowHoverFill = rowHoverFill;
    }

    private String color13;
    private Double opacity40;

    public void setRowhoverfill(String color13, Double opacity40) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        
        this.opacity40 = opacity40;
    }

    private GradientKey[] keys52;
    private String[] keys53;
    private Double angle13;
    private Boolean mode39;
    private VectorRect mode40;
    private Double opacity41;

    public void setRowhoverfill(GradientKey[] keys52, Boolean mode39, Double angle13, Double opacity41) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        
        this.keys52 = keys52;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        
        this.mode39 = mode39;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        
        this.angle13 = angle13;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        
        this.opacity41 = opacity41;
    }


    public void setRowhoverfill(GradientKey[] keys52, VectorRect mode40, Double angle13, Double opacity41) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        
        this.keys52 = keys52;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        
        this.mode40 = mode40;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        
        this.angle13 = angle13;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        
        this.opacity41 = opacity41;
    }


    public void setRowhoverfill(String[] keys53, Boolean mode39, Double angle13, Double opacity41) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        
        this.keys53 = keys53;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        
        this.mode39 = mode39;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        
        this.angle13 = angle13;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        
        this.opacity41 = opacity41;
    }


    public void setRowhoverfill(String[] keys53, VectorRect mode40, Double angle13, Double opacity41) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        
        this.keys53 = keys53;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        
        this.mode40 = mode40;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        
        this.angle13 = angle13;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        
        this.opacity41 = opacity41;
    }

    private GradientKey[] keys54;
    private String[] keys55;
    private Double cx14;
    private Double cy14;
    private GraphicsMathRect mode41;
    private Double opacity42;
    private Double fx14;
    private Double fy14;

    public void setRowhoverfill(GradientKey[] keys54, Double cx14, Double cy14, GraphicsMathRect mode41, Double opacity42, Double fx14, Double fy14) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        
        this.keys54 = keys54;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        
        this.cx14 = cx14;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        
        this.cy14 = cy14;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        
        this.mode41 = mode41;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        
        this.opacity42 = opacity42;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        
        this.fx14 = fx14;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        
        this.fy14 = fy14;
    }


    public void setRowhoverfill(String[] keys55, Double cx14, Double cy14, GraphicsMathRect mode41, Double opacity42, Double fx14, Double fy14) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        
        this.keys55 = keys55;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        
        this.cx14 = cx14;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        
        this.cy14 = cy14;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        
        this.mode41 = mode41;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        
        this.opacity42 = opacity42;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        
        this.fx14 = fx14;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        
        this.fy14 = fy14;
    }

    private Fill rowOddFill;

    public void setRowoddfill(Fill rowOddFill) {
        this.rowOddFill = rowOddFill;
    }

    private String color14;
    private Double opacity43;

    public void setRowoddfill(String color14, Double opacity43) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        
        this.opacity43 = opacity43;
    }

    private GradientKey[] keys56;
    private String[] keys57;
    private Double angle14;
    private Boolean mode42;
    private VectorRect mode43;
    private Double opacity44;

    public void setRowoddfill(GradientKey[] keys56, Boolean mode42, Double angle14, Double opacity44) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        
        this.keys56 = keys56;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        
        this.mode42 = mode42;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        
        this.angle14 = angle14;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        
        this.opacity44 = opacity44;
    }


    public void setRowoddfill(GradientKey[] keys56, VectorRect mode43, Double angle14, Double opacity44) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        
        this.keys56 = keys56;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        
        this.mode43 = mode43;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        
        this.angle14 = angle14;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        
        this.opacity44 = opacity44;
    }


    public void setRowoddfill(String[] keys57, Boolean mode42, Double angle14, Double opacity44) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        
        this.keys57 = keys57;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        
        this.mode42 = mode42;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        
        this.angle14 = angle14;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        
        this.opacity44 = opacity44;
    }


    public void setRowoddfill(String[] keys57, VectorRect mode43, Double angle14, Double opacity44) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        
        this.keys57 = keys57;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        
        this.mode43 = mode43;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        
        this.angle14 = angle14;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        
        this.opacity44 = opacity44;
    }

    private GradientKey[] keys58;
    private String[] keys59;
    private Double cx15;
    private Double cy15;
    private GraphicsMathRect mode44;
    private Double opacity45;
    private Double fx15;
    private Double fy15;

    public void setRowoddfill(GradientKey[] keys58, Double cx15, Double cy15, GraphicsMathRect mode44, Double opacity45, Double fx15, Double fy15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        
        this.keys58 = keys58;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        
        this.cx15 = cx15;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        
        this.cy15 = cy15;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        
        this.mode44 = mode44;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        
        this.opacity45 = opacity45;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        
        this.fx15 = fx15;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        
        this.fy15 = fy15;
    }


    public void setRowoddfill(String[] keys59, Double cx15, Double cy15, GraphicsMathRect mode44, Double opacity45, Double fx15, Double fy15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        
        this.keys59 = keys59;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        
        this.cx15 = cx15;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        
        this.cy15 = cy15;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        
        this.mode44 = mode44;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        
        this.opacity45 = opacity45;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        
        this.fx15 = fx15;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        
        this.fy15 = fy15;
    }

    private Fill imageSettings13;
    private Fill rowSelectedFill;

    public void setRowselectedfill(Fill rowSelectedFill) {
        this.rowSelectedFill = rowSelectedFill;
    }

    private String color15;
    private Double opacity46;

    public void setRowselectedfill(String color15, Double opacity46) {
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
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        
        this.opacity46 = opacity46;
    }

    private GradientKey[] keys60;
    private String[] keys61;
    private Double angle15;
    private Boolean mode45;
    private VectorRect mode46;

    public void setRowselectedfill(GradientKey[] keys60, Boolean mode45, Double angle15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        
        this.keys60 = keys60;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        
        this.mode45 = mode45;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        
        this.angle15 = angle15;
    }


    public void setRowselectedfill(GradientKey[] keys60, VectorRect mode46, Double angle15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        
        this.keys60 = keys60;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        
        this.mode46 = mode46;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        
        this.angle15 = angle15;
    }


    public void setRowselectedfill(String[] keys61, Boolean mode45, Double angle15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        
        this.keys61 = keys61;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        
        this.mode45 = mode45;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        
        this.angle15 = angle15;
    }


    public void setRowselectedfill(String[] keys61, VectorRect mode46, Double angle15) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        
        this.keys61 = keys61;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        
        this.mode46 = mode46;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        
        this.angle15 = angle15;
    }

    private GradientKey[] keys62;
    private String[] keys63;
    private Double cx16;
    private Double cy16;
    private GraphicsMathRect mode47;
    private Double opacity47;
    private Double fx16;
    private Double fy16;

    public void setRowselectedfill(GradientKey[] keys62, Double cx16, Double cy16, GraphicsMathRect mode47, Double opacity47, Double fx16, Double fy16) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        
        this.keys62 = keys62;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        this.cx16 = null;
        
        this.cx16 = cx16;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        this.cy16 = null;
        
        this.cy16 = cy16;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        
        this.mode47 = mode47;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        
        this.opacity47 = opacity47;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        this.fx16 = null;
        
        this.fx16 = fx16;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        this.fy16 = null;
        
        this.fy16 = fy16;
    }


    public void setRowselectedfill(String[] keys63, Double cx16, Double cy16, GraphicsMathRect mode47, Double opacity47, Double fx16, Double fy16) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        
        this.keys63 = keys63;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        this.cx16 = null;
        
        this.cx16 = cx16;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        this.cy16 = null;
        
        this.cy16 = cy16;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        
        this.mode47 = mode47;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        
        this.opacity47 = opacity47;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        this.fx16 = null;
        
        this.fx16 = fx16;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        this.fy16 = null;
        
        this.fy16 = fy16;
    }

    private Fill imageSettings14;
    private Fill selectedElementFill;

    public void setSelectedelementfill(Fill selectedElementFill) {
        this.selectedElementFill = selectedElementFill;
    }

    private String color16;
    private Double opacity48;

    public void setSelectedelementfill(String color16, Double opacity48) {
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        
        this.opacity48 = opacity48;
    }

    private GradientKey[] keys64;
    private String[] keys65;
    private Double angle16;
    private Boolean mode48;
    private VectorRect mode49;
    private Double opacity49;

    public void setSelectedelementfill(GradientKey[] keys64, Boolean mode48, Double angle16, Double opacity49) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        
        this.keys64 = keys64;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        
        this.mode48 = mode48;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        this.angle16 = null;
        
        this.angle16 = angle16;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        
        this.opacity49 = opacity49;
    }


    public void setSelectedelementfill(GradientKey[] keys64, VectorRect mode49, Double angle16, Double opacity49) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        
        this.keys64 = keys64;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        
        this.mode49 = mode49;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        this.angle16 = null;
        
        this.angle16 = angle16;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        
        this.opacity49 = opacity49;
    }


    public void setSelectedelementfill(String[] keys65, Boolean mode48, Double angle16, Double opacity49) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        
        this.keys65 = keys65;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        
        this.mode48 = mode48;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        this.angle16 = null;
        
        this.angle16 = angle16;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        
        this.opacity49 = opacity49;
    }


    public void setSelectedelementfill(String[] keys65, VectorRect mode49, Double angle16, Double opacity49) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        
        this.keys65 = keys65;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        
        this.mode49 = mode49;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        this.angle7 = null;
        this.angle8 = null;
        this.angle9 = null;
        this.angle10 = null;
        this.angle11 = null;
        this.angle12 = null;
        this.angle13 = null;
        this.angle14 = null;
        this.angle15 = null;
        this.angle16 = null;
        
        this.angle16 = angle16;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        
        this.opacity49 = opacity49;
    }

    private GradientKey[] keys66;
    private String[] keys67;
    private Double cx17;
    private Double cy17;
    private GraphicsMathRect mode50;
    private Double opacity50;
    private Double fx17;
    private Double fy17;

    public void setSelectedelementfill(GradientKey[] keys66, Double cx17, Double cy17, GraphicsMathRect mode50, Double opacity50, Double fx17, Double fy17) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        this.keys66 = null;
        this.keys67 = null;
        
        this.keys66 = keys66;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        this.cx16 = null;
        this.cx17 = null;
        
        this.cx17 = cx17;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        this.cy16 = null;
        this.cy17 = null;
        
        this.cy17 = cy17;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        this.mode50 = null;
        
        this.mode50 = mode50;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        this.opacity50 = null;
        
        this.opacity50 = opacity50;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        this.fx16 = null;
        this.fx17 = null;
        
        this.fx17 = fx17;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        this.fy16 = null;
        this.fy17 = null;
        
        this.fy17 = fy17;
    }


    public void setSelectedelementfill(String[] keys67, Double cx17, Double cy17, GraphicsMathRect mode50, Double opacity50, Double fx17, Double fy17) {
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
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        this.keys28 = null;
        this.keys29 = null;
        this.keys30 = null;
        this.keys31 = null;
        this.keys32 = null;
        this.keys33 = null;
        this.keys34 = null;
        this.keys35 = null;
        this.keys36 = null;
        this.keys37 = null;
        this.keys38 = null;
        this.keys39 = null;
        this.keys40 = null;
        this.keys41 = null;
        this.keys42 = null;
        this.keys43 = null;
        this.keys44 = null;
        this.keys45 = null;
        this.keys46 = null;
        this.keys47 = null;
        this.keys48 = null;
        this.keys49 = null;
        this.keys50 = null;
        this.keys51 = null;
        this.keys52 = null;
        this.keys53 = null;
        this.keys54 = null;
        this.keys55 = null;
        this.keys56 = null;
        this.keys57 = null;
        this.keys58 = null;
        this.keys59 = null;
        this.keys60 = null;
        this.keys61 = null;
        this.keys62 = null;
        this.keys63 = null;
        this.keys64 = null;
        this.keys65 = null;
        this.keys66 = null;
        this.keys67 = null;
        
        this.keys67 = keys67;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        this.cx7 = null;
        this.cx8 = null;
        this.cx9 = null;
        this.cx10 = null;
        this.cx11 = null;
        this.cx12 = null;
        this.cx13 = null;
        this.cx14 = null;
        this.cx15 = null;
        this.cx16 = null;
        this.cx17 = null;
        
        this.cx17 = cx17;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        this.cy7 = null;
        this.cy8 = null;
        this.cy9 = null;
        this.cy10 = null;
        this.cy11 = null;
        this.cy12 = null;
        this.cy13 = null;
        this.cy14 = null;
        this.cy15 = null;
        this.cy16 = null;
        this.cy17 = null;
        
        this.cy17 = cy17;
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
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        this.mode21 = null;
        this.mode22 = null;
        this.mode23 = null;
        this.mode24 = null;
        this.mode25 = null;
        this.mode26 = null;
        this.mode27 = null;
        this.mode28 = null;
        this.mode29 = null;
        this.mode30 = null;
        this.mode31 = null;
        this.mode32 = null;
        this.mode33 = null;
        this.mode34 = null;
        this.mode35 = null;
        this.mode36 = null;
        this.mode37 = null;
        this.mode38 = null;
        this.mode39 = null;
        this.mode40 = null;
        this.mode41 = null;
        this.mode42 = null;
        this.mode43 = null;
        this.mode44 = null;
        this.mode45 = null;
        this.mode46 = null;
        this.mode47 = null;
        this.mode48 = null;
        this.mode49 = null;
        this.mode50 = null;
        
        this.mode50 = mode50;
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
        this.opacity18 = null;
        this.opacity19 = null;
        this.opacity20 = null;
        this.opacity21 = null;
        this.opacity22 = null;
        this.opacity23 = null;
        this.opacity24 = null;
        this.opacity25 = null;
        this.opacity26 = null;
        this.opacity27 = null;
        this.opacity28 = null;
        this.opacity29 = null;
        this.opacity30 = null;
        this.opacity31 = null;
        this.opacity32 = null;
        this.opacity33 = null;
        this.opacity34 = null;
        this.opacity35 = null;
        this.opacity36 = null;
        this.opacity37 = null;
        this.opacity38 = null;
        this.opacity39 = null;
        this.opacity40 = null;
        this.opacity41 = null;
        this.opacity42 = null;
        this.opacity43 = null;
        this.opacity44 = null;
        this.opacity45 = null;
        this.opacity46 = null;
        this.opacity47 = null;
        this.opacity48 = null;
        this.opacity49 = null;
        this.opacity50 = null;
        
        this.opacity50 = opacity50;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        this.fx7 = null;
        this.fx8 = null;
        this.fx9 = null;
        this.fx10 = null;
        this.fx11 = null;
        this.fx12 = null;
        this.fx13 = null;
        this.fx14 = null;
        this.fx15 = null;
        this.fx16 = null;
        this.fx17 = null;
        
        this.fx17 = fx17;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        this.fy7 = null;
        this.fy8 = null;
        this.fy9 = null;
        this.fy10 = null;
        this.fy11 = null;
        this.fy12 = null;
        this.fy13 = null;
        this.fy14 = null;
        this.fy15 = null;
        this.fy16 = null;
        this.fy17 = null;
        
        this.fy17 = fy17;
    }

    private Fill imageSettings15;
    private Stroke selectedElementStroke;
    private ColoredFill selectedElementStroke1;
    private String selectedElementStroke2;
    private Double thickness13;
    private String dashpattern13;
    private StrokeLineJoin lineJoin13;
    private StrokeLineCap lineCap13;

    public void setSelectedelementstroke(Stroke selectedElementStroke, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        this.selectedElementStroke = null;
        this.selectedElementStroke1 = null;
        this.selectedElementStroke2 = null;
        
        this.selectedElementStroke = selectedElementStroke;
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
        this.thickness12 = null;
        this.thickness13 = null;
        
        this.thickness13 = thickness13;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        this.dashpattern13 = null;
        
        this.dashpattern13 = dashpattern13;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        this.lineJoin13 = null;
        
        this.lineJoin13 = lineJoin13;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        this.lineCap13 = null;
        
        this.lineCap13 = lineCap13;
    }


    public void setSelectedelementstroke(ColoredFill selectedElementStroke1, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        this.selectedElementStroke = null;
        this.selectedElementStroke1 = null;
        this.selectedElementStroke2 = null;
        
        this.selectedElementStroke1 = selectedElementStroke1;
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
        this.thickness12 = null;
        this.thickness13 = null;
        
        this.thickness13 = thickness13;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        this.dashpattern13 = null;
        
        this.dashpattern13 = dashpattern13;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        this.lineJoin13 = null;
        
        this.lineJoin13 = lineJoin13;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        this.lineCap13 = null;
        
        this.lineCap13 = lineCap13;
    }


    public void setSelectedelementstroke(String selectedElementStroke2, Double thickness13, String dashpattern13, StrokeLineJoin lineJoin13, StrokeLineCap lineCap13) {
        this.selectedElementStroke = null;
        this.selectedElementStroke1 = null;
        this.selectedElementStroke2 = null;
        
        this.selectedElementStroke2 = selectedElementStroke2;
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
        this.thickness12 = null;
        this.thickness13 = null;
        
        this.thickness13 = thickness13;
        this.dashpattern = null;
        this.dashpattern1 = null;
        this.dashpattern2 = null;
        this.dashpattern3 = null;
        this.dashpattern4 = null;
        this.dashpattern5 = null;
        this.dashpattern6 = null;
        this.dashpattern7 = null;
        this.dashpattern8 = null;
        this.dashpattern9 = null;
        this.dashpattern10 = null;
        this.dashpattern11 = null;
        this.dashpattern12 = null;
        this.dashpattern13 = null;
        
        this.dashpattern13 = dashpattern13;
        this.lineJoin = null;
        this.lineJoin1 = null;
        this.lineJoin2 = null;
        this.lineJoin3 = null;
        this.lineJoin4 = null;
        this.lineJoin5 = null;
        this.lineJoin6 = null;
        this.lineJoin7 = null;
        this.lineJoin8 = null;
        this.lineJoin9 = null;
        this.lineJoin10 = null;
        this.lineJoin11 = null;
        this.lineJoin12 = null;
        this.lineJoin13 = null;
        
        this.lineJoin13 = lineJoin13;
        this.lineCap = null;
        this.lineCap1 = null;
        this.lineCap2 = null;
        this.lineCap3 = null;
        this.lineCap4 = null;
        this.lineCap5 = null;
        this.lineCap6 = null;
        this.lineCap7 = null;
        this.lineCap8 = null;
        this.lineCap9 = null;
        this.lineCap10 = null;
        this.lineCap11 = null;
        this.lineCap12 = null;
        this.lineCap13 = null;
        
        this.lineCap13 = lineCap13;
    }

    private Double index4;

    public void setTextmarker(Double index4) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        
        this.index4 = index4;
    }

    private Boolean textMarker;

    public void setTextmarker(Boolean textMarker) {
        this.textMarker = textMarker;
    }

    private Double index5;
    private Boolean textMarker1;
    private GanttDateTimeMarkers textMarker2;

    public void setTextmarker(Boolean textMarker1, Double index5) {
        this.textMarker = null;
        this.textMarker1 = null;
        this.textMarker2 = null;
        
        this.textMarker1 = textMarker1;
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        this.index5 = null;
        
        this.index5 = index5;
    }


    public void setTextmarker(GanttDateTimeMarkers textMarker2, Double index5) {
        this.textMarker = null;
        this.textMarker1 = null;
        this.textMarker2 = null;
        
        this.textMarker2 = textMarker2;
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        this.index5 = null;
        
        this.index5 = index5;
    }

    private Boolean tooltip;

    public void setTooltip(Boolean tooltip) {
        this.tooltip = tooltip;
    }

    private String generateJSbackgroundFill() {
        if (backgroundFill != null) {
            return String.format(Locale.US, "backgroundFill: %s,", (backgroundFill != null) ? backgroundFill.generateJs() : "null");
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

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaseFill() {
        if (baseFill != null) {
            return String.format(Locale.US, "baseFill: %s,", (baseFill != null) ? baseFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
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

    private String generateJSbaseStroke() {
        if (baseStroke != null) {
            return String.format(Locale.US, "baseStroke: %s,", (baseStroke != null) ? baseStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaseStroke1() {
        if (baseStroke1 != null) {
            return String.format(Locale.US, "baseStroke: %s,", (baseStroke1 != null) ? baseStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaseStroke2() {
        if (baseStroke2 != null) {
            return String.format(Locale.US, "baseStroke: %s,", baseStroke2);
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

    private String generateJSbaselineAbove() {
        if (baselineAbove != null) {
            return String.format(Locale.US, "baselineAbove: %b,", baselineAbove);
        }
        return "";
    }

    private String generateJSbaselineFill() {
        if (baselineFill != null) {
            return String.format(Locale.US, "baselineFill: %s,", (baselineFill != null) ? baselineFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
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

    private String generateJSbaselineStroke() {
        if (baselineStroke != null) {
            return String.format(Locale.US, "baselineStroke: %s,", (baselineStroke != null) ? baselineStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaselineStroke1() {
        if (baselineStroke1 != null) {
            return String.format(Locale.US, "baselineStroke: %s,", (baselineStroke1 != null) ? baselineStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaselineStroke2() {
        if (baselineStroke2 != null) {
            return String.format(Locale.US, "baselineStroke: %s,", baselineStroke2);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
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

    private String generateJScolumnStroke() {
        if (columnStroke != null) {
            return String.format(Locale.US, "columnStroke: %s,", (columnStroke != null) ? columnStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolumnStroke1() {
        if (columnStroke1 != null) {
            return String.format(Locale.US, "columnStroke: %s,", columnStroke1);
        }
        return "";
    }

    private String generateJSconnectorFill() {
        if (connectorFill != null) {
            return String.format(Locale.US, "connectorFill: %s,", (connectorFill != null) ? connectorFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconnectorFill1() {
        if (connectorFill1 != null) {
            return String.format(Locale.US, "connectorFill: %s,", arrayToString(connectorFill1));
        }
        return "";
    }

    private String generateJSconnectorFill2() {
        if (connectorFill2 != null) {
            return String.format(Locale.US, "connectorFill: %s,", Arrays.toString(connectorFill2));
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

    private String generateJSopacityOrMode() {
        if (opacityOrMode != null) {
            return String.format(Locale.US, "opacityOrMode: %s,", (opacityOrMode != null) ? opacityOrMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity9() {
        if (opacity9 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity9);
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

    private String generateJSconnectorPreviewStroke() {
        if (connectorPreviewStroke != null) {
            return String.format(Locale.US, "connectorPreviewStroke: %s,", (connectorPreviewStroke != null) ? connectorPreviewStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconnectorPreviewStroke1() {
        if (connectorPreviewStroke1 != null) {
            return String.format(Locale.US, "connectorPreviewStroke: %s,", (connectorPreviewStroke1 != null) ? connectorPreviewStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconnectorPreviewStroke2() {
        if (connectorPreviewStroke2 != null) {
            return String.format(Locale.US, "connectorPreviewStroke: %s,", connectorPreviewStroke2);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
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

    private String generateJSconnectorStroke() {
        if (connectorStroke != null) {
            return String.format(Locale.US, "connectorStroke: %s,", (connectorStroke != null) ? connectorStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconnectorStroke1() {
        if (connectorStroke1 != null) {
            return String.format(Locale.US, "connectorStroke: %s,", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconnectorStroke2() {
        if (connectorStroke2 != null) {
            return String.format(Locale.US, "connectorStroke: %s,", connectorStroke2);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern3);
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

    private String generateJSdefaultRowHeight() {
        if (defaultRowHeight != null) {
            return String.format(Locale.US, "defaultRowHeight: %f,", defaultRowHeight);
        }
        return "";
    }

    private String generateJSeditConnectorThumbFill() {
        if (editConnectorThumbFill != null) {
            return String.format(Locale.US, "editConnectorThumbFill: %s,", (editConnectorThumbFill != null) ? editConnectorThumbFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSopacity10() {
        if (opacity10 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity10);
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

    private String generateJSopacity11() {
        if (opacity11 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity11);
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

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity12() {
        if (opacity12 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity12);
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

    private String generateJSimageSettings3() {
        if (imageSettings3 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings3 != null) ? imageSettings3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditConnectorThumbStroke() {
        if (editConnectorThumbStroke != null) {
            return String.format(Locale.US, "editConnectorThumbStroke: %s,", (editConnectorThumbStroke != null) ? editConnectorThumbStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditConnectorThumbStroke1() {
        if (editConnectorThumbStroke1 != null) {
            return String.format(Locale.US, "editConnectorThumbStroke: %s,", (editConnectorThumbStroke1 != null) ? editConnectorThumbStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditConnectorThumbStroke2() {
        if (editConnectorThumbStroke2 != null) {
            return String.format(Locale.US, "editConnectorThumbStroke: %s,", editConnectorThumbStroke2);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSdashpattern4() {
        if (dashpattern4 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern4);
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

    private String generateJSeditIntervalThumbFill() {
        if (editIntervalThumbFill != null) {
            return String.format(Locale.US, "editIntervalThumbFill: %s,", (editIntervalThumbFill != null) ? editIntervalThumbFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSopacity13() {
        if (opacity13 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity13);
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

    private String generateJSopacity14() {
        if (opacity14 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity14);
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

    private String generateJSmode14() {
        if (mode14 != null) {
            return String.format(Locale.US, "mode: %s,", (mode14 != null) ? mode14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity15() {
        if (opacity15 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity15);
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

    private String generateJSimageSettings4() {
        if (imageSettings4 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings4 != null) ? imageSettings4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditIntervalThumbStroke() {
        if (editIntervalThumbStroke != null) {
            return String.format(Locale.US, "editIntervalThumbStroke: %s,", (editIntervalThumbStroke != null) ? editIntervalThumbStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditIntervalThumbStroke1() {
        if (editIntervalThumbStroke1 != null) {
            return String.format(Locale.US, "editIntervalThumbStroke: %s,", (editIntervalThumbStroke1 != null) ? editIntervalThumbStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditIntervalThumbStroke2() {
        if (editIntervalThumbStroke2 != null) {
            return String.format(Locale.US, "editIntervalThumbStroke: %s,", editIntervalThumbStroke2);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSdashpattern5() {
        if (dashpattern5 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern5);
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

    private String generateJSeditPreviewFill() {
        if (editPreviewFill != null) {
            return String.format(Locale.US, "editPreviewFill: %s,", (editPreviewFill != null) ? editPreviewFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", color5);
        }
        return "";
    }

    private String generateJSopacity16() {
        if (opacity16 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity16);
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

    private String generateJSopacity17() {
        if (opacity17 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity17);
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

    private String generateJScx6() {
        if (cx6 != null) {
            return String.format(Locale.US, "cx: %f,", cx6);
        }
        return "";
    }

    private String generateJScy6() {
        if (cy6 != null) {
            return String.format(Locale.US, "cy: %f,", cy6);
        }
        return "";
    }

    private String generateJSmode17() {
        if (mode17 != null) {
            return String.format(Locale.US, "mode: %s,", (mode17 != null) ? mode17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity18() {
        if (opacity18 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity18);
        }
        return "";
    }

    private String generateJSfx6() {
        if (fx6 != null) {
            return String.format(Locale.US, "fx: %f,", fx6);
        }
        return "";
    }

    private String generateJSfy6() {
        if (fy6 != null) {
            return String.format(Locale.US, "fy: %f,", fy6);
        }
        return "";
    }

    private String generateJSimageSettings5() {
        if (imageSettings5 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings5 != null) ? imageSettings5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditPreviewStroke() {
        if (editPreviewStroke != null) {
            return String.format(Locale.US, "editPreviewStroke: %s,", (editPreviewStroke != null) ? editPreviewStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditPreviewStroke1() {
        if (editPreviewStroke1 != null) {
            return String.format(Locale.US, "editPreviewStroke: %s,", (editPreviewStroke1 != null) ? editPreviewStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditPreviewStroke2() {
        if (editPreviewStroke2 != null) {
            return String.format(Locale.US, "editPreviewStroke: %s,", editPreviewStroke2);
        }
        return "";
    }

    private String generateJSthickness6() {
        if (thickness6 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness6);
        }
        return "";
    }

    private String generateJSdashpattern6() {
        if (dashpattern6 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern6);
        }
        return "";
    }

    private String generateJSlineJoin6() {
        if (lineJoin6 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin6 != null) ? lineJoin6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap6() {
        if (lineCap6 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap6 != null) ? lineCap6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditProgressFill() {
        if (editProgressFill != null) {
            return String.format(Locale.US, "editProgressFill: %s,", (editProgressFill != null) ? editProgressFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", color6);
        }
        return "";
    }

    private String generateJSopacity19() {
        if (opacity19 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity19);
        }
        return "";
    }

    private String generateJSkeys24() {
        if (keys24 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys24));
        }
        return "";
    }

    private String generateJSkeys25() {
        if (keys25 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys25));
        }
        return "";
    }

    private String generateJSangle6() {
        if (angle6 != null) {
            return String.format(Locale.US, "angle: %f,", angle6);
        }
        return "";
    }

    private String generateJSmode18() {
        if (mode18 != null) {
            return String.format(Locale.US, "mode: %b,", mode18);
        }
        return "";
    }

    private String generateJSmode19() {
        if (mode19 != null) {
            return String.format(Locale.US, "mode: %s,", (mode19 != null) ? mode19.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity20() {
        if (opacity20 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity20);
        }
        return "";
    }

    private String generateJSkeys26() {
        if (keys26 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys26));
        }
        return "";
    }

    private String generateJSkeys27() {
        if (keys27 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys27));
        }
        return "";
    }

    private String generateJScx7() {
        if (cx7 != null) {
            return String.format(Locale.US, "cx: %f,", cx7);
        }
        return "";
    }

    private String generateJScy7() {
        if (cy7 != null) {
            return String.format(Locale.US, "cy: %f,", cy7);
        }
        return "";
    }

    private String generateJSmode20() {
        if (mode20 != null) {
            return String.format(Locale.US, "mode: %s,", (mode20 != null) ? mode20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity21() {
        if (opacity21 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity21);
        }
        return "";
    }

    private String generateJSfx7() {
        if (fx7 != null) {
            return String.format(Locale.US, "fx: %f,", fx7);
        }
        return "";
    }

    private String generateJSfy7() {
        if (fy7 != null) {
            return String.format(Locale.US, "fy: %f,", fy7);
        }
        return "";
    }

    private String generateJSimageSettings6() {
        if (imageSettings6 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings6 != null) ? imageSettings6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditProgressStroke() {
        if (editProgressStroke != null) {
            return String.format(Locale.US, "editProgressStroke: %s,", (editProgressStroke != null) ? editProgressStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditProgressStroke1() {
        if (editProgressStroke1 != null) {
            return String.format(Locale.US, "editProgressStroke: %s,", (editProgressStroke1 != null) ? editProgressStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditProgressStroke2() {
        if (editProgressStroke2 != null) {
            return String.format(Locale.US, "editProgressStroke: %s,", editProgressStroke2);
        }
        return "";
    }

    private String generateJSthickness7() {
        if (thickness7 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness7);
        }
        return "";
    }

    private String generateJSdashpattern7() {
        if (dashpattern7 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern7);
        }
        return "";
    }

    private String generateJSlineJoin7() {
        if (lineJoin7 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin7 != null) ? lineJoin7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap7() {
        if (lineCap7 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap7 != null) ? lineCap7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewDashStroke() {
        if (editStructurePreviewDashStroke != null) {
            return String.format(Locale.US, "editStructurePreviewDashStroke: %s,", (editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewDashStroke1() {
        if (editStructurePreviewDashStroke1 != null) {
            return String.format(Locale.US, "editStructurePreviewDashStroke: %s,", (editStructurePreviewDashStroke1 != null) ? editStructurePreviewDashStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewDashStroke2() {
        if (editStructurePreviewDashStroke2 != null) {
            return String.format(Locale.US, "editStructurePreviewDashStroke: %s,", editStructurePreviewDashStroke2);
        }
        return "";
    }

    private String generateJSthickness8() {
        if (thickness8 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness8);
        }
        return "";
    }

    private String generateJSdashpattern8() {
        if (dashpattern8 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern8);
        }
        return "";
    }

    private String generateJSlineJoin8() {
        if (lineJoin8 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin8 != null) ? lineJoin8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap8() {
        if (lineCap8 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap8 != null) ? lineCap8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewFill() {
        if (editStructurePreviewFill != null) {
            return String.format(Locale.US, "editStructurePreviewFill: %s,", (editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", color7);
        }
        return "";
    }

    private String generateJSopacity22() {
        if (opacity22 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity22);
        }
        return "";
    }

    private String generateJSkeys28() {
        if (keys28 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys28));
        }
        return "";
    }

    private String generateJSkeys29() {
        if (keys29 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys29));
        }
        return "";
    }

    private String generateJSangle7() {
        if (angle7 != null) {
            return String.format(Locale.US, "angle: %f,", angle7);
        }
        return "";
    }

    private String generateJSmode21() {
        if (mode21 != null) {
            return String.format(Locale.US, "mode: %b,", mode21);
        }
        return "";
    }

    private String generateJSmode22() {
        if (mode22 != null) {
            return String.format(Locale.US, "mode: %s,", (mode22 != null) ? mode22.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity23() {
        if (opacity23 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity23);
        }
        return "";
    }

    private String generateJSkeys30() {
        if (keys30 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys30));
        }
        return "";
    }

    private String generateJSkeys31() {
        if (keys31 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys31));
        }
        return "";
    }

    private String generateJScx8() {
        if (cx8 != null) {
            return String.format(Locale.US, "cx: %f,", cx8);
        }
        return "";
    }

    private String generateJScy8() {
        if (cy8 != null) {
            return String.format(Locale.US, "cy: %f,", cy8);
        }
        return "";
    }

    private String generateJSmode23() {
        if (mode23 != null) {
            return String.format(Locale.US, "mode: %s,", (mode23 != null) ? mode23.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity24() {
        if (opacity24 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity24);
        }
        return "";
    }

    private String generateJSfx8() {
        if (fx8 != null) {
            return String.format(Locale.US, "fx: %f,", fx8);
        }
        return "";
    }

    private String generateJSfy8() {
        if (fy8 != null) {
            return String.format(Locale.US, "fy: %f,", fy8);
        }
        return "";
    }

    private String generateJSimageSettings7() {
        if (imageSettings7 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings7 != null) ? imageSettings7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewStroke() {
        if (editStructurePreviewStroke != null) {
            return String.format(Locale.US, "editStructurePreviewStroke: %s,", (editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewStroke1() {
        if (editStructurePreviewStroke1 != null) {
            return String.format(Locale.US, "editStructurePreviewStroke: %s,", (editStructurePreviewStroke1 != null) ? editStructurePreviewStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewStroke2() {
        if (editStructurePreviewStroke2 != null) {
            return String.format(Locale.US, "editStructurePreviewStroke: %s,", editStructurePreviewStroke2);
        }
        return "";
    }

    private String generateJSthickness9() {
        if (thickness9 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness9);
        }
        return "";
    }

    private String generateJSdashpattern9() {
        if (dashpattern9 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern9);
        }
        return "";
    }

    private String generateJSlineJoin9() {
        if (lineJoin9 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin9 != null) ? lineJoin9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap9() {
        if (lineCap9 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap9 != null) ? lineCap9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSediting() {
        if (editing != null) {
            return String.format(Locale.US, "editing: %b,", editing);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSlineMarker() {
        if (lineMarker != null) {
            return String.format(Locale.US, "lineMarker: %b,", lineMarker);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSlineMarker1() {
        if (lineMarker1 != null) {
            return String.format(Locale.US, "lineMarker: %b,", lineMarker1);
        }
        return "";
    }

    private String generateJSlineMarker2() {
        if (lineMarker2 != null) {
            return String.format(Locale.US, "lineMarker: %s,", (lineMarker2 != null) ? lineMarker2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmilestoneFill() {
        if (milestoneFill != null) {
            return String.format(Locale.US, "milestoneFill: %s,", (milestoneFill != null) ? milestoneFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", color8);
        }
        return "";
    }

    private String generateJSopacity25() {
        if (opacity25 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity25);
        }
        return "";
    }

    private String generateJSkeys32() {
        if (keys32 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys32));
        }
        return "";
    }

    private String generateJSkeys33() {
        if (keys33 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys33));
        }
        return "";
    }

    private String generateJSangle8() {
        if (angle8 != null) {
            return String.format(Locale.US, "angle: %f,", angle8);
        }
        return "";
    }

    private String generateJSmode24() {
        if (mode24 != null) {
            return String.format(Locale.US, "mode: %b,", mode24);
        }
        return "";
    }

    private String generateJSmode25() {
        if (mode25 != null) {
            return String.format(Locale.US, "mode: %s,", (mode25 != null) ? mode25.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity26() {
        if (opacity26 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity26);
        }
        return "";
    }

    private String generateJSkeys34() {
        if (keys34 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys34));
        }
        return "";
    }

    private String generateJSkeys35() {
        if (keys35 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys35));
        }
        return "";
    }

    private String generateJScx9() {
        if (cx9 != null) {
            return String.format(Locale.US, "cx: %f,", cx9);
        }
        return "";
    }

    private String generateJScy9() {
        if (cy9 != null) {
            return String.format(Locale.US, "cy: %f,", cy9);
        }
        return "";
    }

    private String generateJSmode26() {
        if (mode26 != null) {
            return String.format(Locale.US, "mode: %s,", (mode26 != null) ? mode26.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity27() {
        if (opacity27 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity27);
        }
        return "";
    }

    private String generateJSfx9() {
        if (fx9 != null) {
            return String.format(Locale.US, "fx: %f,", fx9);
        }
        return "";
    }

    private String generateJSfy9() {
        if (fy9 != null) {
            return String.format(Locale.US, "fy: %f,", fy9);
        }
        return "";
    }

    private String generateJSimageSettings8() {
        if (imageSettings8 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings8 != null) ? imageSettings8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmilestoneStroke() {
        if (milestoneStroke != null) {
            return String.format(Locale.US, "milestoneStroke: %s,", (milestoneStroke != null) ? milestoneStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmilestoneStroke1() {
        if (milestoneStroke1 != null) {
            return String.format(Locale.US, "milestoneStroke: %s,", (milestoneStroke1 != null) ? milestoneStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmilestoneStroke2() {
        if (milestoneStroke2 != null) {
            return String.format(Locale.US, "milestoneStroke: %s,", milestoneStroke2);
        }
        return "";
    }

    private String generateJSthickness10() {
        if (thickness10 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness10);
        }
        return "";
    }

    private String generateJSdashpattern10() {
        if (dashpattern10 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern10);
        }
        return "";
    }

    private String generateJSlineJoin10() {
        if (lineJoin10 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin10 != null) ? lineJoin10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap10() {
        if (lineCap10 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap10 != null) ? lineCap10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentFill() {
        if (parentFill != null) {
            return String.format(Locale.US, "parentFill: %s,", (parentFill != null) ? parentFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", color9);
        }
        return "";
    }

    private String generateJSopacity28() {
        if (opacity28 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity28);
        }
        return "";
    }

    private String generateJSkeys36() {
        if (keys36 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys36));
        }
        return "";
    }

    private String generateJSkeys37() {
        if (keys37 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys37));
        }
        return "";
    }

    private String generateJSangle9() {
        if (angle9 != null) {
            return String.format(Locale.US, "angle: %f,", angle9);
        }
        return "";
    }

    private String generateJSmode27() {
        if (mode27 != null) {
            return String.format(Locale.US, "mode: %b,", mode27);
        }
        return "";
    }

    private String generateJSmode28() {
        if (mode28 != null) {
            return String.format(Locale.US, "mode: %s,", (mode28 != null) ? mode28.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity29() {
        if (opacity29 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity29);
        }
        return "";
    }

    private String generateJSkeys38() {
        if (keys38 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys38));
        }
        return "";
    }

    private String generateJSkeys39() {
        if (keys39 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys39));
        }
        return "";
    }

    private String generateJScx10() {
        if (cx10 != null) {
            return String.format(Locale.US, "cx: %f,", cx10);
        }
        return "";
    }

    private String generateJScy10() {
        if (cy10 != null) {
            return String.format(Locale.US, "cy: %f,", cy10);
        }
        return "";
    }

    private String generateJSmode29() {
        if (mode29 != null) {
            return String.format(Locale.US, "mode: %s,", (mode29 != null) ? mode29.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity30() {
        if (opacity30 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity30);
        }
        return "";
    }

    private String generateJSfx10() {
        if (fx10 != null) {
            return String.format(Locale.US, "fx: %f,", fx10);
        }
        return "";
    }

    private String generateJSfy10() {
        if (fy10 != null) {
            return String.format(Locale.US, "fy: %f,", fy10);
        }
        return "";
    }

    private String generateJSimageSettings9() {
        if (imageSettings9 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings9 != null) ? imageSettings9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentStroke() {
        if (parentStroke != null) {
            return String.format(Locale.US, "parentStroke: %s,", (parentStroke != null) ? parentStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentStroke1() {
        if (parentStroke1 != null) {
            return String.format(Locale.US, "parentStroke: %s,", (parentStroke1 != null) ? parentStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentStroke2() {
        if (parentStroke2 != null) {
            return String.format(Locale.US, "parentStroke: %s,", parentStroke2);
        }
        return "";
    }

    private String generateJSthickness11() {
        if (thickness11 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness11);
        }
        return "";
    }

    private String generateJSdashpattern11() {
        if (dashpattern11 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern11);
        }
        return "";
    }

    private String generateJSlineJoin11() {
        if (lineJoin11 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin11 != null) ? lineJoin11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap11() {
        if (lineCap11 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap11 != null) ? lineCap11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSprogressFill() {
        if (progressFill != null) {
            return String.format(Locale.US, "progressFill: %s,", (progressFill != null) ? progressFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", color10);
        }
        return "";
    }

    private String generateJSopacity31() {
        if (opacity31 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity31);
        }
        return "";
    }

    private String generateJSkeys40() {
        if (keys40 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys40));
        }
        return "";
    }

    private String generateJSkeys41() {
        if (keys41 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys41));
        }
        return "";
    }

    private String generateJSangle10() {
        if (angle10 != null) {
            return String.format(Locale.US, "angle: %f,", angle10);
        }
        return "";
    }

    private String generateJSmode30() {
        if (mode30 != null) {
            return String.format(Locale.US, "mode: %b,", mode30);
        }
        return "";
    }

    private String generateJSmode31() {
        if (mode31 != null) {
            return String.format(Locale.US, "mode: %s,", (mode31 != null) ? mode31.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity32() {
        if (opacity32 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity32);
        }
        return "";
    }

    private String generateJSkeys42() {
        if (keys42 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys42));
        }
        return "";
    }

    private String generateJSkeys43() {
        if (keys43 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys43));
        }
        return "";
    }

    private String generateJScx11() {
        if (cx11 != null) {
            return String.format(Locale.US, "cx: %f,", cx11);
        }
        return "";
    }

    private String generateJScy11() {
        if (cy11 != null) {
            return String.format(Locale.US, "cy: %f,", cy11);
        }
        return "";
    }

    private String generateJSmode32() {
        if (mode32 != null) {
            return String.format(Locale.US, "mode: %s,", (mode32 != null) ? mode32.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity33() {
        if (opacity33 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity33);
        }
        return "";
    }

    private String generateJSfx11() {
        if (fx11 != null) {
            return String.format(Locale.US, "fx: %f,", fx11);
        }
        return "";
    }

    private String generateJSfy11() {
        if (fy11 != null) {
            return String.format(Locale.US, "fy: %f,", fy11);
        }
        return "";
    }

    private String generateJSimageSettings10() {
        if (imageSettings10 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings10 != null) ? imageSettings10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSprogressStroke() {
        if (progressStroke != null) {
            return String.format(Locale.US, "progressStroke: %s,", (progressStroke != null) ? progressStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSprogressStroke1() {
        if (progressStroke1 != null) {
            return String.format(Locale.US, "progressStroke: %s,", (progressStroke1 != null) ? progressStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSprogressStroke2() {
        if (progressStroke2 != null) {
            return String.format(Locale.US, "progressStroke: %s,", progressStroke2);
        }
        return "";
    }

    private String generateJSthickness12() {
        if (thickness12 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness12);
        }
        return "";
    }

    private String generateJSdashpattern12() {
        if (dashpattern12 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern12);
        }
        return "";
    }

    private String generateJSlineJoin12() {
        if (lineJoin12 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin12 != null) ? lineJoin12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap12() {
        if (lineCap12 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap12 != null) ? lineCap12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSrangeMarker() {
        if (rangeMarker != null) {
            return String.format(Locale.US, "rangeMarker: %b,", rangeMarker);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSrangeMarker1() {
        if (rangeMarker1 != null) {
            return String.format(Locale.US, "rangeMarker: %b,", rangeMarker1);
        }
        return "";
    }

    private String generateJSrangeMarker2() {
        if (rangeMarker2 != null) {
            return String.format(Locale.US, "rangeMarker: %s,", (rangeMarker2 != null) ? rangeMarker2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowEvenFill() {
        if (rowEvenFill != null) {
            return String.format(Locale.US, "rowEvenFill: %s,", (rowEvenFill != null) ? rowEvenFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", color11);
        }
        return "";
    }

    private String generateJSopacity34() {
        if (opacity34 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity34);
        }
        return "";
    }

    private String generateJSkeys44() {
        if (keys44 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys44));
        }
        return "";
    }

    private String generateJSkeys45() {
        if (keys45 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys45));
        }
        return "";
    }

    private String generateJSangle11() {
        if (angle11 != null) {
            return String.format(Locale.US, "angle: %f,", angle11);
        }
        return "";
    }

    private String generateJSmode33() {
        if (mode33 != null) {
            return String.format(Locale.US, "mode: %b,", mode33);
        }
        return "";
    }

    private String generateJSmode34() {
        if (mode34 != null) {
            return String.format(Locale.US, "mode: %s,", (mode34 != null) ? mode34.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity35() {
        if (opacity35 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity35);
        }
        return "";
    }

    private String generateJSkeys46() {
        if (keys46 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys46));
        }
        return "";
    }

    private String generateJSkeys47() {
        if (keys47 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys47));
        }
        return "";
    }

    private String generateJScx12() {
        if (cx12 != null) {
            return String.format(Locale.US, "cx: %f,", cx12);
        }
        return "";
    }

    private String generateJScy12() {
        if (cy12 != null) {
            return String.format(Locale.US, "cy: %f,", cy12);
        }
        return "";
    }

    private String generateJSmode35() {
        if (mode35 != null) {
            return String.format(Locale.US, "mode: %s,", (mode35 != null) ? mode35.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity36() {
        if (opacity36 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity36);
        }
        return "";
    }

    private String generateJSfx12() {
        if (fx12 != null) {
            return String.format(Locale.US, "fx: %f,", fx12);
        }
        return "";
    }

    private String generateJSfy12() {
        if (fy12 != null) {
            return String.format(Locale.US, "fy: %f,", fy12);
        }
        return "";
    }

    private String generateJSimageSettings11() {
        if (imageSettings11 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings11 != null) ? imageSettings11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowFill() {
        if (rowFill != null) {
            return String.format(Locale.US, "rowFill: %s,", (rowFill != null) ? rowFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", color12);
        }
        return "";
    }

    private String generateJSopacity37() {
        if (opacity37 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity37);
        }
        return "";
    }

    private String generateJSkeys48() {
        if (keys48 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys48));
        }
        return "";
    }

    private String generateJSkeys49() {
        if (keys49 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys49));
        }
        return "";
    }

    private String generateJSangle12() {
        if (angle12 != null) {
            return String.format(Locale.US, "angle: %f,", angle12);
        }
        return "";
    }

    private String generateJSmode36() {
        if (mode36 != null) {
            return String.format(Locale.US, "mode: %b,", mode36);
        }
        return "";
    }

    private String generateJSmode37() {
        if (mode37 != null) {
            return String.format(Locale.US, "mode: %s,", (mode37 != null) ? mode37.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity38() {
        if (opacity38 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity38);
        }
        return "";
    }

    private String generateJSkeys50() {
        if (keys50 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys50));
        }
        return "";
    }

    private String generateJSkeys51() {
        if (keys51 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys51));
        }
        return "";
    }

    private String generateJScx13() {
        if (cx13 != null) {
            return String.format(Locale.US, "cx: %f,", cx13);
        }
        return "";
    }

    private String generateJScy13() {
        if (cy13 != null) {
            return String.format(Locale.US, "cy: %f,", cy13);
        }
        return "";
    }

    private String generateJSmode38() {
        if (mode38 != null) {
            return String.format(Locale.US, "mode: %s,", (mode38 != null) ? mode38.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity39() {
        if (opacity39 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity39);
        }
        return "";
    }

    private String generateJSfx13() {
        if (fx13 != null) {
            return String.format(Locale.US, "fx: %f,", fx13);
        }
        return "";
    }

    private String generateJSfy13() {
        if (fy13 != null) {
            return String.format(Locale.US, "fy: %f,", fy13);
        }
        return "";
    }

    private String generateJSimageSettings12() {
        if (imageSettings12 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings12 != null) ? imageSettings12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowHoverFill() {
        if (rowHoverFill != null) {
            return String.format(Locale.US, "rowHoverFill: %s,", (rowHoverFill != null) ? rowHoverFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor13() {
        if (color13 != null) {
            return String.format(Locale.US, "color: %s,", color13);
        }
        return "";
    }

    private String generateJSopacity40() {
        if (opacity40 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity40);
        }
        return "";
    }

    private String generateJSkeys52() {
        if (keys52 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys52));
        }
        return "";
    }

    private String generateJSkeys53() {
        if (keys53 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys53));
        }
        return "";
    }

    private String generateJSangle13() {
        if (angle13 != null) {
            return String.format(Locale.US, "angle: %f,", angle13);
        }
        return "";
    }

    private String generateJSmode39() {
        if (mode39 != null) {
            return String.format(Locale.US, "mode: %b,", mode39);
        }
        return "";
    }

    private String generateJSmode40() {
        if (mode40 != null) {
            return String.format(Locale.US, "mode: %s,", (mode40 != null) ? mode40.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity41() {
        if (opacity41 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity41);
        }
        return "";
    }

    private String generateJSkeys54() {
        if (keys54 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys54));
        }
        return "";
    }

    private String generateJSkeys55() {
        if (keys55 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys55));
        }
        return "";
    }

    private String generateJScx14() {
        if (cx14 != null) {
            return String.format(Locale.US, "cx: %f,", cx14);
        }
        return "";
    }

    private String generateJScy14() {
        if (cy14 != null) {
            return String.format(Locale.US, "cy: %f,", cy14);
        }
        return "";
    }

    private String generateJSmode41() {
        if (mode41 != null) {
            return String.format(Locale.US, "mode: %s,", (mode41 != null) ? mode41.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity42() {
        if (opacity42 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity42);
        }
        return "";
    }

    private String generateJSfx14() {
        if (fx14 != null) {
            return String.format(Locale.US, "fx: %f,", fx14);
        }
        return "";
    }

    private String generateJSfy14() {
        if (fy14 != null) {
            return String.format(Locale.US, "fy: %f,", fy14);
        }
        return "";
    }

    private String generateJSrowOddFill() {
        if (rowOddFill != null) {
            return String.format(Locale.US, "rowOddFill: %s,", (rowOddFill != null) ? rowOddFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor14() {
        if (color14 != null) {
            return String.format(Locale.US, "color: %s,", color14);
        }
        return "";
    }

    private String generateJSopacity43() {
        if (opacity43 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity43);
        }
        return "";
    }

    private String generateJSkeys56() {
        if (keys56 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys56));
        }
        return "";
    }

    private String generateJSkeys57() {
        if (keys57 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys57));
        }
        return "";
    }

    private String generateJSangle14() {
        if (angle14 != null) {
            return String.format(Locale.US, "angle: %f,", angle14);
        }
        return "";
    }

    private String generateJSmode42() {
        if (mode42 != null) {
            return String.format(Locale.US, "mode: %b,", mode42);
        }
        return "";
    }

    private String generateJSmode43() {
        if (mode43 != null) {
            return String.format(Locale.US, "mode: %s,", (mode43 != null) ? mode43.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity44() {
        if (opacity44 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity44);
        }
        return "";
    }

    private String generateJSkeys58() {
        if (keys58 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys58));
        }
        return "";
    }

    private String generateJSkeys59() {
        if (keys59 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys59));
        }
        return "";
    }

    private String generateJScx15() {
        if (cx15 != null) {
            return String.format(Locale.US, "cx: %f,", cx15);
        }
        return "";
    }

    private String generateJScy15() {
        if (cy15 != null) {
            return String.format(Locale.US, "cy: %f,", cy15);
        }
        return "";
    }

    private String generateJSmode44() {
        if (mode44 != null) {
            return String.format(Locale.US, "mode: %s,", (mode44 != null) ? mode44.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity45() {
        if (opacity45 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity45);
        }
        return "";
    }

    private String generateJSfx15() {
        if (fx15 != null) {
            return String.format(Locale.US, "fx: %f,", fx15);
        }
        return "";
    }

    private String generateJSfy15() {
        if (fy15 != null) {
            return String.format(Locale.US, "fy: %f,", fy15);
        }
        return "";
    }

    private String generateJSimageSettings13() {
        if (imageSettings13 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings13 != null) ? imageSettings13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowSelectedFill() {
        if (rowSelectedFill != null) {
            return String.format(Locale.US, "rowSelectedFill: %s,", (rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor15() {
        if (color15 != null) {
            return String.format(Locale.US, "color: %s,", color15);
        }
        return "";
    }

    private String generateJSopacity46() {
        if (opacity46 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity46);
        }
        return "";
    }

    private String generateJSkeys60() {
        if (keys60 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys60));
        }
        return "";
    }

    private String generateJSkeys61() {
        if (keys61 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys61));
        }
        return "";
    }

    private String generateJSangle15() {
        if (angle15 != null) {
            return String.format(Locale.US, "angle: %f,", angle15);
        }
        return "";
    }

    private String generateJSmode45() {
        if (mode45 != null) {
            return String.format(Locale.US, "mode: %b,", mode45);
        }
        return "";
    }

    private String generateJSmode46() {
        if (mode46 != null) {
            return String.format(Locale.US, "mode: %s,", (mode46 != null) ? mode46.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkeys62() {
        if (keys62 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys62));
        }
        return "";
    }

    private String generateJSkeys63() {
        if (keys63 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys63));
        }
        return "";
    }

    private String generateJScx16() {
        if (cx16 != null) {
            return String.format(Locale.US, "cx: %f,", cx16);
        }
        return "";
    }

    private String generateJScy16() {
        if (cy16 != null) {
            return String.format(Locale.US, "cy: %f,", cy16);
        }
        return "";
    }

    private String generateJSmode47() {
        if (mode47 != null) {
            return String.format(Locale.US, "mode: %s,", (mode47 != null) ? mode47.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity47() {
        if (opacity47 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity47);
        }
        return "";
    }

    private String generateJSfx16() {
        if (fx16 != null) {
            return String.format(Locale.US, "fx: %f,", fx16);
        }
        return "";
    }

    private String generateJSfy16() {
        if (fy16 != null) {
            return String.format(Locale.US, "fy: %f,", fy16);
        }
        return "";
    }

    private String generateJSimageSettings14() {
        if (imageSettings14 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings14 != null) ? imageSettings14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectedElementFill() {
        if (selectedElementFill != null) {
            return String.format(Locale.US, "selectedElementFill: %s,", (selectedElementFill != null) ? selectedElementFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor16() {
        if (color16 != null) {
            return String.format(Locale.US, "color: %s,", color16);
        }
        return "";
    }

    private String generateJSopacity48() {
        if (opacity48 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity48);
        }
        return "";
    }

    private String generateJSkeys64() {
        if (keys64 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys64));
        }
        return "";
    }

    private String generateJSkeys65() {
        if (keys65 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys65));
        }
        return "";
    }

    private String generateJSangle16() {
        if (angle16 != null) {
            return String.format(Locale.US, "angle: %f,", angle16);
        }
        return "";
    }

    private String generateJSmode48() {
        if (mode48 != null) {
            return String.format(Locale.US, "mode: %b,", mode48);
        }
        return "";
    }

    private String generateJSmode49() {
        if (mode49 != null) {
            return String.format(Locale.US, "mode: %s,", (mode49 != null) ? mode49.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity49() {
        if (opacity49 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity49);
        }
        return "";
    }

    private String generateJSkeys66() {
        if (keys66 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys66));
        }
        return "";
    }

    private String generateJSkeys67() {
        if (keys67 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys67));
        }
        return "";
    }

    private String generateJScx17() {
        if (cx17 != null) {
            return String.format(Locale.US, "cx: %f,", cx17);
        }
        return "";
    }

    private String generateJScy17() {
        if (cy17 != null) {
            return String.format(Locale.US, "cy: %f,", cy17);
        }
        return "";
    }

    private String generateJSmode50() {
        if (mode50 != null) {
            return String.format(Locale.US, "mode: %s,", (mode50 != null) ? mode50.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity50() {
        if (opacity50 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity50);
        }
        return "";
    }

    private String generateJSfx17() {
        if (fx17 != null) {
            return String.format(Locale.US, "fx: %f,", fx17);
        }
        return "";
    }

    private String generateJSfy17() {
        if (fy17 != null) {
            return String.format(Locale.US, "fy: %f,", fy17);
        }
        return "";
    }

    private String generateJSimageSettings15() {
        if (imageSettings15 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings15 != null) ? imageSettings15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectedElementStroke() {
        if (selectedElementStroke != null) {
            return String.format(Locale.US, "selectedElementStroke: %s,", (selectedElementStroke != null) ? selectedElementStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectedElementStroke1() {
        if (selectedElementStroke1 != null) {
            return String.format(Locale.US, "selectedElementStroke: %s,", (selectedElementStroke1 != null) ? selectedElementStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectedElementStroke2() {
        if (selectedElementStroke2 != null) {
            return String.format(Locale.US, "selectedElementStroke: %s,", selectedElementStroke2);
        }
        return "";
    }

    private String generateJSthickness13() {
        if (thickness13 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness13);
        }
        return "";
    }

    private String generateJSdashpattern13() {
        if (dashpattern13 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern13);
        }
        return "";
    }

    private String generateJSlineJoin13() {
        if (lineJoin13 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin13 != null) ? lineJoin13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap13() {
        if (lineCap13 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap13 != null) ? lineCap13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJStextMarker() {
        if (textMarker != null) {
            return String.format(Locale.US, "textMarker: %b,", textMarker);
        }
        return "";
    }

    private String generateJSindex5() {
        if (index5 != null) {
            return String.format(Locale.US, "index: %f,", index5);
        }
        return "";
    }

    private String generateJStextMarker1() {
        if (textMarker1 != null) {
            return String.format(Locale.US, "textMarker: %b,", textMarker1);
        }
        return "";
    }

    private String generateJStextMarker2() {
        if (textMarker2 != null) {
            return String.format(Locale.US, "textMarker: %s,", (textMarker2 != null) ? textMarker2.generateJs() : "null");
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSbackgroundFill());
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
        js.append(generateJSbaseFill());
        js.append(generateJScolor1());
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
        js.append(generateJSbaseStroke());
        js.append(generateJSbaseStroke1());
        js.append(generateJSbaseStroke2());
        js.append(generateJSthickness());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJSbaselineAbove());
        js.append(generateJSbaselineFill());
        js.append(generateJScolor2());
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
        js.append(generateJSbaselineStroke());
        js.append(generateJSbaselineStroke1());
        js.append(generateJSbaselineStroke2());
        js.append(generateJSthickness1());
        js.append(generateJSdashpattern1());
        js.append(generateJSlineJoin1());
        js.append(generateJSlineCap1());
        js.append(generateJScolumnStroke());
        js.append(generateJScolumnStroke1());
        js.append(generateJSconnectorFill());
        js.append(generateJSconnectorFill1());
        js.append(generateJSconnectorFill2());
        js.append(generateJScx3());
        js.append(generateJScy3());
        js.append(generateJSopacityOrMode());
        js.append(generateJSopacity9());
        js.append(generateJSfx3());
        js.append(generateJSfy3());
        js.append(generateJSconnectorPreviewStroke());
        js.append(generateJSconnectorPreviewStroke1());
        js.append(generateJSconnectorPreviewStroke2());
        js.append(generateJSthickness2());
        js.append(generateJSdashpattern2());
        js.append(generateJSlineJoin2());
        js.append(generateJSlineCap2());
        js.append(generateJSconnectorStroke());
        js.append(generateJSconnectorStroke1());
        js.append(generateJSconnectorStroke2());
        js.append(generateJSthickness3());
        js.append(generateJSdashpattern3());
        js.append(generateJSlineJoin3());
        js.append(generateJSlineCap3());
        js.append(generateJSdefaultRowHeight());
        js.append(generateJSeditConnectorThumbFill());
        js.append(generateJScolor3());
        js.append(generateJSopacity10());
        js.append(generateJSkeys12());
        js.append(generateJSkeys13());
        js.append(generateJSangle3());
        js.append(generateJSmode9());
        js.append(generateJSmode10());
        js.append(generateJSopacity11());
        js.append(generateJSkeys14());
        js.append(generateJSkeys15());
        js.append(generateJScx4());
        js.append(generateJScy4());
        js.append(generateJSmode11());
        js.append(generateJSopacity12());
        js.append(generateJSfx4());
        js.append(generateJSfy4());
        js.append(generateJSimageSettings3());
        js.append(generateJSeditConnectorThumbStroke());
        js.append(generateJSeditConnectorThumbStroke1());
        js.append(generateJSeditConnectorThumbStroke2());
        js.append(generateJSthickness4());
        js.append(generateJSdashpattern4());
        js.append(generateJSlineJoin4());
        js.append(generateJSlineCap4());
        js.append(generateJSeditIntervalThumbFill());
        js.append(generateJScolor4());
        js.append(generateJSopacity13());
        js.append(generateJSkeys16());
        js.append(generateJSkeys17());
        js.append(generateJSangle4());
        js.append(generateJSmode12());
        js.append(generateJSmode13());
        js.append(generateJSopacity14());
        js.append(generateJSkeys18());
        js.append(generateJSkeys19());
        js.append(generateJScx5());
        js.append(generateJScy5());
        js.append(generateJSmode14());
        js.append(generateJSopacity15());
        js.append(generateJSfx5());
        js.append(generateJSfy5());
        js.append(generateJSimageSettings4());
        js.append(generateJSeditIntervalThumbStroke());
        js.append(generateJSeditIntervalThumbStroke1());
        js.append(generateJSeditIntervalThumbStroke2());
        js.append(generateJSthickness5());
        js.append(generateJSdashpattern5());
        js.append(generateJSlineJoin5());
        js.append(generateJSlineCap5());
        js.append(generateJSeditPreviewFill());
        js.append(generateJScolor5());
        js.append(generateJSopacity16());
        js.append(generateJSkeys20());
        js.append(generateJSkeys21());
        js.append(generateJSangle5());
        js.append(generateJSmode15());
        js.append(generateJSmode16());
        js.append(generateJSopacity17());
        js.append(generateJSkeys22());
        js.append(generateJSkeys23());
        js.append(generateJScx6());
        js.append(generateJScy6());
        js.append(generateJSmode17());
        js.append(generateJSopacity18());
        js.append(generateJSfx6());
        js.append(generateJSfy6());
        js.append(generateJSimageSettings5());
        js.append(generateJSeditPreviewStroke());
        js.append(generateJSeditPreviewStroke1());
        js.append(generateJSeditPreviewStroke2());
        js.append(generateJSthickness6());
        js.append(generateJSdashpattern6());
        js.append(generateJSlineJoin6());
        js.append(generateJSlineCap6());
        js.append(generateJSeditProgressFill());
        js.append(generateJScolor6());
        js.append(generateJSopacity19());
        js.append(generateJSkeys24());
        js.append(generateJSkeys25());
        js.append(generateJSangle6());
        js.append(generateJSmode18());
        js.append(generateJSmode19());
        js.append(generateJSopacity20());
        js.append(generateJSkeys26());
        js.append(generateJSkeys27());
        js.append(generateJScx7());
        js.append(generateJScy7());
        js.append(generateJSmode20());
        js.append(generateJSopacity21());
        js.append(generateJSfx7());
        js.append(generateJSfy7());
        js.append(generateJSimageSettings6());
        js.append(generateJSeditProgressStroke());
        js.append(generateJSeditProgressStroke1());
        js.append(generateJSeditProgressStroke2());
        js.append(generateJSthickness7());
        js.append(generateJSdashpattern7());
        js.append(generateJSlineJoin7());
        js.append(generateJSlineCap7());
        js.append(generateJSeditStructurePreviewDashStroke());
        js.append(generateJSeditStructurePreviewDashStroke1());
        js.append(generateJSeditStructurePreviewDashStroke2());
        js.append(generateJSthickness8());
        js.append(generateJSdashpattern8());
        js.append(generateJSlineJoin8());
        js.append(generateJSlineCap8());
        js.append(generateJSeditStructurePreviewFill());
        js.append(generateJScolor7());
        js.append(generateJSopacity22());
        js.append(generateJSkeys28());
        js.append(generateJSkeys29());
        js.append(generateJSangle7());
        js.append(generateJSmode21());
        js.append(generateJSmode22());
        js.append(generateJSopacity23());
        js.append(generateJSkeys30());
        js.append(generateJSkeys31());
        js.append(generateJScx8());
        js.append(generateJScy8());
        js.append(generateJSmode23());
        js.append(generateJSopacity24());
        js.append(generateJSfx8());
        js.append(generateJSfy8());
        js.append(generateJSimageSettings7());
        js.append(generateJSeditStructurePreviewStroke());
        js.append(generateJSeditStructurePreviewStroke1());
        js.append(generateJSeditStructurePreviewStroke2());
        js.append(generateJSthickness9());
        js.append(generateJSdashpattern9());
        js.append(generateJSlineJoin9());
        js.append(generateJSlineCap9());
        js.append(generateJSediting());
        js.append(generateJSindex());
        js.append(generateJSlineMarker());
        js.append(generateJSindex1());
        js.append(generateJSlineMarker1());
        js.append(generateJSlineMarker2());
        js.append(generateJSmilestoneFill());
        js.append(generateJScolor8());
        js.append(generateJSopacity25());
        js.append(generateJSkeys32());
        js.append(generateJSkeys33());
        js.append(generateJSangle8());
        js.append(generateJSmode24());
        js.append(generateJSmode25());
        js.append(generateJSopacity26());
        js.append(generateJSkeys34());
        js.append(generateJSkeys35());
        js.append(generateJScx9());
        js.append(generateJScy9());
        js.append(generateJSmode26());
        js.append(generateJSopacity27());
        js.append(generateJSfx9());
        js.append(generateJSfy9());
        js.append(generateJSimageSettings8());
        js.append(generateJSmilestoneStroke());
        js.append(generateJSmilestoneStroke1());
        js.append(generateJSmilestoneStroke2());
        js.append(generateJSthickness10());
        js.append(generateJSdashpattern10());
        js.append(generateJSlineJoin10());
        js.append(generateJSlineCap10());
        js.append(generateJSparentFill());
        js.append(generateJScolor9());
        js.append(generateJSopacity28());
        js.append(generateJSkeys36());
        js.append(generateJSkeys37());
        js.append(generateJSangle9());
        js.append(generateJSmode27());
        js.append(generateJSmode28());
        js.append(generateJSopacity29());
        js.append(generateJSkeys38());
        js.append(generateJSkeys39());
        js.append(generateJScx10());
        js.append(generateJScy10());
        js.append(generateJSmode29());
        js.append(generateJSopacity30());
        js.append(generateJSfx10());
        js.append(generateJSfy10());
        js.append(generateJSimageSettings9());
        js.append(generateJSparentStroke());
        js.append(generateJSparentStroke1());
        js.append(generateJSparentStroke2());
        js.append(generateJSthickness11());
        js.append(generateJSdashpattern11());
        js.append(generateJSlineJoin11());
        js.append(generateJSlineCap11());
        js.append(generateJSprogressFill());
        js.append(generateJScolor10());
        js.append(generateJSopacity31());
        js.append(generateJSkeys40());
        js.append(generateJSkeys41());
        js.append(generateJSangle10());
        js.append(generateJSmode30());
        js.append(generateJSmode31());
        js.append(generateJSopacity32());
        js.append(generateJSkeys42());
        js.append(generateJSkeys43());
        js.append(generateJScx11());
        js.append(generateJScy11());
        js.append(generateJSmode32());
        js.append(generateJSopacity33());
        js.append(generateJSfx11());
        js.append(generateJSfy11());
        js.append(generateJSimageSettings10());
        js.append(generateJSprogressStroke());
        js.append(generateJSprogressStroke1());
        js.append(generateJSprogressStroke2());
        js.append(generateJSthickness12());
        js.append(generateJSdashpattern12());
        js.append(generateJSlineJoin12());
        js.append(generateJSlineCap12());
        js.append(generateJSindex2());
        js.append(generateJSrangeMarker());
        js.append(generateJSindex3());
        js.append(generateJSrangeMarker1());
        js.append(generateJSrangeMarker2());
        js.append(generateJSrowEvenFill());
        js.append(generateJScolor11());
        js.append(generateJSopacity34());
        js.append(generateJSkeys44());
        js.append(generateJSkeys45());
        js.append(generateJSangle11());
        js.append(generateJSmode33());
        js.append(generateJSmode34());
        js.append(generateJSopacity35());
        js.append(generateJSkeys46());
        js.append(generateJSkeys47());
        js.append(generateJScx12());
        js.append(generateJScy12());
        js.append(generateJSmode35());
        js.append(generateJSopacity36());
        js.append(generateJSfx12());
        js.append(generateJSfy12());
        js.append(generateJSimageSettings11());
        js.append(generateJSrowFill());
        js.append(generateJScolor12());
        js.append(generateJSopacity37());
        js.append(generateJSkeys48());
        js.append(generateJSkeys49());
        js.append(generateJSangle12());
        js.append(generateJSmode36());
        js.append(generateJSmode37());
        js.append(generateJSopacity38());
        js.append(generateJSkeys50());
        js.append(generateJSkeys51());
        js.append(generateJScx13());
        js.append(generateJScy13());
        js.append(generateJSmode38());
        js.append(generateJSopacity39());
        js.append(generateJSfx13());
        js.append(generateJSfy13());
        js.append(generateJSimageSettings12());
        js.append(generateJSrowHoverFill());
        js.append(generateJScolor13());
        js.append(generateJSopacity40());
        js.append(generateJSkeys52());
        js.append(generateJSkeys53());
        js.append(generateJSangle13());
        js.append(generateJSmode39());
        js.append(generateJSmode40());
        js.append(generateJSopacity41());
        js.append(generateJSkeys54());
        js.append(generateJSkeys55());
        js.append(generateJScx14());
        js.append(generateJScy14());
        js.append(generateJSmode41());
        js.append(generateJSopacity42());
        js.append(generateJSfx14());
        js.append(generateJSfy14());
        js.append(generateJSrowOddFill());
        js.append(generateJScolor14());
        js.append(generateJSopacity43());
        js.append(generateJSkeys56());
        js.append(generateJSkeys57());
        js.append(generateJSangle14());
        js.append(generateJSmode42());
        js.append(generateJSmode43());
        js.append(generateJSopacity44());
        js.append(generateJSkeys58());
        js.append(generateJSkeys59());
        js.append(generateJScx15());
        js.append(generateJScy15());
        js.append(generateJSmode44());
        js.append(generateJSopacity45());
        js.append(generateJSfx15());
        js.append(generateJSfy15());
        js.append(generateJSimageSettings13());
        js.append(generateJSrowSelectedFill());
        js.append(generateJScolor15());
        js.append(generateJSopacity46());
        js.append(generateJSkeys60());
        js.append(generateJSkeys61());
        js.append(generateJSangle15());
        js.append(generateJSmode45());
        js.append(generateJSmode46());
        js.append(generateJSkeys62());
        js.append(generateJSkeys63());
        js.append(generateJScx16());
        js.append(generateJScy16());
        js.append(generateJSmode47());
        js.append(generateJSopacity47());
        js.append(generateJSfx16());
        js.append(generateJSfy16());
        js.append(generateJSimageSettings14());
        js.append(generateJSselectedElementFill());
        js.append(generateJScolor16());
        js.append(generateJSopacity48());
        js.append(generateJSkeys64());
        js.append(generateJSkeys65());
        js.append(generateJSangle16());
        js.append(generateJSmode48());
        js.append(generateJSmode49());
        js.append(generateJSopacity49());
        js.append(generateJSkeys66());
        js.append(generateJSkeys67());
        js.append(generateJScx17());
        js.append(generateJScy17());
        js.append(generateJSmode50());
        js.append(generateJSopacity50());
        js.append(generateJSfx17());
        js.append(generateJSfy17());
        js.append(generateJSimageSettings15());
        js.append(generateJSselectedElementStroke());
        js.append(generateJSselectedElementStroke1());
        js.append(generateJSselectedElementStroke2());
        js.append(generateJSthickness13());
        js.append(generateJSdashpattern13());
        js.append(generateJSlineJoin13());
        js.append(generateJSlineCap13());
        js.append(generateJSindex4());
        js.append(generateJStextMarker());
        js.append(generateJSindex5());
        js.append(generateJStextMarker1());
        js.append(generateJStextMarker2());
        js.append(generateJStooltip());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}