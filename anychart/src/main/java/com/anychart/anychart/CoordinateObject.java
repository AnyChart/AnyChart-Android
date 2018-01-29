package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for coordinate.
 */
public class CoordinateObject extends JsObject  {

    
    private String x;
    private Number x1;
    private String y;
    private Number y1;

    
    public CoordinateObject(String x, String y) {
        this.x = x;
        this.y = y;

        js.append(String.format(Locale.US, "{x: %s,y: %s}",  wrapQuotes(x), wrapQuotes(y)));
    }
    public CoordinateObject(String x, Number y1) {
        this.x = x;
        this.y1 = y1;

        js.append(String.format(Locale.US, "{x: %s,y: %s}",  wrapQuotes(x), y1));
    }
    public CoordinateObject(Number x1, String y) {
        this.x1 = x1;
        this.y = y;

        js.append(String.format(Locale.US, "{x: %s,y: %s}",  x1, wrapQuotes(y)));
    }
    public CoordinateObject(Number x1, Number y1) {
        this.x1 = x1;
        this.y1 = y1;

        js.append(String.format(Locale.US, "{x: %s,y: %s}",  x1, y1));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}