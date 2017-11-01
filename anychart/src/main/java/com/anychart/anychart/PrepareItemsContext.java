package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the preparing of the context menu items.
 */
public class PrepareItemsContext extends JsObject  {

    
    private Chart chart;
    private ContextMenu menu;
    private Point[] selectedPoints;
    private Element target;
    private VisualBase target1;

    
    public PrepareItemsContext(Element target, Chart chart, ContextMenu menu, Point[] selectedPoints) {
        this.target = target;
        this.chart = chart;
        this.menu = menu;
        this.selectedPoints = selectedPoints;

        js.append(String.format(Locale.US, "{target: %s,chart: %s,menu: %s,selectedPoints: %s}",  ((target != null) ? target.generateJs() : "null"), ((chart != null) ? chart.generateJs() : "null"), ((menu != null) ? menu.generateJs() : "null"), arrayToString(selectedPoints)));
    }
    public PrepareItemsContext(VisualBase target1, Chart chart, ContextMenu menu, Point[] selectedPoints) {
        this.target1 = target1;
        this.chart = chart;
        this.menu = menu;
        this.selectedPoints = selectedPoints;

        js.append(String.format(Locale.US, "{target: %s,chart: %s,menu: %s,selectedPoints: %s}",  ((target1 != null) ? target1.generateJs() : "null"), ((chart != null) ? chart.generateJs() : "null"), ((menu != null) ? menu.generateJs() : "null"), arrayToString(selectedPoints)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}