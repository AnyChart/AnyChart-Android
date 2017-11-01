package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for annotation JSON format.
 */
public class AnnotationJSONFormat extends JsObject  {

    
    private Boolean allowEdit;
    private EnumsAnchor anchor;
    private String anchor1;
    private AnyColor color;
    private Fill fill;
    private Stroke grid;
    private PatternFill hatchFill;
    private Double hoverGap;
    private StateSettings hovered;
    private MarkerType markerType;
    private String markerType1;
    private Double offsetX;
    private Double offsetY;
    private Double secondValueAnchor;
    private Double secondXAnchor;
    private StateSettings selected;
    private Double size;
    private Stroke stroke;
    private Double thirdValueAnchor;
    private Double thirdXAnchor;
    private Stroke trend;
    private Double valueAnchor;
    private Double xAnchor;

    
    public AnnotationJSONFormat(EnumsAnchor anchor, MarkerType markerType, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Double hoverGap, StateSettings hovered, Double offsetX, Double offsetY, Double secondValueAnchor, Double secondXAnchor, StateSettings selected, Double size, Stroke stroke, Double thirdValueAnchor, Double thirdXAnchor, Stroke trend, Double valueAnchor, Double xAnchor) {
        this.anchor = anchor;
        this.markerType = markerType;
        this.allowEdit = allowEdit;
        this.color = color;
        this.fill = fill;
        this.grid = grid;
        this.hatchFill = hatchFill;
        this.hoverGap = hoverGap;
        this.hovered = hovered;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.secondValueAnchor = secondValueAnchor;
        this.secondXAnchor = secondXAnchor;
        this.selected = selected;
        this.size = size;
        this.stroke = stroke;
        this.thirdValueAnchor = thirdValueAnchor;
        this.thirdXAnchor = thirdXAnchor;
        this.trend = trend;
        this.valueAnchor = valueAnchor;
        this.xAnchor = xAnchor;

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %f,hovered: %s,offsetX: %f,offsetY: %f,secondValueAnchor: %f,secondXAnchor: %f,selected: %s,size: %f,stroke: %s,thirdValueAnchor: %f,thirdXAnchor: %f,trend: %s,valueAnchor: %f,xAnchor: %f}",  ((anchor != null) ? anchor.generateJs() : "null"), ((markerType != null) ? markerType.generateJs() : "null"), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(EnumsAnchor anchor, String markerType1, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Double hoverGap, StateSettings hovered, Double offsetX, Double offsetY, Double secondValueAnchor, Double secondXAnchor, StateSettings selected, Double size, Stroke stroke, Double thirdValueAnchor, Double thirdXAnchor, Stroke trend, Double valueAnchor, Double xAnchor) {
        this.anchor = anchor;
        this.markerType1 = markerType1;
        this.allowEdit = allowEdit;
        this.color = color;
        this.fill = fill;
        this.grid = grid;
        this.hatchFill = hatchFill;
        this.hoverGap = hoverGap;
        this.hovered = hovered;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.secondValueAnchor = secondValueAnchor;
        this.secondXAnchor = secondXAnchor;
        this.selected = selected;
        this.size = size;
        this.stroke = stroke;
        this.thirdValueAnchor = thirdValueAnchor;
        this.thirdXAnchor = thirdXAnchor;
        this.trend = trend;
        this.valueAnchor = valueAnchor;
        this.xAnchor = xAnchor;

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %f,hovered: %s,offsetX: %f,offsetY: %f,secondValueAnchor: %f,secondXAnchor: %f,selected: %s,size: %f,stroke: %s,thirdValueAnchor: %f,thirdXAnchor: %f,trend: %s,valueAnchor: %f,xAnchor: %f}",  ((anchor != null) ? anchor.generateJs() : "null"), wrapQuotes(markerType1), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(String anchor1, MarkerType markerType, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Double hoverGap, StateSettings hovered, Double offsetX, Double offsetY, Double secondValueAnchor, Double secondXAnchor, StateSettings selected, Double size, Stroke stroke, Double thirdValueAnchor, Double thirdXAnchor, Stroke trend, Double valueAnchor, Double xAnchor) {
        this.anchor1 = anchor1;
        this.markerType = markerType;
        this.allowEdit = allowEdit;
        this.color = color;
        this.fill = fill;
        this.grid = grid;
        this.hatchFill = hatchFill;
        this.hoverGap = hoverGap;
        this.hovered = hovered;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.secondValueAnchor = secondValueAnchor;
        this.secondXAnchor = secondXAnchor;
        this.selected = selected;
        this.size = size;
        this.stroke = stroke;
        this.thirdValueAnchor = thirdValueAnchor;
        this.thirdXAnchor = thirdXAnchor;
        this.trend = trend;
        this.valueAnchor = valueAnchor;
        this.xAnchor = xAnchor;

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %f,hovered: %s,offsetX: %f,offsetY: %f,secondValueAnchor: %f,secondXAnchor: %f,selected: %s,size: %f,stroke: %s,thirdValueAnchor: %f,thirdXAnchor: %f,trend: %s,valueAnchor: %f,xAnchor: %f}",  wrapQuotes(anchor1), ((markerType != null) ? markerType.generateJs() : "null"), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(String anchor1, String markerType1, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Double hoverGap, StateSettings hovered, Double offsetX, Double offsetY, Double secondValueAnchor, Double secondXAnchor, StateSettings selected, Double size, Stroke stroke, Double thirdValueAnchor, Double thirdXAnchor, Stroke trend, Double valueAnchor, Double xAnchor) {
        this.anchor1 = anchor1;
        this.markerType1 = markerType1;
        this.allowEdit = allowEdit;
        this.color = color;
        this.fill = fill;
        this.grid = grid;
        this.hatchFill = hatchFill;
        this.hoverGap = hoverGap;
        this.hovered = hovered;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.secondValueAnchor = secondValueAnchor;
        this.secondXAnchor = secondXAnchor;
        this.selected = selected;
        this.size = size;
        this.stroke = stroke;
        this.thirdValueAnchor = thirdValueAnchor;
        this.thirdXAnchor = thirdXAnchor;
        this.trend = trend;
        this.valueAnchor = valueAnchor;
        this.xAnchor = xAnchor;

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %f,hovered: %s,offsetX: %f,offsetY: %f,secondValueAnchor: %f,secondXAnchor: %f,selected: %s,size: %f,stroke: %s,thirdValueAnchor: %f,thirdXAnchor: %f,trend: %s,valueAnchor: %f,xAnchor: %f}",  wrapQuotes(anchor1), wrapQuotes(markerType1), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}