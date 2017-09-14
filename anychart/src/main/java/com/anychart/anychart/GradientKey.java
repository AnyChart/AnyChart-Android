package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class GradientKey extends JsObject  {

    
    private String color;
    private Double offset;
    private Double opacity;

    
    public GradientKey(String color, Double offset, Double opacity) {
        this.color = color;
        this.offset = offset;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{color: \"%s\",offset: %f,opacity: %f}",  color, offset, opacity));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}