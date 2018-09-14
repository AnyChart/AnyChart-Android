package com.anychart.graphics.vector;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Solid color line.
 */
public class SolidStroke extends JsObject implements Stroke {

    
    public SolidStroke(String color, String dash, String lineCap, String lineJoin, Number opacity, Number thickness) {
        js.append(String.format(Locale.US, "{color:%s, dash: %s, lineCap: %s, lineJoin: %s, opacity: %s, thickness: %s, } ", wrapQuotes(color), wrapQuotes(dash), wrapQuotes(lineCap), wrapQuotes(lineJoin), opacity, thickness));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}