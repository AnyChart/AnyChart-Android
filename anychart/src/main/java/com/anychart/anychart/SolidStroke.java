package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Solid color line.
 */
public class SolidStroke extends JsObject implements Stroke {

    
    private String color;
    private String dash;
    private String lineCap;
    private String lineJoin;
    private Number opacity;
    private Number thickness;

    
    public SolidStroke(String color, String dash, String lineCap, String lineJoin, Number opacity, Number thickness) {
        this.color = color;
        this.dash = dash;
        this.lineCap = lineCap;
        this.lineJoin = lineJoin;
        this.opacity = opacity;
        this.thickness = thickness;

        js.append(String.format(Locale.US, "{color: %s,dash: %s,lineCap: %s,lineJoin: %s,opacity: %s,thickness: %s}",  wrapQuotes(color), wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}