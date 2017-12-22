package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Identifies an x-y coordinate pair.
 */
public class Coordinate extends JsObject  {

    
    private Number[] XYCoordinates;
    private String XYCoordinates1;
    private CoordinateObject XYCoordinates2;

    
    public Coordinate(Number[] XYCoordinates) {
        this.XYCoordinates = XYCoordinates;

        js.append(String.format(Locale.US, "{XYCoordinates: %s}",  Arrays.toString(XYCoordinates)));
    }
    public Coordinate(String XYCoordinates1) {
        this.XYCoordinates1 = XYCoordinates1;

        js.append(String.format(Locale.US, "{XYCoordinates: %s}",  wrapQuotes(XYCoordinates1)));
    }
    public Coordinate(CoordinateObject XYCoordinates2) {
        this.XYCoordinates2 = XYCoordinates2;

        js.append(String.format(Locale.US, "{XYCoordinates: %s}",  ((XYCoordinates2 != null) ? XYCoordinates2.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}