package com.anychart.core.gantt.rendering.settings;

import com.anychart.JsObject;

import com.anychart.enums.ShapeType;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Shape config.
 */
public class ShapeConfig extends JsObject  {

    
    public ShapeConfig(Boolean disablePointerEvents, String name, ShapeType shapeType, Number zIndex) {
        js.append(String.format(Locale.US, "{disablePointerEvents:%s, name: %s, shapeType: %s, zIndex: %s, } ", disablePointerEvents, wrapQuotes(name), (shapeType != null) ? shapeType.getJsBase() : null, zIndex));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}