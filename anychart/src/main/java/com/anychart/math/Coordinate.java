package com.anychart.math;

import com.anychart.JsObject;

import java.util.Arrays;
import java.util.Locale;

// typedef
/**
 * Identifies an x-y coordinate pair.
 */
public class Coordinate extends JsObject  {

    
    public Coordinate(Number[] XYCoordinates) {
        js.append(String.format(Locale.US, "{XYCoordinates:%s, } ", Arrays.toString(XYCoordinates)));
    }
    public Coordinate(String XYCoordinates) {
        js.append(String.format(Locale.US, "{XYCoordinates:%s, } ", wrapQuotes(XYCoordinates)));
    }
    public Coordinate(CoordinateObject XYCoordinates) {
        js.append(String.format(Locale.US, "{XYCoordinates:%s, } ", (XYCoordinates != null) ? XYCoordinates.getJsBase() : null));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}