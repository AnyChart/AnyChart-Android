package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RadialGradientStroke extends JsObject implements Stroke {

    
    private Double cx;
    private Double cy;
    private String dash;
    private Double fx;
    private Double fy;
    private GradientKey[] keys;
    private String[] keys1;
    private String lineCap;
    private String lineJoin;
    private GraphicsMathRect mode;
    private Double opacity;
    private Double thickness;

    
    public RadialGradientStroke(GradientKey[] keys, Double cx, Double cy, String dash, Double fx, Double fy, String lineCap, String lineJoin, GraphicsMathRect mode, Double opacity, Double thickness) {
        this.keys = keys;
        this.cx = cx;
        this.cy = cy;
        this.dash = dash;
        this.fx = fx;
        this.fy = fy;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.mode = mode;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,cx: %f,cy: %f,dash: %s,fx: %f,fy: %f,lineCap: %s,lineJoin: %s,mode: %s,opacity: %f,thickness: %f}",  arrayToString(keys), cx, cy, wrapQuotes(dash), fx, fy, wrapQuotes(lineCap), wrapQuotes(lineJoin), ((mode != null) ? mode.generateJs() : "null"), opacity, thickness));
    }
    public RadialGradientStroke(String[] keys1, Double cx, Double cy, String dash, Double fx, Double fy, String lineCap, String lineJoin, GraphicsMathRect mode, Double opacity, Double thickness) {
        this.keys1 = keys1;
        this.cx = cx;
        this.cy = cy;
        this.dash = dash;
        this.fx = fx;
        this.fy = fy;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.mode = mode;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,cx: %f,cy: %f,dash: %s,fx: %f,fy: %f,lineCap: %s,lineJoin: %s,mode: %s,opacity: %f,thickness: %f}",  arrayToStringWrapQuotes(keys1), cx, cy, wrapQuotes(dash), fx, fy, wrapQuotes(lineCap), wrapQuotes(lineJoin), ((mode != null) ? mode.generateJs() : "null"), opacity, thickness));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}