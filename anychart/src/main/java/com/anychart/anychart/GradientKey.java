package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Gradient keys.
 */
public class GradientKey extends JsObject  {

    
    private String color;
    private Number offset;
    private Number opacity;

    
    public GradientKey(String color, Number offset, Number opacity) {
        this.color = color;
        this.offset = offset;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{color: %s,offset: %s,opacity: %s}",  wrapQuotes(color), offset, opacity));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}