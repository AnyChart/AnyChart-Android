package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ZoomLevel extends JsObject  {

    
    private Double count;
    private String id;
    private Interval unit;
    private Double unitPixSize;

    
    public ZoomLevel(Double count, String id, Interval unit, Double unitPixSize) {
        this.count = count;
        this.id = id;
        this.unit = unit;
        this.unitPixSize = unitPixSize;

        js.append(String.format(Locale.US, "{count: %f,id: \"%s\",unit: %s,unitPixSize: %f}",  count, id, (unit != null) ? unit.generateJs() : "null", unitPixSize));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}