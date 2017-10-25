package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class LinearGradientStroke extends JsObject implements Stroke {

    
    private Double angle;
    private String dash;
    private GradientKey[] keys;
    private String[] keys1;
    private String lineCap;
    private String lineJoin;
    private Boolean mode;
    private GraphicsMathRect mode1;
    private Double opacity;
    private Double thickness;

    
    public LinearGradientStroke(GradientKey[] keys, Boolean mode, Double angle, String dash, String lineCap, String lineJoin, Double opacity, Double thickness) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,mode: %b,angle: %f,dash: %s,lineCap: %s,lineJoin: %s,opacity: %f,thickness: %f}",  arrayToString(keys), mode, angle, wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }
    public LinearGradientStroke(GradientKey[] keys, GraphicsMathRect mode1, Double angle, String dash, String lineCap, String lineJoin, Double opacity, Double thickness) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,mode: %s,angle: %f,dash: %s,lineCap: %s,lineJoin: %s,opacity: %f,thickness: %f}",  arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }
    public LinearGradientStroke(String[] keys1, Boolean mode, Double angle, String dash, String lineCap, String lineJoin, Double opacity, Double thickness) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,mode: %b,angle: %f,dash: %s,lineCap: %s,lineJoin: %s,opacity: %f,thickness: %f}",  arrayToStringWrapQuotes(keys1), mode, angle, wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }
    public LinearGradientStroke(String[] keys1, GraphicsMathRect mode1, Double angle, String dash, String lineCap, String lineJoin, Double opacity, Double thickness) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{keys: %s,mode: %s,angle: %f,dash: %s,lineCap: %s,lineJoin: %s,opacity: %f,thickness: %f}",  arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}