package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Shape config.
 */
public class ShapeConfig extends JsObject  {

    
    private Boolean canBeHoveredSelected;
    private String fillNames;
    private Boolean isHatchFill;
    private String name;
    private Boolean scrollerSelected;
    private ShapeType shapeType;
    private String shapeType1;
    private String strokeNames;
    private Number zIndex;

    
    public ShapeConfig(ShapeType shapeType, Boolean canBeHoveredSelected, String fillNames, Boolean isHatchFill, String name, Boolean scrollerSelected, String strokeNames, Number zIndex) {
        this.shapeType = shapeType;
        this.canBeHoveredSelected = canBeHoveredSelected;
        this.fillNames = fillNames;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.scrollerSelected = scrollerSelected;
        this.strokeNames = strokeNames;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{shapeType: %s,canBeHoveredSelected: %b,fillNames: %s,isHatchFill: %b,name: %s,scrollerSelected: %b,strokeNames: %s,zIndex: %s}",  ((shapeType != null) ? shapeType.generateJs() : "null"), canBeHoveredSelected, wrapQuotes(fillNames), isHatchFill, wrapQuotes(name), scrollerSelected, wrapQuotes(strokeNames), zIndex));
    }
    public ShapeConfig(String shapeType1, Boolean canBeHoveredSelected, String fillNames, Boolean isHatchFill, String name, Boolean scrollerSelected, String strokeNames, Number zIndex) {
        this.shapeType1 = shapeType1;
        this.canBeHoveredSelected = canBeHoveredSelected;
        this.fillNames = fillNames;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.scrollerSelected = scrollerSelected;
        this.strokeNames = strokeNames;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{shapeType: %s,canBeHoveredSelected: %b,fillNames: %s,isHatchFill: %b,name: %s,scrollerSelected: %b,strokeNames: %s,zIndex: %s}",  wrapQuotes(shapeType1), canBeHoveredSelected, wrapQuotes(fillNames), isHatchFill, wrapQuotes(name), scrollerSelected, wrapQuotes(strokeNames), zIndex));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}