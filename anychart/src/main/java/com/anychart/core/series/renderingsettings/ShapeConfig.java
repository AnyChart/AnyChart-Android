package com.anychart.core.series.renderingsettings;

import com.anychart.JsObject;

import com.anychart.enums.ShapeType;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Shape config.
 */
public class ShapeConfig extends JsObject  {

    
    public ShapeConfig(Boolean canBeHoveredSelected, String fillName, Boolean isHatchFill, String name, Boolean scrollerSelected, ShapeType shapeType, String strokeName, Number zIndex) {
        js.append(String.format(Locale.US, "{canBeHoveredSelected:%s, fillName: %s, isHatchFill: %s, name: %s, scrollerSelected: %s, shapeType: %s, strokeName: %s, zIndex: %s, } ", canBeHoveredSelected, wrapQuotes(fillName), isHatchFill, wrapQuotes(name), scrollerSelected, (shapeType != null) ? shapeType.getJsBase() : null, wrapQuotes(strokeName), zIndex));
    }
    public ShapeConfig(Boolean canBeHoveredSelected, String fillName, Boolean isHatchFill, String name, Boolean scrollerSelected, String shapeType, String strokeName, Number zIndex) {
        js.append(String.format(Locale.US, "{canBeHoveredSelected:%s, fillName: %s, isHatchFill: %s, name: %s, scrollerSelected: %s, shapeType: %s, strokeName: %s, zIndex: %s, } ", canBeHoveredSelected, wrapQuotes(fillName), isHatchFill, wrapQuotes(name), scrollerSelected, wrapQuotes(shapeType), wrapQuotes(strokeName), zIndex));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}