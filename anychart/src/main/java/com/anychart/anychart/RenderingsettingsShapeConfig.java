package com.anychart.anychart;

import java.util.Locale;

/**
 * Shape config.
 */
public class RenderingsettingsShapeConfig extends JsObject  {

    
    private Boolean canBeHoveredSelected;
    private String fillName;
    private Boolean isHatchFill;
    private String name;
    private Boolean scrollerSelected;
    private ShapeType shapeType;
    private String shapeType1;
    private String strokeName;
    private Number zIndex;

    
    public RenderingsettingsShapeConfig(ShapeType shapeType, Boolean canBeHoveredSelected, String fillName, Boolean isHatchFill, String name, Boolean scrollerSelected, String strokeName, Number zIndex) {
        this.shapeType = shapeType;
        this.canBeHoveredSelected = canBeHoveredSelected;
        this.fillName = fillName;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.scrollerSelected = scrollerSelected;
        this.strokeName = strokeName;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{shapeType: %s,canBeHoveredSelected: %b,fillName: %s,isHatchFill: %b,name: %s,scrollerSelected: %b,strokeName: %s,zIndex: %s}",  ((shapeType != null) ? shapeType.generateJs() : "null"), canBeHoveredSelected, wrapQuotes(fillName), isHatchFill, wrapQuotes(name), scrollerSelected, wrapQuotes(strokeName), zIndex));
    }
    public RenderingsettingsShapeConfig(String shapeType1, Boolean canBeHoveredSelected, String fillName, Boolean isHatchFill, String name, Boolean scrollerSelected, String strokeName, Number zIndex) {
        this.shapeType1 = shapeType1;
        this.canBeHoveredSelected = canBeHoveredSelected;
        this.fillName = fillName;
        this.isHatchFill = isHatchFill;
        this.name = name;
        this.scrollerSelected = scrollerSelected;
        this.strokeName = strokeName;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{shapeType: %s,canBeHoveredSelected: %b,fillName: %s,isHatchFill: %b,name: %s,scrollerSelected: %b,strokeName: %s,zIndex: %s}",  wrapQuotes(shapeType1), canBeHoveredSelected, wrapQuotes(fillName), isHatchFill, wrapQuotes(name), scrollerSelected, wrapQuotes(strokeName), zIndex));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}