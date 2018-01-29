package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Radial gradient stroke.
 */
public class RadialGradientStroke extends JsObject implements Stroke {

    
    private Number cx;
    private Number cy;
    private String dash;
    private Number fx;
    private Number fy;
    private GradientKey[] keys;
    private String[] keys1;
    private String lineCap;
    private String lineJoin;
    private GraphicsMathRect mode;
    private Number opacity;
    private Number thickness;

    
    public RadialGradientStroke(GradientKey[] keys, Number cx, Number cy, String dash, Number fx, Number fy, String lineCap, String lineJoin, GraphicsMathRect mode, Number opacity, Number thickness) {
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

        js.append(String.format(Locale.US, "{keys: %s,cx: %s,cy: %s,dash: %s,fx: %s,fy: %s,lineCap: %s,lineJoin: %s,mode: %s,opacity: %s,thickness: %s}",  arrayToString(keys), cx, cy, wrapQuotes(dash), fx, fy, wrapQuotes(lineCap), wrapQuotes(lineJoin), ((mode != null) ? mode.generateJs() : "null"), opacity, thickness));
    }
    public RadialGradientStroke(String[] keys1, Number cx, Number cy, String dash, Number fx, Number fy, String lineCap, String lineJoin, GraphicsMathRect mode, Number opacity, Number thickness) {
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

        js.append(String.format(Locale.US, "{keys: %s,cx: %s,cy: %s,dash: %s,fx: %s,fy: %s,lineCap: %s,lineJoin: %s,mode: %s,opacity: %s,thickness: %s}",  arrayToStringWrapQuotes(keys1), cx, cy, wrapQuotes(dash), fx, fy, wrapQuotes(lineCap), wrapQuotes(lineJoin), ((mode != null) ? mode.generateJs() : "null"), opacity, thickness));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}