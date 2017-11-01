package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Radial gradient fill.
 */
public class RadialGradientFill extends JsObject implements ColoredFill, Fill {

    
    private Double cx;
    private Double cy;
    private Double fx;
    private Double fy;
    private GradientKey[] keys;
    private String[] keys1;
    private GraphicsMathRect mode;
    private Double opacity;

    
    public RadialGradientFill(GradientKey[] keys, Double cx, Double cy, Double fx, Double fy, GraphicsMathRect mode, Double opacity) {
        this.keys = keys;
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.mode = mode;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,cx: %f,cy: %f,fx: %f,fy: %f,mode: %s,opacity: %f}",  arrayToString(keys), cx, cy, fx, fy, ((mode != null) ? mode.generateJs() : "null"), opacity));
    }
    public RadialGradientFill(String[] keys1, Double cx, Double cy, Double fx, Double fy, GraphicsMathRect mode, Double opacity) {
        this.keys1 = keys1;
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.mode = mode;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,cx: %f,cy: %f,fx: %f,fy: %f,mode: %s,opacity: %f}",  arrayToStringWrapQuotes(keys1), cx, cy, fx, fy, ((mode != null) ? mode.generateJs() : "null"), opacity));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}