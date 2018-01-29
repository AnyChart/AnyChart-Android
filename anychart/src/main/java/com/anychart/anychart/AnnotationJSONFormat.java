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
    private Number hoverGap;
    private StateSettings hovered;
    private MarkerType markerType;
    private String markerType1;
    private Number offsetX;
    private Number offsetY;
    private Number secondValueAnchor;
    private Number secondXAnchor;
    private StateSettings selected;
    private Number size;
    private Stroke stroke;
    private Number thirdValueAnchor;
    private Number thirdXAnchor;
    private Stroke trend;
    private Number valueAnchor;
    private Number xAnchor;

    
    public AnnotationJSONFormat(EnumsAnchor anchor, MarkerType markerType, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
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

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %s,hovered: %s,offsetX: %s,offsetY: %s,secondValueAnchor: %s,secondXAnchor: %s,selected: %s,size: %s,stroke: %s,thirdValueAnchor: %s,thirdXAnchor: %s,trend: %s,valueAnchor: %s,xAnchor: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), ((markerType != null) ? markerType.generateJs() : "null"), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(EnumsAnchor anchor, String markerType1, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
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

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %s,hovered: %s,offsetX: %s,offsetY: %s,secondValueAnchor: %s,secondXAnchor: %s,selected: %s,size: %s,stroke: %s,thirdValueAnchor: %s,thirdXAnchor: %s,trend: %s,valueAnchor: %s,xAnchor: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), wrapQuotes(markerType1), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(String anchor1, MarkerType markerType, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
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

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %s,hovered: %s,offsetX: %s,offsetY: %s,secondValueAnchor: %s,secondXAnchor: %s,selected: %s,size: %s,stroke: %s,thirdValueAnchor: %s,thirdXAnchor: %s,trend: %s,valueAnchor: %s,xAnchor: %s}",  wrapQuotes(anchor1), ((markerType != null) ? markerType.generateJs() : "null"), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(String anchor1, String markerType1, Boolean allowEdit, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
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

        js.append(String.format(Locale.US, "{anchor: %s,markerType: %s,allowEdit: %b,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverGap: %s,hovered: %s,offsetX: %s,offsetY: %s,secondValueAnchor: %s,secondXAnchor: %s,selected: %s,size: %s,stroke: %s,thirdValueAnchor: %s,thirdXAnchor: %s,trend: %s,valueAnchor: %s,xAnchor: %s}",  wrapQuotes(anchor1), wrapQuotes(markerType1), allowEdit, ((color != null) ? color.generateJs() : "null"), ((fill != null) ? fill.generateJs() : "null"), ((grid != null) ? grid.generateJs() : "null"), ((hatchFill != null) ? hatchFill.generateJs() : "null"), hoverGap, ((hovered != null) ? hovered.generateJs() : "null"), offsetX, offsetY, secondValueAnchor, secondXAnchor, ((selected != null) ? selected.generateJs() : "null"), size, ((stroke != null) ? stroke.generateJs() : "null"), thirdValueAnchor, thirdXAnchor, ((trend != null) ? trend.generateJs() : "null"), valueAnchor, xAnchor));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}