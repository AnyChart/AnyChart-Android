package com.anychart.math;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for coordinate.
 */
public class CoordinateObject extends JsObject  {

    
    public CoordinateObject(String x, String y) {
        js.append(String.format(Locale.US, "{x:%s, y: %s, } ", wrapQuotes(x), wrapQuotes(y)));
    }
    public CoordinateObject(String x, Number y) {
        js.append(String.format(Locale.US, "{x:%s, y: %s, } ", wrapQuotes(x), y));
    }
    public CoordinateObject(Number x, String y) {
        js.append(String.format(Locale.US, "{x:%s, y: %s, } ", x, wrapQuotes(y)));
    }
    public CoordinateObject(Number x, Number y) {
        js.append(String.format(Locale.US, "{x:%s, y: %s, } ", x, y));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}