package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for zoom level.
 */
public class ZoomLevel extends JsObject  {

    
    private Double count;
    private String id;
    private Interval unit;
    private String unit1;
    private Double unitPixSize;

    
    public ZoomLevel(Interval unit, Double count, String id, Double unitPixSize) {
        this.unit = unit;
        this.count = count;
        this.id = id;
        this.unitPixSize = unitPixSize;

        js.append(String.format(Locale.US, "{unit: %s,count: %f,id: %s,unitPixSize: %f}",  ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(id), unitPixSize));
    }
    public ZoomLevel(String unit1, Double count, String id, Double unitPixSize) {
        this.unit1 = unit1;
        this.count = count;
        this.id = id;
        this.unitPixSize = unitPixSize;

        js.append(String.format(Locale.US, "{unit: %s,count: %f,id: %s,unitPixSize: %f}",  wrapQuotes(unit1), count, wrapQuotes(id), unitPixSize));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}