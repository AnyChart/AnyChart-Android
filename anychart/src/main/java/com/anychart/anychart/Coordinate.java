package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Coordinate extends JsObject  {

    
    private Double[] XYCoordinates;
    private CoordinateObject XYCoordinates1;

    
    public Coordinate(Double[] XYCoordinates) {
        this.XYCoordinates = XYCoordinates;

        js.append(String.format(Locale.US, "{XYCoordinates: %s}",  Arrays.toString(XYCoordinates)));
    }

    public Coordinate(CoordinateObject XYCoordinates1) {
        this.XYCoordinates1 = XYCoordinates1;

        js.append(String.format(Locale.US, "{XYCoordinates: %s}",  (XYCoordinates1 != null) ? XYCoordinates1.generateJs() : "null"));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}