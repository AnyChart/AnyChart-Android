package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ShapeConfig extends JsObject  {

    
    private String[] fillNames;
    private Boolean isHatchFill;
    private String name;
    private ShapeType shapeType;
    private String[] strokeNames;
    private Double zIndex;

    
    public ShapeConfig(String[] fillNames, Boolean isHatchFill, String name, ShapeType shapeType, String[] strokeNames, Double zIndex) {
        this.fillNames = fillNames;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.shapeType = shapeType;
        this.strokeNames = strokeNames;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{fillNames: %s,isHatchFill: %b,name: %s,shapeType: %s,strokeNames: %s,zIndex: %f}",  Arrays.toString(fillNames), isHatchFill, name, (shapeType != null) ? shapeType.generateJs() : "null", Arrays.toString(strokeNames), zIndex));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}