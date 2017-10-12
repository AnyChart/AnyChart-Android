package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ShapeConfig extends JsObject  {

    
    private Boolean canBeHoveredSelected;
    private String fillNames;
    private Boolean isHatchFill;
    private String name;
    private Boolean scrollerSelected;
    private ShapeType shapeType;
    private String strokeNames;
    private Double zIndex;

    
    public ShapeConfig(Boolean canBeHoveredSelected, String fillNames, Boolean isHatchFill, String name, Boolean scrollerSelected, ShapeType shapeType, String strokeNames, Double zIndex) {
        this.canBeHoveredSelected = canBeHoveredSelected;
        this.fillNames = fillNames;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.scrollerSelected = scrollerSelected;
        this.shapeType = shapeType;
        this.strokeNames = strokeNames;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{canBeHoveredSelected: %b,fillNames: %s,isHatchFill: %b,name: %s,scrollerSelected: %b,shapeType: %s,strokeNames: %s,zIndex: %f}",  canBeHoveredSelected, fillNames, isHatchFill, name, scrollerSelected, (shapeType != null) ? shapeType.generateJs() : "null", strokeNames, zIndex));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}