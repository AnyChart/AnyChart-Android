package com.anychart.graphics.vector;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Fill.
 */
public class SolidFill extends JsObject implements ColoredFill, Fill {

    
    public SolidFill(String color, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, opacity: %s, } ", wrapQuotes(color), opacity));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}