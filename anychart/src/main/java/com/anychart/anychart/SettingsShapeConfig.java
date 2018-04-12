package com.anychart.anychart;

import java.util.Locale;

/**
 * Shape config.
 */
public class SettingsShapeConfig extends JsObject  {

    
    private Boolean disablePointerEvents;
    private String name;
    private ShapeType shapeType;
    private Number zIndex;

    
    public SettingsShapeConfig(Boolean disablePointerEvents, String name, ShapeType shapeType, Number zIndex) {
        this.disablePointerEvents = disablePointerEvents;
        this.name = name;
        this.shapeType = shapeType;
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "{disablePointerEvents: %b,name: %s,shapeType: %s,zIndex: %s}",  disablePointerEvents, wrapQuotes(name), ((shapeType != null) ? shapeType.generateJs() : "null"), zIndex));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}