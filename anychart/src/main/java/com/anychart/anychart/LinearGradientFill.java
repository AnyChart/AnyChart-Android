package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class LinearGradientFill extends JsObject implements ColoredFill, Fill {

    
    private Double angle;
    private GradientKey[] keys;
    private String[] keys1;
    private Boolean mode;
    private GraphicsMathRect mode1;
    private Double opacity;

    
    public LinearGradientFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,mode: %b,angle: %f,opacity: %f}",  arrayToString(keys), mode, angle, opacity));
    }

    public LinearGradientFill(GradientKey[] keys, GraphicsMathRect mode1, Double angle, Double opacity) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,mode: %s,angle: %f,opacity: %f}",  arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity));
    }

    public LinearGradientFill(String[] keys1, Boolean mode, Double angle, Double opacity) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,mode: %b,angle: %f,opacity: %f}",  Arrays.toString(keys1), mode, angle, opacity));
    }

    public LinearGradientFill(String[] keys1, GraphicsMathRect mode1, Double angle, Double opacity) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{keys: %s,mode: %s,angle: %f,opacity: %f}",  Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}