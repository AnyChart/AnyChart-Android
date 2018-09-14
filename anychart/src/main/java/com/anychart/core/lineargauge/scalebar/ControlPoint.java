package com.anychart.core.lineargauge.scalebar;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Control point type definition.
 */
public class ControlPoint extends JsObject  {

    
    public ControlPoint(Number height, Number left, Number right) {
        js.append(String.format(Locale.US, "{height:%s, left: %s, right: %s, } ", height, left, right));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}