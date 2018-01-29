package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Radial gradient fill.
 */
public class RadialGradientFill extends JsObject implements ColoredFill, Fill {

    
    private Number cx;
    private Number cy;
    private Number fx;
    private Number fy;
    private GradientKey[] keys;
    private String[] keys1;
    private GraphicsMathRect mode;
    private Number opacity;

    
    public RadialGradientFill(GradientKey[] keys, Number cx, Number cy, Number fx, Number fy, GraphicsMathRect mode, Number opacity) {
        this.keys = keys;
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.mode = mode;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,cx: %s,cy: %s,fx: %s,fy: %s,mode: %s,opacity: %s}",  arrayToString(keys), cx, cy, fx, fy, ((mode != null) ? mode.generateJs() : "null"), opacity));
    }
    public RadialGradientFill(String[] keys1, Number cx, Number cy, Number fx, Number fy, GraphicsMathRect mode, Number opacity) {
        this.keys1 = keys1;
        this.cx = cx;
        this.cy = cy;
        this.fx = fx;
        this.fy = fy;
        this.mode = mode;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,cx: %s,cy: %s,fx: %s,fy: %s,mode: %s,opacity: %s}",  arrayToStringWrapQuotes(keys1), cx, cy, fx, fy, ((mode != null) ? mode.generateJs() : "null"), opacity));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}