package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class SolidFill extends JsObject implements ColoredFill, Fill {

    
    private String color;
    private Double opacity;

    
    public SolidFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{color: %s,opacity: %f}",  color, opacity));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}