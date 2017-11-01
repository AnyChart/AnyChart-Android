package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for coordinate.
 */
public class CoordinateObject extends JsObject  {

    
    private String x;
    private Double x1;
    private String y;
    private Double y1;

    
    public CoordinateObject(String x, String y) {
        this.x = x;
        this.y = y;

        js.append(String.format(Locale.US, "{x: %s,y: %s}",  wrapQuotes(x), wrapQuotes(y)));
    }
    public CoordinateObject(String x, Double y1) {
        this.x = x;
        this.y1 = y1;

        js.append(String.format(Locale.US, "{x: %s,y: %f}",  wrapQuotes(x), y1));
    }
    public CoordinateObject(Double x1, String y) {
        this.x1 = x1;
        this.y = y;

        js.append(String.format(Locale.US, "{x: %f,y: %s}",  x1, wrapQuotes(y)));
    }
    public CoordinateObject(Double x1, Double y1) {
        this.x1 = x1;
        this.y1 = y1;

        js.append(String.format(Locale.US, "{x: %f,y: %f}",  x1, y1));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}