package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for zoom level.
 */
public class ZoomLevel extends JsObject  {

    
    private Number count;
    private String id;
    private Interval unit;
    private String unit1;
    private Number unitPixSize;

    
    public ZoomLevel(Interval unit, Number count, String id, Number unitPixSize) {
        this.unit = unit;
        this.count = count;
        this.id = id;
        this.unitPixSize = unitPixSize;

        js.append(String.format(Locale.US, "{unit: %s,count: %s,id: %s,unitPixSize: %s}",  ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(id), unitPixSize));
    }
    public ZoomLevel(String unit1, Number count, String id, Number unitPixSize) {
        this.unit1 = unit1;
        this.count = count;
        this.id = id;
        this.unitPixSize = unitPixSize;

        js.append(String.format(Locale.US, "{unit: %s,count: %s,id: %s,unitPixSize: %s}",  wrapQuotes(unit1), count, wrapQuotes(id), unitPixSize));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}