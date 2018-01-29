package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Fill.
 */
public class SolidFill extends JsObject implements ColoredFill, Fill {

    
    private String color;
    private Number opacity;

    
    public SolidFill(String color, Number opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{color: %s,opacity: %s}",  wrapQuotes(color), opacity));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}