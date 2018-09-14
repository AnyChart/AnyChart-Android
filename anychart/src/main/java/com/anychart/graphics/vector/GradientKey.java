package com.anychart.graphics.vector;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Gradient keys.
 */
public class GradientKey extends JsObject  {

    
    public GradientKey(String color, Number offset, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, offset: %s, opacity: %s, } ", wrapQuotes(color), offset, opacity));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}